package ph.cpi.rest.api.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ph.cpi.rest.api.model.request.RetrieveMtnModulesRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTransactionsRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnModulesResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTransactionsResponse;
import ph.cpi.rest.api.service.SecurityService;

@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080", "http://192.10.10.230:4200", "http://192.10.10.230:8888", "http://192.10.10.149:4200", "http://192.10.10.149:8888", "http://192.168.99.200:4200", "http://192.168.99.200:8888"})
@RequestMapping(path="/security-service")
public class SecurityController {
	
	@Autowired
	private SecurityService securityService;
	
	private static final Logger logger = LoggerFactory.getLogger(SecurityController.class);
	
	@GetMapping(path="retrieveMtnModules")
	public @ResponseBody RetrieveMtnModulesResponse retrieveMtnModules(RetrieveMtnModulesRequest rmmr) throws SQLException {
		logger.info("GET: /api/security-service/retrieveMtnModules");
		logger.info("RetrieveMtnModulesRequest : " + rmmr.toString());
		return securityService.retrieveMtnModules(rmmr);
	}
	
	@GetMapping(path="retrieveMtnTransactions")
	public @ResponseBody RetrieveMtnTransactionsResponse retrieveMtnTransactions(RetrieveMtnTransactionsRequest rmtr) throws SQLException {
		logger.info("GET: /api/security-service/retrieveMtnTransactions");
		logger.info("SaveClaimHistoryRequest : " + rmtr.toString());
		return securityService.retrieveMtnTransactions(rmtr);
	}
	
	/*@PostMapping(path="retrieveMtnTransactions")
	public @ResponseBody SaveClaimHistoryResponse retrieveMtnTransactions(@RequestBody SaveClaimHistoryRequest schr) throws SQLException {
		logger.info("POST: /api/claims-service/retrieveMtnTransactions");
		logger.info("SaveClaimHistoryRequest : " + schr.toString());
		return claimsService.saveClaimHistory(schr);
	}*/
	
}
