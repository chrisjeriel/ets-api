package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.UncategorizedSQLException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

import ph.cpi.rest.api.dao.UnderwritingDao;
import ph.cpi.rest.api.model.Approver;
import ph.cpi.rest.api.model.maintenance.Cession;
import ph.cpi.rest.api.model.underwriting.BookingDate;
import ph.cpi.rest.api.model.underwriting.Deductibles;
import ph.cpi.rest.api.model.underwriting.DistCoIns;
import ph.cpi.rest.api.model.underwriting.DistPolInst;
import ph.cpi.rest.api.model.underwriting.DistRiskWparam;
import ph.cpi.rest.api.model.underwriting.DistWrisk;
import ph.cpi.rest.api.model.underwriting.ExpPolicy;
import ph.cpi.rest.api.model.underwriting.InwPolBalance;
import ph.cpi.rest.api.model.underwriting.LastExpiryExtractInfo;
import ph.cpi.rest.api.model.underwriting.OpenPolicy;
import ph.cpi.rest.api.model.underwriting.PolDistList;
import ph.cpi.rest.api.model.underwriting.PolDistribution;
import ph.cpi.rest.api.model.underwriting.PolForPurging;
import ph.cpi.rest.api.model.underwriting.PolOcList;
import ph.cpi.rest.api.model.underwriting.PolOcLov;
import ph.cpi.rest.api.model.underwriting.Policy;
import ph.cpi.rest.api.model.underwriting.PolicyAsIs;
import ph.cpi.rest.api.model.underwriting.PolicyLOV;
import ph.cpi.rest.api.model.underwriting.PolicyNonRenewal;
import ph.cpi.rest.api.model.underwriting.PolicyOc;
import ph.cpi.rest.api.model.underwriting.PolicyWithChanges;
import ph.cpi.rest.api.model.underwriting.PoolDistribution;
import ph.cpi.rest.api.model.underwriting.Warning;
import ph.cpi.rest.api.model.underwriting.WriskLimit;
import ph.cpi.rest.api.model.workflowmanager.Approval;

@Component
public class UnderwritingDaoImpl implements UnderwritingDao {
	
	@Value("${spring.datasource.url}")
	private String dbUrl;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(UnderwritingDaoImpl.class);

	@Override
	public List<Policy> retrievePolInwardBal(HashMap<String, Object> params) throws SQLException {
		List<Policy> policyList = sqlSession.selectList("retrievePolInwardBal",params);
		return policyList;
	}

	@Override
	public List<Policy> retrievePolCoInsurance(HashMap<String, Object> params) throws SQLException {
		List<Policy> policy = sqlSession.selectList("retrievePolCoInsurance",params);
		return policy;
	}
	
	@Override
	public Policy retrievePolicyDeductibles(HashMap<String, Object> params) throws SQLException {
		Policy policy = sqlSession.selectOne("retrievePolicyDeductibles", params);
		return policy;
	}

	@Override
	public Policy retrievePolicyCoverage(HashMap<String, Object> params) throws SQLException {
		Policy policy = sqlSession.selectOne("retrievePolCoverage",params);
		return policy;
	}

