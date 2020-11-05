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
import ph.cpi.rest.api.model.request.RetrieveExtractToCsvRequest;
import ph.cpi.rest.api.model.request.RetrieveExtractToCsvResponse;
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
				params.put("faculTag", grr.getPolr044Params().getFaculTag());
				
				params.put("forceExtract", grr.getPolr044Params().getForceExtract());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("CLMR010")) {
				params = ReportParameters.mapCLMR010Params(grr.getClmr010Params());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("ACITR052")) {
				params = ReportParameters.mapACITR052Params(grr.getAcitr052Params());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("ACITR061")) {
				params = ReportParameters.mapACITR061Params(grr.getAcitr061Params());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("CLMR052")) {
				params = ReportParameters.mapCLMR052Params(grr.getClmr052Params());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("ACITR058")) {
				params = ReportParameters.mapACITR058Params(grr.getAcitr058Params());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("ACSER007")) {
				params = ReportParameters.mapACSER007Params(grr.getAcser007Params());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("ACITR059")) {
				params = ReportParameters.mapACITR059Params(grr.getAcitr059Params());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("ACSER008")) {
				params = ReportParameters.mapACSER008Params(grr.getAcser008Params());
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

	@Override
	public RetrieveExtractToCsvResponse retrieveExtractToCsv(RetrieveExtractToCsvRequest racprlp) throws SQLException {
		RetrieveExtractToCsvResponse retcResponse = new RetrieveExtractToCsvResponse();
		HashMap<String, Object> retcParams = new HashMap<String, Object>();
		retcParams.put("extractUser", racprlp.getExtractUser());
		retcParams.put("reportName", racprlp.getReportName());
		retcParams.put("prodDate", racprlp.getProdDate());
		retcParams.put("paramDate", racprlp.getParamDate());
		retcParams.put("paramCurrency", racprlp.getParamCurrency());
		retcParams.put("cedingId", racprlp.getCedingId());
		retcParams.put("paymentMode", racprlp.getPaymentMode());
		retcParams.put("paymentType", racprlp.getPaymentType());
		retcParams.put("fromDate", racprlp.getFromDate());
		retcParams.put("toDate", racprlp.getToDate());
		retcParams.put("incClosedTran", racprlp.getIncClosedTran());
		retcParams.put("incCancelTran", racprlp.getIncCancelTran());
		retcParams.put("tranpostDate", racprlp.getTranpostDate());
		retcParams.put("chkDate", racprlp.getChkDate());
		retcParams.put("bank", racprlp.getBank());
		retcParams.put("bankAcct", racprlp.getBankAcct());
		retcParams.put("sortBy", racprlp.getSortBy());
		retcParams.put("lineCd", racprlp.getLineCd());
		retcParams.put("dateParam", racprlp.getDateParam());
		retcParams.put("dateRange", racprlp.getDateRange());
		retcParams.put("reportType", racprlp.getReportType());
		
		String reportName = racprlp.getReportName();
		System.out.println(reportName);
		
		if(reportName.equals("POLR044E")) {
			retcResponse.setListPolr044e(utilDao.retrievePolR044e(retcParams));
		}else if(reportName.equals("POLR044A")) {
			retcResponse.setListPolr044a(utilDao.retrievePolR044a(retcParams));
		}else if(reportName.equals("POLR044B")) {
			retcResponse.setListPolr044b(utilDao.retrievePolR044b(retcParams));
		}else if(reportName.equals("POLR044C")) {
			retcResponse.setListPolr044c(utilDao.retrievePolR044c(retcParams));
		}else if(reportName.equals("POLR044D")) {
			retcResponse.setListPolr044d(utilDao.retrievePolR044d(retcParams));
		}else if(reportName.equals("POLR044F")) {
			retcResponse.setListPolr044f(utilDao.retrievePolR044f(retcParams));
		}else if(reportName.equals("POLR044G")) {
			retcResponse.setListPolr044g(utilDao.retrievePolR044g(retcParams));
		}else if(reportName.equals("POLR044H")) {
			retcResponse.setListPolr044h(utilDao.retrievePolR044h(retcParams));
		}else if(reportName.equals("POLR044HA")) {
			retcResponse.setListPolr044ha(utilDao.retrievePolR044ha(retcParams));
		}else if(reportName.equals("POLR044I")) {
			retcResponse.setListPolr044i(utilDao.retrievePolR044i(retcParams));
		}else if(reportName.equals("POLR044J")) {
			retcResponse.setListPolr044j(utilDao.retrievePolR044j(retcParams));
		}else if(reportName.equals("POLR044JA")) {
			retcResponse.setListPolr044ja(utilDao.retrievePolR044ja(retcParams));
		}else if(reportName.equals("POLR044K")) {
			retcResponse.setListPolr044k(utilDao.retrievePolR044k(retcParams));
		}else if(reportName.equals("POLR044KA")) {
			retcResponse.setListPolr044ka(utilDao.retrievePolR044ka(retcParams));
		}else if(reportName.equals("POLR044L")) {
			retcResponse.setListPolr044l(utilDao.retrievePolR044l(retcParams));
		}else if(reportName.equals("POLR044M")) {
			retcResponse.setListPolr044m(utilDao.retrievePolR044m(retcParams));
		}else if(reportName.equals("POLR044N")) {
			retcResponse.setListPolr044n(utilDao.retrievePolR044n(retcParams));
		}else if(reportName.equals("POLR044O")) {
			retcResponse.setListPolr044o(utilDao.retrievePolR044o(retcParams));
		}else if(reportName.equals("POLR044OA")) {
			retcResponse.setListPolr044oa(utilDao.retrievePolR044oa(retcParams));
		}else if(reportName.equals("POLR044OB")) {
			retcResponse.setListPolr044ob(utilDao.retrievePolR044ob(retcParams));
		}else if(reportName.equals("POLR044P")) {
			retcResponse.setListPolr044p(utilDao.retrievePolR044p(retcParams));
		}else if(reportName.equals("POLR044Q")) {
			retcResponse.setListPolr044q(utilDao.retrievePolR044q(retcParams));
			retcResponse.setListPolr044q2(utilDao.retrievePolR044q2(retcParams));
		}else if(reportName.equals("POLR044QA")) {
			retcResponse.setListPolr044q(utilDao.retrievePolR044qa(retcParams));
			retcResponse.setListPolr044q2(utilDao.retrievePolR044qa2(retcParams));
		}else if(reportName.equals("POLR044R")) {
			retcResponse.setListPolr044r(utilDao.retrievePolR044r(retcParams));
		}else if(reportName.equals("POLR044S")) {
			retcResponse.setListPolr044s(utilDao.retrievePolR044s(retcParams));
		}else if(reportName.equals("POLR044T")) {
			retcResponse.setListPolr044t(utilDao.retrievePolR044t(retcParams));
		}else if(reportName.equals("POLR044U")) {
			retcResponse.setListPolr044u(utilDao.retrievePolR044u(retcParams));
		}else if(reportName.equals("POLR044V")) {
			retcResponse.setListPolr044v(utilDao.retrievePolR044v(retcParams));
		}else if(reportName.equals("POLR044W")) {
			retcResponse.setListPolr044w(utilDao.retrievePolR044w(retcParams));
		}else if(reportName.equals("POLR044X")) {
			retcResponse.setListPolr044x(utilDao.retrievePolR044x(retcParams));
		}else if(reportName.equals("POLR044Y")) {
			retcResponse.setListPolr044y(utilDao.retrievePolR044y(retcParams));
		}else if(reportName.equals("POLR044YA")) {
			retcResponse.setListPolr044ya(utilDao.retrievePolR044ya(retcParams));
		}else if(reportName.equals("POLR044Z")) {
			retcResponse.setListPolr044z(utilDao.retrievePolR044z(retcParams));
		}
		//accounting > reports > csv
		else if(reportName.equals("POLR052A")) {
			retcResponse.setListPolr052a(utilDao.retrievePolR052a(retcParams));
		}else if(reportName.equals("POLR052AA")) {
			retcResponse.setListPolr052aa(utilDao.retrievePolR052aa(retcParams));
		}else if(reportName.equals("POLR052AB")) {
			retcResponse.setListPolr052ab(utilDao.retrievePolR052ab(retcParams));
		}else if(reportName.equals("POLR052BB")) {
			retcResponse.setListPolr052bb(utilDao.retrievePolR052bb(retcParams));
		}else if(reportName.equals("POLR052B")) {
			retcResponse.setListPolr052b(utilDao.retrievePolR052b(retcParams));
		}else if(reportName.equals("POLR052BA")) {
			retcResponse.setListPolr052ba(utilDao.retrievePolR052ba(retcParams));
		}else if(reportName.equals("POLR052C")) {
			retcResponse.setListPolr052c(utilDao.retrievePolR052c(retcParams));
		}else if(reportName.equals("POLR052CA")) {
			retcResponse.setListPolr052ca(utilDao.retrievePolR052ca(retcParams));
		}else if(reportName.equals("POLR052CB")) {
			retcResponse.setListPolr052cb(utilDao.retrievePolR052cb(retcParams));
		}else if(reportName.equals("POLR052D")) {
			retcResponse.setListPolr052d(utilDao.retrievePolR052d(retcParams));
		}else if(reportName.equals("POLR052E")) {
			retcResponse.setListPolr052e(utilDao.retrievePolR052e(retcParams));
		}else if(reportName.equals("POLR052F")) {
			retcResponse.setListPolr052f(utilDao.retrievePolR052f(retcParams));
		}else if(reportName.equals("POLR052G")) {
			retcResponse.setListPolr052g(utilDao.retrievePolR052g(retcParams));
		}else if(reportName.equals("POLR052H")) {
			retcResponse.setListPolr052h(utilDao.retrievePolR052h(retcParams));
		}else if(reportName.equals("POLR052I")) {
			retcResponse.setListPolr052i(utilDao.retrievePolR052i(retcParams));
		}
		//claims > reports > csv
		else if(reportName.equals("CLMR010A")) {
			retcResponse.setListClmr010a(utilDao.retrieveClmR010a(retcParams));
			retcResponse.setListClmr010a2(utilDao.retrieveClmR010a2(retcParams));
		}else if(reportName.equals("CLMR010AP")) {
			retcResponse.setListClmr010ap(utilDao.retrieveClmR010ap(retcParams));
			retcResponse.setListClmr010ap2(utilDao.retrieveClmR010ap2(retcParams));
		}else if(reportName.equals("CLMR010B")) {
			retcResponse.setListClmr010b(utilDao.retrieveClmR010b(retcParams));
		}else if(reportName.equals("CLMR010BE")) {
			retcResponse.setListClmr010be(utilDao.retrieveClmR010be(retcParams));
		}else if(reportName.equals("CLMR010C")) {
			retcResponse.setListClmr010c(utilDao.retrieveClmR010c(retcParams));
		}else if(reportName.equals("CLMR010D")) {
			retcResponse.setListClmr010d(utilDao.retrieveClmR010d(retcParams));
		}else if(reportName.equals("CLMR010E")) {
			retcResponse.setListClmr010e(utilDao.retrieveClmR010e(retcParams));
		}else if(reportName.equals("CLMR010F")) {
			retcResponse.setListClmr010f(utilDao.retrieveClmR010f(retcParams));
		}else if(reportName.equals("CLMR010G")) {
			retcResponse.setListClmr010g(utilDao.retrieveClmR010g(retcParams));
		}else if(reportName.equals("CLMR010H")) {
			retcResponse.setListClmr010h(utilDao.retrieveClmR010h(retcParams));
		}else if(reportName.equals("CLMR010HA")) {
			retcResponse.setListClmr010ha(utilDao.retrieveClmR010ha(retcParams));
		}else if(reportName.equals("CLMR010I")) {
			retcResponse.setListClmr010i(utilDao.retrieveClmR010i(retcParams));
		}else if(reportName.equals("CLMR010IA")) {
			retcResponse.setListClmr010ia(utilDao.retrieveClmR010ia(retcParams));
		}else if(reportName.equals("CLMR010J")) {
			retcResponse.setListClmr010j(utilDao.retrieveClmR010j(retcParams));
		}else if(reportName.equals("CLMR010K")) {
			retcResponse.setListClmr010k(utilDao.retrieveClmR010k(retcParams));
		}else if(reportName.equals("CLMR010L")) {
			retcResponse.setListClmr010l(utilDao.retrieveClmR010l(retcParams));
		}else if(reportName.equals("CLMR010M")) {
			retcResponse.setListClmr010m(utilDao.retrieveClmR010m(retcParams));
		}else if(reportName.equals("CLMR010ME")) {
			retcResponse.setListClmr010me(utilDao.retrieveClmR010me(retcParams));
		}else if(reportName.equals("CLMR010N")) {
			retcResponse.setListClmr010n(utilDao.retrieveClmR010n(retcParams));
		}else if(reportName.equals("CLMR010NE")) {
			retcResponse.setListClmr010ne(utilDao.retrieveClmR010ne(retcParams));
		}else if(reportName.equals("CLMR010O")) {
			retcResponse.setListClmr010o(utilDao.retrieveClmR010o(retcParams));
		}else if(reportName.equals("CLMR010P")) {
			retcResponse.setListClmr010p(utilDao.retrieveClmR010p(retcParams));
		}else if(reportName.equals("CLMR010Q")) {
			retcResponse.setListClmr010q(utilDao.retrieveClmR010q(retcParams));
		}else if(reportName.equals("CLMR010R")) {
			retcResponse.setListClmr010r(utilDao.retrieveClmR010r(retcParams));
		}else if(reportName.equals("CLMR010S")) {
			retcResponse.setListClmr010s(utilDao.retrieveClmR010s(retcParams));
		}else if(reportName.equals("CLMR010T")) {
			retcResponse.setListClmr010t(utilDao.retrieveClmR010t(retcParams));
		}else if(reportName.equals("CLMR010U")) {
			retcResponse.setListClmr010u(utilDao.retrieveClmR010u(retcParams));
		}else if(reportName.equals("CLMR010V")) {
			retcResponse.setListClmr010v(utilDao.retrieveClmR010v(retcParams));
		}else if(reportName.equals("CLMR010W")) {
			retcResponse.setListClmr010w(utilDao.retrieveClmR010w(retcParams));
		}else if(reportName.equals("CLMR010X")) {
			retcResponse.setListClmr010x(utilDao.retrieveClmR010x(retcParams));
		}else if(reportName.equals("CLMR010Y")) {
			retcResponse.setListClmr010y(utilDao.retrieveClmR010y(retcParams));
		}else if(reportName.equals("CLMR010ZO")) {
			retcResponse.setListClmr010zo(utilDao.retrieveClmR010zo(retcParams));
		}else if(reportName.equals("CLMR010ZP")) {
			retcResponse.setListClmr010zp(utilDao.retrieveClmR010zp(retcParams));
		}
		
		else if(reportName.equals("ACITR063A")) {
			retcResponse.setListAcitr063a(utilDao.retrieveAcitR063a(retcParams));
		}
		
		else if(reportName.equals("ACITR066A")) {
			retcResponse.setListAcitr066a(utilDao.retrieveAcitR066a(retcParams));
		}else if(reportName.equals("ACITR066B")) {
			retcResponse.setListAcitr066b(utilDao.retrieveAcitR066b(retcParams));
		}else if(reportName.equals("ACITR066C")) {
			retcResponse.setListAcitr066c(utilDao.retrieveAcitR066c(retcParams));
		}else if(reportName.equals("ACITR066D")) {
			retcResponse.setListAcitr066d(utilDao.retrieveAcitR066d(retcParams));
		}else if(reportName.startsWith("ACITR066E") || reportName.startsWith("ACITR066F")) {
			retcResponse.setListAcitr066ef(utilDao.retrieveAcitR066ef(retcParams));
		}else if(reportName.equals("ACITR066H")) {
			retcResponse.setListAcitr066h(utilDao.retrieveAcitR066h(retcParams));
		}
		
		else if(reportName.equals("ACSER024A")) {
			retcResponse.setListAcser024a(utilDao.retrieveAcseR024a(retcParams));
		}else if(reportName.equals("ACSER024B")) {
			retcResponse.setListAcser024b(utilDao.retrieveAcseR024b(retcParams));
		}else if(reportName.equals("ACSER024C")) {
			retcResponse.setListAcser024c(utilDao.retrieveAcseR024c(retcParams));
		}else if(reportName.equals("ACSER024D")) {
			retcResponse.setListAcser024d(utilDao.retrieveAcseR024d(retcParams));
		}else if(reportName.equals("ACSER024F")) {
			retcResponse.setListAcser024f(utilDao.retrieveAcseR024f(retcParams));
		}
		
		else if(reportName.equals("ACSER004")) {
			retcResponse.setListAcser004(utilDao.retrieveAcseR004(retcParams));
		}
		
		else if(reportName.equals("ACITR050")) {
			retcResponse.setListAcitr050b(utilDao.retrieveAcitR050b(retcParams));
			retcResponse.setListAcitr050c(utilDao.retrieveAcitR050c(retcParams));
			retcResponse.setListAcitr050d(utilDao.retrieveAcitR050d(retcParams));
		}
		
		else if(reportName.equals("ACITR061A")) {
			retcResponse.setListAcitr061a(utilDao.retrieveAcitR061a(retcParams));
		}else if(reportName.equals("ACITR061B")) {
			retcResponse.setListAcitr061b(utilDao.retrieveAcitR061b(retcParams));
		}else if(reportName.equals("ACITR061C")) {
			retcResponse.setListAcitr061c(utilDao.retrieveAcitR061c(retcParams));
		}else if(reportName.equals("ACITR061D")) {
			retcResponse.setListAcitr061d(utilDao.retrieveAcitR061d(retcParams));
		}
		
		else if(reportName.equals("ACITR058")) {
			retcResponse.setListAcitr058(utilDao.retrieveAcitR058(retcParams));
		}
		else if(reportName.equals("ACITR059")) {
			retcResponse.setListAcitr059(utilDao.retrieveAcitR059(retcParams));
		}
		else if(reportName.equals("ACSER007")) {
			retcResponse.setListAcser007(utilDao.retrieveAcseR007(retcParams));
		}else if(reportName.equals("ACSER008")) {
			retcResponse.setListAcser008(utilDao.retrieveAcseR008(retcParams));
		}
		
		else if(reportName.startsWith("ACSER024C")) {
			retcResponse.setListAcser024cd(utilDao.retrieveAcseR024cd(retcParams));
		}else if(reportName.startsWith("ACSER024D")) {
			retcResponse.setListAcser024cd(utilDao.retrieveAcseR024cd(retcParams));
		}
		
		else if(reportName.equals("CLMR052A")) {
			retcResponse.setListClmr052a(utilDao.retrieveClmR052a(retcParams));
		}else if(reportName.equals("CLMR052B")) {
			retcResponse.setListClmr052b(utilDao.retrieveClmR052b(retcParams));
		} else if(reportName.equals("CLMR010ZAO")) {
			retcResponse.setListClmr010zao(utilDao.retrieveClmR010zao(retcParams));
		} else if(reportName.equals("CLMR010ZAP")) {
			retcResponse.setListClmr010zap(utilDao.retrieveClmR010zap(retcParams));
		} else if(reportName.equals("POLR044RA")) {
			retcResponse.setListPolr044ra(utilDao.retrievePolR044ra(retcParams));
		} else if(reportName.equals("POLR044SA")) {
			retcResponse.setListPolr044sa(utilDao.retrievePolR044sa(retcParams));
		} else if(reportName.equals("POLR052J")) {
			retcResponse.setListPolr052j(utilDao.retrievePolR052j(retcParams));
		} else if(reportName.equals("POLR052K")) {
			retcResponse.setListPolr052k(utilDao.retrievePolR052k(retcParams));
		} else if(reportName.equals("CLMR052AA")) {
			retcResponse.setListClmr052aa(utilDao.retrieveClmR052aa(retcParams));
		} else if(reportName.equals("CLMR052BA")) {
			retcResponse.setListClmr052ba(utilDao.retrieveClmR052ba(retcParams));
		} else if(reportName.equals("POLR044WQ")) {
			retcResponse.setListPolr044wq(utilDao.retrievePolR044wq(retcParams));
		} else if(reportName.equals("POLR044EA")) {
			retcResponse.setListPolr044ea(utilDao.retrievePolR044ea(retcParams));
		} else if(reportName.equals("POLR044IA")) {
			retcResponse.setListPolr044ia(utilDao.retrievePolR044ia(retcParams));
		} 
		
		else if(reportName.equals("ACSER060A")) {
			retcResponse.setListAcser060a(utilDao.retrieveAcseR060a(retcParams));
		} else if(reportName.equals("ACSER060B")) {
			retcResponse.setListAcser060b(utilDao.retrieveAcseR060b(retcParams));
		} else if(reportName.equals("ACSER060C")) {
			retcResponse.setListAcser060c(utilDao.retrieveAcseR060c(retcParams));
		} else if(reportName.equals("ACSER060D")) {
			retcResponse.setListAcser060d(utilDao.retrieveAcseR060d(retcParams));
		} else if(reportName.equals("ACITR066J")) {
			retcResponse.setListAcitr066j(utilDao.retrieveAcitR066j(retcParams));
		}  else if(reportName.equals("POLR044SB")) {
			retcResponse.setListPolr044sb(utilDao.retrievePolR044sb(retcParams));
		} else if(reportName.equals("POLR044SC")) {
			retcResponse.setListPolr044sc(utilDao.retrievePolR044sc(retcParams));

		} else if(reportName.equals("POLR052L")) {
			retcResponse.setListPolr052l(utilDao.retrievePolR052l(retcParams));
		} else if(reportName.equals("POLR052M")) {
			retcResponse.setListPolr052m(utilDao.retrievePolR052m(retcParams));

		} else if(reportName.equals("CLMR010ZBO")) {
			retcResponse.setListClmr010zbo(utilDao.retrieveClmR010zbo(retcParams));
		} else if(reportName.equals("CLMR010ZBP")) {
			retcResponse.setListClmr010zbp(utilDao.retrieveClmR010zbp(retcParams));
		}
		
		else {
			System.out.println("No Response yet!");
		}
		return retcResponse;
	}
	
}
