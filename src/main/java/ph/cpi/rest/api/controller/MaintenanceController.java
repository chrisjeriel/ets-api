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

import ph.cpi.rest.api.model.request.RetrieveMtnCityRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCrestaZoneRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCurrencyRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnCityResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCrestaZoneResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCurrencyResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.service.MaintenanceService;

@CrossOrigin(origins = {"http://127.0.0.1:4200", "http://localhost:4200"})
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

}
