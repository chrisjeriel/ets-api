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

import ph.cpi.rest.api.model.request.RetrieveQuoteAlopItemRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAttachmentOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteCompetitionRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteCoverageOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteCoverageRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteDetailsOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteDetailsRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteEndorsementsOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteEndorsementsRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteGeneralInfoOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteGeneralInfoRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteHoldCoverListingRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteHoldCoverRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteListingOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteListingRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteOptionRequest;
import ph.cpi.rest.api.model.request.SaveQuoteAlopItemRequest;
import ph.cpi.rest.api.model.request.SaveQuoteAlopRequest;
import ph.cpi.rest.api.model.request.SaveQuoteAttachmentRequest;
import ph.cpi.rest.api.model.request.SaveQuoteHoldCoverRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopItemResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAttachmentOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteCompetitionResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteCoverageOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteCoverageResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteDetailsOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteDetailsResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteEndorsementsOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteEndorsementsResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteGeneralInfoOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteGeneralInfoResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteHoldCoverResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteListingOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteListingResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteOptionResponse;
import ph.cpi.rest.api.model.response.SaveQuoteAlopItemResponse;
import ph.cpi.rest.api.model.response.SaveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.SaveQuoteAttachmentResponse;
import ph.cpi.rest.api.model.response.SaveQuoteHoldCoverResponse;
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
	
	@GetMapping(path="retrieveQuoteAttachment")
	public @ResponseBody RetrieveQuoteAttachmentResponse retrieveQuoteAttachment(RetrieveQuoteAttachmentRequest rqat) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteAttachment");
		logger.info("RetrieveQuoteAttachmentRequest : " + rqat.toString());
		return quoteService.retrieveQuoteAttachment(rqat);
	}
	
	@GetMapping(path="retrieveQuoteAlopItem")
	public @ResponseBody RetrieveQuoteAlopItemResponse retrieveQuoteAlopItem(RetrieveQuoteAlopItemRequest retQuoteAlopItem) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteAlopItem");
		logger.info("RetrieveQuoteAttachmentRequest : " + retQuoteAlopItem.toString());
		return quoteService.retrieveQuoteAlopItem(retQuoteAlopItem);
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
	
	@GetMapping(path="retrieveQuoteAlop")
	public @ResponseBody RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqar) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteAlop");
		logger.info("RetrieveQuoteAlopRequest : " + rqar.toString());
		return quoteService.retrieveQuoteAlop(rqar);
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
	
	@PostMapping(path="saveQuoteAlopItem")
	public @ResponseBody SaveQuoteAlopItemResponse saveQuoteAlopItem(@RequestBody SaveQuoteAlopItemRequest sqair) throws SQLException {
		logger.info("GET: /api/quote-service/saveQuoteAlopItem");
		logger.info("SaveQuoteAlopItemRequest : " + sqair.toString());
		return quoteService.saveQuoteAlopItem(sqair);
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
	
	@PostMapping(path="saveQuoteHoldCover")
	public @ResponseBody SaveQuoteHoldCoverResponse saveQuoteHoldCover(@RequestBody SaveQuoteHoldCoverRequest sqhcr) throws SQLException {
		logger.info("GET: /api/quote-service/saveQuoteHoldCover");
		logger.info("SaveQuoteHoldCoverRequest : " + sqhcr.toString());
		return quoteService.saveQuoteHoldCover(sqhcr);
	}

}
