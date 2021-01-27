package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import ph.cpi.rest.api.dao.AccountingServDao;
import ph.cpi.rest.api.model.accountingintrust.AcctServFeeDist;
import ph.cpi.rest.api.model.accountingintrust.AcitEomMonthlyTotals;
import ph.cpi.rest.api.model.accountingintrust.AcitEomUnpostedMonth;
import ph.cpi.rest.api.model.accountingintrust.RefNoLov;
import ph.cpi.rest.api.model.accountingservice.AcseAcctEntries;
import ph.cpi.rest.api.model.accountingservice.AcseAcctEntriesExt;
import ph.cpi.rest.api.model.accountingservice.AcseAttachments;
import ph.cpi.rest.api.model.accountingservice.AcseBatchInvoice;
import ph.cpi.rest.api.model.accountingservice.AcseBatchOR;
import ph.cpi.rest.api.model.accountingservice.AcseBudExpMonthly;
import ph.cpi.rest.api.model.accountingservice.AcseBudgetExpense;
import ph.cpi.rest.api.model.accountingservice.AcseCancelledCV;
import ph.cpi.rest.api.model.accountingservice.AcseCancelledJV;
import ph.cpi.rest.api.model.accountingservice.AcseCancelledOR;
import ph.cpi.rest.api.model.accountingservice.AcseCancelledTransactions;
import ph.cpi.rest.api.model.accountingservice.AcseCv;
import ph.cpi.rest.api.model.accountingservice.AcseCvPaytReq;
import ph.cpi.rest.api.model.accountingservice.AcseDcbBankDetails;
import ph.cpi.rest.api.model.accountingservice.AcseDcbCollection;
import ph.cpi.rest.api.model.accountingservice.AcseEditedAcctEntries;
import ph.cpi.rest.api.model.accountingservice.AcseInsuranceExp;
import ph.cpi.rest.api.model.accountingservice.AcseInvoiceItems;
import ph.cpi.rest.api.model.accountingservice.AcseJournalVoucherEntry;
import ph.cpi.rest.api.model.accountingservice.AcseJournalVoucherList;
import ph.cpi.rest.api.model.accountingservice.AcseOrServFee;
import ph.cpi.rest.api.model.accountingservice.AcsePaytReq;
import ph.cpi.rest.api.model.accountingservice.AcsePerDiem;
import ph.cpi.rest.api.model.accountingservice.AcsePrqTrans;
import ph.cpi.rest.api.model.accountingservice.AcseTaxDetails;
import ph.cpi.rest.api.model.accountingservice.AcseTrialBal;
import ph.cpi.rest.api.model.accountingservice.OfficialReceipt;
import ph.cpi.rest.api.model.accountingservice.OrTransDtl;
import ph.cpi.rest.api.model.request.RetrieveAcseAcctEntriesExtRequest;

@Component
public class AccountingServDaoImpl implements AccountingServDao{
	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private PlatformTransactionManager txManager;
	
	private DefaultTransactionDefinition txDef = new DefaultTransactionDefinition();
	
