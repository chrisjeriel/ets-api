package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrieveMtnIntermediaryRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnLineClassRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnLineRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnIntermediaryResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnLineClassResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnLineResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;

@Service
public interface MaintenanceService {

	public RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException;
	public RetrieveMtnIntermediaryResponse retrieveMtnIntermediary(RetrieveMtnIntermediaryRequest rmip) throws SQLException;
	public RetrieveMtnLineResponse retrieveMtnLine(RetrieveMtnLineRequest rmlp ) throws SQLException;
	public RetrieveMtnLineClassResponse retrieveMtnLineClass(RetrieveMtnLineClassRequest rmlcp ) throws SQLException;
}
