package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UnderwritingDao;
import ph.cpi.rest.api.model.request.RetrievePolCoInsuranceRequest;
import ph.cpi.rest.api.model.request.RetrievePolInwardBalRequest;
import ph.cpi.rest.api.model.response.RetrievePolCoInsuranceResponse;
import ph.cpi.rest.api.model.response.RetrievePolInwardBalResponse;
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
		rpibResponse.setPolicy(underwritingDao.retrievePolInwardBal(retrievePolInwardBalParams));
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
		rpcoiResponse.setPolicy(underwritingDao.retrievePolCoInsurance(retrievePolCoInsuranceParams));
		logger.info("retrievePolCoInsuranceResponse : " + rpcoiResponse.toString());
		
		return rpcoiResponse;
	}



}
