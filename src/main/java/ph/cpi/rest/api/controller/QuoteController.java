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

import ph.cpi.rest.api.model.request.CopyEndorsementRequest;
import ph.cpi.rest.api.model.request.RenumberQuoteOptionsRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopItemRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteApproverRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAttachmentOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteCompetitionRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteCoverageOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteCoverageRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteDeductiblesRequest;
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
import ph.cpi.rest.api.model.request.SaveQuotationCopyRequest;
import ph.cpi.rest.api.model.request.SaveQuoteAdviceWordingsRequest;
import ph.cpi.rest.api.model.request.SaveQuoteAlopItemRequest;
import ph.cpi.rest.api.model.request.SaveQuoteAlopRequest;
import ph.cpi.rest.api.model.request.SaveQuoteAttachmentOcRequest;
import ph.cpi.rest.api.model.request.SaveQuoteAttachmentRequest;
import ph.cpi.rest.api.model.request.SaveQuoteChangeQuoteStatusRequest;
import ph.cpi.rest.api.model.request.SaveQuoteCompetitionRequest;
import ph.cpi.rest.api.model.request.SaveQuoteCoverageOcRequest;
import ph.cpi.rest.api.model.request.SaveQuoteCoverageRequest;
import ph.cpi.rest.api.model.request.SaveQuoteDeductiblesRequest;
import ph.cpi.rest.api.model.request.SaveQuoteEndorsementsOcRequest;
import ph.cpi.rest.api.model.request.SaveQuoteEndorsementsRequest;
import ph.cpi.rest.api.model.request.SaveQuoteGeneralInfoOcRequest;
import ph.cpi.rest.api.model.request.SaveQuoteGeneralInfoRequest;
import ph.cpi.rest.api.model.request.SaveQuoteHoldCoverRequest;
import ph.cpi.rest.api.model.request.SaveQuoteOptionAllRequest;
import ph.cpi.rest.api.model.request.SaveQuoteOptionRequest;
import ph.cpi.rest.api.model.request.SaveQuoteOtherRatesRequest;
import ph.cpi.rest.api.model.request.SearchQuoteInfoRequest;
import ph.cpi.rest.api.model.request.UpdateHoldCoverStatusRequest;
import ph.cpi.rest.api.model.request.UpdateQuoteStatusRequest;
import ph.cpi.rest.api.model.response.CopyEndorsementResponse;
import ph.cpi.rest.api.model.response.RenumberQuoteOptionsResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopItemResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteApproverResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAttachmentOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteCompetitionResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteCoverageOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteCoverageResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteDeductiblesResponse;
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
import ph.cpi.rest.api.model.response.SaveQuotationCopyResponse;
import ph.cpi.rest.api.model.response.SaveQuoteAdviceWordingsResponse;
import ph.cpi.rest.api.model.response.SaveQuoteAlopItemResponse;
import ph.cpi.rest.api.model.response.SaveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.SaveQuoteAttachmentOcResponse;
import ph.cpi.rest.api.model.response.SaveQuoteAttachmentResponse;
import ph.cpi.rest.api.model.response.SaveQuoteChangeQuoteStatusResponse;
import ph.cpi.rest.api.model.response.SaveQuoteCompetitionResponse;
import ph.cpi.rest.api.model.response.SaveQuoteCoverageOcResponse;
import ph.cpi.rest.api.model.response.SaveQuoteCoverageResponse;
import ph.cpi.rest.api.model.response.SaveQuoteDeductiblesResponse;
import ph.cpi.rest.api.model.response.SaveQuoteEndorsementsOcResponse;
import ph.cpi.rest.api.model.response.SaveQuoteEndorsementsResponse;
import ph.cpi.rest.api.model.response.SaveQuoteGeneralInfoOcResponse;
import ph.cpi.rest.api.model.response.SaveQuoteGeneralInfoResponse;
import ph.cpi.rest.api.model.response.SaveQuoteHoldCoverResponse;
import ph.cpi.rest.api.model.response.SaveQuoteOptionAllResponse;
import ph.cpi.rest.api.model.response.SaveQuoteOptionResponse;
import ph.cpi.rest.api.model.response.SaveQuoteOtherRatesResponse;
import ph.cpi.rest.api.model.response.SearchQuoteInfoResponse;
import ph.cpi.rest.api.model.response.UpdateHoldCoverStatusResponse;
import ph.cpi.rest.api.model.response.UpdateQuoteStatusResponse;
import ph.cpi.rest.api.service.QuoteService;

