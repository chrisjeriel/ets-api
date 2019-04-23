package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrieveRemindersRequest;
import ph.cpi.rest.api.model.request.SaveRemindersRequest;
import ph.cpi.rest.api.model.response.RetrieveRemindersResponse;
import ph.cpi.rest.api.model.response.SaveRemindersResponse;


@Service
public interface WorkFlowService {
	public RetrieveRemindersResponse retrieveReminders(RetrieveRemindersRequest rrrq) throws SQLException;
	public SaveRemindersResponse saveRemindersResponse(SaveRemindersRequest srreq ) throws SQLException;

}
