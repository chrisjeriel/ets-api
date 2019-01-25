package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrieveMtnInsuredRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnInsuredResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;

@Service
public interface MaintenanceService {

	public RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException;
	public RetrieveMtnInsuredResponse retrieveMtnInsured(RetrieveMtnInsuredRequest rmir) throws SQLException;
}
