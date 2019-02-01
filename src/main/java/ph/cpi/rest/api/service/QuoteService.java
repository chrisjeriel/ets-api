package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteEndorsementsOcRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteEndorsementsRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteGeneralInfoRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteEndorsementsOcResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteEndorsementsResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteGeneralInfoResponse;


@Service
public interface QuoteService {
	
	public RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException;
	public RetrieveQuoteGeneralInfoResponse retrieveQuoteGeneralInfo(RetrieveQuoteGeneralInfoRequest rqgip) throws SQLException;
	public RetrieveQuoteEndorsementsResponse retrieveQuoteEndorsements(RetrieveQuoteEndorsementsRequest rqerp ) throws SQLException;
	public RetrieveQuoteEndorsementsOcResponse retrieveQuoteEndorsementsOc(RetrieveQuoteEndorsementsOcRequest rqerop ) throws SQLException;
}
