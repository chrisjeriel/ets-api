package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrieveNotesRequest;
import ph.cpi.rest.api.model.request.RetrieveRemindersRequest;
import ph.cpi.rest.api.model.request.SaveNotesRequest;
import ph.cpi.rest.api.model.request.SaveRemindersRequest;
import ph.cpi.rest.api.model.response.RetrieveNotesResponse;
import ph.cpi.rest.api.model.response.RetrieveRemindersResponse;
import ph.cpi.rest.api.model.response.SaveNotesResponse;
import ph.cpi.rest.api.model.response.SaveRemindersResponse;


@Service
public interface WorkFlowService {
	public RetrieveRemindersResponse retrieveReminders(RetrieveRemindersRequest rrrq) throws SQLException;
	public SaveRemindersResponse saveReminders(SaveRemindersRequest srreq ) throws SQLException;
	public RetrieveNotesResponse retrieveNotes(RetrieveNotesRequest rnrq) throws SQLException;
	public SaveNotesResponse saveNotes(SaveNotesRequest snreq ) throws SQLException;
	

}
