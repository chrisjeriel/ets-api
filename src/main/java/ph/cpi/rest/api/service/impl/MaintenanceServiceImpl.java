package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.MaintenanceDao;
import ph.cpi.rest.api.model.request.RetrieveMtnIntermediaryRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnLineClassRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnLineRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnIntermediaryResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnLineClassResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnLineResponse;
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
	public RetrieveMtnIntermediaryResponse retrieveMtnIntermediary(RetrieveMtnIntermediaryRequest rmip)
			throws SQLException {
		// TODO Auto-generated method stub
		RetrieveMtnIntermediaryResponse rmiResponse = new RetrieveMtnIntermediaryResponse();
		
		HashMap<String, Object> retrieveMtnIntermediaryParams = new HashMap<String, Object>();
		retrieveMtnIntermediaryParams.put("intmId", rmip.getIntmId());
		
		rmiResponse.setIntermediary(maintenanceDao.retrieveMntIntermediary(retrieveMtnIntermediaryParams));
			
		logger.info("retrieveMtnIntermediaryResponse : " + rmiResponse.toString());
		
		return rmiResponse;
	}

	@Override
	public RetrieveMtnLineResponse retrieveMtnLine(RetrieveMtnLineRequest rmlp) throws SQLException {
		// TODO Auto-generated method stub
		RetrieveMtnLineResponse rmlResponse = new RetrieveMtnLineResponse();
		HashMap<String, Object> retrieveMtnLineParams = new HashMap<String, Object>();
		retrieveMtnLineParams.put("lineCd", rmlp.getLineCd());
		
		rmlResponse.setLine(maintenanceDao.retrieveMntLine(retrieveMtnLineParams));
		logger.info("retrieveMtnLineResponse : " + rmlResponse.toString());
		return rmlResponse;
	}

	public RetrieveMtnLineClassResponse retrieveMtnLineClass(RetrieveMtnLineClassRequest rmlcp) throws SQLException {
		// TODO Auto-generated method stub
		RetrieveMtnLineClassResponse rmlcResponse = new RetrieveMtnLineClassResponse();
		HashMap<String, Object> retrieveMtnLineClassParams = new HashMap<String, Object>();
		
		retrieveMtnLineClassParams.put("lineCd", rmlcp.getLineCd());
		retrieveMtnLineClassParams.put("lineClassCd", rmlcp.getLineClassCd());
		
		rmlcResponse.setLineClass(maintenanceDao.retrieveMntLineClass(retrieveMtnLineClassParams));
		logger.info("retrieveMtnLineClassResponse : " + rmlcResponse.toString());
		return rmlcResponse;
	}
	

}
