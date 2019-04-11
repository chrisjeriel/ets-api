package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.workflow.DashboardTran;
import ph.cpi.rest.api.model.workflow.Notes;
import ph.cpi.rest.api.model.workflow.Reminders;

public interface WorkflowDao {
	public List<DashboardTran> retrieveTransactions(final HashMap<String, Object> params) throws SQLException;
	public List<Reminders> retrieveReminders(final HashMap<String, Object> params) throws SQLException;
	public List<Notes> retrieveNotes(final HashMap<String, Object> params) throws SQLException;
}
