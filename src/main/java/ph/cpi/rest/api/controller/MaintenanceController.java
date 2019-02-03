package ph.cpi.rest.api.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ph.cpi.rest.api.model.request.RetrieveMtnRiskListingRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnRiskRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnSectionCoversRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTypeOfCessionRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnRiskListingResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnRiskResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnSectionCoversResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTypeOfCessionResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.service.MaintenanceService;

@Controller
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
}
