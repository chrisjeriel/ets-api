package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.SecurityDao;
import ph.cpi.rest.api.model.maintenance.Module;
import ph.cpi.rest.api.model.maintenance.Transaction;

@Component
public class SecurityDaoImpl implements SecurityDao {

	@Autowired
	private SqlSession sqlSession;

	private static final Logger logger = LoggerFactory.getLogger(SecurityDaoImpl.class);

	@Override
	public List<Module> retrieveMtnModules(HashMap<String, Object> params) throws SQLException {
		List<Module> modules = sqlSession.selectList("retrieveMtnModules", params);
		return modules;
	}
	
	@Override
	public List<Module> retrieveUserModules(HashMap<String, Object> params) throws SQLException {
		List<Module> modules = sqlSession.selectList("retrieveUserModules", params);
		return modules;
	}

	@Override
	public List<Module> retrieveGroupModules(HashMap<String, Object> params) throws SQLException {
		List<Module> modules = sqlSession.selectList("retrieveGroupModules", params);
		return modules;
	}

	@Override
	public List<Transaction> retrieveMtnTransactions(HashMap<String, Object> params) throws SQLException {
		List<Transaction> transactions = sqlSession.selectList("retrieveMtnTransactions", params);
		return transactions;
	}

	@Override
	public List<Transaction> retrieveUserTransactions(HashMap<String, Object> params) throws SQLException {
		List<Transaction> transactions = sqlSession.selectList("retrieveUserTransactions", params);
		return transactions;
	}
	
	@Override
	public List<Transaction> retrieveGroupTransactions(HashMap<String, Object> params) throws SQLException {
		List<Transaction> transactions = sqlSession.selectList("retrieveGroupTransactions", params);
		return transactions;
	}

	@Override
	public Integer saveUserTransactions(HashMap<String, Object> params) throws SQLException {
		Integer respCode = sqlSession.update("saveUserTransactions", params);
		return respCode;
	}

	@Override
	public Integer saveGroupTransactions(HashMap<String, Object> params) throws SQLException {
		Integer respCode = sqlSession.update("saveGroupTransactions", params);
		return respCode;
	}

	
	
}
