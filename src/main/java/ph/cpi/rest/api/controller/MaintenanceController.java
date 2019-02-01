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

import ph.cpi.rest.api.model.request.RetrieveMtnIntermediaryRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnLineClassRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnLineRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnIntermediaryResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnLineClassResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnLineResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.service.MaintenanceService;

@CrossOrigin(origins="http://localhost:4200")
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
	
	@GetMapping(path="retrieveMntIntermediary")
	public @ResponseBody RetrieveMtnIntermediaryResponse retrieveMtnIntermediary(RetrieveMtnIntermediaryRequest rmip) throws SQLException {
		logger.info("GET: /api/maintenance-service/retrieveMntIntermediary");
		logger.info("RetrieveMtnIntermediaryRequest : " + rmip.toString());
		return maintenanceService.retrieveMtnIntermediary(rmip);
	}
	
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

}
