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
import ph.cpi.rest.api.model.maintenance.UserWithGrpModule;
import ph.cpi.rest.api.model.maintenance.UserWithGrpTransaction;

@Component
public class SecurityDaoImpl implements SecurityDao {

	@Autowired
	private SqlSession sqlSession;

	private static final Logger logger = LoggerFactory.getLogger(SecurityDaoImpl.class);

	@Override
	public List<Module> retrieveMtnModules(HashMap<String, Object> params) throws SQLException {
		System.out.println("retrieveMtnModules : " + params);
		List<Module> modules = sqlSession.selectList("retrieveMtnModules", params);
		return modules;
	}
	
	@Override
	public List<UserWithGrpModule> retrieveUserModules(HashMap<String, Object> params) throws SQLException {
		List<UserWithGrpModule> modules = sqlSession.selectList("retrieveUserModules", params);
		return modules;
	}

	@Override
	public List<UserWithGrpModule> retrieveGroupModules(HashMap<String, Object> params) throws SQLException {
		List<UserWithGrpModule> modules = sqlSession.selectList("retrieveGroupModules", params);
		return modules;
	}

	@Override
	public List<Transaction> retrieveMtnTransactions(HashMap<String, Object> params) throws SQLException {
		List<Transaction> transactions = sqlSession.selectList("retrieveMtnTransactions", params);
		return transactions;
	}

	@Override
	public List<UserWithGrpTransaction> retrieveUserTransactions(HashMap<String, Object> params) throws SQLException {
		List<UserWithGrpTransaction> transactions = sqlSession.selectList("retrieveUserTransactions", params);
		return transactions;
	}
	
	@Override
	public List<UserWithGrpTransaction> retrieveGroupTransactions(HashMap<String, Object> params) throws SQLException {
		List<UserWithGrpTransaction> transactions = sqlSession.selectList("retrieveGroupTransactions", params);
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

	@Override
	public Integer saveUserModules(HashMap<String, Object> params) throws SQLException {
		Integer respCode = sqlSession.update("saveUserModules", params);
		return respCode;
	}

	@Override
	public Integer saveGroupModules(HashMap<String, Object> params) throws SQLException {
		Integer respCode = sqlSession.update("saveGroupModules", params);
		return respCode;
	}

	@Override
	public Integer saveMtnModules(HashMap<String, Object> params) throws SQLException {
		System.out.println("params : " + params);	
		Integer respCode = sqlSession.update("saveMtnModules", params);
		return respCode;
	}

	
	
}
