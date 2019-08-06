package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrieveAcitCMDMListRequest;
import ph.cpi.rest.api.model.request.CancelArRequest;
import ph.cpi.rest.api.model.request.CancelCMDMCMDMRequest;
import ph.cpi.rest.api.model.request.CancelJournalVoucherRequest;
import ph.cpi.rest.api.model.request.PrintCMDMRequest;
import ph.cpi.rest.api.model.request.PrintJVRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitAgingSoaDtlRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitAcctEntriesRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArInwPolBalRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArTransDtlRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitCvPaytReqListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVInPolBalRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVIntOverdAcctMSRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVListingRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVPremResRelRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitPaytReqRequest;
import ph.cpi.rest.api.model.request.SaveAcitArTransRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitSOAAgingDetailsRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitServFeeMainGnrtRequest;
import ph.cpi.rest.api.model.request.SaveAcitArInwPolBalRequest;
import ph.cpi.rest.api.model.request.SaveAcitArTransDtlRequest;
import ph.cpi.rest.api.model.request.RetrieveQSOAListRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVEntryRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVIntOverdAcctMSRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVPremResRelRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVAdjInwPolBalRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVAppPaytZeroRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitInvestmentsListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVAppPaytZeroRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitProfCommDtlRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitProfCommSummRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitPrqInwPolRequest;
import ph.cpi.rest.api.model.request.SaveAcitInvestmentsRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitRefNoLOVRequest;
import ph.cpi.rest.api.model.request.SaveAcitAcctEntriesRequest;
import ph.cpi.rest.api.model.request.SaveAcitCMDMRequest;
import ph.cpi.rest.api.model.request.SaveAcitPaytReqRequest;
import ph.cpi.rest.api.model.request.SaveAcitPrqInwPolRequest;
import ph.cpi.rest.api.model.request.SaveAcitPrqTransRequest;
import ph.cpi.rest.api.model.response.RetrieveAcitCMDMListResponse;
import ph.cpi.rest.api.model.response.CancelArResponse;
import ph.cpi.rest.api.model.response.CancelCMDMCMDMResponse;
import ph.cpi.rest.api.model.response.CancelJournalVoucherResponse;
import ph.cpi.rest.api.model.response.PrintCMDMResponse;
import ph.cpi.rest.api.model.response.PrintJVResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitAgingSoaDtlResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitAcctEntriesResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArInwPolBalResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArTransDtlResponse;
import ph.cpi.rest.api.model.request.RetrieveAcitPrqTransRequest;
import ph.cpi.rest.api.model.request.UpdateAcitPaytReqStatRequest;
import ph.cpi.rest.api.model.response.RetrieveAcitCvPaytReqListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVIntOverdAcctMSResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVInwPolBalResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVListingResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVPremResRelResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPaytReqResponse;
import ph.cpi.rest.api.model.response.SaveAcitArTransResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitSOAAgingResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitServFeeMainGnrtResponse;
import ph.cpi.rest.api.model.response.SaveAcitArInwPolBalResponse;
import ph.cpi.rest.api.model.response.SaveAcitArTransDtlResponse;
import ph.cpi.rest.api.model.response.RetrieveQSOAListResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVEntryResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVIntOverdAcctMSResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVPremResRelResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitInvestmentsListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVAppPaytZeroResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitProfCommDtlResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitProfCommSummResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPrqInwPolResponse;
import ph.cpi.rest.api.model.response.SaveAcitPaytReqResponse;
import ph.cpi.rest.api.model.response.SaveAcitPrqInwPolResponse;
import ph.cpi.rest.api.model.response.SaveAcitInvestmentsResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitRefNoLOVResponse;
import ph.cpi.rest.api.model.response.SaveAcitAcctEntriesResponse;
import ph.cpi.rest.api.model.response.SaveAcitCMDMResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVAdjInwPolBalResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVAppPaytZeroResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPrqTransResponse;
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
	public RetrieveAcitJVAppPaytZeroResponse retrieveAcitJVAppPaytZeroBal(RetrieveAcitJVAppPaytZeroRequest request) throws SQLException;
	public SaveAcitJVAppPaytZeroResponse saveAcitJVAppPaytZeroBal(SaveAcitJVAppPaytZeroRequest request)throws SQLException;
}
