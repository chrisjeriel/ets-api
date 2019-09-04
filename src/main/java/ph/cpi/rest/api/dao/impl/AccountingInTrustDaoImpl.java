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
import ph.cpi.rest.api.model.accountingintrust.ACITSOATreatyDetails;
import ph.cpi.rest.api.model.accountingintrust.AcctServFeeDist;
import ph.cpi.rest.api.model.accountingintrust.AcitAcctEntries;
import ph.cpi.rest.api.model.accountingintrust.AcitAllInvtIncome;
import ph.cpi.rest.api.model.accountingintrust.AcitArAmtDtl;
import ph.cpi.rest.api.model.accountingintrust.AcitArClmCashCall;
import ph.cpi.rest.api.model.accountingintrust.AcitArClmCashCallLov;
import ph.cpi.rest.api.model.accountingintrust.AcitArClmRecover;
import ph.cpi.rest.api.model.accountingintrust.AcitArClmRecoverLov;
import ph.cpi.rest.api.model.accountingintrust.AcitArInvPullout;
import ph.cpi.rest.api.model.accountingintrust.AcitArInwPolBal;
import ph.cpi.rest.api.model.accountingintrust.AcitArNegTrtyBal;
import ph.cpi.rest.api.model.accountingintrust.AcitArTransDtl;
import ph.cpi.rest.api.model.accountingintrust.AcitAttachments;
import ph.cpi.rest.api.model.accountingintrust.AcitCMDM;
import ph.cpi.rest.api.model.accountingintrust.AcitClmResHistPayts;
import ph.cpi.rest.api.model.accountingintrust.AcitCv;
import ph.cpi.rest.api.model.accountingintrust.AcitCvPaytReq;
import ph.cpi.rest.api.model.accountingintrust.AcitInvestments;
import ph.cpi.rest.api.model.accountingintrust.AcitJVAcctTrtyBal;
import ph.cpi.rest.api.model.accountingintrust.AcitJVAdjstInwPolBal;
import ph.cpi.rest.api.model.accountingintrust.AcitJVAppPaymentZeroBal;
import ph.cpi.rest.api.model.accountingintrust.AcitJVClaimOffSetLOV;
import ph.cpi.rest.api.model.accountingintrust.AcitJVClaimsLosses;
import ph.cpi.rest.api.model.accountingintrust.AcitJVClmNegativeTreaty;
import ph.cpi.rest.api.model.accountingintrust.AcitJVIntOverdueAcctsMS;
import ph.cpi.rest.api.model.accountingintrust.AcitJVPremResReleased;
import ph.cpi.rest.api.model.accountingintrust.AcitJVQuarterPremRes;
import ph.cpi.rest.api.model.accountingintrust.AcitJVRollOver;
import ph.cpi.rest.api.model.accountingintrust.AcitJVinvPullOut;
import ph.cpi.rest.api.model.accountingintrust.AcitJvAllInvtIncome;
import ph.cpi.rest.api.model.accountingintrust.AcitPaytReq;
import ph.cpi.rest.api.model.accountingintrust.AcitProfCommDtl;
import ph.cpi.rest.api.model.accountingintrust.AcitProfCommSumm;
import ph.cpi.rest.api.model.accountingintrust.AcitPrqInwPol;
import ph.cpi.rest.api.model.accountingintrust.AcitPrqTrans;
import ph.cpi.rest.api.model.accountingintrust.AcitSOAAgingDetails;
import ph.cpi.rest.api.model.accountingintrust.AcitTransactions;
import ph.cpi.rest.api.model.accountingintrust.AcitUPRPerLine;
import ph.cpi.rest.api.model.accountingintrust.AcitUPRPerPolicy;
import ph.cpi.rest.api.model.accountingintrust.AcknowledgementReceipt;
import ph.cpi.rest.api.model.accountingintrust.GenUPRParams;
import ph.cpi.rest.api.model.accountingintrust.QSOA;
import ph.cpi.rest.api.model.accountingintrust.RefNoLov;
import ph.cpi.rest.api.model.maintenance.UserId;

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

