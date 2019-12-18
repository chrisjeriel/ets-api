package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UnderwritingDao;
import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.request.BatchDistributionRequest;
import ph.cpi.rest.api.model.request.BatchPostingRequest;
import ph.cpi.rest.api.model.request.DistRiskRequest;
import ph.cpi.rest.api.model.request.ExtractExpiringPolicyRequest;
import ph.cpi.rest.api.model.request.ExtGenRenExpPolicyRequest;
import ph.cpi.rest.api.model.request.GenHundredValPolPrintingRequest;
import ph.cpi.rest.api.model.request.NegateDistributionRequest;
import ph.cpi.rest.api.model.request.PostDistributionRequest;
import ph.cpi.rest.api.model.request.PostPolicyRequest;
import ph.cpi.rest.api.model.request.ProcessRenewablePolicyRequest;
import ph.cpi.rest.api.model.request.PurgeExpiringPolRequest;
import ph.cpi.rest.api.model.request.RetrieveAlterationsPerPolicyRequest;
import ph.cpi.rest.api.model.request.RetrieveDistCoInsRequest;
import ph.cpi.rest.api.model.request.RetrieveExpPolListRequest;
import ph.cpi.rest.api.model.request.RetrievePolAlopItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolAlopRequest;
import ph.cpi.rest.api.model.request.RetrievePolAttachmentOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrievePolCATPerilRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoInsuranceRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageAltRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageRequest;
import ph.cpi.rest.api.model.request.RetrievePolDistInstPoolRequest;
import ph.cpi.rest.api.model.request.RetrievePolDistInstRequest;
import ph.cpi.rest.api.model.request.RetrievePolDistListRequest;
import ph.cpi.rest.api.model.request.RetrievePolDistRequest;
import ph.cpi.rest.api.model.request.RetrievePolDistWarningRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtRequest;
import ph.cpi.rest.api.model.request.RetrievePolForPurgingRequest;
import ph.cpi.rest.api.model.request.RetrievePolFullCoverageRequest;
import ph.cpi.rest.api.model.request.RetrievePolGenInfoOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolGenInfoRequest;
import ph.cpi.rest.api.model.request.RetrievePolHoldCoverListingRequest;
import ph.cpi.rest.api.model.request.RetrievePolHoldCoverRequest;
import ph.cpi.rest.api.model.request.RetrievePolInstTagAcctDateRequest;
import ph.cpi.rest.api.model.request.RetrievePolInwardBalRequest;
import ph.cpi.rest.api.model.request.RetrievePolItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyApproverRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyInformationRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyListingRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyOCListingRequest;
import ph.cpi.rest.api.model.request.RetrievePoolDistributionRequest;
import ph.cpi.rest.api.model.request.RetrieveRiskDistributionRequest;
import ph.cpi.rest.api.model.request.RetrieveValidBookingDateRequest;
import ph.cpi.rest.api.model.request.RetrieveWfmApprovalsRequest;
import ph.cpi.rest.api.model.request.SaveExpCatPerilRequest;
import ph.cpi.rest.api.model.request.SaveExpCovRequest;
import ph.cpi.rest.api.model.request.SaveExpGenInfoRequest;
import ph.cpi.rest.api.model.request.SaveOpenPolDetailsRequest;
import ph.cpi.rest.api.model.request.SavePolAlopItemRequest;
import ph.cpi.rest.api.model.request.SavePolAlopRequest;
import ph.cpi.rest.api.model.request.SavePolAttachmentOcRequest;
import ph.cpi.rest.api.model.request.SavePolAttachmentRequest;
import ph.cpi.rest.api.model.request.SavePolCATPerilRequest;
import ph.cpi.rest.api.model.request.SavePolCoverageOcRequest;
import ph.cpi.rest.api.model.request.SavePolCoverageRequest;
import ph.cpi.rest.api.model.request.SavePolEndorsementRequest;
import ph.cpi.rest.api.model.request.SavePolEndtOcRequest;
import ph.cpi.rest.api.model.request.SavePolFullCoverageRequest;
import ph.cpi.rest.api.model.request.SavePolGenInfoOcRequest;
import ph.cpi.rest.api.model.request.SavePolGenInfoRequest;
import ph.cpi.rest.api.model.request.SavePolHoldCoverRequest;
import ph.cpi.rest.api.model.request.SavePolInwardBalRequest;
import ph.cpi.rest.api.model.request.SavePolItemRequest;
import ph.cpi.rest.api.model.request.SavePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.SavePolicyDetailsRequest;
import ph.cpi.rest.api.model.request.SaveRiskDistRequest;
import ph.cpi.rest.api.model.request.SaveSumInsOCRequest;
import ph.cpi.rest.api.model.request.UpdatePolGenInfoRequest;
import ph.cpi.rest.api.model.request.UpdatePolGenInfoSpoilageRequest;
import ph.cpi.rest.api.model.request.UpdatePolHoldCoverStatusRequest;
import ph.cpi.rest.api.model.request.UpdatePolOpenCoverStatusRequest;
import ph.cpi.rest.api.model.request.UpdatePolicyStatusRequest;
import ph.cpi.rest.api.model.response.BatchDistributionResponse;
import ph.cpi.rest.api.model.response.BatchPostingResponse;
import ph.cpi.rest.api.model.response.DistRiskResponse;
import ph.cpi.rest.api.model.response.ExtractExpiringPolicyResponse;
import ph.cpi.rest.api.model.response.ExtGenRenExpPolicyResponse;
import ph.cpi.rest.api.model.response.GenHundredValPolPrintingResponse;
import ph.cpi.rest.api.model.response.NegateDistributionResponse;
import ph.cpi.rest.api.model.response.PostDistributionResponse;
import ph.cpi.rest.api.model.response.PostPolicyResponse;
import ph.cpi.rest.api.model.response.ProcessRenewablePolicyResponse;
import ph.cpi.rest.api.model.response.PurgeExpiringPolResponse;
import ph.cpi.rest.api.model.response.RetrieveAlterationsPerPolicyResponse;
import ph.cpi.rest.api.model.response.RetrieveDistCoInsResponse;
import ph.cpi.rest.api.model.response.RetrieveExpPolListResponse;
import ph.cpi.rest.api.model.response.RetrieveLastExtractInfoResponse;
import ph.cpi.rest.api.model.response.RetrievePolAlopItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolAlopResponse;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrievePolCATPerilResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoInsuranceResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageAltResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageResponse;
import ph.cpi.rest.api.model.response.RetrievePolDistInstResponse;
import ph.cpi.rest.api.model.response.RetrievePolDistListResponse;
import ph.cpi.rest.api.model.response.RetrievePolDistResponse;
import ph.cpi.rest.api.model.response.RetrievePolDistWarningResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtResponse;
import ph.cpi.rest.api.model.response.RetrievePolForPurgingResponse;
import ph.cpi.rest.api.model.response.RetrievePolFullCoverageResponse;
import ph.cpi.rest.api.model.response.RetrievePolGenInfoOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolGenInfoResponse;
import ph.cpi.rest.api.model.response.RetrievePolHoldCoverResponse;
import ph.cpi.rest.api.model.response.RetrievePolInstTagAcctDateResponse;
import ph.cpi.rest.api.model.response.RetrievePolInwardBalResponse;
import ph.cpi.rest.api.model.response.RetrievePolItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyApproverResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyInformationResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyListingResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyOCListingResponse;
import ph.cpi.rest.api.model.response.RetrievePoolDistributionResponse;
import ph.cpi.rest.api.model.response.RetrieveRiskDistributionResponse;
import ph.cpi.rest.api.model.response.RetrieveValidBookingDateResponse;
import ph.cpi.rest.api.model.response.RetrieveWfmApprovalsResponse;
import ph.cpi.rest.api.model.response.SaveExpCatPerilResponse;
import ph.cpi.rest.api.model.response.SaveExpCovResponse;
import ph.cpi.rest.api.model.response.SaveExpGenInfoResponse;
import ph.cpi.rest.api.model.response.SaveOpenPolDetailsResponse;
import ph.cpi.rest.api.model.response.SavePolAlopItemResponse;
import ph.cpi.rest.api.model.response.SavePolAlopResponse;
import ph.cpi.rest.api.model.response.SavePolAttachmentOcResponse;
import ph.cpi.rest.api.model.response.SavePolAttachmentResponse;
import ph.cpi.rest.api.model.response.SavePolCATPerilResponse;
import ph.cpi.rest.api.model.response.SavePolCoverageOcResponse;
import ph.cpi.rest.api.model.response.SavePolCoverageResponse;
import ph.cpi.rest.api.model.response.SavePolEndorsementResponse;
import ph.cpi.rest.api.model.response.SavePolEndtOcResponse;
import ph.cpi.rest.api.model.response.SavePolFullCoverageResponse;
import ph.cpi.rest.api.model.response.SavePolGenInfoOcResponse;
import ph.cpi.rest.api.model.response.SavePolGenInfoResponse;
import ph.cpi.rest.api.model.response.SavePolHoldCoverResponse;
import ph.cpi.rest.api.model.response.SavePolInwardBalResponse;
import ph.cpi.rest.api.model.response.SavePolItemResponse;
import ph.cpi.rest.api.model.response.SavePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.SavePolicyDetailsResponse;
import ph.cpi.rest.api.model.response.SaveRiskDistResponse;
import ph.cpi.rest.api.model.response.SaveSumInsOCResponse;
import ph.cpi.rest.api.model.response.UpdatePolGenInfoResponse;
import ph.cpi.rest.api.model.response.UpdatePolGenInfoSpoilageResponse;
import ph.cpi.rest.api.model.response.UpdatePolHoldCoverStatusResponse;
import ph.cpi.rest.api.model.response.UpdatePolOpenCoverStatusResponse;
import ph.cpi.rest.api.model.response.UpdatePolicyStatusResponse;
import ph.cpi.rest.api.model.underwriting.BatchDistribution;
import ph.cpi.rest.api.model.underwriting.BatchPost;
import ph.cpi.rest.api.model.underwriting.PolicyAsIs;
import ph.cpi.rest.api.model.underwriting.PolicyNonRenewal;
import ph.cpi.rest.api.model.underwriting.PolicyWithChanges;
import ph.cpi.rest.api.service.UnderwritingService;
import ph.cpi.rest.api.utils.DateUtility;

@Component
public class UnderwritingServiceImpl implements UnderwritingService {

	@Autowired
	UnderwritingDao underwritingDao;

	private static final Logger logger = LoggerFactory.getLogger(UnderwritingServiceImpl.class);

	@Override
	public RetrievePolInwardBalResponse retrievePolInwardBal(RetrievePolInwardBalRequest rpibp) throws SQLException {
		RetrievePolInwardBalResponse rpibResponse = new RetrievePolInwardBalResponse();
		HashMap<String, Object> retrievePolInwardBalParams = new HashMap<String, Object>();
		retrievePolInwardBalParams.put("policyId", rpibp.getPolicyId());
		retrievePolInwardBalParams.put("policyNo",rpibp.getPolicyNo());
		rpibResponse.setPolicyList(underwritingDao.retrievePolInwardBal(retrievePolInwardBalParams));
		logger.info("retrievePolInwardBalResponseTest : " + rpibResponse.toString());
		
		return rpibResponse;
	}

	@Override
	public RetrievePolCoInsuranceResponse retrievePolCoInsurance(RetrievePolCoInsuranceRequest rpcip)
			throws SQLException {
		RetrievePolCoInsuranceResponse rpcoiResponse = new RetrievePolCoInsuranceResponse();
		HashMap<String, Object> retrievePolCoInsuranceParams = new HashMap<String, Object>();
		retrievePolCoInsuranceParams.put("policyId",rpcip.getPolicyId());
		retrievePolCoInsuranceParams.put("policyNo",rpcip.getPolicyNo());
		rpcoiResponse.setPolicy(underwritingDao.retrievePolCoInsurance(retrievePolCoInsuranceParams));
		logger.info("retrievePolCoInsuranceResponse : " + rpcoiResponse.toString());
		
		return rpcoiResponse;
	}
	
	@Override
	public RetrievePolicyDeductiblesResponse retrievePolicyDeductibles(RetrievePolicyDeductiblesRequest rpdr)
			throws SQLException {
		RetrievePolicyDeductiblesResponse rpdResponse = new RetrievePolicyDeductiblesResponse();
		HashMap<String, Object> retrievePolDeductiblesParams = new HashMap<String, Object>();
		retrievePolDeductiblesParams.put("policyId", rpdr.getPolicyId());
		retrievePolDeductiblesParams.put("policyNo", rpdr.getPolicyNo());
		retrievePolDeductiblesParams.put("coverCd", rpdr.getCoverCd());
		retrievePolDeductiblesParams.put("endtCd", rpdr.getEndtCd());
		rpdResponse.setPolicy(underwritingDao.retrievePolicyDeductibles(retrievePolDeductiblesParams));
		
		logger.info("retrievePolicyDeductiblesResponse : " + rpdResponse.toString());
		
		return rpdResponse;
	}
	
