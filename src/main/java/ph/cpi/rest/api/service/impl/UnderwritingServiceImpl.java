package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UnderwritingDao;
import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.request.RetrievePolAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrievePolCATPerilRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtRequest;
import ph.cpi.rest.api.model.request.RetrievePolItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.SavePolAttachmentRequest;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrievePolCATPerilResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtResponse;
import ph.cpi.rest.api.model.response.RetrievePolItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.SavePolAttachmentResponse;
import ph.cpi.rest.api.service.UnderwritingService;

@Component
public class UnderwritingServiceImpl implements UnderwritingService {

	@Autowired
	UnderwritingDao underwritingDao;
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteServiceImpl.class);
	
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
}