//	@Override
//	public List<AcitProfCommSumm> retrieveProfCommSumm(HashMap<String, Object> params) throws SQLException {
//		List<AcitProfCommSumm> acitProfCommSummList = sqlSession.selectList("retrieveProfCommSumm", params);
//		return acitProfCommSummList;
//	}
//
//	@Override
//	public List<AcitProfCommDtl> retrieveProfCommDtl(HashMap<String, Object> params) throws SQLException {
//		List<AcitProfCommDtl> acitProfCommDtlList = sqlSession.selectList("retrieveProfCommDtl", params);
//		return acitProfCommDtlList;
//	}

	@Override
	public List<AcitInvestments> retrieveInvestmentList(HashMap<String, Object> params) throws SQLException {
		List<AcitInvestments> acitInvestmentsList = sqlSession.selectList("retrieveInvestmentList", params);
		return acitInvestmentsList;
	}

	@Override
	public Integer saveAcitInvestments(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitInvestments",params);
		return errorCode;
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
	public HashMap<String, Object> saveAcitJVEntry(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitJVEntry",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public HashMap<String, Object> saveAcitArTrans(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitArTrans", params);
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
	public HashMap<String, Object> saveAcitPrqTrans(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitPrqTrans", params);
		params.put("errorCode", errorCode);
		return params;
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
	public List<AcitJVIntOverdueAcctsMS> retrieveAcitJVIntOverdAcctsMS(HashMap<String, Object> params)
			throws SQLException {
		List<AcitJVIntOverdueAcctsMS>  acitJVIntOverdue  = sqlSession.selectList("retrieveAcitJVIntOverdue", params);
		return acitJVIntOverdue;
	}

	@Override
	public HashMap<String, Object> saveAcitJVAdjInwPolBal(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitJVInwPolBal",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> saveAcitJVOverdueAccts(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitJVOverdueAccts",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<AcitJVPremResReleased> retrieveAcitJVPremResRel(HashMap<String, Object> params) throws SQLException {
		List<AcitJVPremResReleased>  acitJVPremResRel  = sqlSession.selectList("retrieveAcitJVPremResRel", params);
		return acitJVPremResRel;
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
	public List<AcitSOAAgingDetails> retrieveAgingSoaDtl(HashMap<String, Object> params) throws SQLException {
		List<AcitSOAAgingDetails> res = sqlSession.selectList("retrieveAcitAgingSoaDtl", params);
		return res;
	}

	@Override
	public HashMap<String, Object> saveArInwPolBal(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveArInwPolBal", params);
		params.put("errorCode", res);
		return params;
	}

	@Override
	public List<AcitArInwPolBal> retrieveAcitArInwPolBal(HashMap<String, Object> params) throws SQLException {
		List<AcitArInwPolBal> res = sqlSession.selectList("retrieveArInwPolBal", params);
		return res;
	}

	@Override
	public List<AcitArTransDtl> retrieveAcitArTransDtl(HashMap<String, Object> params) throws SQLException {
		List<AcitArTransDtl> res = sqlSession.selectList("retrieveArTransDtl", params);
		return res;
	}

	@Override
	public HashMap<String, Object> saveArTransDtl(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveArTransDtl", params);
		params.put("errorCode", res);
		return params;
	}

	@Override
	public List<AcitAllInvtIncome> retrieveAcitAllInvestmentIncome(HashMap<String, Object> params) throws SQLException {
		List<AcitAllInvtIncome> acitAllInvtIncome = sqlSession.selectList("retrieveAcitAllInvestmentIncome", params);
		return acitAllInvtIncome;
	}

	@Override
	public List<AcitAllInvtIncome> retrieveAcitAllInvestmentIncomeInvtId(HashMap<String, Object> params)
			throws SQLException {
		List<AcitAllInvtIncome> acitAllInvtIncomeInvtId = sqlSession.selectList("retrieveAcitAllInvestmentIncomeInvtId", params);
		return acitAllInvtIncomeInvtId;
	}
	
	@Override
	public List<AcitAcctEntries> retrieveAcitAcctEntries(HashMap<String, Object> params) throws SQLException {
		List<AcitAcctEntries> list = sqlSession.selectList("retrieveAcitAcctEntries", params);
		return list;
	}

	@Override
	public List<QSOA> retrieveQSOAList(HashMap<String, Object> params) throws SQLException {
		List<QSOA> qsoaList = sqlSession.selectList("retrieveQSOAList", params);
		return qsoaList;
	}

	@Override
	public Integer saveAcitAcctEntries(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("saveAcitAcctEntries",params);
		return code;
	}

	@Override
	public HashMap<String, Object> saveAcitJVPremResRel(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitJVPremResRel",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public HashMap<String, Object> saveAcitAllocInvtIncome(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitAllocInvtIncome",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> cancelJV(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("cancelJV",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> printJV(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("printJV",params);
		params.put("errorCode", errorCode);
		return params;
	}

	
	@Override
	public List<AcitProfCommSumm> retrieveProfCommSumm(HashMap<String, Object> params) throws SQLException {
		List<AcitProfCommSumm> acitProfCommSummList = sqlSession.selectList("retrieveProfCommSumm", params);
		return acitProfCommSummList;
	}

	@Override
	public List<AcitProfCommDtl> retrieveProfCommDtl(HashMap<String, Object> params) throws SQLException {
		List<AcitProfCommDtl> acitProfCommDtlList = sqlSession.selectList("retrieveProfCommDtl", params);
		return acitProfCommDtlList;
	}

	@Override
	public List<AcitPrqInwPol> retrieveAcitPrqInwPol(HashMap<String, Object> params) throws SQLException {
		List<AcitPrqInwPol> acitPrqInwPolList = sqlSession.selectList("retrieveAcitPrqInwPol", params);
		return acitPrqInwPolList;
	}

	@Override
	public HashMap<String, Object> saveAcitPrqInwPol(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitPrqInwPol", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<AcctServFeeDist> retrieveAcctPrqServFeeMainGnrt(HashMap<String, Object> params) throws SQLException {
		List<AcctServFeeDist> mainList =  sqlSession.selectList("retrieveAcitServFeeMainGnrt", params);
		return mainList;
	}

	@Override
	public List<AcitArClmCashCall> retrieveAcitArClmCashCall(HashMap<String, Object> params) throws SQLException {
		List<AcitArClmCashCall> res = sqlSession.selectList("retrieveAcitArClmCashCall", params);
		return res;
	}
	
	@Override
	public List<AcitJVAppPaymentZeroBal> retrieveAcitJVAppPaytZeroBal(HashMap<String, Object> params)
			throws SQLException {
		List<AcitJVAppPaymentZeroBal> res = sqlSession.selectList("retrieveAcitJVAppPaytZeroBal", params);
		return res;
	}

	@Override
	public List<AcitArClmCashCallLov> retrieveAcitArClmCashCallLov(HashMap<String, Object> params) throws SQLException {
		List<AcitArClmCashCallLov> res = sqlSession.selectList("retrieveAcitArClmCashCallLov", params);
		return res;
	}

	@Override
	public HashMap<String, Object> saveArClmRecover(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveArClmRecover", params);
		params.put("errorCode", res);
		return params;
	}

	@Override
	public List<AcitArInvPullout> retrieveAcitArPullout(HashMap<String, Object> params) throws SQLException {
		List<AcitArInvPullout> res = sqlSession.selectList("retrieveArInvpullout", params);
		return res;
	}

	@Override
	public HashMap<String, Object> saveAcitJVAppPaytZeroBal(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitJVAppPaytZeroBal",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<ACITSOATreatyDetails> retrieveAcitSoaTrtyList(HashMap<String, Object> params) throws SQLException {
		List<ACITSOATreatyDetails> res = sqlSession.selectList("retrieveAcitSoaTrtyList", params);
		return res;
	}

	public HashMap<String, Object> saveAcitArInvPullout(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveArInvPullout",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<AcitJVClaimOffSetLOV> retrieveAcitJvClmOff(HashMap<String, Object> params) throws SQLException {
		List<AcitJVClaimOffSetLOV> res = sqlSession.selectList("retrieveAcitJvClmOff", params);
		return res;
	}

	@Override
	public List<AcitArNegTrtyBal> retrieveAcitArNegTrtyBal(HashMap<String, Object> params) throws SQLException {
		List<AcitArNegTrtyBal> res = sqlSession.selectList("retArNegTrtyBal", params);
		return res;
	}

	@Override
	public HashMap<String, Object> saveAcitArNegTrtyBal(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveArNegTrtyBal",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<AcitArClmRecoverLov> retrieveAcitArClmRecoverLov(HashMap<String, Object> params) throws SQLException {
		List<AcitArClmRecoverLov> res = sqlSession.selectList("retAcitARClmRecoverLov", params);
		return res;
	}

	@Override
	public List<AcitArClmRecover> retrieveAcitArClmRecover(HashMap<String, Object> params) throws SQLException {
		List<AcitArClmRecover> res = sqlSession.selectList("retAcitARClmRecover", params);
		return res;
	}

	@Override
	public List<AcitJVClmNegativeTreaty> retrieveAcitJvNegTrty(HashMap<String, Object> params) throws SQLException {
		List<AcitJVClmNegativeTreaty> res = sqlSession.selectList("retrieveAcitJvNegTrty", params);
		return res;
	}

	@Override
	public HashMap<String, Object> saveAcitArClmCashCallLov(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveArClmCashCall",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<AcitArAmtDtl> retrieveAcitArAmtDtl(HashMap<String, Object> params) throws SQLException {
		List<AcitArAmtDtl> res = sqlSession.selectList("retAcitArAmtDtl",params);
		return res;
	}

	@Override
	public HashMap<String, Object> saveAcitJvNegTrty(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitJvNegTrty",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> saveAcitArAmtDtl(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitArAmtDtl",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public Integer generateUPR(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("generateUPR",params);
		return errorCode;
	}
	
	@Override
	public HashMap<String, Object> saveAcitJVEntryList(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitJVEntryList",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<AcitUPRPerLine> retrieveAcitUPRPerLine(HashMap<String, Object> params) throws SQLException {
		List<AcitUPRPerLine> list = sqlSession.selectList("retrieveAcitUPRPerLine",params);
		return list;
	}

	@Override
	public List<AcitUPRPerPolicy> retrieveAcitUPRPerPol(HashMap<String, Object> params) throws SQLException {
		List<AcitUPRPerPolicy> list = sqlSession.selectList("retrieveAcitUPRPerPol",params);
		return list;
	}

	@Override
	public GenUPRParams retrieveAcitUPRParams() throws SQLException {
		GenUPRParams params = sqlSession.selectOne("retrieveAcitUPRParams");
		return params;
	}

	@Override
	public List<AcitJVAcctTrtyBal> retrieveAcitJvAcctTrtyBal(HashMap<String, Object> params) throws SQLException {
		List<AcitJVAcctTrtyBal> res = sqlSession.selectList("retrieveAcitJvAcctTrtyBal",params);
		return res;
	}

	@Override
	public HashMap<String, Object> saveAcitJvActTrtyBal(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitJvActTrtyBal",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public String retrieveAcitExistingUPR(HashMap<String, Object> params) throws SQLException {
		String response = sqlSession.selectOne("retrieveAcitExistingUPR", params);
		return response;
	}
	
	@Override
	public List<AcctServFeeDist> retrieveAcctPrqServFeeSubGnrt(HashMap<String, Object> params) throws SQLException {
		List<AcctServFeeDist> subList =  sqlSession.selectList("retrieveAcitServFeeSubGnrt", params);
		return subList;
	}
	
	public UserId retrieveJVDefName(HashMap<String, Object> params) throws SQLException {
		UserId res = sqlSession.selectOne("retrieveDefName",params);
		return res;
	}

	@Override
	public List<AcitJvAllInvtIncome> retrieveAcitJvAllInvtIncome(
			HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<AcitJvAllInvtIncome> res = sqlSession.selectList("retrieveAcitJvAllInvtIncome", params);
		return res;
	}
	
	@Override
	public Integer saveAcctPrqServFee(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcctPrqServFee", params);
		return errorCode;
	}

	@Override
	public List<AcitJVClaimsLosses> retrieveAcitJVRcvblsAgnstLosses(HashMap<String, Object> params)
			throws SQLException {
		List<AcitJVClaimsLosses> res = sqlSession.selectList("retrieveAcitJVRcvblsAgnstLosses",params);
		return res;
	}

	@Override
	public Integer updateAcitStatus(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer errorCode = sqlSession.update("updateAcitStatus", params);
		return errorCode;
	}

	public HashMap<String, Object> saveAcitJvRcvblsAgnstLoss(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitJvRcvblsAgnstLoss",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public Integer printAr(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("printAr", params);
		return errorCode;
	}

	@Override
	public List<AcitClmResHistPayts> retrieveAcitClmResHistPayts(HashMap<String, Object> params) throws SQLException {
		List<AcitClmResHistPayts> res = sqlSession.selectList("retrieveAcitClmResHistPayts",params);
		return res;
	}

	@Override
	public HashMap<String, Object> saveAcitClmResHistPayts(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitClmResHistPayts",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public List<AcitCv> retrieveAcitCv(HashMap<String, Object> params) throws SQLException {
		List<AcitCv> acitCvList  = sqlSession.selectList("retrieveAcitCv", params);
		return acitCvList;
	}

	@Override
	public HashMap<String, Object> saveAcitCv(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitCv", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> approveJV(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("approveJV",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public Integer saveAcitCvPaytReqList(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitCvPaytReqList", params);
		return errorCode;
	}

	@Override
	public List<AcitAttachments> retrieveAcitAttachments(HashMap<String, Object> params) throws SQLException {
		List<AcitAttachments> res = sqlSession.selectList("retAcitAttachments", params);
		return res;
	}

	@Override
	public List<AcitJVinvPullOut> retrieveAcitJVInvPullOut(HashMap<String, Object> params) throws SQLException {
		List<AcitJVinvPullOut> res = sqlSession.selectList("retrieveAcitJVInvPullOut",params);
		return res;
	}

	@Override
	public HashMap<String, Object> saveAcitJVInvPullOut(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitJVInvPullOut",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<AcitJVRollOver> retrieveAcitJVInvRollOver(HashMap<String, Object> params) throws SQLException {
		List<AcitJVRollOver> res = sqlSession.selectList("retrieveAcitJVInvRollOver",params);
		return res;
	}

	@Override
	public HashMap<String, Object> saveAcitAttachments(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitAttachments",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> saveAcitJVInvRollOver(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitJVInvRollOver",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> updateAcitCvStat(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("updateAcitCvStat", params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public List<AcitSOAAgingDetails> retrieveSoaAgingZeroLOV(HashMap<String, Object> params) throws SQLException {
		List<AcitSOAAgingDetails> res = sqlSession.selectList("retrieveSoaAgingZeroLOV",params);
		return res;
	}

	@Override
	public HashMap<String, Object> retrieveAcctPrqServFee(HashMap<String, Object> params) throws SQLException {
		params.put("mainList", sqlSession.selectList("retrieveAcitServFeeMain", params));
		params.put("subList", sqlSession.selectList("retrieveAcitServFeeSub", params));
		return params;
	}
	
	@Override
	public AcitJVQuarterPremRes retrieveQuarterPremRes(HashMap<String, Object> params) throws SQLException {
		AcitJVQuarterPremRes res = sqlSession.selectOne("retrieveQuarterPremResfinal", params);
		return res;
	}

	@Override
	public List<AcitSOAAgingDetails> retrieveSoaAgingZeroAltLOV(HashMap<String, Object> params) throws SQLException {
		List<AcitSOAAgingDetails> res = sqlSession.selectList("retrieveSoaAgingZeroAltLOV",params);
		return res;
	}
}
