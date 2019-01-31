package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.controller.ApiController;
import ph.cpi.rest.api.dao.QuoteDao;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteCoverageRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteDetailsOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteDetailsRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteCoverageResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteDetailsOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteDetailsResponse;
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
	public RetrieveQuoteCoverageResponse retrieveQuoteCoverage(RetrieveQuoteCoverageRequest rqcr) throws SQLException {
		RetrieveQuoteCoverageResponse rqcrResponse = new RetrieveQuoteCoverageResponse();
		
		HashMap<String, Object> retrieveQuoteCoverageParams = new HashMap<String, Object>();
		retrieveQuoteCoverageParams.put("quoteId", rqcr.getQuoteId());
		retrieveQuoteCoverageParams.put("quotationNo", rqcr.getQuotationNo());
		
		rqcrResponse.setQuotation(quoteDao.retrieveQuoteCoverage(retrieveQuoteCoverageParams));
		
		logger.info("retrieveQuoteCoverageResponse : " + rqcrResponse.toString());
		
		return rqcrResponse;
	}

	@Override
	public RetrieveQuoteDetailsOcResponse retrieveQuoteDetailsOc(RetrieveQuoteDetailsOcRequest rqdocr)
			throws SQLException {
		RetrieveQuoteDetailsOcResponse rqdocrResponse = new RetrieveQuoteDetailsOcResponse();
		
		HashMap<String, Object> retrieveQuoteDetailsOcParams = new HashMap<String, Object>();
		retrieveQuoteDetailsOcParams.put("quoteIdOc", rqdocr.getQuoteIdOc());
		retrieveQuoteDetailsOcParams.put("openQuotationNo", rqdocr.getOpenQuotationNo());
		
		rqdocrResponse.setQuotationOC(quoteDao.retrieveQuoteDetailsOc(retrieveQuoteDetailsOcParams));
		
		logger.info("retrieveQuoteDetailsOcResponse : " + rqdocrResponse.toString());
		
		return rqdocrResponse;
	}

	@Override
	public RetrieveQuoteDetailsResponse retrieveQuoteDetails(RetrieveQuoteDetailsRequest rqdr) throws SQLException {
		// TODO Auto-generated method stub
		RetrieveQuoteDetailsResponse rqdrResponse = new RetrieveQuoteDetailsResponse();
		
		HashMap<String, Object> retrieveQuoteDetailsParams = new HashMap<String, Object>();
		retrieveQuoteDetailsParams.put("quoteIdOc", rqdr.getQuoteId());
		retrieveQuoteDetailsParams.put("openQuotationNo", rqdr.getQuotationNo());
		
		rqdrResponse.setQuotation(quoteDao.retrieveQuoteDetails(retrieveQuoteDetailsParams));
		
		logger.info("retrieveQuoteDetailsResponse : " + rqdrResponse.toString());
		
		return rqdrResponse;
	}

	
	
}
