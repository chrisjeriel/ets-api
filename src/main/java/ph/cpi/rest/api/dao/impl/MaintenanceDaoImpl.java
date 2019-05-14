package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.MaintenanceDao;
import ph.cpi.rest.api.model.RefCode;
import ph.cpi.rest.api.model.maintenance.AdviceWordings;
import ph.cpi.rest.api.model.maintenance.CATPeril;
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
import ph.cpi.rest.api.model.maintenance.MtnCharges;
import ph.cpi.rest.api.model.maintenance.MtnPolWordings;
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

@Component
public class MaintenanceDaoImpl implements MaintenanceDao{

	@Autowired
	private SqlSession sqlSession;

	private static final Logger logger = LoggerFactory.getLogger(MaintenanceDaoImpl.class);
	/*@Override
	public AlopSample retrieveQuoteAlop(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Alop alopSample = sqlSession.selectOne("retrieveMaintenanceSample", params);
		return alopSample;

	}

	@Override
	public List<AlopSample> retrieveQuoteAlopList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<AlopSample> alopList = sqlSession.selectList("retrieveMaintenanceSample", params);
		return alopList;
	}*/


	@Override
	public List<AdviceWordings> retrieveMaintenanceAdviceWordings(HashMap<String, Object> params) throws SQLException {
		List<AdviceWordings> adviceWordingsList = sqlSession.selectList("retMtnAdviceWordings", params);
		return adviceWordingsList;
	}
	
	@Override
	public List<Insured> retrieveMtnInsured(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Insured> insured = sqlSession.selectList("retrieveMtnInsured", params);
		return insured;
	}

	@Override
	public List<EndtCode> retrieveEndtCode(HashMap<String, Object> params) throws SQLException {
		List<EndtCode> endtCode = sqlSession.selectList("retrieveEndtCode", params);
		return endtCode;
	}

	@Override
	public Risk retrieveMtnRisk(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Risk risk = sqlSession.selectOne("retrieveMtnRisk", params);
		return risk;
	}
	
	@Override
	public List<Risk> retrieveMtnRiskListing(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Risk> riskList = sqlSession.selectList("retrieveMtnRiskListing", params);
		return riskList;
	}

	public List<Region> retrieveMtnRegion(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Region> region = sqlSession.selectList("retrieveMtnRegion", params);;
		return region;
	}

	@Override
	public List<Region> retrieveMtnProvince(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Region> province = sqlSession.selectList("retrieveMtnProvince", params);
		return province;
	}

	@Override
	public List<Object_> retrieveMtnObject(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Object_> object = sqlSession.selectList("retrieveMtnObject", params);
		return object;
	}

	@Override
	public List<QuoteWordings> retrieveMtnQuoteWordings(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<QuoteWordings> listQuoteWordings = sqlSession.selectList("retrieveMtnQuoteWordings", params);
		return listQuoteWordings;
	}

	@Override
	public List<SectionCovers> retrieveSectionCovers(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<SectionCovers> sectionCovers = sqlSession.selectList("retrieveMtnSectionCovers", params);
		return sectionCovers;
	}

	@Override
	public List<Cession> retrieveTypeOfCession(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Cession> cessionList = sqlSession.selectList("retrieveMtnTypeOfCession", params);
		return cessionList;
	}

	public List<Region> retrieveMtnDistrict(HashMap<String, Object> params) throws SQLException {
		List<Region> district = sqlSession.selectList("retrieveMtnDistrict",params);
		return district;
	}

	@Override
	public List<Deductibles> retrieveMtnDeductibles(HashMap<String, Object> params) throws SQLException {
		List<Deductibles> deductibles = sqlSession.selectList("retrieveMtnDeductibles",params);
		return deductibles;
	}
	
	public List<Region> retrieveMtnCityList(final HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Region> cityList = sqlSession.selectList("retrieveMtnCity", params);
		return cityList;
	}
	
	@Override
	public List<CrestaZone> retrieveMtnCrestaZoneList(final HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<CrestaZone> crestaZoneList = sqlSession.selectList("retrieveMtnCrestaZone", params);
		return crestaZoneList;
	}
	
	@Override
	public List<Currency> retrieveMtnCurrencyList(final HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Currency> currencyList = sqlSession.selectList("retrieveMtnCurrency", params);
		return currencyList;
	}

	public List<Region> retrieveMaintenanceBlockList(HashMap<String, Object> params) throws SQLException {
			List<Region> blockList = sqlSession.selectList("retrieveMtnBlock",params);
		return blockList;
	}

	@Override
	public List<CedingCompany> retrieveMaintenanceCedingCompanyList(HashMap<String, Object> params) throws SQLException {
			List<CedingCompany> cedingCompanyListing = sqlSession.selectList("retMtnCedingCompanyListing", params);
		return cedingCompanyListing;
	}

	@Override
	public List<CedingCompany> retrieveMaintenanceCedingCompany(HashMap<String, Object> params) throws SQLException {
			List<CedingCompany> cedingCompany = sqlSession.selectList("retMtnCedingCompany",params);
		return cedingCompany;
	}


	/*@Override
	public CedingCompany retrieveMaintenanceCedingCompany(HashMap<String, Object> params) throws SQLException {
		CedingCompany cedingCompany = sqlSession.selectOne("retrieveMaintenanceCedingCompany",params);
		return cedingCompany;
	}

	@Override
	public List<CedingCompany> retrieveMaintenanceCedingCompanyList(HashMap<String, Object> params)
			throws SQLException {
		List<CedingCompany> cedingCompanyList = sqlSession.selectList("retrieveMaintenanceCedingCompany", params);
		return cedingCompanyList;
	}*/

