package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.underwriting.Policy;

public interface UnderwritingDao {
	
	public List<Policy> retrievePolAlop(final HashMap<String, Object> params) throws SQLException;
	public List<Policy> retrievePolAlopItem(final HashMap<String, Object> params) throws SQLException;

}
