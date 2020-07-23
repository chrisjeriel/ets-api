package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import ph.cpi.rest.api.dao.AccountingInTrustDao;
import ph.cpi.rest.api.model.accountingintrust.ACITSOATreatyDetails;
import ph.cpi.rest.api.model.accountingintrust.AcctEntryRowUpload;
import ph.cpi.rest.api.model.accountingintrust.AcctServFeeDist;
import ph.cpi.rest.api.model.accountingintrust.AcitAcctEntries;
import ph.cpi.rest.api.model.accountingintrust.AcitAcctEntriesExt;
import ph.cpi.rest.api.model.accountingintrust.AcitAllInvtIncome;
import ph.cpi.rest.api.model.accountingintrust.AcitAmortize;
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
import ph.cpi.rest.api.model.accountingintrust.AcitCancelledTransactions;
import ph.cpi.rest.api.model.accountingintrust.AcitClmHist;
import ph.cpi.rest.api.model.accountingintrust.AcitClmResHistPayts;
import ph.cpi.rest.api.model.accountingintrust.AcitCv;
import ph.cpi.rest.api.model.accountingintrust.AcitCvPaytReq;
import ph.cpi.rest.api.model.accountingintrust.AcitDcbBankDetails;
import ph.cpi.rest.api.model.accountingintrust.AcitDcbCollection;
import ph.cpi.rest.api.model.accountingintrust.AcitEditedAcctEntries;
import ph.cpi.rest.api.model.accountingintrust.AcitEomMonthlyTotals;
import ph.cpi.rest.api.model.accountingintrust.AcitEomUnpostedMonth;
import ph.cpi.rest.api.model.accountingintrust.AcitInvestments;
import ph.cpi.rest.api.model.accountingintrust.AcitInwPolPayts;
import ph.cpi.rest.api.model.accountingintrust.AcitJVAcctTrtyBal;
import ph.cpi.rest.api.model.accountingintrust.AcitJVAdjstInwPolBal;
import ph.cpi.rest.api.model.accountingintrust.AcitJVAppPaymentZeroBal;
import ph.cpi.rest.api.model.accountingintrust.AcitJVClaimOffSetLOV;
import ph.cpi.rest.api.model.accountingintrust.AcitJVClaimsLosses;
import ph.cpi.rest.api.model.accountingintrust.AcitJVClmNegativeTreaty;
import ph.cpi.rest.api.model.accountingintrust.AcitJVIntOverdueAcctsMS;
import ph.cpi.rest.api.model.accountingintrust.AcitJVInvestmentPlacement;
import ph.cpi.rest.api.model.accountingintrust.AcitJVPremResReleased;
import ph.cpi.rest.api.model.accountingintrust.AcitJVQuarterPremRes;
import ph.cpi.rest.api.model.accountingintrust.AcitJVRollOver;
import ph.cpi.rest.api.model.accountingintrust.AcitJVUnappliedCollection;
import ph.cpi.rest.api.model.accountingintrust.AcitJVinvPullOut;
import ph.cpi.rest.api.model.accountingintrust.AcitJvAllInvtIncome;
import ph.cpi.rest.api.model.accountingintrust.AcitJvUnappInw;
import ph.cpi.rest.api.model.accountingintrust.AcitJvUnappliedTreaty;
import ph.cpi.rest.api.model.accountingintrust.AcitMonthEnd;
import ph.cpi.rest.api.model.accountingintrust.AcitMonthEndJV;
import ph.cpi.rest.api.model.accountingintrust.AcitOsQsoa;
import ph.cpi.rest.api.model.accountingintrust.AcitPaytReq;
import ph.cpi.rest.api.model.accountingintrust.AcitProfCommDtl;
import ph.cpi.rest.api.model.accountingintrust.AcitProfCommSumm;
import ph.cpi.rest.api.model.accountingintrust.AcitPrqInwPol;
import ph.cpi.rest.api.model.accountingintrust.AcitPrqTrans;
import ph.cpi.rest.api.model.accountingintrust.AcitSOAAgingDetails;
import ph.cpi.rest.api.model.accountingintrust.AcitTransactions;
import ph.cpi.rest.api.model.accountingintrust.AcitTrialBal;
import ph.cpi.rest.api.model.accountingintrust.AcitUPRPerLine;
import ph.cpi.rest.api.model.accountingintrust.AcitUPRPerPolicy;
import ph.cpi.rest.api.model.accountingintrust.AcitUnappliedCollection;
import ph.cpi.rest.api.model.accountingintrust.AcknowledgementReceipt;
import ph.cpi.rest.api.model.accountingintrust.GenUPRParams;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetLrd;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetClm;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetExisting;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetInvPl;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetInvPo;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetIpb;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetOth;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetTrty;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetUnapp;
import ph.cpi.rest.api.model.accountingintrust.QSOA;
import ph.cpi.rest.api.model.accountingintrust.QSOAAcctReceivable;
import ph.cpi.rest.api.model.accountingintrust.QSOADtl;
import ph.cpi.rest.api.model.accountingintrust.QSOADtlExclude;
import ph.cpi.rest.api.model.accountingintrust.QSOAPrint;
import ph.cpi.rest.api.model.accountingintrust.QSOARemittance;
import ph.cpi.rest.api.model.accountingintrust.RefNoLov;
import ph.cpi.rest.api.model.maintenance.UserId;
import ph.cpi.rest.api.model.request.RetrieveAcitAcctEntriesExtRequest;

