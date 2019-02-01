package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.QuoteDao;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteEndorsementsOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteEndorsementsRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteGeneralInfoRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteEndorsementsOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteEndorsementsResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteGeneralInfoResponse;
import ph.cpi.rest.api.service.QuoteService;

@Component
public class QuoteServiceImpl implements QuoteService{
	
	@Autowired
	QuoteDao quoteDao;
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteServiceImpl.class);

	@Override
	public RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException {
		
		RetrieveQuoteAlopResponse rqaResponse = new RetrieveQuoteAlopResponse();
		
		HashMap<String, Object> retrieveQuoteAlopParams = new HashMap<String, Object>();
		retrieveQuoteAlopParams.put("quoteId", rqap.getQuoteId());
		retrieveQuoteAlopParams.put("quotationNo", rqap.getQuotationNo());
		
		rqaResponse.getQuotation().setAlop(quoteDao.retrieveQuoteAlop(retrieveQuoteAlopParams));
		
		logger.info("retrieveQuoteAlopResponse : " + rqaResponse.toString());
		
		return rqaResponse;
	}

	@Override
	public RetrieveQuoteGeneralInfoResponse retrieveQuoteGeneralInfo(RetrieveQuoteGeneralInfoRequest rqgip)
			throws SQLException {
		
		RetrieveQuoteGeneralInfoResponse rqgiResponse = new RetrieveQuoteGeneralInfoResponse();
		HashMap<String, Object> retrieveQuoteGeneralInfoParams = new HashMap<String, Object>();
		retrieveQuoteGeneralInfoParams.put("quoteId", rqgip.getQuoteId());
		retrieveQuoteGeneralInfoParams.put("quotationNo", rqgip.getQuotationNo());
		
		rqgiResponse.setQuotationGeneralInfo(quoteDao.retrieveQuoteGeneralInfo(retrieveQuoteGeneralInfoParams));
		rqgiResponse.setProject(quoteDao.retrieveQuoteProject(retrieveQuoteGeneralInfoParams));
		logger.info("retrieveQuoteGeneralInfoResponse : " + rqgiResponse.toString());
		// TODO Auto-generated method stub
		return rqgiResponse;
	}

	@Override
	public RetrieveQuoteEndorsementsResponse retrieveQuoteEndorsements(RetrieveQuoteEndorsementsRequest rqerp)
			throws SQLException {
		
		RetrieveQuoteEndorsementsResponse rqeResponse = new RetrieveQuoteEndorsementsResponse();
		HashMap<String, Object> retrieveQuoteEndorsementsParams = new HashMap<String, Object>();
		retrieveQuoteEndorsementsParams.put("quoteId", rqerp.getQuoteId());
		retrieveQuoteEndorsementsParams.put("quotationNo", rqerp.getQuotationNo());
		rqeResponse.setEndorsements(quoteDao.retrieveQuoteEndorsements(retrieveQuoteEndorsementsParams));
		logger.info("retrieveQuoteEndorsementsResponse : " + rqerp.toString());
		// TODO Auto-generated method stub
		return rqeResponse;
	}

	@Override
	public RetrieveQuoteEndorsementsOcResponse retrieveQuoteEndorsementsOc(RetrieveQuoteEndorsementsOcRequest rqerop)
			throws SQLException {
		// TODO Auto-generated method stub
		RetrieveQuoteEndorsementsOcResponse rqeoResponse = new RetrieveQuoteEndorsementsOcResponse();
		HashMap<String, Object> retrieveQuoteEndorsementsOcParams = new HashMap<String, Object>();
		retrieveQuoteEndorsementsOcParams.put("quoteId",rqerop.getQuoteId());
		retrieveQuoteEndorsementsOcParams.put("quotationNo", rqerop.getQuotationNo());
		rqeoResponse.setEndorsementsOc(quoteDao.retrieveQuoteEndorsementsOc(retrieveQuoteEndorsementsOcParams));
		logger.info("retrieveQuoteEndorsementsOcResponse : " + rqerop.toString());
		return rqeoResponse;
	}

	
	
}
