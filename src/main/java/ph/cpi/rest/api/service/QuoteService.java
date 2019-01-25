package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.response.RetrieveQuoteAttachmentResponse;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopItemRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAttachmentRequest;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopItemResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;

@Service
public interface QuoteService {
	
	public RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException;
	public RetrieveQuoteAttachmentResponse retrieveQuoteAttachment(RetrieveQuoteAttachmentRequest rqat) throws SQLException;
	public RetrieveQuoteAlopItemResponse retrieveQuoteAlopItem(RetrieveQuoteAlopItemRequest retQuoteAlopItem) throws SQLException;	
}
