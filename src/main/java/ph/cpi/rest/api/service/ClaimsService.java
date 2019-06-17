package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrieveClaimHistoryRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimListingRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimSecCoverRequest;
import ph.cpi.rest.api.model.request.SaveClaimHistoryRequest;
import ph.cpi.rest.api.model.request.SaveClaimSecCoverRequest;
import ph.cpi.rest.api.model.response.RetrieveClaimHistoryResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimListingResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimSecCoverResponse;
import ph.cpi.rest.api.model.response.SaveClaimHistoryResponse;
import ph.cpi.rest.api.model.response.SaveClaimSecCoverResponse;

@Service
public interface ClaimsService {
	public RetrieveClaimHistoryResponse retrieveClaimHistory(RetrieveClaimHistoryRequest rchp ) throws SQLException;
	public SaveClaimHistoryResponse saveClaimHistory(SaveClaimHistoryRequest schr) throws SQLException;
	public RetrieveClaimListingResponse retrieveClaimListing(RetrieveClaimListingRequest rclr) throws SQLException;
	public RetrieveClaimSecCoverResponse retrieveClaimSecCover(RetrieveClaimSecCoverRequest rcsr)throws SQLException;
	public SaveClaimSecCoverResponse saveClaimSecCover(SaveClaimSecCoverRequest scsr)throws SQLException;
}
