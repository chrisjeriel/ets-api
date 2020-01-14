package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ph.cpi.rest.api.model.request.RedistributeClaimDistRequest;
import ph.cpi.rest.api.model.request.RedistributeClaimReserveDistRequest;
import ph.cpi.rest.api.model.request.RetrieveChangeClaimStatusRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimApprovedAmtRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimHistoryRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimListingRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimReserveRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimSecCoverRequest;
import ph.cpi.rest.api.model.request.RetrieveClaimsAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrieveClmDistPoolRequest;
import ph.cpi.rest.api.model.request.RetrieveClmDistRequest;
import ph.cpi.rest.api.model.request.RetrieveClmGenInfoRequest;
import ph.cpi.rest.api.model.request.RetrieveClmPaytReqInqRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnClmCashCallRequest;
import ph.cpi.rest.api.model.request.RetrieveClmPaytReqRequest;
import ph.cpi.rest.api.model.request.RetrieveClmReserveDistPoolRequest;
import ph.cpi.rest.api.model.request.RetrieveClmReserveDistRequest;
import ph.cpi.rest.api.model.request.SaveClaimApprovedAmtRequest;
import ph.cpi.rest.api.model.request.SaveClaimHistoryRequest;
import ph.cpi.rest.api.model.request.SaveClaimPaytReqRequest;
import ph.cpi.rest.api.model.request.SaveClaimResStatRequest;
import ph.cpi.rest.api.model.request.SaveClaimReserveRequest;
import ph.cpi.rest.api.model.request.SaveClaimSecCoverRequest;
import ph.cpi.rest.api.model.request.SaveClaimsAttachmentRequest;
import ph.cpi.rest.api.model.request.SaveClmAdjusterRequest;
import ph.cpi.rest.api.model.request.SaveClmGenInfoRequest;
import ph.cpi.rest.api.model.request.UpdateClaimStatusRequest;
import ph.cpi.rest.api.model.request.UpdateClmDetailsRequest;
import ph.cpi.rest.api.model.response.RedistributeClaimDistResponse;
import ph.cpi.rest.api.model.response.RedistributeClaimReserveDistResponse;
import ph.cpi.rest.api.model.response.RetrieveChangeClaimStatusResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimApprovedAmtResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimHistoryResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimListingResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimReserveResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimSecCoverResponse;
import ph.cpi.rest.api.model.response.RetrieveClaimsAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrieveClmDistPoolResponse;
import ph.cpi.rest.api.model.response.RetrieveClmDistResponse;
import ph.cpi.rest.api.model.response.RetrieveClmGenInfoResponse;
import ph.cpi.rest.api.model.response.RetrieveClmPaytReqInqResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnClmCashCallResponse;
import ph.cpi.rest.api.model.response.RetrieveClmPaytReqResponse;
import ph.cpi.rest.api.model.response.RetrieveClmReserveDistPoolResponse;
import ph.cpi.rest.api.model.response.RetrieveClmReserveDistResponse;
import ph.cpi.rest.api.model.response.SaveClaimApprovedAmtResponse;
import ph.cpi.rest.api.model.response.SaveClaimHistoryResponse;
import ph.cpi.rest.api.model.response.SaveClaimPaytReqResponse;
import ph.cpi.rest.api.model.response.SaveClaimResStatResponse;
import ph.cpi.rest.api.model.response.SaveClaimReserveResponse;
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
	public String retrieveClaimListingLength(RetrieveClaimListingRequest rclr) throws SQLException;
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
	public RetrieveClmPaytReqResponse retrieveClmPaytReq(RetrieveClmPaytReqRequest rcprr) throws SQLException;
	public SaveClaimReserveResponse saveClaimReserve(SaveClaimReserveRequest scrr) throws SQLException;
	public SaveClaimPaytReqResponse saveClaimPaytReq(SaveClaimPaytReqRequest scrr) throws SQLException;
	public RetrieveClmDistResponse retrieveClmDist(RetrieveClmDistRequest rcprr) throws SQLException;
	public RetrieveClmDistPoolResponse retrieveClmDistPool(RetrieveClmDistPoolRequest rcprr) throws SQLException;
	public RedistributeClaimDistResponse redistributeClaimDist(RedistributeClaimDistRequest ucdr) throws SQLException;
	
	public RetrieveClmReserveDistResponse retrieveClmReserveDist(RetrieveClmReserveDistRequest rcprr) throws SQLException;
	public RetrieveClmReserveDistPoolResponse retrieveClmReserveDistPool(RetrieveClmReserveDistPoolRequest rcprr) throws SQLException;
	public RedistributeClaimReserveDistResponse redistributeClaimReserveDist(RedistributeClaimReserveDistRequest ucdr) throws SQLException;

	public RetrieveClmPaytReqInqResponse retrieveClmPaytReqInq(RetrieveClmPaytReqInqRequest rcprr) throws SQLException;
	public String checkExistingClaim(String policyId) throws SQLException;
}
