package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UnderwritingDao;
import ph.cpi.rest.api.model.underwriting.Policy;

@Component
public class UnderwritingDaoImpl implements UnderwritingDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(UnderwritingDaoImpl.class);

	@Override
	public Policy retrievePolInwardBal(HashMap<String, Object> params) throws SQLException {
		Policy pol =  sqlSession.selectOne("retrievePolInwardBal",params);
		return pol;
	}

	@Override
	public Policy retrievePolCoInsurance(HashMap<String, Object> params) throws SQLException {
		Policy pol =  sqlSession.selectOne("retrievePolCoInsurance",params);
		return pol;
	}

}
