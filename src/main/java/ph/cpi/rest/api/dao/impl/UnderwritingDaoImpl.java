package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UnderwritingDao;
import ph.cpi.rest.api.model.quote.Quotation;
import ph.cpi.rest.api.model.underwriting.Policy;
@Component
public class UnderwritingDaoImpl implements UnderwritingDao{
	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteDaoImpl.class);
	
	
	public Policy retrievePolicyCoverage(HashMap<String, Object> params) throws SQLException {
		Policy policy = sqlSession.selectOne("retrievePolCoverage",params);
		logger.info("retrievePolCoverage DAOImpl : " + policy);
		return policy;
	}

	

}
