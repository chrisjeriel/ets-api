package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrieveRemindersRequest;
import ph.cpi.rest.api.model.response.RetrieveRemindersResponse;


@Service
public interface WorkFlowService {
	public RetrieveRemindersResponse retrieveReminders(RetrieveRemindersRequest rrrq) throws SQLException;

}
