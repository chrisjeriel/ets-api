package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.underwriting.CATPeril;
import ph.cpi.rest.api.model.underwriting.Item;
import ph.cpi.rest.api.model.underwriting.Policy;

public interface UnderwritingDao {
	
	public Policy retrievePolicyDeductibles(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolicyCoverage(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolAttachmentList(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolEndtList(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolGenInfo(final HashMap<String, Object> params) throws SQLException;
	public List<Policy> retrievePolAlop(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolAlopItem(final HashMap<String, Object> params) throws SQLException;
	public Integer savePolAttachments(final HashMap<String, Object> params) throws SQLException;
	public List<Policy> retrievePolInwardBal(final HashMap<String, Object> params) throws SQLException;
	public List<Policy> retrievePolCoInsurance(final HashMap<String, Object> params) throws SQLException;
	public Integer savePolicyDeductibles(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> savePolCoverage(final HashMap<String, Object> params ) throws SQLException;
	public List<Policy> retrievePolicyListing(final HashMap<String, Object> params) throws SQLException;	
	public HashMap<String, Object> savePolAlop(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> savePolAlopItem(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolHoldCover(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolItem(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolCATPeril(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> savePolCATPeril(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> savePolItem(final HashMap<String, Object> params ) throws SQLException;

}
