package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.WorkflowDao;
import ph.cpi.rest.api.model.workflow.DashboardTran;
import ph.cpi.rest.api.model.workflow.Notes;
import ph.cpi.rest.api.model.workflow.Reminders;

@Component
public class WorkflowDaoImpl implements WorkflowDao{

	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(WorkflowDaoImpl.class);
	@Override
	public List<DashboardTran> retrieveTransactions(HashMap<String, Object> params) throws SQLException {
		List<DashboardTran> dashboardTran = sqlSession.selectList("retrieveTransactions", params);
		return dashboardTran;
	}
	@Override
	public List<Reminders> retrieveReminders(HashMap<String, Object> params) throws SQLException {
		List<Reminders> reminders = sqlSession.selectList("retrieveReminders", params);
		return reminders;
	}
	@Override
	public List<Notes> retrieveNotes(HashMap<String, Object> params) throws SQLException {
		List<Notes> notes = sqlSession.selectList("retrieveNotes", params);
		return notes;
	}

}
