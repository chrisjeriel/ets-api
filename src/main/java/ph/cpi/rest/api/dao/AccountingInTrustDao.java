package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.ACITSOATreatyDetails;
import ph.cpi.rest.api.model.accountingintrust.AcctServFeeDist;
import ph.cpi.rest.api.model.accountingintrust.AcitAcctEntries;
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
import ph.cpi.rest.api.model.accountingintrust.AcitClmResHistPayts;
import ph.cpi.rest.api.model.accountingintrust.AcitCv;
import ph.cpi.rest.api.model.accountingintrust.AcitCvPaytReq;
import ph.cpi.rest.api.model.accountingintrust.AcitEomMonthlyTotals;
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
import ph.cpi.rest.api.model.accountingintrust.AcitJVinvPullOut;
import ph.cpi.rest.api.model.accountingintrust.AcitJvAllInvtIncome;
import ph.cpi.rest.api.model.accountingintrust.AcitPaytReq;
import ph.cpi.rest.api.model.accountingintrust.AcitProfCommDtl;
import ph.cpi.rest.api.model.accountingintrust.AcitProfCommSumm;
import ph.cpi.rest.api.model.accountingintrust.AcitPrqInwPol;
import ph.cpi.rest.api.model.accountingintrust.AcitPrqTrans;
import ph.cpi.rest.api.model.accountingintrust.AcitSOAAgingDetails;
import ph.cpi.rest.api.model.accountingintrust.AcitTransactions;
import ph.cpi.rest.api.model.accountingintrust.AcitUPRPerLine;
import ph.cpi.rest.api.model.accountingintrust.AcitUPRPerPolicy;
import ph.cpi.rest.api.model.accountingintrust.AcknowledgementReceipt;
import ph.cpi.rest.api.model.accountingintrust.GenUPRParams;
import ph.cpi.rest.api.model.accountingintrust.QSOA;
import ph.cpi.rest.api.model.accountingintrust.RefNoLov;
import ph.cpi.rest.api.model.accountingintrust.AcitEomUnpostedMonth;
import ph.cpi.rest.api.model.maintenance.UserId;

public interface AccountingInTrustDao {
	public List<AcitCvPaytReq> retrieveAcitCvPaytReqList(final HashMap<String, Object> params ) throws SQLException;
	public List<AcitPaytReq> retrieveAcitPaytReq(final HashMap<String, Object> params) throws SQLException;
	public List<AcitTransactions> retrieveAcitJVListings(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveAcitPaytReq(final HashMap<String, Object> params) throws SQLException;

//	public List<AcitProfCommSumm> retrieveProfCommSumm(final HashMap<String, Object> params ) throws SQLException;
//	public List<AcitProfCommDtl> retrieveProfCommDtl(final HashMap<String, Object> params ) throws SQLException;
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
	public Integer saveAcitQSOA(final HashMap<String, Object> params) throws SQLException;
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
	
	
	public Integer updateSoaCv(final HashMap<String, Object> params) throws SQLException;
}
