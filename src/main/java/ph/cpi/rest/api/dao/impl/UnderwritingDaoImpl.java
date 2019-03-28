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

import ph.cpi.rest.api.dao.UnderwritingDao;
import ph.cpi.rest.api.model.underwriting.CATPeril;
import ph.cpi.rest.api.model.underwriting.Item;
import ph.cpi.rest.api.model.underwriting.Policy;

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
		List<Policy> policyList = sqlSession.selectList("retrievePolCoInsurance",params);
		return policyList;
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
	public Item retrievePolItem(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Item polItem = sqlSession.selectOne("retrievePolItem", params);
		logger.info("retrievePolItem DAOImpl : " + polItem);
		return polItem;
	}

	@Override
	public CATPeril retrievePolCATPeril(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		CATPeril polCATPeril = sqlSession.selectOne("retrievePolCATPeril", params);
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
	public List<Policy> retrievePolAlopItem(final HashMap<String, Object> params) throws SQLException {
		List<Policy> policyList = sqlSession.selectList("retrievePolAlopItem", params);
		return policyList;
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
	
}
