package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteGeneralInfoOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteHoldCoverListingRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteHoldCoverRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteGeneralInfoOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteHoldCoverListingResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteHoldCoverResponse;

@Service
public interface QuoteService {
	
	public RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException;
	public RetrieveQuoteHoldCoverResponse retrieveQuoteHoldCover(RetrieveQuoteHoldCoverRequest rqhcp) throws SQLException;
	public RetrieveQuoteGeneralInfoOcResponse retrieveQuoteGeneralInfoOc(RetrieveQuoteGeneralInfoOcRequest rqgiocp) throws SQLException;
	public RetrieveQuoteHoldCoverResponse retrieveQuoteHoldCoverListing(RetrieveQuoteHoldCoverListingRequest rqhclp) throws SQLException;
	
}