	@Override
	public List<Intermediary> retrieveMntIntermediary(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Intermediary> intermediary = sqlSession.selectList("retrieveMntIntermediary", params);
		System.out.println("retrieveMntIntermediaryDAO : " + intermediary);
		return intermediary;
	}

	@Override
	public List<Line> retrieveMntLine(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Line> line = sqlSession.selectList("retrieveMntLine", params);
		return line;
	}

	@Override
	public List<LineClass> retrieveMntLineClass(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<LineClass> lineClass = sqlSession.selectList("retrieveMntLineClass", params);
		System.out.println("retrieveMntLineClassDao : " + lineClass);
		return lineClass;
	}

	@Override
	public HashMap<String, Object> saveMtnRisk(HashMap<String, Object> params) throws SQLException {
		logger.info("saveMtnRisk DAOImpl : " + params);
		Integer saveMtnRisk = sqlSession.update("saveMtnRisk", params);
		params.put("errorCode", saveMtnRisk);
		return params;
	}

	@Override
	public List<Reason> retrieveMtnReason(HashMap<String, Object> params) throws SQLException {
		List<Reason> reason = sqlSession.selectList("retrieveMtnReason",params);
		System.out.println("retrieveMtnReason: " + reason);
		return reason;
	}
	
	public List<Treaty> retrieveMtnTreaty() throws SQLException {
		List<Treaty> treatyList = sqlSession.selectList("retrieveMtnTreaty");
		logger.info("retrieveMtnTreaty treatyList : " + treatyList);
		return treatyList;
	}

	@Override
	public List<Reports> retrieveMtnReports(HashMap<String, Object> params) throws SQLException {
		List<Reports> reports = sqlSession.selectList("retrieveMtnReports",params);
		return reports;
	}

	@Override
	public List<SectionCovers> retrieveSectionCoversLov(HashMap<String, Object> params) throws SQLException {
		List<SectionCovers> sectionCovers = sqlSession.selectList("retrieveMtnSectionCoversLov", params);
		return sectionCovers;
	}
	
	@Override
	public List<RefCode> retrieveRefCode(final HashMap<String, Object> params) throws SQLException{
		List<RefCode> refCode = sqlSession.selectList("retrieveRefCode", params);
		return refCode;
	}
	
	@Override
	public List<ReportsParam> retrieveMtnReportsParam(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<ReportsParam> reportsParam = sqlSession.selectList("retrieveMtnReportsParam", params);
		return reportsParam;
	}

	@Override
	public Integer saveMtnLine(HashMap<String, Object> params) throws SQLException {
		Integer saveMtnLine = sqlSession.update("saveMtnLine",params);
		return saveMtnLine;
	}
	
	@Override
	public List<CATPeril> retrieveMtnCATPeril(HashMap<String, Object> params) throws SQLException {
		List<CATPeril> catPeril = sqlSession.selectList("retrieveMtnCATPeril",params);
		return catPeril;
	}

	@Override
	public List<MtnCharges> retrieveMtnCharges(HashMap<String, Object> params) throws SQLException {
		List<MtnCharges> charges = sqlSession.selectList("retrieveMtnCharges",params);
		return charges;
	}

	@Override
	public Integer saveMtnDeductibles(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnDeductibles",params);
		return errorCode;
	}

	@Override
	public List<Spoil> retrieveMtnSpoilageReason(HashMap<String, Object> params) throws SQLException {
		List<Spoil> spoilList = sqlSession.selectList("retrieveMtnSpoilageReason",params);
		return spoilList;
	}

	@Override
	public List<MtnPolWordings> retMtnPolWordings(HashMap<String, Object> params) throws SQLException {
		List<MtnPolWordings> mtnPolWordings = sqlSession.selectList("retMtnPolWordings",params);
		return mtnPolWordings;
	}
	
	@Override
	public HashMap<String, Object> saveMtnInsured(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnInsured",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<Insured> retMtnInsuredLov(HashMap<String, Object> params) throws SQLException {
		List<Insured> list = sqlSession.selectList("retMtnInsuredLov",params);
		return list;
	}

	@Override
	public Integer retMtnInsuredLovCount(HashMap<String, Object> params) throws SQLException {
		Integer count = sqlSession.selectOne("retMtnInsuredLovCount", params);
		return count;
	}

	@Override
	public Integer saveMtnAdviceWordings(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer count = sqlSession.update("saveMtnAdvWord", params);
		return count;
	}
	
	@Override
	public Integer saveMtnEndorsement(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("saveMtnEndorsement",params);
		return code;
	}

	@Override
	public Integer saveMtnSectionCover(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("saveMtnSectionCover",params);
		return code;
	}

	@Override
	public List<QuoteStatusReason> retMtnQuoteReason(HashMap<String, Object> params) throws SQLException {
		List<QuoteStatusReason> list = sqlSession.selectList("retMtnQuoteReason",params);
		return list;
	}

	@Override
	public Integer saveMtnQuoteReason(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("saveMtnQuoteReason",params);
		return code;
	}
	
	@Override
	public Integer saveMtnSpoilageReason(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("saveMtnSpoilageReason",params);
		return code;
	}

	@Override
	public Integer saveMtnDistrict(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("saveMtnDistrict",params);
		return code;
	}
	
}
