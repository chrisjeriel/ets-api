package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;

import ph.cpi.rest.api.model.underwriting.Policy;

public interface UnderwritingDao {

	public Policy retrievePolInwardBal(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolCoInsurance(final HashMap<String, Object> params) throws SQLException;
}
