package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrieveClaimHistoryRequest;
import ph.cpi.rest.api.model.request.SaveClaimHistoryRequest;
import ph.cpi.rest.api.model.response.RetrieveClaimHistoryResponse;
import ph.cpi.rest.api.model.response.SaveClaimHistoryResponse;

@Service
public interface ClaimsService {
	public RetrieveClaimHistoryResponse retrieveClaimHistory(RetrieveClaimHistoryRequest rchp ) throws SQLException;
	public SaveClaimHistoryResponse saveClaimHistory(SaveClaimHistoryRequest schr) throws SQLException;
}
