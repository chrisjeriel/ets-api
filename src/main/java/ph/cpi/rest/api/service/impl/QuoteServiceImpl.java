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
import ph.cpi.rest.api.model.request.RetrieveQuoteAttachmentOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteCompetitionRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAttachmentOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteCompetitionResponse;
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
	public RetrieveQuoteAttachmentOcResponse retrieveQuoteAttachmentOc(RetrieveQuoteAttachmentOcRequest rqaor) throws SQLException {
		
		RetrieveQuoteAttachmentOcResponse rqaocResponse = new RetrieveQuoteAttachmentOcResponse();
		
		HashMap<String, Object> retrieveQuoteAttachmentOcParams = new HashMap<String, Object>();
		retrieveQuoteAttachmentOcParams.put("quoteIdOc", rqaor.getQuoteIdOc());
		retrieveQuoteAttachmentOcParams.put("openQuotationNo", rqaor.getOpenQuotationNo());
		
		rqaocResponse.getQuotationOc().setQuoteIdOc(rqaor.getQuoteIdOc());
		rqaocResponse.getQuotationOc().setOpenQuotationNo(rqaor.getOpenQuotationNo());
		rqaocResponse.getQuotationOc().setAttachment(quoteDao.retrieveQuoteAttachmentOcList(retrieveQuoteAttachmentOcParams));
		//rqaResponse.getQuotation().setAlop(quoteDao.retrieveQuoteAlop(retrieveQuoteAlopParams));
		
		logger.info("retrieveQuoteAttachmentOcResponse : " + rqaocResponse.toString());
		
		return rqaocResponse;
	}
	
	@Override
	public RetrieveQuoteCompetitionResponse retrieveQuoteCompetition(RetrieveQuoteCompetitionRequest rqcr) throws SQLException {
		
		RetrieveQuoteCompetitionResponse rqcrResponse = new RetrieveQuoteCompetitionResponse();
		
		HashMap<String, Object> retrieveQuoteCompetitionParams = new HashMap<String, Object>();
		retrieveQuoteCompetitionParams.put("quoteIdOc", rqcr.getQuoteId());
		retrieveQuoteCompetitionParams.put("openQuotationNo", rqcr.getQuotationNo());
		
		rqcrResponse.getQuotation().setQuoteId(rqcr.getQuoteId());
		rqcrResponse.getQuotation().setQuotationNo(rqcr.getQuotationNo());
		rqcrResponse.getQuotation().setCompetition(quoteDao.retrieveQuoteCompetitionList(retrieveQuoteCompetitionParams));;
		//rqaResponse.getQuotation().setAlop(quoteDao.retrieveQuoteAlop(retrieveQuoteAlopParams));
		
		logger.info("retrieveQuoteCompetitionResponse : " + rqcrResponse.toString());
		
		return rqcrResponse;
	}

	
	
}
