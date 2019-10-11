package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.workflowmanager.Note;
import ph.cpi.rest.api.model.workflowmanager.RelatedRecord;
import ph.cpi.rest.api.model.workflowmanager.Reminder;
import ph.cpi.rest.api.model.workflowmanager.WfmTransaction;

public interface WorkFlowDao {

	public List<Reminder> retrieveReminders(final HashMap<String, Object> params) throws SQLException;	
	public Integer saveReminders(final HashMap<String, Object> params ) throws SQLException;
	public List<Note> retrieveNotes(final HashMap<String, Object> params) throws SQLException;
	public Integer saveNotes(final HashMap<String, Object> params ) throws SQLException;
	public List<WfmTransaction> retrieveTransactions(final HashMap<String, Object> params) throws SQLException;	
	public List<RelatedRecord> retrieveRelatedRecords(final HashMap<String, Object> params) throws SQLException;
	
}
