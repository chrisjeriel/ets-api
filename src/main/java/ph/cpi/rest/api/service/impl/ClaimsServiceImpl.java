package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.ClaimsDao;
import ph.cpi.rest.api.model.request.RetrieveClaimHistoryRequest;
import ph.cpi.rest.api.model.request.SaveClaimHistoryRequest;
import ph.cpi.rest.api.model.response.RetrieveClaimHistoryResponse;
import ph.cpi.rest.api.model.response.SaveClaimHistoryResponse;
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
		retClmHistoryParams.put("projId", rchp.getProjId());
		retClmHistoryParams.put("histNo", rchp.getHistNo());
		rchResponse.setClaimHistoryList(claimsDao.retrieveClaimHistory(retClmHistoryParams));
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
}
