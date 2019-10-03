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
import ph.cpi.rest.api.model.accountingservice.AcseJournalVoucherEntry;
import ph.cpi.rest.api.model.accountingservice.AcseJournalVoucherList;
import ph.cpi.rest.api.model.accountingservice.AcsePaytReq;
import ph.cpi.rest.api.model.accountingservice.AcseTaxDetails;
import ph.cpi.rest.api.model.accountingservice.AcseTransactions;
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
		List<AcseJournalVoucherList> list = sqlSession.selectList("retrieveJVList",params); 
		return list;
	}
	
	@Override
	public HashMap<String, Object> saveAcsePaytReq(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcsePaytReq", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public AcseJournalVoucherEntry retrieveJVEntry(HashMap<String, Object> params) throws SQLException {
		AcseJournalVoucherEntry entry = sqlSession.selectOne("retrieveJVEntry",params);
		return entry;
	}

	@Override
	public HashMap<String, Object> saveJVEntry(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveJVEntry",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> aprroveJV(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("approveJVService", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> cancelJV(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("cancelJVService", params);
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
	public List<AcseTaxDetails> retrieveTaxDetails(HashMap<String, Object> params) throws SQLException {
		List<AcseTaxDetails> list = sqlSession.selectList("retrieveTaxDetails", params);
		return list;
	}	

}
