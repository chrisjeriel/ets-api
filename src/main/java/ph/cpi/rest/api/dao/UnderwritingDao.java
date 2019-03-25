package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.underwriting.CATPeril;
import ph.cpi.rest.api.model.underwriting.Item;



public interface UnderwritingDao {

	public Item retrievePolItem(final HashMap<String, Object> params) throws SQLException;
	public CATPeril retrievePolCATPeril(final HashMap<String, Object> params ) throws SQLException;
}
