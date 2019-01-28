package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.maintenance.Deductibles;
import ph.cpi.rest.api.model.maintenance.EndtCode;
import ph.cpi.rest.api.model.maintenance.Insured;
import ph.cpi.rest.api.model.maintenance.Region;

public interface MaintenanceDao {

	public Alop retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
	public List<Alop> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
	public List<Insured> retrieveMtnInsured(final HashMap<String, Object> params) throws SQLException;
	public List<EndtCode> retrieveEndtCode(final HashMap<String, Object> params) throws SQLException;
	public List<Region> retrieveMtnDistrict(final HashMap<String, Object> params) throws SQLException;
	public List<Deductibles> retrieveMtnDeductibles(final HashMap<String, Object> params) throws SQLException;
	
}
