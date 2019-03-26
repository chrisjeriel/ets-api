package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;

import ph.cpi.rest.api.model.underwriting.Policy;

public interface UnderwritingDao {
	
	public Policy retrievePolicyDeductibles(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolicyCoverage(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> savePolCoverage(final HashMap<String, Object> params ) throws SQLException;
}
