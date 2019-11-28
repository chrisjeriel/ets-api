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

import ph.cpi.rest.api.model.request.*;
import ph.cpi.rest.api.model.response.*;
import ph.cpi.rest.api.service.AccountingInTrustService;

@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", 
						"http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080", "http://192.10.10.230:4200", 
						"http://192.10.10.230:8888", "http://192.10.10.149:4200", "http://192.10.10.149:8888", "http://192.168.99.200:4200", "http://192.168.99.200:8888",
						"http://192.168.99.201:8888", "http://192.168.99.201:4200", "http://192.168.99.202:8888", "http://192.168.99.202:4200",
						"http://192.10.10.210:8889", "http://192.10.10.210:4201"})
@RequestMapping(path="/acct-in-trust-service")
public class AccountingInTrustController {

	@Autowired
	private AccountingInTrustService acctInTrustService;
	
	@Autowired
	private WebSocketController webSocketController;
	
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
	
//	@GetMapping(path="retrieveAcitProfCommSumm")
//	public @ResponseBody RetrieveAcitProfCommSummResponse retrieveAcitProfCommSumm(RetrieveAcitProfCommSummRequest rapcsr) throws SQLException {
//		logger.info("GET: /api/acct-in-trust-service/retrieveAcitProfCommSumm");
//		logger.info("RetrieveAcitProfCommSummRequest : " + rapcsr.toString());
//		return acctInTrustService.retrieveAcitProfCommSumm(rapcsr);
//	}
	
//	@GetMapping(path="retrieveAcitProfCommDtl")
//	public @ResponseBody RetrieveAcitProfCommDtlResponse retrieveAcitProfCommDtl(RetrieveAcitProfCommDtlRequest rapcdr) throws SQLException {
//		logger.info("GET: /api/acct-in-trust-service/retrieveAcitProfCommDtl");
//		logger.info("RetrieveAcitProfCommDtlRequest : " + rapcdr.toString());
//		return acctInTrustService.retrieveAcitProfCommDtl(rapcdr);
//	}
	
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

	@PostMapping(path="saveAcitJVEntry")
	public @ResponseBody SaveAcitJVEntryResponse saveAcitJVEntry(@RequestBody SaveAcitJVEntryRequest saprr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitJVEntry");
		logger.info("SaveAcitJVEntryRequest : " + saprr.toString());
		return acctInTrustService.saveAcitJVEntry(saprr);
	}
	
