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

import ph.cpi.rest.api.model.request.BatchDistributionRequest;
import ph.cpi.rest.api.model.request.BatchPostingRequest;
import ph.cpi.rest.api.model.request.DistRiskRequest;
import ph.cpi.rest.api.model.request.ExtractExpiringPolicyRequest;
import ph.cpi.rest.api.model.request.ExtGenRenExpPolicyRequest;
import ph.cpi.rest.api.model.request.GenHundredValPolPrintingRequest;
import ph.cpi.rest.api.model.request.NegateDistributionRequest;
import ph.cpi.rest.api.model.request.PostDistributionRequest;
import ph.cpi.rest.api.model.request.PostPolicyRequest;
import ph.cpi.rest.api.model.request.ProcessRenewablePolicyRequest;
import ph.cpi.rest.api.model.request.PurgeExpiringPolRequest;
import ph.cpi.rest.api.model.request.RetrieveAlterationsPerPolicyRequest;
import ph.cpi.rest.api.model.request.RetrieveDistCoInsRequest;
import ph.cpi.rest.api.model.request.RetrieveExpPolListRequest;
import ph.cpi.rest.api.model.request.RetrievePolAlopItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolAlopRequest;
import ph.cpi.rest.api.model.request.RetrievePolAttachmentOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrievePolCATPerilRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoInsuranceRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageAltRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageRequest;
import ph.cpi.rest.api.model.request.RetrievePolDistInstPoolRequest;
import ph.cpi.rest.api.model.request.RetrievePolDistInstRequest;
import ph.cpi.rest.api.model.request.RetrievePolDistListRequest;
import ph.cpi.rest.api.model.request.RetrievePolDistRequest;
import ph.cpi.rest.api.model.request.RetrievePolDistWarningRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtDedRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtRequest;
import ph.cpi.rest.api.model.request.RetrievePolForPurgingRequest;
import ph.cpi.rest.api.model.request.RetrievePolFullCoverageRequest;
import ph.cpi.rest.api.model.request.RetrievePolGenInfoOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolGenInfoRequest;
import ph.cpi.rest.api.model.request.RetrievePolHoldCoverListingRequest;
import ph.cpi.rest.api.model.request.RetrievePolHoldCoverRequest;
import ph.cpi.rest.api.model.request.RetrievePolInstTagAcctDateRequest;
import ph.cpi.rest.api.model.request.RetrievePolInwardBalRequest;
import ph.cpi.rest.api.model.request.RetrievePolItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyApproverRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyInformationRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyListingRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyOCListingRequest;
import ph.cpi.rest.api.model.request.RetrievePoolDistributionRequest;
import ph.cpi.rest.api.model.request.RetrieveRiskDistributionRequest;
import ph.cpi.rest.api.model.request.RetrieveValidBookingDateRequest;
import ph.cpi.rest.api.model.request.RetrieveWfmApprovalsRequest;
import ph.cpi.rest.api.model.request.SaveExpCatPerilRequest;
import ph.cpi.rest.api.model.request.SaveExpCovRequest;
import ph.cpi.rest.api.model.request.SaveExpGenInfoRequest;
import ph.cpi.rest.api.model.request.SaveOpenPolDetailsRequest;
import ph.cpi.rest.api.model.request.SavePolAlopItemRequest;
import ph.cpi.rest.api.model.request.SavePolAlopRequest;
import ph.cpi.rest.api.model.request.SavePolAttachmentOcRequest;
import ph.cpi.rest.api.model.request.SavePolAttachmentRequest;
import ph.cpi.rest.api.model.request.SavePolCATPerilRequest;
import ph.cpi.rest.api.model.request.SavePolCoverageOcRequest;
import ph.cpi.rest.api.model.request.SavePolCoverageRequest;
import ph.cpi.rest.api.model.request.SavePolEndorsementRequest;
import ph.cpi.rest.api.model.request.SavePolEndtOcRequest;
import ph.cpi.rest.api.model.request.SavePolFullCoverageRequest;
import ph.cpi.rest.api.model.request.SavePolGenInfoOcRequest;
import ph.cpi.rest.api.model.request.SavePolGenInfoRequest;
import ph.cpi.rest.api.model.request.SavePolHoldCoverRequest;
import ph.cpi.rest.api.model.request.SavePolInwardBalRequest;
import ph.cpi.rest.api.model.request.SavePolItemRequest;
import ph.cpi.rest.api.model.request.SavePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.SavePolicyDetailsRequest;
import ph.cpi.rest.api.model.request.SaveRiskDistRequest;
import ph.cpi.rest.api.model.request.SaveSumInsOCRequest;
import ph.cpi.rest.api.model.request.UpdatePolGenInfoRequest;
import ph.cpi.rest.api.model.request.UpdatePolGenInfoSpoilageRequest;
import ph.cpi.rest.api.model.request.UpdatePolHoldCoverStatusRequest;
import ph.cpi.rest.api.model.request.UpdatePolOpenCoverStatusRequest;
import ph.cpi.rest.api.model.request.UpdatePolicyStatusRequest;
import ph.cpi.rest.api.model.response.BatchDistributionResponse;
import ph.cpi.rest.api.model.response.BatchPostingResponse;
import ph.cpi.rest.api.model.response.DistRiskResponse;
import ph.cpi.rest.api.model.response.ExtractExpiringPolicyResponse;
import ph.cpi.rest.api.model.response.ExtGenRenExpPolicyResponse;
import ph.cpi.rest.api.model.response.GenHundredValPolPrintingResponse;
import ph.cpi.rest.api.model.response.NegateDistributionResponse;
import ph.cpi.rest.api.model.response.PostDistributionResponse;
import ph.cpi.rest.api.model.response.PostPolicyResponse;
import ph.cpi.rest.api.model.response.ProcessRenewablePolicyResponse;
import ph.cpi.rest.api.model.response.PurgeExpiringPolResponse;
import ph.cpi.rest.api.model.response.RetrieveAlterationsPerPolicyResponse;
import ph.cpi.rest.api.model.response.RetrieveDistCoInsResponse;
import ph.cpi.rest.api.model.response.RetrieveExpPolListResponse;
import ph.cpi.rest.api.model.response.RetrieveLastExtractInfoResponse;
import ph.cpi.rest.api.model.response.RetrievePolAlopItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolAlopResponse;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrievePolCATPerilResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoInsuranceResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageAltResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageResponse;
import ph.cpi.rest.api.model.response.RetrievePolDistInstResponse;
import ph.cpi.rest.api.model.response.RetrievePolDistListResponse;
import ph.cpi.rest.api.model.response.RetrievePolDistResponse;
import ph.cpi.rest.api.model.response.RetrievePolDistWarningResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtDedResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtResponse;
import ph.cpi.rest.api.model.response.RetrievePolForPurgingResponse;
import ph.cpi.rest.api.model.response.RetrievePolFullCoverageResponse;
import ph.cpi.rest.api.model.response.RetrievePolGenInfoOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolGenInfoResponse;
import ph.cpi.rest.api.model.response.RetrievePolHoldCoverResponse;
import ph.cpi.rest.api.model.response.RetrievePolInstTagAcctDateResponse;
import ph.cpi.rest.api.model.response.RetrievePolInwardBalResponse;
import ph.cpi.rest.api.model.response.RetrievePolItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyApproverResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyInformationResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyListingResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyOCListingResponse;
import ph.cpi.rest.api.model.response.RetrievePoolDistributionResponse;
import ph.cpi.rest.api.model.response.RetrieveRiskDistributionResponse;
import ph.cpi.rest.api.model.response.RetrieveValidBookingDateResponse;
import ph.cpi.rest.api.model.response.RetrieveWfmApprovalsResponse;
import ph.cpi.rest.api.model.response.SaveExpCatPerilResponse;
import ph.cpi.rest.api.model.response.SaveExpCovResponse;
import ph.cpi.rest.api.model.response.SaveExpGenInfoResponse;
import ph.cpi.rest.api.model.response.SaveOpenPolDetailsResponse;
import ph.cpi.rest.api.model.response.SavePolAlopItemResponse;
import ph.cpi.rest.api.model.response.SavePolAlopResponse;
import ph.cpi.rest.api.model.response.SavePolAttachmentOcResponse;
import ph.cpi.rest.api.model.response.SavePolAttachmentResponse;
import ph.cpi.rest.api.model.response.SavePolCATPerilResponse;
import ph.cpi.rest.api.model.response.SavePolCoverageOcResponse;
import ph.cpi.rest.api.model.response.SavePolCoverageResponse;
import ph.cpi.rest.api.model.response.SavePolEndorsementResponse;
import ph.cpi.rest.api.model.response.SavePolEndtOcResponse;
import ph.cpi.rest.api.model.response.SavePolFullCoverageResponse;
import ph.cpi.rest.api.model.response.SavePolGenInfoOcResponse;
import ph.cpi.rest.api.model.response.SavePolGenInfoResponse;
import ph.cpi.rest.api.model.response.SavePolHoldCoverResponse;
import ph.cpi.rest.api.model.response.SavePolInwardBalResponse;
import ph.cpi.rest.api.model.response.SavePolItemResponse;
import ph.cpi.rest.api.model.response.SavePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.SavePolicyDetailsResponse;
import ph.cpi.rest.api.model.response.SaveRiskDistResponse;
import ph.cpi.rest.api.model.response.SaveSumInsOCResponse;
import ph.cpi.rest.api.model.response.UpdatePolGenInfoResponse;
import ph.cpi.rest.api.model.response.UpdatePolGenInfoSpoilageResponse;
import ph.cpi.rest.api.model.response.UpdatePolHoldCoverStatusResponse;
import ph.cpi.rest.api.model.response.UpdatePolOpenCoverStatusResponse;
import ph.cpi.rest.api.model.response.UpdatePolicyStatusResponse;
import ph.cpi.rest.api.service.UnderwritingService;

