package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.SecurityDao;
import ph.cpi.rest.api.model.maintenance.SaveTransaction;
import ph.cpi.rest.api.model.request.RetrieveModulesRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnModulesRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTransactionsRequest;
import ph.cpi.rest.api.model.request.RetrieveTransactionsRequest;
import ph.cpi.rest.api.model.request.SaveModulesRequest;
import ph.cpi.rest.api.model.request.SaveTransactionsRequest;
import ph.cpi.rest.api.model.response.RetrieveModulesResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnModulesResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTransactionsResponse;
import ph.cpi.rest.api.model.response.RetrieveTransactionsResponse;
import ph.cpi.rest.api.model.response.SaveModulesResponse;
import ph.cpi.rest.api.model.response.SaveTransactionsResponse;
import ph.cpi.rest.api.service.SecurityService;
import ph.cpi.rest.api.utils.ETSEncoder;

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

	@Override
	public RetrieveTransactionsResponse retrieveTransactions(RetrieveTransactionsRequest rtr) throws SQLException {
		RetrieveTransactionsResponse response = new RetrieveTransactionsResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("tranCd", rtr.getTranCd());
		if ("USER".equalsIgnoreCase(rtr.getAccessLevel())) {
			params.put("userId", rtr.getUserId());
			response.setTransactions(securityDao.retrieveUserTransactions(params));
		} else if  ("USER_GROUP".equalsIgnoreCase(rtr.getAccessLevel())) {
			params.put("userGrp", rtr.getUserGrp());
			response.setTransactions(securityDao.retrieveGroupTransactions(params));
		}
		logger.info(response.toString());
		return response;
	}

	@Override
	public RetrieveModulesResponse retrieveModules(RetrieveModulesRequest rmr) throws SQLException {
		RetrieveModulesResponse response = new RetrieveModulesResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("tranCd", rmr.getTranCd());
		params.put("moduleId", rmr.getModuleId());
		if ("USER".equalsIgnoreCase(rmr.getAccessLevel())) {
			params.put("userId", rmr.getUserId());
			response.setModules(securityDao.retrieveUserModules(params));
		} else if  ("USER_GROUP".equalsIgnoreCase(rmr.getAccessLevel())) {
			params.put("userGrp", rmr.getUserGrp());
			response.setModules(securityDao.retrieveGroupModules(params));
		}
		logger.info(response.toString());
		return response;
	}

	@Override
	public SaveTransactionsResponse saveTransactions(SaveTransactionsRequest str) throws SQLException {
		SaveTransactionsResponse response = new SaveTransactionsResponse();
		
		
		if ("USER".equalsIgnoreCase(str.getAccessLevel())) {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("transactionList", str.getTransactionList());
			params.put("delTranList", str.getDelTranList());
			response.setReturnCode(securityDao.saveUserTransactions(params));
		} else if  ("USER_GROUP".equalsIgnoreCase(str.getAccessLevel())) {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("transactionList", str.getTransactionList());
			params.put("delTranList", str.getDelTranList());
			response.setReturnCode(securityDao.saveGroupTransactions(params));
		}
		
		return response;
	}

	@Override
	public SaveModulesResponse saveModules(SaveModulesRequest smr) throws SQLException {
		SaveModulesResponse response = new SaveModulesResponse();
		
		
		if ("USER".equalsIgnoreCase(smr.getAccessLevel())) {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("moduleList", smr.getModuleList());
			params.put("delModuleList", smr.getDelModuleList());
			response.setReturnCode(securityDao.saveUserModules(params));
		} else if  ("USER_GROUP".equalsIgnoreCase(smr.getAccessLevel())) {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("moduleList", smr.getModuleList());
			params.put("delModuleList", smr.getDelModuleList());
			response.setReturnCode(securityDao.saveGroupModules(params));
		} else if ("MTN".equalsIgnoreCase(smr.getAccessLevel())) {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("mtnModuleList", smr.getMtnModuleList());
			params.put("delMtnModuleList", smr.getDelMtnModuleList());
			response.setReturnCode(securityDao.saveMtnModules(params));
		}
		
		return response;
	}

	@Override
	public HashMap<String, String> secEncryption(String str) throws Exception {
		// TODO Auto-generated method stub
		HashMap<String, String> resp = new HashMap<String, String>();
		resp.put("password", ETSEncoder.doEncrypt(str));
		return resp;
	}

	
}
