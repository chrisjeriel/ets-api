package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.AlopSample;
import ph.cpi.rest.api.model.maintenance.AdviceWordings;
import ph.cpi.rest.api.model.maintenance.Block;
import ph.cpi.rest.api.model.maintenance.CedingCompany;
import ph.cpi.rest.api.model.maintenance.Region;

public interface MaintenanceDao {

	/*public AlopSample retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
	public List<AlopSample> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
	*/
	public AdviceWordings retrieveMaintenanceAdviceWordings(final HashMap<String, Object> params) throws SQLException;
	public List<AdviceWordings> retrieveMaintenanceAdviceWordingsList(final HashMap<String, Object> params) throws SQLException;
	
	public List<Region> retrieveMaintenanceBlockList(final HashMap<String, Object> params) throws SQLException;
	public List<CedingCompany> retrieveMaintenanceCedingCompany(final HashMap<String, Object> params) throws SQLException;
	/*public CedingCompany retrieveMaintenanceCedingCompany(final HashMap<String, Object> params) throws SQLException;
	public List<CedingCompany> retrieveMaintenanceCedingCompanyList(final HashMap<String, Object> params) throws SQLException;
	public CedingCompany retrieveMaintenanceCedingCompanyListing(final HashMap<String, Object> params) throws SQLException;
	public List<CedingCompany> retrieveMaintenanceCedingCompanyListingList(final HashMap<String, Object> params) throws SQLException;
	*/
}
