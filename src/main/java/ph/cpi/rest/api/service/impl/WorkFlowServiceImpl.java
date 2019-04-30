package ph.cpi.rest.api.service.impl;
import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.WorkFlowDao;
import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.request.RetrieveNotesRequest;
import ph.cpi.rest.api.model.request.RetrieveRemindersRequest;
import ph.cpi.rest.api.model.request.SaveNotesRequest;
import ph.cpi.rest.api.model.request.SaveRemindersRequest;
import ph.cpi.rest.api.model.response.RetrieveNotesResponse;
import ph.cpi.rest.api.model.response.RetrieveRemindersResponse;
import ph.cpi.rest.api.model.response.SaveNotesResponse;
import ph.cpi.rest.api.model.response.SaveRemindersResponse;
import ph.cpi.rest.api.service.WorkFlowService;

@Component
public class WorkFlowServiceImpl implements WorkFlowService {

	
	@Autowired
	WorkFlowDao workFlowDao;
	
	private static final Logger logger = LoggerFactory.getLogger(WorkFlowServiceImpl.class);

	@Override
	public RetrieveRemindersResponse retrieveReminders(RetrieveRemindersRequest rrrq) throws SQLException {
		// TODO Auto-generated method stub
		RetrieveRemindersResponse rrResponse = new RetrieveRemindersResponse();
		HashMap<String, Object> retrieveRemindersParams = new HashMap<String, Object>();
		
		retrieveRemindersParams.put("reminderId",rrrq.getReminderId());
		retrieveRemindersParams.put("assignedTo", rrrq.getAssignedTo());
		retrieveRemindersParams.put("createUser", rrrq.getCreateUser());
		
		rrResponse.setReminderList(workFlowDao.retrieveReminders(retrieveRemindersParams));
		logger.info("retrieveReminderResponse : " + rrResponse.toString());
		
		return rrResponse;
	}

	@Override
	public SaveRemindersResponse saveReminders(SaveRemindersRequest srreq) throws SQLException {
		// TODO Auto-generated method stub
		SaveRemindersResponse srResponse = new SaveRemindersResponse();
		
		try {
			HashMap<String, Object> saveRemindersParams = new HashMap<String, Object>();
			saveRemindersParams.put("reminderId", srreq.getReminderId());
			saveRemindersParams.put("title", srreq.getTitle());
			saveRemindersParams.put("reminder", srreq.getReminder());
			saveRemindersParams.put("reminderDate", srreq.getRemiderDate());
			saveRemindersParams.put("alarmTime", srreq.getAlarmTime());
			saveRemindersParams.put("assignedTo", srreq.getAssignedTo());
			saveRemindersParams.put("status", srreq.getStatus());
			saveRemindersParams.put("createUser", srreq.getCreateUser());
			saveRemindersParams.put("createDate", srreq.getCreateDate());
			saveRemindersParams.put("updateUser", srreq.getUpdateUser());
			saveRemindersParams.put("updateDate", srreq.getUpdateDate());
			srResponse.setReturnCode(workFlowDao.saveReminders(saveRemindersParams));
		} catch (Exception ex) {
			srResponse.setReturnCode(0);
			srResponse.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			ex.printStackTrace();
		}
			

		return srResponse;
	}

	@Override
	public RetrieveNotesResponse retrieveNotes(RetrieveNotesRequest rnrq) throws SQLException {
		// TODO Auto-generated method stub
		RetrieveNotesResponse rnResponse = new RetrieveNotesResponse();
		HashMap<String, Object> retrieveNotesParams = new HashMap<String, Object>();
		
		retrieveNotesParams.put("noteId",rnrq.getNoteId());
		retrieveNotesParams.put("assignedTo", rnrq.getAssignedTo());
		retrieveNotesParams.put("createUser", rnrq.getCreateUser());
		
		rnResponse.setNoteList(workFlowDao.retrieveNotes(retrieveNotesParams));
		logger.info("retrieveReminderResponse : " + rnResponse.toString());
		
		return rnResponse;
	}

	@Override
	public SaveNotesResponse saveNotes(SaveNotesRequest snreq) throws SQLException {
		// TODO Auto-generated method stub
		SaveNotesResponse snResponse = new SaveNotesResponse();
		
		try {
			HashMap<String, Object> saveNotesParams = new HashMap<String, Object>();
			saveNotesParams.put("noteId", snreq.getNoteId());
			saveNotesParams.put("title", snreq.getTitle());
			saveNotesParams.put("note", snreq.getNote());
			saveNotesParams.put("assignedTo", snreq.getAssignedTo());
			saveNotesParams.put("status", snreq.getStatus());
			saveNotesParams.put("createUser", snreq.getCreateUser());
			saveNotesParams.put("createDate", snreq.getCreateDate());
			saveNotesParams.put("updateUser", snreq.getUpdateUser());
			saveNotesParams.put("updateDate", snreq.getUpdateDate());
			snResponse.setReturnCode(workFlowDao.saveNotes(saveNotesParams));
		} catch (Exception ex) {
			snResponse.setReturnCode(0);
			snResponse.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			ex.printStackTrace();
		}
		
		
		return snResponse;
	}

}