	@Override
	public HashMap<String, Object> savePolCoverage(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePolCoverage",params);
			params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public Policy retrievePolAttachmentList(final HashMap<String, Object> params) throws SQLException{
		Policy polAttachmentList = sqlSession.selectOne("retrievePolAttachment", params);
		return polAttachmentList;
	}

	@Override
	public Policy retrievePolEndtList(HashMap<String, Object> params) throws SQLException {
		Policy polEndtList = sqlSession.selectOne("retrievePolEndt", params);
		return polEndtList;
	}
	
	@Override
	public Policy retrievePolItem(HashMap<String, Object> params) throws SQLException {
		Policy polItem = sqlSession.selectOne("retrievePolItem",params);
		return polItem;
	}

	@Override
	public Policy retrievePolCATPeril(HashMap<String, Object> params) throws SQLException {
		Policy polCATPeril = sqlSession.selectOne("retrievePolCATPeril", params);
		return polCATPeril;
	}

	@Override
	public Policy retrievePolGenInfo(HashMap<String, Object> params) throws SQLException {
		Policy policy = sqlSession.selectOne("retrievePolGenInfo", params);
		return policy;
	}
	
	@Override
	public Policy retrievePolAlop(final HashMap<String, Object> params) throws SQLException {
		Policy policyList = sqlSession.selectOne("retrievePolAlop", params);
		return policyList;
	}
	
	@Override
	public Policy retrievePolAlopItem(final HashMap<String, Object> params) throws SQLException {
		Policy policy = sqlSession.selectOne("retrievePolAlopItem", params);
		return policy;
	}

	@Override
	public List<Policy> retrievePolicyListing(HashMap<String, Object> params) throws SQLException {
		List<Policy> policyList;
		/*
		 * switch(params.get("mode").toString()){ case "inquiry": policyList =
		 * sqlSession.selectList("retrievePolicyListingInq", params); break; default:
		 * 
		 * }
		 */

		policyList = sqlSession.selectList("retrievePolicyListing", params);
		return policyList;
	}
	
	@Override
	public Integer retrievePolicyLength(HashMap<String, Object> params) throws SQLException {
		Integer length;
		/*
		 * switch(params.get("mode").toString()){ case "inquiry": length = (Integer)
		 * sqlSession.selectOne("retrievePolicyInqLength", params); break; default:
		 * 
		 * }
		 */
		length = (Integer) sqlSession.selectOne("retrievePolicyLength", params);
		return length;
	}
	
	@Override
	public HashMap<String, Object> savePolAttachments(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePolAttachment",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public Integer savePolicyDeductibles(HashMap<String, Object> params) throws SQLException {
		Integer returnCd = sqlSession.update("savePolicyDeductibles",params);
		return returnCd;
	}

	@Override
	public HashMap<String, Object> savePolHoldCover(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePolHoldCover", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public PolicyOc retrievePolAttachmentOcList(HashMap<String, Object> params) throws SQLException {
		PolicyOc attachmentsOcList = sqlSession.selectOne("retrievePolAttachmentOc", params);
		return attachmentsOcList;
	}

	@Override
	public PolicyOc retrievePolEndtOcList(HashMap<String, Object> params) throws SQLException {
		PolicyOc endorsementsOcList = sqlSession.selectOne("retrievePolEndtOc", params);
		return endorsementsOcList;
	}
	
	@Override
	public HashMap<String, Object> savePolAlop(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePolAlopMap",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public HashMap<String, Object> savePolAlopItem(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePolAlopItemMap",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public Policy retrievePolHoldCover(HashMap<String, Object> params) throws SQLException {
		Policy policy = sqlSession.selectOne("retrievePolHoldCoverMain", params);
		return policy;
	}
	
	@Override
	public Policy retrievePolicyInformation(HashMap<String, Object> params) throws SQLException {
		Policy policy = sqlSession.selectOne("retrievePolicyInformation", params);
		return policy;
	}

	@Override
	public HashMap<String, Object> savePolCATPeril(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePolCATPeril", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public OpenPolicy retrievePolCoverageOc(HashMap<String, Object> params) throws SQLException {
		OpenPolicy policyOc = sqlSession.selectOne("retrievePolCoverageOc",params);
		return policyOc;
	}

	@Override
	public HashMap<String, Object> savePolCoverageOc(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePolCoverageOc",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> savePolItem(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePolItem",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Transactional(rollbackFor=Exception.class)
	@Override
	public HashMap<String, Object> savePolGenInfo(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePolGenInfo", params);
		params.put("policyId", params.get("outPolicyId"));
		sqlSession.update("savePolGenInfoWordings", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> savePolEndtOc(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePolEndtOc",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public HashMap<String, Object> savePolicyDetails(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePDGenInfo",params);
		params.put("errorCode", errorCode);
		
		sqlSession.update("savePDProject",params);
		sqlSession.update("savePDCoverage",params);
		sqlSession.update("savePDSecCovers",params);		
		sqlSession.update("savePDDeductibles",params);
		sqlSession.update("savePDAlop",params);
		sqlSession.update("savePDAlopItem",params);
		sqlSession.update("savePDEndorsements",params);
		sqlSession.update("savePDAttachments",params);
		sqlSession.update("savePDPolInwardBal",params);
		sqlSession.update("savePDWordings",params);
		sqlSession.update("savePDCatPeril",params);
		
		return params;
	}
	
	@Override
	public Integer savePolInwardBal(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePolInwardBal",params);
		return errorCode;
	}

	@Override
	public Integer savePolEndorsement(HashMap<String, Object> params) throws SQLException {	
		Integer errorCode = sqlSession.update("savePolEndorsement",params);
		return errorCode;
	}

	@Override
	public Integer saveSumInsOC(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveSumInsOC",params);
		return errorCode;
	}
		
	@Override
	public Integer updatePolHoldCoverStatus(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("updatePolHoldCoverStatus", params);
		return errorCode;
	}

	@Override
	public List<PolicyOc> retrievePolicyOcListing(HashMap<String, Object> params) throws SQLException {
		List<PolicyOc> policyList = sqlSession.selectList("retrievePolicyOcListing",params);
		return policyList;
	}
	
	@Override
	public HashMap<String, Object> saveOpenPolDetails(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveOpenPolDetails", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<Approver> retrievePolicyApprover(HashMap<String, Object> params) throws SQLException {
		return sqlSession.selectList("retrievePolicyApprover", params);
	}
	
	@Override
	public Integer updatePolicyStatus(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("updatePolicyStatus", params);
		return errorCode;
	}

	@Override
	public List<Approval> retrieveWfmApprovals(HashMap<String, Object> params) throws SQLException {
		List<Approval> approvalList = sqlSession.selectList("retrieveWfmApprovals",params);
		return approvalList;
	}

	
	@Override
	public List<Policy> retrievePolHoldCoverListing(HashMap<String, Object> params) throws SQLException {
		List<Policy> polHcListing = sqlSession.selectList("retrievePolHoldCoverListing", params);
		return polHcListing;
	}
	
	@Override
	public PolicyOc retrievePolGenInfoOc(HashMap<String, Object> params) throws SQLException {
		PolicyOc policyOc = sqlSession.selectOne("retrievePolGenInfoOc", params);
		return policyOc;
	}
	
	@Override
	public Policy retrievePolicyCoverageAlt(HashMap<String, Object> params) throws SQLException {
		Policy policy = sqlSession.selectOne("retrievePolCoverageAlt",params);
		return policy;
	}
	
	@Override
	public HashMap<String, Object> savePolAttachmentsOc(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePolAttachmentOC", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<Policy> retrieveAlterationsPerPolicy(HashMap<String, Object> params) throws SQLException {
		List<Policy> policyList = sqlSession.selectList("retrieveAlterationsPerPolicy", params);
		
		return policyList;
	}

	@Override
	public Integer updatePolGenInfoSpoilage(HashMap<String, Object> params) throws SQLException {
		Integer errorCode;
		try{
			errorCode = sqlSession.update("updatePolGenInfoSpoilage", params);
		}catch (UncategorizedSQLException e){
			throw (SQLException) e.getCause();
		}
		return errorCode;
	}
	@Override
	public Integer retrieveAlterationsPerCoIns(HashMap<String, Object> params) throws SQLException {
		sqlSession.update("retrieveAlterationsPerCoIns", params);
		
		return (Integer) params.get("coInsAlt");
	}
	
	@Override
	public Integer savePolGenInfoOc(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePolGenInfoOc", params);
		return errorCode;
	}

	@Override
	public Integer retrieveCoInsStatus(HashMap<String, Object> params) throws SQLException {
		sqlSession.update("retrieveCoInsStatus", params);
		
		return (Integer) params.get("coInsStatus");
	}

	@Override
	public Integer updatePolGenInfo(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("updatePolGenInfo", params);
		return errorCode;
	}

	@Override
	public Integer postPolicy(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = -1;
		try{
			errorCode = sqlSession.update("postPolicy",params);
		}catch (UncategorizedSQLException e){
			throw (SQLException) e.getCause();
		}
		return errorCode;
	}

	@Override
	public Integer genHundredValPolPrinting(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("genHundredValPolPrinting", params);
		return errorCode;
	}
	
	@Override
	public Policy retrievePolicyFullCoverage(HashMap<String, Object> params) throws SQLException {
		Policy policy = sqlSession.selectOne("retrievePolFullCoverage",params);
		return policy;
	}

	@Override
	public HashMap<String, Object> savePolFullCoverage(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePolFullCoverage",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> extractExpiringPolicy(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("extractExpiringPolicy",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<ExpPolicy> retrieveExpPolList(HashMap<String, Object> params) throws SQLException {
		List<ExpPolicy> expPolicyList = sqlSession.selectList("retrieveExpPolList", params);
		return expPolicyList;
	}

	@Override
	public PolDistribution retrievePolDist(HashMap<String, Object> params) throws SQLException {
		PolDistribution polDistribution = sqlSession.selectOne("retrievePolDist",params);
		return polDistribution;
	}
	
	@Override
	public PolDistribution retrievePolDistCum(HashMap<String, Object> params) throws SQLException {
		PolDistribution polDistribution = sqlSession.selectOne("retrievePolDistCum",params);
		return polDistribution;
	}

	@Override
	public DistWrisk retrieveDistWrisk(HashMap<String, Object> params) throws SQLException {
		DistWrisk res = sqlSession.selectOne("retrieveDistWrisk", params);
		return res;
	}

	@Override
	public List<WriskLimit> retrieveWriskLimit(HashMap<String, Object> params) throws SQLException {
		List<WriskLimit> res = sqlSession.selectList("retrieveWriskLimit", params);
		return res;
	}

	@Override
	public List<PoolDistribution> retrievePoolDist(HashMap<String, Object> params) throws SQLException {
		List<PoolDistribution> res = sqlSession.selectList("retrievePoolDist", params);
		return res;
	}

	@Override
	public List<DistCoIns> retrieveDistCoIns(HashMap<String, Object> params) throws SQLException {
		List<DistCoIns> res = sqlSession.selectList("retrieveDistCoIns", params);
		return res;
	}

	@Override
	public Integer postDistribution(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("postDistribution",params);
		return code;
	}

	@Override
	public List<PoolDistribution> retrievePolPoolDist(HashMap<String, Object> params) throws SQLException {
		List<PoolDistribution> res = sqlSession.selectList("retrievePolPoolDist", params);
		return res;
	}
	
	@Override
	public List<PoolDistribution> retrievePolPoolDistCum(HashMap<String, Object> params) throws SQLException {
		List<PoolDistribution> res = sqlSession.selectList("retrievePolPoolDistCum", params);
		return res;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public HashMap<String, Object> processRenewablePolicy(HashMap<String, Object> params) throws SQLException {
		
		try {
			for (PolicyAsIs renPol : ((List<PolicyAsIs>) params.get("renAsIsPolicyList"))) {
				sqlSession.update("processRenewablePolicyAI",renPol);
			}
			
			for (PolicyWithChanges renPol : ((List<PolicyWithChanges>) params.get("renWithChangesPolicyList"))) {
				/*
				 * logger.info("renWithChangesPolicyList renPol : " + renPol);
				 * sqlSession.update("processRenewablePolicyAI",renPol);
				 * logger.info("renWithChangesPolicyList renPol after AI : " + renPol);
				 */
				sqlSession.update("processRenewablePolicyWC",renPol);
			}
			
			for (PolicyNonRenewal renPol : ((List<PolicyNonRenewal>) params.get("nonRenPolicyList"))) {
				sqlSession.update("processRenewablePolicyNR",renPol);
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return params;
	}
		
	@Override
	public List<PolForPurging> retrievePolForPurging(HashMap<String, Object> params) throws SQLException {
		List<PolForPurging> res = sqlSession.selectList("retrievePolForPurging",params);
		return res;
	}

	@Override
	public HashMap<String, Object> purgeExpiringPol(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("purgeExpiringPol",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> saveExpCov(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveExpCov",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public List<DistRiskWparam> retrieveDistRiskWparam(HashMap<String, Object> params) throws SQLException {
		List<DistRiskWparam> res = sqlSession.selectList("retrieveDistRiskWparam", params);
		return res;
	}

	@Override
	public Integer autoCalcDist(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("autoCalcDist",params);
		return code;
	}

	@Override
	public Integer saveRiskDist(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("saveRiskDist",params);
		return code;
	}

	@Override
	public Integer distributeRiskDist(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("distributeRiskDist",params);
		return code;
	}
	@Override
	public List<PolDistList> retrievePolDistList(HashMap<String, Object> params) throws SQLException {
		List<PolDistList> res = sqlSession.selectList("retrievePolDistList", params);
		return res;
	}

	@Override
	public HashMap<String, Object> saveExpCatPeril(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveExpCatPeril",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public Integer negateDistribution(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("negateDistribution",params);
		return code;
	}

	@Override
	public List<DistCoIns> getPostedCoins(HashMap<String, Object> params) throws SQLException {
		List<DistCoIns> postedDist = sqlSession.selectList("getPostedCoIns",params);
		return postedDist;
	}

	@Override
	public HashMap<String, Object> saveExpGenInfo(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveExpGenInfo",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Override
	public List<DistCoIns> retrieveUndistAlt(HashMap<String, Object> params) throws SQLException {
		List<DistCoIns> postedDist = sqlSession.selectList("getUndistAlt",params);
		return postedDist;
	}

	@Override
	public List<DistCoIns> retrieveDistAlt(HashMap<String, Object> params) throws SQLException {
		List<DistCoIns> postedDist = sqlSession.selectList("getDistAlt",params);
		return postedDist;
	}

	@Override
	public List<DistCoIns> retrieveInProgCoins(HashMap<String, Object> params) throws SQLException {
		List<DistCoIns> postedDist = sqlSession.selectList("getInProgCoins",params);
		return postedDist;
	}

	@Override
	public List<DistCoIns> retrieveMissingCoins(HashMap<String, Object> params) throws SQLException {
		List<DistCoIns> postedDist = sqlSession.selectList("getMissingCoins",params);
		return postedDist;
	}

	@Override
	public List<Warning> retrievePolDistWarning(HashMap<String, Object> params) throws SQLException {
		List<Warning> res = sqlSession.selectList("retrievePolDistWarning", params);
		return res;
	}

	@Override
	public List<DistPolInst> retrievePolDistInst(HashMap<String, Object> params) throws SQLException {
		List<DistPolInst> list = sqlSession.selectList("retrievePolDistInst", params);
		return list;
	}

	@Override
	public List<PoolDistribution> retrievePolDistInstPool(HashMap<String, Object> params) throws SQLException {
		List<PoolDistribution> list = sqlSession.selectList("retrievePolDistInstPool", params);
		return list;
	}

	@Override
	public String getInstTag(HashMap<String, Object> params) throws SQLException {
		String instTag = sqlSession.selectOne("getInstTag",params);
		return instTag;
	}

	@Override
	public DateTime getAcctingDate(HashMap<String, Object> params) throws SQLException {
		InwPolBalance inw = sqlSession.selectOne("getAcctingDate",params);
		DateTime date;
		try{
			date = inw.getAcctEntDate();
		}catch(NullPointerException ex){
			date = null;
		}
		
		return date;
	}

	@Override
	public BookingDate retrieveValidBookingDate(HashMap<String, Object> params) throws SQLException {
		BookingDate dates = sqlSession.selectOne("retrieveValidBookingDate",params);
		return dates;
	}

	@Override
	public Integer updatePolOpenCoverStatus(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("updatePolOpenCoverStatu",params);
		return code;
	}

	@Override
	public String validateForDist(HashMap<String, Object> params) throws SQLException {
		String msg = sqlSession.selectOne("validateForDist",params);
		return msg;
	}

	@Override
	public LastExpiryExtractInfo retrieveLastExtractInfo() throws SQLException {
		LastExpiryExtractInfo info = sqlSession.selectOne("getLastExtInfo");
		return info;
	}

	@Override
	public List<PolDistList> retrieveNegateDistList(HashMap<String, Object> params) throws SQLException {
		List<PolDistList> list = sqlSession.selectList("retrieveNegateDistList",params);
		return list;
	}

	@Override
	public HashMap<String, Object> extractRenExpPolicy(HashMap<String, Object> params) throws SQLException {
		PolicyAsIs renPol =  (PolicyAsIs) params.get("renPol");
		sqlSession.update("extractRenExpPolicy",renPol);
		sqlSession.update("genRenExpPolicy",renPol);
		return params;
	}

	@Override
	public Cession getPolCession(HashMap<String, Object> params) throws SQLException {
		Cession cession = sqlSession.selectOne("getPolCession",params);
		return cession;
	}

	@Override
	public List<Deductibles> retrievePolEndtDed(HashMap<String, Object> params) throws SQLException {
		return sqlSession.selectList("retrievePolEndtDed",params);
	}

	@Override
	public List<PolOcList> retrieveOpenCoverPolList(HashMap<String, Object> params) throws SQLException {
		return sqlSession.selectList("retrieveOpenCoverPolList",params);
	}

	@Override
	public List<PolicyLOV> retrieveEditableDistList(HashMap<String, Object> params) throws SQLException {
		return sqlSession.selectList("retrieveEditableDistList",params);
	}

	@Override
	public Integer saveManualDistRiskTreaty(HashMap<String, Object> params) throws SQLException {
		return sqlSession.update("saveManualDistRiskTreaty",params);
	}

	@Override
	public List<PolOcLov> retrieveCreateOcAltLov(HashMap<String, Object> params) throws SQLException {
		return sqlSession.selectList("retrieveCreateOcAltLov",params);
	}
	
	
}