	private TransactionStatus txStat;
	

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
	public List<OrTransDtl> retrieveAcseOrTransDtl(HashMap<String, Object> params) throws SQLException {
		List<OrTransDtl> res = sqlSession.selectList("retOrTransDtl", params);
		return res;
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

	@Override
	public Integer saveAcseOrTransDtl(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveAcseOrTransDtl", params);
		return res;
	}

	@Override
	public HashMap<String, Object> saveTaxDetails(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveTaxDetails",params);
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
	public List<AcseAcctEntries> retrieveAcctEntries(HashMap<String, Object> params) throws SQLException {
		List<AcseAcctEntries> list = sqlSession.selectList("retrieveAcctEntries", params);
		return list;
	}
	
	@Override
	public HashMap<String, Object> saveAcseCv(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcseCv", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> saveAcctEntries(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcctEntries",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<AcseAttachments> retrieveAttachments(HashMap<String, Object> params) throws SQLException {
		List<AcseAttachments> list = sqlSession.selectList("retrieveAttachments", params);
		return list;
	}

	@Override
	public HashMap<String, Object> saveAttachments(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAttachments",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public HashMap<String, Object> updateAcseCvStat(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("updateAcseCvStat", params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public List<AcseCvPaytReq> retrieveAcseCvPaytReqList(HashMap<String, Object> params) throws SQLException {
		List<AcseCvPaytReq> acseCvPaytReqList = sqlSession.selectList("retrieveAcseCvPaytReqList", params);
		return acseCvPaytReqList;
	}
	
	@Override
	public Integer saveAcseCvPaytReqList(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcseCvPaytReqList", params);
		return errorCode;
	}

	@Override
	public Integer cancelOr(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("cancelOr", params);
		return errorCode;
	}

	@Override
	public List<AcseOrServFee> retrieveAcseOrServFee(HashMap<String, Object> params) throws SQLException {
		List<AcseOrServFee> res = sqlSession.selectList("retAcseOrServFee", params);
		return res;
	}

	@Override
	public Integer saveAcseOrServFee(HashMap<String, Object> params) throws SQLException {
		Integer returnCode = sqlSession.update("saveAcseOrServFee", params);
		return returnCode;
	}

	@Override
	public List<AcseBatchOR> retrieveAcseBatchOr(HashMap<String, Object> params)
			throws SQLException {
		List<AcseBatchOR> res = sqlSession.selectList("retrieveAcseBatchOr", params);
		return res;
	}

	public List<AcseBudgetExpense> retrieveAcseBudgetExpense(HashMap<String, Object> params) throws SQLException {
		List<AcseBudgetExpense> acseBudgetExpenseList = sqlSession.selectList("retrieveAcseBudgetExpense", params);
		return acseBudgetExpenseList;
	}
	
	@Override
	public HashMap<String, Object> saveAcseBudgetExpense(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcseBudgetExpense", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<AcseBudExpMonthly> retrieveAcseBudExpMonthly(HashMap<String, Object> params) throws SQLException {
		List<AcseBudExpMonthly> res = sqlSession.selectList("retrieveAcseBudExpMonthly", params);
		return res;
	}

	@Override
	public Integer saveAcseBudExpMonthly(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveAcseBudExpMonthly",params);
		return res;
	}

	@Override
	public List<AcseBudExpMonthly> retrieveAcseActExpMonthly(HashMap<String, Object> params) throws SQLException {
		List<AcseBudExpMonthly> res = sqlSession.selectList("retrieveAcseActExpMonthly", params);
		return res;
	}

	@Override
	public Integer printOr(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("printOr", params);
		return res;
	}
	
	@Override
	public Integer printOrBatch(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("printOrBatch", params);
		return res;
	}

	@Override
	public List<AcseCancelledOR> retrieveAcseChangeToNewOR(HashMap<String, Object> params) throws SQLException {
		List<AcseCancelledOR> list = sqlSession.selectList("retrieveAcseChangeToNew", params);
		return list;
	}

	@Override
	public HashMap<String, Object> updateAcseChangeStat(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("updateAcseChangeStat",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<AcseCancelledCV> retrieveAcseChangeToNewCV(HashMap<String, Object> params) throws SQLException {
		List<AcseCancelledCV> list = sqlSession.selectList("retrieveAcseChangeToNewCV",params);
		return list;
	}

	@Override
	public List<AcseCancelledJV> retrieveAcseChangeToNewJV(HashMap<String, Object> params) throws SQLException {
		List<AcseCancelledJV> list = sqlSession.selectList("retrieveAcseChangeToNewJV", params);
		return list;
	}

	@Override
	public List<AcseCancelledTransactions> retrieveAcseCancelledTran(HashMap<String, Object> params)
			throws SQLException {
		List<AcseCancelledTransactions> list = sqlSession.selectList("retrieveAcseCancelledTran", params);
		return list;
	}

	@Override
	public List<AcseBatchInvoice> retrieveAcseBatchInvoice(
			HashMap<String, Object> params) throws SQLException {
		 List<AcseBatchInvoice> list = sqlSession.selectList("retrieveAcseBatchInvoice",params);
		return list;
	}

	@Override
	public HashMap<String, Object> saveAcseInvoice(
			HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcseInvoice",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public HashMap<String, Object> printAcseJv(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("printAcseJv", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public Integer generateBatchInvoiceNo(HashMap<String, Object> params)
			throws SQLException {
		Integer res = sqlSession.update("generateBatchInvoiceNo", params);
		return res;
	}

	@Override
	public List<AcseInvoiceItems> retrieveAcseInvoiceItems(
			HashMap<String, Object> params) throws SQLException {
		List<AcseInvoiceItems> res = sqlSession.selectList("retrieveAcseInvoiceItems", params);
		return res;
	}

	@Override
	public Integer saveAcseInvoiceItem(
			HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcseInvoiceItem",params);
		return errorCode;
	}
	
	@Override
	public HashMap<String, Object> copyAcseExpenseBudget(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("copyAcseExpenseBudget",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public String validateCheckNo(HashMap<String, Object> params) throws SQLException {
		params.put("validateCheckNo", "");
		sqlSession.update("validateCheckNoAcse",params);
		return (String) params.get("validateCheckNo");
	}
	
	@Override
	public String isCvNoAvail(HashMap<String, Object> params) throws SQLException {
		String result = sqlSession.selectOne("isCvNoAvailAcse", params);
		return result;
	}

	@Override
	public List<AcsePerDiem> retrieveAcsePerDiem(HashMap<String, Object> params) throws SQLException {
		List<AcsePerDiem> acsePerDiemList  = sqlSession.selectList("retrieveAcsePerDiem", params);
		return acsePerDiemList;
	}
	
	@Override
	public HashMap<String, Object> saveAcsePerDiem(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcsePerDiem", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public Integer generateBatchOrNo(HashMap<String, Object> params)
			throws SQLException {
		Integer res = sqlSession.update("generateBatchOrNo", params);
		return res;
	}

	@Override
	public List<AcseDcbCollection> retrieveAcseDcbCollection(HashMap<String, Object> params) throws SQLException {
		List<AcseDcbCollection> res = sqlSession.selectList("retrieveAcseDcbCollection",params);
		return res;
	}

	@Override
	public List<AcseDcbBankDetails> retrieveAcseBankDetails(HashMap<String, Object> params) throws SQLException {
		List<AcseDcbBankDetails> res = sqlSession.selectList("retrieveAcseBankDetails", params); 
		return res;
	}

	@Override
	public List<AcseInsuranceExp> retrieveAcseInsuranceExp(HashMap<String, Object> params) throws SQLException {
		List<AcseInsuranceExp> acseInsuranceExpList = sqlSession.selectList("retrieveAcseInsuranceExp", params);
		return acseInsuranceExpList;
	}

	@Override
	public HashMap<String, Object> saveAcseInsuranceExp(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcseInsuranceExp", params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public Integer printInvoiceBatch(HashMap<String, Object> params)
			throws SQLException {
		Integer res = sqlSession.update("printInvoiceBatch", params);
		return res;
	}

	@Override
	public AcseEditedAcctEntries retrieveAcseEditedAcctEntries(HashMap<String, Object> params) throws SQLException {
		return sqlSession.selectOne("retEditAcctEntriesServ", params);
	}

	@Override
	public List<AcseEditedAcctEntries> retrieveEditedAcctEntInq(HashMap<String, Object> params) throws SQLException {
		return sqlSession.selectList("retEditAcctEntriesInqServ", params);
	}

	@Override
	public List<AcseAcctEntries> retrieveAcctEntInqDtl(HashMap<String, Object> params) throws SQLException {
		return sqlSession.selectList("retrieveAcseAcctEntriesInqDtl", params);
	}

	@Override
	public Integer editAcctEnt(HashMap<String, Object> params) throws SQLException {
		return sqlSession.update("editAcctEntServ",params);
	}

	@Override
	public Integer restoreAcctEnt(HashMap<String, Object> params) throws SQLException {
		return sqlSession.update("restoreAcctEntServ",params);
	}
	
	@Override
	public HashMap<String, Object> saveAcseCloseOpenDcb(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcseCloseOpenDcb",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> saveDcbCollection(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcseDcbCollection",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
    public Integer updateAcseStat(HashMap<String, Object> params) throws SQLException {
        Integer errorCode = sqlSession.update("updateAcseStat", params);
        return errorCode;
    }
	
	@Override
	public String validateTranAcctEntDate(HashMap<String, Object> params) throws SQLException {
		params.put("validateTranAcctEntDate", "");
		sqlSession.update("validateTranAcctEntDateAcse",params);
		return (String) params.get("validateTranAcctEntDate");
	}
	
	@Override
	public String validateTbDate(HashMap<String, Object> params) throws SQLException {
		params.put("validate", "");
		sqlSession.selectOne("validateTbDateSe", params);
		
		return (String) params.get("validate");
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
	public Integer acseEomInsertEndOfMonth(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acseEomInsertEndOfMonth", params);
	}
	
	@Override
	public Integer acseEomCloseTrans(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acseEomCloseTrans", params);
	}
	
	@Override
	public Integer acseEomDeleteTrans(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acseEomDeleteTrans", params);
	}
	
	@Override
	public Integer acseEomDeleteMonthlyTotals(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acseEomDeleteMonthlyTotals", params);
	}
	
	@Override
	public Integer acseEomInsertMonthlyTotals(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acseEomInsertMonthlyTotals", params);
	}
	
	@Override
	public Integer acseEomDeleteMonthlyTotalsBackup() throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acseEomDeleteMonthlyTotalsBackup");
	}
	
	@Override
	public Integer acseEomInsertMonthlyTotalsBackup(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acseEomInsertMonthlyTotalsBackup", params);
	}
	
	@Override
	public List<AcitEomMonthlyTotals> retrieveAcseMonthEndTrialBal(HashMap<String, Object> params) throws SQLException {
		List<AcitEomMonthlyTotals> res = sqlSession.selectList("retrieveAcseMonthEndTrialBal",params);
		return res;
	}
	
	@Override
	public List<AcitEomUnpostedMonth> retrieveAcseMonthEndUnpostedMonths() throws SQLException {
		List<AcitEomUnpostedMonth> res = sqlSession.selectList("retrieveAcseMonthEndUnpostedMonths");
		return res;
	}
	
	@Override
	public String validatePrevMonth(HashMap<String, Object> params) throws SQLException {
		params.put("validate", "");
		sqlSession.selectOne("validatePrevMonthSe", params);
		
		return (String) params.get("validate");
	}
	
	@Override
	public String validateCurrMonth(HashMap<String, Object> params) throws SQLException {
		params.put("validateCurr", "");
		sqlSession.selectOne("validateCurrMonthSe", params);
		
		return (String) params.get("validateCurr");
	}
	
	@Override
	public String validateEqualTb(HashMap<String, Object> params) throws SQLException {
		params.put("equalTb", "");
		sqlSession.selectOne("validateEqualTbSe", params);
		
		return (String) params.get("equalTb");
	}
	
	@Override
	public Integer acseEomPostToFiscalYear(HashMap<String, Object> params) throws SQLException {
		txManager.getTransaction(txDef);
		return sqlSession.update("acseEomPostToFiscalYear", params);
	}
	
	@Override
	public Integer failedPosting(HashMap<String, Object> params) throws SQLException {
		return sqlSession.update("failedPostingSe", params);
	}
	
	@Override
	public String validateTempClose(HashMap<String, Object> params) throws SQLException {
		params.put("validate", "");
		sqlSession.selectOne("validateTempCloseSe", params);
		
		return (String) params.get("validate");
	}
	
	@Override
	public Integer saveAcseMonthEndTBTempClose(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcseMonthEndTBTempClose", params);
		return errorCode;
	}
	
	@Override
	public String validateReopen(HashMap<String, Object> params) throws SQLException {
		params.put("validate", "");
		sqlSession.selectOne("validateReopenSe", params);
		
		return (String) params.get("validate");
	}
	
	@Override
	public Integer saveAcseMonthEndTBReopen(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveAcseMonthEndTBReopen", params);
		return errorCode;
	}

	@Override
	public String checkEom(HashMap<String, Object> params) throws SQLException {
		params.put("checkEom", "");
		sqlSession.selectOne("checkEom", params);
		
		return (String) params.get("checkEom");
	}

	@Override
	public AcctServFeeDist retrieveOrSFeeDtlDist(HashMap<String, Object> params) throws SQLException {
		return sqlSession.selectOne("retOrServFeeDtlDist", params);
	}
	
	@Override
	public String checkAcseJvSeries(HashMap<String, Object> params) throws SQLException {
		String result = sqlSession.selectOne("checkAcseJvSeries", params);
		return result;
	}

	@Override
	public HashMap<String, Object> validateCopyBudgetYear(HashMap<String, Object> params) throws SQLException {
		params.put("validate", "");
		params.put("message", "");
		sqlSession.update("validateCopyBudgetYear", params);
		
		return params;
	}

	@Override
	public HashMap<String, Object> extractAcseExpenseBudget(HashMap<String, Object> params) throws SQLException {
		sqlSession.update("extractAcseExpenseBudget", params);
		return params;
	}

	@Override
	public List<RefNoLov> retrieveAcseRefNoLOV(HashMap<String, Object> params) throws SQLException {
		List<RefNoLov> list = sqlSession.selectList("retrieveAcseRefNoLOV", params);
		return list;
	}

	@Override
	public List<AcseAcctEntriesExt> retrieveAcseAcctEntriesExt(RetrieveAcseAcctEntriesExtRequest request) {
		List<AcseAcctEntriesExt> res = sqlSession.selectList("retrieveAcseAcctEntriesExt", request);
		return res;
	}

	@Override
	public List<AcseTrialBal> retrieveAcseTrialBalExt(HashMap<String, Object> params) throws SQLException {
		List<AcseTrialBal> res = sqlSession.selectList("retrieveAcseTrialBalExt", params);
		return res;
	}
	
}
