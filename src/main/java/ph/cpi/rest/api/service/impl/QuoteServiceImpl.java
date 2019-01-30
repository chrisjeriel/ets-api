package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.QuoteDao;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAttachmentOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteCompetitionRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteCoverageOcRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAttachmentOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteCompetitionResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteCoverageOcResponse;
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
		retrieveQuoteAttachmentOcParams.put("position", rqaor.getPaginationRequest().getPosition());
		retrieveQuoteAttachmentOcParams.put("count", rqaor.getPaginationRequest().getCount());
		retrieveQuoteAttachmentOcParams.put("sortKey", rqaor.getSortRequest().getSortKey());
		retrieveQuoteAttachmentOcParams.put("order", rqaor.getSortRequest().getOrder());
		
		rqaocResponse.setQuotationOc(quoteDao.retrieveQuoteAttachmentOcList(retrieveQuoteAttachmentOcParams));
		rqaocResponse.getPaginationResponse().setPosition(rqaor.getPaginationRequest().getPosition());
		rqaocResponse.getPaginationResponse().setCount(rqaor.getPaginationRequest().getCount());
		rqaocResponse.getSortResponse().setSortKey(rqaor.getSortRequest().getSortKey());
		rqaocResponse.getSortResponse().setOrder(rqaor.getSortRequest().getOrder());
		
		logger.info("retrieveQuoteAttachmentOcResponse : " + rqaocResponse.toString());
		
		return rqaocResponse;
	}
	
	@Override
	public RetrieveQuoteCompetitionResponse retrieveQuoteCompetition(RetrieveQuoteCompetitionRequest rqcr) throws SQLException {
		
		RetrieveQuoteCompetitionResponse rqcrResponse = new RetrieveQuoteCompetitionResponse();
		
		HashMap<String, Object> retrieveQuoteCompetitionParams = new HashMap<String, Object>();
		retrieveQuoteCompetitionParams.put("quoteId", rqcr.getQuoteId());
		retrieveQuoteCompetitionParams.put("quotationNo", rqcr.getQuotationNo());
		retrieveQuoteCompetitionParams.put("position", rqcr.getPaginationRequest().getPosition());
		retrieveQuoteCompetitionParams.put("count", rqcr.getPaginationRequest().getCount());
		retrieveQuoteCompetitionParams.put("sortKey", rqcr.getSortRequest().getSortKey());
		retrieveQuoteCompetitionParams.put("order", rqcr.getSortRequest().getOrder());
		
		rqcrResponse.setQuotation(quoteDao.retrieveQuoteCompetitionList(retrieveQuoteCompetitionParams));
		rqcrResponse.getPaginationResponse().setPosition(rqcr.getPaginationRequest().getPosition());
		rqcrResponse.getPaginationResponse().setCount(rqcr.getPaginationRequest().getCount());
		rqcrResponse.getSortResponse().setSortKey(rqcr.getSortRequest().getSortKey());
		rqcrResponse.getSortResponse().setOrder(rqcr.getSortRequest().getOrder());
		
		logger.info("retrieveQuoteCompetitionResponse : " + rqcrResponse.toString());
		
		return rqcrResponse;
	}
	
	@Override
	public RetrieveQuoteCoverageOcResponse retrieveQuoteCoverageOc(RetrieveQuoteCoverageOcRequest rqcor) throws SQLException {
		
		RetrieveQuoteCoverageOcResponse rqcorResponse = new RetrieveQuoteCoverageOcResponse();
		
		HashMap<String, Object> retrieveQuoteCoverageOcParams = new HashMap<String, Object>();
		retrieveQuoteCoverageOcParams.put("quoteIdOc", rqcor.getQuoteIdOc());
		retrieveQuoteCoverageOcParams.put("openQuotationNo", rqcor.getOpenQuotationNo());
		retrieveQuoteCoverageOcParams.put("position", rqcor.getPaginationRequest().getPosition());
		retrieveQuoteCoverageOcParams.put("count", rqcor.getPaginationRequest().getCount());
		retrieveQuoteCoverageOcParams.put("sortKey", rqcor.getSortRequest().getSortKey());
		retrieveQuoteCoverageOcParams.put("order", rqcor.getSortRequest().getOrder());
		
		rqcorResponse.setQuotationOc(quoteDao.retrieveQuoteCoverageOcList(retrieveQuoteCoverageOcParams));
		rqcorResponse.getPaginationResponse().setPosition(rqcor.getPaginationRequest().getPosition());
		rqcorResponse.getPaginationResponse().setCount(rqcor.getPaginationRequest().getCount());
		rqcorResponse.getSortResponse().setSortKey(rqcor.getSortRequest().getSortKey());
		rqcorResponse.getSortResponse().setOrder(rqcor.getSortRequest().getOrder());
		
		logger.info("retrieveQuoteCoverageOcResponse : " + rqcorResponse.toString());
		
		return rqcorResponse;
	}
	
	
}
