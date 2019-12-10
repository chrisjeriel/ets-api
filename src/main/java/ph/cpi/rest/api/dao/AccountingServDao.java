package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.accountingservice.AcseAcctEntries;
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
import ph.cpi.rest.api.model.accountingservice.OfficialReceipt;
import ph.cpi.rest.api.model.accountingservice.OrTransDtl;

public interface AccountingServDao {
	public List<OfficialReceipt> retrieveOrList(final HashMap<String, Object> params) throws SQLException;
	public OfficialReceipt retrieveOrEntry(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveOrEntry(final HashMap<String, Object> params) throws SQLException;
	public List<AcseJournalVoucherList> retrieveJVList(final HashMap<String, Object> params)throws SQLException;
	public List<AcsePaytReq> retrieveAcsePaytReq(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcsePaytReq(final HashMap<String, Object> params) throws SQLException;
	public AcseJournalVoucherEntry retrieveJVEntry(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveJVEntry(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> aprroveJV(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> cancelJV(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> updateAcsePaytReqStat(final HashMap<String, Object> params) throws SQLException;
	public List<AcseTaxDetails> retrieveTaxDetails(final HashMap<String, Object> params) throws SQLException;
	public List<OrTransDtl> retrieveAcseOrTransDtl(final HashMap<String, Object> params) throws SQLException;
	public Integer saveAcseOrTransDtl(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String,Object> saveTaxDetails(final HashMap<String,Object> params)throws SQLException;
	public List<AcsePrqTrans> retrieveAcsePrqTrans(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcsePrqTrans(final HashMap<String, Object> params) throws SQLException;
	public List<AcseCv> retrieveAcseCv(final HashMap<String, Object> params) throws SQLException;
	public List<AcseAcctEntries> retrieveAcctEntries(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcseCv(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcctEntries(final HashMap<String, Object> params) throws SQLException;
	public List<AcseAttachments> retrieveAttachments(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAttachments(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> updateAcseCvStat(final HashMap<String, Object> params) throws SQLException;
	public List<AcseCvPaytReq> retrieveAcseCvPaytReqList(final HashMap<String, Object> params ) throws SQLException;
	public Integer saveAcseCvPaytReqList(final HashMap<String, Object> params) throws SQLException;
	public Integer cancelOr(final HashMap<String, Object> params) throws SQLException;
	public List<AcseOrServFee> retrieveAcseOrServFee(final HashMap<String, Object> params) throws SQLException;
	public Integer saveAcseOrServFee(final HashMap<String, Object> params) throws SQLException;
	public List<AcseBatchOR> retrieveAcseBatchOr(final HashMap<String, Object> params) throws SQLException;
	public List<AcseBudgetExpense> retrieveAcseBudgetExpense(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> saveAcseBudgetExpense(final HashMap<String, Object> params) throws SQLException;
	public List<AcseBudExpMonthly> retrieveAcseBudExpMonthly(final HashMap<String, Object> params) throws SQLException;
	public Integer saveAcseBudExpMonthly(final HashMap<String, Object> params) throws SQLException;
	public List<AcseBudExpMonthly> retrieveAcseActExpMonthly(final HashMap<String, Object> params) throws SQLException;
	public Integer printOr(final HashMap<String,Object> params) throws SQLException;
	public Integer printOrBatch(final HashMap<String,Object> params) throws SQLException;
	public List<AcseCancelledOR> retrieveAcseChangeToNewOR(final HashMap<String,Object> params) throws SQLException;
	public HashMap<String,Object> updateAcseChangeStat(final HashMap<String,Object> params) throws SQLException;
	public List<AcseCancelledCV> retrieveAcseChangeToNewCV(final HashMap<String,Object> params) throws SQLException;
	public List<AcseCancelledJV> retrieveAcseChangeToNewJV(final HashMap<String,Object> params) throws SQLException;
	public List<AcseCancelledTransactions> retrieveAcseCancelledTran(final HashMap<String,Object> params) throws SQLException;
	public List<AcseBatchInvoice> retrieveAcseBatchInvoice(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcseInvoice(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String,Object> printAcseJv(final HashMap<String,Object> params) throws SQLException;
	public Integer generateBatchInvoiceNo(final HashMap<String,Object> params) throws SQLException;
	public List<AcseInvoiceItems> retrieveAcseInvoiceItems(final HashMap<String, Object> params) throws SQLException;
	public Integer saveAcseInvoiceItem(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String,Object> copyAcseExpenseBudget(final HashMap<String,Object> params) throws SQLException;
	public Integer generateBatchOrNo(final HashMap<String,Object> params) throws SQLException;
	public Integer printInvoiceBatch(final HashMap<String,Object> params) throws SQLException;
	
	public String validateCheckNo(final HashMap<String, Object> params) throws SQLException;
	public List<AcsePerDiem> retrieveAcsePerDiem(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcsePerDiem(final HashMap<String, Object> params) throws SQLException;
	public List<AcseDcbCollection> retrieveAcseDcbCollection(final HashMap<String, Object> params) throws SQLException;
	public List<AcseDcbBankDetails> retrieveAcseBankDetails(final HashMap<String, Object> params) throws SQLException;
	public List<AcseInsuranceExp> retrieveAcseInsuranceExp(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcseInsuranceExp(final HashMap<String, Object> params) throws SQLException;
	public AcseEditedAcctEntries retrieveAcseEditedAcctEntries (final HashMap<String, Object> params) throws SQLException;
	public List<AcseEditedAcctEntries> retrieveEditedAcctEntInq(final HashMap<String, Object> params) throws SQLException;
	public List<AcseAcctEntries> retrieveAcctEntInqDtl(final HashMap<String, Object> params) throws SQLException;
	public Integer editAcctEnt(final HashMap<String, Object> params) throws SQLException;
	public Integer restoreAcctEnt(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String,Object> saveAcseCloseOpenDcb(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String,Object> saveDcbCollection(final HashMap<String, Object> params) throws SQLException;
	public Integer updateAcseStat(final HashMap<String, Object> params ) throws SQLException;
	public String validateTranAcctEntDate(final HashMap<String, Object> params) throws SQLException;
	
	public String validateTbDate(final HashMap<String, Object> params) throws SQLException;
}
