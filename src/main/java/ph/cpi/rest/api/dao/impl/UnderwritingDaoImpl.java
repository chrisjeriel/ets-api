package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

import ph.cpi.rest.api.dao.UnderwritingDao;
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
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteDaoImpl.class);

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
	
}
