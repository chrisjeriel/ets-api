package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.MaintenanceDao;
import ph.cpi.rest.api.model.request.RetrieveEndtCodeRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnInsuredRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.response.RetrieveEndtCodeResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnInsuredResponse;
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

	@Override
	public RetrieveMtnInsuredResponse retrieveMtnInsured(RetrieveMtnInsuredRequest rmir) throws SQLException {
		RetrieveMtnInsuredResponse rmirResponse = new RetrieveMtnInsuredResponse();
		
		HashMap<String, Object> retrieveMtnInsuredParams = new HashMap<String, Object>();
		retrieveMtnInsuredParams.put("insuredId", rmir.getInsuredId());
		
		rmirResponse.setInsured(maintenanceDao.retrieveMtnInsured(retrieveMtnInsuredParams));
		logger.info("retrieveMtnInsuredResponse : " + rmirResponse.toString());
		
		return rmirResponse;
	}

	@Override
	public RetrieveEndtCodeResponse retrieveEndtCode(RetrieveEndtCodeRequest recr) throws SQLException {
		RetrieveEndtCodeResponse recrResponse = new RetrieveEndtCodeResponse();
		
		HashMap<String, Object> retrieveEndtCodeParams = new HashMap<String, Object>();
		retrieveEndtCodeParams.put("endtCd", recr.getEndtCd());
		retrieveEndtCodeParams.put("lineCd", recr.getLineCd());
		
		recrResponse.setEndtCode(maintenanceDao.retrieveEndtCode(retrieveEndtCodeParams));;
		logger.info("retrieveMtnInsuredResponse : " + recrResponse.toString());
		
		return recrResponse;
	}

}
