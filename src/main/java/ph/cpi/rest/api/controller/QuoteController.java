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

import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteGeneralInfoOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteHoldCoverListingRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteHoldCoverRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteGeneralInfoOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteHoldCoverResponse;
import ph.cpi.rest.api.service.QuoteService;

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
	
	@GetMapping(path="retrieveQuoteHoldCover")
	public @ResponseBody RetrieveQuoteHoldCoverResponse retrieveQuoteHoldCover(RetrieveQuoteHoldCoverRequest rqhcp) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteHoldCover");
		logger.info("RetrieveQuoteHoldCoverRequest : " + rqhcp.toString());
		return quoteService.retrieveQuoteHoldCover(rqhcp);
	}
	
	@CrossOrigin
	@GetMapping(path="retrieveQuoteGeneralInfoOc")
	public @ResponseBody RetrieveQuoteGeneralInfoOcResponse retrieveQuoteGeneralInfoOc(RetrieveQuoteGeneralInfoOcRequest rqgiocp) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteGeneralInfoOc");
		logger.info("RetrieveQuoteGeneralInfoOcRequest : " + rqgiocp.toString());
		return quoteService.retrieveQuoteGeneralInfoOc(rqgiocp);
	}
	
	@GetMapping(path="retrieveQuoteHoldCoverListing")
	public @ResponseBody RetrieveQuoteHoldCoverResponse retrieveQuoteHoldCoverListing(RetrieveQuoteHoldCoverListingRequest rqhclp) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteHoldCoverListing");
		logger.info("RetrieveQuoteHoldCoverListingRequest : " + rqhclp.toString());
		return quoteService.retrieveQuoteHoldCoverListing(rqhclp);
	}
	
	

}
