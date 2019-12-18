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
import ph.cpi.rest.api.model.workflowmanager.NRStatus;
import ph.cpi.rest.api.model.workflowmanager.Note;
import ph.cpi.rest.api.model.workflowmanager.RelatedRecord;
import ph.cpi.rest.api.model.workflowmanager.Reminder;
import ph.cpi.rest.api.model.workflowmanager.UserNotif;
import ph.cpi.rest.api.model.workflowmanager.WfmTransaction;

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
		List<Reminder> reminderList = sqlSession.selectList("retrieveReminders", params);
		return reminderList;
	}

	@Override
	public Integer saveReminders(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveReminders", params);
		return errorCode;
	}

	@Override
	public List<Note> retrieveNotes(HashMap<String, Object> params) throws SQLException {
		List<Note> noteList = sqlSession.selectList("retrieveNotes", params);
		return noteList;
	}

	@Override
	public Integer saveNotes(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveNotes", params);
		return errorCode;
	}

	@Override
	public List<WfmTransaction> retrieveTransactions(HashMap<String, Object> params) throws SQLException {
		List<WfmTransaction> transactionList = sqlSession.selectList("retrieveTransactions", params);
		return transactionList;
	}

	@Override
	public List<RelatedRecord> retrieveRelatedRecords(HashMap<String, Object> params) throws SQLException {
		List<RelatedRecord> relatedRecordList = sqlSession.selectList("retrieveRelatedRecords", params);
		return relatedRecordList;
	}

	@Override
	public List<UserNotif> retrieveUserNotif() throws SQLException {
		List<UserNotif> unList = sqlSession.selectList("retrieveNotifCount");
		return unList;
	}

	@Override
	public Integer changeRNStatus(NRStatus param) throws SQLException {
		Integer errorCode = 0;
		if ("note".equalsIgnoreCase(param.getType())) {
			errorCode = sqlSession.update("changeStatusNotes", param);
		} else if ("reminder".equalsIgnoreCase(param.getType())) {
			errorCode = sqlSession.update("changeStatusReminders", param);
		}
		
		return errorCode;
	}
}