@Component
public class AccountingInTrustDaoImpl implements AccountingInTrustDao {
	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private PlatformTransactionManager txManager;
	
	private DefaultTransactionDefinition txDef = new DefaultTransactionDefinition();
	
	private TransactionStatus txStat;
		
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
	
	@Override
	public List<AcitAmortize> retrieveAcitAmortize(HashMap<String, Object> params) throws SQLException {
		List<AcitAmortize> acitAmortizeList = sqlSession.selectList("retrieveAcitAmortizeList",params);
		return acitAmortizeList;
	}

	@Override
	public HashMap<String, Object> saveAcitJVTrtyInvt(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitJVTrtyInvt",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<AcitJVAcctTrtyBal> retrieveAcitJvInvmtOffset(HashMap<String, Object> params) throws SQLException {
		List<AcitJVAcctTrtyBal> list = sqlSession.selectList("retrieveAcitJvInvmtOffset",params);
		return list;
	}

	@Override
	public List<AcitJVInvestmentPlacement> retrieveAcitJvInvPlacement(HashMap<String, Object> params)
			throws SQLException {
		List<AcitJVInvestmentPlacement> list = sqlSession.selectList("retrieveAcitJvInvPlacement",params);
		return list;
	}

	@Override
	public HashMap<String, Object> saveAcitJVInvPlacement(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitJVInvPlacement",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<AcitSOAAgingDetails> retrieveAcitSoaDue(HashMap<String, Object> params) throws SQLException {
		List<AcitSOAAgingDetails> list = sqlSession.selectList("retrieveAcitSoaDue",params);
		return list;
	}

	@Override
	public List<AcitInwPolPayts> retrieveAcitInwPolPayts(HashMap<String, Object> params) throws SQLException {
		List<AcitInwPolPayts> list = sqlSession.selectList("retrieveAcitInwPolPayts",params);
		return list;
	}
	
	@Override
	public List<AcitCancelledTransactions> retrieveCancelledTrans(HashMap<String, Object> params) throws SQLException {
		List<AcitCancelledTransactions>  list = sqlSession.selectList("retrieveCancelledTrans",params);
		return list;
	}

	@Override
	public Integer acitEomExtUwprod(HashMap<String, Object> params) throws SQLException {
		txStat = txManager.getTransaction(txDef);
		return sqlSession.update("acitEomExtUwprod", params);
	}

	@Override
	public Integer acitEomCreateNetPremJv(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomCreateNetPremJv", params);
	}

	@Override
	public Integer acitEomExtEomUpr(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomExtEomUpr", params);
	}

	@Override
	public Integer acitEomCreateUprJv(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomCreateUprJv", params);
	}

	@Override
	public Integer acitEomSaveOdInt(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomSaveOdInt", params);
	}

	@Override
	public String acitEomProdSummaryReport(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		params.put("extractSummary", "");
		sqlSession.selectOne("acitEomProdSummaryReport", params);
		return (String) params.get("extractSummary");
	}

	@Override
	public void startTransaction() {
		txStat = txManager.getTransaction(txDef);
	}
	
	@Override
	public void commit() {
		txManager.commit(txStat);
	}

	@Override
	public void rollback() {
		txManager.rollback(txStat);
	}

	@Override
	public Integer acitEomExtOsLoss(HashMap<String, Object> params) throws SQLException {
		txStat = txManager.getTransaction(txDef);
		return sqlSession.update("acitEomExtOsLoss", params);
	}

	@Override
	public Integer acitEomCreateOsLossJv(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomCreateOsLossJv", params);
	}

