package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.Approver;
import ph.cpi.rest.api.model.quote.Quotation;
import ph.cpi.rest.api.model.underwriting.OpenPolicy;
import ph.cpi.rest.api.model.underwriting.Policy;
import ph.cpi.rest.api.model.underwriting.PolicyOc;
import ph.cpi.rest.api.model.workflowmanager.Approval;

public interface UnderwritingDao {
	
	public Policy retrievePolicyDeductibles(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolicyCoverage(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolAttachmentList(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolEndtList(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolGenInfo(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolAlop(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolAlopItem(final HashMap<String, Object> params) throws SQLException;
	public Integer savePolAttachments(final HashMap<String, Object> params) throws SQLException;
	public List<Policy> retrievePolInwardBal(final HashMap<String, Object> params) throws SQLException;
	public List<Policy> retrievePolCoInsurance(final HashMap<String, Object> params) throws SQLException;
	public Integer savePolicyDeductibles(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> savePolCoverage(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> savePolHoldCover(final HashMap<String, Object> params) throws SQLException;
	public PolicyOc retrievePolAttachmentOcList(final HashMap<String,Object> params) throws SQLException;
	public PolicyOc retrievePolEndtOcList(final HashMap<String, Object> params) throws SQLException;
	public List<Policy> retrievePolicyListing(final HashMap<String, Object> params) throws SQLException;	
	public HashMap<String, Object> savePolAlop(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> savePolAlopItem(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolHoldCover(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolItem(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolCATPeril(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> savePolCATPeril(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> savePolItem(final HashMap<String, Object> params ) throws SQLException;
	public OpenPolicy retrievePolCoverageOc(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> savePolCoverageOc(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> savePolEndtOc(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> savePolGenInfo(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> savePolicyDetails(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolicyInformation(final HashMap<String, Object> params) throws SQLException;	
	public Integer savePolInwardBal(final HashMap<String, Object> params) throws SQLException;	
	public Integer savePolEndorsement(final HashMap<String, Object> params) throws SQLException;	
	public Integer saveSumInsOC(final HashMap<String, Object> params) throws SQLException;
	public List<PolicyOc> retrievePolicyOcListing(final HashMap<String, Object> params) throws SQLException;
	public Integer updatePolHoldCoverStatus(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveOpenPolDetails(final HashMap<String, Object> params) throws SQLException;
	public List<Approver> retrievePolicyApprover(final HashMap<String, Object> params) throws SQLException;
	public Integer updatePolicyStatus(final HashMap<String, Object> params) throws SQLException;
	public List<Approval> retrieveWfmApprovals(final HashMap<String, Object> params) throws SQLException;
	public List<Policy> retrievePolHoldCoverListing(final HashMap<String, Object> params) throws SQLException;
	public PolicyOc retrievePolGenInfoOc(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolicyCoverageAlt(final HashMap<String, Object> params) throws SQLException;
	public Integer savePolAttachmentsOc(final HashMap<String, Object> params) throws SQLException;
	public List<Policy> retrieveAlterationsPerPolicy(final HashMap<String, Object> params) throws SQLException;
	public Integer retrieveAlterationsPerCoIns(final HashMap<String, Object> params) throws SQLException;
	public Integer retrieveCoInsStatus(final HashMap<String, Object> params) throws SQLException;
	public Integer savePolGenInfoOc(final HashMap<String, Object> params) throws SQLException;
	
}
