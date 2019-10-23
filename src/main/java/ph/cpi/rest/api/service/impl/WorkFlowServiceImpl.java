package ph.cpi.rest.api.service.impl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UserDao;
import ph.cpi.rest.api.dao.WorkFlowDao;
import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.maintenance.Users;
import ph.cpi.rest.api.model.request.RetrieveNotesRequest;
import ph.cpi.rest.api.model.request.RetrieveRelatedRecordsRequest;
import ph.cpi.rest.api.model.request.RetrieveRemindersRequest;
import ph.cpi.rest.api.model.request.RetrieveWfmTransactionsRequest;
import ph.cpi.rest.api.model.request.SaveNotesRequest;
import ph.cpi.rest.api.model.request.SaveRemindersRequest;
import ph.cpi.rest.api.model.response.RetrieveNotesResponse;
import ph.cpi.rest.api.model.response.RetrieveRelatedRecordsResponse;
import ph.cpi.rest.api.model.response.RetrieveRemindersResponse;
import ph.cpi.rest.api.model.response.RetrieveWfmTransactionsResponse;
import ph.cpi.rest.api.model.response.SaveNotesResponse;
import ph.cpi.rest.api.model.response.SaveRemindersResponse;
import ph.cpi.rest.api.model.workflowmanager.Note;
import ph.cpi.rest.api.model.workflowmanager.Reminder;
import ph.cpi.rest.api.service.WorkFlowService;

@Component
public class WorkFlowServiceImpl implements WorkFlowService {

	
	@Autowired
	WorkFlowDao workFlowDao;
	
	@Autowired
	UserDao userDao;
	
	private static final Logger logger = LoggerFactory.getLogger(WorkFlowServiceImpl.class);

	@Override
	public RetrieveRemindersResponse retrieveReminders(RetrieveRemindersRequest rrrq) throws SQLException {
		// TODO Auto-generated method stub
		RetrieveRemindersResponse rrResponse = new RetrieveRemindersResponse();
		HashMap<String, Object> retrieveRemindersParams = new HashMap<String, Object>();
		
		retrieveRemindersParams.put("reminderId",rrrq.getReminderId());
		retrieveRemindersParams.put("assignedTo", rrrq.getAssignedTo());
		retrieveRemindersParams.put("createUser", rrrq.getCreateUser());
		retrieveRemindersParams.put("module", rrrq.getModule());
		retrieveRemindersParams.put("referenceId", rrrq.getReferenceId());
		retrieveRemindersParams.put("status", rrrq.getStatus());
		
		rrResponse.setReminderList(workFlowDao.retrieveReminders(retrieveRemindersParams));
		return rrResponse;
	}

