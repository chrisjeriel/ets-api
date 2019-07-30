package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitAcctEntries;
import ph.cpi.rest.api.model.accountingintrust.AcitCMDM;
import ph.cpi.rest.api.model.accountingintrust.AcitCvPaytReq;
import ph.cpi.rest.api.model.accountingintrust.AcitJVAdjstInwPolBal;
import ph.cpi.rest.api.model.accountingintrust.AcitJVIntOverdueAcctsMS;
import ph.cpi.rest.api.model.accountingintrust.AcitJVPremResReleased;
import ph.cpi.rest.api.model.accountingintrust.AcitPaytReq;
import ph.cpi.rest.api.model.accountingintrust.AcitSOAAgingDetails;
import ph.cpi.rest.api.model.accountingintrust.RefNoLov;
import ph.cpi.rest.api.model.accountingintrust.AcknowledgementReceipt;
import ph.cpi.rest.api.model.accountingintrust.QSOA;
import ph.cpi.rest.api.model.accountingintrust.AcitTransactions;
import ph.cpi.rest.api.model.accountingintrust.AcitPrqTrans;
import ph.cpi.rest.api.model.accountingintrust.AcitTransactions;
import ph.cpi.rest.api.model.accountingintrust.AcknowledgementReceipt;
import ph.cpi.rest.api.model.accountingintrust.RefNoLov;

public interface AccountingInTrustDao {
	public List<AcitCvPaytReq> retrieveAcitCvPaytReqList(final HashMap<String, Object> params ) throws SQLException;
	public List<AcitPaytReq> retrieveAcitPaytReq(final HashMap<String, Object> params) throws SQLException;
	public List<AcitTransactions> retrieveAcitJVListings(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitPaytReq(final HashMap<String, Object> params) throws SQLException;
	public List<AcitCMDM> retrieveAcitCMDMList(final HashMap<String, Object> params) throws SQLException;
	public Integer saveAcitCMDM(final HashMap<String, Object> params) throws SQLException;
	public List<RefNoLov> retrieveAcitRefNoLOV(final HashMap<String, Object> params) throws SQLException;
	public List<AcknowledgementReceipt> retrieveArList(final HashMap<String, Object> params) throws SQLException;
	public AcknowledgementReceipt retrieveArEntry(final HashMap<String, Object> params) throws SQLException;
	public AcitTransactions retrieveAcitJVEntry(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitJVEntry(final HashMap<String, Object> params) throws SQLException;
	public List<AcitSOAAgingDetails> retrieveAcitSOAAging(final HashMap<String, Object> params) throws SQLException;
	public List<AcitJVAdjstInwPolBal> retrieveAcitJVAdjstInwPolBal(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> updateAcitPaytReqStat(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitPrqTrans(final HashMap<String, Object> params) throws SQLException;
	public List<AcitPrqTrans> retrieveAcitPrqTrans(final HashMap<String, Object> params) throws SQLException;
	public List<AcitJVIntOverdueAcctsMS> retrieveAcitJVIntOverdAcctsMS(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitJVAdjInwPolBal(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitJVOverdueAccts(final HashMap<String, Object> params) throws SQLException;
	public List<AcitJVPremResReleased> retrieveAcitJVPremResRel(final HashMap<String, Object> params) throws SQLException;
	public Integer cancelCMDM(final HashMap<String, Object> params) throws SQLException;
	public Integer printCMDM(final HashMap<String, Object> params) throws SQLException;
	public List<AcitAcctEntries> retrieveAcitAcctEntries(final HashMap<String, Object> params) throws SQLException;
	public List<QSOA> retrieveQSOAList(final HashMap<String, Object> params) throws SQLException;
	public Integer saveAcitAcctEntries(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitJVPremResRel(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> cancelJV(final HashMap<String, Object> params) throws SQLException;
	
}
