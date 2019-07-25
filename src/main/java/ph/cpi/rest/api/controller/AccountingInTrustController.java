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

import ph.cpi.rest.api.model.request.CancelArRequest;
import ph.cpi.rest.api.model.request.CancelCMDMCMDMRequest;
import ph.cpi.rest.api.model.request.PrintCMDMRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitCMDMListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitCvPaytReqListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitInvestmentsListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitPaytReqRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitProfCommDtlRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitProfCommSummRequest;
import ph.cpi.rest.api.model.request.SaveAcitInvestmentsRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVListingRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitPaytReqRequest;
import ph.cpi.rest.api.model.request.SaveAcitArTransRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitPrqTransRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitRefNoLOVRequest;
import ph.cpi.rest.api.model.request.SaveAcitCMDMRequest;

import ph.cpi.rest.api.model.request.SaveAcitPaytReqRequest;
import ph.cpi.rest.api.model.request.SaveAcitPaytReqRequest;
import ph.cpi.rest.api.model.request.UpdateAcitPaytReqStatRequest;
import ph.cpi.rest.api.model.response.CancelArResponse;
import ph.cpi.rest.api.model.response.CancelCMDMCMDMResponse;
import ph.cpi.rest.api.model.response.PrintCMDMResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitCMDMListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitCvPaytReqListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitInvestmentsListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPaytReqResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitProfCommDtlResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitProfCommSummResponse;
import ph.cpi.rest.api.model.response.SaveAcitInvestmentsResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVListingResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPaytReqResponse;
import ph.cpi.rest.api.model.response.SaveAcitArTransResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPrqTransResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitRefNoLOVResponse;
import ph.cpi.rest.api.model.response.SaveAcitCMDMResponse;
import ph.cpi.rest.api.model.response.SaveAcitPaytReqResponse;
import ph.cpi.rest.api.model.response.SaveAcitPaytReqResponse;
import ph.cpi.rest.api.model.response.UpdateAcitPaytReqStatResponse;
import ph.cpi.rest.api.service.AccountingInTrustService;

@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080", "http://192.10.10.230:4200", "http://192.10.10.230:8888", "http://192.10.10.149:4200", "http://192.10.10.149:8888", "http://192.168.99.200:4200", "http://192.168.99.200:8888"})
@RequestMapping(path="/acct-in-trust-service")
public class AccountingInTrustController {

	@Autowired
	private AccountingInTrustService acctInTrustService;
	
	private static final Logger logger = LoggerFactory.getLogger(ClaimsController.class);
	
	@GetMapping(path="retrieveAcitCvPaytReqList")
	public @ResponseBody RetrieveAcitCvPaytReqListResponse retrieveAcitCvPaytReqList(RetrieveAcitCvPaytReqListRequest racprlr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitCvPaytReqList");
		logger.info("RetrieveAcitCvPaytReqListRequest : " + racprlr.toString());
		return acctInTrustService.retrieveAcitCvPaytReqList(racprlr);
	}
	
	@GetMapping(path="retrieveAcitPaytReq")
	public @ResponseBody RetrieveAcitPaytReqResponse retrieveAcitPaytReq(RetrieveAcitPaytReqRequest raprr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitPaytReq");
		logger.info("RetrieveAcitPaytReqRequest : " + raprr.toString());
		return acctInTrustService.retrieveAcitPaytReq(raprr);
	}
	
	@PostMapping(path="saveAcitPaytReq")
	public @ResponseBody SaveAcitPaytReqResponse saveAcitPaytReq(@RequestBody SaveAcitPaytReqRequest saprr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitPaytReq");
		logger.info("SaveAcitPaytReqRequest : " + saprr.toString());
		return acctInTrustService.saveAcitPaytReq(saprr);
	}
	
	@GetMapping(path="retrieveAcitProfCommSumm")
	public @ResponseBody RetrieveAcitProfCommSummResponse retrieveAcitProfCommSumm(RetrieveAcitProfCommSummRequest rapcsr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitProfCommSumm");
		logger.info("RetrieveAcitProfCommSummRequest : " + rapcsr.toString());
		return acctInTrustService.retrieveAcitProfCommSumm(rapcsr);
	}
	
	@GetMapping(path="retrieveAcitProfCommDtl")
	public @ResponseBody RetrieveAcitProfCommDtlResponse retrieveAcitProfCommDtl(RetrieveAcitProfCommDtlRequest rapcdr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitProfCommDtl");
		logger.info("RetrieveAcitProfCommDtlRequest : " + rapcdr.toString());
		return acctInTrustService.retrieveAcitProfCommDtl(rapcdr);
	}
	
	@GetMapping(path="retrieveAcitInvestmentsList")
	public @ResponseBody RetrieveAcitInvestmentsListResponse retrieveAcitInvestmentList(RetrieveAcitInvestmentsListRequest railr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitInvestmentsList");
		logger.info("RetrieveAcitInvestmentsListRequest : " + railr.toString());
		return acctInTrustService.retrieveAcitInvestmentList(railr);
	}
	
