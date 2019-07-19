package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitCMDM;
import ph.cpi.rest.api.model.accountingintrust.AcitCvPaytReq;
import ph.cpi.rest.api.model.accountingintrust.AcitPaytReq;
import ph.cpi.rest.api.model.accountingintrust.RefNoLov;
import ph.cpi.rest.api.model.accountingintrust.AcknowledgementReceipt;
import ph.cpi.rest.api.model.accountingintrust.AcitTransactions;

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
}
