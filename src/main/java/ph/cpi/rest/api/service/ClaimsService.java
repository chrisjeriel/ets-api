package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrieveChangeClaimStatusRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimApprovedAmtRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimHistoryRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimListingRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimReserveRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimSecCoverRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimsAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrieveClmGenInfoRequest;
import ph.cpi.rest.api.model.request.SaveClaimApprovedAmtRequest;
import ph.cpi.rest.api.model.request.SaveClaimHistoryRequest;
import ph.cpi.rest.api.model.request.SaveClaimResStatRequest;
import ph.cpi.rest.api.model.request.SaveClaimSecCoverRequest;
import ph.cpi.rest.api.model.request.SaveClaimsAttachmentRequest;
import ph.cpi.rest.api.model.request.SaveClmAdjusterRequest;
import ph.cpi.rest.api.model.request.SaveClmGenInfoRequest;
import ph.cpi.rest.api.model.request.UpdateClaimStatusRequest;
import ph.cpi.rest.api.model.request.UpdateClmDetailsRequest;
import ph.cpi.rest.api.model.response.RetrieveChangeClaimStatusResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimApprovedAmtResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimHistoryResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimListingResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimReserveResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimSecCoverResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimsAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrieveClmGenInfoResponse;
import ph.cpi.rest.api.model.response.SaveClaimApprovedAmtResponse;
import ph.cpi.rest.api.model.response.SaveClaimHistoryResponse;
import ph.cpi.rest.api.model.response.SaveClaimResStatResponse;
import ph.cpi.rest.api.model.response.SaveClaimSecCoverResponse;
import ph.cpi.rest.api.model.response.SaveClaimsAttachmentResponse;
import ph.cpi.rest.api.model.response.SaveClmAdjusterResponse;
import ph.cpi.rest.api.model.response.SaveClmGenInfoResponse;
import ph.cpi.rest.api.model.response.UpdateClaimStatusResponse;
import ph.cpi.rest.api.model.response.UpdateClmDetailsResponse;

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
	public RetrieveChangeClaimStatusResponse retrieveChangeClmStatus(RetrieveChangeClaimStatusRequest rccsr) throws SQLException;
	public RetrieveClaimApprovedAmtResponse retrieveClaimApprovedAmt(RetrieveClaimApprovedAmtRequest rcaap ) throws SQLException;
	public SaveClaimApprovedAmtResponse saveClaimApprovedAmt(SaveClaimApprovedAmtRequest scaar) throws SQLException;
	public RetrieveClaimReserveResponse retrieveClaimReserve(RetrieveClaimReserveRequest rchp ) throws SQLException;
	public UpdateClaimStatusResponse updateClaimStatus(UpdateClaimStatusRequest ucsr) throws SQLException;
	public SaveClmAdjusterResponse saveClmAdjuster(SaveClmAdjusterRequest scar) throws SQLException;
	public SaveClmGenInfoResponse saveClmGenInfo(SaveClmGenInfoRequest scgir) throws SQLException;
	public SaveClaimResStatResponse saveClaimResStat(SaveClaimResStatRequest scrsr) throws SQLException;
	public UpdateClmDetailsResponse updateClmDetails(UpdateClmDetailsRequest ucdr) throws SQLException;

}
