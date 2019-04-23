package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.workflowmanager.Reminder;

public interface WorkFlowDao {

	public List<Reminder> retrieveReminders(final HashMap<String, Object> params) throws SQLException;	
}