	@Override
	public Integer acitEomExtClmpayt(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomExtClmpayt", params);
	}

	@Override
	public Integer acitEomCreateAllocPaidClmJv(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomCreateAllocPaidClmJv", params);
	}

	@Override
	public Integer acitEomExtractClmRecover(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomExtractClmRecover", params);
	}

	@Override
	public Integer acitEomCreateAllocRecoverJv(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomCreateAllocRecoverJv", params);
	}

	@Override
	public String acitEomBatchOsSummaryReport(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		params.put("extractSummary", "");
		sqlSession.selectOne("acitEomBatchOsSummaryReport", params);
		return (String) params.get("extractSummary");
	}

	@Override
	public HashMap<String, Object> validateEomStat(HashMap<String, Object> params) throws SQLException {
		params.put("option", "");
		params.put("message", "");
		sqlSession.update("validateEomStat", params);
		
		return params;
	}

	@Override
	public Integer acitEomUpdateEomCloseTag(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomUpdateEomCloseTag", params);
	}

	@Override
	public Integer acitEomUpdateAcctEntDate(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomUpdateAcctEntDate", params);
	}

	@Override
	public Integer acitEomUpdateAcctEntDateNull(HashMap<String, Object> params) throws SQLException {
		return sqlSession.update("acitEomUpdateAcctEntDateNull", params);
	}

	@Override
	public String validateTbDate(HashMap<String, Object> params) throws SQLException {
		params.put("validate", "");
		sqlSession.selectOne("validateTbDate", params);
		
		return (String) params.get("validate");
	}

