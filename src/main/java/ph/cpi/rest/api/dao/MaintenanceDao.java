package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.maintenance.CrestaZone;
import ph.cpi.rest.api.model.maintenance.Currency;
import ph.cpi.rest.api.model.maintenance.Region;

public interface MaintenanceDao {

	public Alop retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
	public List<Alop> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
	public List<Region> retrieveMtnCityList(final HashMap<String, Object> params) throws SQLException;
	public List<CrestaZone> retrieveMtnCrestaZoneList(final HashMap<String, Object> params) throws SQLException;
	public List<Currency> retrieveMtnCurrencyList(final HashMap<String, Object> params) throws SQLException;
	
}
