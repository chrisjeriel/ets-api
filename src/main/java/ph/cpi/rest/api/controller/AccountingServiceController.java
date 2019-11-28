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
import ph.cpi.rest.api.model.request.GenerateBatchInvoiceNoRequest;
import ph.cpi.rest.api.model.request.GenerateBatchOrNoRequest;
import ph.cpi.rest.api.model.request.PrintAcseJvRequest;
import ph.cpi.rest.api.model.request.PrintInvoiceBatchRequest;
import ph.cpi.rest.api.model.request.PrintOrBatchRequest;
import ph.cpi.rest.api.model.request.PrintOrRequest;
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
import ph.cpi.rest.api.model.request.RetrieveAcseInvoiceItemsRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseJVEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseJVListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseOrEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseOrListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseOrServFeeRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseOrTransDtlRequest;
import ph.cpi.rest.api.model.request.RetrieveAcsePaytReqRequest;
import ph.cpi.rest.api.model.request.RetrieveAcsePrqTransRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseTaxDetailsRequest;
import ph.cpi.rest.api.model.request.SaveAcseAcctEntriesRequest;
import ph.cpi.rest.api.model.request.SaveAcseAttachmentsRequest;
import ph.cpi.rest.api.model.request.SaveAcseBudExpMonthlyRequest;
import ph.cpi.rest.api.model.request.SaveAcseBudgetExpenseRequest;
import ph.cpi.rest.api.model.request.SaveAcseCvPaytReqListRequest;
import ph.cpi.rest.api.model.request.SaveAcseCvRequest;
import ph.cpi.rest.api.model.request.SaveAcseInvoiceItemRequest;
import ph.cpi.rest.api.model.request.SaveAcseInvoiceRequest;
import ph.cpi.rest.api.model.request.SaveAcseJVEntryRequest;
import ph.cpi.rest.api.model.request.SaveAcseOrServFeeRequest;
import ph.cpi.rest.api.model.request.SaveAcseOrTransDtlRequest;
import ph.cpi.rest.api.model.request.SaveAcseOrTransRequest;
import ph.cpi.rest.api.model.request.SaveAcsePaytReqRequest;
import ph.cpi.rest.api.model.request.SaveAcsePrqTransRequest;
import ph.cpi.rest.api.model.request.SaveAcseTaxDetailsRequest;
import ph.cpi.rest.api.model.request.UpdateAcseCvStatRequest;
import ph.cpi.rest.api.model.request.UpdateAcsePaytReqStatRequest;
import ph.cpi.rest.api.model.request.UpdateAcseStatusRequest;
import ph.cpi.rest.api.model.response.ApproveJVServiceResponse;
import ph.cpi.rest.api.model.response.CancelJVServiceResponse;
import ph.cpi.rest.api.model.response.CancelOrResponse;
import ph.cpi.rest.api.model.response.CopyAcseExpenseBudgetResponse;
import ph.cpi.rest.api.model.response.GenerateBatchInvoiceNoResponse;
import ph.cpi.rest.api.model.response.GenerateBatchOrNoResponse;
import ph.cpi.rest.api.model.response.PrintAcseJvResponse;
import ph.cpi.rest.api.model.response.PrintInvoiceBatchResponse;
import ph.cpi.rest.api.model.response.PrintOrBatchResponse;
import ph.cpi.rest.api.model.response.PrintOrResponse;
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
import ph.cpi.rest.api.model.response.RetrieveAcseInvoiceItemsResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseJVEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseJVListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseOrEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseOrListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseOrServFeeResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseOrTransDtlResponse;
import ph.cpi.rest.api.model.response.RetrieveAcsePaytReqResponse;
import ph.cpi.rest.api.model.response.RetrieveAcsePrqTransResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseTaxDetailsResponse;
import ph.cpi.rest.api.model.response.SaveAcseAcctEntriesResponse;
import ph.cpi.rest.api.model.response.SaveAcseAttachmentsResponse;
import ph.cpi.rest.api.model.response.SaveAcseBudExpMonthlyResponse;
import ph.cpi.rest.api.model.response.SaveAcseBudgetExpenseResponse;
import ph.cpi.rest.api.model.response.SaveAcseCvPaytReqListResponse;
import ph.cpi.rest.api.model.response.SaveAcseCvResponse;
import ph.cpi.rest.api.model.response.SaveAcseInvoiceItemResponse;
import ph.cpi.rest.api.model.response.SaveAcseInvoiceResponse;
import ph.cpi.rest.api.model.response.SaveAcseJVEntryResponse;
import ph.cpi.rest.api.model.response.SaveAcseOrServFeeResponse;
import ph.cpi.rest.api.model.response.SaveAcseOrTransDtlResponse;
import ph.cpi.rest.api.model.response.SaveAcseOrTransResponse;
import ph.cpi.rest.api.model.response.SaveAcsePaytReqResponse;
import ph.cpi.rest.api.model.response.SaveAcsePrqTransResponse;
import ph.cpi.rest.api.model.response.SaveAcseTaxDetailsResponse;
import ph.cpi.rest.api.model.response.UpdateAcseCvStatResponse;
import ph.cpi.rest.api.model.response.UpdateAcsePaytReqStatResponse;
import ph.cpi.rest.api.model.response.UpdateAcseStatusResponse;
import ph.cpi.rest.api.service.AccountingServService;

@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", 
						"http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080", "http://192.10.10.230:4200", 
						"http://192.10.10.230:8888", "http://192.10.10.149:4200", "http://192.10.10.149:8888", "http://192.168.99.200:4200", "http://192.168.99.200:8888",
						"http://192.168.99.201:8888", "http://192.168.99.201:4200", "http://192.168.99.202:8888", "http://192.168.99.202:4200", "http://192.10.10.210:8889", "http://192.10.10.210:4201"})
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
	
	@PostMapping(path="generateBatchOrNo")
	public @ResponseBody GenerateBatchOrNoResponse generateBatchOrNo(@RequestBody GenerateBatchOrNoRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/generateBatchOrNo");
		logger.info("GenerateBatchOrNoRequest : " + request.toString());
		return acctServService.generateBatchOrNo(request);
				
	}
	
	@PostMapping(path="printInvoiceBatch")
	public @ResponseBody PrintInvoiceBatchResponse printInvoiceBatch(@RequestBody PrintInvoiceBatchRequest request) throws SQLException {
		logger.info("POST: /api/acct-serv-service/printInvoiceBatch");
		logger.info("PrintInvoiceBatchRequest : " + request.toString());
		return acctServService.printInvoiceBatch(request);
	}
}
