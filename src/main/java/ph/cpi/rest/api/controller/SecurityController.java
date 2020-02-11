package ph.cpi.rest.api.controller;

import java.sql.SQLException;
import java.util.HashMap;

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

import ph.cpi.rest.api.model.request.RetrieveModulesRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnModulesRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTransactionsRequest;
import ph.cpi.rest.api.model.request.RetrieveTransactionsRequest;
import ph.cpi.rest.api.model.request.SaveModulesRequest;
import ph.cpi.rest.api.model.request.SaveTransactionsRequest;
import ph.cpi.rest.api.model.response.RetrieveModulesResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnModulesResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTransactionsResponse;
import ph.cpi.rest.api.model.response.RetrieveTransactionsResponse;
import ph.cpi.rest.api.model.response.SaveModulesResponse;
import ph.cpi.rest.api.model.response.SaveTransactionsResponse;
import ph.cpi.rest.api.service.SecurityService;

@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", 
						"http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080", "http://192.10.10.230:4200", 
						"http://192.10.10.230:8888", "http://192.10.10.149:4200", "http://192.10.10.149:8888", "http://192.168.99.200:4200", "http://192.168.99.200:8888",
						"http://192.168.99.201:8888", "http://192.168.99.201:4200", "http://192.168.99.202:8888", "http://192.168.99.202:4200",
						"http://192.10.10.210:8889", "http://192.10.10.210:4201","http://192.168.1.4:4200"})
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
		logger.info("RetrieveMtnTransactionsRequest : " + rmtr.toString());
		return securityService.retrieveMtnTransactions(rmtr);
	}
	
	/*@PostMapping(path="retrieveMtnTransactions")
	public @ResponseBody SaveClaimHistoryResponse retrieveMtnTransactions(@RequestBody SaveClaimHistoryRequest schr) throws SQLException {
		logger.info("POST: /api/claims-service/retrieveMtnTransactions");
		logger.info("SaveClaimHistoryRequest : " + schr.toString());
		return claimsService.saveClaimHistory(schr);
	}*/
	
	@GetMapping(path="retrieveTransactions")
	public @ResponseBody RetrieveTransactionsResponse retrieveTransactions(RetrieveTransactionsRequest rtr) throws SQLException {
		logger.info("GET: /api/security-service/retrieveTransactions");
		logger.info("retrieveTransactions : " + rtr.toString());
		return securityService.retrieveTransactions(rtr);
	}
	
	@GetMapping(path="retrieveModules")
	public @ResponseBody RetrieveModulesResponse retrieveModules(RetrieveModulesRequest rmr) throws SQLException {
		logger.info("GET: /api/security-service/retrieveModules");
		logger.info("retrieveModules : " + rmr.toString());
		return securityService.retrieveModules(rmr);
	}
	
	@PostMapping(path="saveTransactions")
	public @ResponseBody SaveTransactionsResponse saveTransactions(@RequestBody SaveTransactionsRequest str) throws SQLException {
		logger.info("POST: /api/security-service/saveTransactions");
		logger.info("SaveTransactionRequest : " + str.toString());
		return securityService.saveTransactions(str);
	}
	
	@PostMapping(path="saveModules")
	public @ResponseBody SaveModulesResponse saveModules(@RequestBody SaveModulesRequest smr) throws SQLException {
		logger.info("POST: /api/security-service/saveModules");
		logger.info("SaveModulesRequest : " + smr.toString());
		return securityService.saveModules(smr);
	}
	
	@PostMapping(path="secEncryption")
	public @ResponseBody HashMap<String, String> secEncryption(@RequestBody String smr) throws Exception {
		logger.info("POST: /api/security-service/secEncryption");
		logger.info("SaveModulesRequest : " + smr.toString());
		return securityService.secEncryption(smr);
	}
	
	
	
}
