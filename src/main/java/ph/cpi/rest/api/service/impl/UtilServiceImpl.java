package ph.cpi.rest.api.service.impl;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

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
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UtilDao;
import ph.cpi.rest.api.model.Response;
import ph.cpi.rest.api.model.request.GenerateReportRequest;
import ph.cpi.rest.api.model.response.ExtractReportResponse;
import ph.cpi.rest.api.service.UtilService;

@Component
public class UtilServiceImpl implements UtilService {
	
	@Autowired
	UtilDao utilDao;
	
	private static final Logger logger = LoggerFactory.getLogger(UtilServiceImpl.class);

	@Override
	public ExtractReportResponse extractReport(GenerateReportRequest grr) throws SQLException {
		// TODO Auto-generated method stub
		ExtractReportResponse err = new ExtractReportResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		String errorMsg = "Please check field values.";
	
		try {
			
			params.put("reportId", grr.getPolr044Params().getReportId());
			params.put("extractUser", grr.getPolr044Params().getExtractUser());
			params.put("lineCdParam", grr.getPolr044Params().getLineCdParam());
			params.put("cedingIdParam", grr.getPolr044Params().getCedingIdParam());
			params.put("dateParam", grr.getPolr044Params().getDateParam());
			params.put("dateRange", grr.getPolr044Params().getDateRange());
			params.put("fromDate", grr.getPolr044Params().getFromDate());
			params.put("toDate", grr.getPolr044Params().getToDate());
			params.put("incRecTag", grr.getPolr044Params().getIncRecTag());
			params.put("extractCount", 0);
			params.put("forceExtract", grr.getPolr044Params().getForceExtract());
			
			
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
	public Response uploadDataTable() throws SQLException {
		Response resp = new Response();
		
		String SAMPLE_XLSX_FILE_PATH = "C:\\Users\\PMMSC-TOTZ\\Documents\\PMMSC\\sample-spreadsheet.xlsx";
		
        try {
			Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
			
			System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
			
			DataFormatter dataFormatter = new DataFormatter();
			
			for(Sheet sheet: workbook) {
	            System.out.println("=> " + sheet.getSheetName());
	            
	            for (Row row: sheet) {
	                for(Cell cell: row) {
	                    String cellValue = dataFormatter.formatCellValue(cell);
	                    System.out.print(cellValue + "\t");
	                }
	                System.out.println();
	            }
	        }
			
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		
		return resp;
	}
	
	

}
