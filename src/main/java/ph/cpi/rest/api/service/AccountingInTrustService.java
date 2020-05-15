package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.*;
import ph.cpi.rest.api.model.response.*;

@Service
public interface AccountingInTrustService {
	public RetrieveAcitCvPaytReqListResponse retrieveAcitCvPaytReqList(RetrieveAcitCvPaytReqListRequest racprlp ) throws SQLException;
	public RetrieveAcitPaytReqResponse retrieveAcitPaytReq(RetrieveAcitPaytReqRequest racprlp ) throws SQLException;
	public SaveAcitPaytReqResponse saveAcitPaytReq(SaveAcitPaytReqRequest saprr) throws SQLException;
//	public RetrieveAcitProfCommSummResponse retrieveAcitProfCommSumm(RetrieveAcitProfCommSummRequest rapcsr ) throws SQLException;
//	public RetrieveAcitProfCommDtlResponse retrieveAcitProfCommDtl(RetrieveAcitProfCommDtlRequest rapcdr ) throws SQLException;
	public RetrieveAcitInvestmentsListResponse retrieveAcitInvestmentList(RetrieveAcitInvestmentsListRequest railr ) throws SQLException;
	public SaveAcitInvestmentsResponse saveAcitInvestments(SaveAcitInvestmentsRequest rair ) throws SQLException;
	public RetrieveAcitCMDMListResponse retrieveAcitCMDMList(RetrieveAcitCMDMListRequest racitcmdmlr) throws SQLException;
	public SaveAcitCMDMResponse saveAcitCMDM(SaveAcitCMDMRequest saprr) throws SQLException;
	public RetrieveAcitRefNoLOVResponse retrieveAcitRefNoLOV(RetrieveAcitRefNoLOVRequest racitcmdmlr) throws SQLException;
	public RetrieveAcitArListResponse retrieveArList(RetrieveAcitArListRequest raalr) throws SQLException;
	public RetrieveAcitArEntryResponse retrieveArEntry(RetrieveAcitArEntryRequest raaer) throws SQLException;
	public RetrieveAcitJVListingResponse retrieveAcitJvListing(RetrieveAcitJVListingRequest rajl ) throws SQLException;
	public RetrieveAcitJVEntryResponse retrieveAcitJvEntry(RetrieveAcitJVEntryRequest raje ) throws SQLException;
	public SaveAcitJVEntryResponse saveAcitJVEntry(SaveAcitJVEntryRequest raje) throws SQLException;
	public RetrieveAcitSOAAgingResponse retrieveAcitSOAAging(RetrieveAcitSOAAgingDetailsRequest rasd) throws SQLException;
	public RetrieveAcitJVInwPolBalResponse retrieveAcitJvAdjstInwPolBal(RetrieveAcitJVInPolBalRequest rajipb) throws SQLException;
	public SaveAcitArTransResponse saveAcitArTrans(SaveAcitArTransRequest saatr) throws SQLException;
	public UpdateAcitPaytReqStatResponse updateAcitPaytReqStat(UpdateAcitPaytReqStatRequest uaprsr) throws SQLException;
	public RetrieveAcitPrqTransResponse retrieveAcitPrqTrans(RetrieveAcitPrqTransRequest raptp ) throws SQLException;
	public RetrieveAcitJVIntOverdAcctMSResponse retrieveAcitJVIntOverdue (RetrieveAcitJVIntOverdAcctMSRequest rajvo) throws SQLException;
	public SaveAcitJVAdjInwPolBalResponse saveAcitJvInwPolBal (SaveAcitJVAdjInwPolBalRequest request)throws SQLException;
	public SaveAcitJVIntOverdAcctMSResponse saveAcitJvOverdueAccts (SaveAcitJVIntOverdAcctMSRequest request)throws SQLException;
	public RetrieveAcitJVPremResRelResponse retrieveAcitJVPremresRel (RetrieveAcitJVPremResRelRequest request)throws SQLException;
	public SaveAcitPrqTransResponse saveAcitPrqTrans(SaveAcitPrqTransRequest saptr) throws SQLException;
	public CancelCMDMCMDMResponse cancelCMDMCMDM(CancelCMDMCMDMRequest saprr) throws SQLException;
	public PrintCMDMResponse printCMDM(PrintCMDMRequest saprr) throws SQLException;
	public RetrieveAcitAcctEntriesResponse retrieveAcitAcctEntries(RetrieveAcitAcctEntriesRequest racitcmdmlr) throws SQLException;
	public RetrieveQSOAListResponse retrieveQSOAList(RetrieveQSOAListRequest rqlr) throws SQLException;
	public SaveAcitAcctEntriesResponse saveAcitAcctEntries(SaveAcitAcctEntriesRequest saprr) throws SQLException;
	public SaveAcitJVPremResRelResponse saveAcitJVPremResRel(SaveAcitJVPremResRelRequest request) throws SQLException;
	public CancelJournalVoucherResponse cancelJV (CancelJournalVoucherRequest request) throws SQLException;
	public PrintJVResponse printJV (PrintJVRequest request) throws SQLException;
	public RetrieveAcitProfCommSummResponse retrieveAcitProfCommSumm(RetrieveAcitProfCommSummRequest rapcsr ) throws SQLException;
	public RetrieveAcitProfCommDtlResponse retrieveAcitProfCommDtl(RetrieveAcitProfCommDtlRequest rapcdr ) throws SQLException;
	public CancelArResponse cancelAr(CancelArRequest car) throws SQLException;
	public RetrieveAcitAgingSoaDtlResponse retrieveAgingSoaDtl(RetrieveAcitAgingSoaDtlRequest raasdr) throws SQLException;
	public SaveAcitArInwPolBalResponse saveArInwPolBal(SaveAcitArInwPolBalRequest saipbr) throws SQLException;
	public RetrieveAcitArInwPolBalResponse retrieveArInwPolBal(RetrieveAcitArInwPolBalRequest raaipbr) throws SQLException;
	public RetrieveAcitArTransDtlResponse retrieveARTransDtl(RetrieveAcitArTransDtlRequest raatdr) throws SQLException;
	public SaveAcitArTransDtlResponse saveAcitArTransDtl(SaveAcitArTransDtlRequest saatdr) throws SQLException;
	public RetrieveAcitPrqInwPolResponse retrieveAcitPrqInwPol(RetrieveAcitPrqInwPolRequest rapipp ) throws SQLException;
	public SaveAcitPrqInwPolResponse saveAcitPrqInwPol(SaveAcitPrqInwPolRequest sapipp) throws SQLException;
	public RetrieveAcctPrqServFeeResponse retrieveAcctPrqServFee(RetrieveAcctPrqServFeeRequest rasfr) throws SQLException;
	public RetrieveAcitArClmRecoverResponse retrieveAcitArClmRecover(RetrieveAcitArClmRecoverRequest raacrr) throws SQLException;
	public RetrieveAcitArClmRecoverLovResponse retrieveAcitArClmRecoverLov(RetrieveAcitArClmRecoverLovRequest raacrlr) throws SQLException;
	public SaveAcitArClmCashCallResponse saveAcitArClmCashCall(SaveAcitArClmCashCallRequest saacrr) throws SQLException;
	public RetrieveAcitArInvPulloutResponse retrieveAcitArInvArPullout(RetrieveAcitArInvPulloutRequest raaipr) throws SQLException;
	public RetrieveAcitJVAppPaytZeroResponse retrieveAcitJVAppPaytZeroBal(RetrieveAcitJVAppPaytZeroRequest request) throws SQLException;
	public SaveAcitJVAppPaytZeroResponse saveAcitJVAppPaytZeroBal(SaveAcitJVAppPaytZeroRequest request)throws SQLException;
	public RetrieveAcitSOATreatyDetailsResponse retrieveAcitSOATrtyDetails(RetrieveAcitSOATreatyDetailsRequest request)throws SQLException;
	public SaveAcitArInvPulloutResponse saveAcitArInvPullout(SaveAcitArInvPulloutRequest saaipr) throws SQLException;
	public RetrieveAcitJVClmOffLOVResponse retrieveAcitJvClmOff(RetrieveAcitJVClmOffLOVRequest request)throws SQLException;
	public RetrieveAcitJVClmNegTrtyResponse retrieveAcitJvNegTrty (RetrieveAcitJVClmNegTrtyRequest request)throws SQLException;
	public SaveAcitJvNegTrtyResponse saveAcitJvNegTrty(SaveAcitJvNegTrtyRequest request)throws SQLException;
	public RetrieveAcitArNegTrtyBalResponse retrieveAcitArNegTrtyBal(RetrieveAcitArNegTrtyBalRequest raantbr) throws SQLException;
	public SaveAcitArNegTrtyBalResponse saveAcitArNegTrtyBal(SaveAcitArNegTrtyBalRequest saantbr) throws SQLException;
	public RetrieveAcitArClmCashCallResponse retrieveAcitArClmCashCall(RetrieveAcitArClmCashCallRequest raacccr) throws SQLException;
	public RetrieveAcitArClmCashCallLovResponse retrieveAcitArClmCashCallLov(RetrieveAcitArClmCashCallLovRequest raaccclr) throws SQLException;
	public SaveAcitArClmRecoverResponse saveAcitArClmRecover(SaveAcitArClmRecoverRequest saacccr) throws SQLException;
	public RetrieveAcitArAmtDtlResponse retrieveAcitArAmtDtl(RetrieveAcitArAmtDtlRequest raaadr) throws SQLException;
	public SaveAcitArAmtDtlResponse saveAcitArAmtDtl(SaveAcitArAmtDtlRequest saaadr) throws SQLException;
	public GenerateUPRResponse generateUPR(GenerateUPRRequest guprr) throws SQLException;
	public RetrieveAcitUPRPerCedeResponse retrieveAcitUPRPerCede(RetrieveAcitUPRPerCedeRequest raupcr) throws SQLException;
	public RetrieveAcitUPRParamsResponse retrieveAcitUPRParams() throws SQLException;
	public String retrieveAcitExistingUPR(GenerateUPRRequest guprr) throws SQLException;
	public RetrieveAcitJVAcctTrtyBalResponse retrieveAcitJvAcctTrtyBal(RetrieveAcitJVAcctTrtyBalRequest request) throws SQLException;
	public SaveAcitJVAcctTrtyBalResponse saveAcitJvActTrtyBal(SaveAcitJVAcctTrtyBalRequest request) throws SQLException;
	public RetrieveAcitJVDefNameResponse retrieveAcitJvDefName(RetrieveAcitJvDefNameRequest request) throws SQLException;
	public RetrieveAcitAllInvestmentIncomeResponse retrieveAcitAllInvestmentIncome(RetrieveAcitAllInvestmentIncomeRequest raaii ) throws SQLException;
	public RetrieveAcitAllInvestmentIncomeInvtIdResponse retrieveAcitAllInvestmentIncomeInvtId(RetrieveAcitAllInvestmentIncomeInvtIdRequest raii ) throws SQLException;
	public SaveAcitAllocInvtIncomeResponse saveAcitAllocInvtIncome(SaveAcitAllocInvtIncomeRequest saaii) throws SQLException;
	public SaveAcitJVEntryListResponse saveAcitJVEntryList(SaveAcitJVEntryListRequest sajel) throws SQLException;
	public RetrieveAcitJVAllocInvtIncResponse retrieveAcitJVAllocInvtInc(RetrieveAcitJVAllocInvtIncRequest rajaii ) throws SQLException;
	public UpdateAcitStatusResponse updateAcitStatus(UpdateAcitStatusRequest uasr ) throws SQLException;
	public RetrieveAcitJVRcvblsAgnstLosResponse retrieveAcitJVRcvblsAgnstLosses(RetrieveAcitJVRcvblsAgnstLosRequest request)throws SQLException;
	public SaveAcitJVRcvblsAgnstLosResponse saveAcitJvRcvblsAgnstLoss(SaveAcitJVRcvblsAgnstLosRequest request)throws SQLException;
	public RetrieveAcitCvResponse retrieveAcitCv(RetrieveAcitCvRequest raptp ) throws SQLException;
	public SaveAcitCvResponse saveAcitCv(SaveAcitCvRequest sacr) throws SQLException;
	public SaveAcitCvPaytReqListResponse saveAcitCvPaytReqList(SaveAcitCvPaytReqListRequest sacprr) throws SQLException;
	public UpdateAcitCvStatResponse updateAcitCvStat(UpdateAcitCvStatRequest uaprsr) throws SQLException;
	public PrintArResponse printAr(PrintArRequest par) throws SQLException;
	public RetrieveAcitClmResHistPaytResponse retrieveAcitClmResHistPayts(RetrieveAcitClmResHistPaytRequest request)throws SQLException;
	public SaveAcitClmResHistPaytsResponse saveAcitClmResHistPayts(SaveAcitClmResHistPaytsRequest request)throws SQLException;
	public SaveAcctPrqServFeeResponse saveAcctPrqServFee(SaveAcctPrqServFeeRequest sapsfr) throws SQLException;
	public RetrieveAcitAttachmentsResponse retrieveAcitAttachments(RetrieveAcitAttachmentsRequest raar) throws SQLException;
	public SaveAcitAttachmentsResponse saveAcitAttachments(SaveAcitAttachmentsRequest saar) throws SQLException;
	public ApproveJVResponse approveJV(ApproveJVRequest request)throws SQLException;
	public RetrieveAcitJVInvPullOutResponse retrieveAcitJVInvPullOut(RetrieveAcitJvInvPullOutRequest request)throws SQLException;
	public SaveAcitJVInvPullOutResponse saveAcitJVInvPullOut(SaveAcitJVInvPullOutRequest request)throws SQLException;
	public RetrieveAcitJVInvtRollOverResponse retrieveAcitJVInvRollOver(RetrieveAcitJVInvtRollOverRequest request)throws SQLException;
	public SaveAcitJVInvRollOverResponse saveAcitJVInvRollOver(SaveAcitJVInvRollOverRequest request)throws SQLException;
	public RetrieveAcitSOAAgingZeroResponse retrieveSoaAgingZeroLOV(RetrieveAcitSOAAgingZeroRequest request)throws SQLException;
	public RetrieveAcitJvQrtrPremResResponse retrieveQuarterPremRes(RetrieveAcitJvQrtrPremResRequest request)throws SQLException;
	public RetrieveAcitSoaZeroAltResponse retrieveSoaAgingZeroAltLOV(RetrieveAcitSoaZeroAltRequest request)throws SQLException;
	public RetrieveAcitAmortizeResponse retrieveAcitAmortize(RetrieveAcitAmortizeRequest raar) throws SQLException;
	public SaveAcitJVTrtyInvtResponse saveAcitJVTrtyInvt (SaveAcitJVTrtyInvtRequest request) throws SQLException;
	public RetrieveAcitJvInvmtOffsetResponse retrieveAcitJvInvmtOffset(RetrieveAcitJvInvmtOffsetRequest request) throws SQLException;
	public RetrieveAcitJvInvPlacementResponse retrieveAcitJvInvPlacement (RetrieveAcitJvInvPlacementRequest request)throws SQLException;
	public SaveAcitJVInvPlacementResponse saveAcitJVInvPlacement (SaveAcitJVInvPlacementRequest request)throws SQLException;
	public RetrieveAcitSOADueResponse retrieveAcitSoaDue(RetrieveAcitSOADueRequest request )throws SQLException;
	public RetrieveAcitInwPolPaytsResponse retrieveAcitInwPolPayts(RetrieveAcitInwPolPaytsRequest raar) throws SQLException;
	public RetrieveAcitCancelTransactionResponse retrieveCancelledTrans(RetrieveAcitCancelTransactionRequest request ) throws SQLException;
	public SaveAcitMonthEndBatchProdResponse saveAcitMonthEndBatchProd(SaveAcitMonthEndBatchProdRequest samebr) throws SQLException;
	public SaveAcitMonthEndBatchOSResponse saveAcitMonthEndBatchOS(SaveAcitMonthEndBatchOSRequest samebr) throws SQLException;
	public RetrieveAcitMonthEndTrialBalResponse retrieveAcitMonthEndTrialBal(RetrieveAcitMonthEndTrialBalRequest rametbr) throws SQLException;
	public SaveAcitMonthEndTrialBalResponse saveAcitMonthEndTrialBal(SaveAcitMonthEndTrialBalRequest sametbr) throws SQLException;
	public PostAcitMonthEndTrialBalResponse postAcitMonthEndTrialBal(PostAcitMonthEndTrialBalRequest pametbr) throws SQLException;
	public RetrieveAcitMonthEndUnpostedMonthsResponse retrieveAcitMonthEndUnpostedMonths() throws SQLException;
	public RetrieveAcitMonthEndResponse retrieveAcitMonthEnd(RetrieveAcitMonthEndRequest ramer) throws SQLException;
	public SaveQSOAResponse saveQSOA(SaveQSOARequest sqr) throws SQLException;
	public RetrieveQSOADtlResponse retrieveQSOADtl(RetrieveQSOADtlRequest rqdr) throws SQLException;
	public SaveAcitProfCommResponse saveAcitProfComm(SaveAcitProfCommRequest sapcr) throws SQLException;
	public RetrieveAcitEditedAcctEntriesResponse retrieveAcitEditedAcctEntries(RetrieveAcitEditedAcctEntriesRequest raeaer) throws SQLException;
	public RetrieveAcitOsQsoaResponse retrieveAcitOsQsoa(RetrieveAcitOsQsoaRequest raoqp) throws SQLException;
	public UploadAcctEntryResponse uploadAcctEntry(UploadAcctEntryRequest uaer) throws SQLException;
	public EditInTrustAccountingEntriesResponse editAcctEnt(EditInTrustAccountingEntriesRequest eitaer) throws SQLException;
	public RestoreInTrustAccountingEntriesResponse restoreAcctEnt(RestoreInTrustAccountingEntriesRequest ritaer) throws SQLException;
	public RetrieveAcitAcctEntInqResponse retrieveAcitAcctEntInq(RetrieveAcitAcctEntInqRequest raaeir) throws SQLException;
	public RetrieveAcitAcctEntBackupResponse retrieveAcitAcctEntBackup(RetrieveAcitAcctEntBackupRequest raaebr) throws SQLException;
	public SaveAcitMonthEndTBTempCloseResponse saveAcitMonthEndTBTempClose(SaveAcitMonthEndTBTempCloseRequest sametcr) throws SQLException;
	public SaveAcitMonthEndTBReopenResponse saveAcitMonthEndTBReopen(SaveAcitMonthEndTBReopenRequest sametrr) throws SQLException;
	public SaveAcitDcbCollectionResponse saveDcbCollection(SaveAcitDcbCollectionRequest request) throws SQLException;
	public SaveAcitCloseOpenDcbResponse SaveAcitCloseOpenDcb(SaveAcitCloseOpenDcbRequest request) throws SQLException;
	public RetrieveAcitDcbCollectionResponse retrieveAcitDcbCollection(RetrieveAcitDcbCollectionRequest request) throws SQLException;
	public RetrieveAcitDcbBankDetailsResponse retrieveAcitBankDetails(RetrieveAcitDcbBankDetailsRequest request) throws SQLException;
	public RetrieveAcitClmHistResponse retrieveAcitClmHist(RetrieveAcitClmHistRequest raptp ) throws SQLException;
	public SaveAcitProfCommTranResponse saveAcitProfCommTran(SaveAcitProfCommTranRequest saptr) throws SQLException;
	public RetrieveAcitUnappliedCollResponse retrieveUnappliedCollection(RetrieveAcitUnappliedCollRequest request) throws SQLException;
	public RetrieveAcitJvUnappCollResponse retrieveJvUnappliedCollection(RetrieveAcitJvUnappCollRequest request) throws SQLException;
	public RetrieveAcitJvUnappliedInwResponse retrieveInwUnappliedCollection(RetrieveAcitJvUnappliedInwRequest request) throws SQLException;
	public SaveAcitJVUnappCollResponse saveJVUnappliedColl(SaveAcitJVUnappCollRequest request) throws SQLException;
	public SaveAcitJVInwUnappResponse saveJVInwUnappliedColl(SaveAcitJVInwUnappRequest request) throws SQLException;
	public RetrieveAcitJvUnappliedTrtyResponse retrieveTrtyUnappliedCollection(RetrieveAcitJvUnappliedTrtyRequest request)throws SQLException;
	public SaveAcitJvUnappliedTrtyResponse saveJVTrtyUnappliedColl(SaveAcitJvUnappliedTrtyRequest request) throws SQLException;
	public String retrieveAcitJvListingLength(RetrieveAcitJVListingRequest rajll) throws SQLException;
	public SaveJVMultiOffsetResponse saveJVMultiOffset(SaveJVMultiOffsetRequest request) throws SQLException;
	public RetrieveAcitJVMultiOffsetResponse retrieveAcitJVMultiOffset(RetrieveAcitJVMultiOffsetRequest request) throws SQLException;
	public RetrieveAcitJVCedRepLossResponse retrieveAcitJVCedRepLoss(RetrieveAcitJVCedRepLossRequest request) throws SQLException;
	public UpdateAgingSoaReponse updateAgingSoa(String eomDate) throws SQLException;
	public RetrieveAcitMonthEndJVResponse retrieveAcitMonthEndJV(RetrieveAcitMonthEndJVRequest ramer) throws SQLException;
	public RetrieveAcitQsoaPrintResponse retrieveAcitQsoaPrint(RetrieveAcitQsoaPrintRequest request) throws SQLException;
}
