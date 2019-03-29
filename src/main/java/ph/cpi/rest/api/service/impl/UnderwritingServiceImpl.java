package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UnderwritingDao;
import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.request.RetrievePolAlopItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolAlopRequest;
import ph.cpi.rest.api.model.request.RetrievePolAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrievePolCATPerilRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoInsuranceRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtRequest;
import ph.cpi.rest.api.model.request.RetrievePolGenInfoRequest;
import ph.cpi.rest.api.model.request.RetrievePolInwardBalRequest;
import ph.cpi.rest.api.model.request.RetrievePolItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyListingRequest;
import ph.cpi.rest.api.model.request.SavePolAlopItemRequest;
import ph.cpi.rest.api.model.request.SavePolAlopRequest;
import ph.cpi.rest.api.model.request.SavePolAttachmentRequest;
import ph.cpi.rest.api.model.request.SavePolCoverageRequest;
import ph.cpi.rest.api.model.request.SavePolGenInfoRequest;
import ph.cpi.rest.api.model.request.SavePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.SavePolicyDetailsRequest;
import ph.cpi.rest.api.model.response.RetrievePolAlopItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolAlopResponse;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrievePolCATPerilResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoInsuranceResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtResponse;
import ph.cpi.rest.api.model.response.RetrievePolGenInfoResponse;
import ph.cpi.rest.api.model.response.RetrievePolInwardBalResponse;
import ph.cpi.rest.api.model.response.RetrievePolItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyListingResponse;
import ph.cpi.rest.api.model.response.SavePolAlopItemResponse;
import ph.cpi.rest.api.model.response.SavePolAlopResponse;
import ph.cpi.rest.api.model.response.SavePolAttachmentResponse;
import ph.cpi.rest.api.model.response.SavePolCoverageResponse;
import ph.cpi.rest.api.model.response.SavePolGenInfoResponse;
import ph.cpi.rest.api.model.response.SavePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.SavePolicyDetailsResponse;
import ph.cpi.rest.api.service.UnderwritingService;

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
		logger.info("retrievePolInwardBalResponse : " + rpibResponse.toString());
		
		return rpibResponse;
	}

	@Override
	public RetrievePolCoInsuranceResponse retrievePolCoInsurance(RetrievePolCoInsuranceRequest rpcip)
			throws SQLException {
		RetrievePolCoInsuranceResponse rpcoiResponse = new RetrievePolCoInsuranceResponse();
		HashMap<String, Object> retrievePolCoInsuranceParams = new HashMap<String, Object>();
		retrievePolCoInsuranceParams.put("policyId",rpcip.getPolicyId());
		retrievePolCoInsuranceParams.put("policyNo",rpcip.getPolicyNo());
		rpcoiResponse.setPolicyList(underwritingDao.retrievePolCoInsurance(retrievePolCoInsuranceParams));
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
		
		rpiresponse.setItem(underwritingDao.retrievePolItem(retrievePolItemParams));
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
		
		rpcpresponse.setCatPeril(underwritingDao.retrievePolCATPeril(retrievePolCATPerilParams));
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
			savePolAlopItemParams.put("savePolAlopItemList", spaip.getSaveAlopItemList());
			
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
		retrievePolicyListingParams.put("totalSi", rplp.getTotalSi());
		retrievePolicyListingParams.put("totalPrem", rplp.getTotalPrem());
		retrievePolicyListingParams.put("issueDate", rplp.getIssueDate());
		retrievePolicyListingParams.put("expiryDate", rplp.getExpiryDate());
		retrievePolicyListingParams.put("inceptDate", rplp.getInceptDate());
		retrievePolicyListingParams.put("acctDate", rplp.getAcctDate());
		retrievePolicyListingParams.put("statusDesc", rplp.getStatusDesc());
		
		rplResponse.setPolicyList(underwritingDao.retrievePolicyListing(retrievePolicyListingParams));
		logger.info("retrievePolicyListingResponse : " + rplResponse.toString());
		
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
			
			spaResponse.setReturnCode(underwritingDao.savePolAttachments(savePolAttachmentParams));
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
			savePolCoverageParams.put("currencyCd",spcr.getCurrencyCd());
			savePolCoverageParams.put("currencyRt",spcr.getCurrencyRt());
			savePolCoverageParams.put("pctShare",spcr.getPctShare());
			savePolCoverageParams.put("pctPml",spcr.getPctPml());
			savePolCoverageParams.put("totalValue",spcr.getTotalValue());
			savePolCoverageParams.put("remarks",spcr.getRemarks());
			savePolCoverageParams.put("createUser",spcr.getCreateUser());
			savePolCoverageParams.put("createDate",spcr.getCreateDate());
			savePolCoverageParams.put("updateUser",spcr.getUpdateUser());
			savePolCoverageParams.put("updateDate",spcr.getUpdateDate());
			savePolCoverageParams.put("saveSectionCovers",spcr.getSaveSectionCovers());
			savePolCoverageParams.put("deleteSectionCovers",spcr.getDeleteSectionCovers());
			
			
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
	public SavePolGenInfoResponse savePolGenInfo(SavePolGenInfoRequest spgip) throws SQLException {
		SavePolGenInfoResponse spgiResponse = new SavePolGenInfoResponse();
		
		try {
			HashMap<String, Object> savePolGenInfoParams = new HashMap<String, Object>();
			
			savePolGenInfoParams.put("policyNo", "");
			savePolGenInfoParams.put("outPolicyId", "");
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
			savePolGenInfoParams.put("timeExec", spgip.getTimeExec());
			savePolGenInfoParams.put("noClaimPd", spgip.getNoClaimPd());
			savePolGenInfoParams.put("prjCreateUser", spgip.getPrjCreateUser());
			savePolGenInfoParams.put("prjCreateDate", spgip.getPrjCreateDate());
			savePolGenInfoParams.put("prjUpdateUser", spgip.getPrjUpdateUser());
			savePolGenInfoParams.put("prjUpdateDate", spgip.getPrjUpdateDate());
			
			HashMap<String, Object> res = underwritingDao.savePolGenInfo(savePolGenInfoParams);
			
			spgiResponse.setReturnCode((Integer) res.get("errorCode"));
			spgiResponse.setPolicyId((Integer) res.get("outPolicyId"));
			spgiResponse.setPolicyNo((String) res.get("policyNo"));
			
		} catch (SQLException e) {
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
			
			savePolicyDetailsParams.put("quotationNo", spdp.getQuotationNo());
			savePolicyDetailsParams.put("holdCoverNo", spdp.getHoldCoverNo());
			savePolicyDetailsParams.put("openPolicyNo", spdp.getOpenPolicyNo());
			savePolicyDetailsParams.put("optionId", spdp.getOptionId());
			savePolicyDetailsParams.put("inceptDate", spdp.getInceptDate());
			savePolicyDetailsParams.put("expiryDate", spdp.getExpiryDate());
			
			HashMap<String, Object> res = underwritingDao.savePolicyDetails(savePolicyDetailsParams);
			
		} catch (SQLException e) {
			spdResponse.setReturnCode(0);
			spdResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			e.printStackTrace();
		}
		
		
		return spdResponse;
	}
}
