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

import ph.cpi.rest.api.model.request.ApproveJVServiceRequest;
import ph.cpi.rest.api.model.request.CancelJVServiceRequest;
import ph.cpi.rest.api.model.request.CancelOrRequest;
import ph.cpi.rest.api.model.request.CopyAcseExpenseBudgetRequest;
import ph.cpi.rest.api.model.request.EditServiceAccountingEntriesRequest;
import ph.cpi.rest.api.model.request.ExtractAcseExpenseBudgetRequest;
import ph.cpi.rest.api.model.request.GenerateBatchInvoiceNoRequest;
import ph.cpi.rest.api.model.request.GenerateBatchOrNoRequest;
import ph.cpi.rest.api.model.request.PostAcitMonthEndTrialBalRequest;
import ph.cpi.rest.api.model.request.PrintAcseJvRequest;
import ph.cpi.rest.api.model.request.PrintInvoiceBatchRequest;
import ph.cpi.rest.api.model.request.PrintOrBatchRequest;
import ph.cpi.rest.api.model.request.PrintOrRequest;
import ph.cpi.rest.api.model.request.RestoreServiceAccountingEntriesRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitMonthEndTrialBalRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseAcctEntBackupRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseAcctEntInqRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseAcctEntriesRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseAttachmentsRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseBatchInvoiceRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseBatchOrRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseBudExpMonthlyRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseBudgetExpenseRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseCancelTransactionRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseChangeToNewCVRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseChangeToNewJVRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseChangeToNewORRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseCvPaytReqListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseCvRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseDcbBankDetailsRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseDcbCollectionRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseEditedAcctEntriesRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseInsuranceExpRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseInvoiceItemsRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseJVEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseJVListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseOrEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseOrListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseOrServFeeRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseOrTransDtlRequest;
import ph.cpi.rest.api.model.request.RetrieveAcsePaytReqRequest;
import ph.cpi.rest.api.model.request.RetrieveAcsePerDiemRequest;
import ph.cpi.rest.api.model.request.RetrieveAcsePrqTransRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseRefNoLOVRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseTaxDetailsRequest;
import ph.cpi.rest.api.model.request.RetrieveOrSFeeDtlDistRequest;
import ph.cpi.rest.api.model.request.SaveAcitMonthEndTBReopenRequest;
import ph.cpi.rest.api.model.request.SaveAcitMonthEndTBTempCloseRequest;
import ph.cpi.rest.api.model.request.SaveAcitMonthEndTrialBalRequest;
import ph.cpi.rest.api.model.request.SaveAcseAcctEntriesRequest;
import ph.cpi.rest.api.model.request.SaveAcseAttachmentsRequest;
import ph.cpi.rest.api.model.request.SaveAcseBudExpMonthlyRequest;
import ph.cpi.rest.api.model.request.SaveAcseBudgetExpenseRequest;
import ph.cpi.rest.api.model.request.SaveAcseCloseOpenDcbRequest;
import ph.cpi.rest.api.model.request.SaveAcseCvPaytReqListRequest;
import ph.cpi.rest.api.model.request.SaveAcseCvRequest;
import ph.cpi.rest.api.model.request.SaveAcseDcbCollectionRequest;
import ph.cpi.rest.api.model.request.SaveAcseInsuranceExpRequest;
import ph.cpi.rest.api.model.request.SaveAcseInvoiceItemRequest;
import ph.cpi.rest.api.model.request.SaveAcseInvoiceRequest;
import ph.cpi.rest.api.model.request.SaveAcseJVEntryRequest;
import ph.cpi.rest.api.model.request.SaveAcseOrServFeeRequest;
import ph.cpi.rest.api.model.request.SaveAcseOrTransDtlRequest;
import ph.cpi.rest.api.model.request.SaveAcseOrTransRequest;
import ph.cpi.rest.api.model.request.SaveAcsePaytReqRequest;
import ph.cpi.rest.api.model.request.SaveAcsePerDiemRequest;
import ph.cpi.rest.api.model.request.SaveAcsePrqTransRequest;
import ph.cpi.rest.api.model.request.SaveAcseTaxDetailsRequest;
import ph.cpi.rest.api.model.request.UpdateAcseCvStatRequest;
import ph.cpi.rest.api.model.request.UpdateAcsePaytReqStatRequest;
import ph.cpi.rest.api.model.request.UpdateAcseStatRequest;
import ph.cpi.rest.api.model.request.UpdateAcseStatusRequest;
import ph.cpi.rest.api.model.response.ApproveJVServiceResponse;
import ph.cpi.rest.api.model.response.CancelJVServiceResponse;
import ph.cpi.rest.api.model.response.CancelOrResponse;
import ph.cpi.rest.api.model.response.CopyAcseExpenseBudgetResponse;
import ph.cpi.rest.api.model.response.EditServiceAccountingEntriesResponse;
import ph.cpi.rest.api.model.response.ExtractAcseExpenseBudgetResponse;
import ph.cpi.rest.api.model.response.GenerateBatchInvoiceNoResponse;
import ph.cpi.rest.api.model.response.GenerateBatchOrNoResponse;
import ph.cpi.rest.api.model.response.PostAcitMonthEndTrialBalResponse;
import ph.cpi.rest.api.model.response.PrintAcseJvResponse;
import ph.cpi.rest.api.model.response.PrintInvoiceBatchResponse;
import ph.cpi.rest.api.model.response.PrintOrBatchResponse;
import ph.cpi.rest.api.model.response.PrintOrResponse;
import ph.cpi.rest.api.model.response.RestoreServiceAccountingEntriesResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitMonthEndTrialBalResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitMonthEndUnpostedMonthsResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseAcctEntBackupResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseAcctEntInqResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseAcctEntriesResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseAttachmentsResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseBatchInvoiceResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseBatchOrResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseBudExpMonthlyResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseBudgetExpenseResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseCancelTransactionResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseChangeToNewCVResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseChangeToNewJVResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseChangeToNewORResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseCvPaytReqListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseCvResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseDcbBankDetailsResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseDcbCollectionResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseEditedAcctEntriesResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseInsuranceExpResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseInvoiceItemsResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseJVEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseJVListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseOrEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseOrListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseOrServFeeResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseOrTransDtlResponse;
import ph.cpi.rest.api.model.response.RetrieveAcsePaytReqResponse;
import ph.cpi.rest.api.model.response.RetrieveAcsePerDiemResponse;
import ph.cpi.rest.api.model.response.RetrieveAcsePrqTransResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseRefNoLOVResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseTaxDetailsResponse;
import ph.cpi.rest.api.model.response.RetrieveOrSFeeDtlDistResponse;
import ph.cpi.rest.api.model.response.SaveAcitMonthEndTBReopenResponse;
import ph.cpi.rest.api.model.response.SaveAcitMonthEndTBTempCloseResponse;
import ph.cpi.rest.api.model.response.SaveAcitMonthEndTrialBalResponse;
import ph.cpi.rest.api.model.response.SaveAcseAcctEntriesResponse;
import ph.cpi.rest.api.model.response.SaveAcseAttachmentsResponse;
import ph.cpi.rest.api.model.response.SaveAcseBudExpMonthlyResponse;
import ph.cpi.rest.api.model.response.SaveAcseBudgetExpenseResponse;
import ph.cpi.rest.api.model.response.SaveAcseCloseOpenDcbResponse;
import ph.cpi.rest.api.model.response.SaveAcseCvPaytReqListResponse;
import ph.cpi.rest.api.model.response.SaveAcseCvResponse;
import ph.cpi.rest.api.model.response.SaveAcseDcbCollectionResponse;
import ph.cpi.rest.api.model.response.SaveAcseInsuranceExpResponse;
import ph.cpi.rest.api.model.response.SaveAcseInvoiceItemResponse;
import ph.cpi.rest.api.model.response.SaveAcseInvoiceResponse;
import ph.cpi.rest.api.model.response.SaveAcseJVEntryResponse;
import ph.cpi.rest.api.model.response.SaveAcseOrServFeeResponse;
import ph.cpi.rest.api.model.response.SaveAcseOrTransDtlResponse;
import ph.cpi.rest.api.model.response.SaveAcseOrTransResponse;
import ph.cpi.rest.api.model.response.SaveAcsePaytReqResponse;
import ph.cpi.rest.api.model.response.SaveAcsePerDiemResponse;
import ph.cpi.rest.api.model.response.SaveAcsePrqTransResponse;
import ph.cpi.rest.api.model.response.SaveAcseTaxDetailsResponse;
import ph.cpi.rest.api.model.response.UpdateAcseCvStatResponse;
import ph.cpi.rest.api.model.response.UpdateAcsePaytReqStatResponse;
import ph.cpi.rest.api.model.response.UpdateAcseStatResponse;
import ph.cpi.rest.api.model.response.UpdateAcseStatusResponse;
import ph.cpi.rest.api.service.AccountingServService;

