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

import ph.cpi.rest.api.model.request.RetrievePolCoInsuranceRequest;
import ph.cpi.rest.api.model.request.RetrievePolInwardBalRequest;
import ph.cpi.rest.api.model.response.RetrievePolCoInsuranceResponse;
import ph.cpi.rest.api.model.response.RetrievePolInwardBalResponse;
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
	
}