@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080", "http://192.10.10.230:4200", "http://192.10.10.230:8888", "http://192.10.10.149:4200", "http://192.10.10.149:8888", "http://192.168.99.200:4200", "http://192.168.99.200:8888"})
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
	
	
	/*@GetMapping(path="retrieveQuoteDetailsOc")
	public @ResponseBody RetrieveQuoteDetailsOcResponse retrieveQuoteDetailsOc(RetrieveQuoteDetailsOcRequest rqdocr) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteDetailsOc");
		logger.info("RetrieveQuoteDetailsOcRequest : " + rqdocr.toString());
		return quoteService.retrieveQuoteDetailsOc(rqdocr);
	}*/
	
	
	/*@GetMapping(path="retrieveQuoteDetails")
	public @ResponseBody RetrieveQuoteDetailsResponse retrieveQuoteDetails(RetrieveQuoteDetailsRequest sqar) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteDetails");
		logger.info("RetrieveQuoteDetailsRequest : " + sqar.toString());
		return quoteService.retrieveQuoteDetails(sqar);
	}*/
	
	
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
	
	
	@PostMapping(path="saveQuoteAttachmentOc")
	public @ResponseBody SaveQuoteAttachmentOcResponse saveQuoteAttachmentOc(@RequestBody SaveQuoteAttachmentOcRequest sqaor) throws SQLException {
		logger.info("POST: /api/quote-service/saveQuoteAttachmentOc");
		logger.info("SaveQuoteAttachmentOcRequest : " + sqaor.toString());
		return quoteService.saveQuoteAttachmentOc(sqaor);
	}

	
	@PostMapping(path="saveQuoteCoverage")
	public @ResponseBody SaveQuoteCoverageResponse saveQuoteCoverage(@RequestBody SaveQuoteCoverageRequest sqcr) throws SQLException {
		logger.info("GET: /api/quote-service/saveQuoteCoverage");
		logger.info("SaveQuoteCoverageRequest : " + sqcr.toString());
		return quoteService.saveQuoteCoverage(sqcr);
	}
	
	
	@PostMapping(path="saveQuoteCoverageOc")
	public @ResponseBody SaveQuoteCoverageOcResponse saveQuoteCoverageOc(@RequestBody SaveQuoteCoverageOcRequest sqcocr) throws SQLException {
		logger.info("GET: /api/quote-service/saveQuoteCoverageOc");
		logger.info("SaveQuoteCoverageOcRequest : " + sqcocr.toString());
		return quoteService.saveQuoteCoverageOc(sqcocr);
	}
		
	
	@GetMapping(path="retrieveQuoteGeneralInfo")
	public @ResponseBody RetrieveQuoteGeneralInfoResponse retrieveQuoteGeneralInfo(RetrieveQuoteGeneralInfoRequest rqgip) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteGeneralInfo");
		logger.info("RetrieveQuoteGeneralInfo : " + rqgip.toString());
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
	
	
	@PostMapping(path="saveQuoteCompetition")
	public @ResponseBody SaveQuoteCompetitionResponse saveQuoteCompetition(@RequestBody SaveQuoteCompetitionRequest sqcr) throws SQLException {
		logger.info("POST: /api/quote-service/saveQuoteCompetition");
		logger.info("SaveQuoteCompetitionRequest : " + sqcr.toString());
		return quoteService.saveQuoteCompetition(sqcr);
	}
	
	
	@PostMapping(path="saveQuoteHoldCover")
	public @ResponseBody SaveQuoteHoldCoverResponse saveQuoteHoldCover(@RequestBody SaveQuoteHoldCoverRequest sqhcr) throws SQLException {
		logger.info("POST: /api/quote-service/saveQuoteHoldCover");
		logger.info("SaveQuoteHoldCoverRequest : " + sqhcr.toString());
		return quoteService.saveQuoteHoldCover(sqhcr);
	}
	
	
	@PostMapping(path="saveQuoteEndorsements")
	public @ResponseBody SaveQuoteEndorsementsResponse saveQuoteEndorsements(@RequestBody SaveQuoteEndorsementsRequest sqer) throws SQLException {
		logger.info("POST: /api/quote-service/saveQuoteEndorsements");
		logger.info("SaveQuoteEndorsementsRequest : " + sqer.toString());
		return quoteService.saveQuoteEndorsements(sqer);
	}

	
	@PostMapping(path="saveQuoteGeneralInfo")
	public @ResponseBody SaveQuoteGeneralInfoResponse saveQuoteGeneralInfo(@RequestBody SaveQuoteGeneralInfoRequest sqgip) throws SQLException {
		logger.info("POST: /api/quote-service/saveQuoteGeneralInfo");
		logger.info("SaveQuoteGeneralInfoRequest : " + sqgip.toString());
		return quoteService.saveQuoteGeneralInfo(sqgip);
	}
	
	
	@PostMapping(path="saveQuoteOption")
	public @ResponseBody SaveQuoteOptionResponse saveQuoteOption(@RequestBody SaveQuoteOptionRequest sqdr) throws SQLException {
		logger.info("POST: /api/quote-service/saveQuoteOption");
		logger.info("SaveQuoteOptionRequest : " + sqdr.toString());
		return quoteService.saveQuoteOption(sqdr);
	}
	
	
	@PostMapping(path="saveQuoteOptionAll")
	public @ResponseBody SaveQuoteOptionAllResponse saveQuoteOptionAll(@RequestBody SaveQuoteOptionAllRequest sqdr) throws SQLException {
		logger.info("POST: /api/quote-service/saveQuoteOptionAll");
		logger.info("SaveQuoteOptionAllRequest : " + sqdr.toString());
		return quoteService.saveQuoteOptionAll(sqdr);
	}

	
	@PostMapping(path="saveQuoteEndorsementsOc")
	public @ResponseBody SaveQuoteEndorsementsOcResponse saveQuoteEndorsementsOc(@RequestBody SaveQuoteEndorsementsOcRequest sqeocr) throws SQLException {
		logger.info("POST: /api/quote-service/saveQuoteEndorsementsOc");
		logger.info("SaveQuoteEndorsementsOcRequest : " + sqeocr.toString());
		return quoteService.saveQuoteEndorsementsOc(sqeocr);
	}
	
	
	@PostMapping(path="saveQuoteOtherRates")
	public @ResponseBody SaveQuoteOtherRatesResponse saveQuoteOtherRates(@RequestBody SaveQuoteOtherRatesRequest sqorr) throws SQLException {
		logger.info("POST: /api/quote-service/saveQuoteOtherRates");
		logger.info("SaveQuoteOtherRatesRequest : " + sqorr.toString());
		return quoteService.saveQuoteOtherRates(sqorr);
	}
	
	
	@PostMapping(path="saveQuoteDeductibles")
	public @ResponseBody SaveQuoteDeductiblesResponse saveQuoteDeductibles(@RequestBody SaveQuoteDeductiblesRequest sqdr) throws SQLException {
		logger.info("POST: /api/quote-service/saveQuoteDeductibles");
		logger.info("SaveQuoteDeductiblesRequest : " + sqdr.toString());
		return quoteService.saveQuoteDeductibles(sqdr);
	}
	
	
	@PostMapping(path="saveQuoteGeneralInfoOc")
	public @ResponseBody SaveQuoteGeneralInfoOcResponse saveQuoteGeneralInfoOc(@RequestBody SaveQuoteGeneralInfoOcRequest sqgiop) throws SQLException {
		logger.info("POST: /api/quote-service/saveQuoteGeneralInfoOc");
		logger.info("SaveQuoteGeneralInfoOcRequest : " + sqgiop.toString());
		return quoteService.saveQuoteGeneralInfoOc(sqgiop);
	}
		
	
	@GetMapping(path="retrieveQuoteDeductibles")
	public @ResponseBody RetrieveQuoteDeductiblesResponse retrieveQuoteDeductibles(RetrieveQuoteDeductiblesRequest rqds) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteDeductibles");
		logger.info("RetrieveQuoteDeductiblesRequest : " + rqds.toString());
		return quoteService.retrieveQuoteDeductibles(rqds);
	}
	
	@PostMapping(path="saveQuoteChangeQuoteStatus")
	public @ResponseBody SaveQuoteChangeQuoteStatusResponse saveQuoteChangeQuoteStatus(@RequestBody SaveQuoteChangeQuoteStatusRequest sqcqs) throws SQLException {
		logger.info("GET: /api/quote-service/saveQuoteChangeQuoteStatus");
		logger.info("SaveQuoteChangeQuoteStatusRequest : " + sqcqs.toString());
		return quoteService.saveQuoteChangeQuoteStatus(sqcqs);
	}
	
	
	@PostMapping(path="copyEndorsement")
	public @ResponseBody CopyEndorsementResponse copyEndorsement(@RequestBody CopyEndorsementRequest cer) throws SQLException {
		logger.info("POST: /api/quote-service/copyEndorsement");
		logger.info("CopyEndorsement : " + cer.toString());
		return quoteService.copyEndorsement(cer);
	}
		
	
	@PostMapping(path="saveQuotationCopy")
	public @ResponseBody SaveQuotationCopyResponse saveQuotationCopy(@RequestBody SaveQuotationCopyRequest sqcp) throws SQLException {
		logger.info("GET: /api/quote-service/saveQuotationCopy");
		logger.info("SaveQuotationCopyRequest : " + sqcp.toString());
		return quoteService.saveQuotationCopy(sqcp);
	}
	
	@GetMapping(path="searchQuoteInfo")
	public @ResponseBody SearchQuoteInfoResponse searchQuoteInfo(SearchQuoteInfoRequest sqip) throws SQLException {
		logger.info("GET: /api/quote-service/searchQuoteInfo");
		logger.info("SearchQuoteInfoRequest : " + sqip.toString());
		return quoteService.searchQuoteInfo(sqip);
	}
	
	@PostMapping(path="updateHoldCoverStatus")
	public @ResponseBody UpdateHoldCoverStatusResponse updateHoldCoverStatus(@RequestBody UpdateHoldCoverStatusRequest uhcsp) throws SQLException {
		logger.info("GET: /api/quote-service/updateHoldCoverStatus");
		logger.info("UpdateHoldCoverStatusRequest : " + uhcsp.toString());
		return quoteService.updateHoldCoverStatus(uhcsp);
	}
	
	@PostMapping(path="saveQuoteAdviceWordings")
	public @ResponseBody SaveQuoteAdviceWordingsResponse saveQuoteAdviceWordings(@RequestBody SaveQuoteAdviceWordingsRequest sqawr) throws SQLException {
		logger.info("GET: /api/quote-service/saveQuoteAdviceWordings");
		logger.info("SaveQuoteAdviceWordingsRequest : " + sqawr.toString());
		return quoteService.saveQuoteAdviceWordings(sqawr);
	}
		
	@PostMapping(path="renumberQuoteOptions")
	public @ResponseBody RenumberQuoteOptionsResponse renumberQuoteOptions(@RequestBody RenumberQuoteOptionsRequest rqds) throws SQLException {
		logger.info("GET: /api/quote-service/renumberQuoteOptions");
		logger.info("RenumberQuoteOptionsRequest : " + rqds.toString());
		return quoteService.renumberQuoteOptions(rqds);
	}
	
	@GetMapping(path="retrieveQuoteApprover")
	public @ResponseBody RetrieveQuoteApproverResponse retrieveQuoteApprover(RetrieveQuoteApproverRequest rqar) throws SQLException {
		logger.info("GET: /api/quote-service/retrieveQuoteApprover");
		logger.info("RetrieveQuoteEndorsementsRequest : " + rqar.toString());
		return quoteService.retrieveQuoteApprover(rqar);
	}
	
	@PostMapping(path="updateQuoteStatus")
	public @ResponseBody UpdateQuoteStatusResponse updateQuoteStatus(@RequestBody UpdateQuoteStatusRequest uqsr) throws SQLException {
		logger.info("GET: /api/quote-service/updateQuoteStatus");
		logger.info("UpdateQuoteStatusRequest : " + uqsr.toString());
		return quoteService.updateQuoteStatus(uqsr);
	}
}
