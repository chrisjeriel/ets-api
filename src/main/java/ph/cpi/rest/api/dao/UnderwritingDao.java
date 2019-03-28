package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;

import ph.cpi.rest.api.model.underwriting.CATPeril;
import ph.cpi.rest.api.model.underwriting.Item;
import ph.cpi.rest.api.model.underwriting.Policy;

public interface UnderwritingDao {
	
	public Policy retrievePolicyDeductibles(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolicyCoverage(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolAttachmentList(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolEndtList(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolItem(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolCATPeril(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> savePolCATPeril(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> savePolItem(final HashMap<String, Object> params ) throws SQLException;
}
