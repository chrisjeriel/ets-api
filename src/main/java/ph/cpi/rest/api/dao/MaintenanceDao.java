package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.maintenance.Object_;
import ph.cpi.rest.api.model.maintenance.Province;
import ph.cpi.rest.api.model.maintenance.QuoteWordings;
import ph.cpi.rest.api.model.maintenance.Region;

public interface MaintenanceDao {

	public Alop retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
	public List<Alop> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
	
	public Region retrieveMtnRegion(final HashMap<String, Object> params) throws SQLException;
	public Province retrieveMtnProvince(final HashMap<String, Object> params) throws SQLException;
	public Object_ retrieveMtnObject(final HashMap<String, Object> params) throws SQLException;
	//public QuoteWordings retrieveMtnQuoteWordings(final HashMap<String, Object> params) throws SQLException;
	public List<QuoteWordings> retrieveMtnQuoteWordings(final HashMap<String, Object> params) throws SQLException;
}
