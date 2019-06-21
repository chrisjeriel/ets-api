package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.ClaimsDao;
import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.request.RetrieveChangeClaimStatusRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimApprovedAmtRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimHistoryRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimListingRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimReserveRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimSecCoverRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimsAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrieveClmGenInfoRequest;
import ph.cpi.rest.api.model.request.SaveClaimApprovedAmtRequest;
import ph.cpi.rest.api.model.request.SaveClaimHistoryRequest;
import ph.cpi.rest.api.model.request.SaveClaimSecCoverRequest;
import ph.cpi.rest.api.model.request.SaveClaimsAttachmentRequest;
import ph.cpi.rest.api.model.response.RetrieveChangeClaimStatusResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimApprovedAmtResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimHistoryResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimListingResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimReserveResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimSecCoverResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimsAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrieveClmGenInfoResponse;
import ph.cpi.rest.api.model.response.SaveClaimApprovedAmtResponse;
import ph.cpi.rest.api.model.response.SaveClaimHistoryResponse;
import ph.cpi.rest.api.model.response.SaveClaimSecCoverResponse;
import ph.cpi.rest.api.model.response.SaveClaimsAttachmentResponse;
import ph.cpi.rest.api.service.ClaimsService;

@Component
public class ClaimsServiceImpl implements ClaimsService {
	
