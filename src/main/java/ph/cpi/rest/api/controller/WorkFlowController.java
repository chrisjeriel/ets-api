package ph.cpi.rest.api.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ph.cpi.rest.api.model.request.RetrieveMtnUsersRequest;
import ph.cpi.rest.api.model.request.RetrieveRemindersRequest;
import ph.cpi.rest.api.model.request.SavePolAttachmentRequest;
import ph.cpi.rest.api.model.request.SaveRemindersRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnUsersResponse;
import ph.cpi.rest.api.model.response.RetrieveRemindersResponse;
import ph.cpi.rest.api.model.response.SavePolAttachmentResponse;
import ph.cpi.rest.api.model.response.SaveRemindersResponse;
import ph.cpi.rest.api.service.WorkFlowService;

@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080"})
@RequestMapping(path="/work-flow-service")
public class WorkFlowController {
	
	@Autowired 
	private WorkFlowService workFlowService;
	private static final Logger logger = LoggerFactory.getLogger(WorkFlowController.class);
	
	@GetMapping(path="retReminders")
	public @ResponseBody RetrieveRemindersResponse retrieveReminders(RetrieveRemindersRequest rrrq) throws SQLException {
		logger.info("GET: /api/work-flow-service/retReminders");
		logger.info("RetrieveRemindersRequest : " + rrrq.toString());
		return workFlowService.retrieveReminders(rrrq);
	}
	
	@PostMapping(path="saveReminders")
	public @ResponseBody SaveRemindersResponse saveReminders(@RequestBody SaveRemindersRequest srreq) throws SQLException {
		logger.info("POST: /api/work-flow-service/saveReminders");
		logger.info("SaveRemindersRequest : " + srreq.toString());
		return workFlowService.saveRemindersResponse(srreq);
	}

	 

}
