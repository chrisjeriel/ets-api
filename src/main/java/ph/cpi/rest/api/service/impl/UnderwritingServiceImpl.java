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
import ph.cpi.rest.api.model.request.RetrievePolAttachmentOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrievePolCATPerilRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoInsuranceRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtRequest;
import ph.cpi.rest.api.model.request.RetrievePolGenInfoRequest;
import ph.cpi.rest.api.model.request.RetrievePolInwardBalRequest;
import ph.cpi.rest.api.model.request.RetrievePolItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.SavePolAttachmentRequest;
import ph.cpi.rest.api.model.request.SavePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.response.RetrievePolAlopItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolAlopResponse;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrievePolCATPerilResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoInsuranceResponse;
import ph.cpi.rest.api.model.request.SavePolCoverageRequest;
import ph.cpi.rest.api.model.request.SavePolHoldCoverRequest;
import ph.cpi.rest.api.model.response.RetrievePolCoverageResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtResponse;
import ph.cpi.rest.api.model.response.RetrievePolGenInfoResponse;
import ph.cpi.rest.api.model.response.RetrievePolInwardBalResponse;
import ph.cpi.rest.api.model.response.RetrievePolItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.SavePolAttachmentResponse;
import ph.cpi.rest.api.model.response.SavePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.SavePolCoverageResponse;
import ph.cpi.rest.api.model.response.SavePolHoldCoverResponse;
import ph.cpi.rest.api.model.response.SaveQuoteCoverageResponse;
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
		retrievePolAttachmentOcParams.put("policyIdoc", rpaor.getPolicyIdOc());
		retrievePolAttachmentOcParams.put("openPolicyNo", rpaor.getOpenPolicyNo());
		
		rpaoResponse.setAttachmentsList(underwritingDao.retrievePolAttachmentOcList(retrievePolAttachmentOcParams));
		logger.info("retrievePolAttachmentResponse : " + rpaoResponse.toString());
		return rpaoResponse;
	}


}
