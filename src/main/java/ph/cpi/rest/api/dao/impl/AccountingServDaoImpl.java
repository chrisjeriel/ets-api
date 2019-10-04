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
import ph.cpi.rest.api.model.accountingservice.AcseCv;
import ph.cpi.rest.api.model.accountingservice.AcsePaytReq;
import ph.cpi.rest.api.model.accountingservice.AcsePrqTrans;
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
	public HashMap<String, Object> saveAcsePaytReq(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcsePaytReq", params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public HashMap<String, Object> updateAcsePaytReqStat(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("updateAcsePaytReqStat", params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public List<AcsePrqTrans> retrieveAcsePrqTrans(HashMap<String, Object> params) throws SQLException {
		List<AcsePrqTrans> acsePrqTransList  = sqlSession.selectList("retrieveAcsePrqTrans", params);
		return acsePrqTransList;
	}

	@Override
	public HashMap<String, Object> saveAcsePrqTrans(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcsePrqTrans", params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public List<AcseCv> retrieveAcseCv(HashMap<String, Object> params) throws SQLException {
		List<AcseCv> acseCvList  = sqlSession.selectList("retrieveAcseCv", params);
		return acseCvList;
	}
	
	@Override
	public HashMap<String, Object> saveAcseCv(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcseCv", params);
		params.put("errorCode", errorCode);
		return params;
	}
}
