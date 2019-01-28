package ph.cpi.rest.api.controller;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteCoverageRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteDetailsOcRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteCoverageResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteDetailsOcResponse;
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
	
	@GetMapping(path="retrieveQuoteCoverage")
	public @ResponseBody RetrieveQuoteCoverageResponse retrieveQuoteCoverage(RetrieveQuoteCoverageRequest rqcr) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteCoverage");
		logger.info("RetrieveQuoteCoverageRequest : " + rqcr.toString());
		return quoteService.retrieveQuoteCoverage(rqcr);
	}
	
	@GetMapping(path="retrieveQuoteDetailsOc")
	public @ResponseBody RetrieveQuoteDetailsOcResponse retrieveQuoteDetailsOc(RetrieveQuoteDetailsOcRequest rqdocr) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteDetailsOc");
		logger.info("RetrieveQuoteDetailsOcRequest : " + rqdocr.toString());
		return quoteService.retrieveQuoteDetailsOc(rqdocr);
	}
	
}
