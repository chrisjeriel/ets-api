package ph.cpi.rest.api.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ph.cpi.rest.api.model.request.*;
import ph.cpi.rest.api.model.response.*;
import ph.cpi.rest.api.service.MaintenanceService;


@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080", "http://192.10.10.230:4200", "http://192.10.10.230:8888", "http://192.10.10.149:4200", "http://192.10.10.149:8888", "http://192.168.99.200:4200", "http://192.168.99.200:8888"})
@RequestMapping(path="/maintenance-service")
public class MaintenanceController {
	
	@Autowired
	private MaintenanceService maintenanceService;
	
	private static final Logger logger = LoggerFactory.getLogger(MaintenanceController.class);
	
	/*
	 * @GetMapping(path="retrieveQuoteAlop") public @ResponseBody
	 * RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap)
	 * throws SQLException {
	 * logger.info("GET: /api/maintenance-service/retrieveQuoteAlop");
	 * logger.info("RetrieveQuoteAlopRequest : " + rqap.toString()); return
	 * maintenanceService.retrieveQuoteAlop(rqap); }
	 */
	
	@GetMapping(path="retrieveMtnRisk")
	public @ResponseBody RetrieveMtnRiskResponse retrieveMtnRisk(RetrieveMtnRiskRequest rmrp) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnRisk");
		logger.info("RetrieveMtnRiskRequest : " + rmrp.toString());
		return maintenanceService.retrieveMtnRisk(rmrp);
	}

	@CrossOrigin
	@GetMapping(path="retrieveMtnRiskListing")
	public @ResponseBody RetrieveMtnRiskListingResponse retrieveMtnRiskListing(RetrieveMtnRiskListingRequest rmrlp) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnRiskListing");
		logger.info("RetrieveMtnRiskListingRequest : " + rmrlp.toString());
		return maintenanceService.retrieveMtnRiskListing(rmrlp);
	}
	
	@GetMapping(path="retrieveMtnSectionCovers")
	public @ResponseBody RetrieveMtnSectionCoversResponse retrieveMtnSectionCovers(RetrieveMtnSectionCoversRequest rmscp) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnSectionCovers");
		logger.info("RetrieveMtnSectionCoversRequest : " + rmscp.toString());
		return maintenanceService.retrieveMtnSectionCovers(rmscp);
	}
	
	@GetMapping(path="retrieveMtnTypeOfCession")
	public @ResponseBody RetrieveMtnTypeOfCessionResponse retrieveMtnTypeOfCession(RetrieveMtnTypeOfCessionRequest rmtcp) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnTypeOfCession");
		logger.info("RetrieveMtnTypeOfCessionRequest : " + rmtcp.toString());
		return maintenanceService.retrieveMtnTypeOfCession(rmtcp);
	}
	
	@GetMapping(path="retrieveMtnInsured")
	public @ResponseBody RetrieveMtnInsuredResponse retrieveMtnInsured(RetrieveMtnInsuredRequest rmir) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnInsured");
		logger.info("RetrieveMtnInsuredRequest : " + rmir.toString());
		return maintenanceService.retrieveMtnInsured(rmir);
	}
	
	@GetMapping(path="retrieveEndtCode")
	public @ResponseBody RetrieveEndtCodeResponse retrieveEndtCode(RetrieveEndtCodeRequest recr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveEndtCode");
		logger.info("RetrieveEndtCode : " + recr.toString());
		return maintenanceService.retrieveEndtCode(recr);
	}
	
	@GetMapping(path="retrieveMtnDistrict")
	public @ResponseBody RetrieveMtnDistrictResponse retrieveMtnDistrict(RetrieveMtnDistrictRequest rmdr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnDistrict");
		logger.info("RetrieveMtnDistrict : " + rmdr.toString());
		return maintenanceService.retrieveMtnDistrict(rmdr);
	}
	
	@GetMapping(path="retrieveMtnRegion")
	public @ResponseBody RetrieveMtnRegionResponse retrieveMtnRegion(RetrieveMtnRegionRequest rmrp) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnRegion");
		logger.info("RetrieveMtnRegionRequest : " + rmrp.toString());
		return maintenanceService.retrieveMtnRegion(rmrp);
	}
	
	@GetMapping(path="retrieveMtnProvince")
	public @ResponseBody RetrieveMtnProvinceResponse retrieveMtnProvince(RetrieveMtnProvinceRequest rmpp) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnProvince");
		logger.info("RetrieveMtnProvinceRequest : " + rmpp.toString());
		return maintenanceService.retrieveMtnProvince(rmpp);
	}
	
	@GetMapping(path="retrieveMtnObject")
	public @ResponseBody RetrieveMtnObjectResponse retrieveMtnObject(RetrieveMtnObjectRequest rmop) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnObject");
		logger.info("RetrieveMtnObjectRequest : " + rmop.toString());
		return maintenanceService.retrieveMtnObject(rmop);
	}
	
	@PostMapping(path="saveMtnObject")
	public @ResponseBody SaveMtnObjectResponse saveMtnObject(@RequestBody SaveMtnObjectRequest smor) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnObject");
		logger.info("SaveMtnObject : " + smor.toString());
		return maintenanceService.saveMtnObject(smor);
	}
	
	@GetMapping(path="retrieveMtnQuotationWordings")
	public @ResponseBody RetrieveMtnQuoteWordingsResponse retrieveMtnQuoteWordings(RetrieveMtnQuoteWordingsRequest rmqwp) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnQuoteWordings");
		logger.info("RetrieveMtnQuoteWordingsRequest : " + rmqwp.toString());
		return maintenanceService.retrieveMtnQuoteWordings(rmqwp);
	}
	
	@GetMapping(path="retrieveMtnCity")
	public @ResponseBody RetrieveMtnCityResponse retrieveMtnCity(RetrieveMtnCityRequest rmcr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnCity");
		logger.info("RetrieveMtnCityRequest : " + rmcr.toString());
		return maintenanceService.retrieveMtnCity(rmcr);
	}
	
	@GetMapping(path="retrieveMtnCrestaZone")
	public @ResponseBody RetrieveMtnCrestaZoneResponse retrieveMtnCrestaZone(RetrieveMtnCrestaZoneRequest rmczr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnCrestaZone");
		logger.info("RetrieveMtnCrestaZoneRequest : " + rmczr.toString());
		return maintenanceService.retrieveMtnCrestaZone(rmczr);
	}
	
	@GetMapping(path="retrieveMtnCurrency")
	public @ResponseBody RetrieveMtnCurrencyResponse retrieveMtnCurrency(RetrieveMtnCurrencyRequest rmcr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnCurrency");
		logger.info("RetrieveMtnCurrencyRequest : " + rmcr.toString());
		return maintenanceService.retrieveMtnCurrency(rmcr);
	}
	/*@GetMapping(path="retrieveQuoteAlop")
	public @ResponseBody RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveQuoteAlop");
		logger.info("RetrieveQuoteAlopRequest : " + rqap.toString());
		return maintenanceService.retrieveQuoteAlop(rqap);
	}*/
	
	@GetMapping(path="retrieveMaintenanceAdviceWordings")
	public @ResponseBody RetrieveMtnAdviceWordingsResponse retrieveMaintenanceAdviceWordings(RetrieveMtnAdviceWordingsRequest retMtnAdviceWordings) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMaintenanceAdviceWordings");
		logger.info("RetrieveMaintenanceAdviceWordingsRequest : " + retMtnAdviceWordings.toString());
		return maintenanceService.retrieveMaintenanceAdviceWordings(retMtnAdviceWordings);
	}
	
	@GetMapping(path="retrieveMaintenanceBlock")
	public @ResponseBody RetrieveMtnBlockResponse retrieveMaintenanceBlock(RetrieveMtnBlockRequest retMtnBlock) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMaintenanceBlock");
		logger.info("RetrieveMaintenanceAdviceWordingsRequest : " + retMtnBlock.toString());
		return maintenanceService.retrieveMaintenanceBlock(retMtnBlock);
	}
	
	@GetMapping(path="retrieveMntIntermediary")
	public @ResponseBody RetrieveMtnIntermediaryResponse retrieveMtnIntermediary(RetrieveMtnIntermediaryRequest rmip) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMntIntermediary");
		logger.info("RetrieveMtnIntermediaryRequest : " + rmip.toString());
		return maintenanceService.retrieveMtnIntermediary(rmip);
	}
	@CrossOrigin
	@GetMapping(path="retrieveMntLine")
	public @ResponseBody RetrieveMtnLineResponse retrieveMtnLine(RetrieveMtnLineRequest rmlp) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMntLine");
		logger.info("RetrieveMtnLineRequest : " + rmlp.toString());
		return maintenanceService.retrieveMtnLine(rmlp);
	}
	
	@GetMapping(path="retrieveMntLineClass")
	public @ResponseBody RetrieveMtnLineClassResponse retrieveMtnLineClass(RetrieveMtnLineClassRequest rmlcp) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMntLineClass");
		logger.info("RetrieveMtnLineClassRequest : " + rmlcp.toString());
		return maintenanceService.retrieveMtnLineClass(rmlcp);
	}

	@GetMapping(path="retrieveMtnDeductibles")
	public @ResponseBody RetrieveMtnDeductiblesResponse retrieveMtnDeductibles(RetrieveMtnDeductiblesRequest rmdr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnDeductibles");
		logger.info("RetrieveMtnDeductibles : " + rmdr.toString());
		return maintenanceService.retrieveMtnDeductibles(rmdr);
	}
		
	@GetMapping(path="retrieveMaintenanceCedingCompanyListing")
	public @ResponseBody RetrieveMtnCedingCompanyListingResponse retrieveMtnCedingCompanyListing(RetrieveMtnCedingCompanyListingRequest retMtnCedingCompanyListing) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMaintenanceCedingCompanyListing");
		logger.info("RetrieveMtnCedingCompanyListingRequest : " + retMtnCedingCompanyListing.toString());
		return maintenanceService.retrieveMaintenanceCedingCompanyListing(retMtnCedingCompanyListing);
	}
	
	@GetMapping(path="retrieveMaintenanceCedingCompany")
	public @ResponseBody RetrieveMtnCedingCompanyResponse retrieveMaintenanceCedingCompany(RetrieveMtnCedingCompanyRequest retMtnCedingCompany) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMaintenanceCedingCompany");
		logger.info("RetrieveMaintenanceCedingCompanyRequest : " + retMtnCedingCompany.toString());
		return maintenanceService.retrieveMaintenanceCedingCompany(retMtnCedingCompany);
	}
	
	@PostMapping(path="saveMtnRisk")
	public @ResponseBody SaveMtnRiskResponse saveMaintenanceRisk(@RequestBody SaveMtnRiskRequest smrr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnRisk");
		logger.info("SaveMtnRiskRequest : " + smrr.toString());
		return maintenanceService.saveMtnRisk(smrr);
	}
	
	@GetMapping(path="retrieveMtnReason")
	public @ResponseBody RetrieveMtnReasonResponse retrieveMtnReason(RetrieveMtnReasonRequest retMtnReason) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnReason");
		logger.info("RetrieveMtnReasonRequest : " + retMtnReason.toString());
		return maintenanceService.retrieveMtnReason(retMtnReason);
	}

	@GetMapping(path="retrieveMtnTreaty")
	public @ResponseBody RetrieveMtnTreatyResponse retrieveMtnTreaty(RetrieveMtnTreatyRequest rmtr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnTreaty");
		logger.info("RetrieveMtnTreaty : " + rmtr.toString());
		return maintenanceService.retrieveMtnTreaty(rmtr);
	}
	
	@GetMapping(path="retrieveMtnSectionCoversLov")
	public @ResponseBody RetrieveMtnSectionCoversLovResponse retrieveMtnSectionCoversLov(RetrieveMtnSectionCoversLovRequest rmsclp) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnSectionCoversLov");
		logger.info("RetrieveMtnSectionCoversLovRequest : " + rmsclp.toString());
		return maintenanceService.retrieveMtnSectionCoversLov(rmsclp);
	}
	
	@GetMapping(path="retrieveRefCode")
	public @ResponseBody RetrieveRefCodeResponse retrieveRefCode(RetrieveRefCodeRequest rrcr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveRefCode");
		logger.info("RetrieveRefCodeRequest : " + rrcr.toString());
		return maintenanceService.retrieveRefCode(rrcr);
	}
	
	@GetMapping(path="retrieveMtnReportsParam")
	public @ResponseBody RetrieveMtnReportsParamResponse retrieveMtnReportsParam(RetrieveMtnReportsParamRequest rmrp) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnReportsParam");
		logger.info("RetrieveMtnReportsParam : " + rmrp.toString());
		return maintenanceService.retrieveMtnReportsParam(rmrp);
	}
	
	@GetMapping(path="retrieveMtnReports")
	public @ResponseBody RetrieveMtnReportsResponse retrieveMtnReports(RetrieveMtnReportsRequest rmrp) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnReports");
		logger.info("RetrieveMtnReportsRequest : " + rmrp.toString());
		return maintenanceService.retrieveMtnReports(rmrp);
	}


	@GetMapping(path="retrieveMtnCATPeril")
	public @ResponseBody RetrieveMtnCATPerilResponse retrieveMtnCATPeril(RetrieveMtnCATPerilRequest rmcatpr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnCATPeril");
		logger.info("RetrieveMtnCATPerilResponse : " + rmcatpr.toString());
		return maintenanceService.retrieveMtnCATPeril(rmcatpr);
	}
	
	@PostMapping(path="saveMtnCatPeril")
	public @ResponseBody SaveMtnCatPerilResponse saveMtnCatPeril(@RequestBody SaveMtnCatPerilRequest smcpr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnCatPeril");
		logger.info("SaveMtnCatPeril : " + smcpr.toString());
		return maintenanceService.saveMtnCatPeril(smcpr);
	}
	
	@GetMapping(path="retrieveMtnCharges")
	public @ResponseBody RetrieveMtnChargesResponse retrieveMtnCharges(RetrieveMtnChargesRequest rmcr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnCharges");
		logger.info("RetrieveMtnChargesResponse : " + rmcr.toString());
		return maintenanceService.retrieveMtnCharges(rmcr);
	}

	@PostMapping(path="saveMtnLine")
	public @ResponseBody SaveMtnLineResponse saveMtnLine(@RequestBody SaveMtnLineRequest smlr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnLine");
		logger.info("SaveMtnLineRequest : " + smlr.toString());
		return maintenanceService.saveMtnLine(smlr);
	}
	
	@PostMapping(path="saveMtnLineClass")
	public @ResponseBody SaveMtnLineClassResponse saveMtnLineClass(@RequestBody SaveMtnLineClassRequest smlcr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnLineClass");
		logger.info("SaveMtnLineRequest : " + smlcr.toString());
		return maintenanceService.saveMtnLineClass(smlcr);
	}
	
	@PostMapping(path="saveMtnDeductibles")
	public @ResponseBody SaveMtnDeductiblesResponse saveMtnDeductibles(@RequestBody SaveMtnDeductiblesRequest smdr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnDeductibles");
		logger.info("SaveMtnDeductiblesRequest : " + smdr.toString());
		return maintenanceService.saveMtnDeductibles(smdr);
	}
	
	@GetMapping(path="retrieveMtnSpoilageReason")
	public @ResponseBody RetrieveMtnSpoilageReasonResponse retrieveMtnSpoilReason(RetrieveMtnSpoilageReasonRequest rmsrr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnSpoilageReason");
		logger.info("RetrieveMtnSpoilageReasonRequest : " + rmsrr.toString());
		return maintenanceService.retrieveMtnSpoilageReason(rmsrr);
	}
	
	@GetMapping(path="retMtnPolWordings")
	public @ResponseBody RetMtnPolWordingsResponse retMtnPolWordings(RetMtnPolWordingsRequest rmpwr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retMtnPolWordings");
		logger.info("RetMtnPolWordings : " + rmpwr.toString());
		return maintenanceService.retMtnPolWordings(rmpwr);
	}
	
	@PostMapping(path="saveMtnInsured")
	public @ResponseBody SaveMtnInsuredResponse saveMtnInsured(@RequestBody SaveMtnInsuredRequest smir) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnInsured");
		logger.info("SaveMtnInsuredRequest : " + smir.toString());
		return maintenanceService.saveMtnInsured(smir);
	}
	

	@PostMapping(path="saveMtnTypeOfCession")
	public @ResponseBody SaveMtnTypeOfCessionResponse saveMtnTypeOfCession(@RequestBody SaveMtnTypeOfCessionRequest smtocr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnTypeOfCession");
		logger.info("SaveMtnTypeOfCessionRequest : " + smtocr.toString());
		return maintenanceService.saveMtnTypeOfCession(smtocr);
	}
	
	@GetMapping(path="retMtnInsuredLov")
	public @ResponseBody RetMtnInsuredLovResponse retMtnInsuredLov(RetMtnInsuredLovRequest rmil) throws SQLException {
		logger.info("GET: /api/maintenance-service/retMtnInsuredLov");
		logger.info("RetMtnInsuredLov : " + rmil.toString());
		return maintenanceService.retMtnInsuredLov(rmil); 	
	}
	
	@PostMapping(path="saveMtnIntermediary")
	public @ResponseBody SaveMtnIntermediaryResponse saveMtnIntermediary(@RequestBody SaveMtnIntermediaryRequest smir) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnIntermediary");
		logger.info("SaveMtnIntermediaryRequest : " + smir.toString());
		return maintenanceService.saveMtnIntermediary(smir);
	}
	
	@PostMapping(path="saveMtnAdviceWordings")
	public @ResponseBody SaveMtnAdviceWordingsResponse saveMtnAdviceWordings(@RequestBody SaveMtnAdviceWordingsRequest smawr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnAdviceWordings");
		logger.info("saveMtnAdviceWordingsRequest : " + smawr.toString());
		return maintenanceService.saveMtnAdviceWordings(smawr);
	}
	
	@PostMapping(path="saveMtnQuoteWordings")
	public @ResponseBody SaveMtnQuoteWordingsResponse saveMtnQuoteWordings(@RequestBody SaveMtnQuoteWordingsRequest smqwr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnQuoteWordings");
		logger.info("SaveMtnQuoteWordingsRequest : " + smqwr.toString());
		return maintenanceService.saveMtnQuoteWordings(smqwr);
	}

	@PostMapping(path="saveMtnEndorsement")
	public @ResponseBody SaveMtnEndorsementResponse saveMtnEndorsement(@RequestBody SaveMtnEndorsementRequest smer) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnEndorsement");
		logger.info("SaveMtnEndorsementRequest : " + smer.toString());
		return maintenanceService.saveMtnEndorsement(smer);
	}
	
	@PostMapping(path="saveMtnPolicyWordings")
	public @ResponseBody SaveMtnPolicyWordingsResponse saveMtnPolicyWordings(@RequestBody SaveMtnPolicyWordingsRequest smpwr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnPolicyWordings");
		logger.info("SaveMtnPolicyWordingsRequest : " + smpwr.toString());
		return maintenanceService.saveMtnPolicyWordings(smpwr);
	}
	
	@PostMapping(path="saveMtnCedingCompany")
	public @ResponseBody SaveMtnCedingCompanyResponse saveMtnCedingCompany(@RequestBody SaveMtnCedingCompanyRequest smccr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnCedingCompany");
		logger.info("saveMtnCedingCompanyRequest : " + smccr.toString());
		return maintenanceService.saveMtnCedingCompany(smccr);
	}
	
	@PostMapping(path="saveMtnSectionCover")
	public @ResponseBody SaveMtnSectionCoverResponse saveMtnSectionCover(@RequestBody SaveMtnSectionCoverRequest smscr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnSectionCover");
		logger.info("SaveMtnSectionCoverRequest : " + smscr.toString());
		return maintenanceService.saveMtnSectionCover(smscr);
	}
	
	@GetMapping(path="retMtnQuoteReason")
	public @ResponseBody RetMtnQuoteReasonResponse retMtnQuoteReason(RetMtnQuoteReasonRequest rmqrr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retMtnQuoteReason");
		logger.info("RetMtnQuoteReason : " + rmqrr.toString());
		return maintenanceService.retMtnQuoteReason(rmqrr);
	}
	
	@PostMapping(path="saveMtnQuoteReason")
	public @ResponseBody SaveMtnQuoteReasonResponse saveMtnQuoteReason(@RequestBody SaveMtnQuoteReasonRequest smqrr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnQuoteReason");
		logger.info("SaveMtnQuoteReasonRequest : " + smqrr.toString());
		return maintenanceService.saveMtnQuoteReason(smqrr);
	}
	
	@PostMapping(path="saveMtnSpoilageReason")
	public @ResponseBody SaveMtnSpoilageReasonResponse saveMtnSpoilageReason(@RequestBody SaveMtnSpoilageReasonRequest smqrr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnSpoilageReason");
		logger.info("SaveMtnSpoilageReasonRequest : " + smqrr.toString());
		return maintenanceService.saveMtnSpoilageReason(smqrr);
	}
	
	@PostMapping(path="saveMtnDistrict")
	public @ResponseBody SaveMtnDistrictResponse saveMtnDistrict(@RequestBody SaveMtnDistrictRequest smqrr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnDistrict");
		logger.info("SaveMtnDistrictRequest : " + smqrr.toString());
		return maintenanceService.saveMtnDistrict(smqrr);
	}
	
	@PostMapping(path="saveMtnBlock")
	public @ResponseBody SaveMtnBlockResponse saveMtnBlock(@RequestBody SaveMtnBlockRequest smqrr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnBlock");
		logger.info("SaveMtnBlockRequest : " + smqrr.toString());
		return maintenanceService.saveMtnBlock(smqrr);
	}

	@GetMapping(path="retrieveMtnCurrencyRt")
	public @ResponseBody RetrieveMtnCurrencyRtResponse retMtnCurrencyRt(RetrieveMtnCurrencyRtRequest rmil) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnCurrencyRt");
		logger.info("RetrieveMtnCurrencyRtResponse : " + rmil.toString());
		return maintenanceService.retrieveMtnCurrencyRate(rmil); 	
	}
	
	@PostMapping(path="saveMtnCurrency")
	public @ResponseBody SaveMtnCurrencyResponse saveMtnCurrency(@RequestBody SaveMtnCurrencyRequest smqrr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnCurrency");
		logger.info("SaveMtnCurrencyRequest : " + smqrr.toString());
		return maintenanceService.saveMtnCurrency(smqrr);
	}
	
	@PostMapping(path="saveMtnCurrencyRt")
	public @ResponseBody SaveMtnCurrencyRtResponse saveMtnCurrencyRt(@RequestBody SaveMtnCurrencyRtRequest smqrr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnCurrencyRt");
		logger.info("SaveMtnCurrencyRtRequest : " + smqrr.toString());
		return maintenanceService.saveMtnCurrencyRt(smqrr);
	}
	
	@PostMapping(path="saveMtnCrestaZone")
	public @ResponseBody SaveMtnCrestaZoneResponse saveMtnCrestaZone(@RequestBody SaveMtnCrestaZoneRequest smqrr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnCrestaZone");
		logger.info("SaveMtnCrestaZoneRequest : " + smqrr.toString());
		return maintenanceService.saveMtnCrestaZone(smqrr);
	}
	
	@GetMapping(path="retrieveMtnCurrencyList")
	public @ResponseBody RetrieveMtnCurrencyListResponse retMtnCurrencyList(RetrieveMtnCurrencyListRequest rmil) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnCurrencyList");
		logger.info("RetrieveMtnCurrencyListResponse : " + rmil.toString());
		return maintenanceService.retMtnCurrencyList(rmil); 	
	}
	
	@GetMapping(path="retMtnUserAmtLimit")
	public @ResponseBody RetMtnUserAmtLimitResponse retMtnUserAmtLimit(RetMtnUserAmtLimitRequest rmil) throws SQLException {
		logger.info("GET: /api/maintenance-service/retMtnUserAmtLimit");
		logger.info("RetMtnUserAmtLimit : " + rmil.toString());
		return maintenanceService.retMtnUserAmtLimit(rmil); 	
	}
	
	@PostMapping(path="saveMtnUserAmtLimit")
	public @ResponseBody SaveMtnUserAmtLimitResponse saveMtnUserAmtLimit(@RequestBody SaveMtnUserAmtLimitRequest smualr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnUserAmtLimit");
		logger.info("SaveMtnUserAmtLimitRequest : " + smualr.toString());
		return maintenanceService.saveMtnUserAmtLimit(smualr);
	}

	@PostMapping(path="saveMtnOtherCharge")
	public @ResponseBody SaveMtnOtherChargeResponse saveMtnOtherCharge(@RequestBody SaveMtnOtherChargeRequest smocr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnOtherCharge");
		logger.info("SaveMtnOtherChargeRequest : " + smocr.toString());
		return maintenanceService.saveMtnOtherCharge(smocr);
	}
	
	@GetMapping(path="retrieveMtnNonRenewalReason")
	public @ResponseBody RetrieveMtnNonRenewalReasonResponse retrieveMtnNonRenewalReason(RetrieveMtnNonRenewalReasonRequest rmnrrr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnNonRenewalReason");
		logger.info("RetrieveMtnNonRenewalReasonRequest : " + rmnrrr.toString());
		return maintenanceService.retriveMtnNonRenewalReason(rmnrrr);
	}
	
	@PostMapping(path="saveMtnNonRenewalReason")
	public @ResponseBody SaveMtnNonRenewalReasonResponse saveMtnNonRenewalReason(@RequestBody SaveMtnNonRenewalReasonRequest smnrrr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnNonRenewalReason");
		logger.info("SaveMtnNonRenewalReasonRequest : " + smnrrr.toString());
		return maintenanceService.saveMtnNonRenewalReason(smnrrr);
	}

	@PostMapping(path="saveMtnRegion")
	public @ResponseBody SaveMtnRegionResponse saveMtnRegion(@RequestBody SaveMtnRegionRequest smrr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnRegion");
		logger.info("SaveRegionRequest : " + smrr.toString());
		return maintenanceService.saveMtnRegion(smrr);
	}
	
	@PostMapping(path="saveMtnProvince")
	public @ResponseBody SaveMtnProvinceResponse saveMtnProvince(@RequestBody SaveMtnProvinceRequest smpr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnProvince");
		logger.info("SaveProvinceRequest : " + smpr.toString());
		return maintenanceService.saveMtnProvince(smpr);
	}
	
	@GetMapping(path="retrieveMtnTreatyCommission")
	public @ResponseBody RetrieveMtnTreatyCommissionResponse retrieveMtnTreatyCommission(RetrieveMtnTreatyCommissionRequest rmtcr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnTreatyCommission");
		logger.info("RetrieveMtnTreatyCommissionRequest : " + rmtcr.toString());
		return maintenanceService.retrieveMtnTreatyCommission(rmtcr);
	}

	@PostMapping(path="saveMtnTreaty")
	public @ResponseBody SaveMtnTreatyResponse saveMtnTreaty(@RequestBody SaveMtnTreatyRequest smtr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnTreaty");
		logger.info("SaveMtnTreatyRequest : " + smtr.toString());
		return maintenanceService.saveMtnTreaty(smtr);
	}
	
	@GetMapping(path="retrieveMtnRetAmt")
	public @ResponseBody RetrieveMtnRetAmtResponse retrieveMtnRetAmt(RetrieveMtnRetAmtRequest rmrar) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnRetAmt");
		logger.info("RetrieveMtnRetAmtRequest : " + rmrar.toString());
		return maintenanceService.retrieveMtnRetAmt(rmrar);
	}
	
	@GetMapping(path="retrieveMtnTreatyShare")
	public @ResponseBody RetrieveMtnTreatyShareResponse retrieveMtnTreatyShare(RetrieveMtnTreatyShareRequest rmtsr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnTreatyShare");
		logger.info("RetrieveMtnTreatyShareRequest : " + rmtsr.toString());
		return maintenanceService.retrieveMtnTreatyShare(rmtsr);
	}
	
	@GetMapping(path="retrieveMtnCedingRetention")
	public @ResponseBody RetrieveMtnCedingRetentionResponse retrieveMtnCedingRetention(RetrieveMtnCedingRetentionRequest rmcrr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnCedingRetention");
		logger.info("RetrieveMtnCedingRetentionRequest : " + rmcrr.toString());
		return maintenanceService.retrieveMtnCedingRetention(rmcrr);
	}
	
	@PostMapping(path="saveMtnTreatyShare")
	public @ResponseBody SaveMtnTreatyShareResponse saveMtnTreatyShare(@RequestBody SaveMtnTreatyShareRequest smtsr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnTreatyShare");
		logger.info("SaveMtnTreatyShareRequest : " + smtsr.toString());
		return maintenanceService.saveMtnTreatyShare(smtsr);
	}
	
	@PostMapping(path="copyTreatyShareSetup")
	public @ResponseBody CopyTreatyShareSetupResponse copyTreatyShareSetup(@RequestBody CopyTreatyShareSetupRequest ctssr) throws SQLException {
		logger.info("POST: /api/maintenance-service/copyTreatyShareSetup");
		logger.info("CopyTreatyShareSetupRequest : " + ctssr.toString());
		return maintenanceService.copyTreatyShareSetup(ctssr);
	}
	
	@PostMapping(path="saveMtnRetAmt")
	public @ResponseBody SaveMtnRetAmtResponse saveMtnRetAmt(@RequestBody SaveMtnRetAmtRequest smrar) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnRetAmt");
		logger.info("SaveMtnRetAmtRequest : " + smrar.toString());
		return maintenanceService.saveMtnRetAmt(smrar);
	}
	
	@PostMapping(path="copyRetAmtSetup")
	public @ResponseBody CopyRetAmtSetupResponse copyRetAmtSetup(@RequestBody CopyRetAmtSetupRequest crasr) throws SQLException {
		logger.info("POST: /api/maintenance-service/copyRetAmtSetup");
		logger.info("CopyRetAmtSetupRequest : " + crasr.toString());
		return maintenanceService.copyRetAmtSetup(crasr);
	}
	
	@GetMapping(path="retrieveMtnTreatyLimit")
	public @ResponseBody RetrieveMtnTreatyLimitResponse retrieveMtnTreatyLimit(RetrieveMtnTreatyLimitRequest rmtlr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnTreatyLimit");
		logger.info("RetrieveMtnTreatyLimitRequest : " + rmtlr.toString());
		return maintenanceService.retrieveMtnTreatyLimit(rmtlr);
	}
		
	@GetMapping(path="retrieveMtnApproval")
	public @ResponseBody RetrieveMtnApprovalResponse retrieveMtnApproval(RetrieveMtnApprovalRequest rmscp) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnApproval");
		logger.info("RetrieveMtnApprovalRequest : " + rmscp.toString());
		return maintenanceService.retrieveMtnApproval(rmscp);
	}
	
	@GetMapping(path="retrieveMtnApprovalFunction")
	public @ResponseBody RetrieveMtnApprovalFunctionResponse retrieveMtnApprovalFunction(RetrieveMtnApprovalFunctionRequest rmscp) throws SQLException {
		logger.info("GET: /api/maintenance-service/RetrieveMtnApprovalFunctionRequest");
		logger.info("RetrieveMtnApprovalFunctionRequest : " + rmscp.toString());
		return maintenanceService.retrieveMtnApprovalFunction(rmscp);
	}
	
	@PostMapping(path="saveMtnApproval")
	public @ResponseBody SaveMtnApprovalResponse saveMtnApproval(@RequestBody SaveMtnApprovalRequest smrr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnApproval");
		logger.info("SaveMtnApprovalRequest : " + smrr.toString());
		return maintenanceService.saveMtnApproval(smrr);
	}
	
	@PostMapping(path="saveMtnApprovalFunction")
	public @ResponseBody SaveMtnApprovalFunctionResponse saveMtnApprovalFunction(@RequestBody SaveMtnApprovalFunctionRequest smrr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnApprovalFunction");
		logger.info("SaveMtnApprovalFunctionRequest : " + smrr.toString());
		return maintenanceService.saveMtnApprovalFunction(smrr);
 	}

	@GetMapping(path="retrieveApprover")
	public @ResponseBody RetrieveMtnApproverResponse retrieveApprover(RetrieveMtnApproverRequest rar) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveApprover");
		logger.info("RetrieveApprover : " + rar.toString());
		return maintenanceService.retrieveApprover(rar); 	
	}
	
	@GetMapping(path="retrieveApproverFunction")
	public @ResponseBody RetrieveMtnApproverFnResponse retrieveApproverFn(RetrieveMtnApproverFnRequest rafr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveApproverFunction");
		logger.info("RetrieveApproverFunction : " + rafr.toString());
		return maintenanceService.retrieveApproverFn(rafr); 	
	}
	
	@PostMapping(path="saveApprover")
	public @ResponseBody SaveMtnApproverResponse saveMtnApprover(@RequestBody SaveMtnApproverRequest smar) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveApprover");
		logger.info("SaveMtnApproverRequest : " + smar.toString());
		return maintenanceService.saveMtnApprover(smar);
	}
	
	@PostMapping(path="saveApproverFunction")
	public @ResponseBody SaveMtnApproverFnResponse saveMtnApproverFn(@RequestBody SaveMtnApproverFnRequest smar) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveApproverFunction");
		logger.info("SaveMtnApproverFunctionRequest : " + smar.toString());
		return maintenanceService.saveMtnApproverFn(smar);
	}
	
	@GetMapping(path="retrieveMtnParameters")
	public @ResponseBody RetrieveMtnParametersResponse retrieveMtnParameters(RetrieveMtnParametersRequest rafr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnParameters");
		logger.info("RetrieveMtnParametersRequest : " + rafr.toString());
		return maintenanceService.retrieveMtnParameters(rafr); 	
	}
	
	@PostMapping(path="saveMtnParameters")
	public @ResponseBody SaveMtnParametersResponse saveMtnParameters(@RequestBody SaveMtnParametersRequest smar) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnParameters");
		logger.info("SaveMtnParametersRequest : " + smar.toString());
		return maintenanceService.saveMtnParameters(smar);
	}
	
	@GetMapping(path="retrieveMtnRoundingError")
	public @ResponseBody RetrieveMtnRoundingErrorResponse retrieveMtnRoundingError(RetrieveMtnRoundingErrorRequest rafr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnRoundingError");
		logger.info("RetrieveMtnRoundingErrorRequest : " + rafr.toString());
		return maintenanceService.retrieveMtnRoundingError(rafr); 	
	}
	
	@PostMapping(path="saveMtnRoundingError")
	public @ResponseBody SaveMtnRoundingErrorResponse saveMtnRoundingError(@RequestBody SaveMtnRoundingErrorRequest smar) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnRoundingError");
		logger.info("SaveMtnRoundingErrorRequest : " + smar.toString());
		return maintenanceService.saveMtnRoundingError(smar);
	}
	
	@PostMapping(path="saveMtnReports")
	public @ResponseBody SaveMtnReportsResponse saveMtnReports(@RequestBody SaveMtnReportsRequest smrr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnReports");
		logger.info("SaveMtnReportsRequest : " + smrr.toString());
		return maintenanceService.saveMtnReports(smrr);
	}
	
	@PostMapping(path="saveMtnReportParam")
	public @ResponseBody SaveMtnReportParamResponse saveMtnReportParam(@RequestBody SaveMtnReportParamRequest smrpr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnReportParam");
		logger.info("SaveMtnReportParamRequest : " + smrpr.toString());
		return maintenanceService.saveMtnReportParam(smrpr);
	}
	
	@PostMapping(path="saveMtnCity")
	public @ResponseBody SaveMtnCityResponse saveMtnCity(@RequestBody SaveMtnCityRequest smcr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnCity");
		logger.info("SaveCityRequest : " + smcr.toString());
		return maintenanceService.saveMtnCity(smcr);
	}
	
	@GetMapping(path="retrieveMtnClaimStatus")
	public @ResponseBody RetrieveMtnClmStatusResponse retrieveMtnClmStatus(RetrieveMtnClmStatusRequest rafr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnClaimStatus");
		logger.info("RetrieveMtnClmStatusRequest : " + rafr.toString());
		return maintenanceService.retrieveMtnClaimStatus(rafr); 	
	}

	@PostMapping(path="saveMtnTreatyLimit")
	public @ResponseBody SaveMtnTreatyLimitResponse saveMtnTreatyLimit(@RequestBody SaveMtnTreatyLimitRequest smtlr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnTreatyLimit");
		logger.info("SaveMtnTreatyLimitRequest : " + smtlr.toString());
		return maintenanceService.saveMtnTreatyLimit(smtlr);
	}
	
	@PostMapping(path="copyTreatyLimit")
	public @ResponseBody CopyTreatyLimitResponse copyTreatyLimit(@RequestBody CopyTreatyLimitRequest ctlr) throws SQLException {
		logger.info("POST: /api/maintenance-service/copyTreatyLimit");
		logger.info("CopyTreatyLimitRequest : " + ctlr.toString());
		return maintenanceService.copyTreatyLimit(ctlr);
	}
	
	@GetMapping(path="retrieveMtnAdjusterList")
	public @ResponseBody RetrieveMtnAdjusterListResponse retrieveMtnAdjusterList(RetrieveMtnAdjusterListRequest rmalr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnAdjusterList");
		logger.info("RetrieveMtnAdjusterListRequest : " + rmalr.toString());
		return maintenanceService.retrieveMtnAdjusterList(rmalr); 	
	}
	
	@GetMapping(path="retrieveMtnAdjRepresentative")
	public @ResponseBody RetrieveMtnAdjRepresentativeResponse retrieveMtnAdjRepresentative(RetrieveMtnAdjRepresentativeRequest rmarr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnAdjRepresentative");
		logger.info("RetrieveMtnAdjRepresentativeRequest : " + rmarr.toString());
		return maintenanceService.retrieveMtnAdjRepresentative(rmarr); 	
	}
	
	@PostMapping(path="saveMtnAdjuster")
	public @ResponseBody SaveMtnAdjusterResponse saveMtnAdjuster(@RequestBody SaveMtnAdjusterRequest smar) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnAdjuster");
		logger.info("SaveMtnAdjusterRequest : " + smar.toString());
		return maintenanceService.saveMtnAdjuster(smar);
	}
	
	@GetMapping(path="retrieveMtnClmEventType")
	public @ResponseBody RetrieveMtnClmEventTypeResponse retrieveMtnClmEventType(RetrieveMtnClmEventTypeRequest rmcetp) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnClmEventType");
		logger.info("RetrieveMtnClmEventTypeRequest : " + rmcetp.toString());
		return maintenanceService.retrieveMtnClmEventType(rmcetp);
	}
	
	@PostMapping(path="saveMtnClmEventType")
	public @ResponseBody SaveMtnClmEventTypeResponse saveMtnClmEventType(@RequestBody SaveMtnClmEventTypeRequest smcetp) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnClmEventType");
		logger.info("SaveMtnClmEventTypeRequest : " + smcetp.toString());
		return maintenanceService.saveMtnClmEventType(smcetp);
	}
	
	@GetMapping(path="retrieveMtnClmEvent")
	public @ResponseBody RetrieveMtnClmEventResponse retrieveMtnClmEvent(RetrieveMtnClmEventRequest rmcep) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnClmEvent");
		logger.info("RetrieveMtnClmEventRequest : " + rmcep.toString());
		return maintenanceService.retrieveMtnClmEvent(rmcep);
	}
	
	@PostMapping(path="saveMtnClmEvent")
	public @ResponseBody SaveMtnClmEventResponse saveMtnClmEvent(@RequestBody SaveMtnClmEventRequest smcep) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnClmEvent");
		logger.info("SaveMtnClmEventRequest : " + smcep.toString());
		return maintenanceService.saveMtnClmEvent(smcep);
	}
	
	@GetMapping(path="retrieveMtnLossCd")
	public @ResponseBody RetrieveMtnLossCdResponse retrieveMtnLossCd(RetrieveMtnLossCdRequest rmlcr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnLossCd");
		logger.info("RetrieveMtnLossCdRequest : " + rmlcr.toString());
		return maintenanceService.retrieveMtnLossCd(rmlcr);	
	}
	
	@PostMapping(path="saveMtnLossCd")
	public @ResponseBody SaveMtnLossCdResponse saveMtnLossCd(@RequestBody SaveMtnLossCdRequest smcr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnLossCd");
		logger.info("SaveMtnLossCdRequest : " + smcr.toString());
		return maintenanceService.saveMtnLossCd(smcr);
	}
	
	@PostMapping(path="saveMtnClaimStatus")
	public @ResponseBody SaveMtnClaimStatusResponse saveMtnClaimStatus(@RequestBody SaveMtnClaimStatusRequest ctlr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnClaimStatus");
		logger.info("SaveMtnClaimStatusRequest : " + ctlr.toString());
		return maintenanceService.saveMtnClaimStatus(ctlr);
	}
	
	@GetMapping(path="retrieveMtnSecIITrtyLimit")
	public @ResponseBody RetrieveMtnSecIITrtyLimitResponse retrieveMtnSecIITrtyLimit(RetrieveMtnSecIITrtyLimitRequest rmstr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnSecIITrtyLimit");
		logger.info("RetrieveMtnSecIITrtyLimitRequest : " + rmstr.toString());
		return maintenanceService.retrieveMtnSecIITrtyLimit(rmstr);
	}
	
	@PostMapping(path="saveMtnSecIITrtyLimit")
	public @ResponseBody SaveMtnSecIITrtyLimitResponse saveMtnSecIITrtyLimit(@RequestBody SaveMtnSecIITrtyLimitRequest smstr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnSecIITrtyLimit");
		logger.info("SaveMtnSecIITrtyLimitRequest : " + smstr.toString());
		return maintenanceService.saveMtnSecIITrtyLimit(smstr);
	}
	
	@PostMapping(path="copySecIITrtyLimit")
	public @ResponseBody CopySecIITrtyLimitResponse copySecIITrtyLimit(@RequestBody CopySecIITrtyLimitRequest cstr) throws SQLException {
		logger.info("POST: /api/maintenance-service/copySecIITrtyLimit");
		logger.info("CopySecIITrtyLimitRequest : " + cstr.toString());
		return maintenanceService.copySecIITrtyLimit(cstr);
	}
	
	@GetMapping(path="retrieveMtnPoolRetHist")
	public @ResponseBody RetrieveMtnPoolRetHistResponse retrieveMtnPoolRetHist(RetrieveMtnPoolRetHistRequest rmprhr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnPoolRetHist");
		logger.info("RetrieveMtnPoolRetHistRequest : " + rmprhr.toString());
		return maintenanceService.retrieveMtnPoolRetHist(rmprhr);
	}
	
	@PostMapping(path="saveMtnPoolRetHist")
	public @ResponseBody SaveMtnPoolRetHistResponse saveMtnPoolRetHist(@RequestBody SaveMtnPoolRetHistRequest smprhr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnPoolRetHist");
		logger.info("SaveMtnPoolRetHistRequest : " + smprhr.toString());
		return maintenanceService.saveMtnPoolRetHist(smprhr);
	}
	
	@PostMapping(path="copyPoolRetHist")
	public @ResponseBody CopyPoolRetHistResponse copyPoolRetHist(@RequestBody CopyPoolRetHistRequest cprhr) throws SQLException {
		logger.info("POST: /api/maintenance-service/copyPoolRetHist");
		logger.info("CopyPoolRetHistRequest : " + cprhr.toString());
		return maintenanceService.copyPoolRetHist(cprhr);
	}
	
	@GetMapping(path="retrieveMtnClmCashCall")
	public @ResponseBody RetrieveMtnClmCashCallResponse retrieveMtnClmCashCall(RetrieveMtnClmCashCallRequest rccp) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnClmCashCall");
		logger.info("RetrieveMtnClmCashCallRequest : " + rccp.toString());
		return maintenanceService.retrieveMtnClmCashCall(rccp);
	}
	
	@PostMapping(path="saveMtnClmCashCall")
	public @ResponseBody SaveMtnClmCashCallResponse saveMtnClmCashCall(@RequestBody SaveMtnClmCashCallRequest smcccr) throws SQLException {
		logger.info("POST: /api/maintenance-service/saveMtnClmCashCall");
		logger.info("SaveMtnClmCashCallRequest : " + smcccr.toString());
		return maintenanceService.saveMtnClmCashCall(smcccr);
	}
	
}
