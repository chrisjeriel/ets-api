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

import ph.cpi.rest.api.model.request.RetrieveEndtCodeRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnAdviceWordingsRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnBlockRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCATPerilRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCedingCompanyListingRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCedingCompanyRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnChargesRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCityRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCrestaZoneRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCurrencyRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnDeductiblesRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnDistrictRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnInsuredRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnIntermediaryRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnLineClassRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnLineRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnObjectRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnProvinceRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnQuoteWordingsRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnReasonRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnRegionRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnReportsParamRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnRiskListingRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnRiskRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnSectionCoversLovRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnSectionCoversRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTreatyRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTypeOfCessionRequest;
import ph.cpi.rest.api.model.request.RetrieveRefCodeRequest;
import ph.cpi.rest.api.model.request.SaveMtnRiskRequest;
import ph.cpi.rest.api.model.response.RetrieveEndtCodeResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnAdviceWordingsResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnBlockResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCATPerilResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCedingCompanyListingResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCedingCompanyResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnChargesResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCityResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCrestaZoneResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCurrencyResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnDeductiblesResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnDistrictResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnInsuredResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnIntermediaryResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnLineClassResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnLineResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnObjectResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnProvinceResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnQuoteWordingsResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnReasonResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnRegionResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnReportsParamResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnRiskListingResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnRiskResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnSectionCoversLovResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnSectionCoversResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTreatyResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTypeOfCessionResponse;
import ph.cpi.rest.api.model.response.RetrieveRefCodeResponse;
import ph.cpi.rest.api.model.response.SaveMtnRiskResponse;
import ph.cpi.rest.api.service.MaintenanceService;


@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080"})
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

	@GetMapping(path="retrieveMtnCATPeril")
	public @ResponseBody RetrieveMtnCATPerilResponse retrieveMtnCATPeril(RetrieveMtnCATPerilRequest rmcatpr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnCATPeril");
		logger.info("RetrieveMtnCATPerilResponse : " + rmcatpr.toString());
		return maintenanceService.retrieveMtnCATPeril(rmcatpr);
	}
	
	@GetMapping(path="retrieveMtnCharges")
	public @ResponseBody RetrieveMtnChargesResponse retrieveMtnCharges(RetrieveMtnChargesRequest rmcr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnCharges");
		logger.info("RetrieveMtnChargesResponse : " + rmcr.toString());
		return maintenanceService.retrieveMtnCharges(rmcr);
	}
}
