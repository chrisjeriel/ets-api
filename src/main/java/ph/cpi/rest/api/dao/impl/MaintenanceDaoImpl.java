
package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import ph.cpi.rest.api.dao.MaintenanceDao;
import ph.cpi.rest.api.model.RefCode;
import ph.cpi.rest.api.model.maintenance.AcitArSeries;
import ph.cpi.rest.api.model.maintenance.AcitChartAcct;
import ph.cpi.rest.api.model.maintenance.AcitCheckSeries;
import ph.cpi.rest.api.model.maintenance.AcitDCBNo;
import ph.cpi.rest.api.model.maintenance.AcseCheckSeries;
import ph.cpi.rest.api.model.maintenance.AcseDCBNo;
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

@Component
public class MaintenanceDaoImpl implements MaintenanceDao {

	@Autowired
	private SqlSession sqlSession;

	private static final Logger logger = LoggerFactory.getLogger(MaintenanceDaoImpl.class);
	/*
	 * @Override public AlopSample retrieveQuoteAlop(HashMap<String, Object>
	 * params) throws SQLException { // TODO Auto-generated method stub Alop
	 * alopSample = sqlSession.selectOne("retrieveMaintenanceSample", params);
	 * return alopSample;
	 * 
	 * }
	 * 
	 * @Override public List<AlopSample> retrieveQuoteAlopList(HashMap<String,
	 * Object> params) throws SQLException { // TODO Auto-generated method stub
	 * List<AlopSample> alopList =
	 * sqlSession.selectList("retrieveMaintenanceSample", params); return
	 * alopList; }
	 */

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
		List<Region> region = sqlSession.selectList("retrieveMtnRegion", params);
		;
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
		List<Region> district = sqlSession.selectList("retrieveMtnDistrict", params);
		return district;
	}

	@Override
	public List<Deductibles> retrieveMtnDeductibles(HashMap<String, Object> params) throws SQLException {
		List<Deductibles> deductibles = sqlSession.selectList("retrieveMtnDeductibles", params);
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
		List<Region> blockList = sqlSession.selectList("retrieveMtnBlock", params);
		return blockList;
	}

	@Override
	public List<CedingCompany> retrieveMaintenanceCedingCompanyList(HashMap<String, Object> params)
			throws SQLException {
		List<CedingCompany> cedingCompanyListing = sqlSession.selectList("retMtnCedingCompanyListing", params);
		return cedingCompanyListing;
	}

	@Override
	public List<CedingCompany> retrieveMaintenanceCedingCompany(HashMap<String, Object> params) throws SQLException {
		List<CedingCompany> cedingCompany = sqlSession.selectList("retMtnCedingCompany", params);
		return cedingCompany;
	}

	/*
	 * @Override public CedingCompany
	 * retrieveMaintenanceCedingCompany(HashMap<String, Object> params) throws
	 * SQLException { CedingCompany cedingCompany =
	 * sqlSession.selectOne("retrieveMaintenanceCedingCompany",params); return
	 * cedingCompany; }
	 * 
	 * @Override public List<CedingCompany>
	 * retrieveMaintenanceCedingCompanyList(HashMap<String, Object> params)
	 * throws SQLException { List<CedingCompany> cedingCompanyList =
	 * sqlSession.selectList("retrieveMaintenanceCedingCompany", params); return
	 * cedingCompanyList; }
	 */

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
	public Integer saveMtnLineClass(HashMap<String, Object> params) throws SQLException {
		logger.info("saveMtnLineClassDAOImpl : " + params);
		Integer errorCode = sqlSession.update("saveMtnLineClass", params);
		return errorCode;
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
		List<Reason> reason = sqlSession.selectList("retrieveMtnReason", params);
		System.out.println("retrieveMtnReason: " + reason);
		return reason;
	}

	public List<Treaty> retrieveMtnTreaty(HashMap<String, Object> params) throws SQLException {
		List<Treaty> treatyList = sqlSession.selectList("retrieveMtnTreaty", params);
		logger.info("retrieveMtnTreaty treatyList : " + treatyList);
		return treatyList;
	}

	@Override
	public List<Reports> retrieveMtnReports(HashMap<String, Object> params) throws SQLException {
		List<Reports> reports = sqlSession.selectList("retMtnReport", params);
		return reports;
	}

	@Override
	public List<SectionCovers> retrieveSectionCoversLov(HashMap<String, Object> params) throws SQLException {
		List<SectionCovers> sectionCovers = sqlSession.selectList("retrieveMtnSectionCoversLov", params);
		return sectionCovers;
	}

	@Override
	public List<RefCode> retrieveRefCode(final HashMap<String, Object> params) throws SQLException {
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
		Integer saveMtnLine = sqlSession.update("saveMtnLine", params);
		return saveMtnLine;
	}

	@Override
	public List<CATPeril> retrieveMtnCATPeril(HashMap<String, Object> params) throws SQLException {
		List<CATPeril> catPeril = sqlSession.selectList("retrieveMtnCATPeril", params);
		return catPeril;
	}

	@Override
	public List<MtnCharges> retrieveMtnCharges(HashMap<String, Object> params) throws SQLException {
		List<MtnCharges> charges = sqlSession.selectList("retrieveMtnCharges", params);
		return charges;
	}

	@Override
	public Integer saveMtnDeductibles(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnDeductibles", params);
		return errorCode;
	}

	@Override
	public List<Spoil> retrieveMtnSpoilageReason(HashMap<String, Object> params) throws SQLException {
		List<Spoil> spoilList = sqlSession.selectList("retrieveMtnSpoilageReason", params);
		return spoilList;
	}

	@Override
	public List<MtnPolWordings> retMtnPolWordings(HashMap<String, Object> params) throws SQLException {
		List<MtnPolWordings> mtnPolWordings = sqlSession.selectList("retMtnPolWordings", params);
		return mtnPolWordings;
	}

	@Override
	public HashMap<String, Object> saveMtnInsured(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnInsured", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public Integer saveMtnTypeOfCession(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnTypeOfCession", params);
		return errorCode;
	}

	@Override
	public List<Insured> retMtnInsuredLov(HashMap<String, Object> params) throws SQLException {
		List<Insured> list = sqlSession.selectList("retMtnInsuredLov", params);
		return list;
	}

	@Override
	public Integer retMtnInsuredLovCount(HashMap<String, Object> params) throws SQLException {
		Integer count = sqlSession.selectOne("retMtnInsuredLovCount", params);
		return count;
	}

	@Override
	public HashMap<String, Object> saveMtnIntermediary(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnIntermediary", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public Integer saveMtnAdviceWordings(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer count = sqlSession.update("saveMtnAdvWord", params);
		return count;
	}

	@Override
	public Integer saveMtnQuoteWordings(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveMtnQuoteWordings", params);
		return res;
	}

	@Override
	public HashMap<String, Object> saveMtnCedingCompany(HashMap<String, Object> params) throws SQLException {
		Integer count = sqlSession.update("saveMtnCedingCompany", params);
		params.put("errorCode", count);
		return params;
	}

	@Override
	public List<MtnCurrency> retrieveMtnCurrencyListing(HashMap<String, Object> params) throws SQLException {
		List<MtnCurrency> currencyList = sqlSession.selectList("retrieveMtnCurrencyList", params);
		return currencyList;
	}

	@Override
	public HashMap<String, Object> saveMtnCurrency(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnCurrency", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<CurrencyRt> retrieveMtnCurrencyRt(HashMap<String, Object> params) throws SQLException {
		List<CurrencyRt> currencyRt = sqlSession.selectList("retrieveMtnCurrencyRt", params);
		logger.info("retrieveMtnCurrencyRt DAOImpl : " + currencyRt);
		return currencyRt;
	}

	@Override
	public HashMap<String, Object> saveMtnCurrencyRt(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnCurrencyRt", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public Integer saveMtnEndorsement(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("saveMtnEndorsement", params);
		return code;

	}

	@Override
	public HashMap<String, Object> saveMtnCatPeril(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnCatPeril", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> saveMtnCrestaZone(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnCresta", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public Integer saveMtnSectionCover(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("saveMtnSectionCover", params);
		return code;
	}

	@Override
	public List<QuoteStatusReason> retMtnQuoteReason(HashMap<String, Object> params) throws SQLException {
		List<QuoteStatusReason> list = sqlSession.selectList("retMtnQuoteReason", params);
		return list;
	}

	@Override
	public Integer saveMtnQuoteReason(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("saveMtnQuoteReason", params);
		return code;
	}

	@Override
	public Integer saveMtnSpoilageReason(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("saveMtnSpoilageReason", params);
		return code;
	}

	@Override
	public Integer saveMtnDistrict(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("saveMtnDistrict", params);
		return code;
	}

	@Override
	public Integer saveMtnBlock(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("saveMtnBlock", params);
		return code;
	}

	@Override
	public Integer saveMtnPolicyWordings(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveMtnPolicyWordings", params);
		return res;
	}

	@Override
	public Integer saveMtnOtherCharge(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveMtnOtherCharge", params);
		return res;
	}

	@Override
	public Integer saveMtnObject(HashMap<String, Object> params) throws SQLException {
		logger.info("saveMtnObjectDAOImpl : " + params);
		Integer errorCode = sqlSession.update("saveMtnObject", params);
		return errorCode;
	}

	@Override
	public Integer saveMtnRegion(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer errorCode = sqlSession.update("saveMtnRegion", params);
		return errorCode;
	}

	@Override
	public List<UserAmtLimit> retMtnUserAmtLimit(HashMap<String, Object> params) throws SQLException {
		List<UserAmtLimit> list = sqlSession.selectList("retMtnUserAmtLimit", params);
		return list;
	}

	@Override
	public Integer saveMtnUserAmtLimit(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("saveMtnUserAmtLimit", params);
		return code;
	}

	@Override
	public List<NonRenewalReason> retriveMtnNonRenewalReason(HashMap<String, Object> params) throws SQLException {
		List<NonRenewalReason> nonRenewalReasonList = sqlSession.selectList("retMtnNonRenewReason", params);
		return nonRenewalReasonList;
	}

	@Override
	public Integer saveMtnNonRenewalReason(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnNonRenewalReason", params);
		return errorCode;
	}

	@Override
	public Integer saveMtnProvince(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer errorCode = sqlSession.update("saveMtnProvince", params);
		return errorCode;
	}

	@Override
	public List<Treaty> retrieveMtnTreatyCommission(HashMap<String, Object> params) throws SQLException {
		List<Treaty> list = sqlSession.selectList("retrieveMtnTreatyCom", params);
		return list;
	}

	@Override
	public Integer saveMtnTreaty(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveMtnTreaty", params);
		return res;
	}

	@Override
	public List<RetAmt> retrieveMtnRetAmt(HashMap<String, Object> params) throws SQLException {
		List<RetAmt> res = sqlSession.selectList("retrieveMtnRetAmt", params);
		return res;
	}

	@Override
	public List<TreatyShare> retrieveMtnTreatyShare(HashMap<String, Object> params) throws SQLException {
		List<TreatyShare> res = sqlSession.selectList("retrieveMtnTreatyShare", params);
		return res;
	}

	@Override
	public List<CedingRetention> retrieveMtnCedingRetention(HashMap<String, Object> params) throws SQLException {
		List<CedingRetention> res = sqlSession.selectList("retrieveMtnCedingRetention", params);
		return res;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Integer saveMtnTreatyShare(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveMtnTreatyComm", params);
		// sqlSession.update("saveMtnTreatyShare", params);
		// sqlSession.update("saveMtnCedRetention", params);
		return res;
	}

	@Override
	public Integer checkTreatyYear(HashMap<String, Object> params) throws SQLException {
		params.put("checkResult", "");
		sqlSession.selectOne("checkTreatyYear", params);
		Integer res = (Integer) params.get("checkResult");
		return res;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Integer copyTreatyShareSetup(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("copyMtnTreatyComm", params);
		sqlSession.update("copyMtnTreatyShare", params);
		sqlSession.update("copyMtnCedRetention", params);
		return res;
	}

	@Override
	public Integer saveMtnRetAmt(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveMtnRetAmt", params);
		return res;
	}

	@Override
	public Integer checkRetAmt(HashMap<String, Object> params) throws SQLException {
		params.put("checkResult", "");
		sqlSession.selectOne("checkRetAmt", params);
		Integer res = (Integer) params.get("checkResult");
		return res;
	}

	@Override
	public Integer copyRetAmtSetup(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("copyRetAmtSetup", params);
		return res;
	}

	@Override
	public List<ApprovalFunction> retrieveMtnApproval(HashMap<String, Object> params) throws SQLException {
		List<ApprovalFunction> list = sqlSession.selectList("retrieveMtnApproval", params);
		return list;
	}

	@Override
	public List<ApproverFn> retrieveMtnApprovalFunction(HashMap<String, Object> params) throws SQLException {
		List<ApproverFn> list = sqlSession.selectList("retrieveMtnApprovalFunction", params);
		return list;
	}

	@Override
	public HashMap<String, Object> saveMtnApproval(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnApproval", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> saveMtnApprovalFunction(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnApprovalFunction", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<UsersLov> retrieveMtnUsersLov(HashMap<String, Object> params) throws SQLException {
		List<UsersLov> list = sqlSession.selectList("retrieveMtnUsersLov", params);
		return list;
	}

	@Override
	public List<Approver> retrieveApprover(final HashMap<String, Object> params) throws SQLException {
		List<Approver> list = sqlSession.selectList("retrieveApprover", params);
		return list;
	}

	@Override
	public List<ApproverFn> retrieveApproverFn(HashMap<String, Object> params) throws SQLException {
		List<ApproverFn> list = sqlSession.selectList("retrieveApproverFn", params);
		return list;
	}

	@Override
	public Integer saveMtnApprover(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnApprover", params);
		return errorCode;
	}

	@Override
	public List<TreatyLimit> retrieveMtnTreatyLimit(HashMap<String, Object> params) throws SQLException {
		List<TreatyLimit> res = sqlSession.selectList("retrieveMtnTreatyLimit", params);
		return res;
	}

	@Override
	public Integer saveMtnApproverFn(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnApproverFn", params);
		return errorCode;
	}

	@Override
	public List<Parameters> retrieveParameters(HashMap<String, Object> params) throws SQLException {
		List<Parameters> list = sqlSession.selectList("retrieveMtnParameters", params);
		return list;
	}

	@Override
	public HashMap<String, Object> saveMtnParameters(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnParameters", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<RoundingError> retrieveMtnRoundingError(HashMap<String, Object> params) throws SQLException {
		List<RoundingError> list = sqlSession.selectList("retrieveMtnRoundingError", params);
		return list;
	}

	@Override
	public HashMap<String, Object> saveMtnRoundingError(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnRoundingError", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public Integer saveMtnReports(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveMtnReports", params);
		return res;
	}

	@Override
	public Integer saveMtnReportParam(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveMtnReportParam", params);
		return res;
	}

	@Override
	public Integer saveMtnCity(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer errorCode = sqlSession.update("saveMtnCity", params);
		return errorCode;
	}

	@Override
	public List<ClaimStatus> retrieveMtnClaimStatus(HashMap<String, Object> params) throws SQLException {
		List<ClaimStatus> list = sqlSession.selectList("retrieveMtnClaimStatus", params);
		return list;
	}

	@Override
	public List<MtnLossCd> retrieveMtnLossCd(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<MtnLossCd> list = sqlSession.selectList("retrieveMtnLossCd", params);
		return list;
	}

	@Override
	public Integer saveMtnTreatyLimit(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveMtnTreatyLimit", params);
		System.out.println(params);
		return res;
	}

	@Override
	public List<Adjuster> retrieveMtnAdjusterList(HashMap<String, Object> params) throws SQLException {
		List<Adjuster> res = sqlSession.selectList("retMtnAdjList", params);
		return res;
	}

	@Override
	public Integer checkTreatyLimit(HashMap<String, Object> params) throws SQLException {
		params.put("checkResult", "");
		sqlSession.selectOne("checkTreatyLimit", params);
		Integer res = (Integer) params.get("checkResult");
		return res;
	}

	@Override
	public Adjuster retrieveMtnAdjRepresentative(HashMap<String, Object> params) throws SQLException {
		Adjuster res = sqlSession.selectOne("retMtnAdj", params);
		return res;
	}

	@Override
	public Integer copyTreatyLimit(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("copyTreatyLimit", params);
		return res;
	}

	@Override
	public HashMap<String, Object> saveMtnAdjuster(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveMtnAdjuster", params);
		params.put("errorCode", res);
		return params;
	}

	@Override
	public List<MtnClmEventType> retrieveMtnEventType(HashMap<String, Object> params) throws SQLException {
		List<MtnClmEventType> eventTypeList = sqlSession.selectList("retrieveMtnClmEventType", params);
		return eventTypeList;
	}

	@Override
	public Integer saveMtnClmEventType(HashMap<String, Object> params) throws SQLException {
		Integer saveMtnClmEventType = sqlSession.update("saveMtnClmEventType", params);
		return saveMtnClmEventType;
	}

	@Override
	public List<MtnClmEvent> retrieveMtnEvent(HashMap<String, Object> params) throws SQLException {
		List<MtnClmEvent> eventList = sqlSession.selectList("retrieveMtnClmEvent", params);
		return eventList;
	}

	@Override
	public Integer saveMtnClmEvent(HashMap<String, Object> params) throws SQLException {
		Integer saveMtnClmEvent = sqlSession.update("saveMtnClmEvent", params);
		return saveMtnClmEvent;
	}

	@Override
	public Integer saveMtnLossCd(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer errorCode = sqlSession.update("saveMtnLossCd", params);
		return errorCode;
	}

	@Override
	public HashMap<String, Object> saveMtnClaimStatus(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveMtnClaimStatus", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<SecIITreatyLimit> retrieveMtnSecIITrtyLimit(HashMap<String, Object> params) throws SQLException {
		List<SecIITreatyLimit> res = sqlSession.selectList("retrieveMtnSecIITrtyLimit", params);
		return res;
	}

	@Override
	public Integer saveMtnSecIITrtyLimit(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveMtnSecIITrtyLimit", params);
		return res;
	}

	@Override
	public Integer checkSecIITrtyLimit(HashMap<String, Object> params) throws SQLException {
		params.put("checkResult", "");
		sqlSession.selectOne("checkSecIITrtyLimit", params);
		Integer res = (Integer) params.get("checkResult");
		return res;
	}

	@Override
	public Integer copySecIITrtyLimit(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("copySecIITrtyLimit", params);
		return res;
	}

	@Override
	public List<PoolRetHist> retrieveMtnPoolRetHist(HashMap<String, Object> params) throws SQLException {
		List<PoolRetHist> res = sqlSession.selectList("retrieveMtnPoolRetHist", params);
		return res;
	}

	@Override
	public List<ClaimReason> retrieveMtnClaimReason(HashMap<String, Object> params) throws SQLException {
		List<ClaimReason> res = sqlSession.selectList("retrieveMtnClmReason",params);
		return res;
	}
	
	@Override
	public Integer saveMtnPoolRetHist(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveMtnPoolRetHist", params);
		return res;
	}

	@Override
	public Integer saveMtnClaimReason(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveMtnClmReason", params);
		return res;
	}
	
	@Override
	public Integer checkPoolRetHist(HashMap<String, Object> params) throws SQLException {
		params.put("checkResult", "");
		sqlSession.selectOne("checkPoolRetHist", params);
		Integer res = (Integer) params.get("checkResult");
		return res;
	}

	@Override
	public Integer copyPoolRetHist(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("copyPoolRetHist", params);
		return res;
	}
	@Override
	public List<MtnLossCd> retrieveMtnLossCdLov(HashMap<String, Object> params) throws SQLException {
		List<MtnLossCd> list = sqlSession.selectList("retrieveMtnLossCdLov", params);
		return list;
	}
	@Override
	public List<MtnClmCashCall> retrieveMtnCashCall(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<MtnClmCashCall> res = sqlSession.selectList("retrieveMtnClmCashCall", params);
		return res;
	}

	@Override
	public Integer saveMtnClmCashCall(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer res = sqlSession.update("saveMtnClmCashCall", params);
		return res;
	}

	@Override
	public List<MtnClmEventType> retrieveMtnClmEventTypeLov(HashMap<String, Object> params) throws SQLException {
		List<MtnClmEventType> list = sqlSession.selectList("retrieveMtnClmEventTypeLov", params);
		return list;
	}

	@Override
	public List<MtnClmEvent> retrieveMtnClmEventLov(HashMap<String, Object> params) throws SQLException {
		List<MtnClmEvent> list = sqlSession.selectList("retrieveMtnClmEventLov", params);
		return list;
	}

	@Override
	public Integer copyMtnClmCashCall(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer res = sqlSession.update("copyClmCashCall", params);
		return res;
	}

	@Override
	public Integer checkMtnClmCashCall(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		params.put("checkResult", "");
		sqlSession.selectOne("checkMtnClmCashCall", params);
		Integer res = (Integer) params.get("checkResult");
		return res;
	}

	@Override
	public List<MtnAcitTranType> retrieveMtnAcitTranType(HashMap<String, Object> params) throws SQLException {
		List<MtnAcitTranType> tranTypeList = sqlSession.selectList("retrieveMtnAcitTranType", params);
		return tranTypeList;
	}

	@Override
	public List<Bank> retrieveMtnBank(HashMap<String, Object> params) throws SQLException {
		List<Bank> res = sqlSession.selectList("retMtnBank", params);
		return res;
	}

	@Override
	public List<BankAcct> retrieveMtnBankAcct(HashMap<String, Object> params) throws SQLException {
		List<BankAcct> res = sqlSession.selectList("retMtnBankAcct", params);
		return res;
	}

	@Override
	public List<AcitDCBNo> retrieveMtnAcitDCBNo(HashMap<String, Object> params) throws SQLException {
		List<AcitDCBNo> res = sqlSession.selectList("retMtnAcitDCBNo", params);
		return res;
	}

	@Override
	public Integer saveMtnAcitDCBNo(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveMtnAcitDCBNo", params);
		return res;
	}

	@Override
	public List<DCBUser> retrieveMtnDCBUser(HashMap<String, Object> params) throws SQLException {
		List<DCBUser> res = sqlSession.selectList("retMtnDCBUser", params);
		return res;
	}

	@Override
	public List<Payee> retrieveMtnPayee(HashMap<String, Object> params) throws SQLException {
		List<Payee> payeeList = sqlSession.selectList("retrieveMtnPayee", params);
		return payeeList;
	}
	
	@Override
	public List<BookingMonth> retrieveMtnBookingMonth(HashMap<String, Object> params) throws SQLException {
		List<BookingMonth> bookingMthList = sqlSession.selectList("retrieveMtnBookingMonth", params);
		return bookingMthList;
	}

	@Override
	public List<InvtSecurityType> retrieveMtnInvtSecurityType(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<InvtSecurityType> invtSecTypeList = sqlSession.selectList("retrieveMtnInvtSecType", params);
		return invtSecTypeList;
	}
	
	@Override
	public List<AcitChartAcct> retrieveMtnAcitChartAcct(HashMap<String, Object> params) throws SQLException {
		List<AcitChartAcct> list = sqlSession.selectList("retrieveMtnAcitChartAcct", params);
		return list;
	}

	@Override
	public List<SLType> retrieveMtnSLType(HashMap<String, Object> params) throws SQLException {
		List<SLType> list = sqlSession.selectList("retrieveMtnSLType", params);
		return list;
	}

	@Override
	public List<SL> retrieveMtnSL(HashMap<String, Object> params) throws SQLException {
		List<SL> list = sqlSession.selectList("retrieveMtnSL", params);
		return list;
	}

	@Override
	public List<PrintableNames> retrieveMtnPrintableNames(HashMap<String, Object> params) throws SQLException {
		List<PrintableNames> list = sqlSession.selectList("retrieveMtnPrintable", params);
		return list;
	}

	@Override
	public List<CedingCompany> retrieveMtnCedingTreaty(HashMap<String, Object> params) throws SQLException {
		List<CedingCompany> cedingCompanyListing = sqlSession.selectList("retMtnCedingTreaty", params);
		return cedingCompanyListing;
	}
	
	@Override
	public Integer saveMtnBank(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("saveMtnBank",params);
		return code;
	}
	
	@Override
	public Integer saveMtnBankAcct(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("saveMtnBankAcct",params);
		return code;
	}

	@Override
	public List<Company> retrieveMtnCompany(HashMap<String, Object> params) throws SQLException {
		List<Company> res = sqlSession.selectList("retMtnCompany", params);
		return res;
	}

	@Override
	public List<BussType> retrieveMtnBussType(HashMap<String, Object> params) throws SQLException {
		List<BussType> res = sqlSession.selectList("retMtnBussType", params);
		return res;
	}

	@Override
	public List<PayeeCeding> retrieveMtnPayeeCeding(HashMap<String, Object> params) throws SQLException {
		List<PayeeCeding> res = sqlSession.selectList("retrieveMtnPayeeCeding", params);
		return res;
	}

	@Override
	public List<AcitCheckSeries> retrieveMtnAcitCheckSeries(HashMap<String, Object> params) throws SQLException {
		List<AcitCheckSeries> checkSeriesList = sqlSession.selectList("retrieveMtnAcitCheckSeries", params);
		return checkSeriesList;
	}
	
	@Override
	public List<AcseDCBNo> retrieveMtnAcseDCBNo(HashMap<String, Object> params) throws SQLException {
		List<AcseDCBNo> res = sqlSession.selectList("retMtnAcseDCBNo", params);
		return res;
	}

	@Override
	public List<MtnAcseTranType> retrieveMtnAcseTranType(HashMap<String, Object> params) throws SQLException {
		List<MtnAcseTranType> res = sqlSession.selectList("retrieveMtnAcseTranType", params);
		return res;
	}
	
	@Override
	public Integer saveMtnAcseDCBNo(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveMtnAcseDCBNo", params);
		return res;
	}

	@Override
	public List<AcitArSeries> retrieveMtnAcitArSeries(HashMap<String, Object> params) throws SQLException {
		List<AcitArSeries> res = sqlSession.selectList("retMtnAcitArSeries",params);
		return res;
	}

	@Override
	public List<GeneralTaxes> retrieveMtnGenTax(HashMap<String, Object> params) throws SQLException {
		List<GeneralTaxes> res = sqlSession.selectList("retMtnGenTax", params);
		return res;
	}

	@Override
	public List<WithholdingTaxes> retrieveMtnWhTax(HashMap<String, Object> params) throws SQLException {
		List<WithholdingTaxes> res = sqlSession.selectList("retMtnWhTax", params);
		return res;
	}

	@Override
	public Integer saveMtnBussType(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer code = sqlSession.update("saveMtnBussType",params);
		return code;
	}
	
	@Override
    public List<AcseCheckSeries> retrieveMtnAcseCheckSeries(HashMap<String, Object> params) throws SQLException {
        List<AcseCheckSeries> checkSeriesList = sqlSession.selectList("retrieveMtnAcseCheckSeries", params);
        return checkSeriesList;
    }
}
