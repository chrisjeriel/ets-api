package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.MaintenanceDao;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.service.MaintenanceService;

@Component
public class MaintenanceServiceImpl implements MaintenanceService{

	@Autowired
	MaintenanceDao maintenanceDao;
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteServiceImpl.class);
	
	@Override
	public RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException {
		RetrieveQuoteAlopResponse rqaResponse = new RetrieveQuoteAlopResponse();
		
		HashMap<String, Object> retrieveQuoteAlopParams = new HashMap<String, Object>();
		retrieveQuoteAlopParams.put("quoteId", rqap.getQuoteId());
		retrieveQuoteAlopParams.put("quotationNo", rqap.getQuotationNo());
		
		rqaResponse.getQuotation().setAlop(maintenanceDao.retrieveQuoteAlop(retrieveQuoteAlopParams));
		
		logger.info("retrieveQuoteAlopResponse : " + rqaResponse.toString());
		
		return rqaResponse;
	}

}