	@Override
	public SaveRemindersResponse saveReminders(SaveRemindersRequest srreq) throws SQLException {
		// TODO Auto-generated method stub
		SaveRemindersResponse srResponse = new SaveRemindersResponse();
		
		try {
			HashMap<String, Object> saveRemindersParams = new HashMap<String, Object>();
			HashMap<String, Object> retMtnUserParam = new HashMap<String, Object>();
			
			
			List<Reminder> tempForGroups = new ArrayList<Reminder>();
			List<Users> usersList = new ArrayList<Users>();
			for (Reminder rem : srreq.getReminderList()) {
				usersList = null;
				if (rem.getAssignedToGroup() != null) {
					retMtnUserParam.put("userGrp", rem.getAssignedToGroup());
					usersList = userDao.retMtnUsers(retMtnUserParam);
				}
				
				if (usersList != null) {
					for (Users users : usersList) {
						Reminder newRem = new Reminder();
						newRem.setReminderId(rem.getReminderId());
						newRem.setTitle(rem.getTitle());
						newRem.setReminder(rem.getReminder());
						newRem.setReminderDate(rem.getReminderDateRealDate());
						newRem.setAlarmTime(rem.getAlarmTime());
						newRem.setStatus(rem.getStatus());
						newRem.setCreateUser(rem.getCreateUser());
						newRem.setCreateDate(rem.getCreateDate());
						newRem.setUpdateUser(rem.getUpdateUser());
						newRem.setUpdateDate(rem.getUpdateDate());
						newRem.setModule(rem.getModule());
						newRem.setReferenceId(rem.getReferenceId());
						newRem.setDetails(rem.getDetails());
						newRem.setRelatedRecordList(rem.getRelatedRecordList());
						newRem.setImpTag(rem.getImpTag());
						newRem.setUrgTag(rem.getUrgTag());
						newRem.setAssignedTo(users.getUserId());
						tempForGroups.add(newRem);
					}
				}
			}
			
			
			System.out.println(tempForGroups);
			if (tempForGroups.size() > 0) {
				saveRemindersParams.put("reminderList", tempForGroups);
			} else {
				saveRemindersParams.put("reminderList", srreq.getReminderList());
			}
			saveRemindersParams.put("delReminderList", srreq.getDelReminderList());
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
		retrieveNotesParams.put("module", rnrq.getModule());
		retrieveNotesParams.put("referenceId", rnrq.getReferenceId());
		retrieveNotesParams.put("status", rnrq.getStatus());
		
		rnResponse.setNoteList(workFlowDao.retrieveNotes(retrieveNotesParams));
		return rnResponse;
	}

	@Override
	public SaveNotesResponse saveNotes(SaveNotesRequest snreq) throws SQLException {
		// TODO Auto-generated method stub
		SaveNotesResponse snResponse = new SaveNotesResponse();
		
		try {
			HashMap<String, Object> saveNotesParams = new HashMap<String, Object>();
			HashMap<String, Object> retMtnUserParam = new HashMap<String, Object>();
			
			
			List<Note> tempForGroups = new ArrayList<Note>();
			List<Users> usersList = new ArrayList<Users>();
			for (Note note : snreq.getNoteList()) {
				usersList = null;
				if (note.getAssignedToGroup() != null) {
					retMtnUserParam.put("userGrp", note.getAssignedToGroup());
					usersList = userDao.retMtnUsers(retMtnUserParam);
				}
				
				if (usersList != null) {
					for (Users users : usersList) {
						Note newNote = new Note();
						newNote.setNoteId(note.getNoteId());
						newNote.setTitle(note.getTitle());
						newNote.setNote(note.getNote());
						newNote.setModule(note.getModule());
						newNote.setReferenceId(note.getReferenceId());
						newNote.setDetails(note.getDetails());
						newNote.setStatus(note.getStatus());
						newNote.setCreateUser(note.getCreateUser());
						newNote.setCreateDate(note.getCreateDate());
						newNote.setUpdateUser(note.getUpdateUser());
						newNote.setUpdateDate(note.getUpdateDate());
						newNote.setRelatedRecordList(note.getRelatedRecordList());
						newNote.setImpTag(note.getImpTag());
						newNote.setUrgTag(note.getUrgTag());
						newNote.setAssignedTo(users.getUserId());
						tempForGroups.add(newNote);
					}
				}
			}
			
			if (tempForGroups.size() > 0) {
				saveNotesParams.put("noteList", tempForGroups);
			} else {
				saveNotesParams.put("noteList", snreq.getNoteList());
			}
			saveNotesParams.put("delNoteList", snreq.getDelNoteList());

			snResponse.setReturnCode(workFlowDao.saveNotes(saveNotesParams));
		} catch (Exception ex) {
			snResponse.setReturnCode(0);
			snResponse.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			ex.printStackTrace();
		}
		
		
		return snResponse;
	}

	@Override
	public RetrieveWfmTransactionsResponse retrieveTransactions(RetrieveWfmTransactionsRequest rwtr) throws SQLException {
		RetrieveWfmTransactionsResponse resp = new RetrieveWfmTransactionsResponse();
		try {
			HashMap<String, Object> retrieveTransactionParams = new HashMap<String, Object>();
			retrieveTransactionParams.put("tranTitle",rwtr.getTranTitle());
			
			resp.setTransactionList(workFlowDao.retrieveTransactions(retrieveTransactionParams));
			logger.info("RetrieveWfmTransactionsResponse : " + resp.toString());
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return resp;
	}

	@Override
	public RetrieveRelatedRecordsResponse retrieveRelatedRecords(RetrieveRelatedRecordsRequest rrrr)
			throws SQLException {
		RetrieveRelatedRecordsResponse resp = new RetrieveRelatedRecordsResponse();
		try {
			HashMap<String, Object> retrieveRelatedRecordsParams = new HashMap<String, Object>();
			retrieveRelatedRecordsParams.put("module",rrrr.getModule());
			retrieveRelatedRecordsParams.put("referenceId",rrrr.getReferenceId());
			
			resp.setRelatedRecordList(workFlowDao.retrieveRelatedRecords(retrieveRelatedRecordsParams));
			logger.info("RetrieveRelatedRecordsResponse : " + resp.toString());
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return resp;
	}

}