@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.202:4201", 
						"http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080", "http://192.10.10.230:4200", 
						"http://192.10.10.230:8888", "http://192.10.10.149:4200", "http://192.10.10.149:8888", "http://192.168.99.200:4200", "http://192.168.99.200:8888",
						"http://192.168.99.201:8888", "http://192.168.99.201:4200", "http://192.168.99.202:8888", "http://192.168.99.202:4200", "http://192.10.10.210:8889", "http://192.10.10.210:4201","http://192.168.1.4:4200"})
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
	

	@GetMapping(path="retrieveJVList")
	public @ResponseBody RetrieveAcseJVListResponse retrieveJVList(RetrieveAcseJVListRequest request) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveJVList");
		logger.info("RetrieveAcseJVListRequest : " + request.toString());
		return acctServService.retrieveJVList(request);
	}
	
	@GetMapping(path="retrieveJVEntry")
	public @ResponseBody RetrieveAcseJVEntryResponse retrieveJVEntry(RetrieveAcseJVEntryRequest request) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveJVEntry");
		logger.info("RetrieveAcseJVEntryRequest : " + request.toString());
		return acctServService.retrieveJVEntry(request);
	}

	@PostMapping(path="saveAcsePaytReq")
	public @ResponseBody SaveAcsePaytReqResponse saveAcsePaytReq(@RequestBody SaveAcsePaytReqRequest saprr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcsePaytReq");
		logger.info("SaveAcsePaytReqRequest : " + saprr.toString());
		return acctServService.saveAcsePaytReq(saprr);
	}
	
	@PostMapping(path="saveAcseJVEntry")
	public @ResponseBody SaveAcseJVEntryResponse saveAcseJVEntry(@RequestBody SaveAcseJVEntryRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcseJVEntry");
		logger.info("SaveAcseJVEntryRequest : " + request.toString());
		return acctServService.saveJVEntry(request);
	}
	
	@PostMapping(path="approveJV")
	public @ResponseBody ApproveJVServiceResponse approveJV(@RequestBody ApproveJVServiceRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/approveJV");
		logger.info("ApproveJVServiceRequest : " + request.toString());
		return acctServService.approveJV(request);
	}
	
	@PostMapping(path="cancelJV")
	public @ResponseBody CancelJVServiceResponse cancelJV(@RequestBody CancelJVServiceRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/cancelJV");
		logger.info("CancelJVServiceRequest : " + request.toString());
		return acctServService.cancelJV(request);
	}

	@GetMapping(path="retrieveAcseOrTransDtl")
	public @ResponseBody RetrieveAcseOrTransDtlResponse retrieveAcseOrTransDtl(RetrieveAcseOrTransDtlRequest raotdr) throws SQLException {
		logger.info("GET: /api/acct-service-service/retrieveAcseOrTransDtl");
		logger.info("RetrieveAcseOrTransDtlRequest : " + raotdr.toString());
		return acctServService.retrieveAcseOrTransDtl(raotdr);
	}

	@PostMapping(path="updateAcsePaytReqStat")
	public @ResponseBody UpdateAcsePaytReqStatResponse updateAcsePaytReqStat(@RequestBody UpdateAcsePaytReqStatRequest uaprsr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/updateAcsePaytReqStat");
		logger.info("UpdateAcsePaytReqStatRequest : " + uaprsr.toString());
		return acctServService.updateAcsePaytReqStat(uaprsr);
	}
	
	@GetMapping(path="retrieveTaxDetails")
	public @ResponseBody RetrieveAcseTaxDetailsResponse retrieveTaxDetails(RetrieveAcseTaxDetailsRequest request) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveTaxDetails");
		logger.info("RetrieveAcseTaxDetailsRequest : " + request.toString());
		return acctServService.retrieveTaxDetails(request);
	}

	@PostMapping(path="saveAcseOrTransDtl")
	public @ResponseBody SaveAcseOrTransDtlResponse saveAcseOrTransDtl(@RequestBody SaveAcseOrTransDtlRequest saotdr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcseOrTransDtl");
		logger.info("SaveAcseOrTransDtlRequest : " + saotdr.toString());
		return acctServService.saveAcseOrTransDtl(saotdr);
	}
	
	@PostMapping(path="saveTaxDetails")
	public @ResponseBody SaveAcseTaxDetailsResponse saveTaxDetails(@RequestBody SaveAcseTaxDetailsRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveTaxDetails");
		logger.info("SaveAcseTaxDetailsRequest : " + request.toString());
		return acctServService.saveTaxDetails(request);
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
	
	@GetMapping(path="retrieveAcctEntries")
	public @ResponseBody RetrieveAcseAcctEntriesResponse retrieveAcctEntries(RetrieveAcseAcctEntriesRequest request) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcctEntries");
		logger.info("RetrieveAcseAcctEntriesRequest : " + request.toString());
		return acctServService.retrieveAcctEntries(request);
	}
	
