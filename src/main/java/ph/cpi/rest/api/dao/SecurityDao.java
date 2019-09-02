package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.maintenance.Module;
import ph.cpi.rest.api.model.maintenance.Transaction;

public interface SecurityDao {

	public List<Module> retrieveMtnModules(final HashMap<String, Object> params) throws SQLException;
	public List<Transaction> retrieveMtnTransactions(final HashMap<String, Object> params) throws SQLException;
	
}
