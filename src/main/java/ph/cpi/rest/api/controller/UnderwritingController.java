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

import ph.cpi.rest.api.model.request.RetrievePolAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrievePolCATPerilRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtRequest;
import ph.cpi.rest.api.model.request.RetrievePolItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.SavePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrievePolCATPerilResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtResponse;
import ph.cpi.rest.api.model.response.RetrievePolItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.SavePolicyDeductiblesResponse;
import ph.cpi.rest.api.service.UnderwritingService;


@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080"})
@RequestMapping(path="/underwriting-service")
public class UnderwritingController {
	
	@Autowired
	private UnderwritingService underwritingService;
	
	private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
	
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

	@PostMapping(path="savePolicyDeductibles")
	public @ResponseBody SavePolicyDeductiblesResponse savePolicyDeductibles(@RequestBody SavePolicyDeductiblesRequest spdr) throws SQLException {
		logger.info("GET: /api/Policy-service/savePolicyDeductibles");
		logger.info("SavePolicyDeductiblesRequest : " + spdr.toString());
		return underwritingService.savePolicyDeductibles(spdr);
	}
}
