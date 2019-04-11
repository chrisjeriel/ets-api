package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrieveNotesRequest;
import ph.cpi.rest.api.model.request.RetrieveRemindersRequest;
import ph.cpi.rest.api.model.request.RetrieveTransactionsRequest;
import ph.cpi.rest.api.model.response.RetrieveNotesResponse;
import ph.cpi.rest.api.model.response.RetrieveRemindersResponse;
import ph.cpi.rest.api.model.response.RetrieveTransactionsResponse;

@Service
public interface WorkflowService {
	public RetrieveTransactionsResponse retrieveTransactions(RetrieveTransactionsRequest rtr) throws SQLException;
	public RetrieveRemindersResponse retrieveReminders(RetrieveRemindersRequest rrr) throws SQLException;
	public RetrieveNotesResponse retrieveNotes(RetrieveNotesRequest rnr) throws SQLException;
}
