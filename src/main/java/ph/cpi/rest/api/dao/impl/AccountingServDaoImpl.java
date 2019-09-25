package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.AccountingServDao;
import ph.cpi.rest.api.model.accountingservice.AcseJournalVoucherList;
import ph.cpi.rest.api.model.accountingservice.AcsePaytReq;
import ph.cpi.rest.api.model.accountingservice.OfficialReceipt;

@Component
public class AccountingServDaoImpl implements AccountingServDao{
	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(AccountingInTrustDaoImpl.class);

	@Override
	public List<OfficialReceipt> retrieveOrList(HashMap<String, Object> params) throws SQLException {
		List<OfficialReceipt> res = sqlSession.selectList("retOrList", params);
		return res;
	}

	@Override
	public OfficialReceipt retrieveOrEntry(HashMap<String, Object> params) throws SQLException {
		OfficialReceipt res = sqlSession.selectOne("retOrEntry", params);
		return res;
	}
	
	@Override
	public List<AcsePaytReq> retrieveAcsePaytReq(HashMap<String, Object> params) throws SQLException {
		List<AcsePaytReq> acsePaytReqList  = sqlSession.selectList("retrieveAcsePaytReq", params);
		return acsePaytReqList;
	}
	
	@Override
	public HashMap<String, Object> saveOrEntry(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcsetOrTrans", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<AcseJournalVoucherList> retrieveJVList(HashMap<String, Object> params) throws SQLException {
		List<AcseJournalVoucherList> list = sqlSession.selectList("retrieveJVList"); 
		return list;
	}
	
	@Override
	public HashMap<String, Object> saveAcsePaytReq(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcsePaytReq", params);
		params.put("errorCode", errorCode);
		return params;
	}
}
