package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.accountingservice.OfficialReceipt;

public interface AccountingServDao {
	public List<OfficialReceipt> retrieveOrList(HashMap<String, Object> params) throws SQLException;
}
