package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.glassfish.jersey.jaxb.internal.XmlCollectionJaxbProvider.App;
import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.ApproveJVRequest;
import ph.cpi.rest.api.model.request.CancelArRequest;
import ph.cpi.rest.api.model.request.CancelCMDMCMDMRequest;
import ph.cpi.rest.api.model.request.CancelJournalVoucherRequest;
import ph.cpi.rest.api.model.request.GenerateUPRRequest;
import ph.cpi.rest.api.model.request.PrintCMDMRequest;
import ph.cpi.rest.api.model.request.PrintJVRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitAcctEntriesRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitAgingSoaDtlRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitAllInvestmentIncomeInvtIdRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitAllInvestmentIncomeRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArAmtDtlRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArClmCashCallLovRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArClmCashCallRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArClmRecoverLovRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArClmRecoverRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArInvPulloutRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArInwPolBalRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArNegTrtyBalRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArTransDtlRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitCMDMListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitClmResHistPaytRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitCvPaytReqListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitInvestmentsListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVAcctTrtyBalRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVAppPaytZeroRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVClmNegTrtyRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVClmOffLOVRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVInPolBalRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVIntOverdAcctMSRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVListingRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVPremResRelRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVRcvblsAgnstLosRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJvDefNameRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitPaytReqRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitProfCommDtlRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitProfCommSummRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitPrqInwPolRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitPrqTransRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitRefNoLOVRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitSOAAgingDetailsRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitSOATreatyDetailsRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitServFeeMainGnrtRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitUPRPerCedeRequest;
import ph.cpi.rest.api.model.request.RetrieveQSOAListRequest;
import ph.cpi.rest.api.model.request.SaveAcitAcctEntriesRequest;
import ph.cpi.rest.api.model.request.SaveAcitAllocInvtIncomeRequest;
import ph.cpi.rest.api.model.request.SaveAcitArAmtDtlRequest;
import ph.cpi.rest.api.model.request.SaveAcitArClmCashCallRequest;
import ph.cpi.rest.api.model.request.SaveAcitArClmRecoverRequest;
import ph.cpi.rest.api.model.request.SaveAcitArInvPulloutRequest;
import ph.cpi.rest.api.model.request.SaveAcitArInwPolBalRequest;
import ph.cpi.rest.api.model.request.SaveAcitArNegTrtyBalRequest;
import ph.cpi.rest.api.model.request.SaveAcitArTransDtlRequest;
import ph.cpi.rest.api.model.request.SaveAcitArTransRequest;
import ph.cpi.rest.api.model.request.SaveAcitCMDMRequest;
import ph.cpi.rest.api.model.request.SaveAcitClmResHistPaytsRequest;
import ph.cpi.rest.api.model.request.SaveAcitInvestmentsRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVAcctTrtyBalRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVAdjInwPolBalRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVAppPaytZeroRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVEntryListRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVEntryRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVIntOverdAcctMSRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVPremResRelRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVRcvblsAgnstLosRequest;
import ph.cpi.rest.api.model.request.SaveAcitJvNegTrtyRequest;
import ph.cpi.rest.api.model.request.SaveAcitPaytReqRequest;
import ph.cpi.rest.api.model.request.SaveAcitPrqInwPolRequest;
import ph.cpi.rest.api.model.request.SaveAcitPrqTransRequest;
import ph.cpi.rest.api.model.request.UpdateAcitPaytReqStatRequest;
import ph.cpi.rest.api.model.response.ApproveJVResponse;
import ph.cpi.rest.api.model.response.CancelArResponse;
import ph.cpi.rest.api.model.response.CancelCMDMCMDMResponse;
import ph.cpi.rest.api.model.response.CancelJournalVoucherResponse;
import ph.cpi.rest.api.model.response.GenerateUPRResponse;
import ph.cpi.rest.api.model.response.PrintCMDMResponse;
import ph.cpi.rest.api.model.response.PrintJVResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitAcctEntriesResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitAgingSoaDtlResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitAllInvestmentIncomeInvtIdResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitAllInvestmentIncomeResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArAmtDtlResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArClmCashCallLovResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArClmCashCallResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArClmRecoverLovResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArClmRecoverResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArInvPulloutResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArInwPolBalResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArNegTrtyBalResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArTransDtlResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitCMDMListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitClmResHistPaytResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitCvPaytReqListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitInvestmentsListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVAcctTrtyBalResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVAppPaytZeroResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVClmNegTrtyResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVClmOffLOVResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVDefNameResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVIntOverdAcctMSResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVInwPolBalResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVListingResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVPremResRelResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVRcvblsAgnstLosResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPaytReqResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitProfCommDtlResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitProfCommSummResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPrqInwPolResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPrqTransResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitRefNoLOVResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitSOAAgingResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitSOATreatyDetailsResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitServFeeMainGnrtResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitUPRParamsResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitUPRPerCedeResponse;
import ph.cpi.rest.api.model.response.RetrieveQSOAListResponse;
import ph.cpi.rest.api.model.response.SaveAcitAcctEntriesResponse;
import ph.cpi.rest.api.model.response.SaveAcitAllocInvtIncomeResponse;
import ph.cpi.rest.api.model.response.SaveAcitArAmtDtlResponse;
import ph.cpi.rest.api.model.response.SaveAcitArClmCashCallResponse;
import ph.cpi.rest.api.model.response.SaveAcitArClmRecoverResponse;
import ph.cpi.rest.api.model.response.SaveAcitArInvPulloutResponse;
import ph.cpi.rest.api.model.response.SaveAcitArInwPolBalResponse;
import ph.cpi.rest.api.model.response.SaveAcitArNegTrtyBalResponse;
import ph.cpi.rest.api.model.response.SaveAcitArTransDtlResponse;
import ph.cpi.rest.api.model.response.SaveAcitArTransResponse;
import ph.cpi.rest.api.model.response.SaveAcitCMDMResponse;
import ph.cpi.rest.api.model.response.SaveAcitClmResHistPaytsResponse;
import ph.cpi.rest.api.model.response.SaveAcitInvestmentsResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVAcctTrtyBalResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVAdjInwPolBalResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVAppPaytZeroResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVEntryListResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVEntryResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVIntOverdAcctMSResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVPremResRelResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVRcvblsAgnstLosResponse;
import ph.cpi.rest.api.model.response.SaveAcitJvNegTrtyResponse;
import ph.cpi.rest.api.model.response.SaveAcitPaytReqResponse;
import ph.cpi.rest.api.model.response.SaveAcitPrqInwPolResponse;
import ph.cpi.rest.api.model.response.SaveAcitPrqTransResponse;
import ph.cpi.rest.api.model.response.UpdateAcitPaytReqStatResponse;

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
	public RetrieveAcitServFeeMainGnrtResponse retrieveAcitServFeeMainGnrt(RetrieveAcitServFeeMainGnrtRequest rasfmr) throws SQLException;
	public RetrieveAcitArClmRecoverResponse retrieveAcitArClmRecover(RetrieveAcitArClmRecoverRequest raacrr) throws SQLException;
	public RetrieveAcitArClmRecoverLovResponse retrieveAcitArClmRecoverLov(RetrieveAcitArClmRecoverLovRequest raacrlr) throws SQLException;
	public SaveAcitArClmRecoverResponse saveArClmRecover(SaveAcitArClmRecoverRequest saacrr) throws SQLException;
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
	public SaveAcitArClmCashCallResponse saveAcitArClmCashCall(SaveAcitArClmCashCallRequest saacccr) throws SQLException;
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
	public RetrieveAcitJVRcvblsAgnstLosResponse retrieveAcitJVRcvblsAgnstLosses(RetrieveAcitJVRcvblsAgnstLosRequest request)throws SQLException;
	public SaveAcitJVRcvblsAgnstLosResponse saveAcitJvRcvblsAgnstLoss(SaveAcitJVRcvblsAgnstLosRequest request)throws SQLException;
	public RetrieveAcitClmResHistPaytResponse retrieveAcitClmResHistPayts(RetrieveAcitClmResHistPaytRequest request)throws SQLException;
	public SaveAcitClmResHistPaytsResponse saveAcitClmResHistPayts(SaveAcitClmResHistPaytsRequest request)throws SQLException;
	public ApproveJVResponse approveJV(ApproveJVRequest request)throws SQLException;
}
