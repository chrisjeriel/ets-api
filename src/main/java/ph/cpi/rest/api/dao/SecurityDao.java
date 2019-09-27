package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.maintenance.Module;
import ph.cpi.rest.api.model.maintenance.Transaction;
import ph.cpi.rest.api.model.maintenance.UserWithGrpModule;
import ph.cpi.rest.api.model.maintenance.UserWithGrpTransaction;

public interface SecurityDao {

	public List<Module> retrieveMtnModules(final HashMap<String, Object> params) throws SQLException;
	public List<UserWithGrpModule> retrieveUserModules(final HashMap<String, Object> params) throws SQLException;
	public List<UserWithGrpModule> retrieveGroupModules(final HashMap<String, Object> params) throws SQLException;
	public List<Transaction> retrieveMtnTransactions(final HashMap<String, Object> params) throws SQLException;
	public List<UserWithGrpTransaction> retrieveUserTransactions(final HashMap<String, Object> params) throws SQLException;
	public List<UserWithGrpTransaction> retrieveGroupTransactions(final HashMap<String, Object> params) throws SQLException;
	
	public Integer saveUserTransactions(final HashMap<String, Object> params) throws SQLException;
	public Integer saveGroupTransactions(final HashMap<String, Object> params) throws SQLException;
	
	public Integer saveUserModules(final HashMap<String, Object> params) throws SQLException;
	public Integer saveGroupModules(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnModules(final HashMap<String, Object> params) throws SQLException;
	
}
