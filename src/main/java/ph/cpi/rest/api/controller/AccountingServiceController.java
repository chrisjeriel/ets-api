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

import ph.cpi.rest.api.model.request.RetrieveAcseOrEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseOrListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcsePaytReqRequest;
import ph.cpi.rest.api.model.request.RetrieveAcsePrqTransRequest;
import ph.cpi.rest.api.model.request.SaveAcitPaytReqRequest;
import ph.cpi.rest.api.model.response.RetrieveAcseOrEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseOrListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcsePaytReqResponse;
import ph.cpi.rest.api.model.response.RetrieveAcsePrqTransResponse;
import ph.cpi.rest.api.model.response.SaveAcitPaytReqResponse;
import ph.cpi.rest.api.model.request.SaveAcseOrTransRequest;
import ph.cpi.rest.api.model.request.SaveAcsePaytReqRequest;
import ph.cpi.rest.api.model.request.SaveAcsePrqTransRequest;
import ph.cpi.rest.api.model.request.UpdateAcsePaytReqStatRequest;
import ph.cpi.rest.api.model.response.RetrieveAcseOrEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseOrListResponse;
import ph.cpi.rest.api.model.response.SaveAcseOrTransResponse;
import ph.cpi.rest.api.model.response.SaveAcsePaytReqResponse;
import ph.cpi.rest.api.model.response.SaveAcsePrqTransResponse;
import ph.cpi.rest.api.model.response.UpdateAcsePaytReqStatResponse;
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
		logger.info("GET: /api/acct-serv-service/retrieveAcseOrList");
		logger.info("RetrieveAcseOrListRequest : " + raolr.toString());
		return acctServService.retrieveAcseOrList(raolr);
	}
	
	@GetMapping(path="retrieveAcseOrEntry")
	public @ResponseBody RetrieveAcseOrEntryResponse retrieveAcseOrEntry(RetrieveAcseOrEntryRequest raoer) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseOrList");
		logger.info("RetrieveAcseOrEntryRequest : " + raoer.toString());
		return acctServService.retrieveAcseOrEntry(raoer);
	}
	
	@GetMapping(path="retrieveAcsePaytReq")
	public @ResponseBody RetrieveAcsePaytReqResponse retrieveAcsePaytReq(RetrieveAcsePaytReqRequest raprr) throws SQLException {
		logger.info("GET: /api/acct-service-service/retrieveAcsePaytReq");
		logger.info("RetrieveAcsePaytReqRequest : " + raprr.toString());
		return acctServService.retrieveAcsePaytReq(raprr);
	}

	@PostMapping(path="saveAcseOrEntry")
	public @ResponseBody SaveAcseOrTransResponse saveAcseOrEntry(@RequestBody SaveAcseOrTransRequest saotr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcseOrEntry");
		logger.info("SaveAcseOrTransRequest : " + saotr.toString());
		return acctServService.saveOrEntry(saotr);
	}
	
	@PostMapping(path="saveAcsePaytReq")
	public @ResponseBody SaveAcsePaytReqResponse saveAcsePaytReq(@RequestBody SaveAcsePaytReqRequest saprr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcsePaytReq");
		logger.info("SaveAcsePaytReqRequest : " + saprr.toString());
		return acctServService.saveAcsePaytReq(saprr);
	}
	
	@PostMapping(path="updateAcsePaytReqStat")
	public @ResponseBody UpdateAcsePaytReqStatResponse updateAcsePaytReqStat(@RequestBody UpdateAcsePaytReqStatRequest uaprsr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/updateAcsePaytReqStat");
		logger.info("UpdateAcsePaytReqStatRequest : " + uaprsr.toString());
		return acctServService.updateAcsePaytReqStat(uaprsr);
	}
	
	@GetMapping(path="retrieveAcsePrqTrans")
	public @ResponseBody RetrieveAcsePrqTransResponse retrieveAcsePrqTrans(RetrieveAcsePrqTransRequest raptr) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcsePrqTrans");
		logger.info("RetrieveAcsePrqTransRequest : " + raptr.toString());
		return acctServService.retrieveAcsePrqTrans(raptr);
	}
	
	@PostMapping(path="saveAcsePrqTrans")
	public @ResponseBody SaveAcsePrqTransResponse saveAcsePrqTrans(@RequestBody SaveAcsePrqTransRequest saptr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcsePrqTrans");
		logger.info("SaveAcsePrqTransRequest : " + saptr.toString());
		return acctServService.saveAcsePrqTrans(saptr);
	}
}
