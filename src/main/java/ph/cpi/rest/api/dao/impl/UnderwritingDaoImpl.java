package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UnderwritingDao;
import ph.cpi.rest.api.model.underwriting.Policy;

@Component
public class UnderwritingDaoImpl implements UnderwritingDao {
	
	@Autowired
	private SqlSession sqlSession;

	public List<Policy> retrievePolAlop(final HashMap<String, Object> params) throws SQLException {
		List<Policy> policyList = sqlSession.selectList("retrievePolAlop", params);
		return policyList;
	}
	
	public List<Policy> retrievePolAlopItem(final HashMap<String, Object> params) throws SQLException {
		List<Policy> policyList = sqlSession.selectList("retrievePolAlopItem", params);
		return policyList;
	}
	
}