	@PostMapping(path="saveAcitInvestments")
	public @ResponseBody SaveAcitInvestmentsResponse saveAcitInvestments(@RequestBody SaveAcitInvestmentsRequest sair) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitInvestments");
		logger.info("SaveAcitInvestmentsRequest : " + sair.toString());
		return acctInTrustService.saveAcitInvestments(sair);
	}
	
	@GetMapping(path="retrieveAcitCMDMList")
	public @ResponseBody RetrieveAcitCMDMListResponse retrieveAcitCMDMList(RetrieveAcitCMDMListRequest racitcmdmlr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitCMDMList");
		logger.info("RetrieveAcitCMDMListRequest : " + racitcmdmlr.toString());
		return acctInTrustService.retrieveAcitCMDMList(racitcmdmlr);
	}
	
	@PostMapping(path="saveAcitCMDM")
	public @ResponseBody SaveAcitCMDMResponse saveAcitCMDM(@RequestBody SaveAcitCMDMRequest saprr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitCMDM");
		logger.info("SaveAcitCMDMRequest : " + saprr.toString());
		return acctInTrustService.saveAcitCMDM(saprr);
	}
	
	@GetMapping(path="retrieveAcitRefNoLOV")
	public @ResponseBody RetrieveAcitRefNoLOVResponse retrieveAcitRefNoLOV(RetrieveAcitRefNoLOVRequest racitcmdmlr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitRefNoLOV");
		logger.info("RetrieveAcitRefNoLOVRequest : " + racitcmdmlr.toString());
		return acctInTrustService.retrieveAcitRefNoLOV(racitcmdmlr);
	}

	@GetMapping(path="retrieveArList")
	public @ResponseBody RetrieveAcitArListResponse retrieveArList(RetrieveAcitArListRequest raalr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveArList");
		logger.info("RetrieveAcitArListRequest : " + raalr.toString());
		return acctInTrustService.retrieveArList(raalr);
	}
	
	@GetMapping(path="retrieveArEntry")
	public @ResponseBody RetrieveAcitArEntryResponse retrieveArEntry(RetrieveAcitArEntryRequest raaer) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveArEntry");
		logger.info("RetrieveAcitArEntryRequest : " + raaer.toString());
		return acctInTrustService.retrieveArEntry(raaer);
	}

	@GetMapping(path="retrieveAcitJVListing")
	public @ResponseBody RetrieveAcitJVListingResponse retrieveAcitJVListing(RetrieveAcitJVListingRequest rajl) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitJVListing");
		logger.info("RetrieveAcitJVListingRequest : " + rajl.toString());
		return acctInTrustService.retrieveAcitJvListing(rajl);
	}
	
	@GetMapping(path="retrieveAcitJVEntry")
	public @ResponseBody RetrieveAcitJVEntryResponse retrieveAcitJVEntry(RetrieveAcitJVEntryRequest raje) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitJVEntry");
		logger.info("RetrieveAcitJVEntryRequest : " + raje.toString());
		return acctInTrustService.retrieveAcitJvEntry(raje);
	}
	
	@PostMapping(path="saveAcitArTrans")
	public @ResponseBody SaveAcitArTransResponse saveAcitArTrans(@RequestBody SaveAcitArTransRequest saatr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitArTrans");
		logger.info("SaveAcitArTransRequest : " + saatr.toString());
		return acctInTrustService.saveAcitArTrans(saatr);
	}

	@PostMapping(path="updateAcitPaytReqStat")
	public @ResponseBody UpdateAcitPaytReqStatResponse updateAcitPaytReqStat(@RequestBody UpdateAcitPaytReqStatRequest uaprsr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/updateAcitPaytReqStat");
		logger.info("UpdateAcitPaytReqStatRequest : " + uaprsr.toString());
		return acctInTrustService.updateAcitPaytReqStat(uaprsr);
	}
	
	@GetMapping(path="retrieveAcitPrqTrans")
	public @ResponseBody RetrieveAcitPrqTransResponse retrieveAcitPrqTrans(RetrieveAcitPrqTransRequest raptr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitPrqTrans");
		logger.info("RetrieveAcitPrqTransRequest : " + raptr.toString());
		return acctInTrustService.retrieveAcitPrqTrans(raptr);
	}
	
	@PostMapping(path="cancelCMDMCMDM")
	public @ResponseBody CancelCMDMCMDMResponse cancelCMDMCMDM(@RequestBody CancelCMDMCMDMRequest saprr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/cancelCMDMCMDM");
		logger.info("CancelCMDMCMDMRequest : " + saprr.toString());
		return acctInTrustService.cancelCMDMCMDM(saprr);
	}
	
	@PostMapping(path="printCMDM")
	public @ResponseBody PrintCMDMResponse printCMDM(@RequestBody PrintCMDMRequest saprr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/printCMDM");
		logger.info("PrintCMDMRequest : " + saprr.toString());
		return acctInTrustService.printCMDM(saprr);
	}
	
	@PostMapping(path="cancelAr")
	public @ResponseBody CancelArResponse cancelAr(@RequestBody CancelArRequest car) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/cancelAr");
		logger.info("CancelArRequest : " + car.toString());
		return acctInTrustService.cancelAr(car);
	}

}
