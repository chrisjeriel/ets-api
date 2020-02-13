package ph.cpi.rest.api.service.impl;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.UncategorizedSQLException;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UtilDao;
import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Response;
import ph.cpi.rest.api.model.accountingintrust.AcctEntryRowUpload;
import ph.cpi.rest.api.model.request.GenerateReportRequest;
import ph.cpi.rest.api.model.request.UploadAcctEntryRequest;
import ph.cpi.rest.api.model.response.ExtractReportResponse;
import ph.cpi.rest.api.model.response.UploadAcctEntryResponse;
import ph.cpi.rest.api.service.AccountingInTrustService;
import ph.cpi.rest.api.service.UtilService;
import ph.cpi.rest.api.utils.ReportParameters;

@Component
public class UtilServiceImpl implements UtilService {
	
	@Autowired
	UtilDao utilDao;
	
	@Autowired
	private AccountingInTrustService acctInTrustService;
	
	private static final Logger logger = LoggerFactory.getLogger(UtilServiceImpl.class);

	@Override
	public ExtractReportResponse extractReport(GenerateReportRequest grr) throws SQLException {
		// TODO Auto-generated method stub
		ExtractReportResponse err = new ExtractReportResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		String errorMsg = "Please check field values.";
	
		try {
			if (grr.getReportId() != null && (grr.getReportId().toUpperCase().contains("POLR044") || grr.getReportId().toUpperCase().contains("POLR052"))) {
				params.put("reportId", grr.getPolr044Params().getReportId());
				params.put("extractUser", grr.getPolr044Params().getExtractUser());
				params.put("lineCdParam", grr.getPolr044Params().getLineCdParam());
				params.put("cedingIdParam", grr.getPolr044Params().getCedingIdParam());
				params.put("currCdParam", grr.getPolr044Params().getCurrCdParam());
				params.put("dateParam", grr.getPolr044Params().getDateParam());
				params.put("dateRange", grr.getPolr044Params().getDateRange());
				params.put("fromDate", grr.getPolr044Params().getFromDate());
				params.put("toDate", grr.getPolr044Params().getToDate());
				params.put("incRecTag", grr.getPolr044Params().getIncRecTag());
				
				params.put("forceExtract", grr.getPolr044Params().getForceExtract());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("CLMR010")) {
				params = ReportParameters.mapCLMR010Params(grr.getClmr010Params());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("ACITR052")) {
				params = ReportParameters.mapACITR052Params(grr.getAcitr052Params());
			}
			
			params.put("extractCount", 0);
			
			System.out.println(params);
			
			err.setReturnCode(utilDao.extractReport(params));
			err.setParams(params);
			logger.info("extractReport : " + err.toString());
		} catch (HibernateException e) {
			e.printStackTrace();
			err.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUGHE", "HibernateException Exception : " + errorMsg));
		} catch (org.springframework.dao.DataIntegrityViolationException e) {
			e.printStackTrace();
			err.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUGDIV", "DataIntegrityViolation Exception : " + errorMsg));
		} catch (SQLException e) {
			e.printStackTrace();
			err.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUGSQL", "SQL Exception : " + errorMsg));
		} catch (org.springframework.jdbc.UncategorizedSQLException e) {
			e.printStackTrace();
			if (e.getMessage().contains("Extracted records on the specified parameters already exists.")) {
				errorMsg = "Extracted records on the specified parameters already exists. Do you want to extract the record again?";
			}
			err.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUGUSE", errorMsg));
		}catch (Exception e) {
			e.printStackTrace();
			err.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUGGEN", "General Exception"));
		}
		
		return err;
	}

	@Override
	public String getReportFileName(HashMap<String, Object> params) throws SQLException {
		return utilDao.getReportFileName(params);
	}

	@Override
	public String getReportPath() throws SQLException {
		return utilDao.getReportPath();
	}

	@Override
	public Response uploadDataTable(String filePath, String acctType, String tranClass, String tranId, String procBy) throws SQLException, EncryptedDocumentException, UncategorizedSQLException {
		Response resp = new Response();
		
		String SAMPLE_XLSX_FILE_PATH = filePath;
		Workbook workbook = null;
        try {
			workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
			
			System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
			
			DataFormatter dataFormatter = new DataFormatter();
			
			List<AcctEntryRowUpload> aeruList = new ArrayList<AcctEntryRowUpload>();
			
			List<String> titles = new ArrayList<String>();
			
			for(Sheet sheet: workbook) {
	            System.out.println("=> " + sheet.getSheetName());
	            
	            
	            for (Row row: sheet) {
	            	if (row.getRowNum() == 0) {
	            		for(Cell cell: row) {
		                    String cellValue = dataFormatter.formatCellValue(cell);
		                    titles.add(cellValue);
		                }
	            	} else {
	            		AcctEntryRowUpload aeru = new AcctEntryRowUpload();
	            		aeru.setAcctType(acctType);
	            		aeru.setTranClass(tranClass);
	            		aeru.setTranId(tranId);
	            		aeru.setProcBy(procBy);
	            		
	            		for (int i = 0; i < titles.size(); i++) {
	            			if ("ACCT_CODE".equalsIgnoreCase(titles.get(i))) {
	            				aeru.setAcctCode(dataFormatter.formatCellValue(row.getCell(i)));
	            			} else if ("ACCT_NAME".equalsIgnoreCase(titles.get(i))) {
	            				aeru.setAcctName(dataFormatter.formatCellValue(row.getCell(i)));
	            			} else if ("SL_TYPE".equalsIgnoreCase(titles.get(i))) {
	            				aeru.setSlTypeCd(dataFormatter.formatCellValue(row.getCell(i)));
	            			} else if ("SL_TYPE_NAME".equalsIgnoreCase(titles.get(i))) {
	            				aeru.setSlTypeName(dataFormatter.formatCellValue(row.getCell(i)));
	            			} else if ("SL_CODE".equalsIgnoreCase(titles.get(i))) {
	            				aeru.setSlCode(dataFormatter.formatCellValue(row.getCell(i)));
	            			} else if ("SL_NAME".equalsIgnoreCase(titles.get(i))) {
	            				aeru.setSlName(dataFormatter.formatCellValue(row.getCell(i)));
	            			} else if ("DEBIT_AMT".equalsIgnoreCase(titles.get(i))) {
	            				String val = dataFormatter.formatCellValue(row.getCell(i));
	            				val = "".equalsIgnoreCase(val) ? "0" : val; 
	            				aeru.setDebitAmt(new BigDecimal(val));
	            			} else if ("CREDIT_AMT".equalsIgnoreCase(titles.get(i))) {
	            				String val = dataFormatter.formatCellValue(row.getCell(i));
	            				val = "".equalsIgnoreCase(val) ? "0" : val; 
	            				aeru.setCreditAmt(new BigDecimal(val));
	            			} 
						}
	            		aeruList.add(aeru);
	            	}
	            }
	        }
			
			UploadAcctEntryRequest req = new UploadAcctEntryRequest();
			UploadAcctEntryResponse res = new UploadAcctEntryResponse();
			req.setAeruList(aeruList);
			res = acctInTrustService.uploadAcctEntry(req);
			if(res.getErrorList().size() != 0){
				resp.getErrorList().add(new Error("SQLException",res.getErrorList().get(0).getErrorMessage()));
				throw new SQLException();
			}
			
		} catch (EncryptedDocumentException | IOException | UncategorizedSQLException | SQLException e) {
			e.printStackTrace();
			resp.getErrorList().add(new Error("General Error",e.getMessage()));
		} finally {
			try {
				workbook.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return resp;
	}
	
	

}