	@Override
	public RetrievePolCoverageResponse retrievePolCoverage(RetrievePolCoverageRequest rpcr) throws SQLException {
		RetrievePolCoverageResponse rpcResponse = new RetrievePolCoverageResponse();
		
		HashMap<String, Object> retrievePolCoverageParams = new HashMap<String, Object>();
		retrievePolCoverageParams.put("policyId", rpcr.getPolicyId());
		retrievePolCoverageParams.put("policyNo", rpcr.getPolicyNo());
		
		rpcResponse.setPolicy(underwritingDao.retrievePolicyCoverage(retrievePolCoverageParams));
		
		logger.info("retrievePolCoverageResponse : " + rpcResponse.toString());
		
		return rpcResponse;
	}
	
	@Override
	public RetrievePolAttachmentResponse retrievePolAttachment(RetrievePolAttachmentRequest rpar) throws SQLException {
		RetrievePolAttachmentResponse rpaResponse = new RetrievePolAttachmentResponse();
		HashMap<String, Object> retrievePolAttachmentParams = new HashMap<String, Object>();
		retrievePolAttachmentParams.put("policyId", rpar.getPolicyId());
		retrievePolAttachmentParams.put("policyNo", rpar.getPolicyNo());
		
		rpaResponse.setPolAttachmentList(underwritingDao.retrievePolAttachmentList(retrievePolAttachmentParams));
		logger.info("retrievePolAttachmentResponse : " + rpaResponse.toString());
		return rpaResponse;
	}

	@Override
	public RetrievePolEndtResponse retrievePolEndt(RetrievePolEndtRequest rper) throws SQLException {
		RetrievePolEndtResponse rpeResponse = new RetrievePolEndtResponse();
		HashMap<String, Object> retrievePolEndtParams = new HashMap<String, Object>();
		retrievePolEndtParams.put("policyId", rper.getPolicyId());
		retrievePolEndtParams.put("policyNo", rper.getPolicyNo());
		
		rpeResponse.setEndtList(underwritingDao.retrievePolEndtList(retrievePolEndtParams));
		logger.info("RetrievePolEndtResponse : " + rpeResponse.toString());
		return rpeResponse;
	}
	
	@Override
	public RetrievePolItemResponse retrievePolItem(RetrievePolItemRequest rpir) throws SQLException {
		// TODO Auto-generated method stub
		RetrievePolItemResponse rpiresponse = new RetrievePolItemResponse();
		HashMap<String, Object> retrievePolItemParams = new HashMap<String, Object>();
		
		retrievePolItemParams.put("policyId", rpir.getPolicyId());
		retrievePolItemParams.put("policyNo", rpir.getPolicyNo());
		
		rpiresponse.setPolicy(underwritingDao.retrievePolItem(retrievePolItemParams));
		logger.info("retrievePolItemResponse : " + rpiresponse.toString());
		return rpiresponse;
	}

	@Override
	public RetrievePolCATPerilResponse retrievePolCATPeril(RetrievePolCATPerilRequest rpcpr) throws SQLException {
		// TODO Auto-generated method stub
		RetrievePolCATPerilResponse rpcpresponse = new RetrievePolCATPerilResponse();
		HashMap<String, Object> retrievePolCATPerilParams = new HashMap<String, Object>();
		
		retrievePolCATPerilParams.put("policyId", rpcpr.getPolicyId());
		retrievePolCATPerilParams.put("policyNo", rpcpr.getPolicyNo());
	
		rpcpresponse.setPolicy(underwritingDao.retrievePolCATPeril(retrievePolCATPerilParams));
		logger.info("retrievePolCATPerilResponse : " + rpcpresponse.toString());
		
		return rpcpresponse;
	}

	@Override
	public RetrievePolGenInfoResponse retrievePolGenInfo(RetrievePolGenInfoRequest rpgip) throws SQLException {
		RetrievePolGenInfoResponse rpgiResponse = new RetrievePolGenInfoResponse();
		HashMap<String, Object> retrievePolGenInfoParams = new HashMap<String, Object>();
		
		retrievePolGenInfoParams.put("policyId", rpgip.getPolicyId());
		retrievePolGenInfoParams.put("policyNo", rpgip.getPolicyNo());
		
		rpgiResponse.setPolicy(underwritingDao.retrievePolGenInfo(retrievePolGenInfoParams));
		logger.info("retrievePolGenInfoResponse : " + rpgiResponse.toString());
		
		return rpgiResponse;
	}
	
	@Override
	public RetrievePolAlopResponse retrievePolAlop(RetrievePolAlopRequest rpap) throws SQLException {
		RetrievePolAlopResponse rpaResponse = new RetrievePolAlopResponse();
		
		HashMap<String, Object> retrievePolAlopParams = new HashMap<String, Object>();
		retrievePolAlopParams.put("policyId", rpap.getPolicyId());
		retrievePolAlopParams.put("policyNo", rpap.getPolicyNo());
		
		rpaResponse.setPolicy(underwritingDao.retrievePolAlop(retrievePolAlopParams));
		
		return rpaResponse;
	}
	
	@Override
	public RetrievePolAlopItemResponse retrievePolAlopItem(RetrievePolAlopItemRequest rpaip) throws SQLException {
		RetrievePolAlopItemResponse rpaiResponse = new RetrievePolAlopItemResponse();
		
		HashMap<String, Object> retrievePolAlopItemParams = new HashMap<String, Object>();
		retrievePolAlopItemParams.put("policyId", rpaip.getPolicyId());
		retrievePolAlopItemParams.put("policyNo", rpaip.getPolicyNo());
		
		rpaiResponse.setPolicy(underwritingDao.retrievePolAlopItem(retrievePolAlopItemParams));
		
		return rpaiResponse;	
	}
	