//	@GetMapping(path="retrieveAcseCv")
//	public @ResponseBody RetrieveAcseCvResponse retrieveAcseCv(RetrieveAcseCvRequest racr) throws SQLException {
//		logger.info("GET: /api/acct-serv-service/retrieveAcseCv");
//		logger.info("RetrieveAcseCvRequest : " + racr.toString());
//		return acctServService.retrieveAcseCv(racr);
//	}

	@GetMapping(path="retrieveAcseCv")
	public @ResponseBody RetrieveAcseCvResponse retrieveAcseCv(RetrieveAcseCvRequest racr) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseCv");
		logger.info("RetrieveAcseCvRequest : " + racr.toString());
		return acctServService.retrieveAcseCv(racr);
	}
	
	@PostMapping(path="saveAcseCv")
	public @ResponseBody SaveAcseCvResponse saveAcseCv(@RequestBody SaveAcseCvRequest sacr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcseCv");
		logger.info("SaveAcseCvRequest : " + sacr.toString());
		return acctServService.saveAcseCv(sacr);
	}
	
	@PostMapping(path="saveAcctEntries")
	public @ResponseBody SaveAcseAcctEntriesResponse saveAcctEntries(@RequestBody SaveAcseAcctEntriesRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcctEntries");
		logger.info("SaveAcseAcctEntriesRequest : " + request.toString());
		return acctServService.saveAcctEntries(request);
	}
	
	@GetMapping(path="retrieveAttachments")
	public @ResponseBody RetrieveAcseAttachmentsResponse retrieveAttachments(RetrieveAcseAttachmentsRequest request) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAttachments");
		logger.info("RetrieveAcseCvRequest : " + request.toString());
		return acctServService.retrieveAttachments(request);
	}
	
	@PostMapping(path="saveAttachments")
	public @ResponseBody SaveAcseAttachmentsResponse saveAttachments(@RequestBody SaveAcseAttachmentsRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAttachments");
		logger.info("SaveAcseAttachmentsRequest : " + request.toString());
		return acctServService.saveAttachments(request);
	}
	
	@PostMapping(path="updateAcseCvStat")
	public @ResponseBody UpdateAcseCvStatResponse updateAcseCvStat(@RequestBody UpdateAcseCvStatRequest uacvsr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/updateAcseCvStat");
		logger.info("UpdateAcseCvStatRequest : " + uacvsr.toString());
		return acctServService.updateAcseCvStat(uacvsr);
	}
	
	@GetMapping(path="retrieveAcseCvPaytReqList")
	public @ResponseBody RetrieveAcseCvPaytReqListResponse retrieveAcseCvPaytReqList(RetrieveAcseCvPaytReqListRequest racprlr) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseCvPaytReqList");
		logger.info("RetrieveAcseCvPaytReqListRequest : " + racprlr.toString());
		return acctServService.retrieveAcseCvPaytReqList(racprlr);
	}
	
	@PostMapping(path="saveAcseCvPaytReqList")
	public @ResponseBody SaveAcseCvPaytReqListResponse saveAcseCvPaytReqList(@RequestBody SaveAcseCvPaytReqListRequest sacprr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcseCvPaytReqList");
		logger.info("SaveAcseCvPaytReqListRequest : " + sacprr.toString());
		return acctServService.saveAcseCvPaytReqList(sacprr);
	}
	
	@PostMapping(path="cancelOr")
	public @ResponseBody CancelOrResponse cancelOr(@RequestBody CancelOrRequest cor) throws SQLException {
		logger.info("POST: /api/acct-serv-service/cancelOr");
		logger.info("CancelOrRequest : " + cor.toString());
		return acctServService.cancelOr(cor);
	}
	
	@GetMapping(path="retrieveAcseOrServFee")
	public @ResponseBody RetrieveAcseOrServFeeResponse retrieveAcseOrServFee(RetrieveAcseOrServFeeRequest raosfr) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseOrServFee");
		logger.info("RetrieveAcseOrServFeeRequest : " + raosfr.toString());
		return acctServService.retrieveAcseOrServFee(raosfr);
	}
	
	@PostMapping(path="saveAcseOrServFee")
	public @ResponseBody SaveAcseOrServFeeResponse saveAcseOrServFee(@RequestBody SaveAcseOrServFeeRequest saosfr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcseOrServFee");
		logger.info("SaveAcseOrServFeeRequest : " + saosfr.toString());
		return acctServService.saveAcseOrServFee(saosfr);
	}
	
	@GetMapping(path="retrieveAcseBatchOr")
	public @ResponseBody RetrieveAcseBatchOrResponse retrieveAcseBatchOr(RetrieveAcseBatchOrRequest rabor) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseBatchOr");
		logger.info("RetrieveAcseOrServFeeRequest : " + rabor.toString());
		return acctServService.retrieveAcseBatchOr(rabor);
	}
	
	@GetMapping(path="retrieveAcseBudgetExpense")
	public @ResponseBody RetrieveAcseBudgetExpenseResponse retrieveAcseBudgetExpense(RetrieveAcseBudgetExpenseRequest raber) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseBudgetExpense");
		logger.info("RetrieveAcseBudgetExpenseRequest : " + raber.toString());
		return acctServService.retrieveAcseBudgetExpense(raber);
	}
	
	@PostMapping(path="saveAcseBudgetExpense")
	public @ResponseBody SaveAcseBudgetExpenseResponse saveAcseBudgetExpense(@RequestBody SaveAcseBudgetExpenseRequest sacprr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcseBudgetExpense");
		logger.info("SaveAcseBudgetExpenseRequest : " + sacprr.toString());
		return acctServService.saveAcseBudgetExpense(sacprr);
	}
	
	@GetMapping(path="retrieveAcseBudExpMonthly")
	public @ResponseBody RetrieveAcseBudExpMonthlyResponse retrieveAcseBudExpMonthly(RetrieveAcseBudExpMonthlyRequest rabemr) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseBudExpMonthly");
		logger.info("RetrieveAcseBudExpMonthlyRequest : " + rabemr.toString());
		return acctServService.retrieveAcseBudExpMonthly(rabemr);
	}
	
	@PostMapping(path="saveAcseBudExpMonthly")
	public @ResponseBody SaveAcseBudExpMonthlyResponse saveAcseBudExpMonthly(@RequestBody SaveAcseBudExpMonthlyRequest sabemr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcseBudExpMonthly");
		logger.info("SaveAcseBudExpMonthlyRequest : " + sabemr.toString());
		return acctServService.saveAcseBudExpMonthly(sabemr);
	}
	
	@GetMapping(path="retrieveAcseActExpMonthly")
	public @ResponseBody RetrieveAcseBudExpMonthlyResponse retrieveAcseActExpMonthly(RetrieveAcseBudExpMonthlyRequest rabemr) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseActExpMonthly");
		logger.info("RetrieveAcseBudExpMonthlyRequest : " + rabemr.toString());
		return acctServService.retrieveAcseActExpMonthly(rabemr);
	}
	
	@PostMapping(path="printOr")
	public @ResponseBody PrintOrResponse printOr(@RequestBody PrintOrRequest por) throws SQLException {
		logger.info("POST: /api/acct-serv-service/printOr");
		logger.info("PrintOrRequest : " + por.toString());
		return acctServService.printOr(por);
	}
	
	@PostMapping(path="printOrBatch")
	public @ResponseBody PrintOrBatchResponse printOrBatch(@RequestBody PrintOrBatchRequest pobr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/printOrBatch");
		logger.info("PrintOrBatchRequest : " + pobr.toString());
		return acctServService.printOrBatch(pobr);
	}
	
	@GetMapping(path="retrieveAcseChangeToNewOR")
	public @ResponseBody RetrieveAcseChangeToNewORResponse retrieveAcseChangeToNewOR(RetrieveAcseChangeToNewORRequest rabemr) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseChangeToNew");
		logger.info("RetrieveAcseChangeToNewORRequest : " + rabemr.toString());
		return acctServService.retrieveAcseChangeToNewOR(rabemr);
	}
	
	@PostMapping(path="updateAcseChangeStat")
	public @ResponseBody UpdateAcseStatusResponse updateAcseChangeStat(@RequestBody UpdateAcseStatusRequest pobr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/updateAcseChangeStat");
		logger.info("UpdateAcseStatusRequest : " + pobr.toString());
		return acctServService.updateAcseChangeStat(pobr);
	}
	
	@GetMapping(path="retrieveAcseChangeToNewCV")
	public @ResponseBody RetrieveAcseChangeToNewCVResponse retrieveAcseChangeToNewCV(RetrieveAcseChangeToNewCVRequest rabemr) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseChangeToNewCV");
		logger.info("RetrieveAcseChangeToNewCVRequest : " + rabemr.toString());
		return acctServService.retrieveAcseChangeToNewCV(rabemr);
	}
	
	@GetMapping(path="retrieveAcseChangeToNewJV")
	public @ResponseBody RetrieveAcseChangeToNewJVResponse retrieveAcseChangeToNewJV(RetrieveAcseChangeToNewJVRequest rabemr) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseChangeToNewJV");
		logger.info("RetrieveAcseChangeToNewJVRequest : " + rabemr.toString());
		return acctServService.retrieveAcseChangeToNewJV(rabemr);
	}
	
	@GetMapping(path="retrieveAcseCancelledTran")
	public @ResponseBody RetrieveAcseCancelTransactionResponse retrieveAcseCancelledTran(RetrieveAcseCancelTransactionRequest rabemr) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseCancelledTran");
		logger.info("RetrieveAcseChangeToNewJVRequest : " + rabemr.toString());
		return acctServService.retrieveAcseCancelledTran(rabemr);
	}
	
	@GetMapping(path="retrieveAcseBatchInvoice")
	public @ResponseBody RetrieveAcseBatchInvoiceResponse retrieveAcseBatchInvoice(RetrieveAcseBatchInvoiceRequest request) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseBatchInvoice");
		logger.info("RetrieveAcseBatchInvoiceRequest : " + request.toString());
		return acctServService.retrieveAcseBatchInvoice(request);
	}
	
	@PostMapping(path="saveAcseInvoice")
	public @ResponseBody SaveAcseInvoiceResponse saveAcseInvoice(@RequestBody SaveAcseInvoiceRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcseInvoice");
		logger.info("SaveAcseInvoiceRequest : " + request.toString());
		return acctServService.saveAcseInvoice(request);
	}
	
	@PostMapping(path="printAcseJv")
	public @ResponseBody PrintAcseJvResponse printAcseJv(@RequestBody PrintAcseJvRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/printAcseJv");
		logger.info("PrintAcseJvRequest : " + request.toString());
		return acctServService.printAcseJv(request);
	}
	
	@PostMapping(path="generateBatchInvoiceNo")
	public @ResponseBody GenerateBatchInvoiceNoResponse generateBatchInvoiceNo(@RequestBody GenerateBatchInvoiceNoRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/generateBatchInvoiceNo");
		logger.info("GenerateBatchInvoiceNoRequest : " + request.toString());
		return acctServService.generateBatchInvoiceNo(request);
				
	}
	
	@GetMapping(path="retrieveAcseInvoiceItems")
	public @ResponseBody RetrieveAcseInvoiceItemsResponse retrieveAcseInvoiceItem(RetrieveAcseInvoiceItemsRequest request) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseInvoiceItems");
		logger.info("RetrieveAcseInvoiceItemsRequest : " + request.toString());
		return acctServService.retrieveAcseInvoiceItems(request);
	}
	
	@PostMapping(path="saveAcseInvoiceItem")
	public @ResponseBody SaveAcseInvoiceItemResponse saveAcseInvoiceItem(@RequestBody SaveAcseInvoiceItemRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcseInvoiceItem");
		logger.info("SaveAcseInvoiceItemRequest : " + request.toString());
		return acctServService.saveAcseInvoiceItem(request);
	}

	@PostMapping(path="copyAcseExpenseBudget")
	public @ResponseBody CopyAcseExpenseBudgetResponse copyAcseExpenseBudget(@RequestBody CopyAcseExpenseBudgetRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/copyAcseExpenseBudget");
		logger.info("CopyAcseExpenseBudgetRequest : " + request.toString());
		return acctServService.copyAcseExpenseBudget(request);
	}
	
	@GetMapping(path="retrieveAcsePerDiem")
	public @ResponseBody RetrieveAcsePerDiemResponse retrieveAcsePerDiem(RetrieveAcsePerDiemRequest rapdr) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcsePerDiem");
		logger.info("RetrieveAcsePerDiemRequest : " + rapdr.toString());
		return acctServService.retrieveAcsePerDiem(rapdr);
	}

	@PostMapping(path="saveAcsePerDiem")
	public @ResponseBody SaveAcsePerDiemResponse saveAcsePerDiem(@RequestBody SaveAcsePerDiemRequest sapdr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcsePerDiem");
		logger.info("SaveAcsePerDiemRequest : " + sapdr.toString());
		return acctServService.saveAcsePerDiem(sapdr);
	}
	
	@PostMapping(path="generateBatchOrNo")
	public @ResponseBody GenerateBatchOrNoResponse generateBatchOrNo(@RequestBody GenerateBatchOrNoRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/generateBatchOrNo");
		logger.info("GenerateBatchOrNoRequest : " + request.toString());
		return acctServService.generateBatchOrNo(request);
	}
	
	@GetMapping(path="retrieveAcseDcbCollection")
	public @ResponseBody RetrieveAcseDcbCollectionResponse retrieveAcitDcbCollection(RetrieveAcseDcbCollectionRequest raoqp) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcitDcbCollection");
		logger.info("RetrieveAcseDcbCollectionRequest : " + raoqp.toString());
		return acctServService.retrieveAcitDcbCollection(raoqp);
	}
	
	@GetMapping(path="retrieveAcseBankDetails")
	public @ResponseBody RetrieveAcseDcbBankDetailsResponse retrieveAcitBankDetails(RetrieveAcseDcbBankDetailsRequest raoqp) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcseBankDetails");
		logger.info("RetrieveAcitDcbBankDetailsRequest : " + raoqp.toString());
		return acctServService.retrieveAcitBankDetails(raoqp);
	}

	@GetMapping(path="retrieveAcseInsuranceExp")
	public @ResponseBody RetrieveAcseInsuranceExpResponse retrieveAcseInsuranceExp(RetrieveAcseInsuranceExpRequest raier) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseInsuranceExp");
		logger.info("RetrieveAcseInsuranceExpRequest : " + raier.toString());
		return acctServService.retrieveAcseInsuranceExp(raier);
	}

	@PostMapping(path="saveAcseInsuranceExp")
	public @ResponseBody SaveAcseInsuranceExpResponse saveAcseInsuranceExp(@RequestBody SaveAcseInsuranceExpRequest saier) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcseInsuranceExp");
		logger.info("SaveAcseInsuranceExpRequest : " + saier.toString());
		return acctServService.saveAcseInsuranceExp(saier);
	}
	
	@PostMapping(path="printInvoiceBatch")
	public @ResponseBody PrintInvoiceBatchResponse printInvoiceBatch(@RequestBody PrintInvoiceBatchRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/printInvoiceBatch");
		logger.info("PrintInvoiceBatchRequest : " + request.toString());
		return acctServService.printInvoiceBatch(request);
	}
	
	@GetMapping(path="retrieveAcseEditedAcctEntries")
	public @ResponseBody RetrieveAcseEditedAcctEntriesResponse retrieveAcseEditedAcctEntries(RetrieveAcseEditedAcctEntriesRequest raeaer) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseEditedAcctEntries");
		logger.info("RetrieveAcseEditedAcctEntriesRequest : " + raeaer.toString());
		return acctServService.retrieveAcseEditedAcctEntries(raeaer);
	}
	
	@PostMapping(path="editAcctEntServ")
	public @ResponseBody EditServiceAccountingEntriesResponse editAcctEntServ(@RequestBody EditServiceAccountingEntriesRequest esaer) throws SQLException {
		logger.info("POST: /api/acct-serv-service/editAcctEntServ");
		logger.info("EditServiceAccountingEntriesRequest : " + esaer.toString());
		return acctServService.editAcctEnt(esaer);
	}
	
	@PostMapping(path="restoreAcctEntServ")
	public @ResponseBody RestoreServiceAccountingEntriesResponse restoreAcctEntServ(@RequestBody RestoreServiceAccountingEntriesRequest rsaer) throws SQLException {
		logger.info("POST: /api/acct-serv-service/restoreAcctEntServ");
		logger.info("RestoreInTrustAccountingEntriesRequest : " + rsaer.toString());
		return acctServService.restoreAcctEnt(rsaer);
	}
	
	@GetMapping(path="retrieveAcctEntInqServ")
	public @ResponseBody RetrieveAcseAcctEntInqResponse retrieveAcctEntInqServ(RetrieveAcseAcctEntInqRequest raaeir) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcctEntInqServ");
		logger.info("RetrieveAcseAcctEntInqRequest : " + raaeir.toString());
		return acctServService.retrieveAcseAcctEntInq(raaeir)	;
	}
	
	@GetMapping(path="retrieveAcctEntBackupServ")
	public @ResponseBody RetrieveAcseAcctEntBackupResponse retrieveAcctEntBackupServ(RetrieveAcseAcctEntBackupRequest raaebr) throws SQLException {
		logger.info("GET: /api/acct-in-trust-service/retrieveAcctEntBackupServ");
		logger.info("RetrieveAcseAcctEntBackupRequest : " + raaebr.toString());
		return acctServService.retrieveAcseAcctEntBackup(raaebr);
	}
	
	@PostMapping(path="saveAcseCloseOpenDcb")
	public @ResponseBody SaveAcseCloseOpenDcbResponse saveAcseCloseOpenDcb(@RequestBody SaveAcseCloseOpenDcbRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcseCloseOpenDcb");
		logger.info("SaveAcseCloseOpenDcbRequest : " + request.toString());
		return acctServService.saveAcseCloseOpenDcb(request);
	}
	
	@PostMapping(path="saveDcbCollection")
	public @ResponseBody SaveAcseDcbCollectionResponse saveDcbCollection(@RequestBody SaveAcseDcbCollectionRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveDcbCollection");
		logger.info("SaveAcseDcbCollectionRequest : " + request.toString());
		return acctServService.saveDcbCollection(request);
	}
	
    @PostMapping(path="updateAcseStat")
    public @ResponseBody UpdateAcseStatResponse updateAcseStatus(@RequestBody UpdateAcseStatRequest uasr) throws SQLException {
        logger.info("GET: /api/acct-serv-service/UpdateAcseStatRequest");
        logger.info("UpdateAcseStatRequest : " + uasr.toString());
        return acctServService.updateAcseStat(uasr);
    }
    
    @PostMapping(path="saveAcseMonthEndTrialBal")
	public @ResponseBody SaveAcitMonthEndTrialBalResponse saveAcseMonthEndTrialBal(@RequestBody SaveAcitMonthEndTrialBalRequest sametbr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcseMonthEndTrialBal");
		logger.info("SaveAcitMonthEndTrialBalRequest : " + sametbr.toString());
		return acctServService.saveAcseMonthEndTrialBal(sametbr);
	}
    
    @GetMapping(path="retrieveAcseMonthEndTrialBal")
	public @ResponseBody RetrieveAcitMonthEndTrialBalResponse retrieveAcseMonthEndTrialBal(RetrieveAcitMonthEndTrialBalRequest rametbr) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseMonthEndTrialBal");
		logger.info("RetrieveAcitMonthEndTrialBalRequest : " + rametbr.toString());
		return acctServService.retrieveAcseMonthEndTrialBal(rametbr);
	}
    
    @GetMapping(path="retrieveAcseMonthEndUnpostedMonths")
	public @ResponseBody RetrieveAcitMonthEndUnpostedMonthsResponse retrieveAcseMonthEndUnpostedMonths() throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseMonthEndUnpostedMonths");
		return acctServService.retrieveAcseMonthEndUnpostedMonths();
	}
    
    @PostMapping(path="postAcseMonthEndTrialBal")
	public @ResponseBody PostAcitMonthEndTrialBalResponse postAcseMonthEndTrialBal(@RequestBody PostAcitMonthEndTrialBalRequest pametbr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/postAcseMonthEndTrialBal");
		logger.info("PostAcitMonthEndTrialBalRequest : " + pametbr.toString());
		return acctServService.postAcseMonthEndTrialBal(pametbr);
	}
    
    @PostMapping(path="saveAcseMonthEndTBTempClose")
	public @ResponseBody SaveAcitMonthEndTBTempCloseResponse saveAcseMonthEndTBTempClose(@RequestBody SaveAcitMonthEndTBTempCloseRequest sametcr) throws SQLException {
		logger.info("POST: /api/acct-serv-service/saveAcseMonthEndTBTempClose");
		logger.info("SaveAcitMonthEndTBTempCloseRequest : " + sametcr.toString());
		return acctServService.saveAcseMonthEndTBTempClose(sametcr);
	}
    
    @PostMapping(path="saveAcseMonthEndTBReopen")
	public @ResponseBody SaveAcitMonthEndTBReopenResponse saveAcseMonthEndTBReopen(@RequestBody SaveAcitMonthEndTBReopenRequest sametrr) throws SQLException {
		logger.info("POST: /api/acct-in-trust-service/saveAcseMonthEndTBReopen");
		logger.info("SaveAcitMonthEndTBReopenRequest : " + sametrr.toString());
		return acctServService.saveAcseMonthEndTBReopen(sametrr);
	}
    
    @GetMapping(path="retrieveOrSFeeDtlDist")
	public @ResponseBody RetrieveOrSFeeDtlDistResponse retrieveOrSFeeDtlDist(RetrieveOrSFeeDtlDistRequest rosfddr) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveOrSFeeDtlDist");
		logger.info("RetrieveOrSFeeDtlDistRequest : " + rosfddr.toString());
		return acctServService.retrieveOrSFeeDtlDist(rosfddr);
	}
    
    @PostMapping(path="extractAcseExpenseBudget")
	public @ResponseBody ExtractAcseExpenseBudgetResponse extractAcseExpenseBudget(@RequestBody ExtractAcseExpenseBudgetRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/extractAcseExpenseBudget");
		logger.info("ExtractAcseExpenseBudgetRequest : " + request.toString());
		return acctServService.extractAcseExpenseBudget(request);
	}
    
    @GetMapping(path="retrieveAcseRefNoLOV")
	public @ResponseBody RetrieveAcseRefNoLOVResponse retrieveAcseRefNoLOV(RetrieveAcseRefNoLOVRequest rarflr) throws SQLException {
		logger.info("GET: /api/acct-serv-service/retrieveAcseRefNoLOV");
		logger.info("RetrieveAcseRefNoLOVRequest : " + rarflr.toString());
		return acctServService.retrieveAcseRefNoLOV(rarflr);
	}
    
}
