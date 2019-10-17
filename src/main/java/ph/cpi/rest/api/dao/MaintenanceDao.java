package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.RefCode;
import ph.cpi.rest.api.model.maintenance.AcitArSeries;
import ph.cpi.rest.api.model.maintenance.AcitChartAcct;
import ph.cpi.rest.api.model.maintenance.AcitCheckSeries;
import ph.cpi.rest.api.model.maintenance.AcitCvSeries;
import ph.cpi.rest.api.model.maintenance.AcitDCBNo;
import ph.cpi.rest.api.model.maintenance.AcitDefaultAccEntries;
import ph.cpi.rest.api.model.maintenance.AcitDefaultAmtDtl;
import ph.cpi.rest.api.model.maintenance.AcitJvSeries;
import ph.cpi.rest.api.model.maintenance.AcitTranSeries;
import ph.cpi.rest.api.model.maintenance.AcseCVSeries;
import ph.cpi.rest.api.model.maintenance.AcseCheckSeries;
import ph.cpi.rest.api.model.maintenance.AcseDCBNo;
import ph.cpi.rest.api.model.maintenance.AcseJVSeries;
import ph.cpi.rest.api.model.maintenance.AcseOrSeries;
import ph.cpi.rest.api.model.maintenance.AcseTranSeries;
import ph.cpi.rest.api.model.maintenance.AcseWhtax;
import ph.cpi.rest.api.model.maintenance.Adjuster;
import ph.cpi.rest.api.model.maintenance.AdviceWordings;
import ph.cpi.rest.api.model.maintenance.ApprovalFunction;
import ph.cpi.rest.api.model.maintenance.Approver;
import ph.cpi.rest.api.model.maintenance.ApproverFn;
import ph.cpi.rest.api.model.maintenance.Bank;
import ph.cpi.rest.api.model.maintenance.BankAcct;
import ph.cpi.rest.api.model.maintenance.BookingMonth;
import ph.cpi.rest.api.model.maintenance.BussType;
import ph.cpi.rest.api.model.maintenance.CATPeril;
import ph.cpi.rest.api.model.maintenance.CedingCompany;
import ph.cpi.rest.api.model.maintenance.CedingRetention;
import ph.cpi.rest.api.model.maintenance.Cession;
import ph.cpi.rest.api.model.maintenance.ClaimReason;
import ph.cpi.rest.api.model.maintenance.ClaimStatus;
import ph.cpi.rest.api.model.maintenance.Company;
import ph.cpi.rest.api.model.maintenance.CrestaZone;
import ph.cpi.rest.api.model.maintenance.Currency;
import ph.cpi.rest.api.model.maintenance.CurrencyRt;
import ph.cpi.rest.api.model.maintenance.DCBUser;
import ph.cpi.rest.api.model.maintenance.Deductibles;
import ph.cpi.rest.api.model.maintenance.Employee;
import ph.cpi.rest.api.model.maintenance.EndtCode;
import ph.cpi.rest.api.model.maintenance.GeneralTaxes;
import ph.cpi.rest.api.model.maintenance.Insured;
import ph.cpi.rest.api.model.maintenance.Intermediary;
import ph.cpi.rest.api.model.maintenance.InvtSecurityType;
import ph.cpi.rest.api.model.maintenance.Line;
import ph.cpi.rest.api.model.maintenance.LineClass;
import ph.cpi.rest.api.model.maintenance.MtnAcitTranType;
import ph.cpi.rest.api.model.maintenance.MtnAcseTranType;
import ph.cpi.rest.api.model.maintenance.MtnCharges;
import ph.cpi.rest.api.model.maintenance.MtnClmCashCall;
import ph.cpi.rest.api.model.maintenance.MtnClmEvent;
import ph.cpi.rest.api.model.maintenance.MtnClmEventType;
import ph.cpi.rest.api.model.maintenance.MtnCurrency;
import ph.cpi.rest.api.model.maintenance.MtnLossCd;
import ph.cpi.rest.api.model.maintenance.MtnPolWordings;
import ph.cpi.rest.api.model.maintenance.NonRenewalReason;
import ph.cpi.rest.api.model.maintenance.Object_;
import ph.cpi.rest.api.model.maintenance.Parameters;
import ph.cpi.rest.api.model.maintenance.Payee;
import ph.cpi.rest.api.model.maintenance.PayeeCeding;
import ph.cpi.rest.api.model.maintenance.PoolRetHist;
import ph.cpi.rest.api.model.maintenance.PrintableNames;
import ph.cpi.rest.api.model.maintenance.QuoteStatusReason;
import ph.cpi.rest.api.model.maintenance.QuoteWordings;
import ph.cpi.rest.api.model.maintenance.Reason;
import ph.cpi.rest.api.model.maintenance.Region;
import ph.cpi.rest.api.model.maintenance.Reports;
import ph.cpi.rest.api.model.maintenance.ReportsParam;
import ph.cpi.rest.api.model.maintenance.RetAmt;
import ph.cpi.rest.api.model.maintenance.Risk;
import ph.cpi.rest.api.model.maintenance.RoundingError;
import ph.cpi.rest.api.model.maintenance.SL;
import ph.cpi.rest.api.model.maintenance.SLType;
import ph.cpi.rest.api.model.maintenance.SecIITreatyLimit;
import ph.cpi.rest.api.model.maintenance.SectionCovers;
import ph.cpi.rest.api.model.maintenance.Spoil;
import ph.cpi.rest.api.model.maintenance.Treaty;
import ph.cpi.rest.api.model.maintenance.TreatyLimit;
import ph.cpi.rest.api.model.maintenance.TreatyShare;
import ph.cpi.rest.api.model.maintenance.UserAmtLimit;
import ph.cpi.rest.api.model.maintenance.UsersLov;
import ph.cpi.rest.api.model.maintenance.WithholdingTaxes;

