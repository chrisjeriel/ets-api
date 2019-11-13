package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UtilDao;
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
		String errorMsg = "Please check values.";
	
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
		} catch (Exception e) {
			e.printStackTrace();
			err.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUGGEN", "General Exception"));
		}
		
		return err;
	}

	@Override
	public String getReportFileName(HashMap<String, Object> params) throws SQLException {
		return utilDao.getReportFileName(params);
	}
	
	

}
