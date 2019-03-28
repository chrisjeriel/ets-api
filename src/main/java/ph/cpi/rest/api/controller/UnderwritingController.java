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
import ph.cpi.rest.api.model.request.RetrievePolAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrievePolCATPerilRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoInsuranceRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtRequest;
import ph.cpi.rest.api.model.request.RetrievePolGenInfoRequest;
import ph.cpi.rest.api.model.request.RetrievePolInwardBalRequest;
import ph.cpi.rest.api.model.request.RetrievePolItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyListingRequest;
import ph.cpi.rest.api.model.request.SavePolAlopItemRequest;
import ph.cpi.rest.api.model.request.SavePolAlopRequest;
import ph.cpi.rest.api.model.request.SavePolAttachmentRequest;
import ph.cpi.rest.api.model.request.SavePolCoverageRequest;
import ph.cpi.rest.api.model.request.SavePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.response.RetrievePolAlopItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolAlopResponse;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrievePolCATPerilResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoInsuranceResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtResponse;
import ph.cpi.rest.api.model.response.RetrievePolGenInfoResponse;
import ph.cpi.rest.api.model.response.RetrievePolInwardBalResponse;
import ph.cpi.rest.api.model.response.RetrievePolItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyListingResponse;
import ph.cpi.rest.api.model.response.SavePolAlopItemResponse;
import ph.cpi.rest.api.model.response.SavePolAlopResponse;
import ph.cpi.rest.api.model.response.SavePolAttachmentResponse;
import ph.cpi.rest.api.model.response.SavePolCoverageResponse;
import ph.cpi.rest.api.model.response.SavePolicyDeductiblesResponse;
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
		logger.info("POST: /api/quote-service/savePolAlopItemRequest");
		logger.info("SavePolAlopItemRequest : " + spaip.toString());
		return underwritingService.savePolAlopItem(spaip);
	}
	
	@GetMapping(path="retrievePolCoverageOc")
	public @ResponseBody RetrievePolCoverageOcResponse retrievePolCoverageOc(RetrievePolCoverageOcRequest rpcr) throws SQLException {
		logger.info("GET: /api/underwriting-service/retrievePolCoverageOc");
		logger.info("RetrievePolCoverageOcRequest : " + rpcr.toString());
		return underwritingService.retrievePolCoverageOc(rpcr);
	}
}
