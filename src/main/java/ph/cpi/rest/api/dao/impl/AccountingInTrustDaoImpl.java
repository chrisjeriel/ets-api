package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.AccountingInTrustDao;
import ph.cpi.rest.api.model.accountingintrust.AcitCMDM;
import ph.cpi.rest.api.model.accountingintrust.AcitCvPaytReq;
import ph.cpi.rest.api.model.accountingintrust.AcitJVAdjstInwPolBal;
import ph.cpi.rest.api.model.accountingintrust.AcitPaytReq;
import ph.cpi.rest.api.model.accountingintrust.AcitSOAAgingDetails;
import ph.cpi.rest.api.model.accountingintrust.RefNoLov;
import ph.cpi.rest.api.model.request.SaveAcitCMDMRequest;
import ph.cpi.rest.api.model.accountingintrust.AcknowledgementReceipt;
import ph.cpi.rest.api.model.accountingintrust.AcitTransactions;
import ph.cpi.rest.api.model.accountingintrust.AcitPrqTrans;

@Component
public class AccountingInTrustDaoImpl implements AccountingInTrustDao {
	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(AccountingInTrustDaoImpl.class);

	@Override
	public List<AcitCvPaytReq> retrieveAcitCvPaytReqList(HashMap<String, Object> params) throws SQLException {
		List<AcitCvPaytReq> acitCvPaytReqList = sqlSession.selectList("retrieveAcitCvPaytReqList", params);
		return acitCvPaytReqList;
	}

	@Override
	public List<AcitPaytReq> retrieveAcitPaytReq(HashMap<String, Object> params) throws SQLException {
		List<AcitPaytReq> acitPaytReqList  = sqlSession.selectList("retrieveAcitPaytReq", params);
		return acitPaytReqList;
	}

	@Override
	public HashMap<String, Object> saveAcitPaytReq(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitPaytReq", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<AcitCMDM> retrieveAcitCMDMList(HashMap<String, Object> params) throws SQLException {
		List<AcitCMDM> list = sqlSession.selectList("retrieveAcitCMDMList", params);
		return list;
	}

	@Override
	public Integer saveAcitCMDM(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitCMDM", params);
		return errorCode;
	}

	@Override
	public List<RefNoLov> retrieveAcitRefNoLOV(HashMap<String, Object> params) throws SQLException {
		List<RefNoLov> list = sqlSession.selectList("retrieveAcitRefNoLOV", params);
		return list;
	}
	
	@Override
	public List<AcknowledgementReceipt> retrieveArList(HashMap<String, Object> params) throws SQLException {
		List<AcknowledgementReceipt> res = sqlSession.selectList("retArList",params);
		return res;
	}

	@Override
	public AcknowledgementReceipt retrieveArEntry(HashMap<String, Object> params) throws SQLException {
		AcknowledgementReceipt res = sqlSession.selectOne("retArEntry", params);
		return res;
	}
	
	@Override
	public List<AcitTransactions> retrieveAcitJVListings(HashMap<String, Object> params) throws SQLException {
		List<AcitTransactions> acitJVList  = sqlSession.selectList("retrieveAcitJvList", params);
		return acitJVList;
	}

	@Override
	public AcitTransactions retrieveAcitJVEntry(HashMap<String, Object> params) throws SQLException {
		AcitTransactions acitJVEntry  = sqlSession.selectOne("retrieveAcitJvEntry", params);
		return acitJVEntry;
	}

	@Override
	public HashMap<String, Object> saveAcitArTrans(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitArTrans", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> saveAcitJVEntry(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitJVEntry",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public HashMap<String, Object> updateAcitPaytReqStat(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("updateAcitPaytReqStat", params);
		params.put("errorCode", errorCode);
		return params;
	}
	@Override
	public List<AcitPrqTrans> retrieveAcitPrqTrans(HashMap<String, Object> params) throws SQLException {
		List<AcitPrqTrans> acitPrqTransList  = sqlSession.selectList("retrieveAcitPrqTrans", params);
		return acitPrqTransList;
	}

	@Override
	public Integer cancelCMDM(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("cancelCMDM",params);
		return code;
	}

	@Override
	public Integer printCMDM(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("printCMDM",params);
		return code;
	}

	@Override
	public Integer cancelAr(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("cancelAr", params);
		return errorCode;
	}

	@Override
	public List<AcitSOAAgingDetails> retrieveAcitSOAAging(HashMap<String, Object> params) throws SQLException {
		List<AcitSOAAgingDetails> acitSOAAging  = sqlSession.selectList("retrieveAcitSOAAging", params);
		return acitSOAAging;
	}

	@Override
	public List<AcitJVAdjstInwPolBal> retrieveAcitJVAdjstInwPolBal(HashMap<String, Object> params) throws SQLException {
		List<AcitJVAdjstInwPolBal>  acitJVAdjInwPolBal  = sqlSession.selectList("retrieveAcitJvInwPolBal", params);
		return acitJVAdjInwPolBal;
	}

	@Override
	public List<AcitSOAAgingDetails> retrieveAgingSoaDtl(HashMap<String, Object> params) throws SQLException {
		List<AcitSOAAgingDetails> res = sqlSession.selectList("retrieveAcitAgingSoaDtl", params);
		return res;
	}
}
