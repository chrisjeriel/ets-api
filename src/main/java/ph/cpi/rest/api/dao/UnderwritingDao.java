package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.joda.time.DateTime;

import ph.cpi.rest.api.model.Approver;
import ph.cpi.rest.api.model.maintenance.Cession;
import ph.cpi.rest.api.model.underwriting.BookingDate;
import ph.cpi.rest.api.model.underwriting.DistCoIns;
import ph.cpi.rest.api.model.underwriting.DistPolInst;
import ph.cpi.rest.api.model.underwriting.DistRiskWparam;
import ph.cpi.rest.api.model.underwriting.DistWrisk;
import ph.cpi.rest.api.model.underwriting.ExpPolicy;
import ph.cpi.rest.api.model.underwriting.LastExpiryExtractInfo;
import ph.cpi.rest.api.model.underwriting.OpenPolicy;
import ph.cpi.rest.api.model.underwriting.PolDistList;
import ph.cpi.rest.api.model.underwriting.PolDistribution;
import ph.cpi.rest.api.model.underwriting.PolForPurging;
import ph.cpi.rest.api.model.underwriting.Policy;
import ph.cpi.rest.api.model.underwriting.PolicyOc;
import ph.cpi.rest.api.model.underwriting.PoolDistribution;
import ph.cpi.rest.api.model.underwriting.Warning;
import ph.cpi.rest.api.model.underwriting.WriskLimit;
import ph.cpi.rest.api.model.workflowmanager.Approval;

public interface UnderwritingDao {
	
	public Policy retrievePolicyDeductibles(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolicyCoverage(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolAttachmentList(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolEndtList(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolGenInfo(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolAlop(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolAlopItem(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> savePolAttachments(final HashMap<String, Object> params) throws SQLException;
	public List<Policy> retrievePolInwardBal(final HashMap<String, Object> params) throws SQLException;
	public List<Policy> retrievePolCoInsurance(final HashMap<String, Object> params) throws SQLException;
	public Integer savePolicyDeductibles(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> savePolCoverage(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> savePolHoldCover(final HashMap<String, Object> params) throws SQLException;
	public PolicyOc retrievePolAttachmentOcList(final HashMap<String,Object> params) throws SQLException;
	public PolicyOc retrievePolEndtOcList(final HashMap<String, Object> params) throws SQLException;
	public List<Policy> retrievePolicyListing(final HashMap<String, Object> params) throws SQLException;
	public Integer retrievePolicyLength(final HashMap<String, Object> params) throws SQLException;	
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
	public HashMap<String, Object> savePolAttachmentsOc(final HashMap<String, Object> params) throws SQLException;
	public List<Policy> retrieveAlterationsPerPolicy(final HashMap<String, Object> params) throws SQLException;
	public Integer updatePolGenInfoSpoilage(final HashMap<String, Object> params) throws SQLException;
	public Integer retrieveAlterationsPerCoIns(final HashMap<String, Object> params) throws SQLException;
	public Integer retrieveCoInsStatus(final HashMap<String, Object> params) throws SQLException;
	public Integer savePolGenInfoOc(final HashMap<String, Object> params) throws SQLException;
	public Integer updatePolGenInfo(final HashMap<String, Object> params ) throws SQLException;
	public Integer postPolicy(final HashMap<String, Object> params ) throws SQLException;
	public Integer genHundredValPolPrinting(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolicyFullCoverage(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> savePolFullCoverage(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> extractExpiringPolicy(final HashMap<String, Object> params ) throws SQLException;
	public List<ExpPolicy> retrieveExpPolList(final HashMap<String, Object> params) throws SQLException;
	public PolDistribution retrievePolDist(final HashMap<String, Object> params ) throws SQLException;
	public PolDistribution retrievePolDistCum(final HashMap<String, Object> params ) throws SQLException;
	public DistWrisk retrieveDistWrisk(final HashMap<String, Object> params) throws SQLException;
	public List<WriskLimit> retrieveWriskLimit(final HashMap<String, Object> params) throws SQLException;
	public List<PoolDistribution> retrievePoolDist(final HashMap<String, Object> params) throws SQLException;
	public List<DistCoIns> retrieveDistCoIns(final HashMap<String, Object> params) throws SQLException;
	public List<DistRiskWparam> retrieveDistRiskWparam(final HashMap<String, Object> params) throws SQLException;
	
	public Integer postDistribution(final HashMap<String, Object> params ) throws SQLException;
	public List<PoolDistribution> retrievePolPoolDist(final HashMap<String, Object> params) throws SQLException;
	public List<PoolDistribution> retrievePolPoolDistCum(final HashMap<String, Object> params) throws SQLException;
	
	public HashMap<String, Object> processRenewablePolicy(final HashMap<String, Object> params ) throws SQLException;
	public List<PolForPurging> retrievePolForPurging(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> purgeExpiringPol(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> saveExpCov(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> saveExpCatPeril(final HashMap<String, Object> params ) throws SQLException;
	
	public Integer autoCalcDist(final HashMap<String, Object> params ) throws SQLException;
	public Integer saveRiskDist(final HashMap<String, Object> params ) throws SQLException;
	public Integer distributeRiskDist(final HashMap<String, Object> params ) throws SQLException;
	public List<PolDistList> retrievePolDistList(final HashMap<String, Object> params) throws SQLException;
	
	public Integer negateDistribution(final HashMap<String, Object> params ) throws SQLException;
	public List<DistCoIns> getPostedCoins(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> saveExpGenInfo(final HashMap<String, Object> params ) throws SQLException;
	public List<DistCoIns> retrieveUndistAlt(final HashMap<String, Object> params ) throws SQLException;
	public List<DistCoIns> retrieveDistAlt(final HashMap<String, Object> params ) throws SQLException;
	
	public List<DistCoIns> retrieveInProgCoins(final HashMap<String, Object> params ) throws SQLException;
	public List<DistCoIns> retrieveMissingCoins(final HashMap<String, Object> params ) throws SQLException;
	
	public List<Warning> retrievePolDistWarning(final HashMap<String, Object> params) throws SQLException;
	
	public List<DistPolInst> retrievePolDistInst(final HashMap<String, Object> params) throws SQLException;
	
	public List<PoolDistribution> retrievePolDistInstPool(final HashMap<String, Object> params) throws SQLException;
	
	public String getInstTag(final HashMap<String, Object> params) throws SQLException;
	
	public DateTime getAcctingDate(final HashMap<String, Object> params) throws SQLException;
	public BookingDate retrieveValidBookingDate(final HashMap<String, Object> params) throws SQLException;
	
	public Integer updatePolOpenCoverStatus(final HashMap<String, Object> params) throws SQLException;
	public String validateForDist(final HashMap<String, Object> params) throws SQLException;
	
	public LastExpiryExtractInfo retrieveLastExtractInfo() throws SQLException;
	
	public List<PolDistList> retrieveNegateDistList(final HashMap<String, Object> params) throws SQLException;
	
	public HashMap<String, Object> extractRenExpPolicy(final HashMap<String, Object> params) throws SQLException;
	
	public Cession getPolCession(final HashMap<String, Object> params) throws SQLException;
	
}
