package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrieveClaimHistoryRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimListingRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimSecCoverRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimsAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrieveClmGenInfoRequest;
import ph.cpi.rest.api.model.request.SaveClaimHistoryRequest;
import ph.cpi.rest.api.model.request.SaveClaimSecCoverRequest;
import ph.cpi.rest.api.model.request.SaveClaimsAttachmentRequest;
import ph.cpi.rest.api.model.response.RetrieveClaimHistoryResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimListingResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimSecCoverResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimsAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrieveClmGenInfoResponse;
import ph.cpi.rest.api.model.response.SaveClaimHistoryResponse;
import ph.cpi.rest.api.model.response.SaveClaimSecCoverResponse;
import ph.cpi.rest.api.model.response.SaveClaimsAttachmentResponse;

@Service
public interface ClaimsService {
	public RetrieveClaimHistoryResponse retrieveClaimHistory(RetrieveClaimHistoryRequest rchp ) throws SQLException;
	public SaveClaimHistoryResponse saveClaimHistory(SaveClaimHistoryRequest schr) throws SQLException;
	public RetrieveClaimListingResponse retrieveClaimListing(RetrieveClaimListingRequest rclr) throws SQLException;
	public RetrieveClmGenInfoResponse retrieveClmGenInfo(RetrieveClmGenInfoRequest rcgir) throws SQLException;
	public RetrieveClaimSecCoverResponse retrieveClaimSecCover(RetrieveClaimSecCoverRequest rcsr)throws SQLException;
	public SaveClaimSecCoverResponse saveClaimSecCover(SaveClaimSecCoverRequest scsr)throws SQLException;
	public RetrieveClaimsAttachmentResponse retrieveClaimsAttachment(RetrieveClaimsAttachmentRequest rcar) throws SQLException;
	public SaveClaimsAttachmentResponse saveClaimAttachment(SaveClaimsAttachmentRequest scar) throws SQLException;
}
