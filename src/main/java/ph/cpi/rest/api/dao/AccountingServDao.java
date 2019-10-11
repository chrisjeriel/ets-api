package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.accountingservice.AcseAcctEntries;
import ph.cpi.rest.api.model.accountingservice.AcseAttachments;
import ph.cpi.rest.api.model.accountingservice.AcseBudgetExpense;
import ph.cpi.rest.api.model.accountingservice.AcseCv;
import ph.cpi.rest.api.model.accountingservice.AcseCvPaytReq;
import ph.cpi.rest.api.model.accountingservice.AcseJournalVoucherEntry;
import ph.cpi.rest.api.model.accountingservice.AcseJournalVoucherList;
import ph.cpi.rest.api.model.accountingservice.AcseOrServFee;
import ph.cpi.rest.api.model.accountingservice.AcsePaytReq;
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
	public List<AcseBudgetExpense> retrieveAcseBudgetExpense(final HashMap<String, Object> params ) throws SQLException;
	public Integer saveAcseBudgetExpense(final HashMap<String, Object> params) throws SQLException;
}
