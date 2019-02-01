package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.maintenance.Cession;
import ph.cpi.rest.api.model.maintenance.Risk;
import ph.cpi.rest.api.model.maintenance.SectionCovers;

public interface MaintenanceDao {

	public Alop retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
	public List<Alop> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
	public Risk retrieveMtnRisk(final HashMap<String, Object> params) throws SQLException;
	public List<Risk> retrieveMtnRiskListing(final HashMap<String, Object> params) throws SQLException;
	public SectionCovers retrieveSectionCovers(final HashMap<String, Object> params) throws SQLException;
	public Cession retrieveTypeOfCession(final HashMap<String, Object> params) throws SQLException;
}
