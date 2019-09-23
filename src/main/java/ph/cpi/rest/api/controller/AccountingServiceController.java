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

import ph.cpi.rest.api.model.request.RetrieveAcseOrEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseOrListRequest;
import ph.cpi.rest.api.model.response.RetrieveAcseOrEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseOrListResponse;
import ph.cpi.rest.api.service.AccountingServService;

@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", 
						"http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080", "http://192.10.10.230:4200", 
						"http://192.10.10.230:8888", "http://192.10.10.149:4200", "http://192.10.10.149:8888", "http://192.168.99.200:4200", "http://192.168.99.200:8888",
						"http://192.168.99.201:8888", "http://192.168.99.201:4200", "http://192.168.99.202:8888", "http://192.168.99.202:4200"})
@RequestMapping(path="/acct-serv-service")
public class AccountingServiceController {
	
	@Autowired
	private AccountingServService acctServService;
	
	private static final Logger logger = LoggerFactory.getLogger(AccountingServiceController.class);
	
	@GetMapping(path="retrieveAcseOrList")
	public @ResponseBody RetrieveAcseOrListResponse retrieveAcseOrList(RetrieveAcseOrListRequest raolr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcseOrList");
		logger.info("RetrieveAcseOrListRequest : " + raolr.toString());
		return acctServService.retrieveAcseOrList(raolr);
	}
	
	@GetMapping(path="retrieveAcseOrEntry")
	public @ResponseBody RetrieveAcseOrEntryResponse retrieveAcseOrEntry(RetrieveAcseOrEntryRequest raoer) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcseOrList");
		logger.info("RetrieveAcseOrEntryRequest : " + raoer.toString());
		return acctServService.retrieveAcseOrEntry(raoer);
	}
}
