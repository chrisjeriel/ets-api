package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.maintenance.AdviceWordings;
import ph.cpi.rest.api.model.maintenance.CedingCompany;
import ph.cpi.rest.api.model.maintenance.Cession;
import ph.cpi.rest.api.model.maintenance.CrestaZone;
import ph.cpi.rest.api.model.maintenance.Currency;
import ph.cpi.rest.api.model.maintenance.Deductibles;
import ph.cpi.rest.api.model.maintenance.EndtCode;
import ph.cpi.rest.api.model.maintenance.Insured;
import ph.cpi.rest.api.model.maintenance.Intermediary;
import ph.cpi.rest.api.model.maintenance.Line;
import ph.cpi.rest.api.model.maintenance.LineClass;
import ph.cpi.rest.api.model.maintenance.Object_;
import ph.cpi.rest.api.model.maintenance.Province;
import ph.cpi.rest.api.model.maintenance.QuoteWordings;
import ph.cpi.rest.api.model.maintenance.Region;
import ph.cpi.rest.api.model.maintenance.Risk;
import ph.cpi.rest.api.model.maintenance.SectionCovers;

public interface MaintenanceDao {

//	public Alop retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
//	public List<Alop> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
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
	
//	public Alop retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
//	public List<Alop> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
	public List<Intermediary> retrieveMntIntermediary(final HashMap<String, Object> params) throws SQLException;
	public List<Line> retrieveMntLine(final HashMap<String, Object> params ) throws SQLException;
	public List<LineClass> retrieveMntLineClass(final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> saveMtnRisk(final HashMap<String, Object> params ) throws SQLException;
	
}
