package ph.cpi.rest.api.controller;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteEndorsementsOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteEndorsementsRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteGeneralInfoRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteEndorsementsOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteEndorsementsResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteGeneralInfoResponse;
import ph.cpi.rest.api.service.QuoteService;

@CrossOrigin(origins="http://localhost:4200")
@Controller
@RequestMapping(path="/quote-service")
public class QuoteController {
	
	@Autowired
	private QuoteService quoteService;
	
	private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
	
	@GetMapping(path="retrieveQuoteAlop")
	public @ResponseBody RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteAlop");
		logger.info("RetrieveQuoteAlopRequest : " + rqap.toString());
		return quoteService.retrieveQuoteAlop(rqap);
	}
	
	@CrossOrigin
	@GetMapping(path="retrieveQuoteGeneralInfo")
	public @ResponseBody RetrieveQuoteGeneralInfoResponse retrieveQuoteGeneralInfo(RetrieveQuoteGeneralInfoRequest rqgip) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteGeneralInfo");
		logger.info("RetrieveQuoteAlopRequest : " + rqgip.toString());
		return quoteService.retrieveQuoteGeneralInfo(rqgip);
	}
	
	@GetMapping(path="retrieveQuoteEndorsements")
	public @ResponseBody RetrieveQuoteEndorsementsResponse retrieveQuoteEndorsements(RetrieveQuoteEndorsementsRequest rqerp) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteEndorsements");
		logger.info("RetrieveQuoteEndorsementsRequest : " + rqerp.toString());
		return quoteService.retrieveQuoteEndorsements(rqerp);
	}
	
	@GetMapping(path="retrieveQuoteEndorsementsOc")
	public @ResponseBody RetrieveQuoteEndorsementsOcResponse retrieveQuoteEndorsementsOc(RetrieveQuoteEndorsementsOcRequest rqerop) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteEndorsementsOc");
		logger.info("RetrieveQuoteEndorsementsOcRequest : " + rqerop.toString());
		return quoteService.retrieveQuoteEndorsementsOc(rqerop);
	}

}
