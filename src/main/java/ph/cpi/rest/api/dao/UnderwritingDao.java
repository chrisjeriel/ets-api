package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import ph.cpi.rest.api.model.underwriting.CATPeril;
import ph.cpi.rest.api.model.underwriting.Item;
import java.util.List;

import ph.cpi.rest.api.model.underwriting.Policy;

public interface UnderwritingDao {
	
	public Policy retrievePolicyDeductibles(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolicyCoverage(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolAttachmentList(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolEndtList(final HashMap<String, Object> params) throws SQLException;
	public Item retrievePolItem(final HashMap<String, Object> params) throws SQLException;
	public CATPeril retrievePolCATPeril(final HashMap<String, Object> params ) throws SQLException;
	public Policy retrievePolInwardBal(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolCoInsurance(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolGenInfo(final HashMap<String, Object> params) throws SQLException;
	public List<Policy> retrievePolAlop(final HashMap<String, Object> params) throws SQLException;
	public List<Policy> retrievePolAlopItem(final HashMap<String, Object> params) throws SQLException;

}
