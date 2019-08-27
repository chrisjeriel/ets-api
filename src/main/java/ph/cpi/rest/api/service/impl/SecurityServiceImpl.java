package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.SecurityDao;
import ph.cpi.rest.api.model.request.RetrieveMtnModulesRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTransactionsRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnModulesResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTransactionsResponse;
import ph.cpi.rest.api.service.SecurityService;

@Component
public class SecurityServiceImpl implements SecurityService{
	
	@Autowired
	SecurityDao securityDao;

	private static final Logger logger = LoggerFactory.getLogger(SecurityServiceImpl.class);

	@Override
	public RetrieveMtnModulesResponse retrieveMtnModules(RetrieveMtnModulesRequest rmmr) throws SQLException {
		RetrieveMtnModulesResponse response = new RetrieveMtnModulesResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
	
		params.put("moduleId", rmmr.getModuleId());
		params.put("tranCd", rmmr.getTranCd());
		/*params.put("position", rmmr.getPaginationRequest().getPosition());
		params.put("count", rmmr.getPaginationRequest().getCount());
		params.put("sortKey", rmmr.getSortRequest().getSortKey());
		params.put("order", rmmr.getSortRequest().getOrder());
		*/
		
		response.setModules(securityDao.retrieveMtnModules(params));
		
		return response;
	}

	@Override
	public RetrieveMtnTransactionsResponse retrieveMtnTransactions(RetrieveMtnTransactionsRequest rmtr) throws SQLException {
		RetrieveMtnTransactionsResponse response = new RetrieveMtnTransactionsResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
	
		params.put("moduleId", rmtr.getModuleId());
		params.put("tranCd", rmtr.getTranCd());
		/*params.put("position", rmtr.getPaginationRequest().getPosition());
		params.put("count", rmtr.getPaginationRequest().getCount());
		params.put("sortKey", rmtr.getSortRequest().getSortKey());
		params.put("order", rmtr.getSortRequest().getOrder());
		*/
		
		response.setTransactions(securityDao.retrieveMtnTransactions(params));
		
		return response;
	}

	
}
