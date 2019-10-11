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

import ph.cpi.rest.api.model.request.RetrieveNotesRequest;
import ph.cpi.rest.api.model.request.RetrieveRelatedRecordsRequest;
import ph.cpi.rest.api.model.request.RetrieveRemindersRequest;
import ph.cpi.rest.api.model.request.RetrieveWfmTransactionsRequest;
import ph.cpi.rest.api.model.request.SaveNotesRequest;
import ph.cpi.rest.api.model.request.SaveRemindersRequest;
import ph.cpi.rest.api.model.response.RetrieveNotesResponse;
import ph.cpi.rest.api.model.response.RetrieveRelatedRecordsResponse;
import ph.cpi.rest.api.model.response.RetrieveRemindersResponse;
import ph.cpi.rest.api.model.response.RetrieveWfmTransactionsResponse;
import ph.cpi.rest.api.model.response.SaveNotesResponse;
import ph.cpi.rest.api.model.response.SaveRemindersResponse;
import ph.cpi.rest.api.service.WorkFlowService;

@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.163:4200", 
						"http://192.168.99.202:8888", "http://192.168.99.202:8080",
						"http://192.168.99.201:8888", "http://192.168.99.201:4200", "http://192.168.99.202:8888", "http://192.168.99.202:4200"})
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
		return workFlowService.saveReminders(srreq);
	}
	
	@GetMapping(path="retNotes")
	public @ResponseBody RetrieveNotesResponse retrieveNotes(RetrieveNotesRequest rnrq) throws SQLException {
		logger.info("GET: /api/work-flow-service/retNotes");
		logger.info("RetrieveNotessRequest : " + rnrq.toString());
		return workFlowService.retrieveNotes(rnrq);
	}
	
	@PostMapping(path="saveNotes")
	public @ResponseBody SaveNotesResponse saveNotes(@RequestBody SaveNotesRequest snreq) throws SQLException {
		logger.info("POST: /api/work-flow-service/saveNotes");
		logger.info("SaveNotesRequest : " + snreq.toString());
		return workFlowService.saveNotes(snreq);
	}

	@GetMapping(path="retTransactions")
	public @ResponseBody RetrieveWfmTransactionsResponse retrieveTransactions(RetrieveWfmTransactionsRequest rwtr) throws SQLException {
		logger.info("GET: /api/work-flow-service/retTransactions"); 
		logger.info("RetrieveWfmTransactionsRequest : " + rwtr.toString());
		return workFlowService.retrieveTransactions(rwtr);
	}
	
	@GetMapping(path="retRelatedRecords")
	public @ResponseBody RetrieveRelatedRecordsResponse retrieveRelatedRecords(RetrieveRelatedRecordsRequest rrrr) throws SQLException {
		logger.info("GET: /api/work-flow-service/retRelatedRecords"); 
		logger.info("RetrieveRelatedRecordsRequest : " + rrrr.toString());
		return workFlowService.retrieveRelatedRecords(rrrr);
	}
}
