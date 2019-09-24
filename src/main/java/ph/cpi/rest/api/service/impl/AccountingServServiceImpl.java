package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.AccountingServDao;
import ph.cpi.rest.api.model.request.RetrieveAcseOrEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseOrListRequest;
import ph.cpi.rest.api.model.response.RetrieveAcseOrEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseOrListResponse;
import ph.cpi.rest.api.service.AccountingServService;

@Component
public class AccountingServServiceImpl implements AccountingServService{
	@Autowired
	AccountingServDao acctServDao;
	
	private static final Logger logger = LoggerFactory.getLogger(AccountingServServiceImpl.class);

	@Override
	public RetrieveAcseOrListResponse retrieveAcseOrList(RetrieveAcseOrListRequest raolr) throws SQLException {
		RetrieveAcseOrListResponse response = new RetrieveAcseOrListResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("orType", raolr.getOrType());
		params.put("orNo", raolr.getOrNo());
		params.put("payor", raolr.getPayor());
		params.put("orDateFrom", raolr.getOrDateFrom());
		params.put("orDateTo", raolr.getOrDateTo());
		params.put("tranTypeName", raolr.getTranTypeName());
		params.put("orStatDesc", raolr.getOrStatDesc());
		params.put("particulars", raolr.getParticulars());
		params.put("orAmtFrom", raolr.getOrAmtFrom());
		params.put("orAmtTo", raolr.getOrAmtTo());
		response.setOrList(acctServDao.retrieveOrList(params));
		logger.info("RetrieveAcseOrListResponse : " + response.toString());
		return response;
	}

	@Override
	public RetrieveAcseOrEntryResponse retrieveAcseOrEntry(RetrieveAcseOrEntryRequest raoer) throws SQLException {
		RetrieveAcseOrEntryResponse response = new RetrieveAcseOrEntryResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", raoer.getTranId());
		params.put("orNo", raoer.getOrNo());
		response.setOrEntry(acctServDao.retrieveOrEntry(params));
		logger.info("RetrieveAcseOrEntryRequest : " + response.toString());
		return response;
	}
}
