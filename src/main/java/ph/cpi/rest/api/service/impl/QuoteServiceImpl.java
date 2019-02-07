package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.QuoteDao;
import ph.cpi.rest.api.model.request.RetrieveQuoteCoverageRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteDetailsOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteDetailsRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteListingOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteListingRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteOptionRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteCoverageResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteDetailsOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteDetailsResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteListingOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteListingResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteOptionResponse;
import ph.cpi.rest.api.service.QuoteService;

@Component
public class QuoteServiceImpl implements QuoteService{
	
	@Autowired
	QuoteDao quoteDao;
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteServiceImpl.class);

	/*
	 * @Override public RetrieveQuoteAlopResponse
	 * retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException {
	 * 
	 * RetrieveQuoteAlopResponse rqaResponse = new RetrieveQuoteAlopResponse();
	 * 
	 * HashMap<String, Object> retrieveQuoteAlopParams = new HashMap<String,
	 * Object>(); retrieveQuoteAlopParams.put("quoteId", rqap.getQuoteId());
	 * retrieveQuoteAlopParams.put("quotationNo", rqap.getQuotationNo());
	 * 
	 * rqaResponse.getQuotation().setAlop(quoteDao.retrieveQuoteAlop(
	 * retrieveQuoteAlopParams));
	 * 
	 * logger.info("retrieveQuoteAlopResponse : " + rqaResponse.toString());
	 * 
	 * return rqaResponse; }
	 */
	@Override
	public RetrieveQuoteListingResponse retrieveQuoteListing(RetrieveQuoteListingRequest rqlp) throws SQLException {
		RetrieveQuoteListingResponse rqlResponse = new RetrieveQuoteListingResponse();
		
		HashMap<String, Object> retrieveQuoteListingParams = new HashMap<String, Object>();
		retrieveQuoteListingParams.put("quotationNo", rqlp.getQuotationNo());
		retrieveQuoteListingParams.put("cessionDesc", rqlp.getCessionDesc());
		retrieveQuoteListingParams.put("lineClassCdDesc", rqlp.getLineClassCdDesc());
		retrieveQuoteListingParams.put("status", rqlp.getStatus());
		retrieveQuoteListingParams.put("cedingName", rqlp.getCedingName());
		retrieveQuoteListingParams.put("principalName", rqlp.getPrincipalName());
		retrieveQuoteListingParams.put("contractorName", rqlp.getContractorName());
		retrieveQuoteListingParams.put("insuredDesc", rqlp.getInsuredDesc());
		retrieveQuoteListingParams.put("riskName", rqlp.getRiskName());
		retrieveQuoteListingParams.put("objectDesc", rqlp.getObjectDesc());
		retrieveQuoteListingParams.put("site", rqlp.getSite());
		retrieveQuoteListingParams.put("policyNo", ""); //from policy table
		retrieveQuoteListingParams.put("currencyCd", rqlp.getCurrencyCd());
		retrieveQuoteListingParams.put("issueDate", rqlp.getIssueDate());
		retrieveQuoteListingParams.put("expiryDate", rqlp.getExpiryDate());
		retrieveQuoteListingParams.put("reqBy", rqlp.getReqBy());
		retrieveQuoteListingParams.put("createUser", rqlp.getCreateUser());
		/*retrieveQuoteListingParams.put("position", rqlp.getPaginationRequest().getPosition());
		retrieveQuoteListingParams.put("count", rqlp.getPaginationRequest().getCount());
		retrieveQuoteListingParams.put("sortKey", rqlp.getSortRequest().getSortKey());
		retrieveQuoteListingParams.put("order", rqlp.getSortRequest().getOrder());*/
		
		rqlResponse.setQuotationList(quoteDao.retrieveQuoteListing(retrieveQuoteListingParams));
		
		logger.info("retrieveQuoteListingResponse : " + rqlResponse.toString());
		
		return rqlResponse;
	}

	@Override
	public RetrieveQuoteListingOcResponse retrieveQuoteListingOc(RetrieveQuoteListingOcRequest rqlop)
			throws SQLException {
		RetrieveQuoteListingOcResponse rqloResponse = new RetrieveQuoteListingOcResponse();
		
		HashMap<String, Object> retrieveQuoteListingOcParams = new HashMap<String, Object>();
		retrieveQuoteListingOcParams.put("quotationNo", rqlop.getQuotationNo());
		retrieveQuoteListingOcParams.put("cessionDesc", rqlop.getCessionDesc());
		retrieveQuoteListingOcParams.put("lineClassCdDesc", rqlop.getLineClassCdDesc());
		retrieveQuoteListingOcParams.put("status", rqlop.getStatus());
		retrieveQuoteListingOcParams.put("cedingName", rqlop.getCedingName());
		retrieveQuoteListingOcParams.put("principalName", rqlop.getPrincipalName());
		retrieveQuoteListingOcParams.put("contractorName", rqlop.getContractorName());
		retrieveQuoteListingOcParams.put("insuredDesc", rqlop.getInsuredDesc());
		retrieveQuoteListingOcParams.put("riskName", rqlop.getRiskName());
		retrieveQuoteListingOcParams.put("objectDesc", rqlop.getObjectDesc());
		retrieveQuoteListingOcParams.put("site", rqlop.getSite());
		retrieveQuoteListingOcParams.put("policyNo", ""); //from policy table
		retrieveQuoteListingOcParams.put("currencyCd", rqlop.getCurrencyCd());
		retrieveQuoteListingOcParams.put("issueDate", rqlop.getIssueDate());
		retrieveQuoteListingOcParams.put("expiryDate", rqlop.getExpiryDate());
		retrieveQuoteListingOcParams.put("reqBy", rqlop.getReqBy());
		retrieveQuoteListingOcParams.put("createUser", rqlop.getCreateUser());
		/*retrieveQuoteListingOcParams.put("position", rqlp.getPaginationRequest().getPosition());
		retrieveQuoteListingOcParams.put("count", rqlp.getPaginationRequest().getCount());
		retrieveQuoteListingOcParams.put("sortKey", rqlp.getSortRequest().getSortKey());
		retrieveQuoteListingOcParams.put("order", rqlp.getSortRequest().getOrder());*/
		
		rqloResponse.setQuotationOcList(quoteDao.retrieveQuoteListingOc(retrieveQuoteListingOcParams));
		
		logger.info("retrieveQuoteListingOcResponse : " + rqloResponse.toString());
		
		return rqloResponse;
	}

	@Override
	public RetrieveQuoteOptionResponse retrieveQuoteOption(RetrieveQuoteOptionRequest rqop) throws SQLException {
		RetrieveQuoteOptionResponse rqoResponse = new RetrieveQuoteOptionResponse();
		
		HashMap<String, Object> retrieveQuoteOptionParams = new HashMap<String, Object>();
		retrieveQuoteOptionParams.put("quoteId", rqop.getQuoteId());
		retrieveQuoteOptionParams.put("quotationNo", rqop.getQuotationNo());
		
		rqoResponse.setQuotation(quoteDao.retrieveQuoteOption(retrieveQuoteOptionParams));
		
		logger.info("retrieveQuoteOptionResponse : " + rqoResponse.toString());
		
		return rqoResponse;
	}
	
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
