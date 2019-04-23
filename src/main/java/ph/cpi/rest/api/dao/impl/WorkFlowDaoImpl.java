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

import ph.cpi.rest.api.dao.WorkFlowDao;
import ph.cpi.rest.api.model.workflowmanager.Reminder;

@Component
public class WorkFlowDaoImpl implements WorkFlowDao {

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
	
	private static final Logger logger = LoggerFactory.getLogger(WorkFlowDaoImpl.class);

	@Override
	public List<Reminder> retrieveReminders(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Reminder> reminderList = sqlSession.selectList("retrieveReminders", params);
		logger.info("retrieveReminders DAOImpl : " + reminderList);
		return reminderList;
	}

	@Override
	public Integer saveReminders(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer errorCode = sqlSession.update("saveReminders", params);
		return errorCode;
	}
}
