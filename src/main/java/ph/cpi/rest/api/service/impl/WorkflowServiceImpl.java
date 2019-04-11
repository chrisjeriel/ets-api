package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.WorkflowDao;
import ph.cpi.rest.api.model.request.RetrieveNotesRequest;
import ph.cpi.rest.api.model.request.RetrieveRemindersRequest;
import ph.cpi.rest.api.model.request.RetrieveTransactionsRequest;
import ph.cpi.rest.api.model.response.RetrieveNotesResponse;
import ph.cpi.rest.api.model.response.RetrieveRemindersResponse;
import ph.cpi.rest.api.model.response.RetrieveTransactionsResponse;
import ph.cpi.rest.api.service.WorkflowService;

@Component
public class WorkflowServiceImpl implements WorkflowService{

	@Autowired
	WorkflowDao workflowDao;
	
	private static final Logger logger = LoggerFactory.getLogger(WorkflowServiceImpl.class);
	
	@Override
	public RetrieveTransactionsResponse retrieveTransactions(RetrieveTransactionsRequest rtr) throws SQLException {
		RetrieveTransactionsResponse rtrResponse = new RetrieveTransactionsResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("tranTitle", rtr.getTranTitle());
		
		rtrResponse.setDashboardTran(workflowDao.retrieveTransactions(params));
		
		return rtrResponse;
	}

	@Override
	public RetrieveRemindersResponse retrieveReminders(RetrieveRemindersRequest rrr) throws SQLException {
		RetrieveRemindersResponse rrrResponse = new RetrieveRemindersResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("reminderId", rrr.getReminderId());
		params.put("assignedTo", rrr.getAssignedTo());
		params.put("createUser", rrr.getCreateUser());
		
		rrrResponse.setRemindersList(workflowDao.retrieveReminders(params));
		
		return rrrResponse;
	}

	@Override
	public RetrieveNotesResponse retrieveNotes(RetrieveNotesRequest rnr) throws SQLException {
		RetrieveNotesResponse rnrResponse = new RetrieveNotesResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("noteId", rnr.getNoteId());
		params.put("assignedTo", rnr.getAssignedTo());
		params.put("createUser", rnr.getCreateUser());
		
		rnrResponse.setNotesList(workflowDao.retrieveNotes(params));
		
		return rnrResponse;
	}

}