	@Autowired
	ClaimsDao claimsDao;
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteServiceImpl.class);

	@Override
	public RetrieveClaimHistoryResponse retrieveClaimHistory(RetrieveClaimHistoryRequest rchp) throws SQLException {
		RetrieveClaimHistoryResponse rchResponse = new RetrieveClaimHistoryResponse();
		HashMap<String, Object> retClmHistoryParams = new HashMap<String, Object>();
		retClmHistoryParams.put("claimId", rchp.getClaimId());
		retClmHistoryParams.put("claimNo", rchp.getClaimNo());
		rchResponse.setClaimReserveList(claimsDao.retrieveClaimHistory(retClmHistoryParams));
		logger.info("RetrieveClaimHistoryResponse : " + rchResponse.toString());
		return rchResponse;
	}

	@Override
	public SaveClaimHistoryResponse saveClaimHistory(SaveClaimHistoryRequest schr) throws SQLException {
		SaveClaimHistoryResponse schResponse = new SaveClaimHistoryResponse();
		HashMap<String, Object> saveClmHistoryParams = new HashMap<String, Object>();
		saveClmHistoryParams.put("saveClaimHistory",schr.getSaveClaimHistory());
		schResponse.setReturnCode(claimsDao.saveClaimHistory(saveClmHistoryParams));
		logger.info("SaveClaimHistoryResponse : " + schResponse.toString());
		return schResponse;
	}

	@Override
	public RetrieveClaimListingResponse retrieveClaimListing(RetrieveClaimListingRequest rclr) throws SQLException {
		RetrieveClaimListingResponse response = new RetrieveClaimListingResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("claimNo", rclr.getClaimNo());
		params.put("cedingName", rclr.getCedingName());
		params.put("clmStatus", rclr.getClmStatus());
		params.put("policyNo", rclr.getPolicyNo());
		params.put("insuredDesc", rclr.getInsuredDesc());
		params.put("riskName", rclr.getRiskName());
		params.put("lossDateFrom", rclr.getLossDateFrom());
		params.put("lossDateTo", rclr.getLossDateTo());
		params.put("currencyCd", rclr.getCurrencyCd());
		params.put("processedBy", rclr.getProcessedBy());
		response.setClaimsList(claimsDao.retrieveClaimListing(params));
		return response;
	}

	@Override
	public RetrieveClmGenInfoResponse retrieveClmGenInfo(RetrieveClmGenInfoRequest rcgir) throws SQLException {
		RetrieveClmGenInfoResponse rcgiResponse = new RetrieveClmGenInfoResponse();
		HashMap<String, Object> retrieveClmGenInfoParams = new HashMap<String, Object>();
		
		retrieveClmGenInfoParams.put("claimId", rcgir.getClaimId());
		retrieveClmGenInfoParams.put("claimNo", rcgir.getClaimNo());
		
		rcgiResponse.setClaim(claimsDao.retrieveClmGenInfo(retrieveClmGenInfoParams));
		
		return rcgiResponse;
	}
	
	@Override
	public RetrieveClaimSecCoverResponse retrieveClaimSecCover(RetrieveClaimSecCoverRequest rcsr) throws SQLException {
		RetrieveClaimSecCoverResponse response = new RetrieveClaimSecCoverResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("claimId", rcsr.getClaimId());
		params.put("claimNo", rcsr.getClaimNo());
		response.setClaims(claimsDao.retrieveClaimSecCover(params));
		return response;
	}

	@Override
	public SaveClaimSecCoverResponse saveClaimSecCover(SaveClaimSecCoverRequest scsr) throws SQLException {
		SaveClaimSecCoverResponse response = new SaveClaimSecCoverResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("claimId",scsr.getClaimId());
			params.put("projId",scsr.getProjId());
			params.put("riskId",scsr.getRiskId());
			params.put("sectionISi",scsr.getSectionISi());
			params.put("sectionIISi",scsr.getSectionIISi());
			params.put("sectionIIISi",scsr.getSectionIIISi());
			params.put("totalSi",scsr.getTotalSi());
			params.put("secISiTag",scsr.getSecISiTag());
			params.put("secIISiTag",scsr.getSecIISiTag());
			params.put("secIIISiTag",scsr.getSecIIISiTag());
			params.put("allowMaxSi",scsr.getAllowMaxSi());
			params.put("sectionIPrem",scsr.getSectionIPrem());
			params.put("sectionIIPrem",scsr.getSectionIIPrem());
			params.put("sectionIIIPrem",scsr.getSectionIIIPrem());
			params.put("totalPrem",scsr.getTotalPrem());
			params.put("currencyCd",scsr.getCurrencyCd());
			params.put("currencyRt",scsr.getCurrencyRt());
			params.put("pctShare",scsr.getPctShare());
			params.put("pctPml",scsr.getPctPml());
			params.put("totalValue",scsr.getTotalValue());
			params.put("createUser",scsr.getCreateUser());
			params.put("createDate",scsr.getCreateDate());
			params.put("updateUser",scsr.getUpdateUser());
			params.put("updateDate",scsr.getUpdateDate());
			
			HashMap<String, Object> res = claimsDao.saveClaimSecCover(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch (Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveClaimsAttachmentResponse retrieveClaimsAttachment(RetrieveClaimsAttachmentRequest rcar)
			throws SQLException {
		// TODO Auto-generated method stub
		RetrieveClaimsAttachmentResponse rcaResponse = new RetrieveClaimsAttachmentResponse();
		HashMap<String, Object> retrieveClaimsAttachmentParams = new HashMap<String, Object>();
		retrieveClaimsAttachmentParams.put("claimId",rcar.getClaimId());
		retrieveClaimsAttachmentParams.put("claimNo", rcar.getClaimNo());
		rcaResponse.setClaimsAttachmentList(claimsDao.retrieveClaimsAttachmentList(retrieveClaimsAttachmentParams));
		logger.info("retrieveClaimsAttachmentResponse : " + rcaResponse.toString());
		return rcaResponse;
	}

	@Override
	public SaveClaimsAttachmentResponse saveClaimAttachment(SaveClaimsAttachmentRequest scar) throws SQLException {
		// TODO Auto-generated method stub
		SaveClaimsAttachmentResponse scaResponse = new SaveClaimsAttachmentResponse();
		try{
			HashMap<String, Object> saveClmAttachmentParams = new HashMap<String, Object>();
			saveClmAttachmentParams.put("claimId", scar.getClaimId());
			saveClmAttachmentParams.put("saveClmAttachments", scar.getSaveClaimsAttachments());
			saveClmAttachmentParams.put("deleteClmAttachments", scar.getDeleteClaimsAttachments());
			
			HashMap<String, Object> res = claimsDao.saveClaimsAttachment(saveClmAttachmentParams);
			scaResponse.setReturnCode((Integer) res.get("errorCode"));
			scaResponse.setUploadDate((String) res.get("uploadDate"));
			logger.info("retrieveClaimsAttachmentResponse : " + scaResponse.toString());
		}catch (SQLException ex) {
			scaResponse.setReturnCode(0);
			scaResponse.getErrorList().add(new Error("SQLException","Please check the field values. Error Stack: " + System.lineSeparator() + ex.getCause()));
			ex.printStackTrace();
		}catch (Exception ex) {
			scaResponse.setReturnCode(0);
			scaResponse.getErrorList().add(new Error("General Exception","Error stack: " + System.lineSeparator() + ex.getCause()));
			ex.printStackTrace();
		}
		return scaResponse;
	}

	@Override
	public RetrieveChangeClaimStatusResponse retrieveChangeClmStatus(RetrieveChangeClaimStatusRequest rccsr)
			throws SQLException {
		RetrieveChangeClaimStatusResponse response = new RetrieveChangeClaimStatusResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("claimId", rccsr.getClaimId());
		params.put("policyId", rccsr.getPolicyId());
		params.put("cessionId", rccsr.getCessionId());
		params.put("cedingId", rccsr.getCedingId());
		params.put("riskId", rccsr.getRiskId());
		response.setClaimList(claimsDao.retrieveChangeClmStatus(params));
		return response;
	}

	@Override
	public RetrieveClaimApprovedAmtResponse retrieveClaimApprovedAmt(RetrieveClaimApprovedAmtRequest rcaap)
			throws SQLException {
		RetrieveClaimApprovedAmtResponse rcaaResponse = new RetrieveClaimApprovedAmtResponse();
		HashMap<String, Object> clmApprovedAmtParams = new HashMap<String, Object>();
		clmApprovedAmtParams.put("claimId",rcaap.getClaimId());
		clmApprovedAmtParams.put("histNo",rcaap.getHistNo());
		rcaaResponse.setClaimApprovedAmtList(claimsDao.retrieveClaimApprovedAmt(clmApprovedAmtParams));
		logger.info("RetrieveClaimApprovedAmtResponse : " + rcaaResponse.toString());
		return rcaaResponse;
	}

	@Override
	public SaveClaimApprovedAmtResponse saveClaimApprovedAmt(SaveClaimApprovedAmtRequest scaar) throws SQLException {
		SaveClaimApprovedAmtResponse scaaResponse = new SaveClaimApprovedAmtResponse();
		HashMap<String, Object> saveClmApprovedAmtParams = new HashMap<String, Object>();
		saveClmApprovedAmtParams.put("saveClaimApprovedAmt", scaar.getSaveClaimApprovedAmt());
		scaaResponse.setReturnCode(claimsDao.saveClaimApprovedAmt(saveClmApprovedAmtParams));
		logger.info("SaveClaimApprovedAmtResponse : " + scaaResponse.toString());
		return scaaResponse;
	}

	@Override
	public RetrieveClaimReserveResponse retrieveClaimReserve(RetrieveClaimReserveRequest rchp) throws SQLException {
		RetrieveClaimReserveResponse rcrResponse = new RetrieveClaimReserveResponse();
		HashMap<String, Object> retClmReserveParams = new HashMap<String, Object>();
		retClmReserveParams.put("claimId", rchp.getClaimId());
		retClmReserveParams.put("claimNo", rchp.getClaimNo());
		rcrResponse.setClaims(claimsDao.retrieveClaimReserve(retClmReserveParams));
		logger.info("RetrieveClaimReserveResponse : " + rcrResponse.toString());
		return rcrResponse;
	}
}