	@GetMapping(path="retrieveAcitSOAAging")
	public @ResponseBody RetrieveAcitSOAAgingResponse retrieveAcitSOAAging(RetrieveAcitSOAAgingDetailsRequest rasa) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitSOAAging");
		logger.info("RetrieveAcitSOAAgingDetailsRequest : " + rasa.toString());
		return acctInTrustService.retrieveAcitSOAAging(rasa);
	}
	
	@GetMapping(path="retrieveAcitJVInwPolBal")
	public @ResponseBody RetrieveAcitJVInwPolBalResponse retrieveAcitJVInwPolBal(RetrieveAcitJVInPolBalRequest rasa) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitJVInwPolBal");
		logger.info("RetrieveAcitJVInPolBalRequest : " + rasa.toString());
		return acctInTrustService.retrieveAcitJvAdjstInwPolBal(rasa);
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
	

	@GetMapping(path="retrieveAcitJVIntOverdueAccts")
	public @ResponseBody RetrieveAcitJVIntOverdAcctMSResponse retrieveAcitJVIntOverdueAccts(RetrieveAcitJVIntOverdAcctMSRequest rasa) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitJVIntOverdueAccts");
		logger.info("RetrieveAcitJVIntOverdAcctMSRequest : " + rasa.toString());
		return acctInTrustService.retrieveAcitJVIntOverdue(rasa);
	}
	
	@PostMapping(path="saveAcitJVInwPolBal")
	public @ResponseBody SaveAcitJVAdjInwPolBalResponse saveAcitJVInwPolBal(@RequestBody SaveAcitJVAdjInwPolBalRequest request) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitJVInwPolBal");
		logger.info("SaveAcitJVAdjInwPolBalRequest : " + request.toString());
		return acctInTrustService.saveAcitJvInwPolBal(request);
	}
	
	@PostMapping(path="saveAcitJVOverdueAccts")
	public @ResponseBody SaveAcitJVIntOverdAcctMSResponse saveAcitJVOverdueAccts(@RequestBody SaveAcitJVIntOverdAcctMSRequest request) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitJVOverdueAccts");
		logger.info("SaveAcitJVIntOverdAcctMSRequest : " + request.toString());
		return acctInTrustService.saveAcitJvOverdueAccts(request);
	}
	
	@GetMapping(path="retrieveAcitJVPremResRel")
	public @ResponseBody RetrieveAcitJVPremResRelResponse retrievePremResRel(RetrieveAcitJVPremResRelRequest request) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitJVPremResRel");
		logger.info("RetrieveAcitJVPremResRelRequest : " + request.toString());
		return acctInTrustService.retrieveAcitJVPremresRel(request);
	}

	@PostMapping(path="saveAcitPrqTrans")
	public @ResponseBody SaveAcitPrqTransResponse saveAcitPrqTrans(@RequestBody SaveAcitPrqTransRequest saptr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitPrqTrans");
		logger.info("SaveAcitPrqTransRequest : " + saptr.toString());
		return acctInTrustService.saveAcitPrqTrans(saptr);
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
	
	@GetMapping(path="retrieveAcitAgingSoaDtl")
	public @ResponseBody RetrieveAcitAgingSoaDtlResponse retrieveAcitAgingSoaDtl(RetrieveAcitAgingSoaDtlRequest ragsdr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitAgingSoaDtl");
		logger.info("RetrieveAcitAgingSoaDtlRequest : " + ragsdr.toString());
		return acctInTrustService.retrieveAgingSoaDtl(ragsdr);
	}
	
	@PostMapping(path="saveAcitArInwPolBal")
	public @ResponseBody SaveAcitArInwPolBalResponse saveAcitArInwPolBal(@RequestBody SaveAcitArInwPolBalRequest saaipbr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitArInwPolBal");
		logger.info("SaveAcitArInwPolBalRequest : " + saaipbr.toString());
		return acctInTrustService.saveArInwPolBal(saaipbr);
	}
	
	@GetMapping(path="retrieveAcitArInwPolBal")
	public @ResponseBody RetrieveAcitArInwPolBalResponse retrieveAcitArInwPolBal(RetrieveAcitArInwPolBalRequest raaipbr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitArInwPolBal");
		logger.info("RetrieveAcitArInwPolBalRequest : " + raaipbr.toString());
		return acctInTrustService.retrieveArInwPolBal(raaipbr);
	}
	
	@GetMapping(path="retrieveAcitArTransDtl")
	public @ResponseBody RetrieveAcitArTransDtlResponse retrieveAcitArTransDtl(RetrieveAcitArTransDtlRequest raatdr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitArTransDtl");
		logger.info("RetrieveAcitArTransDtlRequest : " + raatdr.toString());
		return acctInTrustService.retrieveARTransDtl(raatdr);
	}
	
	@PostMapping(path="saveAcitArTransDtl")
	public @ResponseBody SaveAcitArTransDtlResponse saveAcitArTransDtl(@RequestBody SaveAcitArTransDtlRequest saatdr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitArTransDtl");
		logger.info("SaveAcitArTransDtlRequest : " + saatdr.toString());
		return acctInTrustService.saveAcitArTransDtl(saatdr);
	}

	@GetMapping(path="retrieveAcitAllInvestmentIncome")
	public @ResponseBody RetrieveAcitAllInvestmentIncomeResponse retrieveAcitAllInvestmentIncome(RetrieveAcitAllInvestmentIncomeRequest raaii) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitAllInvestmentIncome");
		logger.info("RetrieveAcitAllInvestmentIncomeRequest : " + raaii.toString());
		return acctInTrustService.retrieveAcitAllInvestmentIncome(raaii);
	}
	
	@GetMapping(path="retrieveAcitAllInvestmentIncomeInvtId")
	public @ResponseBody RetrieveAcitAllInvestmentIncomeInvtIdResponse retrieveAcitAllInvestmentIncomeInvtId(RetrieveAcitAllInvestmentIncomeInvtIdRequest raii) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitAllInvestmentIncomeInvtId");
		logger.info("RetrieveAcitAllInvestmentIncomeInvtIdRequest : " + raii.toString());
		return acctInTrustService.retrieveAcitAllInvestmentIncomeInvtId(raii);
	}
	
	@GetMapping(path="retrieveAcitAcctEntries")
	public @ResponseBody RetrieveAcitAcctEntriesResponse retrieveAcitAcctEntries(RetrieveAcitAcctEntriesRequest racitcmdmlr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitAcctEntries");
		logger.info("RetrieveAcitAcctEntriesRequest : " + racitcmdmlr.toString());
		return acctInTrustService.retrieveAcitAcctEntries(racitcmdmlr);
	}
	
	@GetMapping(path="retrieveQSOAList")
	public @ResponseBody RetrieveQSOAListResponse retrieveQSOAList(RetrieveQSOAListRequest rqlr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveQSOAList");
		logger.info("RetrieveQSOAListRequest : " + rqlr.toString());
		return acctInTrustService.retrieveQSOAList(rqlr);
	}

	@PostMapping(path="saveAcitAcctEntries")
	public @ResponseBody SaveAcitAcctEntriesResponse saveAcitAcctEntries(@RequestBody SaveAcitAcctEntriesRequest saprr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitAcctEntries");
		logger.info("SaveAcitAcctEntriesRequest : " + saprr.toString());
		return acctInTrustService.saveAcitAcctEntries(saprr);
	}
	
	@PostMapping(path="saveAcitJVPremResRel")
	public @ResponseBody SaveAcitJVPremResRelResponse saveAcitJVPremResRel(@RequestBody SaveAcitJVPremResRelRequest request) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitJVPremResRel");
		logger.info("SaveAcitJVPremResRelRequest : " + request.toString());
		return acctInTrustService.saveAcitJVPremResRel(request);
	}
	
	@PostMapping(path="cancelJournalVoucher")
	public @ResponseBody CancelJournalVoucherResponse cancelJournalVoucher(@RequestBody CancelJournalVoucherRequest request) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/cancelJournalVoucher");
		logger.info("CancelJournalVoucherRequest : " + request.toString());
		return acctInTrustService.cancelJV(request);
	}
	
	@PostMapping(path="printJournalVoucher")
	public @ResponseBody PrintJVResponse printJV(@RequestBody PrintJVRequest request) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/printJournalVoucher");
		logger.info("PrintJVRequest : " + request.toString());
		return acctInTrustService.printJV(request);
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
	
	@GetMapping(path="retrieveAcitPrqInwPol")
	public @ResponseBody RetrieveAcitPrqInwPolResponse retrieveAcitPrqInwPol(RetrieveAcitPrqInwPolRequest rapipr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitPrqInwPol");
		logger.info("RetrieveAcitPrqInwPolRequest : " + rapipr.toString());
		return acctInTrustService.retrieveAcitPrqInwPol(rapipr);
	}
	
	@PostMapping(path="saveAcitPrqInwPol")
	public @ResponseBody SaveAcitPrqInwPolResponse saveAcitPrqInwPol(@RequestBody SaveAcitPrqInwPolRequest saptr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitPrqInwPol");
		logger.info("SaveAcitPrqInwPolRequest : " + saptr.toString());
		return acctInTrustService.saveAcitPrqInwPol(saptr);
	}
	
	@GetMapping(path="retrieveAcctPrqServFee")
	public @ResponseBody RetrieveAcctPrqServFeeResponse retrieveAcctPrqServFee(RetrieveAcctPrqServFeeRequest rasfr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcctPrqServFee");
		logger.info("RetrieveAcctPrqServFeeRequest : " + rasfr.toString());
		return acctInTrustService.retrieveAcctPrqServFee(rasfr);
	}

	@GetMapping(path="retrieveAcitArClmRecover")
	public @ResponseBody RetrieveAcitArClmRecoverResponse retrieveAcitArClmRecover(RetrieveAcitArClmRecoverRequest raacrr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitArClmRecover");
		logger.info("RetrieveAcitArClmRecoverRequest : " + raacrr.toString());
		return acctInTrustService.retrieveAcitArClmRecover(raacrr);
	}
	
	@GetMapping(path="retrieveAcitArClmRecoverLov")
	public @ResponseBody RetrieveAcitArClmRecoverLovResponse retrieveAcitArClmRecoverLov(RetrieveAcitArClmRecoverLovRequest raacrlr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitArClmRecoverLov");
		logger.info("RetrieveAcitArClmRecoverLovRequest : " + raacrlr.toString());
		return acctInTrustService.retrieveAcitArClmRecoverLov(raacrlr);
	}
	
	@PostMapping(path="saveAcitArClmRecover")
	public @ResponseBody SaveAcitArClmRecoverResponse saveAcitArClmRecover(@RequestBody SaveAcitArClmRecoverRequest saacrr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitArClmRecover");
		logger.info("SaveAcitArClmRecoverRequest : " + saacrr.toString());
		return acctInTrustService.saveAcitArClmRecover(saacrr);
	}
	
	@GetMapping(path="retrieveAcitArInvPullout")
	public @ResponseBody RetrieveAcitArInvPulloutResponse retrieveAcitArInvPullout(RetrieveAcitArInvPulloutRequest raaipr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitArInvPullout");
		logger.info("RetrieveAcitArInvPulloutRequest : " + raaipr.toString());
		return acctInTrustService.retrieveAcitArInvArPullout(raaipr);
	}
	
	@GetMapping(path="retrieveAcitJVAppPaytZeroBal")
	public @ResponseBody RetrieveAcitJVAppPaytZeroResponse retrieveAcitJVAppPaytZeroBal(RetrieveAcitJVAppPaytZeroRequest request) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitJVAppPaytZeroBal");
		logger.info("RetrieveAcitJVAppPaytZeroRequest : " + request.toString());
		return acctInTrustService.retrieveAcitJVAppPaytZeroBal(request);
	}
	
	@PostMapping(path="saveAcitJVAppPaytZeroBal")
	public @ResponseBody SaveAcitJVAppPaytZeroResponse saveAcitJVAppPaytZeroBal(@RequestBody SaveAcitJVAppPaytZeroRequest request) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitJVAppPaytZeroBal");
		logger.info("SaveAcitJVAppPaytZeroRequest : " + request.toString());
		return acctInTrustService.saveAcitJVAppPaytZeroBal(request);
	}
	
	@GetMapping(path="retrieveAcitSoaTrtyList")
	public @ResponseBody RetrieveAcitSOATreatyDetailsResponse retrieveAcitSoaTrtyList(RetrieveAcitSOATreatyDetailsRequest request) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitSoaTrtyList");
		logger.info("RetrieveAcitSOATreatyDetailsRequest : " + request.toString());
		return acctInTrustService.retrieveAcitSOATrtyDetails(request);
	}

	@PostMapping(path="saveAcitArInvPullout")
	public @ResponseBody SaveAcitArInvPulloutResponse saveAcitArInvPullout(@RequestBody SaveAcitArInvPulloutRequest saaipr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitArInvPullout");
		logger.info("SaveAcitArInvPulloutRequest : " + saaipr.toString());
		return acctInTrustService.saveAcitArInvPullout(saaipr);
	}
	
	@GetMapping(path="retrieveAcitJvClmOffLOV")
	public @ResponseBody RetrieveAcitJVClmOffLOVResponse retrieveAcitJvClmOffLOV(RetrieveAcitJVClmOffLOVRequest request) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitJvClmOffLOV");
		logger.info("RetrieveAcitJVClmOffLOVRequest : " + request.toString());
		return acctInTrustService.retrieveAcitJvClmOff(request);
	}
	
	@GetMapping(path="retrieveAcitJvNegativeTreaty")
	public @ResponseBody RetrieveAcitJVClmNegTrtyResponse retrieveAcitJvNegativeTreaty(RetrieveAcitJVClmNegTrtyRequest request) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitJvNegativeTreaty");
		logger.info("RetrieveAcitJVClmNegTrtyRequest : " + request.toString());
		return acctInTrustService.retrieveAcitJvNegTrty(request);
	}
	
	@PostMapping(path="saveAcitJVNegativeTreaty")
	public @ResponseBody SaveAcitJvNegTrtyResponse saveAcitJVNegativeTreaty(@RequestBody SaveAcitJvNegTrtyRequest saaipr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitJVNegativeTreaty");
		logger.info("SaveAcitJvNegTrtyRequest : " + saaipr.toString());
		return acctInTrustService.saveAcitJvNegTrty(saaipr);
	}

	@GetMapping(path="retrieveAcitArNegTrtyBal")
	public @ResponseBody RetrieveAcitArNegTrtyBalResponse retrieveAcitArNegTrtyBal(RetrieveAcitArNegTrtyBalRequest raantbr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitArNegTrtyBal");
		logger.info("RetrieveAcitArNegTrtyBalRequest : " + raantbr.toString());
		return acctInTrustService.retrieveAcitArNegTrtyBal(raantbr);
	}
	
	@PostMapping(path="saveAcitArNegTrtyBal")
	public @ResponseBody SaveAcitArNegTrtyBalResponse saveAcitArNegTrtyBal(@RequestBody SaveAcitArNegTrtyBalRequest saantbr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitArNegTrtyBal");
		logger.info("SaveAcitArNegTrtyBalRequest : " + saantbr.toString());
		return acctInTrustService.saveAcitArNegTrtyBal(saantbr);
	}
	
	@GetMapping(path="retrieveAcitArClmCashCallLov")
	public @ResponseBody RetrieveAcitArClmCashCallLovResponse retrieveAcitArClmCashCallLov(RetrieveAcitArClmCashCallLovRequest raaccclr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitArClmCashCallLov");
		logger.info("RetrieveAcitArClmCashCallLovRequest : " + raaccclr.toString());
		return acctInTrustService.retrieveAcitArClmCashCallLov(raaccclr);
	}
	
	@GetMapping(path="retrieveAcitArClmCashCall")
	public @ResponseBody RetrieveAcitArClmCashCallResponse retrieveAcitArClmCashCall(RetrieveAcitArClmCashCallRequest raacccr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitArClmCashCall");
		logger.info("RetrieveAcitArClmCashCallRequest : " + raacccr.toString());
		return acctInTrustService.retrieveAcitArClmCashCall(raacccr);
	}
	
	@PostMapping(path="saveAcitArClmCashCall")
	public @ResponseBody SaveAcitArClmCashCallResponse saveAcitArClmCashCall(@RequestBody SaveAcitArClmCashCallRequest saacccr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitArClmCashCall");
		logger.info("SaveAcitArClmCashCallRequest : " + saacccr.toString());
		return acctInTrustService.saveAcitArClmCashCall(saacccr);
	}
	
	@GetMapping(path="retrieveAcitArAmtDtl")
	public @ResponseBody RetrieveAcitArAmtDtlResponse retrieveAcitArAmtDtl(RetrieveAcitArAmtDtlRequest raaadr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitArAmtDtl");
		logger.info("RetrieveAcitArAmtDtlRequest : " + raaadr.toString());
		return acctInTrustService.retrieveAcitArAmtDtl(raaadr);
	}
	
	@PostMapping(path="saveAcitArAmtDtl")
	public @ResponseBody SaveAcitArAmtDtlResponse saveAcitArAmtDtl(@RequestBody SaveAcitArAmtDtlRequest saaadr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitArAmtDtl");
		logger.info("SaveAcitArAmtDtlRequest : " + saaadr.toString());
		return acctInTrustService.saveAcitArAmtDtl(saaadr);
	}
	
	/*@PostMapping(path="saveAcitJVClmOffset")
	public @ResponseBody SaveAcitJVClmOffsetResponse saveAcitJvClmOffset(@RequestBody SaveAcitJvClmOffsetRequest request) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/SaveAcitJvClmOffsetRequest");
		logger.info("SaveAcitJvClmOffsetRequest : " + request.toString());
		return acctInTrustService.saveAcitJvClmOffset(request);
	}*/
	
	@PostMapping(path="generateUPR")
	public @ResponseBody GenerateUPRResponse generateUPR(@RequestBody GenerateUPRRequest guprr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/generateUPR");
		logger.info("GenerateUPRRequest : " + guprr.toString());
		return acctInTrustService.generateUPR(guprr);
	}
	
	@GetMapping(path="retrieveAcitUPRPerCede")
	public @ResponseBody RetrieveAcitUPRPerCedeResponse retrieveAcitUPRPerCede(RetrieveAcitUPRPerCedeRequest raupcr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitUPRPerCede");
		logger.info("RetrieveAcitUPRPerCedeRequest : " + raupcr.toString());
		return acctInTrustService.retrieveAcitUPRPerCede(raupcr);
	}
	
	@GetMapping(path="retrieveAcitUPRParams")
	public @ResponseBody RetrieveAcitUPRParamsResponse retrieveAcitUPRParams() throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitUPRParams");
		logger.info("RetrieveAcitUPRParamsRequest : ");
		return acctInTrustService.retrieveAcitUPRParams();
	}
	
	@GetMapping(path="retrieveAcitExistingUPR")
	public @ResponseBody String retrieveAcitExistingUPR(GenerateUPRRequest guprr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitExistingUPR");
		logger.info("RetrieveAcitExistingUPRRequest : "+  guprr.toString());
		return acctInTrustService.retrieveAcitExistingUPR(guprr);
	}
	
	@GetMapping(path="retrieveAcitJvAcctTrtyBal")
	public @ResponseBody RetrieveAcitJVAcctTrtyBalResponse retrieveAcitJvAcctTrtyBal(RetrieveAcitJVAcctTrtyBalRequest request) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/RetrieveAcitJVAcctTrtyBalRequest");
		logger.info("RetrieveAcitJVAcctTrtyBalRequest : " + request.toString());
		return acctInTrustService.retrieveAcitJvAcctTrtyBal(request);
	}
	
	@PostMapping(path="saveAcitJVActTrtyBal")
	public @ResponseBody SaveAcitJVAcctTrtyBalResponse saveAcitJVActTrtyBal(@RequestBody SaveAcitJVAcctTrtyBalRequest request) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitJVActTrtyBal");
		logger.info("SaveAcitJVAcctTrtyBalRequest : " + request.toString());
		return acctInTrustService.saveAcitJvActTrtyBal(request);
	}
	
	@GetMapping(path="retrieveAcitJvDefName")
	public @ResponseBody RetrieveAcitJVDefNameResponse retrieveAcitJvDefName(RetrieveAcitJvDefNameRequest request) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/RetrieveAcitJvDefNameRequest");
		logger.info("RetrieveAcitJvDefNameRequest : " + request.toString());
		return acctInTrustService.retrieveAcitJvDefName(request);
	}
	
	@PostMapping(path="saveAcitAllocInvtIncome")
	public @ResponseBody SaveAcitAllocInvtIncomeResponse saveAcitAllocInvtIncome(@RequestBody SaveAcitAllocInvtIncomeRequest saaii) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitAllocInvtIncome");
		logger.info("SaveAcitAllocInvtIncomeRequest : " + saaii.toString());
		return acctInTrustService.saveAcitAllocInvtIncome(saaii);
	}

	@PostMapping(path="saveAcitJVEntryList")
	public @ResponseBody SaveAcitJVEntryListResponse saveAcitJVEntryList(@RequestBody SaveAcitJVEntryListRequest sajel) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitJVEntryList");
		logger.info("SaveAcitJVEntryListRequest : " + sajel.toString());
		return acctInTrustService.saveAcitJVEntryList(sajel);
	}
	
	@GetMapping(path="retrieveAcitJVAllocInvtInc")
	public @ResponseBody RetrieveAcitJVAllocInvtIncResponse retrieveAcitJVAllocInvtInc(RetrieveAcitJVAllocInvtIncRequest rajaii) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/RetrieveAcitJVAllocInvtIncRequest");
		logger.info("RetrieveAcitJVAllocInvtIncRequest : " + rajaii.toString());
		return acctInTrustService.retrieveAcitJVAllocInvtInc(rajaii);
	}
	
	@PostMapping(path="updateAcitStatus")
	public @ResponseBody UpdateAcitStatusResponse updateAcitStatus(@RequestBody UpdateAcitStatusRequest uasr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/UpdateAcitStatusRequest");
		logger.info("UpdateAcitStatusRequest : " + uasr.toString());
		return acctInTrustService.updateAcitStatus(uasr);
		
	
	}
	
	@PostMapping(path="saveAcctPrqServFee")
	public @ResponseBody SaveAcctPrqServFeeResponse saveAcctPrqServFee(@RequestBody SaveAcctPrqServFeeRequest sapsfr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcctPrqServFee");
		logger.info("SaveAcctPrqServFeeRequest : " + sapsfr.toString());
		return acctInTrustService.saveAcctPrqServFee(sapsfr);
	}

	@GetMapping(path="retrieveAcitJVRcvblsAgnstLosses")
	public @ResponseBody RetrieveAcitJVRcvblsAgnstLosResponse retrieveAcitJVRcvblsAgnstLosses(RetrieveAcitJVRcvblsAgnstLosRequest request) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/RetrieveAcitJVRcvblsAgnstLosRequest");
		logger.info("RetrieveAcitJVRcvblsAgnstLosRequest : " + request.toString());
		return acctInTrustService.retrieveAcitJVRcvblsAgnstLosses(request);
	}
	
	@PostMapping(path="saveAcitJvReceivablesAgainstLoss")
	public @ResponseBody SaveAcitJVRcvblsAgnstLosResponse saveAcitJvReceivablesAgainstLoss(@RequestBody SaveAcitJVRcvblsAgnstLosRequest request) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/SaveAcitJVRcvblsAgnstLosRequest");
		logger.info("SaveAcitJVRcvblsAgnstLosRequest : " + request.toString());
		return acctInTrustService.saveAcitJvRcvblsAgnstLoss(request);
	}
	
	@PostMapping(path="printAr")
	public @ResponseBody PrintArResponse printAr(@RequestBody PrintArRequest par) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/printAr");
		logger.info("PrintArRequest : " + par.toString());
		return acctInTrustService.printAr(par);
	}

	@GetMapping(path="retrieveAcitClmResHistPayts")
	public @ResponseBody RetrieveAcitClmResHistPaytResponse retrieveAcitClmResHistPayts(RetrieveAcitClmResHistPaytRequest request) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/RetrieveAcitJVAcctTrtyBalRequest");
		logger.info("RetrieveAcitClmResHistPaytRequest : " + request.toString());
		return acctInTrustService.retrieveAcitClmResHistPayts(request);
	}
	
	@PostMapping(path="saveAcitClmResHistPayts")
	public @ResponseBody SaveAcitClmResHistPaytsResponse saveAcitClmResHistPayts(@RequestBody SaveAcitClmResHistPaytsRequest request) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/SaveAcitClmResHistPaytsRequest");
		logger.info("SaveAcitClmResHistPaytsRequest : " + request.toString());
		return acctInTrustService.saveAcitClmResHistPayts(request);
	}

	@GetMapping(path="retrieveAcitCv")
	public @ResponseBody RetrieveAcitCvResponse retrieveAcitCv(RetrieveAcitCvRequest racr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitCv");
		logger.info("RetrieveAcitCvRequest : " + racr.toString());
		return acctInTrustService.retrieveAcitCv(racr);
	}

	@PostMapping(path="saveAcitCv")
	public @ResponseBody SaveAcitCvResponse saveAcitCv(@RequestBody SaveAcitCvRequest sacr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitCv");
		logger.info("SaveAcitCvRequest : " + sacr.toString());
		return acctInTrustService.saveAcitCv(sacr);
	}
	
	@PostMapping(path="saveAcitCvPaytReqList")
	public @ResponseBody SaveAcitCvPaytReqListResponse saveAcitCvPaytReqList(@RequestBody SaveAcitCvPaytReqListRequest sacprr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitCvPaytReqList");
		logger.info("SaveAcitCvPaytReqListRequest : " + sacprr.toString());
		return acctInTrustService.saveAcitCvPaytReqList(sacprr);
	}
	
	@GetMapping(path="retrieveAcitAttachments")
	public @ResponseBody RetrieveAcitAttachmentsResponse retrieveAcitAttachments(RetrieveAcitAttachmentsRequest raar) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitAttachments");
		logger.info("RetrieveAcitAttachmentsRequest : " + raar.toString());
		return acctInTrustService.retrieveAcitAttachments(raar);
	}

	@PostMapping(path="saveAcitAttachments")
	public @ResponseBody SaveAcitAttachmentsResponse saveAcitAttachments(@RequestBody SaveAcitAttachmentsRequest saar) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitAttachments");
		logger.info("SaveAcitAttachmentsRequest : " + saar.toString());
		return acctInTrustService.saveAcitAttachments(saar);
	}
		
	@PostMapping(path="updateAcitCvStat")
	public @ResponseBody UpdateAcitCvStatResponse updateAcitCvStat(@RequestBody UpdateAcitCvStatRequest uacvsr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/updateAcitCvStat");
		logger.info("UpdateAcitCvStatRequest : " + uacvsr.toString());
		return acctInTrustService.updateAcitCvStat(uacvsr);
	}

	@PostMapping(path="approveJV")
	public @ResponseBody ApproveJVResponse approveJV(@RequestBody ApproveJVRequest request) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/ApproveJVRequest");
		logger.info("ApproveJVRequest : " + request.toString());
		return acctInTrustService.approveJV(request);
	}
	
	@GetMapping(path="retrieveAcitJVInvPullOut")
	public @ResponseBody RetrieveAcitJVInvPullOutResponse retrieveAcitJVInvPullOut(RetrieveAcitJvInvPullOutRequest request) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/RetrieveAcitJvInvPullOutRequest");
		logger.info("RetrieveAcitJvInvPullOutRequest : " + request.toString());
		return acctInTrustService.retrieveAcitJVInvPullOut(request);
	}
	
	@PostMapping(path="saveAcitJVInvPullOut")
	public @ResponseBody SaveAcitJVInvPullOutResponse saveAcitJVInvPullOut(@RequestBody SaveAcitJVInvPullOutRequest request) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/SaveAcitJVInvPullOutRequest");
		logger.info("SaveAcitJVInvPullOutRequest : " + request.toString());
		return acctInTrustService.saveAcitJVInvPullOut(request);
	}
	
	@GetMapping(path="retrieveAcitJVInvRollOver")
	public @ResponseBody RetrieveAcitJVInvtRollOverResponse retrieveAcitJVInvRollOver(RetrieveAcitJVInvtRollOverRequest request) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitJVInvRollOver");
		logger.info("RetrieveAcitJVInvtRollOverRequest : " + request.toString());
		return acctInTrustService.retrieveAcitJVInvRollOver(request);
	}
	
	@PostMapping(path="saveAcitJVInvRollOver")
	public @ResponseBody SaveAcitJVInvRollOverResponse saveAcitJVInvRollOver(@RequestBody SaveAcitJVInvRollOverRequest request) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/SaveAcitJVInvRollOverRequest");
		logger.info("SaveAcitJVInvRollOverRequest : " + request.toString());
		return acctInTrustService.saveAcitJVInvRollOver(request);
	}
	
	@GetMapping(path="retrieveSoaAgingZeroLOV")
	public @ResponseBody RetrieveAcitSOAAgingZeroResponse retrieveSoaAgingZeroLOV(RetrieveAcitSOAAgingZeroRequest request) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/RetrieveAcitSOAAgingZeroRequest");
		logger.info("RetrieveAcitSOAAgingZeroRequest : " + request.toString());
		return acctInTrustService.retrieveSoaAgingZeroLOV(request);
	}
	
	@GetMapping(path="retrieveQuarterPremRes")
	public @ResponseBody RetrieveAcitJvQrtrPremResResponse retrieveQuarterPremRes(RetrieveAcitJvQrtrPremResRequest request) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/RetrieveAcitJvQrtrPremResRequest");
		logger.info("RetrieveAcitJvQrtrPremResRequest : " + request.toString());
		return acctInTrustService.retrieveQuarterPremRes(request); 
	}
	
	@GetMapping(path="retrieveSoaAgingZeroAltLOV")
	public @ResponseBody RetrieveAcitSoaZeroAltResponse retrieveSoaAgingZeroAltLOV(RetrieveAcitSoaZeroAltRequest request) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/RetrieveAcitSoaZeroAltRequest");
		logger.info("RetrieveAcitSoaZeroAltRequest : " + request.toString());
		return acctInTrustService.retrieveSoaAgingZeroAltLOV(request);
	}
	
	@GetMapping(path="retrieveAcitAmortize")
	public @ResponseBody RetrieveAcitAmortizeResponse retrieveAcitAmortize(RetrieveAcitAmortizeRequest raar) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/retrieveAcitAmortize");
		logger.info("RetrieveAcitAmortizeRequest : " + raar.toString());
		return acctInTrustService.retrieveAcitAmortize(raar);
	}
	
	@GetMapping(path="retrieveAcitJvInvmtOffset")
	public @ResponseBody RetrieveAcitJvInvmtOffsetResponse retrieveAcitJvInvmtOffset(RetrieveAcitJvInvmtOffsetRequest raar) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/RetrieveAcitJvInvmtOffsetRequest");
		logger.info("RetrieveAcitJvInvmtOffsetRequest : " + raar.toString());
		return acctInTrustService.retrieveAcitJvInvmtOffset(raar);
	}
	
	@PostMapping(path="saveAcitJVTrtyInvt")
	public @ResponseBody SaveAcitJVTrtyInvtResponse saveAcitJVTrtyInvt(@RequestBody SaveAcitJVTrtyInvtRequest request) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/SaveAcitJVTrtyInvtRequest");
		logger.info("SaveAcitJVTrtyInvtRequest : " + request.toString());
		return acctInTrustService.saveAcitJVTrtyInvt(request);
	}
	
	@GetMapping(path="retrieveAcitJvInvPlacement")
	public @ResponseBody RetrieveAcitJvInvPlacementResponse retrieveAcitJvInvPlacement(RetrieveAcitJvInvPlacementRequest raar) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/RetrieveAcitJvInvPlacementRequest");
		logger.info("RetrieveAcitJvInvPlacementRequest : " + raar.toString());
		return acctInTrustService.retrieveAcitJvInvPlacement(raar);
	}
	
	@PostMapping(path="saveAcitJVInvPlacement")
	public @ResponseBody SaveAcitJVInvPlacementResponse saveAcitJVInvPlacement(@RequestBody SaveAcitJVInvPlacementRequest request) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/SaveAcitJVInvPlacementRequest");
		logger.info("SaveAcitJVInvPlacementRequest : " + request.toString());
		return acctInTrustService.saveAcitJVInvPlacement(request);
	}
	
	@GetMapping(path="retrieveAcitSoaDue")
	public @ResponseBody RetrieveAcitSOADueResponse retrieveAcitSoaDue(RetrieveAcitSOADueRequest raar) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/RetrieveAcitSOADueRequest");
		logger.info("RetrieveAcitSOADueRequest : " + raar.toString());
		return acctInTrustService.retrieveAcitSoaDue(raar);
	}
	
	@GetMapping(path="retrieveAcitInwPolPayts")
	public @ResponseBody RetrieveAcitInwPolPaytsResponse retrieveAcitInwPolPayts(RetrieveAcitInwPolPaytsRequest raar) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/RetrieveAcitInwPolPaytsRequest");
		logger.info("RetrieveAcitInwPolPaytsRequest : " + raar.toString());
		return acctInTrustService.retrieveAcitInwPolPayts(raar);
	}

	@GetMapping(path="retrieveCancelledTrans")
	public @ResponseBody RetrieveAcitCancelTransactionResponse retrieveCancelledTrans(RetrieveAcitCancelTransactionRequest request) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveCancelledTrans");
		logger.info("RetrieveAcseCancelTransactionRequest : " + request.toString());
		return acctInTrustService.retrieveCancelledTrans(request);
	}
	
	@PostMapping(path="saveAcitMonthEndBatchProd")
	public @ResponseBody SaveAcitMonthEndBatchProdResponse saveAcitMonthEndBatchProd(@RequestBody SaveAcitMonthEndBatchProdRequest samebr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitMonthEndBatchProd");
		logger.info("SaveAcitMonthEndBatchRequest : " + samebr.toString());
		return acctInTrustService.saveAcitMonthEndBatchProd(samebr);
	}
	
	@PostMapping(path="saveAcitMonthEndBatchOS")
	public @ResponseBody SaveAcitMonthEndBatchOSResponse saveAcitMonthEndBatchOS(@RequestBody SaveAcitMonthEndBatchOSRequest samebr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitMonthEndBatchOS");
		logger.info("SaveAcitMonthEndBatchOSRequest : " + samebr.toString());
		return acctInTrustService.saveAcitMonthEndBatchOS(samebr);
	}
	
	@GetMapping(path="retrieveAcitMonthEndTrialBal")
	public @ResponseBody RetrieveAcitMonthEndTrialBalResponse retrieveAcitMonthEndTrialBal(RetrieveAcitMonthEndTrialBalRequest rametbr) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcitMonthEndTrialBal");
		logger.info("retrieveAcitMonthEndTrialBalRequest : " + rametbr.toString());
		return acctInTrustService.retrieveAcitMonthEndTrialBal(rametbr);
	}
	
	@PostMapping(path="saveAcitMonthEndTrialBal")
	public @ResponseBody SaveAcitMonthEndTrialBalResponse saveAcitMonthEndTrialBal(@RequestBody SaveAcitMonthEndTrialBalRequest sametbr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitMonthEndTrialBal");
		logger.info("SaveAcitMonthEndTrialBalRequest : " + sametbr.toString());
		return acctInTrustService.saveAcitMonthEndTrialBal(sametbr);
	}
	
	@PostMapping(path="postAcitMonthEndTrialBal")
	public @ResponseBody PostAcitMonthEndTrialBalResponse postAcitMonthEndTrialBal(@RequestBody PostAcitMonthEndTrialBalRequest pametbr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/postAcitMonthEndTrialBal");
		logger.info("PostAcitMonthEndTrialBalRequest : " + pametbr.toString());
		return acctInTrustService.postAcitMonthEndTrialBal(pametbr);
	}
	
	@GetMapping(path="retrieveAcitMonthEndUnpostedMonths")
	public @ResponseBody RetrieveAcitMonthEndUnpostedMonthsResponse retrieveAcitMonthEndUnpostedMonths() throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcitMonthEndUnpostedMonths");
		return acctInTrustService.retrieveAcitMonthEndUnpostedMonths();
	}
	
	@GetMapping(path="retrieveAcitMonthEnd")
	public @ResponseBody RetrieveAcitMonthEndResponse retrieveAcitMonthEnd(RetrieveAcitMonthEndRequest ramer) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcitMonthEnd");
		logger.info("RetrieveAcitMonthEndRequest : " + ramer.toString());
		return acctInTrustService.retrieveAcitMonthEnd(ramer);
	}
	
	@PostMapping(path="saveQSOA")
	public @ResponseBody SaveQSOAResponse saveQSOA(@RequestBody SaveQSOARequest sqr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveQSOA");
		logger.info("PostAcitMonthEndTrialBalRequest : " + sqr.toString());
		return acctInTrustService.saveQSOA(sqr);
	}
	
	@GetMapping(path="retrieveQSOADtl")
	public @ResponseBody RetrieveQSOADtlResponse retrieveQSOADtl(RetrieveQSOADtlRequest rqdr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveQSOADtl");
		logger.info("RetrieveQSOADtlRequest : " + rqdr.toString());
		return acctInTrustService.retrieveQSOADtl(rqdr);
	}
	
	@PostMapping(path="saveAcitProfComm")
	public @ResponseBody SaveAcitProfCommResponse saveAcitProfComm(@RequestBody SaveAcitProfCommRequest sapcr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitProfComm");
		logger.info("SaveAcitProfCommRequest : " + sapcr.toString());
		return acctInTrustService.saveAcitProfComm(sapcr);
	}
	
	@GetMapping(path="retrieveAcitEditedAcctEntries")
	public @ResponseBody RetrieveAcitEditedAcctEntriesResponse retrieveAcitEditedAcctEntries(RetrieveAcitEditedAcctEntriesRequest raeaer) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitEditedAcctEntries");
		logger.info("RetrieveAcitEditedAcctEntriesRequest : " + raeaer.toString());
		return acctInTrustService.retrieveAcitEditedAcctEntries(raeaer);
	}
	
	@GetMapping(path="retrieveAcitOsQsoa")
	public @ResponseBody RetrieveAcitOsQsoaResponse retrieveAcitOsQsoa(RetrieveAcitOsQsoaRequest raoqp) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitOsQsoa");
		logger.info("RetrieveAcitOsQsoaRequest : " + raoqp.toString());
		return acctInTrustService.retrieveAcitOsQsoa(raoqp);
	}
	
	@PostMapping(path="saveAcitDcbCollection")
	public @ResponseBody SaveAcitDcbCollectionResponse saveAcitDcbCollection(@RequestBody SaveAcitDcbCollectionRequest sapcr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcitDcbCollection");
		logger.info("SaveAcitDcbCollectionRequest : " + sapcr.toString());
		return acctInTrustService.saveDcbCollection(sapcr);
	}
}
