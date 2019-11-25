package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.ApproveJVServiceRequest;
import ph.cpi.rest.api.model.request.CancelJVServiceRequest;
import ph.cpi.rest.api.model.request.CancelOrRequest;
import ph.cpi.rest.api.model.request.CopyAcseExpenseBudgetRequest;
import ph.cpi.rest.api.model.request.GenerateBatchInvoiceNoRequest;
import ph.cpi.rest.api.model.request.PrintAcseJvRequest;
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
import ph.cpi.rest.api.model.response.PrintAcseJvResponse;
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

@Service
public interface AccountingServService {
	public RetrieveAcseOrListResponse retrieveAcseOrList(RetrieveAcseOrListRequest raolr) throws SQLException;
	public RetrieveAcseOrEntryResponse retrieveAcseOrEntry(RetrieveAcseOrEntryRequest raoer) throws SQLException;
	public RetrieveAcsePaytReqResponse retrieveAcsePaytReq(RetrieveAcsePaytReqRequest racprlp ) throws SQLException;
	public SaveAcseOrTransResponse saveOrEntry(SaveAcseOrTransRequest soetr) throws SQLException;
	public RetrieveAcseJVListResponse retrieveJVList(RetrieveAcseJVListRequest request) throws SQLException;
	public SaveAcsePaytReqResponse saveAcsePaytReq(SaveAcsePaytReqRequest saprr) throws SQLException;
	public RetrieveAcseJVEntryResponse retrieveJVEntry(RetrieveAcseJVEntryRequest request) throws SQLException;
	public SaveAcseJVEntryResponse saveJVEntry(SaveAcseJVEntryRequest request)throws SQLException;
	public ApproveJVServiceResponse approveJV(ApproveJVServiceRequest request)throws SQLException;
	public CancelJVServiceResponse cancelJV(CancelJVServiceRequest request)throws SQLException;
	public UpdateAcsePaytReqStatResponse updateAcsePaytReqStat(UpdateAcsePaytReqStatRequest uaprsr) throws SQLException;
	public RetrieveAcseTaxDetailsResponse retrieveTaxDetails(RetrieveAcseTaxDetailsRequest request) throws SQLException;
	public RetrieveAcseOrTransDtlResponse retrieveAcseOrTransDtl(RetrieveAcseOrTransDtlRequest raotdr) throws SQLException;
	public SaveAcseOrTransDtlResponse saveAcseOrTransDtl(SaveAcseOrTransDtlRequest saotdr) throws SQLException;
	public SaveAcseTaxDetailsResponse saveTaxDetails(SaveAcseTaxDetailsRequest request) throws SQLException;
	public RetrieveAcsePrqTransResponse retrieveAcsePrqTrans(RetrieveAcsePrqTransRequest raptp ) throws SQLException;
	public SaveAcsePrqTransResponse saveAcsePrqTrans(SaveAcsePrqTransRequest saptr) throws SQLException;
	public RetrieveAcseAcctEntriesResponse retrieveAcctEntries(RetrieveAcseAcctEntriesRequest request) throws SQLException;
	public RetrieveAcseCvResponse retrieveAcseCv(RetrieveAcseCvRequest raptp ) throws SQLException;
	public SaveAcseCvResponse saveAcseCv(SaveAcseCvRequest sacr) throws SQLException;
	public SaveAcseAcctEntriesResponse saveAcctEntries(SaveAcseAcctEntriesRequest request) throws SQLException;
	public RetrieveAcseAttachmentsResponse retrieveAttachments(RetrieveAcseAttachmentsRequest request) throws SQLException;
	public SaveAcseAttachmentsResponse saveAttachments(SaveAcseAttachmentsRequest request)throws SQLException;
	public UpdateAcseCvStatResponse updateAcseCvStat(UpdateAcseCvStatRequest uaprsr) throws SQLException;
	public RetrieveAcseCvPaytReqListResponse retrieveAcseCvPaytReqList(RetrieveAcseCvPaytReqListRequest racprlp ) throws SQLException;
	public SaveAcseCvPaytReqListResponse saveAcseCvPaytReqList(SaveAcseCvPaytReqListRequest sacprr) throws SQLException;
	public CancelOrResponse cancelOr(CancelOrRequest cor) throws SQLException;
	public RetrieveAcseOrServFeeResponse retrieveAcseOrServFee(RetrieveAcseOrServFeeRequest raosfr) throws SQLException;
	public SaveAcseOrServFeeResponse saveAcseOrServFee(SaveAcseOrServFeeRequest saosfr) throws SQLException;
	public RetrieveAcseBatchOrResponse retrieveAcseBatchOr(RetrieveAcseBatchOrRequest rabor) throws SQLException;
	public RetrieveAcseBudgetExpenseResponse retrieveAcseBudgetExpense(RetrieveAcseBudgetExpenseRequest rabep ) throws SQLException;
	public SaveAcseBudgetExpenseResponse saveAcseBudgetExpense(SaveAcseBudgetExpenseRequest sacprr) throws SQLException;
	public RetrieveAcseBudExpMonthlyResponse retrieveAcseBudExpMonthly(RetrieveAcseBudExpMonthlyRequest rabemr) throws SQLException;
	public SaveAcseBudExpMonthlyResponse saveAcseBudExpMonthly(SaveAcseBudExpMonthlyRequest sabemr) throws SQLException;
	public RetrieveAcseBudExpMonthlyResponse retrieveAcseActExpMonthly(RetrieveAcseBudExpMonthlyRequest rabemr) throws SQLException;
	public PrintOrResponse printOr(PrintOrRequest por) throws SQLException;
	public PrintOrBatchResponse printOrBatch(PrintOrBatchRequest pobr) throws SQLException;
	public RetrieveAcseChangeToNewORResponse retrieveAcseChangeToNewOR (RetrieveAcseChangeToNewORRequest request) throws SQLException;
	public UpdateAcseStatusResponse updateAcseChangeStat(UpdateAcseStatusRequest request) throws SQLException;
	public RetrieveAcseChangeToNewCVResponse retrieveAcseChangeToNewCV (RetrieveAcseChangeToNewCVRequest request) throws SQLException;
	public RetrieveAcseChangeToNewJVResponse retrieveAcseChangeToNewJV (RetrieveAcseChangeToNewJVRequest request) throws SQLException;
	public RetrieveAcseCancelTransactionResponse retrieveAcseCancelledTran (RetrieveAcseCancelTransactionRequest request) throws SQLException;
	public RetrieveAcseBatchInvoiceResponse retrieveAcseBatchInvoice (RetrieveAcseBatchInvoiceRequest request) throws SQLException;
	public SaveAcseInvoiceResponse saveAcseInvoice(SaveAcseInvoiceRequest request)throws SQLException;
	public PrintAcseJvResponse printAcseJv (PrintAcseJvRequest request) throws SQLException;
	public GenerateBatchInvoiceNoResponse generateBatchInvoiceNo (GenerateBatchInvoiceNoRequest request) throws SQLException;
	public RetrieveAcseInvoiceItemsResponse retrieveAcseInvoiceItems (RetrieveAcseInvoiceItemsRequest request) throws SQLException;
	public SaveAcseInvoiceItemResponse saveAcseInvoiceItem(SaveAcseInvoiceItemRequest request)throws SQLException;
	public CopyAcseExpenseBudgetResponse copyAcseExpenseBudget (CopyAcseExpenseBudgetRequest request) throws SQLException;
	
}
