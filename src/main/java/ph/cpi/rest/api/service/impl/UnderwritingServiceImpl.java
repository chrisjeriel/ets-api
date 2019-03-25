package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UnderwritingDao;
import ph.cpi.rest.api.model.request.RetrievePolCATPerilRequest;
import ph.cpi.rest.api.model.request.RetrievePolItemRequest;
import ph.cpi.rest.api.model.response.RetrievePolCATPerilResponse;
import ph.cpi.rest.api.model.response.RetrievePolItemResponse;
import ph.cpi.rest.api.service.UnderwritingService;

@Component
public class UnderwritingServiceImpl implements UnderwritingService {
	
	@Autowired
	UnderwritingDao underwritingDao;
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteServiceImpl.class);

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
		
/*		rpcpresponse.setCatPeril();*/
		logger.info("retrievePolCATPerilResponse : " + rpcpresponse.toString());
		
		return rpcpresponse;
	}

}
