package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.QuoteDao;
import ph.cpi.rest.api.dao.UnderwritingDao;
import ph.cpi.rest.api.model.request.RetrievePolAlopRequest;
import ph.cpi.rest.api.model.response.RetrievePolAlopResponse;
import ph.cpi.rest.api.service.UnderwritingService;

@Component
public class UnderwritingServiceImpl implements UnderwritingService {
	
	@Autowired
	UnderwritingDao underwritingDao;

	public RetrievePolAlopResponse retrievePolAlop(RetrievePolAlopRequest rpap) throws SQLException {
		RetrievePolAlopResponse rpaResponse = new RetrievePolAlopResponse();
		
		HashMap<String, Object> retrievePolAlopParams = new HashMap<String, Object>();
		retrievePolAlopParams.put("policyId", rpap.getPolicyId());
		retrievePolAlopParams.put("policyNo", rpap.getPolicyNo());
		
		rpaResponse.setPolicy(underwritingDao.retrievePolAlop(retrievePolAlopParams));
		
		return rpaResponse;
	}
	
}
