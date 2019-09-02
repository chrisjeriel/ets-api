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
		logger.info(modules.toString());
		return modules;
	}

	@Override
	public List<Transaction> retrieveMtnTransactions(HashMap<String, Object> params) throws SQLException {
		List<Transaction> transactions = sqlSession.selectList("retrieveMtnTransactions", params);
		return transactions;
	}
	
}
