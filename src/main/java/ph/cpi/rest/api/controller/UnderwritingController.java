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

import ph.cpi.rest.api.model.request.RetrievePolAlopItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolAlopRequest;
import ph.cpi.rest.api.model.request.RetrievePolAttachmentOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrievePolCATPerilRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoInsuranceRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageAltRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtRequest;
import ph.cpi.rest.api.model.request.RetrievePolGenInfoRequest;
import ph.cpi.rest.api.model.request.RetrievePolHoldCoverRequest;
import ph.cpi.rest.api.model.request.RetrievePolInwardBalRequest;
import ph.cpi.rest.api.model.request.RetrievePolItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyApproverRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyInformationRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyListingRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyOCListingRequest;
import ph.cpi.rest.api.model.request.RetrieveWfmApprovalsRequest;
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
import ph.cpi.rest.api.model.request.SavePolGenInfoRequest;
import ph.cpi.rest.api.model.request.SavePolHoldCoverRequest;
import ph.cpi.rest.api.model.request.SavePolInwardBalRequest;
import ph.cpi.rest.api.model.request.SavePolItemRequest;
import ph.cpi.rest.api.model.request.SavePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.SavePolicyDetailsRequest;
import ph.cpi.rest.api.model.request.SaveSumInsOCRequest;
import ph.cpi.rest.api.model.request.UpdatePolHoldCoverStatusRequest;
import ph.cpi.rest.api.model.request.UpdatePolicyStatusRequest;
import ph.cpi.rest.api.model.response.RetrievePolAlopItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolAlopResponse;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrievePolCATPerilResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoInsuranceResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageAltResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtResponse;
import ph.cpi.rest.api.model.response.RetrievePolGenInfoResponse;
import ph.cpi.rest.api.model.response.RetrievePolHoldCoverResponse;
import ph.cpi.rest.api.model.response.RetrievePolInwardBalResponse;
import ph.cpi.rest.api.model.response.RetrievePolItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyApproverResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyInformationResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyListingResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyOCListingResponse;
import ph.cpi.rest.api.model.response.RetrieveWfmApprovalsResponse;
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
import ph.cpi.rest.api.model.response.SavePolGenInfoResponse;
import ph.cpi.rest.api.model.response.SavePolHoldCoverResponse;
import ph.cpi.rest.api.model.response.SavePolInwardBalResponse;
import ph.cpi.rest.api.model.response.SavePolItemResponse;
import ph.cpi.rest.api.model.response.SavePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.SavePolicyDetailsResponse;
import ph.cpi.rest.api.model.response.SaveSumInsOCResponse;
import ph.cpi.rest.api.model.response.UpdatePolHoldCoverStatusResponse;
import ph.cpi.rest.api.model.response.UpdatePolicyStatusResponse;
import ph.cpi.rest.api.service.UnderwritingService;

@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080"})
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
		logger.info("GET: /api/underwriting-service/savePolCoverage");
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
}