	@Override
	public Integer acitEomDeleteMonthlyTotalsBackup() throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomDeleteMonthlyTotalsBackup");
	}

	@Override
	public Integer acitEomInsertMonthlyTotalsBackup(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomInsertMonthlyTotalsBackup", params);
	}

	@Override
	public Integer acitEomDeleteMonthlyTotals(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomDeleteMonthlyTotals", params);
	}

	@Override
	public Integer acitEomCloseTrans(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomCloseTrans", params);
	}

	@Override
	public Integer acitEomDeleteTrans(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomDeleteTrans", params);
	}

	@Override
	public Integer acitEomInsertMonthlyTotals(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomInsertMonthlyTotals", params);
	}

	@Override
	public List<AcitEomMonthlyTotals> retrieveAcitMonthEndTrialBal(HashMap<String, Object> params) throws SQLException {
		List<AcitEomMonthlyTotals> res = sqlSession.selectList("retrieveAcitMonthEndTrialBal",params);
		return res;
	}

	@Override
	public String validatePrevMonth(HashMap<String, Object> params) throws SQLException {
		params.put("validate", "");
		sqlSession.selectOne("validatePrevMonth", params);
		
		return (String) params.get("validate");
	}

	@Override
	public String validateEqualTb(HashMap<String, Object> params) throws SQLException {
		params.put("equalTb", "");
		sqlSession.selectOne("validateEqualTb", params);
		
		return (String) params.get("equalTb");
	}

	@Override
	public Integer acitEomPostToFiscalYear(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomPostToFiscalYear", params);
	}

	@Override
	public Integer failedPosting(HashMap<String, Object> params) throws SQLException {
		return sqlSession.update("failedPosting", params);
	}

	@Override
	public List<AcitEomUnpostedMonth> retrieveAcitMonthEndUnpostedMonths() throws SQLException {
		List<AcitEomUnpostedMonth> res = sqlSession.selectList("retrieveAcitMonthEndUnpostedMonths");
		return res;
	}

	@Override
	public String validateCurrMonth(HashMap<String, Object> params) throws SQLException {
		params.put("validateCurr", "");
		sqlSession.selectOne("validateCurrMonth", params);
		
		return (String) params.get("validateCurr");
	}

	@Override
	public Integer acitEomUpdateReport(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomUpdateReport", params);
	}

	@Override
	public List<AcitMonthEnd> retrieveAcitMonthEnd(HashMap<String, Object> params) throws SQLException {
		List<AcitMonthEnd> res = sqlSession.selectList("retrieveAcitMonthEnd", params);
		return res;
	}

	@Override
	public String validateQsoaQtr(HashMap<String, Object> params) throws SQLException {
		params.put("validateQsoaQtr", "");
		sqlSession.selectOne("validateQsoaQtr", params);
		
		return (String) params.get("validateQsoaQtr");
	}

	@Override
	public Integer saveQSOA(HashMap<String, Object> params) throws SQLException {
		return sqlSession.update("saveQSOA", params);
	}

	@Override
	public List<QSOADtl> retrieveQSOADtl(HashMap<String, Object> params) throws SQLException {
		List<QSOADtl> res = sqlSession.selectList("retrieveQSOADtl", params);
		return res;
	}

	@Override
	public List<QSOADtlExclude> retrieveQSOADtlExclude(HashMap<String, Object> params) throws SQLException {
		List<QSOADtlExclude> res = sqlSession.selectList("retrieveQSOADtlExclude", params);
		return res;
	}

	@Override
	public Integer saveAcitProfComm(HashMap<String, Object> params) throws SQLException {
		return sqlSession.update("saveAcitProfComm", params);
	}

	@Override
	public List<QSOAAcctReceivable> retrieveQSOAAcctReceivable(HashMap<String, Object> params) throws SQLException {
		List<QSOAAcctReceivable> res = sqlSession.selectList("retrieveQSOAAcctReceivable", params);
		return res;
	}

	@Override
	public List<QSOARemittance> retrieveQSOARemittance(HashMap<String, Object> params) throws SQLException {
		List<QSOARemittance> res = sqlSession.selectList("retrieveQSOARemittance", params);
		return res;
	}

	@Override
	public Integer updateSoaCv(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("updateSoaCv", params);
		return errorCode;
	}

	@Override
	public AcitEditedAcctEntries retrieveAcitEditedAcctEntries(HashMap<String, Object> params) throws SQLException {
		AcitEditedAcctEntries res = sqlSession.selectOne("retEditAcctEntries", params);
		return res;
	}

	@Override
	public String validateCheckNo(HashMap<String, Object> params) throws SQLException {
		params.put("validateCheckNo", "");
		sqlSession.update("validateCheckNo",params);
		return (String) params.get("validateCheckNo");
	}
	
	@Override
	public String isCvNoAvail() throws SQLException {
		String result = sqlSession.selectOne("isCvNoAvail");
		return result;
	}

	@Override
	public HashMap<String, Object> validateServfee(HashMap<String, Object> params) throws SQLException {
		params.put("valReqId", "");
		params.put("refNo", "");
		params.put("amount", "");
		params.put("return", "");
		sqlSession.update("validateServfee", params);
		return params;
	}

	@Override
	public List<AcitEomUnpostedMonth> retrieveAcctPrqServFeeMonths(HashMap<String, Object> params) throws SQLException {
		List<AcitEomUnpostedMonth> res = sqlSession.selectList("retrieveAcctPrqServFeeMonths", params);
		return res;
	}

	@Override
	public List<AcitOsQsoa> retrieveAcitOsQsoa(HashMap<String, Object> params) throws SQLException {
		List<AcitOsQsoa> res = sqlSession.selectList("retrieveAcitOsQsoa", params);
		return res;
	}
	
	@Override
	public Integer deleteAcctEntry(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("deleteAcctEntry", params);
	}
	
	@Override
	public Integer uploadAcctEntry(List<AcctEntryRowUpload> aeruList) throws SQLException {
		Integer errorCode = 0;
		
		for (AcctEntryRowUpload aeru : aeruList) {
			txManager.getTransaction(txDef);
			System.out.println("DAOUPLOAD");
			System.out.println(aeru);
			System.out.println("DAOUPLOAD");
			errorCode = sqlSession.update("uploadAcctEntry", aeru);
		}
		
		return errorCode;
	}

	@Override
	public Integer saveAcitMonthEndTBTempClose(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitMonthEndTBTempClose", params);
		return errorCode;
	}

	@Override
	public Integer editAcctEnt(HashMap<String, Object> params) throws SQLException {
		return sqlSession.update("editAcctEnt",params);
	}

	@Override
	public Integer restoreAcctEnt(HashMap<String, Object> params) throws SQLException {
		return sqlSession.update("restoreAcctEnt",params);
	}

	@Override
	public List<AcitEditedAcctEntries> retrieveEditedAcctEntInq(HashMap<String, Object> params) throws SQLException {
		return sqlSession.selectList("retEditAcctEntriesInq", params);
	}

	@Override
	public List<AcitAcctEntries> retrieveAcctEntInqDtl(HashMap<String, Object> params) throws SQLException {
		return sqlSession.selectList("retrieveAcitAcctEntriesInqDtl", params);
	}
	
	@Override
	public String validateTempClose(HashMap<String, Object> params) throws SQLException {
		params.put("validate", "");
		sqlSession.selectOne("validateTempClose", params);
		
		return (String) params.get("validate");
	}

	@Override
	public Integer saveAcitMonthEndTBReopen(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcitMonthEndTBReopen", params);
		return errorCode;
	}

	@Override
	public String validateReopen(HashMap<String, Object> params) throws SQLException {
		params.put("validate", "");
		sqlSession.selectOne("validateReopen", params);
		
		return (String) params.get("validate");
	}

	@Override
	public Integer acitEomCreateLossResDepJv(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acitEomCreateLossResDepJv", params);
	}

	@Override
	public HashMap<String, Object> saveDcbCollection(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveDcbCollection",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> SaveAcitCloseOpenDcb(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("SaveAcitCloseOpenDcb",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<AcitDcbCollection> retrieveAcitDcbCollection(HashMap<String, Object> params) throws SQLException {
		List<AcitDcbCollection> res = sqlSession.selectList("retrieveAcitDcbCollection", params);
		return res;
	}

	@Override
	public List<AcitDcbBankDetails> retrieveAcitBankDetails(HashMap<String, Object> params) throws SQLException {
		List<AcitDcbBankDetails> res = sqlSession.selectList("retrieveAcitBankDetails", params);
		return res;
	}
	
	@Override
	public String validateTranAcctEntDate(HashMap<String, Object> params) throws SQLException {
		params.put("validateTranAcctEntDate", "");
		sqlSession.update("validateTranAcctEntDate",params);
		return (String) params.get("validateTranAcctEntDate");
	}

	@Override
	public List<AcitProfCommSumm> retrievePCSummPerCeding(HashMap<String, Object> params) throws SQLException {
		List<AcitProfCommSumm> acitProfCommSummList = sqlSession.selectList("retrievePCSummPerCeding", params);
		return acitProfCommSummList;
	}
	
	@Override
	public List<AcitClmHist> retrieveAcitClmHist(HashMap<String, Object> params) throws SQLException {
		List<AcitClmHist> acitClmHistList  = sqlSession.selectList("retrieveAcitClmHist", params);
		return acitClmHistList;
	}

	@Override
	public Integer saveAcitProfCommTran(HashMap<String, Object> params) throws SQLException {
		return sqlSession.update("saveAcitProfCommTran", params);
	}

	@Override
	public String getAcitTranNo(HashMap<String, Object> params) throws SQLException {
		params.put("tranNo", "");
		sqlSession.update("getAcitTranNo",params);
		return (String) params.get("tranNo");
	}

	@Override
	public String validateProfCommTran(HashMap<String, Object> params) throws SQLException {
		params.put("tranNo", "");
		sqlSession.update("validateProfCommTran",params);
		return (String) params.get("tranNo");
	}

	@Override
	public List<AcitProfCommSumm> retrieveProfCommParams() throws SQLException {
		List<AcitProfCommSumm> acitProfCommSummList = sqlSession.selectList("retrieveProfCommParams");
		return acitProfCommSummList;
	}

	@Override
	public List<AcitUnappliedCollection> retrieveUnappliedCollection(HashMap<String, Object> params)
			throws SQLException {
		List<AcitUnappliedCollection> response = sqlSession.selectList("retrieveUnappliedCollection",params);
		return response;
	}

	@Override
	public List<AcitJVUnappliedCollection> retrieveJvUnappliedCollection(HashMap<String, Object> params)
			throws SQLException {
		List<AcitJVUnappliedCollection> response = sqlSession.selectList("retrieveJvUnappColl", params);
		return response;
	}

	@Override
	public List<AcitJvUnappInw> retrieveInwUnappliedCollection(HashMap<String, Object> params) throws SQLException {
		List<AcitJvUnappInw> response = sqlSession.selectList("retrieveInwUnappliedCollection", params);
		return response;
	}

	@Override
	public HashMap<String, Object> saveJVUnappliedColl(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveJVUnappliedColl",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> saveJVInwUnappliedColl(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveJVInwUnappliedColl",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<AcitJvUnappliedTreaty> retrieveTrtyUnappliedCollection(HashMap<String, Object> params)
			throws SQLException {
		List<AcitJvUnappliedTreaty> response = sqlSession.selectList("retrieveTrtyUnappliedCollection", params);
		return response;
	}

	@Override
	public HashMap<String, Object> saveJVTrtyUnappliedColl(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveJVTrtyUnappliedColl",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public String checkAcitJvSeries() throws SQLException {
		String result = sqlSession.selectOne("checkAcitJvSeries");
		return result;
	}

	@Override
	public Integer retrieveAcitJvListingLength(HashMap<String, Object> params) throws SQLException {
		Integer length = (Integer) sqlSession.selectOne("retrieveAcitJvListingLength", params);
		return length;
	}

	@Override
	public HashMap<String, Object> saveJVMultiOffset(HashMap<String, Object> params) throws SQLException {
		sqlSession.update("saveJVMultiOffset",params);
		return params;
	}

	@Override
	public List<MultiOffsetIpb> retrieveMultiOffsetIpb(HashMap<String, Object> params) throws SQLException {
		List<MultiOffsetIpb> response = sqlSession.selectList("retrieveMultiOffsetIpb", params);
		return response;
	}
	
	@Override
	public List<MultiOffsetClm> retrieveMultiOffsetClm(HashMap<String, Object> params) throws SQLException {
		List<MultiOffsetClm> response = sqlSession.selectList("retrieveMultiOffsetClm", params);
		return response;
	}

	@Override
	public List<MultiOffsetTrty> retrieveMultiOffsetTrty(HashMap<String, Object> params) throws SQLException {
		List<MultiOffsetTrty> response = sqlSession.selectList("retrieveMultiOffsetTrty", params);
		return response;
	}
	
	@Override
	public List<MultiOffsetUnapp> retrieveMultiOffsetUnapp(HashMap<String, Object> params) throws SQLException {
		List<MultiOffsetUnapp> response = sqlSession.selectList("retrieveMultiOffsetUnapp", params);
		return response;
	}
	
	@Override
	public List<MultiOffsetInvPo> retrieveMultiOffsetInvPo(HashMap<String, Object> params) throws SQLException {
		List<MultiOffsetInvPo> response = sqlSession.selectList("retrieveMultiOffsetInvPo", params);
		return response;
	}
	
	@Override
	public List<MultiOffsetInvPl> retrieveMultiOffsetInvPl(HashMap<String, Object> params) throws SQLException {
		List<MultiOffsetInvPl> response = sqlSession.selectList("retrieveMultiOffsetInvPl", params);
		return response;
	}
	
	@Override
	public List<MultiOffsetLrd> retrieveAcitJVCedRepLoss(HashMap<String, Object> params) throws SQLException {
		List<MultiOffsetLrd> response = sqlSession.selectList("retrieveAcitJVCedRepLoss", params);
		return response;
	}
	
	@Override
	public List<MultiOffsetLrd> retrieveMultiOffsetLrd(HashMap<String, Object> params) throws SQLException {
		List<MultiOffsetLrd> response = sqlSession.selectList("retrieveMultiOffsetLrd", params);
		return response;
	}
	
	@Override
	public List<MultiOffsetOth> retrieveMultiOffsetOth(HashMap<String, Object> params) throws SQLException {
		List<MultiOffsetOth> response = sqlSession.selectList("retrieveMultiOffsetOth", params);
		return response;
	}
	
	@Override
	public MultiOffsetExisting retrieveMultiOffsetExisting(HashMap<String, Object> params) throws SQLException {
		MultiOffsetExisting response = sqlSession.selectOne("retrieveMultiOffsetExisting", params);
		return response;
	}

	@Override
	public HashMap<String, Object> updateAgingSoa(HashMap<String, Object> params) throws SQLException {
		sqlSession.update("updateAgingSoa", params);
		return params;
	}

	@Override
	public List<AcitMonthEndJV> retrieveAcitMonthEndJV(HashMap<String, Object> params) throws SQLException {
		List<AcitMonthEndJV> res = sqlSession.selectList("retrieveAcitMonthEndJV", params);
		return res;
	}
	
	@Override
	public List<QSOAPrint> retrieveAcitQsoaPrint(HashMap<String, Object> params) throws SQLException {
		List<QSOAPrint> res = sqlSession.selectList("retrieveAcitQsoaPrint", params);
		return res;
	}

	@Override
	public List<AcitAcctEntriesExt> retrieveAcitAcctEntriesExt(RetrieveAcitAcctEntriesExtRequest request) {
		List<AcitAcctEntriesExt> res = sqlSession.selectList("retrieveAcitAcctEntriesExt", request);
		return res;
	}

	@Override
	public List<AcitTrialBal> retrieveAcitTrialBalExt(HashMap<String, Object> params) throws SQLException {
		List<AcitTrialBal> res = sqlSession.selectList("retrieveAcitTrialBalExt", params);
		return res;
	}
}
