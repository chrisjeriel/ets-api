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

import ph.cpi.rest.api.model.request.RetrieveQuoteCoverageRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteDetailsOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteDetailsRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteGeneralInfoOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteHoldCoverListingRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteHoldCoverRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteListingOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteListingRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteOptionRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteCoverageResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteDetailsOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteDetailsResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteGeneralInfoOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteHoldCoverResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteListingOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteListingResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteOptionResponse;
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
	public @ResponseBody RetrieveQuoteDetailsResponse retrieveQuoteDetails(RetrieveQuoteDetailsRequest rqdr) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteDetails");
		logger.info("RetrieveQuoteDetailsRequest : " + rqdr.toString());
		return quoteService.retrieveQuoteDetails(rqdr);
	}
	
}
