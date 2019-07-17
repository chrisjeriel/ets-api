package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.ClaimsDao;
import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.request.RedistributeClaimDistRequest;
import ph.cpi.rest.api.model.request.RetrieveChangeClaimStatusRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimApprovedAmtRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimHistoryRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimListingRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimReserveRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimSecCoverRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimsAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrieveClmDistPoolRequest;
import ph.cpi.rest.api.model.request.RetrieveClmDistRequest;
import ph.cpi.rest.api.model.request.RetrieveClmGenInfoRequest;
import ph.cpi.rest.api.model.request.RetrieveClmPaytReqRequest;
import ph.cpi.rest.api.model.request.SaveClaimApprovedAmtRequest;
import ph.cpi.rest.api.model.request.SaveClaimHistoryRequest;
import ph.cpi.rest.api.model.request.SaveClaimPaytReqRequest;
import ph.cpi.rest.api.model.request.SaveClaimResStatRequest;
import ph.cpi.rest.api.model.request.SaveClaimReserveRequest;
import ph.cpi.rest.api.model.request.SaveClaimSecCoverRequest;
import ph.cpi.rest.api.model.request.SaveClaimsAttachmentRequest;
import ph.cpi.rest.api.model.request.SaveClmAdjusterRequest;
import ph.cpi.rest.api.model.request.SaveClmGenInfoRequest;
import ph.cpi.rest.api.model.request.UpdateClaimStatusRequest;
import ph.cpi.rest.api.model.request.UpdateClmDetailsRequest;
import ph.cpi.rest.api.model.response.RedistributeClaimDistResponse;
import ph.cpi.rest.api.model.response.RetrieveChangeClaimStatusResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimApprovedAmtResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimHistoryResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimListingResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimReserveResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimSecCoverResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimsAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrieveClmDistPoolResponse;
import ph.cpi.rest.api.model.response.RetrieveClmDistResponse;
import ph.cpi.rest.api.model.response.RetrieveClmGenInfoResponse;
import ph.cpi.rest.api.model.response.RetrieveClmPaytReqResponse;
import ph.cpi.rest.api.model.response.SaveClaimApprovedAmtResponse;
import ph.cpi.rest.api.model.response.SaveClaimHistoryResponse;
import ph.cpi.rest.api.model.response.SaveClaimPaytReqResponse;
import ph.cpi.rest.api.model.response.SaveClaimResStatResponse;
import ph.cpi.rest.api.model.response.SaveClaimReserveResponse;
import ph.cpi.rest.api.model.response.SaveClaimSecCoverResponse;
import ph.cpi.rest.api.model.response.SaveClaimsAttachmentResponse;
import ph.cpi.rest.api.model.response.SaveClmAdjusterResponse;
import ph.cpi.rest.api.model.response.SaveClmGenInfoResponse;
import ph.cpi.rest.api.model.response.UpdateClaimStatusResponse;
import ph.cpi.rest.api.model.response.UpdateClmDetailsResponse;
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
		retClmHistoryParams.put("projId", rchp.getProjId());
		retClmHistoryParams.put("histNo", rchp.getHistNo());
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
		params.put("totalResFrom", rclr.getTotalResFrom());
		params.put("totalResTo", rclr.getTotalResTo());
		params.put("totalPaytFrom", rclr.getTotalPaytFrom());
		params.put("totalPaytTo", rclr.getTotalPaytTo());
		params.put("adjName", rclr.getAdjName());
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
		params.put("claimNo", rccsr.getClaimNo());
		params.put("policyId", rccsr.getPolicyId());
		params.put("policyNo", rccsr.getPolicyNo());
		params.put("cessionId", rccsr.getCessionId());
		params.put("cedingId", rccsr.getCedingId());
		params.put("riskId", rccsr.getRiskId());
		params.put("batchOpt", rccsr.getBatchOpt());
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

	@Override
	public UpdateClaimStatusResponse updateClaimStatus(UpdateClaimStatusRequest ucsr) throws SQLException {
		UpdateClaimStatusResponse response = new UpdateClaimStatusResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("updateClaim", ucsr.getUpdateClaim());
		try{
			response.setReturnCode(claimsDao.updateClaimStatus(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public SaveClmAdjusterResponse saveClmAdjuster(SaveClmAdjusterRequest scar) throws SQLException {
		SaveClmAdjusterResponse scaResponse = new SaveClmAdjusterResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveAdjuster", scar.getSaveAdjuster());
		params.put("deleteAdjuster", scar.getDeleteAdjuster());
		
		scaResponse.setReturnCode(claimsDao.saveClmAdjuster(params));
		
		return scaResponse;
	}

	@Override
	public SaveClmGenInfoResponse saveClmGenInfo(SaveClmGenInfoRequest scgir) throws SQLException {
		SaveClmGenInfoResponse scgiResponse = new SaveClmGenInfoResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("claimNo", "");
		params.put("refPolId", scgir.getRefPolId());
		params.put("claimId", scgir.getClaimId());
		params.put("lineCd", scgir.getLineCd());
		params.put("polYear", scgir.getPolYear());
		params.put("polSeqNo", scgir.getPolSeqNo());
		params.put("cedingId", scgir.getCedingId());
		params.put("coSeriesNo", scgir.getCoSeriesNo());
		params.put("altNo", scgir.getAltNo());
		params.put("clmYear", scgir.getClmYear());
		params.put("clmSeqNo", scgir.getClmSeqNo());
		params.put("clmStatCd", scgir.getClmStatCd());
		params.put("cessionId", scgir.getCessionId());
		params.put("lineClassCd", scgir.getLineClassCd());
		params.put("coRefNo", scgir.getCoRefNo());
		params.put("reinsurerId", scgir.getReinsurerId());
		params.put("riBinderNo", scgir.getRiBinderNo());
		params.put("mbiRefNo", scgir.getMbiRefNo());
		params.put("inceptDate", scgir.getInceptDate());
		params.put("expiryDate", scgir.getExpiryDate());
		params.put("reasonCd", scgir.getReasonCd());
		params.put("coClmNo", scgir.getCoClmNo());
		params.put("lossDate", scgir.getLossDate());
		params.put("lossCd", scgir.getLossCd());
		params.put("lossPeriod", scgir.getLossPeriod());
		params.put("lossDtl", scgir.getLossDtl());
		params.put("eventTypeCd", scgir.getEventTypeCd());
		params.put("eventCd", scgir.getEventCd());
		params.put("reportDate", scgir.getReportDate());
		params.put("reportedBy", scgir.getReportedBy());
		params.put("processedBy", scgir.getProcessedBy());
		params.put("oldStatCd", scgir.getOldStatCd());
		params.put("closeDate", scgir.getCloseDate());
		params.put("refreshSw", scgir.getRefreshSw());
		params.put("lapseFrom", scgir.getLapseFrom());
		params.put("lapseTo", scgir.getLapseTo());
		params.put("maintenanceFrom", scgir.getMaintenanceFrom());
		params.put("maintenanceTo", scgir.getMaintenanceTo());
		params.put("createUser", scgir.getCreateUser());
		params.put("createDate", scgir.getCreateDate());
		params.put("updateUser", scgir.getUpdateUser());
		params.put("updateDate", scgir.getUpdateDate());
		params.put("projId", scgir.getProjId());
		params.put("projDesc", scgir.getProjDesc());
		params.put("riskId", scgir.getRiskId());
		params.put("regionCd", scgir.getRegionCd());
		params.put("provinceCd", scgir.getProvinceCd());
		params.put("cityCd", scgir.getCityCd());
		params.put("districtCd", scgir.getDistrictCd());
		params.put("blockCd", scgir.getBlockCd());
		params.put("latitude", scgir.getLatitude());
		params.put("longitude", scgir.getLongitude());
		params.put("objectId", scgir.getObjectId());
		params.put("site", scgir.getSite());
		params.put("duration", scgir.getDuration());
		params.put("testing", scgir.getTesting());
		params.put("ipl", scgir.getIpl());
		params.put("timeExc", scgir.getTimeExc());
		params.put("noClaimPd", scgir.getNoClaimPd());
		params.put("prjCreateUser", scgir.getPrjCreateUser());
		params.put("prjCreateDate", scgir.getPrjCreateDate());
		params.put("prjUpdateUser", scgir.getPrjUpdateUser());
		params.put("prjUpdateDate", scgir.getPrjUpdateDate());
		
		try {
			HashMap<String, Object> res = claimsDao.saveClmGenInfo(params);
			
			scgiResponse.setReturnCode((Integer) res.get("errorCode"));
			scgiResponse.setClaimId((Integer) res.get("claimId"));
			scgiResponse.setClaimNo((String) res.get("claimNo"));
		} catch (Exception e) {
			scgiResponse.setReturnCode(0);
			scgiResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			e.printStackTrace();
		}
		
		return scgiResponse;
	}
	
	@Override
	public SaveClaimResStatResponse saveClaimResStat(SaveClaimResStatRequest scrsr) throws SQLException {
		SaveClaimResStatResponse scrsResponse = new SaveClaimResStatResponse();
		HashMap<String, Object> scrsParams = new HashMap<String, Object>();
		try {
			scrsParams.put("claimId", scrsr.getClaimId());
			scrsParams.put("projId", scrsr.getProjId());
			scrsParams.put("lossStatCd", scrsr.getLossStatCd());
			scrsParams.put("expStatCd", scrsr.getExpStatCd());
			scrsParams.put("updateUser", scrsr.getUpdateUser());
			
			HashMap<String, Object> response = claimsDao.saveClaimResStat(scrsParams);
			
			scrsResponse.setReturnCode((Integer) response.get("errorCode"));
			logger.info("SaveClaimResStatResponse : " + scrsResponse.toString());
		}catch (SQLException ex) {
			scrsResponse.setReturnCode(0);
			scrsResponse.getErrorList().add(new Error("SQLException","Please check the field values. Error Stack: " + System.lineSeparator() + ex.getCause()));
			ex.printStackTrace();
		}catch (Exception ex) {
			scrsResponse.setReturnCode(0);
			scrsResponse.getErrorList().add(new Error("General Exception","Error stack: " + System.lineSeparator() + ex.getCause()));
			ex.printStackTrace();
		}
		return scrsResponse;
	}

	@Override
	public UpdateClmDetailsResponse updateClmDetails(UpdateClmDetailsRequest ucdr) throws SQLException {
		UpdateClmDetailsResponse ucdResponse = new UpdateClmDetailsResponse();
		HashMap<String, Object> ucdParams = new HashMap<String, Object>();
		
		ucdParams.put("claimId", ucdr.getClaimId());
		ucdParams.put("refPolId", ucdr.getRefPolId());
		ucdParams.put("createUser", ucdr.getCreateUser());
		ucdParams.put("createDate", ucdr.getCreateDate());
		ucdParams.put("updateUser", ucdr.getUpdateUser());
		ucdParams.put("updateDate", ucdr.getUpdateDate());
		
		try {
			ucdResponse.setReturnCode(claimsDao.updateClmDetails(ucdParams));
		} catch (Exception e) {
			ucdResponse.setReturnCode(0);
			ucdResponse.getErrorList().add(new Error("General Exception","Error stack: " + System.lineSeparator() + e.getCause()));
			e.printStackTrace();
		}
		
		return ucdResponse;
	}

	@Override
	public RetrieveClmPaytReqResponse retrieveClmPaytReq(RetrieveClmPaytReqRequest rcprr) throws SQLException {
		RetrieveClmPaytReqResponse rcprResponse = new RetrieveClmPaytReqResponse();
		HashMap<String, Object> rcprParams = new HashMap<String, Object>();
		
		rcprParams.put("claimId", rcprr.getClaimId());
		rcprParams.put("paytReqNo", rcprr.getPaytReqNo());
		
		rcprResponse.setPaytReqList(claimsDao.retrieveClmPaytReq(rcprParams));
		
		return rcprResponse;
	}

	@Override
	public SaveClaimReserveResponse saveClaimReserve(SaveClaimReserveRequest scrr) throws SQLException {
		SaveClaimReserveResponse scrResponse = new SaveClaimReserveResponse(); 
		HashMap<String, Object> scrParams = new HashMap<String, Object>();
		try {
			scrParams.put("claimId", scrr.getClaimId());
			scrParams.put("projId", scrr.getProjId());
			scrParams.put("lossResAmt", scrr.getLossResAmt());
			scrParams.put("lossPdAmt", scrr.getLossPdAmt());
			scrParams.put("lossStatCd", scrr.getLossStatCd());
			scrParams.put("expResAmt", scrr.getExpResAmt());
			scrParams.put("expPdAmt", scrr.getExpPdAmt());
			scrParams.put("expStatCd", scrr.getExpStatCd());
			scrParams.put("createUser", scrr.getCreateUser());
			scrParams.put("createDate", scrr.getCreateDate());
			scrParams.put("updateUser", scrr.getUpdateUser());
			scrParams.put("updateDate", scrr.getUpdateDate());
			
			HashMap<String, Object> response = claimsDao.saveClaimReserve(scrParams);
			scrResponse.setReturnCode((Integer) response.get("errorCode"));
			logger.info("SaveClaimReserveResponse : " + scrResponse.toString());
		}catch (Exception ex) {
			scrResponse.setReturnCode(0);
			scrResponse.getErrorList().add(new Error("General Exception","Error stack: " + System.lineSeparator() + ex.getCause()));
			ex.printStackTrace();
		}
		return scrResponse;
	}

	@Override
	public SaveClaimPaytReqResponse saveClaimPaytReq(SaveClaimPaytReqRequest scrr) throws SQLException {
		SaveClaimPaytReqResponse scprResponse = new SaveClaimPaytReqResponse(); 
		HashMap<String, Object> scprParams = new HashMap<String, Object>();
		try {
			scprParams.put("saveClmPaytReq", scrr.getSaveClmPaytReq());
			
			HashMap<String, Object> response = claimsDao.saveClaimPaytReq(scprParams);
			scprResponse.setReturnCode((Integer) response.get("errorCode"));
			logger.info("SaveClaimPaytReqResponse : " + scprResponse.toString());
		}catch (Exception ex) {
			scprResponse.setReturnCode(0);
			scprResponse.getErrorList().add(new Error("General Exception","Error stack: " + System.lineSeparator() + ex.getCause()));
			ex.printStackTrace();
		}
		return scprResponse;
	}

	@Override
	public RetrieveClmDistResponse retrieveClmDist(RetrieveClmDistRequest rcprr) throws SQLException {
		RetrieveClmDistResponse response = new RetrieveClmDistResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("claimId", rcprr.getClaimId());
		params.put("projId", rcprr.getProjId());
		response.setClaimDist(claimsDao.retrieveClmDist(params));
		return response;
	}

	@Override
	public RetrieveClmDistPoolResponse retrieveClmDistPool(RetrieveClmDistPoolRequest rcprr) throws SQLException {
		RetrieveClmDistPoolResponse response = new RetrieveClmDistPoolResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("claimId",rcprr.getClaimId());
		params.put("projId",rcprr.getProjId());
		params.put("histNo",rcprr.getHistNo());
		params.put("clmDistNo",rcprr.getClmDistNo());
		response.setClaimsDistCeding(claimsDao.retrieveClmDistPool(params));
		return response;
	}

	@Override
	public RedistributeClaimDistResponse redistributeClaimDist(RedistributeClaimDistRequest ucdr) throws SQLException {
		RedistributeClaimDistResponse response = new RedistributeClaimDistResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("claimId",ucdr.getClaimId());
		params.put("projId",ucdr.getProjId());
		params.put("histNo",ucdr.getHistNo());
		params.put("clmDistNo",ucdr.getClmDistNo());
		params.put("createUser", ucdr.getCreateUser());
		params.put("createDate", ucdr.getCreateDate());
		params.put("updateUser", ucdr.getUpdateUser());
		params.put("updateDate", ucdr.getUpdateDate());
		try{
			response.setReturnCode(claimsDao.redistributeClaimDist(params));
		}catch (Exception ex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Error stack: " + System.lineSeparator() + ex.getCause()));
			ex.printStackTrace();
		}
		return response;
	}
}
