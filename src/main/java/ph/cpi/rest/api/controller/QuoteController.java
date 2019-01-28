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
import ph.cpi.rest.api.model.request.RetrieveQuoteAttachmentOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteCompetitionRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteCoverageOcRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAttachmentOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteCompetitionResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteCoverageOcResponse;
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
	@GetMapping(path="retrieveQuoteAttachmentOc")
	public @ResponseBody RetrieveQuoteAttachmentOcResponse retrieveQuoteAttachmentOc(RetrieveQuoteAttachmentOcRequest rqaor) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteAttachmentOc");
		logger.info("RetrieveQuoteAttachmentOc : " + rqaor.toString());
		return quoteService.retrieveQuoteAttachmentOc(rqaor);
	}
	@GetMapping(path="retrieveQuoteCompetition")
	public @ResponseBody RetrieveQuoteCompetitionResponse retrieveQuoteCompetition(RetrieveQuoteCompetitionRequest rqcr) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteCompetition");
		logger.info("RetrieveQuoteCompetition : " + rqcr.toString());
		return quoteService.retrieveQuoteCompetition(rqcr);
	}
	@GetMapping(path="retrieveQuoteCoverageOc")
	public @ResponseBody RetrieveQuoteCoverageOcResponse retrieveQuoteCoverageOc(RetrieveQuoteCoverageOcRequest rqcor) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteCoverageOc");
		logger.info("RetrieveQuoteCoverageOc : " + rqcor.toString());
		return quoteService.retrieveQuoteCoverageOc(rqcor);
	}
	
}
