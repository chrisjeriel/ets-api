package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.*;
import ph.cpi.rest.api.model.response.*;

@Service
public interface AccountingServService {
	public RetrieveAcseOrListResponse retrieveAcseOrList(RetrieveAcseOrListRequest raolr) throws SQLException;
	public RetrieveAcseOrEntryResponse retrieveAcseOrEntry(RetrieveAcseOrEntryRequest raoer) throws SQLException;
	public RetrieveAcsePaytReqResponse retrieveAcsePaytReq(RetrieveAcsePaytReqRequest racprlp ) throws SQLException;
	public SaveAcseOrTransResponse saveOrEntry(SaveAcseOrTransRequest soetr) throws SQLException;
	public RetrieveAcseJVListResponse retrieveJVList(RetrieveAcseJVListRequest request) throws SQLException;
	public SaveAcsePaytReqResponse saveAcsePaytReq(SaveAcsePaytReqRequest saprr) throws SQLException;
	public RetrieveAcseJVEntryResponse retrieveJVEntry(RetrieveAcseJVEntryRequest request) throws SQLException;
	public SaveAcseJVEntryResponse saveJVEntry(SaveAcseJVEntryRequest request)throws SQLException;
	public ApproveJVServiceResponse approveJV(ApproveJVServiceRequest request)throws SQLException;
	public CancelJVServiceResponse cancelJV(CancelJVServiceRequest request)throws SQLException;
	public UpdateAcsePaytReqStatResponse updateAcsePaytReqStat(UpdateAcsePaytReqStatRequest uaprsr) throws SQLException;
	public RetrieveAcseTaxDetailsResponse retrieveTaxDetails(RetrieveAcseTaxDetailsRequest request) throws SQLException;
	public RetrieveAcseOrTransDtlResponse retrieveAcseOrTransDtl(RetrieveAcseOrTransDtlRequest raotdr) throws SQLException;
	public SaveAcseOrTransDtlResponse saveAcseOrTransDtl(SaveAcseOrTransDtlRequest saotdr) throws SQLException;
	public SaveAcseTaxDetailsResponse saveTaxDetails(SaveAcseTaxDetailsRequest request) throws SQLException;
	public RetrieveAcsePrqTransResponse retrieveAcsePrqTrans(RetrieveAcsePrqTransRequest raptp ) throws SQLException;
	public SaveAcsePrqTransResponse saveAcsePrqTrans(SaveAcsePrqTransRequest saptr) throws SQLException;
	public RetrieveAcseAcctEntriesResponse retrieveAcctEntries(RetrieveAcseAcctEntriesRequest request) throws SQLException;
	public RetrieveAcseCvResponse retrieveAcseCv(RetrieveAcseCvRequest raptp ) throws SQLException;
	public SaveAcseCvResponse saveAcseCv(SaveAcseCvRequest sacr) throws SQLException;
	public SaveAcseAcctEntriesResponse saveAcctEntries(SaveAcseAcctEntriesRequest request) throws SQLException;
	public RetrieveAcseAttachmentsResponse retrieveAttachments(RetrieveAcseAttachmentsRequest request) throws SQLException;
	public SaveAcseAttachmentsResponse saveAttachments(SaveAcseAttachmentsRequest request)throws SQLException;
	public UpdateAcseCvStatResponse updateAcseCvStat(UpdateAcseCvStatRequest uaprsr) throws SQLException;
	public RetrieveAcseCvPaytReqListResponse retrieveAcseCvPaytReqList(RetrieveAcseCvPaytReqListRequest racprlp ) throws SQLException;
	public SaveAcseCvPaytReqListResponse saveAcseCvPaytReqList(SaveAcseCvPaytReqListRequest sacprr) throws SQLException;
	public CancelOrResponse cancelOr(CancelOrRequest cor) throws SQLException;
	public RetrieveAcseOrServFeeResponse retrieveAcseOrServFee(RetrieveAcseOrServFeeRequest raosfr) throws SQLException;
	public SaveAcseOrServFeeResponse saveAcseOrServFee(SaveAcseOrServFeeRequest saosfr) throws SQLException;
	public RetrieveAcseBatchOrResponse retrieveAcseBatchOr(RetrieveAcseBatchOrRequest rabor) throws SQLException;
}
