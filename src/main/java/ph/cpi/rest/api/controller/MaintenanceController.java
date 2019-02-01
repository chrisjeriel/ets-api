package ph.cpi.rest.api.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ph.cpi.rest.api.model.request.RetrieveMtnObjectRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnProvinceRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnQuoteWordingsRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnRegionRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnObjectResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnProvinceResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnQuoteWordingsResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnRegionResponse;
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

}
