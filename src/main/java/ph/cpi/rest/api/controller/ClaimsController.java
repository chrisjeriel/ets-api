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

import ph.cpi.rest.api.model.request.RetrieveClaimHistoryRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnDeductiblesRequest;
import ph.cpi.rest.api.model.request.SaveClaimHistoryRequest;
import ph.cpi.rest.api.model.request.SaveMtnLineRequest;
import ph.cpi.rest.api.model.response.RetrieveClaimHistoryResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnDeductiblesResponse;
import ph.cpi.rest.api.model.response.SaveClaimHistoryResponse;
import ph.cpi.rest.api.model.response.SaveMtnLineResponse;
import ph.cpi.rest.api.service.ClaimsService;
import ph.cpi.rest.api.service.MaintenanceService;

@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080", "http://192.10.10.230:4200", "http://192.10.10.230:8888", "http://192.10.10.149:4200", "http://192.10.10.149:8888", "http://192.168.99.200:4200", "http://192.168.99.200:8888"})
@RequestMapping(path="/claims-service")
public class ClaimsController {
	
	@Autowired
	private ClaimsService claimsService;
	
	private static final Logger logger = LoggerFactory.getLogger(ClaimsController.class);
	
	@GetMapping(path="retrieveClaimHistory")
	public @ResponseBody RetrieveClaimHistoryResponse retrieveClaimHistory(RetrieveClaimHistoryRequest rchr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveClaimHistory");
		logger.info("RetrieveClaimHistoryRequest : " + rchr.toString());
		return claimsService.retrieveClaimHistory(rchr);
	}
	
	@PostMapping(path="saveClaimHistory")
	public @ResponseBody SaveClaimHistoryResponse saveClaimHistory(@RequestBody SaveClaimHistoryRequest schr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveClaimHistory");
		logger.info("SaveClaimHistoryRequest : " + schr.toString());
		return claimsService.saveClaimHistory(schr);
	}
}