@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.163:4200", 
						"http://192.168.99.202:8888", "http://192.168.99.202:8080", "http://192.10.10.230:4200", "http://192.10.10.230:8888", "http://192.10.10.149:4200", 
						"http://192.10.10.149:8888", "http://192.168.99.200:4200", "http://192.168.99.200:8888",
						"http://192.168.99.201:8888", "http://192.168.99.201:4200", "http://192.168.99.202:8888", "http://192.168.99.202:4200",
						"http://192.10.10.210:8889", "http://192.10.10.210:4201","http://192.168.1.4:4200"})
@RequestMapping(path="/underwriting-service")
public class UnderwritingController {

	@Autowired
	private UnderwritingService underwritingService;
	
	private static final Logger logger = LoggerFactory.getLogger(UnderwritingController.class);

	@GetMapping(path="retrievePolInwardBal")
	public @ResponseBody RetrievePolInwardBalResponse retrievePolInwardBal(RetrievePolInwardBalRequest rpibp) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolInwardBal");
		logger.info("RetrievePolInwardBalRequest : " + rpibp.toString());
		return underwritingService.retrievePolInwardBal(rpibp);
	}
	
	@GetMapping(path="retrievePolCoInsurance")
	public @ResponseBody RetrievePolCoInsuranceResponse retrievePolCoInsurance(RetrievePolCoInsuranceRequest rpoip) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolCoInsurance");
		logger.info("RetrievePolCoInsuranceRequest : " + rpoip.toString());
		return underwritingService.retrievePolCoInsurance(rpoip);
	}
	
	@GetMapping(path="retrievePolicyDeductibles")
	public @ResponseBody RetrievePolicyDeductiblesResponse retrievePolicyDeductibles(RetrievePolicyDeductiblesRequest rpdr) throws SQLException {
		logger.info("GET: /api/Policy-service/retrievePolicyDeductibles");
		logger.info("RetrievePolicyDeductiblesRequest : " + rpdr.toString());
		return underwritingService.retrievePolicyDeductibles(rpdr);
	}
		
	@GetMapping(path="retrievePolCoverage")
	public @ResponseBody RetrievePolCoverageResponse retrievePolCoverage(RetrievePolCoverageRequest rpcr) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolCoverage");
		logger.info("RetrievePolCoverageRequest : " + rpcr.toString());
		return underwritingService.retrievePolCoverage(rpcr);
	}

	@GetMapping(path="retrievePolAttachment")
	public @ResponseBody RetrievePolAttachmentResponse retrievePolAttachment(RetrievePolAttachmentRequest rpar) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrievePolAttachment");
		logger.info("RetrievePolAttachmentRequest : " + rpar.toString());
		return underwritingService.retrievePolAttachment(rpar);
	}
	
	@GetMapping(path="retrievePolEndt")
	public @ResponseBody RetrievePolEndtResponse retrievePolEndt(RetrievePolEndtRequest rper) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrievePolEndt");
		logger.info("RetrievePolEndtRequest : " + rper.toString());
		return underwritingService.retrievePolEndt(rper);
	}
	
	@GetMapping(path="retrievePolItem")
	public @ResponseBody RetrievePolItemResponse retrievePolItem(RetrievePolItemRequest rpir) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolItem");
		logger.info("RetrievePolItem : " + rpir.toString());
		return underwritingService.retrievePolItem(rpir);
	}
	
	@GetMapping(path="retrievePolCATPeril")
	public @ResponseBody RetrievePolCATPerilResponse retrievePolCATPeril(RetrievePolCATPerilRequest rpcpr) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolCATPeril");
		logger.info("RetrievePolCATPeril : " + rpcpr.toString());
		return underwritingService.retrievePolCATPeril(rpcpr);
	}
	
	@GetMapping(path="retrievePolGenInfo")
	public @ResponseBody RetrievePolGenInfoResponse retrievePolGenInfo(RetrievePolGenInfoRequest rpgip) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolGenInfo");
		logger.info("RetrievePolGenInfo : " + rpgip.toString());
		return underwritingService.retrievePolGenInfo(rpgip);
	}
		
	@PostMapping(path="savePolAttachment")
	public @ResponseBody SavePolAttachmentResponse savePolAttachment(@RequestBody SavePolAttachmentRequest spar) throws SQLException {
		logger.info("POST: /api/underwriting-service/savePolAttachment");
		logger.info("SavePolAttachmentRequest : " + spar.toString());
		return underwritingService.savePolAttachments(spar);
	}

	@GetMapping(path="retrievePolAlop")
	public @ResponseBody RetrievePolAlopResponse retrievePolAlop(RetrievePolAlopRequest rpap) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolAlop");
		logger.info("RetrievePolAlopRequest : " + rpap.toString());
		return underwritingService.retrievePolAlop(rpap);
	}

	@PostMapping(path="savePolCATPeril")
	public @ResponseBody SavePolCATPerilResponse savePolCATPeril(@RequestBody SavePolCATPerilRequest spcpr ) throws SQLException {
		logger.info("GET: /api/underwriting-service/savePolCATPeril");
		logger.info("savePolCATPeril : " + spcpr.toString());
		return underwritingService.savePolCATPeril(spcpr);
	}
	
	@PostMapping(path="savePolItem")
	public @ResponseBody SavePolItemResponse savePolItem(@RequestBody SavePolItemRequest spir ) throws SQLException {
		logger.info("GET: /api/underwriting-service/savePolItem");
		logger.info("savePolItem : " + spir.toString());
		return underwritingService.savePolItem(spir);
	}
	
	@GetMapping(path="retrievePolAlopItem")
	public @ResponseBody RetrievePolAlopItemResponse retrievePolAlopItem(RetrievePolAlopItemRequest rpap) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolAlopItem");
		logger.info("RetrievePolAlopItemRequest : " + rpap.toString());
		return underwritingService.retrievePolAlopItem(rpap);
	}
	
	@PostMapping(path="savePolicyDeductibles")
	public @ResponseBody SavePolicyDeductiblesResponse savePolicyDeductibles(@RequestBody SavePolicyDeductiblesRequest spdr) throws SQLException {
		logger.info("GET: /api/Policy-service/savePolicyDeductibles");
		logger.info("SavePolicyDeductiblesRequest : " + spdr.toString());
		return underwritingService.savePolicyDeductibles(spdr);
	}
	
	@PostMapping(path="savePolCoverage")
	public @ResponseBody SavePolCoverageResponse savePolCoverage(@RequestBody SavePolCoverageRequest sqcr) throws SQLException {
		logger.info("POST: /api/underwriting-service/savePolCoverage");
		logger.info("SavePolCoverageRequest : " + sqcr.toString());
		return underwritingService.savePolCoverage(sqcr);
	}
	
	@PostMapping(path="savePolHoldCover")
	public @ResponseBody SavePolHoldCoverResponse savePolHoldCover(@RequestBody SavePolHoldCoverRequest sphcr) throws SQLException {
		logger.info("POST: /api/underwriting-service/savePolHoldCover");
		logger.info("SavePolHoldCoverRequest : " + sphcr.toString());
		return underwritingService.savePolHoldCover(sphcr);
	}
	
	@GetMapping(path="retrievePolAttachmentOc")
	public @ResponseBody RetrievePolAttachmentOcResponse retrievePolAttachmentOc(RetrievePolAttachmentOcRequest rpaor) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrievePolAttachmentOc");
		logger.info("RetrievePolAttachmentOcRequest : " + rpaor.toString());
		return underwritingService.retrievePolAttachmentOc(rpaor);
	}
	
	@GetMapping(path="retrievePolEndtOc")
	public @ResponseBody RetrievePolEndtOcResponse retrievePolEndtOc(RetrievePolEndtOcRequest rpeor) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrievePolEndtOc");
		logger.info("RetrievePolEndtOcRequest : " + rpeor.toString());
		return underwritingService.retrievePolEndtOc(rpeor);
	}
	@GetMapping(path="retrievePolicyListing")
	public @ResponseBody RetrievePolicyListingResponse retrievePolicyListing(RetrievePolicyListingRequest rplp) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolicyListing");
		logger.info("RetrievePolicyListing : " + rplp.toString());
		return underwritingService.retrievePolicyListing(rplp);
	}
	@GetMapping(path="retrievePolicyListingLength")
	public @ResponseBody String retrievePolicyListingLength(RetrievePolicyListingRequest rplp) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolicyListing");
		logger.info("retrievePolicyListingLength : " + rplp.toString());
		return underwritingService.retrievePolicyListingLength(rplp);
	}
	
	@PostMapping(path="savePolAlop")
	public @ResponseBody SavePolAlopResponse savePolAlop(@RequestBody SavePolAlopRequest spap) throws SQLException {
		logger.info("POST: /api/underwriting-service/savePolAlop");
		logger.info("SavePolAlopRequest : " + spap.toString());
		return underwritingService.savePolAlop(spap);
	}
	
	@PostMapping(path="savePolAlopItem")
	public @ResponseBody SavePolAlopItemResponse savePolAlopItem(@RequestBody SavePolAlopItemRequest spaip) throws SQLException {
		logger.info("POST: /api/underwriting-service/savePolAlopItemRequest");
		logger.info("SavePolAlopItemRequest : " + spaip.toString());
		return underwritingService.savePolAlopItem(spaip);
	}
	
	@GetMapping(path="retrievePolHoldCover")
	public @ResponseBody RetrievePolHoldCoverResponse retrievePolHoldCover(RetrievePolHoldCoverRequest rphc) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolHoldCover");
		logger.info("RetrievePolHoldCover : " + rphc.toString());
		return underwritingService.retrievePolHoldCover(rphc);	
	}

	@GetMapping(path="retrievePolCoverageOc")
	public @ResponseBody RetrievePolCoverageOcResponse retrievePolCoverageOc(RetrievePolCoverageOcRequest rpcr) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolCoverageOc");
		logger.info("RetrievePolCoverageOcRequest : " + rpcr.toString());
		return underwritingService.retrievePolCoverageOc(rpcr);
	}
	
	@PostMapping(path="savePolCoverageOc")
	public @ResponseBody SavePolCoverageOcResponse savePolCoverageOc(@RequestBody SavePolCoverageOcRequest sqcr) throws SQLException {
		logger.info("GET: /api/underwriting-service/savePolCoverageOc");
		logger.info("SavePolCoverageOcRequest : " + sqcr.toString());
		return underwritingService.savePolCoverageOc(sqcr);
	}
	
	@PostMapping(path="savePolEndtOc")
	public @ResponseBody SavePolEndtOcResponse savePolEndtOc(@RequestBody SavePolEndtOcRequest sqcr) throws SQLException {
		logger.info("GET: /api/underwriting-service/savePolEndtOc");
		logger.info("SavePolEndtOcRequest : " + sqcr.toString());
		return underwritingService.savePolEndtOc(sqcr);
	}
	
	@PostMapping(path="savePolGenInfo")
	public @ResponseBody SavePolGenInfoResponse savePolGenInfo(@RequestBody SavePolGenInfoRequest spgip) throws SQLException {
		logger.info("POST: /api/underwriting-service/savePolGenInfo");
		logger.info("SavePolGenInfoRequest : " + spgip.toString());
		return underwritingService.savePolGenInfo(spgip);
	}
	
	@PostMapping(path="savePolicyDetails")
	public @ResponseBody SavePolicyDetailsResponse savePolicyDetails(@RequestBody SavePolicyDetailsRequest spdp) throws SQLException {
		logger.info("POST: /api/underwriting-service/savePolicyDetails");
		logger.info("SavePolicyDetails : " + spdp.toString());
		return underwritingService.savePolicyDetails(spdp);
	}
		
	@GetMapping(path="retrievePolicyInformation")
	public @ResponseBody RetrievePolicyInformationResponse retrievePolicyInformation(RetrievePolicyInformationRequest rpir) throws SQLException {
		logger.info("GET: /api/Policy-service/retrievePolInquiry");
		logger.info("RetrievePolInquiryRequest : " + rpir.toString());
		return underwritingService.retrievePolicyInformation(rpir);
	}
	
	@PostMapping(path="savePolInwardBal")
	public @ResponseBody SavePolInwardBalResponse savePolInwardBal(@RequestBody SavePolInwardBalRequest spibr) throws SQLException {
		logger.info("POST: /api/Policy-service/savePolInwardBal");
		logger.info("SavePolInwardBalRequest : " + spibr.toString());
		return underwritingService.savePolInwardBal(spibr);
	}
	
	@PostMapping(path="savePolEndorsement")
	public @ResponseBody SavePolEndorsementResponse savePolEndorsement(@RequestBody SavePolEndorsementRequest sper) throws SQLException {
		logger.info("GET: /api/Policy-service/savePolEndorsement");
		logger.info("SavePolEndorsementRequest : " + sper.toString());
		return underwritingService.savePolEndorsement(sper);
	}
	
	@PostMapping(path="saveSumInsOC")
	public @ResponseBody SaveSumInsOCResponse saveSumInsOC(@RequestBody SaveSumInsOCRequest ssioc) throws SQLException {
		logger.info("POST: /api/Policy-service/saveSumInsOC");
		logger.info("SaveSumInsOCRequest : " + ssioc.toString());
		return underwritingService.saveSumInsOC(ssioc);
	}
	
	@GetMapping(path="retrievePolicyOCListing")
	public @ResponseBody RetrievePolicyOCListingResponse retrievePolicyOCListing(RetrievePolicyOCListingRequest rplp) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolicyOCListing");
		logger.info("RetrievePolicyOCListing : " + rplp.toString());
		return underwritingService.retrievePolicyOCListing(rplp);
	}
		
	@PostMapping(path="updatePolHoldCoverStatus")
	public @ResponseBody UpdatePolHoldCoverStatusResponse savePolHoldCover(@RequestBody UpdatePolHoldCoverStatusRequest uphcsr) throws SQLException {
		logger.info("POST: /api/underwriting-service/updatePolHoldCoverStatus");
		logger.info("UpdatePolHoldCoverStatusRequest : " + uphcsr.toString());
		return underwritingService.updatePolHoldCoverStatus(uphcsr);
	}
	
	@PostMapping(path="saveOpenPolDetails")
	public @ResponseBody SaveOpenPolDetailsResponse savePolAttachment(@RequestBody SaveOpenPolDetailsRequest sopdr) throws SQLException {
		logger.info("POST: /api/underwriting-service/saveOpenPolDetails");
		logger.info("SaveOpenPolDetailsRequest : " + sopdr.toString());
		return underwritingService.saveOpenPolDetails(sopdr);
	}
	
	@GetMapping(path="retrievePolicyApprover")
	public @ResponseBody RetrievePolicyApproverResponse retrieveQuoteApprover(RetrievePolicyApproverRequest rqar) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolicyApprover");
		logger.info("RetrievePolicyApproverRequest : " + rqar.toString());
		return underwritingService.retrievePolicyApprover(rqar);
	}
	
	@PostMapping(path="updatePolicyStatus")
	public @ResponseBody UpdatePolicyStatusResponse updatePolicyStatus(@RequestBody UpdatePolicyStatusRequest upsr) throws SQLException {
		logger.info("GET: /api/underwriting-service/updatePolicyStatus");
		logger.info("UpdatePolicyStatusRequest : " + upsr.toString());
		return underwritingService.updatePolicyStatus(upsr);
	}
	
	@GetMapping(path="retrieveWfmApprovals")
	public @ResponseBody RetrieveWfmApprovalsResponse retrieveWfmApprovals(RetrieveWfmApprovalsRequest rwar) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrieveWfmApprovals");
		logger.info("RetrieveWfmApprovalsRequest : " + rwar.toString());
		return underwritingService.retrieveWfmApprovals(rwar);
	}
	

	@GetMapping(path="retrievePolHoldCoverListing")
	public @ResponseBody RetrievePolHoldCoverResponse retrievePolHoldCoverListing(RetrievePolHoldCoverListingRequest rphclr) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolHoldCoverListing");
		logger.info("RetrievePolHoldCoverListingRequest : " + rphclr.toString());
		return underwritingService.retrievePolHoldCoverListing(rphclr);
	}


	@GetMapping(path="retrievePolGenInfoOc")
	public @ResponseBody RetrievePolGenInfoOcResponse retrievePolGenInfoOc(RetrievePolGenInfoOcRequest rpgior) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolGenInfoOc");
		logger.info("RetrievePolGenInfoOcRequest : " + rpgior.toString());
		return underwritingService.retrievePolGenInfoOc(rpgior);
	}
	
	@GetMapping(path="retrievePolCoverageAlt")
	public @ResponseBody RetrievePolCoverageAltResponse retrievePolCoverageAlt(RetrievePolCoverageAltRequest rpcr) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolCoverageAlt");
		logger.info("RetrievePolCoverageAltRequest : " + rpcr.toString());
		return underwritingService.retrivePolCoverageAlt(rpcr);
	}
	
	@PostMapping(path="savePolAttachmentOc")
	public @ResponseBody SavePolAttachmentOcResponse savePolAttachmentOc(@RequestBody SavePolAttachmentOcRequest spaocr) throws SQLException {
		logger.info("POST: /api/underwriting-service/savePolAttachmentOc");
		logger.info("SavePolAttachmentOcRequest : " + spaocr.toString());
		return underwritingService.savePolAttachmentOc(spaocr);
	}
	
	@GetMapping(path="retrieveAlterationsPerPolicy")
	public @ResponseBody RetrieveAlterationsPerPolicyResponse retrieveAlterationsPerPolicy(RetrieveAlterationsPerPolicyRequest rappr) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrieveAlterationsPerPolicy");
		logger.info("RetrieveAlterationsPerPolicyRequest : " + rappr.toString());
		return underwritingService.retrieveAlterationsPerPolicy(rappr);
	}
	
	@PostMapping(path="updatePolGenInfoSpoilage")
	public @ResponseBody UpdatePolGenInfoSpoilageResponse updatePolGenInfoSpoilage(@RequestBody UpdatePolGenInfoSpoilageRequest upgisr) throws SQLException {
		logger.info("GET: /api/underwriting-service/updatePolGenInfoSpoilage");
		logger.info("UpdatePolGenInfoSpoilageRequest : " + upgisr.toString());
		return underwritingService.updatePolGenInfoSpoilage(upgisr);
	}
	
	@PostMapping(path="savePolGenInfoOc")
	public @ResponseBody SavePolGenInfoOcResponse savePolGenInfoOc(@RequestBody SavePolGenInfoOcRequest spgip) throws SQLException {
		logger.info("POST: /api/underwriting-service/savePolGenInfoOc");
		logger.info("SavePolGenInfoOcRequest : " + spgip.toString());
		return underwritingService.savePolGenInfoOc(spgip);
	}
	
	@PostMapping(path="updatePolGenInfo")
	public @ResponseBody UpdatePolGenInfoResponse updatePolGenInfo(@RequestBody UpdatePolGenInfoRequest uppgif) throws SQLException {
		logger.info("POST: /api/underwriting-service/updatePolGenInfo");
		logger.info("UpdatePolGenInfoRequest : " + uppgif.toString());
		return underwritingService.updatePolGenInfo(uppgif);
	}
	
	@PostMapping(path="postPolicy")
	public @ResponseBody PostPolicyResponse postPolicy(@RequestBody PostPolicyRequest ppr) throws SQLException {
		logger.info("POST: /api/underwriting-service/postPolicy");
		logger.info("postPolicy : " + ppr.toString());
		return underwritingService.postPolicy(ppr);
	}
	
	@PostMapping(path="generateHundredValuePolPrinting")
	public @ResponseBody GenHundredValPolPrintingResponse genHundredValPolPrinting(@RequestBody GenHundredValPolPrintingRequest ghvppr) throws SQLException {
		logger.info("POST: /api/underwriting-service/generateHundredValuePolPrinting");
		logger.info("genHundredValPolPrinting : " + ghvppr.toString());
		return underwritingService.genHundredValPolPrinting(ghvppr);
	}

	@GetMapping(path="retrievePolFullCoverage")
	public @ResponseBody RetrievePolFullCoverageResponse retrievePolFullCoverage(RetrievePolFullCoverageRequest rpcr) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolFullCoverage");
		logger.info("RetrievePolFullCoverageRequest : " + rpcr.toString());
		return underwritingService.retrievePolFullCoverage(rpcr);
	}
	
	@PostMapping(path="savePolFullCoverage")
	public @ResponseBody SavePolFullCoverageResponse savePolFullCoverage(@RequestBody SavePolFullCoverageRequest sqcr) throws SQLException {
		logger.info("POST: /api/underwriting-service/savePolFullCoverage");
		logger.info("SavePolFullCoverageRequest : " + sqcr.toString());
		return underwritingService.savePolFullCoverage(sqcr);
	}
	
	@PostMapping(path="extractExpiringPolicy")
	public @ResponseBody ExtractExpiringPolicyResponse extractExpiringPolicy(@RequestBody ExtractExpiringPolicyRequest eepr) throws SQLException {
		logger.info("POST: /api/underwriting-service/extractExpiringPolicy");
		logger.info("ExtractExpiringPolicyRequest : " + eepr.toString());
		return underwritingService.extractExpiringPolicy(eepr);
	}
	
	@GetMapping(path="retrieveExpPolList")
	public @ResponseBody RetrieveExpPolListResponse retrieveExpPolList(RetrieveExpPolListRequest replr) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrieveExpPolList");
		logger.info("RetrieveExpPolListRequest : " + replr.toString());
		return underwritingService.retrieveExpPolList(replr);
	}

	@GetMapping(path="retrievePolDist")
	public @ResponseBody RetrievePolDistResponse retrievePolDist(RetrievePolDistRequest rpcr) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolDist");
		logger.info("RetrievePolDistRequest : " + rpcr.toString());
		return underwritingService.retrievePolDist(rpcr);
	}
	
	@GetMapping(path="retrievePolDistCum")
	public @ResponseBody RetrievePolDistResponse retrievePolDistCum(RetrievePolDistRequest rpcr) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolDistCum");
		logger.info("RetrievePolDistRequest : " + rpcr.toString());
		return underwritingService.retrievePolDistCum(rpcr);
	}
	
	@PostMapping(path="processRenewablePolicy")
	public @ResponseBody ProcessRenewablePolicyResponse processRenewablePolicy(@RequestBody ProcessRenewablePolicyRequest prpr) throws SQLException {
		logger.info("POST: /api/underwriting-service/processRenewablePolicy");
		logger.info("processRenewablePolicy : " + prpr.toString());
		return underwritingService.processRenewablePolicy(prpr);
	}
	
	@GetMapping(path="retrieveRiskDist")
	public @ResponseBody RetrieveRiskDistributionResponse retrieveRiskDist(RetrieveRiskDistributionRequest rrdr) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrieveRiskDist");
		logger.info("RetrieveRiskDistributionRequest : " + rrdr.toString());
		return underwritingService.retrieveRiskDist(rrdr);
	}
	
	@GetMapping(path="retrievePoolDist")
	public @ResponseBody RetrievePoolDistributionResponse retrievePoolDist(RetrievePoolDistributionRequest rpdr) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrievePoolDist");
		logger.info("RetrievePoolDistributionRequest : " + rpdr.toString());
		return underwritingService.retrievePoolDist(rpdr);
	}
	
	@GetMapping(path="retrieveDistCoIns")
	public @ResponseBody RetrieveDistCoInsResponse retrieveRiskDist(RetrieveDistCoInsRequest rdcir) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrieveDistCoIns");
		logger.info("RetrieveDistCoInsResponse : " + rdcir.toString());
		return underwritingService.retrieveDistCoIns(rdcir);
	}
	
	@PostMapping(path="postDistribution")
	public @ResponseBody PostDistributionResponse postDistribution(@RequestBody PostDistributionRequest pdr) throws SQLException {
		logger.info("POST: /api/underwriting-service/postDistribution");
		logger.info("PostDistributionRequest : " + pdr.toString());
		return underwritingService.postDistribution(pdr);
	}
	
	@GetMapping(path="retrievePolPoolDist")
	public @ResponseBody RetrievePoolDistributionResponse retrievePolPoolDist(RetrievePoolDistributionRequest rpdr) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrievePolPoolDist");
		logger.info("RetrievePolPoolDistributionRequest : " + rpdr.toString());
		return underwritingService.retrievePolPoolDist(rpdr);
	}
	
	@GetMapping(path="retrievePolPoolDistCum")
	public @ResponseBody RetrievePoolDistributionResponse retrievePolPoolDistCum(RetrievePoolDistributionRequest rpdr) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrievePolPoolDistCum");
		logger.info("RetrievePolPoolDistributionRequest : " + rpdr.toString());
		return underwritingService.retrievePolPoolDistCum(rpdr);
	}
	
	@GetMapping(path="retrievePolForPurging")
	public @ResponseBody RetrievePolForPurgingResponse retrievePolForPurging(RetrievePolForPurgingRequest rpfpr) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrievePolForPurging");
		logger.info("RetrievePolForPurgingRequest : " + rpfpr.toString());
		return underwritingService.retrievePolForPurging(rpfpr);
	}
	
	@PostMapping(path="purgeExpiringPol")
	public @ResponseBody PurgeExpiringPolResponse purgeExpiryPol(@RequestBody PurgeExpiringPolRequest eepr) throws SQLException {
		logger.info("POST: /api/underwriting-service/purgeExpiringPol");
		logger.info("PurgeExpiringPolRequest : " + eepr.toString());
		return underwritingService.purgeExpiryPol(eepr);
	}
	
	@PostMapping(path="saveRiskDist")
	public @ResponseBody SaveRiskDistResponse saveRiskDist(@RequestBody SaveRiskDistRequest srdr) throws SQLException {
		logger.info("POST: /api/underwriting-service/saveRiskDist");
		logger.info("SaveRiskDistRequest : " + srdr.toString());
		return underwritingService.saveRiskDist(srdr);
	}
	
	@PostMapping(path="distributeRiskDist")
	public @ResponseBody DistRiskResponse distributeRiskDist(@RequestBody DistRiskRequest drr) throws SQLException {
		logger.info("POST: /api/underwriting-service/distributeRiskDist");
		logger.info("SaveRiskDistRequest : " + drr.toString());
		return underwritingService.distributeRiskDist(drr);
	}
	
	@GetMapping(path="retrievePolDistList")
	public @ResponseBody RetrievePolDistListResponse retrievePolDistList(RetrievePolDistListRequest rpdlr) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrievePolDistList");
		logger.info("RetrievePolDistListRequest : " + rpdlr.toString());
		return underwritingService.retrievePolDistList(rpdlr);
	}
	
	@PostMapping(path="saveExpCatPeril")
	public @ResponseBody SaveExpCatPerilResponse saveExpCatPeril(@RequestBody SaveExpCatPerilRequest eepr) throws SQLException {
		logger.info("POST: /api/underwriting-service/saveExpCatPeril");
		logger.info("SaveExpCatPerilRequest : " + eepr.toString());
		return underwritingService.saveExpCatPeril(eepr);
	}
	
	@PostMapping(path="saveExpCoverage")
	public @ResponseBody SaveExpCovResponse saveExpCoverage(@RequestBody SaveExpCovRequest eepr) throws SQLException {
		logger.info("POST: /api/underwriting-service/saveExpCoverage");
		logger.info("SaveExpCovRequest : " + eepr.toString());
		return underwritingService.saveExpCoverage(eepr);
	}
	
	@PostMapping(path="negateDistribution")
	public @ResponseBody NegateDistributionResponse negateDistribution(@RequestBody NegateDistributionRequest ndr) throws SQLException {
		logger.info("POST: /api/underwriting-service/negateDistribution");
		logger.info("NegateDistributionRequest : " + ndr.toString());
		NegateDistributionResponse test = underwritingService.negateDistribution(ndr);
		logger.info("test response" + test.toString());
		return test;
	}
	
	@PostMapping(path="saveExpGenInfo")
	public @ResponseBody SaveExpGenInfoResponse saveExpGenInfo(@RequestBody SaveExpGenInfoRequest segir) throws SQLException {
		logger.info("POST: /api/underwriting-service/saveExpGenInfo");
		logger.info("SaveExpGenInfoRequest : " + segir.toString());
		return underwritingService.saveExpGenInfo(segir);
	}
	
	@GetMapping(path="retrievePolDistWarning")
	public @ResponseBody RetrievePolDistWarningResponse retrievePolDistWarning(RetrievePolDistWarningRequest rpdwr) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrievePolDistWarning");
		logger.info("RetrievePolDistWarningRequest : " + rpdwr.toString());
		return underwritingService.retrievePolDistWarning(rpdwr);
	}
	
	@GetMapping(path="retrievePolDistInst")
	public @ResponseBody RetrievePolDistInstResponse retrievePolDistInst(RetrievePolDistInstRequest rpdir) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrievePolDistInst");
		logger.info("RetrievePolDistInstRequest : " + rpdir.toString());
		return underwritingService.retrievePolDistInst(rpdir);
	}
	
	@GetMapping(path="retrievePolDistInstPool")
	public @ResponseBody RetrievePoolDistributionResponse retrievePolDistInstPool(RetrievePolDistInstPoolRequest rpdir) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrievePolDistInstPool");
		logger.info("RetrievePolDistInstPoolRequest : " + rpdir.toString());
		return underwritingService.retrievePolDistInstPool(rpdir);
	}
	
	@GetMapping(path="retrievePolInstTagAcctDate")
	public @ResponseBody RetrievePolInstTagAcctDateResponse retrievePolInstTagAcctDate(RetrievePolInstTagAcctDateRequest rpdir) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrievePolInstTagAcctDate");
		logger.info("RetrievePolInstTagAcctDateRequest : " + rpdir.toString());
		return underwritingService.retrievePolInstTagAcctDate(rpdir);
	}
	
	@GetMapping(path="retrieveValidBookingDate")
	public @ResponseBody RetrieveValidBookingDateResponse retrieveValidBookingDate(RetrieveValidBookingDateRequest rpdir) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrieveValidBookingDate");
		logger.info("RetrieveValidBookingDateRequest : " + rpdir.toString());
		return underwritingService.retrieveValidBookingDate(rpdir);
	}
	
	@PostMapping(path="updatePolOpenCoverStatus")
	public @ResponseBody UpdatePolOpenCoverStatusResponse updatePolOpenCoverStatus(@RequestBody UpdatePolOpenCoverStatusRequest uphcsr) throws SQLException {
		logger.info("POST: /api/underwriting-service/updatePolOpenCoverStatus");
		logger.info("UpdatePolOpenCoverStatusRequest : " + uphcsr.toString());
		return underwritingService.updatePolOpenCoverStatus(uphcsr);
	}
	
	@PostMapping(path="batchDistribution")
	public @ResponseBody BatchDistributionResponse batchDistribution(@RequestBody BatchDistributionRequest uphcsr) throws SQLException {
		logger.info("POST: /api/underwriting-service/batchDistribution");
		logger.info("batchDistributionRequest : " + uphcsr.toString());
		return underwritingService.batchDistribution(uphcsr);
	}
	
	@PostMapping(path="batchPosting")
	public @ResponseBody BatchPostingResponse batchPosting(@RequestBody BatchPostingRequest uphcsr) throws SQLException {
		logger.info("POST: /api/underwriting-service/BatchPosting");
		logger.info("BatchPostingRequest : " + uphcsr.toString());
		return underwritingService.batchPosting(uphcsr);
	}
	
	@GetMapping(path="retrieveLastExtractInfo")
	public @ResponseBody RetrieveLastExtractInfoResponse retrieveLastExtractInfo() throws SQLException{
		logger.info("GET: /api/underwriting-service/retrieveLastExtractInfo");
		return underwritingService.retrieveLastExtractInfo();
	}
	
	@GetMapping(path="retrieveNegateDistList")
	public @ResponseBody RetrievePolDistListResponse retrieveNegateDistList(RetrievePolDistListRequest rpdir) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrieveNegateDistList");
		logger.info("RetrieveNegateDistListRequest : " + rpdir.toString());
		return underwritingService.retrieveNegateDistList(rpdir);
	}
	
	@PostMapping(path="extGenRenExpPolicy")
	public @ResponseBody ExtGenRenExpPolicyResponse extGenRenExpPolicy(@RequestBody ExtGenRenExpPolicyRequest erepr) throws SQLException {
		logger.info("POST: /api/underwriting-service/extGenRenExpPolicy");
		logger.info("ExtractRenExpPolicyRequest : " + erepr.toString());
		return underwritingService.extractRenExpPolicy(erepr);
	}
	
	@GetMapping(path="retrievePolEndtDed")
	public @ResponseBody RetrievePolEndtDedResponse retrievePolEndtDed(RetrievePolEndtDedRequest rpedr) throws SQLException{
		logger.info("GET: /api/underwriting-service/retrievePolEndtDed");
		logger.info("RetrievePolEndtDedRequest : " + rpedr.toString());
		return underwritingService.retrievePolEndtDed(rpedr);
	}
}
