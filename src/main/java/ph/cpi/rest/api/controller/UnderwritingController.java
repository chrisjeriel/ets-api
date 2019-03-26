package ph.cpi.rest.api.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ph.cpi.rest.api.model.request.RetrievePolAlopItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolAlopRequest;
import ph.cpi.rest.api.model.request.RetrievePolAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrievePolCATPerilRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoInsuranceRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtRequest;
import ph.cpi.rest.api.model.request.RetrievePolGenInfoRequest;
import ph.cpi.rest.api.model.request.RetrievePolInwardBalRequest;
import ph.cpi.rest.api.model.request.RetrievePolItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.response.RetrievePolAlopItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolAlopResponse;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrievePolCATPerilResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoInsuranceResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtResponse;
import ph.cpi.rest.api.model.response.RetrievePolGenInfoResponse;
import ph.cpi.rest.api.model.response.RetrievePolInwardBalResponse;
import ph.cpi.rest.api.model.response.RetrievePolItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyDeductiblesResponse;
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
	
}
