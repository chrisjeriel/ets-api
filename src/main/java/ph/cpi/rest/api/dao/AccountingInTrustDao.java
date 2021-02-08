package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.ACITSOATreatyDetails;
import ph.cpi.rest.api.model.accountingintrust.AcctEntryRowUpload;
import ph.cpi.rest.api.model.accountingintrust.AcctServFeeDist;
import ph.cpi.rest.api.model.accountingintrust.AcitAcctEntries;
import ph.cpi.rest.api.model.accountingintrust.AcitAcctEntriesExt;
import ph.cpi.rest.api.model.accountingintrust.AcitAllInvtIncome;
import ph.cpi.rest.api.model.accountingintrust.AcitAmortize;
import ph.cpi.rest.api.model.accountingintrust.AcitArAmtDtl;
import ph.cpi.rest.api.model.accountingintrust.AcitArClmCashCall;
import ph.cpi.rest.api.model.accountingintrust.AcitArClmCashCallLov;
import ph.cpi.rest.api.model.accountingintrust.AcitArClmRecover;
import ph.cpi.rest.api.model.accountingintrust.AcitArClmRecoverLov;
import ph.cpi.rest.api.model.accountingintrust.AcitArInvPullout;
import ph.cpi.rest.api.model.accountingintrust.AcitArInwPolBal;
import ph.cpi.rest.api.model.accountingintrust.AcitArNegTrtyBal;
import ph.cpi.rest.api.model.accountingintrust.AcitArTransDtl;
import ph.cpi.rest.api.model.accountingintrust.AcitAttachments;
import ph.cpi.rest.api.model.accountingintrust.AcitCMDM;
import ph.cpi.rest.api.model.accountingintrust.AcitCancelledTransactions;
import ph.cpi.rest.api.model.accountingintrust.AcitClmHist;
import ph.cpi.rest.api.model.accountingintrust.AcitClmResHistPayts;
import ph.cpi.rest.api.model.accountingintrust.AcitCv;
import ph.cpi.rest.api.model.accountingintrust.AcitCvPaytReq;
import ph.cpi.rest.api.model.accountingintrust.AcitDcbBankDetails;
import ph.cpi.rest.api.model.accountingintrust.AcitDcbCollection;
import ph.cpi.rest.api.model.accountingintrust.AcitEditedAcctEntries;
import ph.cpi.rest.api.model.accountingintrust.AcitEomMonthlyTotals;
import ph.cpi.rest.api.model.accountingintrust.AcitEomUnpostedMonth;
import ph.cpi.rest.api.model.accountingintrust.AcitInvestments;
import ph.cpi.rest.api.model.accountingintrust.AcitInwPolPayts;
import ph.cpi.rest.api.model.accountingintrust.AcitJVAcctTrtyBal;
import ph.cpi.rest.api.model.accountingintrust.AcitJVAdjstInwPolBal;
import ph.cpi.rest.api.model.accountingintrust.AcitJVAppPaymentZeroBal;
import ph.cpi.rest.api.model.accountingintrust.AcitJVClaimOffSetLOV;
import ph.cpi.rest.api.model.accountingintrust.AcitJVClaimsLosses;
import ph.cpi.rest.api.model.accountingintrust.AcitJVClmNegativeTreaty;
import ph.cpi.rest.api.model.accountingintrust.AcitJVIntOverdueAcctsMS;
import ph.cpi.rest.api.model.accountingintrust.AcitJVInvestmentPlacement;
import ph.cpi.rest.api.model.accountingintrust.AcitJVPremResReleased;
import ph.cpi.rest.api.model.accountingintrust.AcitJVQuarterPremRes;
import ph.cpi.rest.api.model.accountingintrust.AcitJVRollOver;
import ph.cpi.rest.api.model.accountingintrust.AcitJVUnappliedCollection;
import ph.cpi.rest.api.model.accountingintrust.AcitJVinvPullOut;
import ph.cpi.rest.api.model.accountingintrust.AcitJvAllInvtIncome;
import ph.cpi.rest.api.model.accountingintrust.AcitJvUnappInw;
import ph.cpi.rest.api.model.accountingintrust.AcitJvUnappliedTreaty;
import ph.cpi.rest.api.model.accountingintrust.AcitMonthEnd;
import ph.cpi.rest.api.model.accountingintrust.AcitMonthEndJV;
import ph.cpi.rest.api.model.accountingintrust.AcitOsPolPrem;
import ph.cpi.rest.api.model.accountingintrust.AcitOsQsoa;
import ph.cpi.rest.api.model.accountingintrust.AcitPaytReq;
import ph.cpi.rest.api.model.accountingintrust.AcitPremCol;
import ph.cpi.rest.api.model.accountingintrust.AcitProfCommDtl;
import ph.cpi.rest.api.model.accountingintrust.AcitProfCommSumm;
import ph.cpi.rest.api.model.accountingintrust.AcitPrqInwPol;
import ph.cpi.rest.api.model.accountingintrust.AcitPrqTrans;
import ph.cpi.rest.api.model.accountingintrust.AcitSOAAgingDetails;
import ph.cpi.rest.api.model.accountingintrust.AcitSOAAgingDetailsLOV;
import ph.cpi.rest.api.model.accountingintrust.AcitTransactions;
import ph.cpi.rest.api.model.accountingintrust.AcitTrialBal;
import ph.cpi.rest.api.model.accountingintrust.AcitUPRPerLine;
import ph.cpi.rest.api.model.accountingintrust.AcitUPRPerPolicy;
import ph.cpi.rest.api.model.accountingintrust.AcitUnappliedCollection;
import ph.cpi.rest.api.model.accountingintrust.AcknowledgementReceipt;
import ph.cpi.rest.api.model.accountingintrust.DataCheckScript;
import ph.cpi.rest.api.model.accountingintrust.GenUPRParams;
import ph.cpi.rest.api.model.accountingintrust.LossResDepInquiry;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetLrd;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetClm;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetExisting;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetInvPl;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetInvPo;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetIpb;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetOth;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetTrty;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetUnapp;
import ph.cpi.rest.api.model.accountingintrust.QSOA;
import ph.cpi.rest.api.model.accountingintrust.QSOAAcctReceivable;
import ph.cpi.rest.api.model.accountingintrust.QSOADtl;
import ph.cpi.rest.api.model.accountingintrust.QSOADtlExclude;
import ph.cpi.rest.api.model.accountingintrust.QSOAPrint;
import ph.cpi.rest.api.model.accountingintrust.QSOARemittance;
import ph.cpi.rest.api.model.accountingintrust.RefNoLov;
import ph.cpi.rest.api.model.accountingintrust.RiskMgtAlloc;
import ph.cpi.rest.api.model.accountingintrust.UnappColInquiry;
import ph.cpi.rest.api.model.maintenance.BookingMonth;
import ph.cpi.rest.api.model.maintenance.UserId;
import ph.cpi.rest.api.model.request.RetrieveAcitAcctEntriesExtRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitOsPolPremRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitPremColRequest;

