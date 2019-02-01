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
import ph.cpi.rest.api.model.request.RetrieveQuoteGeneralInfoOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteHoldCoverListingRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteHoldCoverRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteGeneralInfoOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteHoldCoverListingResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteHoldCoverResponse;
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
	public RetrieveQuoteHoldCoverResponse retrieveQuoteHoldCover(RetrieveQuoteHoldCoverRequest rqhcp)
			throws SQLException {
		RetrieveQuoteHoldCoverResponse rqhcResponse = new RetrieveQuoteHoldCoverResponse();
		HashMap<String, Object> retrieveQuoteHoldCoveParams = new HashMap<String, Object>();
		retrieveQuoteHoldCoveParams.put("holdCoverId", rqhcp.getHoldCoverId());
		retrieveQuoteHoldCoveParams.put("holdCoverNo", rqhcp.getHoldCoverNo());
		rqhcResponse.setQuotation(quoteDao.retrieveQuoteHoldCover(retrieveQuoteHoldCoveParams));
		logger.info("retrieveQuoteHoldCoverResponse : " + rqhcResponse.toString());
		
		return rqhcResponse;
	}

	@Override
	public RetrieveQuoteGeneralInfoOcResponse retrieveQuoteGeneralInfoOc(RetrieveQuoteGeneralInfoOcRequest rqgiocp)
			throws SQLException {
		RetrieveQuoteGeneralInfoOcResponse rqgiocResponse = new RetrieveQuoteGeneralInfoOcResponse();
		HashMap<String, Object> retrieveQuoteGeneralInfoOcParams = new HashMap<String, Object>();
		retrieveQuoteGeneralInfoOcParams.put("quoteIdOc", rqgiocp.getQuoteIdOc());
		retrieveQuoteGeneralInfoOcParams.put("openQuotationNo", rqgiocp.getOpenQuotationNo());
		rqgiocResponse.setQuotationOc(quoteDao.retrieveQuoterGeneralInfoOc(retrieveQuoteGeneralInfoOcParams));
		logger.info("retrieveQuoteGeneralInfoOcResponse : " + rqgiocResponse.toString());
		
		return rqgiocResponse;
	}

	@Override
	public RetrieveQuoteHoldCoverResponse retrieveQuoteHoldCoverListing(RetrieveQuoteHoldCoverListingRequest rqhclp)
			throws SQLException {
		RetrieveQuoteHoldCoverResponse rqhcResponse = new RetrieveQuoteHoldCoverResponse();
		HashMap<String, Object> retrieveQuoteHoldCoverParams = new HashMap<String, Object>();
		retrieveQuoteHoldCoverParams.put("holdCoverNo",	rqhclp.getHoldCoverNo());
		retrieveQuoteHoldCoverParams.put("status", rqhclp.getStatus());
		retrieveQuoteHoldCoverParams.put("cedingName", rqhclp.getCedingName());
		retrieveQuoteHoldCoverParams.put("quotationNo", rqhclp.getQuotationNo());
		retrieveQuoteHoldCoverParams.put("riskName", rqhclp.getRiskName());
		retrieveQuoteHoldCoverParams.put("insuredDesc", rqhclp.getInsuredDesc());
		retrieveQuoteHoldCoverParams.put("periodFrom", rqhclp.getPeriodFrom());
		retrieveQuoteHoldCoverParams.put("periodTo", rqhclp.getPeriodTo());
		retrieveQuoteHoldCoverParams.put("compRefHoldCovNo", rqhclp.getCompRefHoldCovNo());
		retrieveQuoteHoldCoverParams.put("reqBy", rqhclp.getReqBy());
		retrieveQuoteHoldCoverParams.put("reqDate", rqhclp.getReqDate());
		retrieveQuoteHoldCoverParams.put("expiringInDays", rqhclp.getExpiringInDays());
		rqhcResponse.setQuotationList(quoteDao.retrieveQuoteHoldCoverListing(retrieveQuoteHoldCoverParams));
		
		return rqhcResponse;
	}

	

	
}
