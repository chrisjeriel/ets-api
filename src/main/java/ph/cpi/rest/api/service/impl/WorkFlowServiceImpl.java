package ph.cpi.rest.api.service.impl;
import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.WorkFlowDao;
import ph.cpi.rest.api.model.request.RetrieveRemindersRequest;
import ph.cpi.rest.api.model.response.RetrieveRemindersResponse;
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

}