public interface AccountingInTrustDao {
	public List<AcitCvPaytReq> retrieveAcitCvPaytReqList(final HashMap<String, Object> params ) throws SQLException;
	public List<AcitPaytReq> retrieveAcitPaytReq(final HashMap<String, Object> params) throws SQLException;
	public List<AcitTransactions> retrieveAcitJVListings(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitPaytReq(final HashMap<String, Object> params) throws SQLException;
	public List<AcitInvestments> retrieveInvestmentList(final HashMap<String, Object> params ) throws SQLException;
	public Integer saveAcitInvestments(final HashMap<String, Object> params) throws SQLException;
	public List<AcitCMDM> retrieveAcitCMDMList(final HashMap<String, Object> params) throws SQLException;
	public Integer saveAcitCMDM(final HashMap<String, Object> params) throws SQLException;
	public List<RefNoLov> retrieveAcitRefNoLOV(final HashMap<String, Object> params) throws SQLException;
	public List<AcknowledgementReceipt> retrieveArList(final HashMap<String, Object> params) throws SQLException;
	public AcknowledgementReceipt retrieveArEntry(final HashMap<String, Object> params) throws SQLException;
	public AcitTransactions retrieveAcitJVEntry(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitJVEntry(final HashMap<String, Object> params) throws SQLException;
	public List<AcitSOAAgingDetails> retrieveAcitSOAAging(final HashMap<String, Object> params) throws SQLException;
	public List<AcitJVAdjstInwPolBal> retrieveAcitJVAdjstInwPolBal(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitArTrans(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> updateAcitPaytReqStat(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitPrqTrans(final HashMap<String, Object> params) throws SQLException;
	public List<AcitPrqTrans> retrieveAcitPrqTrans(final HashMap<String, Object> params) throws SQLException;
	public List<AcitJVIntOverdueAcctsMS> retrieveAcitJVIntOverdAcctsMS(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitJVAdjInwPolBal(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitJVOverdueAccts(final HashMap<String, Object> params) throws SQLException;
	public List<AcitJVPremResReleased> retrieveAcitJVPremResRel(final HashMap<String, Object> params) throws SQLException;
	public Integer cancelCMDM(final HashMap<String, Object> params) throws SQLException;
	public Integer printCMDM(final HashMap<String, Object> params) throws SQLException;
	public List<AcitAcctEntries> retrieveAcitAcctEntries(final HashMap<String, Object> params) throws SQLException;
	public List<QSOA> retrieveQSOAList(final HashMap<String, Object> params) throws SQLException;
	public Integer saveAcitAcctEntries(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitJVPremResRel(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> cancelJV(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> printJV(final HashMap<String, Object> params) throws SQLException;
	public List<AcitProfCommSumm> retrieveProfCommSumm(final HashMap<String, Object> params ) throws SQLException;
	public List<AcitProfCommDtl> retrieveProfCommDtl(final HashMap<String, Object> params ) throws SQLException;
	public Integer cancelAr(final HashMap<String, Object> params) throws SQLException;
	public List<AcitSOAAgingDetails> retrieveAgingSoaDtl(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveArInwPolBal(final HashMap<String, Object> params) throws SQLException;
	public List<AcitArInwPolBal> retrieveAcitArInwPolBal(final HashMap<String, Object> params) throws SQLException;
	public List<AcitArTransDtl> retrieveAcitArTransDtl(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveArTransDtl(final HashMap<String, Object> params) throws SQLException;
	public List<AcitPrqInwPol> retrieveAcitPrqInwPol(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitPrqInwPol(final HashMap<String, Object> params) throws SQLException;
	public List<AcitJVAppPaymentZeroBal> retrieveAcitJVAppPaytZeroBal(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitJVAppPaytZeroBal(final HashMap<String, Object> params) throws SQLException;
	public List<ACITSOATreatyDetails> retrieveAcitSoaTrtyList(final HashMap<String, Object> params) throws SQLException;
	public List<AcitArClmCashCall> retrieveAcitArClmCashCall(final HashMap<String, Object> params) throws SQLException;
	public List<AcitArClmCashCallLov> retrieveAcitArClmCashCallLov(final HashMap<String, Object> params) throws SQLException;
	public List<AcctServFeeDist> retrieveAcctPrqServFeeMainGnrt(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveArClmRecover(final HashMap<String, Object> params) throws SQLException;
	public List<AcitArInvPullout> retrieveAcitArPullout(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitArInvPullout(final HashMap<String, Object> params) throws SQLException;
	public List<AcitJVClaimOffSetLOV> retrieveAcitJvClmOff(final HashMap<String, Object> params) throws SQLException;
	public List<AcitJVClmNegativeTreaty> retrieveAcitJvNegTrty(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitJvNegTrty(final HashMap<String, Object> params) throws SQLException;
	public List<AcitArNegTrtyBal> retrieveAcitArNegTrtyBal(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitArNegTrtyBal(final HashMap<String, Object> params) throws SQLException;
	public List<AcitArClmRecoverLov> retrieveAcitArClmRecoverLov(final HashMap<String, Object> params) throws SQLException;
	public List<AcitArClmRecover> retrieveAcitArClmRecover(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitArClmCashCallLov(final HashMap<String, Object> params) throws SQLException;
	public List<AcitArAmtDtl> retrieveAcitArAmtDtl(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitArAmtDtl(final HashMap<String, Object> params) throws SQLException;
	public Integer generateUPR(final HashMap<String, Object> params) throws SQLException;
	public List<AcitUPRPerLine> retrieveAcitUPRPerLine(final HashMap<String, Object> params) throws SQLException;
	public List<AcitUPRPerPolicy> retrieveAcitUPRPerPol(final HashMap<String, Object> params) throws SQLException;
	public List<AcctServFeeDist> retrieveAcctPrqServFeeSubGnrt(final HashMap<String, Object> params) throws SQLException;
	public GenUPRParams retrieveAcitUPRParams() throws SQLException;
	public String retrieveAcitExistingUPR(final HashMap<String, Object> params) throws SQLException;
	public List<AcitJVAcctTrtyBal> retrieveAcitJvAcctTrtyBal(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitJvActTrtyBal(final HashMap<String, Object> params) throws SQLException;
	public UserId retrieveJVDefName(final HashMap<String, Object> params) throws SQLException;
	public List<AcitAllInvtIncome> retrieveAcitAllInvestmentIncome(final HashMap<String, Object> params) throws SQLException;
	public List<AcitAllInvtIncome> retrieveAcitAllInvestmentIncomeInvtId(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitAllocInvtIncome(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitJVEntryList(final HashMap<String, Object> params) throws SQLException;
	public List<AcitJvAllInvtIncome> retrieveAcitJvAllInvtIncome(final HashMap<String, Object> params) throws SQLException;
	public Integer updateAcitStatus(final HashMap<String, Object> params ) throws SQLException;
	public Integer saveAcctPrqServFee(final HashMap<String, Object> params) throws SQLException;
	public List<AcitJVClaimsLosses> retrieveAcitJVRcvblsAgnstLosses(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitJvRcvblsAgnstLoss(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> updateAcitCvStat(final HashMap<String, Object> params) throws SQLException;
	public Integer printAr(final HashMap<String, Object> params) throws SQLException;
	public List<AcitClmResHistPayts> retrieveAcitClmResHistPayts(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitClmResHistPayts(final HashMap<String, Object> params) throws SQLException;
	public List<AcitCv> retrieveAcitCv(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitCv(final HashMap<String, Object> params) throws SQLException;
	public Integer saveAcitCvPaytReqList(final HashMap<String, Object> params) throws SQLException;
	public List<AcitAttachments> retrieveAcitAttachments(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitAttachments(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> approveJV(final HashMap<String, Object> params) throws SQLException;
	public List<AcitJVinvPullOut> retrieveAcitJVInvPullOut(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitJVInvPullOut(final HashMap<String, Object> params) throws SQLException;
	public List<AcitJVRollOver> retrieveAcitJVInvRollOver(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitJVInvRollOver(final HashMap<String, Object> params) throws SQLException;
	public List<AcitSOAAgingDetails> retrieveSoaAgingZeroLOV(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> retrieveAcctPrqServFee(final HashMap<String, Object> params) throws SQLException;
	public AcitJVQuarterPremRes retrieveQuarterPremRes(final HashMap<String, Object> params) throws SQLException;
	public List<AcitSOAAgingDetails> retrieveSoaAgingZeroAltLOV(final HashMap<String, Object> params) throws SQLException;
	public List<AcitAmortize> retrieveAcitAmortize(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitJVTrtyInvt(final HashMap<String, Object> params) throws SQLException;
	public List<AcitJVAcctTrtyBal> retrieveAcitJvInvmtOffset(final HashMap<String, Object> params) throws SQLException;
	public List<AcitJVInvestmentPlacement> retrieveAcitJvInvPlacement(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitJVInvPlacement(final HashMap<String, Object> params) throws SQLException;
	public List<AcitSOAAgingDetails> retrieveAcitSoaDue(final HashMap<String, Object> params) throws SQLException;
	public List<AcitInwPolPayts> retrieveAcitInwPolPayts(final HashMap<String, Object> params) throws SQLException;
	public List<AcitCancelledTransactions> retrieveCancelledTrans(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomExtUwprod(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomCreateNetPremJv(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomExtEomUpr(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomCreateUprJv(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomSaveOdInt(final HashMap<String, Object> params) throws SQLException;
	public String acitEomProdSummaryReport(final HashMap<String, Object> params) throws SQLException;
	
	public Integer acitEomExtOsLoss(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomCreateOsLossJv(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomExtClmpayt(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomCreateAllocPaidClmJv(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomExtractClmRecover(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomCreateAllocRecoverJv(final HashMap<String, Object> params) throws SQLException;
	public String acitEomBatchOsSummaryReport(final HashMap<String, Object> params) throws SQLException;
	
	public HashMap<String, Object> validateEomStat(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomUpdateEomCloseTag(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomUpdateAcctEntDate(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomUpdateAcctEntDateNull(final HashMap<String, Object> params) throws SQLException;
	
	public String validateTbDate(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomDeleteMonthlyTotalsBackup() throws SQLException;
	public Integer acitEomInsertMonthlyTotalsBackup(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomDeleteMonthlyTotals(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomCloseTrans(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomDeleteTrans(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomInsertMonthlyTotals(final HashMap<String, Object> params) throws SQLException;
	
	public void startTransaction();
	public void commit();
	public void rollback();
	
	public List<AcitEomMonthlyTotals> retrieveAcitMonthEndTrialBal(final HashMap<String, Object> params) throws SQLException;
	public String validatePrevMonth(final HashMap<String, Object> params) throws SQLException;
	public String validateCurrMonth(final HashMap<String, Object> params) throws SQLException;
	public String validateEqualTb(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomPostToFiscalYear(final HashMap<String, Object> params) throws SQLException;
	public Integer failedPosting(final HashMap<String, Object> params) throws SQLException;
	public List<AcitEomUnpostedMonth> retrieveAcitMonthEndUnpostedMonths() throws SQLException;
	public Integer acitEomUpdateReport(final HashMap<String, Object> params) throws SQLException;
	public List<AcitMonthEnd> retrieveAcitMonthEnd(final HashMap<String, Object> params) throws SQLException;
	public String validateQsoaQtr(final HashMap<String, Object> params) throws SQLException;
	public Integer saveQSOA(final HashMap<String, Object> params) throws SQLException;
	public List<QSOADtl> retrieveQSOADtl(final HashMap<String, Object> params) throws SQLException;
	public List<QSOADtlExclude> retrieveQSOADtlExclude(final HashMap<String, Object> params) throws SQLException;
	public Integer saveAcitProfComm(final HashMap<String, Object> params) throws SQLException;
	public List<QSOAAcctReceivable> retrieveQSOAAcctReceivable(final HashMap<String, Object> params) throws SQLException;
	public List<QSOARemittance> retrieveQSOARemittance(final HashMap<String, Object> params) throws SQLException;
	public Integer updateSoaCv(final HashMap<String, Object> params) throws SQLException;
	public AcitEditedAcctEntries retrieveAcitEditedAcctEntries (final HashMap<String, Object> params) throws SQLException;
	public String validateCheckNo(final HashMap<String, Object> params) throws SQLException;
	public String isCvNoAvail(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> validateServfee(final HashMap<String, Object> params) throws SQLException;
	public List<AcitEomUnpostedMonth> retrieveAcctPrqServFeeMonths(final HashMap<String, Object> params) throws SQLException;
	public List<AcitOsQsoa> retrieveAcitOsQsoa(final HashMap<String, Object> params) throws SQLException;
	public Integer deleteAcctEntry(HashMap<String, Object> params) throws SQLException;
	public Integer uploadAcctEntry(List<AcctEntryRowUpload> aeruList) throws SQLException;
	public Integer editAcctEnt(final HashMap<String, Object> params) throws SQLException;
	public Integer restoreAcctEnt(final HashMap<String, Object> params) throws SQLException;
	public List<AcitEditedAcctEntries> retrieveEditedAcctEntInq(final HashMap<String, Object> params) throws SQLException;
	public List<AcitAcctEntries> retrieveAcctEntInqDtl(final HashMap<String, Object> params) throws SQLException;
	public Integer saveAcitMonthEndTBTempClose(final HashMap<String, Object> params) throws SQLException;
	public String validateTempClose(final HashMap<String, Object> params) throws SQLException;
	public Integer saveAcitMonthEndTBReopen(final HashMap<String, Object> params) throws SQLException;
	public String validateReopen(final HashMap<String, Object> params) throws SQLException;
	public Integer acitEomCreateLossResDepJv(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String,Object> saveDcbCollection(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String,Object> SaveAcitCloseOpenDcb(final HashMap<String, Object> params) throws SQLException;
	public List<AcitDcbCollection> retrieveAcitDcbCollection(final HashMap<String, Object> params) throws SQLException;
	public List<AcitDcbBankDetails> retrieveAcitBankDetails(final HashMap<String, Object> params) throws SQLException;
	public String validateTranAcctEntDate(final HashMap<String, Object> params) throws SQLException;
	public List<AcitProfCommSumm> retrievePCSummPerCeding(final HashMap<String, Object> params ) throws SQLException;
	public List<AcitClmHist> retrieveAcitClmHist(final HashMap<String, Object> params) throws SQLException;
	public Integer saveAcitProfCommTran(final HashMap<String, Object> params) throws SQLException;
	public String getAcitTranNo(final HashMap<String, Object> params) throws SQLException;
	public String validateProfCommTran(final HashMap<String, Object> params) throws SQLException;
	public List<AcitProfCommSumm> retrieveProfCommParams() throws SQLException;
	public List<AcitUnappliedCollection> retrieveUnappliedCollection(final HashMap<String, Object> params ) throws SQLException;
	public List<AcitJVUnappliedCollection> retrieveJvUnappliedCollection(final HashMap<String, Object> params ) throws SQLException;
	public List<AcitJvUnappInw> retrieveInwUnappliedCollection(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String,Object> saveJVUnappliedColl(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String,Object> saveJVInwUnappliedColl(final HashMap<String, Object> params ) throws SQLException;
	public List<AcitJvUnappliedTreaty> retrieveTrtyUnappliedCollection(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String,Object> saveJVTrtyUnappliedColl(final HashMap<String, Object> params ) throws SQLException;
	public String checkAcitJvSeries(final HashMap<String, Object> params) throws SQLException;
	public Integer retrieveAcitJvListingLength(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String,Object> saveJVMultiOffset(final HashMap<String, Object> params ) throws SQLException;
	public List<MultiOffsetIpb> retrieveMultiOffsetIpb(final HashMap<String, Object> params) throws SQLException;
	public List<MultiOffsetClm> retrieveMultiOffsetClm(final HashMap<String, Object> params) throws SQLException;
	public List<MultiOffsetTrty> retrieveMultiOffsetTrty(final HashMap<String, Object> params) throws SQLException;
	public List<MultiOffsetUnapp> retrieveMultiOffsetUnapp(final HashMap<String, Object> params) throws SQLException;
	public List<MultiOffsetInvPo> retrieveMultiOffsetInvPo(final HashMap<String, Object> params) throws SQLException;
	public List<MultiOffsetInvPl> retrieveMultiOffsetInvPl(final HashMap<String, Object> params) throws SQLException;
	public List<MultiOffsetLrd> retrieveAcitJVCedRepLoss(final HashMap<String, Object> params) throws SQLException;
	public List<MultiOffsetLrd> retrieveMultiOffsetLrd(final HashMap<String, Object> params) throws SQLException;
	public List<MultiOffsetOth> retrieveMultiOffsetOth(final HashMap<String, Object> params) throws SQLException;
	public MultiOffsetExisting retrieveMultiOffsetExisting(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String,Object> updateAgingSoa(final HashMap<String, Object> params ) throws SQLException;
	public List<AcitMonthEndJV> retrieveAcitMonthEndJV(final HashMap<String, Object> params) throws SQLException;
	public List<QSOAPrint> retrieveAcitQsoaPrint(final HashMap<String, Object> params) throws SQLException;
	public List<AcitAcctEntriesExt> retrieveAcitAcctEntriesExt(RetrieveAcitAcctEntriesExtRequest request)throws SQLException;
	public List<AcitTrialBal> retrieveAcitTrialBalExt(HashMap<String, Object> params)throws SQLException;
	public List<AcitSOAAgingDetails> retrieveAcitJVMoSoa(final HashMap<String, Object> params) throws SQLException;
	public List<RiskMgtAlloc> retrieveAcitJVRiskMgtAllocGnrt(final HashMap<String, Object> params) throws SQLException;
	public Integer saveAcitJVRiskMgtAlloc(final HashMap<String, Object> params) throws SQLException;
	public List<RiskMgtAlloc> retrieveAcitJVRiskMgtAlloc(final HashMap<String, Object> params) throws SQLException;
	public String validateRiskDate(final HashMap<String, Object> params) throws SQLException;
	public List<AcitInvestments> retrieveAcitInvestmentsIncArtUtil(final HashMap<String, Object> params ) throws SQLException;
	public Integer retrieveAgingSoaDtlCount(final HashMap<String, Object> params) throws SQLException;
	public List<AcitOsPolPrem> retrieveAcitOsPolPrem(RetrieveAcitOsPolPremRequest request);
	public List<AcknowledgementReceipt> retrieveArListChangeTrans(final HashMap<String, Object> params) throws SQLException;
	public List<AcitTransactions> retrieveAcitJvListingChangeTrans(final HashMap<String, Object> params) throws SQLException;
	public List<AcitCv> retrieveAcitCvChangeTrans(final HashMap<String, Object> params) throws SQLException;
	public List<AcitPremCol> retrieveAcitPremCol(RetrieveAcitPremColRequest params) throws SQLException;
	public List<AcitSOAAgingDetailsLOV> retrieveAgingSoaDtlLOV(HashMap<String, Object> params) throws SQLException;
	public List<UnappColInquiry> retUnappliedColList(HashMap<String, Object> params);
	public List<UnappColInquiry> retUnappliedColRealignmentList(HashMap<String, Object> params);
	public List<LossResDepInquiry> retrieveAcitLossResDepInquiry(HashMap<String, Object> params);
	public List<LossResDepInquiry> retrieveAcitLossResDepInquiryPayt(HashMap<String, Object> params);
	public List<BookingMonth> retrieveDataCheckBookingMonth();
	public List<DataCheckScript> retrieveDataCheckScripts();
}
