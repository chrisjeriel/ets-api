package ph.cpi.rest.api.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ph.cpi.rest.api.model.Employee;
import ph.cpi.rest.api.model.request.RetrieveQuoteCoverageRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteDetailsOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteDetailsRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteListingOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteListingRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteOptionRequest;
import ph.cpi.rest.api.model.request.SaveQuoteAlopRequest;
import ph.cpi.rest.api.model.request.SaveQuoteAttachmentRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteCoverageResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteDetailsOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteDetailsResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteListingOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteListingResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteOptionResponse;
import ph.cpi.rest.api.model.response.SaveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.SaveQuoteAttachmentResponse;
import ph.cpi.rest.api.service.QuoteService;

@Controller
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(path="/quote-service")
public class QuoteController {
	
	@Autowired
	private QuoteService quoteService;
	
	private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
	
	/*
	 * @CrossOrigin
	 * 
	 * @GetMapping(path="retrieveQuoteAlop") public @ResponseBody
	 * RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap)
	 * throws SQLException {
	 * logger.info("GET: /api/quote-service/retrieveQuoteAlop");
	 * logger.info("RetrieveQuoteAlopRequest : " + rqap.toString()); return
	 * quoteService.retrieveQuoteAlop(rqap); }
	 */
	
	@CrossOrigin
	@GetMapping(path="retrieveQuoteListing")
	public @ResponseBody RetrieveQuoteListingResponse retrieveQuoteListing(RetrieveQuoteListingRequest rqlp) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteListing");
		logger.info("RetrieveQuoteListingRequest : " + rqlp.toString());
		return quoteService.retrieveQuoteListing(rqlp);
	}
	
	@GetMapping(path="retrieveQuoteListingOc")
	public @ResponseBody RetrieveQuoteListingOcResponse retrieveQuoteListingOc(RetrieveQuoteListingOcRequest rqlop) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteListingOc");
		logger.info("RetrieveQuoteListingOcRequest : " + rqlop.toString());
		return quoteService.retrieveQuoteListingOc(rqlop);
	}
	
	@GetMapping(path="retrieveQuoteOption")
	public @ResponseBody RetrieveQuoteOptionResponse retrieveQuoteOption(RetrieveQuoteOptionRequest rqop) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteOption");
		logger.info("RetrieveQuoteOptionRequest : " + rqop.toString());
		return quoteService.retrieveQuoteOption(rqop);
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
	
	@GetMapping(path="retrieveQuoteDetails")
	public @ResponseBody RetrieveQuoteDetailsResponse retrieveQuoteDetails(RetrieveQuoteDetailsRequest sqar) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteDetails");
		logger.info("RetrieveQuoteDetailsRequest : " + sqar.toString());
		return quoteService.retrieveQuoteDetails(sqar);
	}
	
	@PostMapping(path="saveQuoteAttachment")
	public @ResponseBody SaveQuoteAttachmentResponse saveQuoteAttachment(@RequestBody SaveQuoteAttachmentRequest sqar) throws SQLException {
		logger.info("GET: /api/quote-service/saveQuoteAttachment");
		logger.info("SaveQuoteAttachmentRequest : " + sqar.toString());
		return quoteService.saveQuoteAttachment(sqar);
	}
	
	@PostMapping(path="saveQuoteAlop")
	public @ResponseBody SaveQuoteAlopResponse saveQuoteAlop(@RequestBody SaveQuoteAlopRequest sqar) throws SQLException {
		logger.info("GET: /api/quote-service/saveQuoteAlop");
		logger.info("SaveQuoteAlopRequest : " + sqar.toString());
		return quoteService.saveQuoteAlop(sqar);
	}
		
}
