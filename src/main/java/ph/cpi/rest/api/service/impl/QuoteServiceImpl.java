package ph.cpi.rest.api.service.impl;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.ISODateTimeFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.QuoteDao;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopItemRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAttachmentOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteCompetitionRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteCoverageOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteCoverageRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteDetailsOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteDetailsRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteEndorsementsOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteEndorsementsRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteGeneralInfoOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteGeneralInfoRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteHoldCoverListingRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteHoldCoverRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteListingOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteListingRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteOptionRequest;
import ph.cpi.rest.api.model.request.SaveQuoteAlopItemRequest;
import ph.cpi.rest.api.model.request.SaveQuoteAlopRequest;
import ph.cpi.rest.api.model.request.SaveQuoteAttachmentOcRequest;
import ph.cpi.rest.api.model.request.SaveQuoteAttachmentRequest;
import ph.cpi.rest.api.model.request.SaveQuoteCompetitionRequest;
import ph.cpi.rest.api.model.request.SaveQuoteCoverageOcRequest;
import ph.cpi.rest.api.model.request.SaveQuoteCoverageRequest;
import ph.cpi.rest.api.model.request.SaveQuoteGeneralInfoRequest;
import ph.cpi.rest.api.model.request.SaveQuoteHoldCoverRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopItemResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAttachmentOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteCompetitionResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteCoverageOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteCoverageResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteDetailsOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteDetailsResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteEndorsementsOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteEndorsementsResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteGeneralInfoOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteGeneralInfoResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteHoldCoverResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteListingOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteListingResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteOptionResponse;
import ph.cpi.rest.api.model.response.SaveQuoteAlopItemResponse;
import ph.cpi.rest.api.model.response.SaveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.SaveQuoteAttachmentOcResponse;
import ph.cpi.rest.api.model.response.SaveQuoteAttachmentResponse;
import ph.cpi.rest.api.model.response.SaveQuoteCompetitionResponse;
import ph.cpi.rest.api.model.response.SaveQuoteCoverageOcResponse;
import ph.cpi.rest.api.model.response.SaveQuoteCoverageResponse;
import ph.cpi.rest.api.model.response.SaveQuoteGeneralInfoResponse;
import ph.cpi.rest.api.model.response.SaveQuoteHoldCoverResponse;
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

	@Override
	public SaveQuoteAttachmentResponse saveQuoteAttachment(SaveQuoteAttachmentRequest sqar) throws SQLException {
		SaveQuoteAttachmentResponse sqarResponse = new SaveQuoteAttachmentResponse();
		
		HashMap<String, Object> saveQuoteAttachmentParams = new HashMap<String, Object>();
		saveQuoteAttachmentParams.put("quoteId", sqar.getQuoteId());
		saveQuoteAttachmentParams.put("saveAttachmentsList", sqar.getSaveAttachmentsList());
		saveQuoteAttachmentParams.put("deleteAttachmentsList", sqar.getDeleteAttachmentsList());
		sqarResponse.setReturnCode(quoteDao.saveQuoteAttachment(saveQuoteAttachmentParams));
		
		return sqarResponse;
	}

	@Override
	public SaveQuoteAlopResponse saveQuoteAlop(SaveQuoteAlopRequest sqar) throws SQLException {
		SaveQuoteAlopResponse sqarResponse = new SaveQuoteAlopResponse();
		
		HashMap<String, Object> saveQuoteAlopParams = new HashMap<String, Object>();
		
		saveQuoteAlopParams.put("quoteId" , sqar.getQuoteId() );
		saveQuoteAlopParams.put("alopId" , sqar.getAlopId() );
		saveQuoteAlopParams.put("insuredId" , sqar.getInsuredId() );
		saveQuoteAlopParams.put("insuredDesc" , sqar.getInsuredDesc() );
		saveQuoteAlopParams.put("address" , sqar.getAddress() );
		saveQuoteAlopParams.put("insuredBusiness" , sqar.getInsuredBusiness() );
		saveQuoteAlopParams.put("annSi" , sqar.getAnnSi() );
		saveQuoteAlopParams.put("maxIndemPdSi" , sqar.getMaxIndemPdSi() );
		saveQuoteAlopParams.put("issueDate" , sqar.getIssueDate() );
		saveQuoteAlopParams.put("expiryDate" , sqar.getExpiryDate() );
		saveQuoteAlopParams.put("maxIndemPd" , sqar.getMaxIndemPd() );
		saveQuoteAlopParams.put("indemFromDate" , sqar.getIndemFromDate() );
		saveQuoteAlopParams.put("timeExc" , sqar.getTimeExc() );
		saveQuoteAlopParams.put("repInterval" , sqar.getRepInterval() );
		saveQuoteAlopParams.put("createUser" , sqar.getCreateUser() );
		saveQuoteAlopParams.put("createDate" , sqar.getCreateDate() );
		saveQuoteAlopParams.put("updateUser" , sqar.getUpdateUser() );
		saveQuoteAlopParams.put("updateDate" , sqar.getUpdateDate() );
		
		sqarResponse.setReturnCode(quoteDao.saveQuoteAlop(saveQuoteAlopParams));
		
		return sqarResponse;
	}

	@Override
	public SaveQuoteAlopItemResponse saveQuoteAlopItem(SaveQuoteAlopItemRequest sqair) throws SQLException {
		SaveQuoteAlopItemResponse sqairResponse = new SaveQuoteAlopItemResponse();
		
		HashMap<String, Object> saveQuoteAlopItemParams = new HashMap<String, Object>();
		saveQuoteAlopItemParams.put("quoteId" , sqair.getQuoteId() );
		saveQuoteAlopItemParams.put("alopId" , sqair.getAlopId() );
		saveQuoteAlopItemParams.put("saveAlopItemsList" , sqair.getSaveAlopItemList() );
		saveQuoteAlopItemParams.put("deleteAlopItemsList" , sqair.getDeleteAlopItemList() );
		
		sqairResponse.setReturnCode(quoteDao.saveQuoteAlopItem(saveQuoteAlopItemParams));
		
		return sqairResponse;
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

	public RetrieveQuoteAttachmentResponse retrieveQuoteAttachment(RetrieveQuoteAttachmentRequest rqat)
			throws SQLException {
		
		RetrieveQuoteAttachmentResponse rqatResponse = new RetrieveQuoteAttachmentResponse();
		
		HashMap<String, Object> retrieveQuoteAttachmentParams = new HashMap<String, Object>();
		retrieveQuoteAttachmentParams.put("quoteId", rqat.getQuoteId());
		retrieveQuoteAttachmentParams.put("quotationNo", rqat.getQuotationNo());
		
		rqatResponse.setQuotation(quoteDao.retrieveQuoteAttachmentList(retrieveQuoteAttachmentParams));
		
		logger.info("retrieveQuoteAttachmentResponse : " + rqatResponse.toString());
		
		return rqatResponse;
	}

	@Override
	public RetrieveQuoteAlopItemResponse retrieveQuoteAlopItem(RetrieveQuoteAlopItemRequest retQuoteAlopItem)
			throws SQLException {
		// TODO Auto-generated method stub
		
		RetrieveQuoteAlopItemResponse retQuoteAlopItemResponse = new RetrieveQuoteAlopItemResponse();
		
		HashMap<String, Object> retrieveQuoteAlopItemParams = new HashMap<String, Object>();
		retrieveQuoteAlopItemParams.put("quoteId", retQuoteAlopItem.getQuoteId());
		retrieveQuoteAlopItemParams.put("quotationNo", retQuoteAlopItem.getQuotationNo());
		
		retQuoteAlopItemResponse.setQuotation(quoteDao.retrieveAlopItemList(retrieveQuoteAlopItemParams));
		
		logger.info("retrieveQuoteAlopItemResponse : " + retQuoteAlopItemResponse.toString());
		return retQuoteAlopItemResponse;
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
		
		rqcorResponse.setQuotationOc(quoteDao.retrieveQuoteCoverageOc(retrieveQuoteCoverageOcParams));
		rqcorResponse.getPaginationResponse().setPosition(rqcor.getPaginationRequest().getPosition());
		rqcorResponse.getPaginationResponse().setCount(rqcor.getPaginationRequest().getCount());
		rqcorResponse.getSortResponse().setSortKey(rqcor.getSortRequest().getSortKey());
		rqcorResponse.getSortResponse().setOrder(rqcor.getSortRequest().getOrder());
		
		logger.info("retrieveQuoteCoverageOcResponse : " + rqcorResponse.toString());
		
		return rqcorResponse;
	}

	@Override
	public RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException {
		
		RetrieveQuoteAlopResponse rqaResponse = new RetrieveQuoteAlopResponse();
		
		HashMap<String, Object> retrieveQuoteAlopParams = new HashMap<String, Object>();
		retrieveQuoteAlopParams.put("quoteId",rqap.getQuoteId() );
		retrieveQuoteAlopParams.put("quotationNo", rqap.getQuotationNo() );
		
		rqaResponse.setQuotation(quoteDao.retrieveQuoteAlop(retrieveQuoteAlopParams));

		
		logger.info("retrieveQuoteAlopResponse : " + rqaResponse.toString());
		
		return rqaResponse;
	}

	@Override
	public SaveQuoteCoverageResponse saveQuoteCoverage(SaveQuoteCoverageRequest saveQuoteCoverage) throws SQLException {
		SaveQuoteCoverageResponse sqaResponse = new SaveQuoteCoverageResponse();
		
		HashMap<String, Object> saveQuoteCoverageParams = new HashMap<String, Object>();
		saveQuoteCoverageParams.put("quoteId", saveQuoteCoverage.getQuoteId());
		saveQuoteCoverageParams.put("projId", saveQuoteCoverage.getProjId());
		saveQuoteCoverageParams.put("riskId", saveQuoteCoverage.getRiskId());
		saveQuoteCoverageParams.put("sectionISi", saveQuoteCoverage.getSectionISi());
		saveQuoteCoverageParams.put("sectionIISi", saveQuoteCoverage.getSectionIISi());
		saveQuoteCoverageParams.put("sectionIIISi", saveQuoteCoverage.getSectionIIISi());
		saveQuoteCoverageParams.put("totalSi", saveQuoteCoverage.getTotalSi());
		saveQuoteCoverageParams.put("currencyCd", saveQuoteCoverage.getCurrencyCd());
		saveQuoteCoverageParams.put("currencyRt", saveQuoteCoverage.getCurrencyRt());
		saveQuoteCoverageParams.put("remarks", saveQuoteCoverage.getRemarks());
		saveQuoteCoverageParams.put("createUser", saveQuoteCoverage.getCreateUser());
		saveQuoteCoverageParams.put("createDate", saveQuoteCoverage.getCreateDate());
		saveQuoteCoverageParams.put("updateUser", saveQuoteCoverage.getUpdateUser());
		saveQuoteCoverageParams.put("updateDate", saveQuoteCoverage.getUpdateDate());
		saveQuoteCoverageParams.put("saveSectionCovers", saveQuoteCoverage.getSaveSectionCovers());
		saveQuoteCoverageParams.put("deleteSectionCovers", saveQuoteCoverage.getDeleteSectionCovers());
		
		sqaResponse.setReturnCode(quoteDao.saveQuoteCoverage(saveQuoteCoverageParams));
		
		return sqaResponse;
	}

	@Override
	public SaveQuoteCoverageOcResponse saveQuoteCoverageOc(SaveQuoteCoverageOcRequest saveQuoteCoverageOc)
			throws SQLException {
		SaveQuoteCoverageOcResponse sqcocResponse = new SaveQuoteCoverageOcResponse();
		
		HashMap<String, Object> saveQuoteCoverageOcParams = new HashMap<String, Object>();
		saveQuoteCoverageOcParams.put("quoteIdOc", saveQuoteCoverageOc.getQuoteIdOc());
		saveQuoteCoverageOcParams.put("projId", saveQuoteCoverageOc.getProjId());
		saveQuoteCoverageOcParams.put("riskId", saveQuoteCoverageOc.getRiskId());
		saveQuoteCoverageOcParams.put("maxSi", saveQuoteCoverageOc.getMaxSi());
		saveQuoteCoverageOcParams.put("currencyCd", saveQuoteCoverageOc.getCurrencyCd());
		saveQuoteCoverageOcParams.put("currencyRt", saveQuoteCoverageOc.getCurrencyRt());
		saveQuoteCoverageOcParams.put("pctShare", saveQuoteCoverageOc.getPctShare());
		saveQuoteCoverageOcParams.put("pctPml", saveQuoteCoverageOc.getPctPml());
		saveQuoteCoverageOcParams.put("totalValue", saveQuoteCoverageOc.getTotalValue());
		saveQuoteCoverageOcParams.put("createUser", saveQuoteCoverageOc.getCreateUser());
		saveQuoteCoverageOcParams.put("createDate", saveQuoteCoverageOc.getCreateDate());
		saveQuoteCoverageOcParams.put("updateUser", saveQuoteCoverageOc.getUpdateUser());
		saveQuoteCoverageOcParams.put("updateDate", saveQuoteCoverageOc.getUpdateDate());
		
		sqcocResponse.setReturnCode(quoteDao.saveQuoteCoverageOc(saveQuoteCoverageOcParams));
		
		return sqcocResponse;
	}
	
	@Override
	public SaveQuoteAttachmentOcResponse saveQuoteAttachmentOc(SaveQuoteAttachmentOcRequest sqaor) throws SQLException {
		SaveQuoteAttachmentOcResponse sqaorResponse = new SaveQuoteAttachmentOcResponse();
		
		HashMap<String, Object> saveQuoteAttachmentOcParams = new HashMap<String, Object>();
		saveQuoteAttachmentOcParams.put("quoteIdOc", sqaor.getQuoteIdOc());
		saveQuoteAttachmentOcParams.put("saveAttachmentsOcList", sqaor.getSaveAttachmentsOcList());
		saveQuoteAttachmentOcParams.put("deleteAttachmentsOcList", sqaor.getDeleteAttachmentsOcList());
		
		sqaorResponse.setReturnCode(quoteDao.saveQuoteAttachmentOc(saveQuoteAttachmentOcParams));
		
		return sqaorResponse;
	}
	
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
		retrieveQuoteEndorsementsParams.put("optionId", rqerp.getOptionId());
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
	
	@Override
	public SaveQuoteCompetitionResponse saveQuoteCompetition(SaveQuoteCompetitionRequest sqcr) throws SQLException{
		SaveQuoteCompetitionResponse sqcrResponse = new SaveQuoteCompetitionResponse();
		
		HashMap<String, Object> saveQuoteCompetitionParams = new HashMap<String, Object>();
		saveQuoteCompetitionParams.put("quoteId", sqcr.getQuoteId());
		saveQuoteCompetitionParams.put("adviceNo", sqcr.getAdviceNo());
		saveQuoteCompetitionParams.put("cedingId", sqcr.getCedingId());
		saveQuoteCompetitionParams.put("cedingRepId", sqcr.getCedingRepId());
		saveQuoteCompetitionParams.put("option", sqcr.getOption());
		saveQuoteCompetitionParams.put("wordings", sqcr.getWordings());
		saveQuoteCompetitionParams.put("createUser", sqcr.getCreateUser());
		saveQuoteCompetitionParams.put("createDate", sqcr.getCreateDate());
		saveQuoteCompetitionParams.put("updateUser", sqcr.getUpdateUser());
		saveQuoteCompetitionParams.put("updateDate", sqcr.getUpdateDate());
		sqcrResponse.setReturnCode(quoteDao.saveQuoteCompetition(saveQuoteCompetitionParams));
		
		return sqcrResponse;
	}

	@Override
	public SaveQuoteGeneralInfoResponse saveQuoteGeneralInfo(SaveQuoteGeneralInfoRequest sqgip) throws SQLException {
		SaveQuoteGeneralInfoResponse sqgiResponse = new SaveQuoteGeneralInfoResponse();
		
		HashMap<String, Object> saveQuoteGeneralInfoParams = new HashMap<String, Object>();
		
		saveQuoteGeneralInfoParams.put("quoteId", sqgip.getQuoteId());
		saveQuoteGeneralInfoParams.put("lineCd", sqgip.getLineCd());
		saveQuoteGeneralInfoParams.put("quoteYear", sqgip.getQuoteYear());
		saveQuoteGeneralInfoParams.put("quoteSeqNo", sqgip.getQuoteSeqNo());
		saveQuoteGeneralInfoParams.put("quoteRevNo", sqgip.getQuoteRevNo());
		saveQuoteGeneralInfoParams.put("cedingId", sqgip.getCedingId());
		saveQuoteGeneralInfoParams.put("cessionId", sqgip.getCessionId());
		saveQuoteGeneralInfoParams.put("lineClassCd", sqgip.getLineClassCd());
		saveQuoteGeneralInfoParams.put("prinId", sqgip.getPrinId());
		saveQuoteGeneralInfoParams.put("contractorId", sqgip.getContractorId());
		saveQuoteGeneralInfoParams.put("insuredDesc", sqgip.getInsuredDesc());
		saveQuoteGeneralInfoParams.put("policyId", sqgip.getPolicyId());
		saveQuoteGeneralInfoParams.put("status", sqgip.getStatus());
		saveQuoteGeneralInfoParams.put("reinsurerId", sqgip.getReinsurerId());
		saveQuoteGeneralInfoParams.put("intmId", sqgip.getIntmId());
		saveQuoteGeneralInfoParams.put("issueDate", sqgip.getIssueDate());
		saveQuoteGeneralInfoParams.put("expiryDate", sqgip.getExpiryDate());
		saveQuoteGeneralInfoParams.put("reqBy", sqgip.getReqBy());
		saveQuoteGeneralInfoParams.put("reqDate", sqgip.getReqDate());
		saveQuoteGeneralInfoParams.put("reqMode", sqgip.getReqMode());
		saveQuoteGeneralInfoParams.put("mbiRefNo", sqgip.getMbiRefNo());
		saveQuoteGeneralInfoParams.put("currencyCd", sqgip.getCurrencyCd());
		saveQuoteGeneralInfoParams.put("currencyRt", sqgip.getCurrencyRt());
		saveQuoteGeneralInfoParams.put("govtTag", sqgip.getGovtTag());
		saveQuoteGeneralInfoParams.put("indicativeTag", sqgip.getIndicativeTag());
		saveQuoteGeneralInfoParams.put("openCoverTag", sqgip.getOpenCoverTag());
		saveQuoteGeneralInfoParams.put("declarationTag", sqgip.getDeclarationTag());
		saveQuoteGeneralInfoParams.put("preparedBy", sqgip.getPreparedBy());
		saveQuoteGeneralInfoParams.put("approvedBy", sqgip.getApprovedBy());
		saveQuoteGeneralInfoParams.put("printedBy", sqgip.getPrintedBy());
		saveQuoteGeneralInfoParams.put("printDate", sqgip.getPrintDate());
		saveQuoteGeneralInfoParams.put("openingParag", sqgip.getOpeningParag());
		saveQuoteGeneralInfoParams.put("closingParag", sqgip.getClosingParag());
		saveQuoteGeneralInfoParams.put("createUser", sqgip.getCreateUser());
		saveQuoteGeneralInfoParams.put("createDate", sqgip.getCreateDate());
		saveQuoteGeneralInfoParams.put("updateUser", sqgip.getUpdateUser());
		saveQuoteGeneralInfoParams.put("updateDate", sqgip.getUpdateDate());
		saveQuoteGeneralInfoParams.put("projId", sqgip.getProjId());
		saveQuoteGeneralInfoParams.put("projDesc", sqgip.getProjDesc());
		saveQuoteGeneralInfoParams.put("riskId", sqgip.getRiskId());
		saveQuoteGeneralInfoParams.put("totalSi", sqgip.getTotalSi());
		saveQuoteGeneralInfoParams.put("pctShare", sqgip.getPctShare());
		saveQuoteGeneralInfoParams.put("totalValue", sqgip.getTotalValue());
		saveQuoteGeneralInfoParams.put("objectId", sqgip.getObjectId());
		saveQuoteGeneralInfoParams.put("site", sqgip.getSite());
		saveQuoteGeneralInfoParams.put("duration", sqgip.getDuration());
		saveQuoteGeneralInfoParams.put("testing", sqgip.getTesting());
		saveQuoteGeneralInfoParams.put("ipl", sqgip.getIpl());
		saveQuoteGeneralInfoParams.put("timeExc", sqgip.getTimeExc());
		saveQuoteGeneralInfoParams.put("noClaimPd", sqgip.getNoClaimPd());
		saveQuoteGeneralInfoParams.put("prjCreateUser", sqgip.getPrjCreateUser());
		saveQuoteGeneralInfoParams.put("prjCreateDate", sqgip.getPrjCreateDate());
		saveQuoteGeneralInfoParams.put("prjUpdateUser", sqgip.getPrjUpdateUser());
		saveQuoteGeneralInfoParams.put("prjUpdateDate", sqgip.getPrjUpdateDate());	
		
		sqgiResponse.setReturnCode(quoteDao.saveQuoteGeneralInfo(saveQuoteGeneralInfoParams));
		
		return sqgiResponse;
	}

	@Override
	public SaveQuoteHoldCoverResponse saveQuoteHoldCover(SaveQuoteHoldCoverRequest sqhcr) throws SQLException {
		SaveQuoteHoldCoverResponse sqhcrResponse = new SaveQuoteHoldCoverResponse();	
		HashMap<String, Object> saveQuoteHoldCoverParams = new HashMap<String, Object>();
		saveQuoteHoldCoverParams.put("quoteId" , sqhcr.getQuoteId() );
		saveQuoteHoldCoverParams.put("holdCoverId", sqhcr.getHoldCoverId());
		saveQuoteHoldCoverParams.put("lineCd", sqhcr.getLineCd());
		saveQuoteHoldCoverParams.put("holdCoverYear", sqhcr.getHoldCoverYear());
		saveQuoteHoldCoverParams.put("holdCoverSeqNo", sqhcr.getHoldCoverSeqNo());
		saveQuoteHoldCoverParams.put("holdCoverRevNo", sqhcr.getHoldCoverRevNo());
		saveQuoteHoldCoverParams.put("periodFrom", sqhcr.getPeriodFrom());
		saveQuoteHoldCoverParams.put("periodTo", sqhcr.getPeriodTo());
		saveQuoteHoldCoverParams.put("compRefHoldCovNo", sqhcr.getCompRefHoldCovNo());
		saveQuoteHoldCoverParams.put("status", sqhcr.getStatus());
		saveQuoteHoldCoverParams.put("reqBy", sqhcr.getReqBy());
		saveQuoteHoldCoverParams.put("reqDate", sqhcr.getReqDate());
		saveQuoteHoldCoverParams.put("preparedBy", sqhcr.getPreparedBy());
		saveQuoteHoldCoverParams.put("approvedBy", sqhcr.getApprovedBy());
		saveQuoteHoldCoverParams.put("createUser", sqhcr.getCreateUser());
		saveQuoteHoldCoverParams.put("createDate", sqhcr.getCreateDate());
		saveQuoteHoldCoverParams.put("updateUser", sqhcr.getUpdateUser());
		saveQuoteHoldCoverParams.put("updateDate", sqhcr.getUpdateDate());
		sqhcrResponse.setReturnCode(quoteDao.saveQuoteHoldCover(saveQuoteHoldCoverParams));
		
		return sqhcrResponse;
	}

}
