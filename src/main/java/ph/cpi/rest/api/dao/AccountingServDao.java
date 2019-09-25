package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.accountingservice.AcseJournalVoucherList;
import ph.cpi.rest.api.model.accountingservice.AcsePaytReq;
import ph.cpi.rest.api.model.accountingservice.OfficialReceipt;

public interface AccountingServDao {
	public List<OfficialReceipt> retrieveOrList(final HashMap<String, Object> params) throws SQLException;
	public OfficialReceipt retrieveOrEntry(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveOrEntry(final HashMap<String, Object> params) throws SQLException;
	public List<AcseJournalVoucherList> retrieveJVList(final HashMap<String, Object> params)throws SQLException;
	public List<AcsePaytReq> retrieveAcsePaytReq(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcsePaytReq(final HashMap<String, Object> params) throws SQLException;
}
