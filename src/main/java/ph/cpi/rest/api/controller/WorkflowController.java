package ph.cpi.rest.api.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ph.cpi.rest.api.model.request.RetrieveNotesRequest;
import ph.cpi.rest.api.model.request.RetrieveRemindersRequest;
import ph.cpi.rest.api.model.request.RetrieveTransactionsRequest;
import ph.cpi.rest.api.model.response.RetrieveNotesResponse;
import ph.cpi.rest.api.model.response.RetrieveRemindersResponse;
import ph.cpi.rest.api.model.response.RetrieveTransactionsResponse;
import ph.cpi.rest.api.service.WorkflowService;

@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080"})
@RequestMapping(path="/workflow-service")
public class WorkflowController {

	@Autowired 
	private WorkflowService workflowService;
	
	private static final Logger logger = LoggerFactory.getLogger(WorkflowController.class);
	
	@GetMapping(path="retrieveTransactions")
	public @ResponseBody RetrieveTransactionsResponse retrieveTransactions(RetrieveTransactionsRequest rtr) throws SQLException{
		logger.info("GET: /api/workflow-service/retrieveTransactions");
		logger.info("RetrieveTransactionsRequest : " + rtr.toString());
		
		return workflowService.retrieveTransactions(rtr);
	}
	
	@GetMapping(path="retrieveReminders")
	public @ResponseBody RetrieveRemindersResponse retrieveReminders(RetrieveRemindersRequest rrr) throws SQLException{
		logger.info("GET: /api/workflow-service/retrieveReminders");
		logger.info("RetrieveRemindersRequest : " + rrr.toString());
		
		return workflowService.retrieveReminders(rrr);
	}
	
	@GetMapping(path="retrieveNotes")
	public @ResponseBody RetrieveNotesResponse retrieveNotes(RetrieveNotesRequest rnr) throws SQLException{
		logger.info("GET: /api/workflow-service/retrieveNotes");
		logger.info("RetrieveNotesRequest : " + rnr.toString());
		
		return workflowService.retrieveNotes(rnr);
	}
}