public interface MaintenanceDao {

	public Risk retrieveMtnRisk(final HashMap<String, Object> params) throws SQLException;
	public List<Risk> retrieveMtnRiskListing(final HashMap<String, Object> params) throws SQLException;
	public List<SectionCovers> retrieveSectionCovers(final HashMap<String, Object> params) throws SQLException;
	public List<Cession> retrieveTypeOfCession(final HashMap<String, Object> params) throws SQLException;
	public List<Insured> retrieveMtnInsured(final HashMap<String, Object> params) throws SQLException;
	public List<EndtCode> retrieveEndtCode(final HashMap<String, Object> params) throws SQLException;
	public List<Region> retrieveMtnDistrict(final HashMap<String, Object> params) throws SQLException;
	public List<Deductibles> retrieveMtnDeductibles(final HashMap<String, Object> params) throws SQLException;
	public List<Region> retrieveMtnCityList(final HashMap<String, Object> params) throws SQLException;
	public List<CrestaZone> retrieveMtnCrestaZoneList(final HashMap<String, Object> params) throws SQLException;
	public List<Currency> retrieveMtnCurrencyList(final HashMap<String, Object> params) throws SQLException;
	public List<AdviceWordings> retrieveMaintenanceAdviceWordings(final HashMap<String, Object> params) throws SQLException;
	public List<Region> retrieveMaintenanceBlockList(final HashMap<String, Object> params) throws SQLException;
	public List<CedingCompany> retrieveMaintenanceCedingCompanyList(final HashMap<String, Object> params) throws SQLException;
	public List<CedingCompany> retrieveMaintenanceCedingCompany(final HashMap<String, Object> params) throws SQLException;
	public List<Region> retrieveMtnRegion(final HashMap<String, Object> params) throws SQLException;
	public List<Region> retrieveMtnProvince(final HashMap<String, Object> params) throws SQLException;
	public List<Object_> retrieveMtnObject(final HashMap<String, Object> params) throws SQLException;
	public List<QuoteWordings> retrieveMtnQuoteWordings(final HashMap<String, Object> params) throws SQLException;	
	public List<Intermediary> retrieveMntIntermediary(final HashMap<String, Object> params) throws SQLException;
	public List<Line> retrieveMntLine(final HashMap<String, Object> params ) throws SQLException;
	public List<LineClass> retrieveMntLineClass(final HashMap<String, Object> params ) throws SQLException;
	public Integer saveMtnLineClass(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveMtnRisk(final HashMap<String, Object> params ) throws SQLException;
	public List<Reason> retrieveMtnReason(final HashMap<String, Object> params) throws SQLException;	
	public List<Treaty> retrieveMtnTreaty(final HashMap<String, Object> params) throws SQLException;
	public List<Reports> retrieveMtnReports(final HashMap<String, Object> params) throws SQLException;	
	public List<SectionCovers> retrieveSectionCoversLov(final HashMap<String, Object> params) throws SQLException;
	public List<RefCode> retrieveRefCode(final HashMap<String, Object> params) throws SQLException;
	public List<ReportsParam> retrieveMtnReportsParam(final HashMap<String, Object> params) throws SQLException;
	public List<CATPeril> retrieveMtnCATPeril(final HashMap<String, Object> params) throws SQLException;
	public List<MtnCharges> retrieveMtnCharges(final HashMap<String, Object> params) throws SQLException;	
	public Integer saveMtnLine(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnDeductibles(final HashMap<String, Object> params) throws SQLException;	
	public List<Spoil> retrieveMtnSpoilageReason(final HashMap<String, Object> params ) throws SQLException;
	public List<MtnPolWordings> retMtnPolWordings(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> saveMtnInsured(final HashMap<String, Object> params) throws SQLException;
	public List<Insured> retMtnInsuredLov(final HashMap<String, Object> params) throws SQLException;
	public Integer retMtnInsuredLovCount(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnAdviceWordings(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnQuoteWordings(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnPolicyWordings(final HashMap<String, Object> params) throws SQLException;
	public List<MtnCurrency> retrieveMtnCurrencyListing(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveMtnCurrency(final HashMap<String, Object> params) throws SQLException;	
	public List<CurrencyRt> retrieveMtnCurrencyRt(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveMtnCurrencyRt(final HashMap<String, Object> params) throws SQLException;	
	public Integer saveMtnEndorsement(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveMtnCatPeril(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveMtnCrestaZone(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveMtnCedingCompany(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnTypeOfCession(final HashMap<String, Object> params) throws SQLException;	
	public Integer saveMtnObject(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveMtnIntermediary(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnSectionCover(final HashMap<String, Object> params) throws SQLException;
	public List<QuoteStatusReason> retMtnQuoteReason(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnQuoteReason(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnSpoilageReason(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnDistrict(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnBlock(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnOtherCharge(final HashMap<String, Object> params) throws SQLException;
	public List<UserAmtLimit> retMtnUserAmtLimit(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnUserAmtLimit(final HashMap<String, Object> params) throws SQLException;
	public List<NonRenewalReason> retriveMtnNonRenewalReason(final HashMap<String,Object> params) throws SQLException;
	public Integer saveMtnNonRenewalReason(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnRegion(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnProvince(final HashMap<String, Object> params) throws SQLException;
	public List<Treaty> retrieveMtnTreatyCommission(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnTreaty(final HashMap<String, Object> params) throws SQLException;
	public List<RetAmt> retrieveMtnRetAmt(final HashMap<String, Object> params ) throws SQLException;
	public List<TreatyShare> retrieveMtnTreatyShare(final HashMap<String, Object> params ) throws SQLException;
	public List<CedingRetention> retrieveMtnCedingRetention(final HashMap<String, Object> params ) throws SQLException;
	public Integer saveMtnTreatyShare(final HashMap<String, Object> params) throws SQLException;
	public Integer checkTreatyYear(HashMap<String, Object> params) throws SQLException;
	public Integer copyTreatyShareSetup(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnRetAmt(final HashMap<String, Object> params) throws SQLException;
	public Integer checkRetAmt(HashMap<String, Object> params) throws SQLException;
	public Integer copyRetAmtSetup(HashMap<String, Object> params) throws SQLException;
	public List<TreatyLimit> retrieveMtnTreatyLimit(final HashMap<String, Object> params ) throws SQLException;
	public List<ApprovalFunction> retrieveMtnApproval(final HashMap<String, Object> params) throws SQLException;
	public List<ApproverFn> retrieveMtnApprovalFunction(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveMtnApproval(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveMtnApprovalFunction(final HashMap<String, Object> params) throws SQLException;
	public List<UsersLov> retrieveMtnUsersLov(final HashMap<String, Object> params) throws SQLException;
	public List<Approver> retrieveApprover(final HashMap<String, Object> params) throws SQLException;
	public List<ApproverFn> retrieveApproverFn(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnApprover(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnApproverFn(final HashMap<String, Object> params) throws SQLException;
	public List<Parameters> retrieveParameters(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveMtnParameters(final HashMap<String, Object> params) throws SQLException;
	public List<RoundingError> retrieveMtnRoundingError(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveMtnRoundingError(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnReports(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnReportParam(final HashMap<String, Object> params) throws SQLException; 
	public Integer saveMtnCity(final HashMap<String, Object> params) throws SQLException;
	public List<ClaimStatus> retrieveMtnClaimStatus(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnTreatyLimit(final HashMap<String, Object> params) throws SQLException;
	public Integer checkTreatyLimit(HashMap<String, Object> params) throws SQLException;
	public Integer copyTreatyLimit(HashMap<String, Object> params) throws SQLException;
	public List<Adjuster> retrieveMtnAdjusterList(final HashMap<String, Object> params) throws SQLException;
	public Adjuster retrieveMtnAdjRepresentative(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveMtnAdjuster(final HashMap<String, Object> params) throws SQLException;
	public List<MtnClmEventType> retrieveMtnEventType(final HashMap<String, Object> params ) throws SQLException;
	public Integer saveMtnClmEventType(final HashMap<String, Object> params) throws SQLException;
	public List<MtnClmEvent> retrieveMtnEvent(final HashMap<String, Object> params ) throws SQLException;
	public Integer saveMtnClmEvent(final HashMap<String, Object> params) throws SQLException;
	public List<MtnLossCd> retrieveMtnLossCd(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnLossCd(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveMtnClaimStatus(final HashMap<String, Object> params) throws SQLException;
	public List<SecIITreatyLimit> retrieveMtnSecIITrtyLimit(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnSecIITrtyLimit(final HashMap<String, Object> params) throws SQLException;
	public Integer checkSecIITrtyLimit(HashMap<String, Object> params) throws SQLException;
	public Integer copySecIITrtyLimit(HashMap<String, Object> params) throws SQLException;
	public List<PoolRetHist> retrieveMtnPoolRetHist(final HashMap<String, Object> params) throws SQLException;
	public List<ClaimReason> retrieveMtnClaimReason(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnClaimReason(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnPoolRetHist(final HashMap<String, Object> params) throws SQLException;
	public Integer checkPoolRetHist(HashMap<String, Object> params) throws SQLException;
	public Integer copyPoolRetHist(HashMap<String, Object> params) throws SQLException;
	public List<MtnClmCashCall> retrieveMtnCashCall(final HashMap<String, Object> params ) throws SQLException;
	public Integer saveMtnClmCashCall(final HashMap<String, Object> params) throws SQLException;
	public List<MtnLossCd> retrieveMtnLossCdLov(final HashMap<String, Object> params) throws SQLException;
	public Integer copyMtnClmCashCall(HashMap<String, Object> params) throws SQLException;
	public Integer checkMtnClmCashCall(HashMap<String, Object> params) throws SQLException;
	public List<MtnClmEventType> retrieveMtnClmEventTypeLov(final HashMap<String, Object> params) throws SQLException;
	public List<MtnClmEvent> retrieveMtnClmEventLov(final HashMap<String, Object> params) throws SQLException;
	public List<MtnAcitTranType> retrieveMtnAcitTranType(final HashMap<String, Object> params ) throws SQLException;
	public List<Bank> retrieveMtnBank(final HashMap<String, Object> params) throws SQLException;
	public List<BankAcct> retrieveMtnBankAcct(final HashMap<String, Object> params) throws SQLException;
	public List<AcitDCBNo> retrieveMtnAcitDCBNo(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnAcitDCBNo(final HashMap<String, Object> params) throws SQLException;
	public List<DCBUser> retrieveMtnDCBUser(final HashMap<String, Object> params) throws SQLException;
	public List<Payee> retrieveMtnPayee(final HashMap<String, Object> params) throws SQLException;
	public List<BookingMonth> retrieveMtnBookingMonth(final HashMap<String, Object> params) throws SQLException;
	public List<AcitChartAcct> retrieveMtnAcitChartAcct(final HashMap<String, Object> params) throws SQLException;
	public List<SLType> retrieveMtnSLType(final HashMap<String, Object> params) throws SQLException;
	public List<SL> retrieveMtnSL(final HashMap<String, Object> params) throws SQLException;
	public List<PrintableNames> retrieveMtnPrintableNames (final HashMap<String, Object> params) throws SQLException;
	public List<CedingCompany> retrieveMtnCedingTreaty(final HashMap<String, Object> params) throws SQLException;
	public List<InvtSecurityType> retrieveMtnInvtSecurityType(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnBank(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnBankAcct(final HashMap<String, Object> params) throws SQLException;
	public List<Company> retrieveMtnCompany(final HashMap<String, Object> params) throws SQLException;
	public List<BussType> retrieveMtnBussType(final HashMap<String, Object> params) throws SQLException;
	public List<PayeeCeding> retrieveMtnPayeeCeding(final HashMap<String, Object> params) throws SQLException;
	public List<AcitCheckSeries> retrieveMtnAcitCheckSeries(final HashMap<String, Object> params) throws SQLException;
	public List<AcseDCBNo> retrieveMtnAcseDCBNo(final HashMap<String, Object> params) throws SQLException;
	public List<MtnAcseTranType> retrieveMtnAcseTranType(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnAcseDCBNo(final HashMap<String, Object> params) throws SQLException;
	public List<AcitArSeries> retrieveMtnAcitArSeries(final HashMap<String, Object> params) throws SQLException;
	public List<GeneralTaxes> retrieveMtnGenTax(final HashMap<String, Object> params) throws SQLException;
	public List<WithholdingTaxes> retrieveMtnWhTax(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnBussType(final HashMap<String, Object> params) throws SQLException;
	public List<AcseCheckSeries> retrieveMtnAcseCheckSeries(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> generateARSeries(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnDcbUser(final HashMap<String, Object> params) throws SQLException;
	public List<Employee> retrieveMtnEmployee(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> generateCVSeries(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> generateJVSeries(final HashMap<String, Object> params) throws SQLException;
	public List<AcitArSeries> retrieveArSeries(final HashMap<String, Object> params) throws SQLException;
	public List<AcitCvSeries> retrieveCvSeries(final HashMap<String, Object> params) throws SQLException;
	public List<AcitJvSeries> retrieveJvSeries(final HashMap<String, Object> params) throws SQLException;
	public AcitTranSeries maxTranNo(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> generateAcseCVSeries(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> generateAcseJVSeries(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> generateAcseORSeries(final HashMap<String, Object> params) throws SQLException;
	public List<AcseOrSeries> retrieveAcseOrSeries(final HashMap<String, Object> params) throws SQLException;
	public List<AcseCVSeries> retrieveAcseCVSeries(final HashMap<String, Object> params) throws SQLException;
	public List<AcseJVSeries> retrieveAcseJVSeries(final HashMap<String, Object> params) throws SQLException;
	public AcseTranSeries acseMaxTranNo(final HashMap<String, Object> params) throws SQLException;
	public List<AcseWhtax> retrieveAcseWHTax(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String,Object> saveMtnWhTax(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String,Object> saveMtnTranType(final HashMap<String,Object> params) throws SQLException;
	public List<AcitDefaultAmtDtl> retrieveAcitDefAmt(final HashMap<String,Object> params) throws SQLException;
	public Integer saveMtnEmployee(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String,Object> saveMtnAcitDefAmt(final HashMap<String, Object> params) throws SQLException;
	public List<AcitDefaultAccEntries> retrieveAcitDefAcctEnt(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String,Object> saveAcitDefAcctEnt(final HashMap<String, Object> params) throws SQLException;
}
