package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.RefCode;
import ph.cpi.rest.api.model.maintenance.AdviceWordings;
import ph.cpi.rest.api.model.maintenance.ApprovalFunction;
import ph.cpi.rest.api.model.maintenance.Approver;
import ph.cpi.rest.api.model.maintenance.ApproverFn;
import ph.cpi.rest.api.model.maintenance.CATPeril;
import ph.cpi.rest.api.model.maintenance.CedingCompany;
import ph.cpi.rest.api.model.maintenance.Cession;
import ph.cpi.rest.api.model.maintenance.CrestaZone;
import ph.cpi.rest.api.model.maintenance.Currency;
import ph.cpi.rest.api.model.maintenance.CurrencyRt;
import ph.cpi.rest.api.model.maintenance.Deductibles;
import ph.cpi.rest.api.model.maintenance.EndtCode;
import ph.cpi.rest.api.model.maintenance.Insured;
import ph.cpi.rest.api.model.maintenance.Intermediary;
import ph.cpi.rest.api.model.maintenance.Line;
import ph.cpi.rest.api.model.maintenance.LineClass;
import ph.cpi.rest.api.model.maintenance.MtnCharges;
import ph.cpi.rest.api.model.maintenance.MtnCurrency;
import ph.cpi.rest.api.model.maintenance.MtnPolWordings;
import ph.cpi.rest.api.model.maintenance.NonRenewalReason;
import ph.cpi.rest.api.model.maintenance.Object_;
import ph.cpi.rest.api.model.maintenance.QuoteStatusReason;
import ph.cpi.rest.api.model.maintenance.QuoteWordings;
import ph.cpi.rest.api.model.maintenance.Reason;
import ph.cpi.rest.api.model.maintenance.Region;
import ph.cpi.rest.api.model.maintenance.Reports;
import ph.cpi.rest.api.model.maintenance.ReportsParam;
import ph.cpi.rest.api.model.maintenance.Risk;
import ph.cpi.rest.api.model.maintenance.SectionCovers;
import ph.cpi.rest.api.model.maintenance.Spoil;
import ph.cpi.rest.api.model.maintenance.Treaty;
import ph.cpi.rest.api.model.maintenance.UserAmtLimit;
import ph.cpi.rest.api.model.maintenance.UsersLov;

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
	public List<Treaty> retrieveMtnTreaty() throws SQLException;
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
	public List<ApprovalFunction> retrieveMtnApproval(final HashMap<String, Object> params) throws SQLException;
	public List<ApproverFn> retrieveMtnApprovalFunction(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveMtnApproval(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveMtnApprovalFunction(final HashMap<String, Object> params) throws SQLException;
	public List<UsersLov> retrieveMtnUsersLov(final HashMap<String, Object> params) throws SQLException;
	
	public List<Approver> retrieveApprover(final HashMap<String, Object> params) throws SQLException;
	public List<ApproverFn> retrieveApproverFn(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnApprover(final HashMap<String, Object> params) throws SQLException;
}
