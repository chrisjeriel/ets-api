package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

import ph.cpi.rest.api.dao.UnderwritingDao;
import ph.cpi.rest.api.model.Approver;
import ph.cpi.rest.api.model.underwriting.OpenPolicy;
import ph.cpi.rest.api.model.underwriting.Policy;
import ph.cpi.rest.api.model.underwriting.PolicyOc;
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
	private PlatformTransactionManager txManager;
	
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
		logger.info("retrievePolCoInsurance DAOImpl : " + policy);
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
		logger.info("retrievePolCoverage DAOImpl : " + policy);
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
		logger.info("retrievePolItem DAOImpl : " + polItem);
		return polItem;
	}

	@Override
	public Policy retrievePolCATPeril(HashMap<String, Object> params) throws SQLException {
		Policy polCATPeril = sqlSession.selectOne("retrievePolCATPeril", params);
		logger.info("retrievePolCATPeril DAOImpl : " + polCATPeril);
		return polCATPeril;
	}

	@Override
	public Policy retrievePolGenInfo(HashMap<String, Object> params) throws SQLException {
		Policy policy = sqlSession.selectOne("retrievePolGenInfo", params);
		logger.info("retrievePolGenInfo DAOImpl : " + policy);
		
		return policy;
	}
	
	@Override
	public List<Policy> retrievePolAlop(final HashMap<String, Object> params) throws SQLException {
		List<Policy> policyList = sqlSession.selectList("retrievePolAlop", params);
		return policyList;
	}
	
	@Override
	public Policy retrievePolAlopItem(final HashMap<String, Object> params) throws SQLException {
		Policy policy = sqlSession.selectOne("retrievePolAlopItem", params);
		return policy;
	}

	@Override
	public List<Policy> retrievePolicyListing(HashMap<String, Object> params) throws SQLException {
		List<Policy> policyList = sqlSession.selectList("retrievePolicyListing", params);
		return policyList;
	}
	
	@Override
	public Integer savePolAttachments(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer errorCode = sqlSession.update("savePolAttachment",params);
		return errorCode;
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
		// TODO Auto-generated method stub
		PolicyOc attachmentsOcList = sqlSession.selectOne("retrievePolAttachmentOc", params);
		return attachmentsOcList;
	}

	@Override
	public PolicyOc retrievePolEndtOcList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
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
		logger.info("retrievePolCoverageOc DAOImpl : " + policyOc);
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
	
	@Override
	public HashMap<String, Object> savePolGenInfo(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePolGenInfo",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> savePolEndtOc(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePolEndtOc",params);
		params.put("errorCode", errorCode);
		return params;
	}
	
	@Transactional(rollbackFor=Exception.class)
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
		// TODO Auto-generated method stub
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
	public PolicyOc retrievePolGenInfoOc(HashMap<String, Object> params) throws SQLException {
		PolicyOc policyOc = sqlSession.selectOne("retrievePolGenInfoOc", params);
		logger.info("retrievePolGenInfoOc DAOImpl : " + policyOc);
		return policyOc;
	}
	
	@Override
	public Policy retrievePolicyCoverageAlt(HashMap<String, Object> params) throws SQLException {
		Policy policy = sqlSession.selectOne("retrievePolCoverageAlt",params);
		logger.info("retrievePolCoverageAlt DAOImpl : " + policy);
		return policy;
	}
	
	@Override
	public Integer savePolAttachmentsOc(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("savePolAttachmentOC", params);
		return errorCode;
	}
}
