package ph.cpi.rest.api.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ph.cpi.rest.api.model.request.RetrieveEndtCodeRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnDeductiblesRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnDistrictRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnInsuredRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.response.RetrieveEndtCodeResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnDeductiblesResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnDistrictResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnInsuredResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.service.MaintenanceService;

@Controller
@RequestMapping(path="/maintenance-service")
public class MaintenanceController {
	
	@Autowired
	private MaintenanceService maintenanceService;
	
	private static final Logger logger = LoggerFactory.getLogger(MaintenanceController.class);
	
	@GetMapping(path="retrieveQuoteAlop")
	public @ResponseBody RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveQuoteAlop");
		logger.info("RetrieveQuoteAlopRequest : " + rqap.toString());
		return maintenanceService.retrieveQuoteAlop(rqap);
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

	@GetMapping(path="retrieveMtnDeductibles")
	public @ResponseBody RetrieveMtnDeductiblesResponse retrieveMtnDeductibles(RetrieveMtnDeductiblesRequest rmdr) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMtnDeductibles");
		logger.info("RetrieveMtnDeductibles : " + rmdr.toString());
		return maintenanceService.retrieveMtnDeductibles(rmdr);
	}
}