	@Override
	public SavePolAlopResponse savePolAlop(SavePolAlopRequest spap) throws SQLException {
		SavePolAlopResponse spapResponse = new SavePolAlopResponse();
		
		try {
			HashMap<String, Object> savePolAlopParams = new HashMap<String, Object>();
			
			savePolAlopParams.put("policyId", spap.getPolicyId());
			savePolAlopParams.put("insId", spap.getInsId());
			savePolAlopParams.put("insuredDesc", spap.getInsuredDesc());
			savePolAlopParams.put("address", spap.getAddress());
			savePolAlopParams.put("insBusiness", spap.getInsBusiness());
			savePolAlopParams.put("annSi", spap.getAnnSi());
			savePolAlopParams.put("maxIndemPdSi", spap.getMaxIndemPdSi());
			savePolAlopParams.put("issueDate", spap.getIssueDate());
			savePolAlopParams.put("expiryDate", spap.getExpiryDate());
			savePolAlopParams.put("maxIndemPd", spap.getMaxIndemPd());
			savePolAlopParams.put("indemFromDate", spap.getIndemFromDate());
			savePolAlopParams.put("timeExc", spap.getTimeExc());
			savePolAlopParams.put("repInterval", spap.getRepInterval());
			savePolAlopParams.put("createUser", spap.getCreateUser());
			savePolAlopParams.put("createDate", spap.getCreateDate());
			savePolAlopParams.put("updateUser", spap.getUpdateUser());
			savePolAlopParams.put("updateDate", spap.getUpdateDate());
			
			HashMap<String, Object> res = underwritingDao.savePolAlop(savePolAlopParams);
			spapResponse.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception ex) {
			spapResponse.setReturnCode(0);
			spapResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		
		return spapResponse;
	}
	
	@Override
	public SavePolAlopItemResponse savePolAlopItem(SavePolAlopItemRequest spaip) throws SQLException {
		SavePolAlopItemResponse spaipResponse = new SavePolAlopItemResponse();
		
		try {
			HashMap<String, Object> savePolAlopItemParams = new HashMap<String, Object>();
			savePolAlopItemParams.put("policyId", spaip.getPolicyId());
			savePolAlopItemParams.put("savePolAlopItemList", spaip.getSavePolAlopItemList());
			savePolAlopItemParams.put("deletePolAlopItemList", spaip.getDeletePolAlopItemList());
			
			HashMap<String, Object> res = underwritingDao.savePolAlopItem(savePolAlopItemParams);
			spaipResponse.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception ex) {
			spaipResponse.setReturnCode(0);
			spaipResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		
		return spaipResponse;
	}

	@Override
	public RetrievePolicyListingResponse retrievePolicyListing(RetrievePolicyListingRequest rplp) throws SQLException {
		RetrievePolicyListingResponse rplResponse = new RetrievePolicyListingResponse();
		HashMap<String, Object> retrievePolicyListingParams = new HashMap<String, Object>();
		
		retrievePolicyListingParams.put("policyNo", rplp.getPolicyNo());
		retrievePolicyListingParams.put("cessionDesc", rplp.getCessionDesc());
		retrievePolicyListingParams.put("cedingName", rplp.getCedingName());
		retrievePolicyListingParams.put("lineClassDesc", rplp.getLineClassDesc());
		retrievePolicyListingParams.put("insuredDesc", rplp.getInsuredDesc());
		retrievePolicyListingParams.put("riskName", rplp.getRiskName());
		retrievePolicyListingParams.put("objectDesc", rplp.getObjectDesc());
		retrievePolicyListingParams.put("site", rplp.getSite());
		retrievePolicyListingParams.put("currencyCd", rplp.getCurrencyCd());
		retrievePolicyListingParams.put("totalSiLess", rplp.getTotalSiLess());
		retrievePolicyListingParams.put("totalSiGrt", rplp.getTotalSiGrt());
		retrievePolicyListingParams.put("totalPremLess", rplp.getTotalPremLess());
		retrievePolicyListingParams.put("totalPremGrt", rplp.getTotalPremGrt());
		retrievePolicyListingParams.put("issueDateFrom", rplp.getIssueDateFrom());
		retrievePolicyListingParams.put("issueDateTo", rplp.getIssueDateTo());
		retrievePolicyListingParams.put("expiryDateFrom", rplp.getExpiryDateFrom());
		retrievePolicyListingParams.put("expiryDateTo", rplp.getExpiryDateTo());
		retrievePolicyListingParams.put("inceptDateFrom", rplp.getInceptDateFrom());
		retrievePolicyListingParams.put("inceptDateTo", rplp.getInceptDateTo());
		retrievePolicyListingParams.put("acctDateFrom", rplp.getAcctDateFrom());
		retrievePolicyListingParams.put("acctDateTo", rplp.getAcctDateTo());
		retrievePolicyListingParams.put("statusDesc", rplp.getStatusDesc());
		retrievePolicyListingParams.put("lineCd", rplp.getLineCd());
		
		retrievePolicyListingParams.put("statusArr",rplp.getStatusArr());
		
		retrievePolicyListingParams.put("pagination", rplp.getPaginationRequest());
		retrievePolicyListingParams.put("sort", rplp.getSortRequest());
		retrievePolicyListingParams.put("search", rplp.getSearch());
		retrievePolicyListingParams.put("altNo", rplp.getAltNo());
		
		rplResponse.setPolicyList(underwritingDao.retrievePolicyListing(retrievePolicyListingParams));
		rplResponse.setLength(underwritingDao.retrievePolicyLength(retrievePolicyListingParams));
		//logger.info("retrievePolicyListingResponse : " + rplResponse.toString());
		
		return rplResponse;
	}
	
	@Override
	public SavePolAttachmentResponse savePolAttachments(SavePolAttachmentRequest spar) throws SQLException {
		// TODO Auto-generated method stub
		SavePolAttachmentResponse spaResponse = new SavePolAttachmentResponse();
		try{
			HashMap<String, Object> savePolAttachmentParams = new HashMap<String, Object>();
			savePolAttachmentParams.put("policyId", spar.getPolicyId());
			savePolAttachmentParams.put("savePolAttachments", spar.getSavePolAttachments());
			savePolAttachmentParams.put("deletePolAttachments", spar.getDeletePolAttachments());
			
			HashMap<String, Object> res = underwritingDao.savePolAttachments(savePolAttachmentParams);
			spaResponse.setReturnCode((Integer) res.get("errorCode"));
			spaResponse.setUploadDate((String) res.get("uploadDate"));
		}catch(Exception ex){
			spaResponse.setReturnCode(0);
			spaResponse.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			ex.printStackTrace();
		}
		return spaResponse;
	}

	@Override
	public SavePolicyDeductiblesResponse savePolicyDeductibles(SavePolicyDeductiblesRequest spdr) throws SQLException {
		SavePolicyDeductiblesResponse spdrResponse = new SavePolicyDeductiblesResponse();
		try{
			HashMap<String, Object> savePolDeductiblesParams = new HashMap<String, Object>();
			savePolDeductiblesParams.put("policyId" , spdr.getPolicyId());
			savePolDeductiblesParams.put("saveDeductibleList" , spdr.getSaveDeductibleList());
			savePolDeductiblesParams.put("deleteDeductibleList" , spdr.getDeleteDeductibleList());
			spdrResponse.setReturnCode(underwritingDao.savePolicyDeductibles(savePolDeductiblesParams));
		}catch (SQLException ex) {
			spdrResponse.setReturnCode(0);
			spdrResponse.getErrorList().add(new Error("SQLException","Please check the field values. Error Stack: " + System.lineSeparator() + ex.getCause()));
			ex.printStackTrace();
		}catch (Exception ex) {
			spdrResponse.setReturnCode(0);
			spdrResponse.getErrorList().add(new Error("General Exception","Error stack: " + System.lineSeparator() + ex.getCause()));
			ex.printStackTrace();
		}
		return spdrResponse;
	}
	
	@Override
	public SavePolCoverageResponse savePolCoverage(SavePolCoverageRequest spcr) throws SQLException {
		SavePolCoverageResponse spcResponse = new SavePolCoverageResponse();
		try{
			HashMap<String, Object> savePolCoverageParams = new HashMap<String, Object>();
			savePolCoverageParams.put("policyId",spcr.getPolicyId());
			savePolCoverageParams.put("riskId",spcr.getRiskId());
			savePolCoverageParams.put("projId",spcr.getProjId());
			savePolCoverageParams.put("sectionISi",spcr.getSectionISi());
			savePolCoverageParams.put("sectionIISi",spcr.getSectionIISi());
			savePolCoverageParams.put("sectionIIISi",spcr.getSectionIIISi());
			savePolCoverageParams.put("totalSi",spcr.getTotalSi());
			savePolCoverageParams.put("sectionIPrem",spcr.getSectionIPrem());
			savePolCoverageParams.put("sectionIIPrem",spcr.getSectionIIPrem());
			savePolCoverageParams.put("sectionIIIPrem",spcr.getSectionIIIPrem());
			savePolCoverageParams.put("totalPrem",spcr.getTotalPrem());
			savePolCoverageParams.put("holdCoverPremAmt",spcr.getHoldCoverPremAmt());
			savePolCoverageParams.put("currencyCd",spcr.getCurrencyCd());
			savePolCoverageParams.put("currencyRt",spcr.getCurrencyRt());
			savePolCoverageParams.put("pctShare",spcr.getPctShare());
			savePolCoverageParams.put("pctPml",spcr.getPctPml());
			savePolCoverageParams.put("totalValue",spcr.getTotalValue());
			savePolCoverageParams.put("remarks",spcr.getRemarks());
			savePolCoverageParams.put("exSecIPrem",spcr.getExSecIPrem());
			savePolCoverageParams.put("exSecIIPrem",spcr.getExSecIIPrem());
			savePolCoverageParams.put("exSecIIIPrem",spcr.getExSecIIIPrem());
			savePolCoverageParams.put("extotalPrem",spcr.getExtotalPrem());
			savePolCoverageParams.put("exCumTprem", spcr.getExCumTprem());
			savePolCoverageParams.put("exDays",spcr.getExDays());
			savePolCoverageParams.put("totalDays",spcr.getTotalDays());
			savePolCoverageParams.put("cumSecISi",spcr.getCumSecISi());
			savePolCoverageParams.put("cumSecIISi",spcr.getCumSecIISi());
			savePolCoverageParams.put("cumSecIIISi",spcr.getCumSecIIISi());
			savePolCoverageParams.put("cumTSi",spcr.getCumTSi());
			savePolCoverageParams.put("cumSecIPrem",spcr.getCumSecIPrem());
			savePolCoverageParams.put("cumSecIIPrem",spcr.getCumSecIIPrem());
			savePolCoverageParams.put("cumSecIIIPrem",spcr.getCumSecIIIPrem());
			savePolCoverageParams.put("cumTPrem",spcr.getCumTPrem());
			savePolCoverageParams.put("commRtQuota",spcr.getCommRtQuota());
			savePolCoverageParams.put("commRtSurplus",spcr.getCommRtSurplus());
			savePolCoverageParams.put("commRtFac",spcr.getCommRtFac());
			savePolCoverageParams.put("createUser",spcr.getCreateUser());
			savePolCoverageParams.put("createDate",spcr.getCreateDate());
			savePolCoverageParams.put("updateUser",spcr.getUpdateUser());
			savePolCoverageParams.put("updateDate",spcr.getUpdateDate());
			savePolCoverageParams.put("saveSectionCovers",spcr.getSaveSectionCovers());
			savePolCoverageParams.put("deleteSectionCovers",spcr.getDeleteSectionCovers());
			savePolCoverageParams.put("saveDeductibleList",spcr.getSaveDeductibleList());
			savePolCoverageParams.put("deleteDeductibleList",spcr.getDeleteDeductibleList());
			savePolCoverageParams.put("changeTag",spcr.getChangeTag());
			savePolCoverageParams.put("premDepPct",spcr.getPremDepPct());
			
			HashMap<String, Object> res = underwritingDao.savePolCoverage(savePolCoverageParams);
			spcResponse.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception ex) {
			spcResponse.setReturnCode(0);
			spcResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return spcResponse;
	}

	@Override
	public SavePolHoldCoverResponse savePolHoldCover(SavePolHoldCoverRequest sphcr) throws SQLException {
		// TODO Auto-generated method stub
		SavePolHoldCoverResponse sphcResponse= new SavePolHoldCoverResponse();
		try{
			HashMap<String, Object> savePolHoldCoverParams = new HashMap<String, Object>();
			savePolHoldCoverParams.put("policyId", sphcr.getPolicyId());
			savePolHoldCoverParams.put("holdCovId", sphcr.getHoldCovId());
			savePolHoldCoverParams.put("lineCd", sphcr.getLineCd());
			savePolHoldCoverParams.put("holdCovYear", sphcr.getHoldCovYear());
			savePolHoldCoverParams.put("holdCovSeqNo", sphcr.getHoldCovSeqNo());
			savePolHoldCoverParams.put("holdCovRevNo", sphcr.getHoldCovRevNo());
			savePolHoldCoverParams.put("periodFrom", sphcr.getPeriodFrom());
			savePolHoldCoverParams.put("periodTo", sphcr.getPeriodTo());
			savePolHoldCoverParams.put("compRefHoldCovNo", sphcr.getCompRefHoldCovNo());
			savePolHoldCoverParams.put("status", sphcr.getStatus());
			savePolHoldCoverParams.put("reqBy", sphcr.getReqBy());
			savePolHoldCoverParams.put("reqDate", sphcr.getReqDate());
			savePolHoldCoverParams.put("preparedBy", sphcr.getPreparedBy());
			savePolHoldCoverParams.put("approvedBy", sphcr.getApprovedBy());
			savePolHoldCoverParams.put("createUser", sphcr.getCreateUser());
			savePolHoldCoverParams.put("createDate", sphcr.getCreateDate());
			savePolHoldCoverParams.put("updateUser", sphcr.getUpdateUser());
			savePolHoldCoverParams.put("updateDate", sphcr.getUpdateDate());
			
			HashMap<String, Object> res = underwritingDao.savePolHoldCover(savePolHoldCoverParams);
			sphcResponse.setReturnCode((Integer) res.get("errorCode"));
			sphcResponse.setPolHoldCoverNo((String) res.get("polHoldCoverNo"));
			sphcResponse.setPolHoldCoverId((Integer) res.get("polHoldCoverId"));
			//sphcResponse.setPolHoldCoverNo(polHoldCoverNo);
		}catch(Exception ex){
			sphcResponse.setReturnCode(0);
			sphcResponse.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			ex.printStackTrace();
		}
		return sphcResponse;
	}

	@Override
	public RetrievePolAttachmentOcResponse retrievePolAttachmentOc(RetrievePolAttachmentOcRequest rpaor)
			throws SQLException {
		// TODO Auto-generated method stub
		RetrievePolAttachmentOcResponse rpaoResponse = new RetrievePolAttachmentOcResponse();
		HashMap<String, Object> retrievePolAttachmentOcParams = new HashMap<String, Object>();
		retrievePolAttachmentOcParams.put("policyIdOc", rpaor.getPolicyIdOc());
		retrievePolAttachmentOcParams.put("openPolicyNo", rpaor.getOpenPolicyNo());
		
		rpaoResponse.setAttachmentsList(underwritingDao.retrievePolAttachmentOcList(retrievePolAttachmentOcParams));
		logger.info("retrievePolAttachmentResponse : " + rpaoResponse.toString());
		return rpaoResponse;
	}

	@Override
	public RetrievePolEndtOcResponse retrievePolEndtOc(RetrievePolEndtOcRequest rpeor) throws SQLException {
		RetrievePolEndtOcResponse rpeoResponse = new RetrievePolEndtOcResponse();
		HashMap<String, Object> retrievePolEndtOcParams = new HashMap<String, Object>();
		retrievePolEndtOcParams.put("policyIdOc", rpeor.getPolicyIdOc());
		retrievePolEndtOcParams.put("openPolicyNo", rpeor.getOpenPolicyNo());
		
		rpeoResponse.setEndtOcList(underwritingDao.retrievePolEndtOcList(retrievePolEndtOcParams));
		logger.info("RetrievePolEndtOcResponse : " + rpeoResponse.toString());
		return rpeoResponse;
	}

	@Override
	public RetrievePolHoldCoverResponse retrievePolHoldCover(RetrievePolHoldCoverRequest rphc) throws SQLException {
		RetrievePolHoldCoverResponse rphcResponse = new RetrievePolHoldCoverResponse();
		HashMap<String, Object> retrievePolHoldCoverParams = new HashMap<String, Object>();
		
		retrievePolHoldCoverParams.put("policyId", rphc.getPolicyId());
		retrievePolHoldCoverParams.put("policyNo", rphc.getPolicyNo());
		retrievePolHoldCoverParams.put("holdCovId", rphc.getHoldCovId());
		
		rphcResponse.setPolicy(underwritingDao.retrievePolHoldCover(retrievePolHoldCoverParams));
		
		return rphcResponse;
	}
	
	@Override
	public SavePolCATPerilResponse savePolCATPeril(SavePolCATPerilRequest spcpr) throws SQLException {
		SavePolCATPerilResponse spcpresponse = new SavePolCATPerilResponse();
		try{
			HashMap<String, Object> savePolCATPerilParams = new HashMap<String, Object>();
			
			savePolCATPerilParams.put("policyId", spcpr.getPolicyId());
			savePolCATPerilParams.put("saveCATPerilList", spcpr.getSaveCATPerilList());
			HashMap<String, Object> res = underwritingDao.savePolCATPeril(savePolCATPerilParams);
			spcpresponse.setReturnCode((Integer) res.get("errorCode"));
		}catch (Exception ex) {
			spcpresponse.setReturnCode(0);
			spcpresponse.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		System.out.println("spcprResponse: " + spcpresponse);
		return spcpresponse;
	}

	@Override
	public SavePolItemResponse savePolItem(SavePolItemRequest spir) throws SQLException {
		SavePolItemResponse spiresponse = new SavePolItemResponse();
		try{
			HashMap<String, Object> savePolItemParams = new HashMap<String, Object>();
			savePolItemParams.put("policyId", spir.getPolicyId());
			savePolItemParams.put("projId", spir.getProjId());
			savePolItemParams.put("saveItemLists",spir.getSaveItemLists());
			savePolItemParams.put("deleteItemLists",spir.getDeleteItemLists());
			HashMap<String, Object> res = underwritingDao.savePolItem(savePolItemParams);
			spiresponse.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			spiresponse.setReturnCode(0);
			spiresponse.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return spiresponse;
	}
	
	@Override
	public RetrievePolCoverageOcResponse retrievePolCoverageOc(RetrievePolCoverageOcRequest rpcr) throws SQLException {
		RetrievePolCoverageOcResponse rpcResponse = new RetrievePolCoverageOcResponse();
			HashMap<String, Object> retrievePolCoverageOcParams = new HashMap<String, Object>();
			retrievePolCoverageOcParams.put("policyId", rpcr.getPolicyId());
			retrievePolCoverageOcParams.put("policyNo", rpcr.getPolicyNo());
			
			rpcResponse.setPolicyOc(underwritingDao.retrievePolCoverageOc(retrievePolCoverageOcParams));
			
			logger.info("retrievePolCoverageResponse : " + rpcResponse.toString());
			
			return rpcResponse;
	}

	@Override
	public SavePolCoverageOcResponse savePolCoverageOc(SavePolCoverageOcRequest spcr) throws SQLException {
		SavePolCoverageOcResponse spcResponse = new SavePolCoverageOcResponse();
		try{
			HashMap<String, Object> savePolCoverageOcParams = new HashMap<String, Object>();
			savePolCoverageOcParams.put("policyIdOc",spcr.getPolicyIdOc());
			savePolCoverageOcParams.put("riskId",spcr.getRiskId());
			savePolCoverageOcParams.put("projId",spcr.getProjId());
			savePolCoverageOcParams.put("sectionISi",spcr.getSectionISi());
			savePolCoverageOcParams.put("sectionIISi",spcr.getSectionIISi());
			savePolCoverageOcParams.put("sectionIIISi",spcr.getSectionIIISi());
			savePolCoverageOcParams.put("totalSi",spcr.getTotalSi());
			savePolCoverageOcParams.put("sectionIPrem",spcr.getSectionIPrem());
			savePolCoverageOcParams.put("sectionIIPrem",spcr.getSectionIIPrem());
			savePolCoverageOcParams.put("sectionIIIPrem",spcr.getSectionIIIPrem());
			savePolCoverageOcParams.put("totalPrem",spcr.getTotalPrem());
			savePolCoverageOcParams.put("currencyCd",spcr.getCurrencyCd());
			savePolCoverageOcParams.put("currencyRt",spcr.getCurrencyRt());
			savePolCoverageOcParams.put("pctShare",spcr.getPctShare());
			savePolCoverageOcParams.put("pctPml",spcr.getPctPml());
			savePolCoverageOcParams.put("totalValue",spcr.getTotalValue());
			savePolCoverageOcParams.put("remarks",spcr.getRemarks());
			savePolCoverageOcParams.put("createUser",spcr.getCreateUser());
			savePolCoverageOcParams.put("createDate",spcr.getCreateDate());
			savePolCoverageOcParams.put("updateUser",spcr.getUpdateUser());
			savePolCoverageOcParams.put("updateDate",spcr.getUpdateDate());
			savePolCoverageOcParams.put("saveSectionCoversOc",spcr.getSaveSectionCoversOc());
			savePolCoverageOcParams.put("delSectionCoversOc",spcr.getDelSectionCoversOc());
			
			
			HashMap<String, Object> res = underwritingDao.savePolCoverageOc(savePolCoverageOcParams);
			spcResponse.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception ex) {
			spcResponse.setReturnCode(0);
			spcResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return spcResponse;
	}

	@Override
	public SavePolEndtOcResponse savePolEndtOc(SavePolEndtOcRequest speoc) throws SQLException {
		SavePolEndtOcResponse speResponse = new SavePolEndtOcResponse();
		try{
			HashMap<String, Object> savePolEndtOcParams = new HashMap<String, Object>();
			savePolEndtOcParams.put("policyId",speoc.getPolicyId());
			savePolEndtOcParams.put("saveEndorsements", speoc.getSaveEndorsements());
			savePolEndtOcParams.put("deleteEndorsements", speoc.getDeleteEndorsements());
	
			savePolEndtOcParams.put("saveDeductibleList" , speoc.getSaveDeductibleList());
			savePolEndtOcParams.put("deleteDeductibleList" , speoc.getDeleteDeductibleList());
			
			HashMap<String, Object> res = underwritingDao.savePolEndtOc(savePolEndtOcParams);
			speResponse.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception ex) {
			speResponse.setReturnCode(0);
			speResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return speResponse;
	}
	
	@Override
	public SavePolGenInfoResponse savePolGenInfo(SavePolGenInfoRequest spgip) throws SQLException {
		SavePolGenInfoResponse spgiResponse = new SavePolGenInfoResponse();
		
		try {
			HashMap<String, Object> savePolGenInfoParams = new HashMap<String, Object>();
			
			savePolGenInfoParams.put("policyNo", "");
			savePolGenInfoParams.put("outPolicyId", "");
			savePolGenInfoParams.put("savingType", spgip.getSavingType());
			savePolGenInfoParams.put("refPolicyId", spgip.getRefPolicyId());
			savePolGenInfoParams.put("policyId", spgip.getPolicyId());
			savePolGenInfoParams.put("lineCd", spgip.getLineCd());
			savePolGenInfoParams.put("polYear", spgip.getPolYear());
			savePolGenInfoParams.put("polSeqNo", spgip.getPolSeqNo());
			savePolGenInfoParams.put("cedingId", spgip.getCedingId());
			savePolGenInfoParams.put("coSeriesNo", spgip.getCoSeriesNo());
			savePolGenInfoParams.put("altNo", spgip.getAltNo());
			savePolGenInfoParams.put("cessionId", spgip.getCessionId());
			savePolGenInfoParams.put("lineClassCd", spgip.getLineClassCd());
			savePolGenInfoParams.put("quoteId", spgip.getQuoteId());
			savePolGenInfoParams.put("optionId", spgip.getOptionId());
			savePolGenInfoParams.put("status", spgip.getStatus());
			savePolGenInfoParams.put("coRefNo", spgip.getCoRefNo());
			savePolGenInfoParams.put("reinsurerId", spgip.getReinsurerId());
			savePolGenInfoParams.put("riBinderNo", spgip.getRiBinderNo());
			savePolGenInfoParams.put("mbiRefNo", spgip.getMbiRefNo());
			savePolGenInfoParams.put("policyIdOc", spgip.getPolicyIdOc());
			savePolGenInfoParams.put("refOpenPolNo", spgip.getRefOpenPolNo());
			savePolGenInfoParams.put("intmId", spgip.getIntmId());
			savePolGenInfoParams.put("principalId", spgip.getPrincipalId());
			savePolGenInfoParams.put("contractorId", spgip.getContractorId());
			savePolGenInfoParams.put("insuredDesc", spgip.getInsuredDesc());
			savePolGenInfoParams.put("inceptDate", spgip.getInceptDate());
			savePolGenInfoParams.put("expiryDate", spgip.getExpiryDate());
			savePolGenInfoParams.put("lapseFrom", spgip.getLapseFrom());
			savePolGenInfoParams.put("lapseTo", spgip.getLapseTo());
			savePolGenInfoParams.put("maintenanceFrom", spgip.getMaintenanceFrom());
			savePolGenInfoParams.put("maintenanceTo", spgip.getMaintenanceTo());
			savePolGenInfoParams.put("issueDate", spgip.getIssueDate());
			savePolGenInfoParams.put("effDate", spgip.getEffDate());
			savePolGenInfoParams.put("distDate", spgip.getDistDate());
			savePolGenInfoParams.put("acctDate", spgip.getAcctDate());
			savePolGenInfoParams.put("currencyCd", spgip.getCurrencyCd());
			savePolGenInfoParams.put("currencyRt", spgip.getCurrencyRt());
			savePolGenInfoParams.put("bookedTag", spgip.getBookedTag());
			savePolGenInfoParams.put("govtTag", spgip.getGovtTag());
			savePolGenInfoParams.put("openCoverTag", spgip.getOpenCoverTag());
			savePolGenInfoParams.put("holdCoverTag", spgip.getHoldCoverTag());
			savePolGenInfoParams.put("declarationTag", spgip.getDeclarationTag());
			savePolGenInfoParams.put("minDepTag", spgip.getMinDepTag());
			savePolGenInfoParams.put("altTag", spgip.getAltTag());
			savePolGenInfoParams.put("specialPolicyTag", spgip.getSpecialPolicyTag());
			savePolGenInfoParams.put("instTag", spgip.getInstTag());
			savePolGenInfoParams.put("extensionTag", spgip.getExtensionTag());
			savePolGenInfoParams.put("excludeDistTag", spgip.getExcludeDistTag());
			savePolGenInfoParams.put("coinsGrpId", spgip.getCoinsGrpId());
			savePolGenInfoParams.put("wordings", spgip.getWordings());
			savePolGenInfoParams.put("createUser", spgip.getCreateUser());
			savePolGenInfoParams.put("createDate", spgip.getCreateDate());
			savePolGenInfoParams.put("updateUser", spgip.getUpdateUser());
			savePolGenInfoParams.put("updateDate", spgip.getUpdateDate());
			savePolGenInfoParams.put("projId", spgip.getProjId());
			savePolGenInfoParams.put("projDesc", spgip.getProjDesc());
			savePolGenInfoParams.put("riskId", spgip.getRiskId());
			savePolGenInfoParams.put("totalSi", spgip.getTotalSi());
			savePolGenInfoParams.put("objectId", spgip.getObjectId());
			savePolGenInfoParams.put("site", spgip.getSite());
			savePolGenInfoParams.put("duration", spgip.getDuration());
			savePolGenInfoParams.put("testing", spgip.getTesting());
			savePolGenInfoParams.put("ipl", spgip.getIpl());
			savePolGenInfoParams.put("timeExc", spgip.getTimeExc());
			savePolGenInfoParams.put("noClaimPd", spgip.getNoClaimPd());
			savePolGenInfoParams.put("prjCreateUser", spgip.getPrjCreateUser());
			savePolGenInfoParams.put("prjCreateDate", spgip.getPrjCreateDate());
			savePolGenInfoParams.put("prjUpdateUser", spgip.getPrjUpdateUser());
			savePolGenInfoParams.put("prjUpdateDate", spgip.getPrjUpdateDate());
			savePolGenInfoParams.put("polWordings", spgip.getPolWordings());
			
			savePolGenInfoParams.put("regionCd" ,spgip.getRegionCd());
			savePolGenInfoParams.put("provinceCd" ,spgip.getProvinceCd());
			savePolGenInfoParams.put("cityCd" ,spgip.getCityCd());
			savePolGenInfoParams.put("districtCd" ,spgip.getDistrictCd());
			savePolGenInfoParams.put("blockCd" ,spgip.getBlockCd());
			savePolGenInfoParams.put("latitude" ,spgip.getLatitude());
			savePolGenInfoParams.put("longitude" ,spgip.getLongitude());
			savePolGenInfoParams.put("coTermTag", spgip.getCoTermTag());
			savePolGenInfoParams.put("coTermText", spgip.getCoTermText());
			savePolGenInfoParams.put("mbiPolicyId", spgip.getMbiPolicyId());
			savePolGenInfoParams.put("coAltRefNo", spgip.getCoAltRefNo());
			
			HashMap<String, Object> res = underwritingDao.savePolGenInfo(savePolGenInfoParams);
			
			spgiResponse.setReturnCode((Integer) res.get("errorCode"));
			spgiResponse.setPolicyId((Integer) res.get("outPolicyId"));
			spgiResponse.setPolicyNo((String) res.get("policyNo"));
			
		} catch (Exception e) {
			spgiResponse.setReturnCode(0);
			spgiResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			e.printStackTrace();			
		}
		
		return spgiResponse;
	}

	@Override
	public SavePolicyDetailsResponse savePolicyDetails(SavePolicyDetailsRequest spdp) throws SQLException {
		SavePolicyDetailsResponse spdResponse = new SavePolicyDetailsResponse();
		
		try {
			HashMap<String, Object> savePolicyDetailsParams = new HashMap<String, Object>();
			
			savePolicyDetailsParams.put("checkingType", spdp.getCheckingType());
			savePolicyDetailsParams.put("coInsStatus", "");
			savePolicyDetailsParams.put("policyId", "");
			savePolicyDetailsParams.put("policyNo", "");
			savePolicyDetailsParams.put("lineCd", spdp.getLineCd());
			savePolicyDetailsParams.put("quotationNo", spdp.getQuotationNo());
			savePolicyDetailsParams.put("holdCoverNo", spdp.getHoldCoverNo());
			savePolicyDetailsParams.put("openPolicyNo", spdp.getOpenPolicyNo());
			savePolicyDetailsParams.put("optionId", spdp.getOptionId());
			savePolicyDetailsParams.put("inceptDate", spdp.getInceptDate());
			savePolicyDetailsParams.put("expiryDate", spdp.getExpiryDate());
			savePolicyDetailsParams.put("createUser", spdp.getCreateUser());
			savePolicyDetailsParams.put("createDate", spdp.getCreateDate());
			savePolicyDetailsParams.put("updateUser", spdp.getUpdateUser());
			savePolicyDetailsParams.put("updateDate", spdp.getUpdateDate());			
			
			HashMap<String, Object> res = new HashMap<String, Object>();
			
//			if(!savePolicyDetailsParams.get("quotationNo").toString().equals("")) {
//				Integer x = underwritingDao.retrieveCoInsStatus(savePolicyDetailsParams);
//				
//				if(x == 0) {
//					res = underwritingDao.savePolicyDetails(savePolicyDetailsParams);
//				} else {
//					spdResponse.setCoInsStatus(x);
//				}
//			} else {
//				res = underwritingDao.savePolicyDetails(savePolicyDetailsParams);
//			}
			
			res = underwritingDao.savePolicyDetails(savePolicyDetailsParams);
			
			spdResponse.setReturnCode((Integer) res.get("errorCode"));
			spdResponse.setPolicyId((Integer) res.get("policyId"));
			spdResponse.setPolicyNo((String) res.get("policyNo"));
			
			//spdResponse.setReturnCode(-1);
		} catch (SQLException e) {
			spdResponse.setReturnCode(0);
			spdResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			e.printStackTrace();
		}
		
		logger.info(spdResponse.toString());
		return spdResponse;
	}
	
	@Override
	public RetrievePolicyInformationResponse retrievePolicyInformation(RetrievePolicyInformationRequest rpir) throws SQLException {
		RetrievePolicyInformationResponse rpirResponse = new RetrievePolicyInformationResponse();
		HashMap<String, Object> retrievePolInquiryParams = new HashMap<String, Object>();
		retrievePolInquiryParams.put("policyId", rpir.getPolicyId());
		retrievePolInquiryParams.put("policyNo", rpir.getPolicyNo());
		rpirResponse.setPolicy(underwritingDao.retrievePolicyInformation(retrievePolInquiryParams));
		return rpirResponse;
	}

	@Override
	public SavePolInwardBalResponse savePolInwardBal(SavePolInwardBalRequest spibr) throws SQLException {
		SavePolInwardBalResponse spibrResponse = new SavePolInwardBalResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyId", spibr.getPolicyId());
		params.put("user", spibr.getUser());
		params.put("savePolInward", spibr.getSavePolInward());
		params.put("delPolInward",spibr.getDelPolInward());
		params.put("saveOtherCharges", spibr.getSaveOtherCharges());
		params.put("delOtherCharges",spibr.getDelOtherCharges());
		params.put("newSavePolInward", spibr.getNewSavePolInward());
		try{
			spibrResponse.setReturnCode(underwritingDao.savePolInwardBal(params));
		} catch (Exception ex) {
			spibrResponse.setReturnCode(0);
			spibrResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return spibrResponse;
	}

	@Override
	public SavePolEndorsementResponse savePolEndorsement(SavePolEndorsementRequest sper) throws SQLException {
		SavePolEndorsementResponse sperResponse = new SavePolEndorsementResponse();
		try{
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("policyId",sper.getPolicyId());
			params.put("saveEndorsements", sper.getSaveEndorsements());
			params.put("deleteEndorsements", sper.getDeleteEndorsements());
	
			params.put("saveDeductibleList" , sper.getSaveDeductibleList());
			params.put("deleteDeductibleList" , sper.getDeleteDeductibleList());
			sperResponse.setReturnCode(underwritingDao.savePolEndorsement(params));
			
		}catch (SQLException ex) {
			sperResponse.setReturnCode(0);
			sperResponse.getErrorList().add(new Error("SQLException","Please check the field values. Error Stack: " + System.lineSeparator() + ex.getCause()));
			ex.printStackTrace();
		}catch (Exception ex) {
			sperResponse.setReturnCode(0);
			sperResponse.getErrorList().add(new Error("General Exception","Error stack: " + System.lineSeparator() + ex.getCause()));
			ex.printStackTrace();
		}
		
		return sperResponse;
	}

	@Override
	public SaveSumInsOCResponse saveSumInsOC(SaveSumInsOCRequest ssioc) throws SQLException {
		SaveSumInsOCResponse ssiocResponse = new SaveSumInsOCResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("pctShare", ssioc.getPctShare());
		params.put("pctPml", ssioc.getPctPml());
		params.put("totalValue", ssioc.getTotalValue());
		params.put("policyId", ssioc.getPolicyId());
		params.put("updateUser", ssioc.getUpdateUser());
		params.put("updateDate", ssioc.getUpdateDate());
		try{
			ssiocResponse.setReturnCode(underwritingDao.saveSumInsOC(params));
		}catch (SQLException ex) {
			ssiocResponse.setReturnCode(0);
			ssiocResponse.getErrorList().add(new Error("SQLException","Please check the field values. Error Stack: " + System.lineSeparator() + ex.getCause()));
			ex.printStackTrace();
		}catch (Exception ex) {
			ssiocResponse.setReturnCode(0);
			ssiocResponse.getErrorList().add(new Error("General Exception","Error stack: " + System.lineSeparator() + ex.getCause()));
			ex.printStackTrace();
		}
		return ssiocResponse;
	}

	@Override
	public RetrievePolicyOCListingResponse retrievePolicyOCListing(RetrievePolicyOCListingRequest rplp) throws SQLException{
		RetrievePolicyOCListingResponse rplResponse = new RetrievePolicyOCListingResponse();
			HashMap<String, Object> retrievePolicyListingParams = new HashMap<String, Object>();
			
			retrievePolicyListingParams.put("policyNo", rplp.getPolicyNo());
			retrievePolicyListingParams.put("cessionDesc", rplp.getCessionDesc());
			retrievePolicyListingParams.put("cedingName", rplp.getCedingName());
			retrievePolicyListingParams.put("lineClassDesc", rplp.getLineClassDesc());
			retrievePolicyListingParams.put("insuredDesc", rplp.getInsuredDesc());
			retrievePolicyListingParams.put("riskName", rplp.getRiskName());
			retrievePolicyListingParams.put("objectDesc", rplp.getObjectDesc());
			retrievePolicyListingParams.put("site", rplp.getSite());
			retrievePolicyListingParams.put("currencyCd", rplp.getCurrencyCd());
			retrievePolicyListingParams.put("totalSiLess", rplp.getTotalSiLess());
			retrievePolicyListingParams.put("totalSiGrt", rplp.getTotalSiGrt());
			retrievePolicyListingParams.put("totalPremLess", rplp.getTotalPremLess());
			retrievePolicyListingParams.put("totalPremGrt", rplp.getTotalPremGrt());
			retrievePolicyListingParams.put("issueDateFrom", rplp.getIssueDateFrom());
			retrievePolicyListingParams.put("issueDateTo", rplp.getIssueDateTo());
			retrievePolicyListingParams.put("expiryDateFrom", rplp.getExpiryDateFrom());
			retrievePolicyListingParams.put("expiryDateTo", rplp.getExpiryDateTo());
			retrievePolicyListingParams.put("inceptDateFrom", rplp.getInceptDateFrom());
			retrievePolicyListingParams.put("inceptDateTo", rplp.getInceptDateTo());
			retrievePolicyListingParams.put("acctDateFrom", rplp.getAcctDateFrom());
			retrievePolicyListingParams.put("acctDateTo", rplp.getAcctDateTo());
			retrievePolicyListingParams.put("statusDesc", rplp.getStatusDesc());
			
			rplResponse.setPolicyList(underwritingDao.retrievePolicyOcListing(retrievePolicyListingParams));
			logger.info("retrievePolicyOCListingResponse : " + rplResponse.toString());
			
			return rplResponse;
	}
	
	@Override
	public UpdatePolHoldCoverStatusResponse updatePolHoldCoverStatus(UpdatePolHoldCoverStatusRequest uphcsr)
			throws SQLException {
		UpdatePolHoldCoverStatusResponse uphcsResponse = new UpdatePolHoldCoverStatusResponse();
		try{
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("policyId",uphcsr.getPolicyId());
			params.put("holdCovId", uphcsr.getHoldCovId());
			params.put("updateType", uphcsr.getUpdateType());
			params.put("updateUser", uphcsr.getUpdateUser());
			params.put("updateDate" , uphcsr.getUpdateDate());
			uphcsResponse.setReturnCode(underwritingDao.updatePolHoldCoverStatus(params));
		}catch(Exception ex){
			uphcsResponse.setReturnCode(0);
			uphcsResponse.getErrorList().add(new Error("Exception","Error stack: " + System.lineSeparator() + ex.getCause()));
			ex.printStackTrace();
		}
		return uphcsResponse;
	}

	@Override
	public SaveOpenPolDetailsResponse saveOpenPolDetails(SaveOpenPolDetailsRequest sopdr) throws SQLException {
		SaveOpenPolDetailsResponse sopdResponse= new SaveOpenPolDetailsResponse();
		try{
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("quotationNo", sopdr.getQuotationNo());
			params.put("optionId", sopdr.getOptionId());
			params.put("inceptDate", sopdr.getInceptDate());
			params.put("expiryDate", sopdr.getExpiryDate());
			params.put("createUser", sopdr.getCreateUser());
			params.put("createDate", sopdr.getCreateDate());
			params.put("updateUser", sopdr.getUpdateUser());
			params.put("updateDate", sopdr.getUpdateDate());
			
			HashMap<String, Object> res = underwritingDao.saveOpenPolDetails(params);
			sopdResponse.setReturnCode((Integer) res.get("errorCode"));
			sopdResponse.setPolicyIdOc((Integer) res.get("policyIdOc"));
			sopdResponse.setOpenPolNo((String) res.get("openPolNo"));
			//sphcResponse.setPolHoldCoverNo(polHoldCoverNo);
		}catch(Exception ex){
			sopdResponse.setReturnCode(0);
			sopdResponse.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			ex.printStackTrace();
		}
		return sopdResponse;
	}

	@Override
	public RetrievePolicyApproverResponse retrievePolicyApprover(RetrievePolicyApproverRequest rpaRequest)
			throws SQLException {
		RetrievePolicyApproverResponse rqaResponse = new RetrievePolicyApproverResponse();
		HashMap<String, Object> rqaParams = new HashMap<String, Object>();
		rqaParams.put("policyId", rpaRequest.getPolicyId());
		
		rqaResponse.setApproverList(underwritingDao.retrievePolicyApprover(rqaParams));
		logger.info("rqaResponse : " + rqaResponse.toString());
		return rqaResponse;
	}

	@Override
	public UpdatePolicyStatusResponse updatePolicyStatus(UpdatePolicyStatusRequest upsr) throws SQLException {
		UpdatePolicyStatusResponse upsResponse = new UpdatePolicyStatusResponse();
		
		HashMap<String, Object> upsParams = new HashMap<String, Object>();
		upsParams.put("policyId", upsr.getPolicyId());
		upsParams.put("status", upsr.getStatus());
		upsParams.put("updateUser", upsr.getUpdateUser());
		
		upsResponse.setReturnCode(underwritingDao.updatePolicyStatus(upsParams));
		return upsResponse;
	}

	@Override
	public RetrieveWfmApprovalsResponse retrieveWfmApprovals(RetrieveWfmApprovalsRequest rwar) throws SQLException {
		RetrieveWfmApprovalsResponse rwaResponse = new RetrieveWfmApprovalsResponse();
		HashMap<String, Object> rwarParams = new HashMap<String, Object>();
		rwarParams.put("userId", rwar.getUserId());
		
		rwaResponse.setApprovalList(underwritingDao.retrieveWfmApprovals(rwarParams));
		logger.info("rqaResponse : " + rwaResponse.toString());
		return rwaResponse;
	}

	@Override
	public RetrievePolHoldCoverResponse retrievePolHoldCoverListing(RetrievePolHoldCoverListingRequest rphclp)
			throws SQLException {
		RetrievePolHoldCoverResponse rphcResponse = new RetrievePolHoldCoverResponse();
		try {
			DateUtility date = new DateUtility();
			HashMap<String, Object> retrievePolHoldCoverListParams = new HashMap<String, Object>();
			retrievePolHoldCoverListParams.put("holdCovNo", rphclp.getHoldCovNo());
			retrievePolHoldCoverListParams.put("status", rphclp.getStatus());
			retrievePolHoldCoverListParams.put("cedingName", rphclp.getCedingName());
			retrievePolHoldCoverListParams.put("policyNo", rphclp.getPolicyNo());
			retrievePolHoldCoverListParams.put("riskName", rphclp.getRiskName());
			retrievePolHoldCoverListParams.put("insuredDesc", rphclp.getInsuredDesc());
			retrievePolHoldCoverListParams.put("periodFrom",(rphclp.getPeriodFrom() == null  || rphclp.getPeriodFrom().isEmpty()) ? "" : date.toDate(rphclp.getPeriodFrom()));
			retrievePolHoldCoverListParams.put("periodTo", (rphclp.getPeriodTo() == null || rphclp.getPeriodTo().isEmpty()) ? "" : date.toDate(rphclp.getPeriodTo()));
			retrievePolHoldCoverListParams.put("compRefHoldCovNo", rphclp.getCompRefHoldCovNo());
			retrievePolHoldCoverListParams.put("reqBy", rphclp.getReqBy());
			retrievePolHoldCoverListParams.put("reqDateFrom", (rphclp.getReqDateFrom() == null || rphclp.getReqDateFrom().isEmpty()) ? "" : date.toDate(rphclp.getReqDateFrom()));
			retrievePolHoldCoverListParams.put("reqDateTo", (rphclp.getReqDateTo() == null || rphclp.getReqDateTo().isEmpty()) ? "" : date.toDate(rphclp.getReqDateTo()));
			retrievePolHoldCoverListParams.put("expiringInDays", rphclp.getExpiringInDays());
			rphcResponse.setPolicyList(underwritingDao.retrievePolHoldCoverListing(retrievePolHoldCoverListParams));
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return rphcResponse;
	}

	@Override
	public RetrievePolGenInfoOcResponse retrievePolGenInfoOc(RetrievePolGenInfoOcRequest rpgior) throws SQLException {
		RetrievePolGenInfoOcResponse rpgioResponse = new RetrievePolGenInfoOcResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyIdOc", rpgior.getPolicyIdOc());
		params.put("openPolicyNo", rpgior.getOpenPolicyNo());
		/*params.put("position", rpgior.getPaginationRequest().getPosition());
		params.put("count", rpgior.getPaginationRequest().getCount());
		params.put("sortKey", rpgior.getSortRequest().getSortKey());
		params.put("order", rpgior.getSortRequest().getOrder());*/
		rpgioResponse.setPolicyOc(underwritingDao.retrievePolGenInfoOc(params));
		//rpgioResponse.setPaginationResponse(paginationResponse);;
		logger.info("RetrievePolGenInfoOcResponse : " + rpgioResponse.toString());
		return rpgioResponse;
	}
	
	@Override
	public RetrievePolCoverageAltResponse retrivePolCoverageAlt(RetrievePolCoverageAltRequest rpcar)
			throws SQLException {
		RetrievePolCoverageAltResponse rpcResponse = new RetrievePolCoverageAltResponse();
		
		HashMap<String, Object> retrievePolCoverageAltParams = new HashMap<String, Object>();
		retrievePolCoverageAltParams.put("lineCd", rpcar.getLineCd());
		retrievePolCoverageAltParams.put("polYear", rpcar.getPolYear());
		retrievePolCoverageAltParams.put("seqNo", rpcar.getSeqNo());
		retrievePolCoverageAltParams.put("cedingId", rpcar.getCedingId());
		retrievePolCoverageAltParams.put("coSeriesNo", rpcar.getCoSeriesNo());
		retrievePolCoverageAltParams.put("altNo", rpcar.getAltNo());
		
		rpcResponse.setPolicy(underwritingDao.retrievePolicyCoverageAlt(retrievePolCoverageAltParams));
		
		logger.info("retrievePolCoverageAltResponse : " + rpcResponse.toString());
		
		return rpcResponse;
	}

	@Override
	public SavePolAttachmentOcResponse savePolAttachmentOc(SavePolAttachmentOcRequest spaocr) throws SQLException {
		SavePolAttachmentOcResponse spaocrResponse = new SavePolAttachmentOcResponse();
		try{
			HashMap<String, Object> savePolAttachmentOcParams = new HashMap<String, Object>();
			savePolAttachmentOcParams.put("policyId", spaocr.getPolicyId());
			savePolAttachmentOcParams.put("savePolAttachments", spaocr.getSavePolAttachments());
			savePolAttachmentOcParams.put("deletePolAttachments", spaocr.getDeletePolAttachments());
			
			HashMap<String, Object> res = underwritingDao.savePolAttachmentsOc(savePolAttachmentOcParams);
			spaocrResponse.setReturnCode((Integer) res.get("errorCode"));
			spaocrResponse.setUploadDate((String) res.get("uploadDate"));
		}catch(Exception ex){
			spaocrResponse.setReturnCode(0);
			spaocrResponse.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			ex.printStackTrace();
		}
		return spaocrResponse;
	}

	@Override
	public RetrieveAlterationsPerPolicyResponse retrieveAlterationsPerPolicy(RetrieveAlterationsPerPolicyRequest rappr)
			throws SQLException {
		RetrieveAlterationsPerPolicyResponse rappResponse = new RetrieveAlterationsPerPolicyResponse();
		
		HashMap<String, Object> retrieveAlterationsPerPolicyParams = new HashMap<String, Object>();
		
		retrieveAlterationsPerPolicyParams.put("checkingType", rappr.getCheckingType());
		retrieveAlterationsPerPolicyParams.put("coInsAlt", "");
		retrieveAlterationsPerPolicyParams.put("policyId", rappr.getPolicyId());
		
		rappResponse.setCoInsStatus(underwritingDao.retrieveCoInsStatus(retrieveAlterationsPerPolicyParams));
		rappResponse.setCoInsAlt(underwritingDao.retrieveAlterationsPerCoIns(retrieveAlterationsPerPolicyParams));
		rappResponse.setPolicyList(underwritingDao.retrieveAlterationsPerPolicy(retrieveAlterationsPerPolicyParams));
		return rappResponse;
	}

	@Override
	public UpdatePolGenInfoSpoilageResponse updatePolGenInfoSpoilage(UpdatePolGenInfoSpoilageRequest upgisr)
			throws SQLException {
		UpdatePolGenInfoSpoilageResponse upgisResponse = new UpdatePolGenInfoSpoilageResponse();
		HashMap<String, Object> updatePolGenInfoSpoilageParams = new HashMap<String, Object>();
		updatePolGenInfoSpoilageParams.put("policyId", upgisr.getPolicyId());
		updatePolGenInfoSpoilageParams.put("status", upgisr.getStatus());
		updatePolGenInfoSpoilageParams.put("spoilCd", upgisr.getSpoilCd());
		updatePolGenInfoSpoilageParams.put("spldUser", upgisr.getSpldUser());
		updatePolGenInfoSpoilageParams.put("updateUser", upgisr.getUpdateUser());
		try{
			upgisResponse.setReturnCode(underwritingDao.updatePolGenInfoSpoilage(updatePolGenInfoSpoilageParams));
		}catch(SQLException e){
			if(e.getErrorCode()== 20001){
				upgisResponse.setReturnCode(20000);
				upgisResponse.getErrorList().add(new Error("SQLException", e.getMessage().substring(e.getMessage().indexOf(':')+2,e.getMessage().indexOf("\n"))));
			}else{
				upgisResponse.setReturnCode(0);
				upgisResponse.getErrorList().add(new Error("SQLException","Please check field values."));
			}
		}
		logger.info("UpdatePolGenInfoSpoilageResponse : "+upgisResponse.toString());
		return upgisResponse;
	}
	
	@Override
	public SavePolGenInfoOcResponse savePolGenInfoOc(SavePolGenInfoOcRequest spgip) throws SQLException {
		SavePolGenInfoOcResponse spgipResponse = new SavePolGenInfoOcResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyIdOc",spgip.getPolicyIdOc());
		params.put("lineCd",spgip.getLineCd());
		params.put("ocYear",spgip.getOcYear());
		params.put("ocSeqNo",spgip.getOcSeqNo());
		params.put("cedingId",spgip.getCedingId());
		params.put("riBinderNo",spgip.getRiBinderNo());
		params.put("coRefNo",spgip.getCoRefNo());
		params.put("coSeriesNo",spgip.getCoSeriesNo());
		params.put("altNo",spgip.getAltNo());
		params.put("cessionId",spgip.getCessionId());
		params.put("lineClassCd",spgip.getLineClassCd());
		params.put("quoteId",spgip.getQuoteId());
		params.put("refOpPolNo",spgip.getRefOpPolNo());
		params.put("prinId",spgip.getPrinId());
		params.put("contractorId",spgip.getContractorId());
		params.put("insuredDesc",spgip.getInsuredDesc());
		params.put("status",spgip.getStatus());
		params.put("reinsurerId",spgip.getReinsurerId());
		params.put("intmId",spgip.getIntmId());
		params.put("inceptDate",spgip.getInceptDate());
		params.put("expiryDate",spgip.getExpiryDate());
		params.put("lapseFrom",spgip.getLapseFrom());
		params.put("lapseTo",spgip.getLapseTo());
		params.put("issueDate",spgip.getIssueDate());
		params.put("effDate",spgip.getEffDate());
		params.put("distDate",spgip.getDistDate());
		params.put("acctDate",spgip.getAcctDate());
		params.put("currencyCd",spgip.getCurrencyCd());
		params.put("currencyRt",spgip.getCurrencyRt());
		params.put("createUser",spgip.getCreateUser());
		params.put("createDate",spgip.getCreateDate());
		params.put("updateUser",spgip.getUpdateUser());
		params.put("updateDate",spgip.getUpdateDate());

		params.put("projId",spgip.getProjId());
		params.put("projDesc",spgip.getProjDesc());
		params.put("riskId",spgip.getRiskId());
		params.put("maxSi",spgip.getMaxSi());
		params.put("objectId",spgip.getObjectId());
		params.put("site",spgip.getSite());
		params.put("duration",spgip.getDuration());
		params.put("testing",spgip.getTesting());
		params.put("regionCd",spgip.getRegionCd());
		params.put("provinceCd",spgip.getProvinceCd());
		params.put("cityCd",spgip.getCityCd());
		params.put("districtCd",spgip.getDistrictCd());
		params.put("blockCd",spgip.getBlockCd());
		params.put("latitude",spgip.getLatitude());
		params.put("longitude",spgip.getLongitude());
		params.put("projCreateUser",spgip.getProjCreateUser());
		params.put("projCreateDate",spgip.getProjCreateDate());
		params.put("projUpdateUser",spgip.getProjUpdateUser());
		params.put("projUpdateDate",spgip.getProjUpdateDate());
		try{
			spgipResponse.setReturnCode(underwritingDao.savePolGenInfoOc(params));
		}catch(Exception ex){ 
			spgipResponse.setReturnCode(0);
			spgipResponse.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			ex.printStackTrace();
		}
		return spgipResponse;
	}
	
	@Override
	public UpdatePolGenInfoResponse updatePolGenInfo(UpdatePolGenInfoRequest uppgif) throws SQLException {
		UpdatePolGenInfoResponse uppgifResponse = new UpdatePolGenInfoResponse();
		try{
			HashMap<String, Object> updatePolGenInfoParams = new HashMap<String, Object>();
			updatePolGenInfoParams.put("policyId",uppgif.getPolicyId());
			updatePolGenInfoParams.put("riskId",uppgif.getRiskId());
			updatePolGenInfoParams.put("coRefNo",uppgif.getCoRefNo());
			updatePolGenInfoParams.put("riBinderNo",uppgif.getRiBinderNo());
			updatePolGenInfoParams.put("intmId",uppgif.getIntmId());
			updatePolGenInfoParams.put("projDesc",uppgif.getProjDesc());
			updatePolGenInfoParams.put("latitude",uppgif.getLatitude());
			updatePolGenInfoParams.put("longtitude", uppgif.getLongitude());
			updatePolGenInfoParams.put("updateUser",uppgif.getUpdateUser());
			updatePolGenInfoParams.put("updateDate",uppgif.getUpdateDate());
			uppgifResponse.setReturnCode(underwritingDao.updatePolGenInfo(updatePolGenInfoParams));
		}catch(Exception ex){
			uppgifResponse.setReturnCode(0);
			uppgifResponse.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			ex.printStackTrace();
		}
		return uppgifResponse;
	}

	@Override
	public PostPolicyResponse postPolicy(PostPolicyRequest ppr) throws SQLException {
		PostPolicyResponse pprResponse = new PostPolicyResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyId",ppr.getPolicyId());
		params.put("updateUser",ppr.getUpdateUser());
		params.put("status",ppr.getStatus());
		params.put("altCancelTag",ppr.getAltCancelTag());
		
		try{
			pprResponse.setReturnCode(underwritingDao.postPolicy(params));
		}catch(SQLException ex){
			ex.printStackTrace();
			if(ex.getErrorCode()== 20000){
				pprResponse.setReturnCode(20000);
				pprResponse.getErrorList().add(new Error("SQLException", ex.getMessage().substring(ex.getMessage().indexOf(':')+2,ex.getMessage().indexOf("\n"))));
			}else{
				pprResponse.setReturnCode(0);
				pprResponse.getErrorList().add(new Error("SQLException","Please check field values."));
			}
		}
		logger.info("postPolicy : " + pprResponse.toString());
		return pprResponse;
	}
	
	@Override
	public GenHundredValPolPrintingResponse genHundredValPolPrinting(GenHundredValPolPrintingRequest ghvppr)
			throws SQLException {
		GenHundredValPolPrintingResponse response = new GenHundredValPolPrintingResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyId", ghvppr.getPolicyId());
		params.put("projId", ghvppr.getProjId());
		params.put("riskId", ghvppr.getRiskId());
		params.put("lineCd", ghvppr.getLineCd());
		params.put("treatyShare", ghvppr.getTreatyShare());
		params.put("createUser", ghvppr.getCreateUser());
		params.put("createDate", ghvppr.getCreateDate());
		params.put("updateUser", ghvppr.getUpdateUser());
		params.put("updateDate", ghvppr.getUpdateDate());
		try{
			response.setReturnCode(underwritingDao.genHundredValPolPrinting(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrievePolFullCoverageResponse retrievePolFullCoverage(RetrievePolFullCoverageRequest rpcr)
			throws SQLException {
		RetrievePolFullCoverageResponse rpfcResponse = new RetrievePolFullCoverageResponse();
		
		HashMap<String, Object> retrievePolFullCoverageParams = new HashMap<String, Object>();
		retrievePolFullCoverageParams.put("policyId", rpcr.getPolicyId());
		retrievePolFullCoverageParams.put("policyNo", rpcr.getPolicyNo());
		
		rpfcResponse.setPolicy(underwritingDao.retrievePolicyFullCoverage(retrievePolFullCoverageParams));
		
		logger.info("retrievePolFullCoverageResponse : " + rpfcResponse.toString());
		
		return rpfcResponse;
	}

	@Override
	public SavePolFullCoverageResponse savePolFullCoverage(SavePolFullCoverageRequest spfcr) throws SQLException {
		SavePolFullCoverageResponse spfcResponse = new SavePolFullCoverageResponse();
		try{
			HashMap<String, Object> savePolFullCoverageParams = new HashMap<String, Object>();
			savePolFullCoverageParams.put("policyId",spfcr.getPolicyId());
			savePolFullCoverageParams.put("riskId",spfcr.getRiskId());
			savePolFullCoverageParams.put("projId",spfcr.getProjId());
			savePolFullCoverageParams.put("treatyShare", spfcr.getTreatyShare());
			savePolFullCoverageParams.put("sectionISi",spfcr.getSectionISi());
			savePolFullCoverageParams.put("sectionIISi",spfcr.getSectionIISi());
			savePolFullCoverageParams.put("sectionIIISi",spfcr.getSectionIIISi());
			savePolFullCoverageParams.put("totalSi",spfcr.getTotalSi());
			savePolFullCoverageParams.put("sectionIPrem",spfcr.getSectionIPrem());
			savePolFullCoverageParams.put("sectionIIPrem",spfcr.getSectionIIPrem());
			savePolFullCoverageParams.put("sectionIIIPrem",spfcr.getSectionIIIPrem());
			savePolFullCoverageParams.put("totalPrem",spfcr.getTotalPrem());
			savePolFullCoverageParams.put("currencyCd",spfcr.getCurrencyCd());
			savePolFullCoverageParams.put("currencyRt",spfcr.getCurrencyRt());
			savePolFullCoverageParams.put("pctShare",spfcr.getPctShare());
			savePolFullCoverageParams.put("pctPml",spfcr.getPctPml());
			savePolFullCoverageParams.put("totalValue",spfcr.getTotalValue());
			savePolFullCoverageParams.put("remarks",spfcr.getRemarks());
			savePolFullCoverageParams.put("cumSecISi",spfcr.getCumSecISi());
			savePolFullCoverageParams.put("cumSecIISi",spfcr.getCumSecIISi());
			savePolFullCoverageParams.put("cumSecIIISi",spfcr.getCumSecIIISi());
			savePolFullCoverageParams.put("cumTSi",spfcr.getCumTSi());
			savePolFullCoverageParams.put("cumSecIPrem",spfcr.getCumSecIPrem());
			savePolFullCoverageParams.put("cumSecIIPrem",spfcr.getCumSecIIPrem());
			savePolFullCoverageParams.put("cumSecIIIPrem",spfcr.getCumSecIIIPrem());
			savePolFullCoverageParams.put("cumTPrem",spfcr.getCumTPrem());
			savePolFullCoverageParams.put("createUser",spfcr.getCreateUser());
			savePolFullCoverageParams.put("createDate",spfcr.getCreateDate());
			savePolFullCoverageParams.put("updateUser",spfcr.getUpdateUser());
			savePolFullCoverageParams.put("updateDate",spfcr.getUpdateDate());
			savePolFullCoverageParams.put("saveFullSectionCovers",spfcr.getSaveFullSectionCovers());
			savePolFullCoverageParams.put("deleteFullSectionCovers",spfcr.getDeleteFullSectionCovers());
			savePolFullCoverageParams.put("saveDeductibleList",spfcr.getSaveDeductibleList());
			savePolFullCoverageParams.put("deleteDeductibleList",spfcr.getDeleteDeductibleList());
			
			HashMap<String, Object> res = underwritingDao.savePolFullCoverage(savePolFullCoverageParams);
			spfcResponse.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception ex) {
			spfcResponse.setReturnCode(0);
			spfcResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return spfcResponse;
	}

	@Override
	public ExtractExpiringPolicyResponse extractExpiringPolicy(ExtractExpiringPolicyRequest eepr) throws SQLException {
		ExtractExpiringPolicyResponse eepResponse = new ExtractExpiringPolicyResponse();
		try{
			HashMap<String, Object> eepParams = new HashMap<String, Object>();			
			eepParams.put("policyId", eepr.getPolicyId());
			eepParams.put("polLineCd", eepr.getPolLineCd());
			eepParams.put("polYear", eepr.getPolYear());
			eepParams.put("polSeqNo", eepr.getPolSeqNo());
			eepParams.put("polCedingId", eepr.getPolCedingId());
			eepParams.put("coSeriesNo", eepr.getCoSeriesNo());
			eepParams.put("altNo", eepr.getAltNo());
			eepParams.put("fromExpiryDate", eepr.getFromExpiryDate());
			eepParams.put("toExpiryDate", eepr.getToExpiryDate());
			eepParams.put("lineCd", eepr.getLineCd());
			eepParams.put("cedingId", eepr.getCedingId());
			eepParams.put("cessionType", eepr.getCessionType());
			eepParams.put("extractUser", eepr.getExtractUser());
			eepParams.put("recordCount", 0); 
			
			HashMap<String, Object> res = underwritingDao.extractExpiringPolicy(eepParams);
			eepResponse.setReturnCode((Integer) res.get("errorCode"));
			eepResponse.setRecordCount((Integer) eepParams.get("recordCount"));
		} catch (Exception ex) {
			eepResponse.setReturnCode(0);
			eepResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return eepResponse;
	}
	
	@Override
	public RetrieveExpPolListResponse retrieveExpPolList(RetrieveExpPolListRequest replr) throws SQLException {
		RetrieveExpPolListResponse replResponse = new RetrieveExpPolListResponse();
		
		HashMap<String, Object> retrieveExpPolListParams = new HashMap<String, Object>();
		retrieveExpPolListParams.put("policyId", replr.getPolicyId());
		retrieveExpPolListParams.put("processTag", replr.getProcessTag());
		retrieveExpPolListParams.put("renewalFlag", replr.getRenewalFlag());
		retrieveExpPolListParams.put("extractUser", replr.getExtractUser());
		retrieveExpPolListParams.put("renewable", replr.getRenewable());
		
		replResponse.setExpPolicyList(underwritingDao.retrieveExpPolList(retrieveExpPolListParams));
		
		logger.info("RetrieveExpPolListResponse : " + replResponse.toString());
		
		return replResponse;
	}

	@Override
	public RetrievePolDistResponse retrievePolDist(RetrievePolDistRequest rpcr) throws SQLException {
		RetrievePolDistResponse rpcrResponse = new RetrievePolDistResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyId", rpcr.getPolicyId());
		params.put("distId", rpcr.getDistId());
		rpcrResponse.setPolDistribution(underwritingDao.retrievePolDist(params));
		rpcrResponse.setInProgCoins(underwritingDao.retrieveInProgCoins(params));
		rpcrResponse.setMissingCoins(underwritingDao.retrieveMissingCoins(params));
		return rpcrResponse;
	}
	
	@Override
	public RetrievePolDistResponse retrievePolDistCum(RetrievePolDistRequest rpcr) throws SQLException {
		RetrievePolDistResponse rpcrResponse = new RetrievePolDistResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyId", rpcr.getPolicyId());
		params.put("distId", rpcr.getDistId());
		rpcrResponse.setPolDistribution(underwritingDao.retrievePolDistCum(params));
		return rpcrResponse;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ProcessRenewablePolicyResponse processRenewablePolicy(ProcessRenewablePolicyRequest prpr)
			throws SQLException {
		ProcessRenewablePolicyResponse prpResponse = new ProcessRenewablePolicyResponse();
		HashMap<String, Object> daoResp = new HashMap<String, Object>();
		try{
			HashMap<String, Object> processRenewablePolicyParams = new HashMap<String, Object>();
			
			processRenewablePolicyParams.put("renAsIsPolicyList", prpr.getRenAsIsPolicyList());
			processRenewablePolicyParams.put("renWithChangesPolicyList", prpr.getRenWithChangesPolicyList());
			processRenewablePolicyParams.put("nonRenPolicyList", prpr.getNonRenPolicyList());
			
			logger.info(processRenewablePolicyParams.toString());
			
			daoResp = (underwritingDao.processRenewablePolicy(processRenewablePolicyParams));
			prpResponse.setRenAsIsPolicyList((List<PolicyAsIs>) daoResp.get("renAsIsPolicyList"));
			prpResponse.setRenWithChangesPolicyList((List<PolicyWithChanges>) daoResp.get("renWithChangesPolicyList"));
			prpResponse.setNonRenPolicyList((List<PolicyNonRenewal>) daoResp.get("nonRenPolicyList"));
		}catch(Exception ex){
			prpResponse.setReturnCode(0);
			prpResponse.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			ex.printStackTrace();
		}
		logger.info("POST DAO prpResponse : " + daoResp);
		logger.info("POST prpResponse : " + prpResponse.toString());
		return prpResponse;
	}
	
	@Override
	public RetrieveRiskDistributionResponse retrieveRiskDist(RetrieveRiskDistributionRequest rrdr) throws SQLException {
		RetrieveRiskDistributionResponse response = new RetrieveRiskDistributionResponse();
		HashMap<String, Object> distWriskParam = new HashMap<String, Object>();
		HashMap<String, Object> wriskLimitParam = new HashMap<String, Object>();
		HashMap<String, Object> riskDistWparamParam = new HashMap<String, Object>();
		distWriskParam.put("policyId", rrdr.getPolicyId());
		
		try{
			response.setDistWrisk(underwritingDao.retrieveDistWrisk(distWriskParam));
			response.setWriskLimit(underwritingDao.retrieveWriskLimit(distWriskParam));
			riskDistWparamParam.put("riskDistId", response.getDistWrisk().getRiskDistId());
			riskDistWparamParam.put("altNo", response.getDistWrisk().getAltNo());
			riskDistWparamParam.put("policyId", rrdr.getPolicyId());
			response.setDistRiskWparam(underwritingDao.retrieveDistRiskWparam(riskDistWparamParam));
			response.setUndistAlt(underwritingDao.retrieveUndistAlt(distWriskParam));
			response.setDistAlt(underwritingDao.retrieveDistAlt(distWriskParam));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrievePoolDistributionResponse retrievePoolDist(RetrievePoolDistributionRequest rpdr) throws SQLException {
		RetrievePoolDistributionResponse response = new RetrievePoolDistributionResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("riskDistId", rpdr.getRiskDistId());
		params.put("altNo", rpdr.getAltNo());
		params.put("policyId", rpdr.getPolicyId());
		response.setPoolDistList(underwritingDao.retrievePoolDist(params));
		return response;
	}

	@Override
	public RetrieveDistCoInsResponse retrieveDistCoIns(RetrieveDistCoInsRequest rdcir) throws SQLException {
		RetrieveDistCoInsResponse response = new RetrieveDistCoInsResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("riskDistId", rdcir.getRiskDistId());
		params.put("policyId", rdcir.getPolicyId());
		response.setDistCoInsList(underwritingDao.retrieveDistCoIns(params));
		response.setPostedDist(underwritingDao.getPostedCoins(params));
		return response;
	}

	@Override
	public PostDistributionResponse postDistribution(PostDistributionRequest pdr) throws SQLException {
		PostDistributionResponse pdrResponse = new PostDistributionResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyId",pdr.getPolicyId());
		params.put("riskDistId",pdr.getRiskDistId());
		params.put("distId",pdr.getDistId());
		params.put("user",pdr.getUser());
		try{
			pdrResponse.setReturnCode(underwritingDao.postDistribution(params));
		}catch(Exception ex){
			pdrResponse.setReturnCode(0);
			pdrResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return pdrResponse;
	}

	@Override
	public RetrievePoolDistributionResponse retrievePolPoolDist(RetrievePoolDistributionRequest rpdr)
			throws SQLException {
		RetrievePoolDistributionResponse response = new RetrievePoolDistributionResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("distId", rpdr.getRiskDistId());
		params.put("policyId", rpdr.getPolicyId());
		response.setPoolDistList(underwritingDao.retrievePolPoolDist(params));
		return response;
	}
	
	@Override
	public RetrievePoolDistributionResponse retrievePolPoolDistCum(RetrievePoolDistributionRequest rpdr)
			throws SQLException {
		RetrievePoolDistributionResponse response = new RetrievePoolDistributionResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("distId", rpdr.getRiskDistId());
		params.put("policyId", rpdr.getPolicyId());
		response.setPoolDistList(underwritingDao.retrievePolPoolDistCum(params));
		return response;
	}
	
	@Override
	public RetrievePolForPurgingResponse retrievePolForPurging(RetrievePolForPurgingRequest rpfpr) throws SQLException {
		RetrievePolForPurgingResponse response = new RetrievePolForPurgingResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyId", rpfpr.getPolicyId());
		response.setPolForPurging(underwritingDao.retrievePolForPurging(params));
		return response;
	}

	@Override
	public PurgeExpiringPolResponse purgeExpiryPol(PurgeExpiringPolRequest spfcr) throws SQLException {
		PurgeExpiringPolResponse prpResponse = new PurgeExpiringPolResponse();
		try{
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("deletePurge", spfcr.getDeletePurge());
			
			HashMap<String, Object> res = underwritingDao.purgeExpiringPol(params);
			prpResponse.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			prpResponse.setReturnCode(0);
			prpResponse.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			ex.printStackTrace();
		}
		
		return prpResponse;
	}
	
	@Override
	public SaveExpCovResponse saveExpCoverage(SaveExpCovRequest secr) throws SQLException {
		SaveExpCovResponse response = new SaveExpCovResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("policyId", secr.getPolicyId());
			params.put("projId", secr.getProjId());
			params.put("riskId", secr.getRiskId());
			params.put("sectionISi", secr.getSectionISi());
			params.put("sectionIiSi", secr.getSectionIiSi());
			params.put("sectionIiiSi", secr.getSectionIiiSi());
			params.put("totalSi", secr.getTotalSi());
			params.put("sectionIPrem", secr.getSectionIPrem());
			params.put("sectionIiPrem", secr.getSectionIiiPrem());
			params.put("sectionIiiPrem", secr.getSectionIiiPrem());
			params.put("totalPrem", secr.getTotalPrem());
			params.put("currencyCd", secr.getCurrencyCd());
			params.put("currencyRt", secr.getCurrencyRt());
			params.put("pctShare", secr.getPctShare());
			params.put("pctPml", secr.getPctPml());
			params.put("totalValue", secr.getTotalValue());
			params.put("remarks", secr.getRemarks());
			params.put("origSeciSi", secr.getOrigSeciSi());
			params.put("origSeciiSi", secr.getOrigSeciiSi());
			params.put("origSeciiiSi", secr.getOrigSeciiiSi());
			params.put("origTsi", secr.getOrigTsi());
			params.put("origSeciPrem", secr.getOrigSeciPrem());
			params.put("origSeciiPrem", secr.getOrigSeciiPrem());
			params.put("origSeciiiPrem", secr.getOrigSeciiiPrem());
			params.put("origTprem", secr.getOrigTprem());
			params.put("createUser", secr.getCreateUser());
			params.put("createDate", secr.getCreateDate());
			params.put("updateUser", secr.getUpdateUser());
			params.put("updateDate", secr.getUpdateDate());
			params.put("expSecCovers", secr.getExpSecCovers());
			params.put("delexpSecCovers", secr.getDelexpSecCovers());
			
			HashMap<String, Object> res = underwritingDao.saveExpCov(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch (Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public SaveRiskDistResponse saveRiskDist(SaveRiskDistRequest srdr) throws SQLException {
		SaveRiskDistResponse srdrResponse = new SaveRiskDistResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveWParam", srdr.getSaveWParam());
		params.put("delWParam", srdr.getDelWParam());
		params.put("policyId", srdr.getPolicyId());
		params.put("riskDistId",srdr.getRiskDistId());
		params.put("altNo",srdr.getAltNo());
		params.put("retLineAmt",srdr.getRetLineAmt());
		params.put("autoCalc",srdr.getAutoCalc());
		params.put("updateUser",srdr.getUpdateUser());
		params.put("trtyLimitSec2", srdr.getTrtyLimitSec2());
		params.put("seciiPremTag", srdr.getSeciiPremTag());
		try {
			if(srdr.getAutoCalc().equals("Y")){
				srdrResponse.setReturnCode(underwritingDao.autoCalcDist(params));
			}else{
				srdrResponse.setReturnCode(underwritingDao.saveRiskDist(params));
			}
		}catch (Exception ex){
			logger.info(ex.getMessage());
			srdrResponse.setReturnCode(0);
			srdrResponse.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
//			ex.printStackTrace();
		}
		return srdrResponse;
	}

	@Override
	public DistRiskResponse distributeRiskDist(DistRiskRequest drr) throws SQLException {
		DistRiskResponse drrResponse = new DistRiskResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("riskDistId",drr.getRiskDistId());
		params.put("altNo",drr.getAltNo());
		params.put("updateUser",drr.getUpdateUser());
		try{
			drrResponse.setReturnCode(underwritingDao.distributeRiskDist(params));
		}catch (Exception ex){
			
			drrResponse.setReturnCode(0);
			drrResponse.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			ex.printStackTrace();
		}
		logger.info(drrResponse.toString());
		return drrResponse;
	}

	@Override
	public RetrievePolDistListResponse retrievePolDistList(RetrievePolDistListRequest rpdlr) throws SQLException {
		RetrievePolDistListResponse response = new RetrievePolDistListResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("distId", rpdlr.getDistId());
		params.put("riskDistId", rpdlr.getRiskDistId());
		params.put("status", rpdlr.getStatus());
		params.put("lineCd", rpdlr.getLineCd());
		params.put("policyNo", rpdlr.getPolicyNo());
		params.put("cedingName", rpdlr.getCedingName());
		params.put("insuredDesc", rpdlr.getInsuredDesc());
		params.put("riskName", rpdlr.getRiskName());
		params.put("totalSi", rpdlr.getTotalSi());
		params.put("distDateFrom", rpdlr.getDistDateFrom());
		params.put("distDateTo", rpdlr.getDistDateTo());
		params.put("acctDateFrom", rpdlr.getAcctDateFrom());
		params.put("acctDateTo", rpdlr.getAcctDateTo());
		params.put("statusArr", rpdlr.getStatusArr());
		response.setPolDistList(underwritingDao.retrievePolDistList(params));
		
		return response;
	}
	
	@Override
	public SaveExpCatPerilResponse saveExpCatPeril(SaveExpCatPerilRequest scpr) throws SQLException {
		SaveExpCatPerilResponse response = new SaveExpCatPerilResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("expCatPeril", scpr.getExpcatPeril());
			
			HashMap<String, Object> res = underwritingDao.saveExpCatPeril(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch (Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public NegateDistributionResponse negateDistribution(NegateDistributionRequest ndr) throws SQLException {
		NegateDistributionResponse ndrResponse = new NegateDistributionResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyId",ndr.getPolicyId());
		params.put("riskDistId",ndr.getRiskDistId());
		params.put("distId",ndr.getDistId());
		params.put("updateUser", ndr.getUpdateUser());
		try{
			ndrResponse.setReturnCode(underwritingDao.negateDistribution(params));
			ndrResponse.setPostedDist(underwritingDao.getPostedCoins(params));
		}catch(Exception ex){
			ndrResponse.setReturnCode(0);
			ndrResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return ndrResponse;
	}

	@Override
	public SaveExpGenInfoResponse saveExpGenInfo(SaveExpGenInfoRequest segir) throws SQLException {
		SaveExpGenInfoResponse response = new SaveExpGenInfoResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("saveExpRenewable", segir.getSaveExpRenewable());
			HashMap<String, Object> res = underwritingDao.saveExpGenInfo(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception ex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrievePolDistWarningResponse retrievePolDistWarning(RetrievePolDistWarningRequest rpdwr)
			throws SQLException {
		RetrievePolDistWarningResponse response = new RetrievePolDistWarningResponse();
		try {

			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("riskDistId", rpdwr.getRiskDistId());
			params.put("altNo", rpdwr.getAltNo());

			response.setWarningList(underwritingDao.retrievePolDistWarning(params));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return response;
	}

	@Override
	public RetrievePolDistInstResponse retrievePolDistInst(RetrievePolDistInstRequest rpdir) throws SQLException {
		RetrievePolDistInstResponse response = new RetrievePolDistInstResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyId", rpdir.getPolicyId());
		response.setList(underwritingDao.retrievePolDistInst(params));
		return response;
	}

	@Override
	public RetrievePoolDistributionResponse retrievePolDistInstPool(RetrievePolDistInstPoolRequest rpdir)
			throws SQLException {
		RetrievePoolDistributionResponse response = new RetrievePoolDistributionResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("distId",rpdir.getDistId());
		params.put("altNo",rpdir.getAltNo());
		params.put("policyId",rpdir.getPolicyId());
		params.put("instNo",rpdir.getInstNo());
		response.setPoolDistList(underwritingDao.retrievePolDistInstPool(params));
		return response;
	}

	@Override
	public RetrievePolInstTagAcctDateResponse retrievePolInstTagAcctDate(RetrievePolInstTagAcctDateRequest rpdir)
			throws SQLException {
		RetrievePolInstTagAcctDateResponse response = new RetrievePolInstTagAcctDateResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyId", rpdir.getPolicyId());
		 
		response.setInstTag(underwritingDao.getInstTag(params));
		if(response.getInstTag().equals("N")){
			response.setAcctDate(underwritingDao.getAcctingDate(params));
			response.setBookingDate(underwritingDao.retrievePolInwardBal(params).get(0).getInwPolBalance().get(0).getBookingDate());
		}
		logger.info("RetrievePolInstTagAcctDateResponse: "+ response.toString());
		return response;
	}

	@Override
	public RetrieveValidBookingDateResponse retrieveValidBookingDate(RetrieveValidBookingDateRequest rpdir)
			throws SQLException {
		RetrieveValidBookingDateResponse response = new RetrieveValidBookingDateResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("date1", rpdir.getDate1());
		params.put("date2", rpdir.getDate2());
		response.setDates(underwritingDao.retrieveValidBookingDate(params));
		return response;
	}

	@Override
	public UpdatePolOpenCoverStatusResponse updatePolOpenCoverStatus(UpdatePolOpenCoverStatusRequest uphcsr)
			throws SQLException {
		UpdatePolOpenCoverStatusResponse response = new UpdatePolOpenCoverStatusResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyIdOc", uphcsr.getPolicyIdOc());
		params.put("updateUser", uphcsr.getUpdateUser());
		try{
			response.setReturnCode(underwritingDao.updatePolOpenCoverStatus(params));
		}catch(Exception e){
			response.setReturnCode(0);
		}
		return response;
	}

	@Override
	public BatchDistributionResponse batchDistribution(BatchDistributionRequest uphcsr) throws SQLException {
		BatchDistributionResponse response = new BatchDistributionResponse();
		for (BatchDistribution b : uphcsr.getDistList()) {
			try{
				HashMap<String, Object> params = new HashMap<String, Object>();
				params.put("riskDistId",b.getRiskDistId());
				params.put("altNo",b.getAltNo());
				params.put("updateUser",uphcsr.getUser());
				b.setMessage(underwritingDao.validateForDist(params));
				if(b.getMessage().equals("Distributed")){
					underwritingDao.distributeRiskDist(params);
				}
				response.getUpdateResult().add(b);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		logger.info("BatchDistributionResponse : "+ response.toString());
		return response;
	}

	@Override
	public BatchPostingResponse batchPosting(BatchPostingRequest uphcsr) throws SQLException {
		BatchPostingResponse response = new BatchPostingResponse();
		for (BatchPost b : uphcsr.getDistList()) {
			try{
				HashMap<String, Object> params = new HashMap<String, Object>();
				
//				private Integer riskDistId;
//				private Integer policyId;
//				private String policyNo;
//				private String distId;
//				private String createDate;
//				private Integer altNo;
//				private String message;
				
				params.put("riskDistId",b.getRiskDistId());
				params.put("policyId", b.getPolicyId());
				params.put("distId", b.getDistId());
				params.put("altNo",b.getAltNo());
				params.put("user",uphcsr.getUser());
				
				if(underwritingDao.retrieveInProgCoins(params).size() != 0){
					b.setMessage("Unable to post the distribution to final. Some Co-Insurance policies are still In Progress.");
				}else if(underwritingDao.retrieveMissingCoins(params).size() != 0){
					b.setMessage("Unable to post the distribution to final. Co-Insurance policies must have alterations.");
				};
				if(b.getMessage()==null){
					b.setMessage("Posted");
					underwritingDao.postDistribution(params);
				}
				response.getUpdateResult().add(b);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		logger.info("BatchDistributionResponse : "+ response.toString());
		return response;
	}

	@Override
	public RetrieveLastExtractInfoResponse retrieveLastExtractInfo() throws SQLException {
		RetrieveLastExtractInfoResponse response = new RetrieveLastExtractInfoResponse();
		response.setInfo(underwritingDao.retrieveLastExtractInfo());
		return response;
	}

	@Override
	public RetrievePolDistListResponse retrieveNegateDistList(RetrievePolDistListRequest rpdir) throws SQLException {
		RetrievePolDistListResponse response = new RetrievePolDistListResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyNo", rpdir.getPolicyNo());
		params.put("cedingName", rpdir.getCedingName());
		params.put("insuredDesc", rpdir.getInsuredDesc());
		params.put("riskName", rpdir.getRiskName());
		response.setPolDistList(underwritingDao.retrieveNegateDistList(params));
		return response;
	}

	@Override
	public ExtGenRenExpPolicyResponse extractRenExpPolicy(ExtGenRenExpPolicyRequest erepr) throws SQLException {
		ExtGenRenExpPolicyResponse resp = new ExtGenRenExpPolicyResponse();
		
		
		
		String errorMsg = "";
		
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			PolicyAsIs renPol = new PolicyAsIs();
			renPol.setPolicyId(erepr.getPolicyId());
			renPol.setProcBy(erepr.getProcBy());
			params.put("renPol", renPol);
			
			resp.setRenewedPolicy((PolicyAsIs) underwritingDao.extractRenExpPolicy(params).get("renPol"));
		} catch (HibernateException e) {
			errorMsg = e.getMessage();
			resp.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUGHE", "HibernateException Exception : " + errorMsg));
		} catch (org.springframework.dao.DataIntegrityViolationException e) {
			errorMsg = e.getMessage();
			resp.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUGDIV", "DataIntegrityViolation Exception : " + errorMsg));
		} catch (SQLException sqle) { 
			errorMsg = sqle.getMessage();
			resp.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUGSQL", "SQL Exception : " + errorMsg)); 
		} catch (Exception e) {
			resp.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUGGEN", "General Exception"));
		}
		
		return resp;
	}
}
