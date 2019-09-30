package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrieveAcseOrEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseOrListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcsePaytReqRequest;
import ph.cpi.rest.api.model.request.RetrieveAcsePrqTransRequest;
import ph.cpi.rest.api.model.response.RetrieveAcseOrEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseOrListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcsePaytReqResponse;
import ph.cpi.rest.api.model.response.RetrieveAcsePrqTransResponse;
import ph.cpi.rest.api.model.request.SaveAcseOrTransRequest;
import ph.cpi.rest.api.model.request.SaveAcsePaytReqRequest;
import ph.cpi.rest.api.model.request.UpdateAcitPaytReqStatRequest;
import ph.cpi.rest.api.model.request.UpdateAcsePaytReqStatRequest;
import ph.cpi.rest.api.model.response.RetrieveAcseOrEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseOrListResponse;
import ph.cpi.rest.api.model.response.SaveAcseOrTransResponse;
import ph.cpi.rest.api.model.response.SaveAcsePaytReqResponse;
import ph.cpi.rest.api.model.response.UpdateAcitPaytReqStatResponse;
import ph.cpi.rest.api.model.response.UpdateAcsePaytReqStatResponse;

@Service
public interface AccountingServService {
	public RetrieveAcseOrListResponse retrieveAcseOrList(RetrieveAcseOrListRequest raolr) throws SQLException;
	public RetrieveAcseOrEntryResponse retrieveAcseOrEntry(RetrieveAcseOrEntryRequest raoer) throws SQLException;
	public RetrieveAcsePaytReqResponse retrieveAcsePaytReq(RetrieveAcsePaytReqRequest racprlp ) throws SQLException;
	public SaveAcseOrTransResponse saveOrEntry(SaveAcseOrTransRequest soetr) throws SQLException;
	public SaveAcsePaytReqResponse saveAcsePaytReq(SaveAcsePaytReqRequest saprr) throws SQLException;
	public UpdateAcsePaytReqStatResponse updateAcsePaytReqStat(UpdateAcsePaytReqStatRequest uaprsr) throws SQLException;
	public RetrieveAcsePrqTransResponse retrieveAcsePrqTrans(RetrieveAcsePrqTransRequest raptp ) throws SQLException;
}
