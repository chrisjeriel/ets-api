package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.AccountingInTrustDao;
import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.request.RetrieveAcitCvPaytReqListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVListingRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitPaytReqRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVEntryRequest;
import ph.cpi.rest.api.model.request.SaveAcitPaytReqRequest;
import ph.cpi.rest.api.model.response.RetrieveAcitCvPaytReqListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVListingResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPaytReqResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVEntryResponse;
import ph.cpi.rest.api.model.response.SaveAcitPaytReqResponse;
import ph.cpi.rest.api.service.AccountingInTrustService;

@Component
public class AccountingInTrustServiceImpl implements AccountingInTrustService {
	
	@Autowired
	AccountingInTrustDao acctITDao;
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteServiceImpl.class);

	@Override
	public RetrieveAcitCvPaytReqListResponse retrieveAcitCvPaytReqList(RetrieveAcitCvPaytReqListRequest racprlp)
			throws SQLException {
		RetrieveAcitCvPaytReqListResponse racprlResponse =  new RetrieveAcitCvPaytReqListResponse();
		HashMap<String, Object> racprlParams = new HashMap<String, Object>();
		racprlParams.put("tranId", racprlp.getTranId());
		racprlParams.put("itemNo", racprlp.getItemNo());
		racprlResponse.setAcitCvPaytReqList(acctITDao.retrieveAcitCvPaytReqList(racprlParams));
		logger.info("RetrieveAcitCvPaytReqListResponse : " + racprlResponse.toString());
		return racprlResponse;
	}


	@Override
	public RetrieveAcitPaytReqResponse retrieveAcitPaytReq(RetrieveAcitPaytReqRequest racprlp) throws SQLException {
		RetrieveAcitPaytReqResponse rapResponse = new RetrieveAcitPaytReqResponse();
		HashMap<String, Object> rapParams = new HashMap<String, Object>();
		rapParams.put("reqId", racprlp.getReqId());
		rapParams.put("paytReqNo", racprlp.getPaytReqNo());
		rapParams.put("tranTypeDesc", racprlp.getTranTypeDesc());
		rapParams.put("reqDateFrom", racprlp.getReqDateFrom());
		rapParams.put("reqDateTo", racprlp.getReqDateTo());
		rapParams.put("reqStatusDesc", racprlp.getReqStatusDesc());
		rapParams.put("payee", racprlp.getPayee());
		rapParams.put("currCd", racprlp.getCurrCd());
		rapParams.put("reqAmt", racprlp.getReqAmt());
		rapParams.put("particulars", racprlp.getParticulars());
		rapParams.put("requestedBy", racprlp.getRequestedBy());
		rapResponse.setAcitPaytReq(acctITDao.retrieveAcitPaytReq(rapParams));
		logger.info("RetrieveAcitPaytReqResponse : " + rapResponse.toString());
		return rapResponse;
	}


	@Override
	public SaveAcitPaytReqResponse saveAcitPaytReq(SaveAcitPaytReqRequest saprr) throws SQLException {
		SaveAcitPaytReqResponse saprResponse = new SaveAcitPaytReqResponse();
		HashMap<String, Object> saprParams = new HashMap<String, Object>();
		try {
			saprParams.put("paytReqNo","");
			saprParams.put("reqId", saprr.getReqId());
			saprParams.put("reqPrefix", saprr.getReqPrefix());
			saprParams.put("reqYear", saprr.getReqYear());
			saprParams.put("reqMm", saprr.getReqMm());
			saprParams.put("reqSeqNo", saprr.getReqSeqNo());
			saprParams.put("tranTypeCd", saprr.getTranTypeCd());
			saprParams.put("reqDate", saprr.getReqDate());
			saprParams.put("reqStatus", saprr.getReqStatus());
			saprParams.put("payeeNo", saprr.getPayeeNo());
			saprParams.put("payee", saprr.getPayee());
			saprParams.put("currCd", saprr.getCurrCd());
			saprParams.put("currRate", saprr.getCurrRate());
			saprParams.put("reqAmt", saprr.getReqAmt());
			saprParams.put("localAmt", saprr.getLocalAmt());
			saprParams.put("particulars", saprr.getParticulars());
			saprParams.put("preparedBy", saprr.getPreparedBy());
			saprParams.put("preparedDate", saprr.getPreparedDate());
			saprParams.put("requestedBy", saprr.getRequestedBy());
			saprParams.put("approvedBy", saprr.getApprovedBy());
			saprParams.put("approvedDate", saprr.getApprovedDate());
			saprParams.put("createUser", saprr.getCreateUser());
			saprParams.put("createDate", saprr.getCreateDate());
			saprParams.put("updateUser", saprr.getUpdateUser());
			saprParams.put("updateDate", saprr.getUpdateDate());
			
			HashMap<String, Object> response = acctITDao.saveAcitPaytReq(saprParams);
			
			saprResponse.setReturnCode((Integer) response.get("errorCode"));
			saprResponse.setPaytReqNo((String) response.get("paytReqNo"));
		} catch (SQLException sqlex) {
			saprResponse.setReturnCode(0);
			saprResponse.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		} catch (Exception ex) {
			saprResponse.setReturnCode(0);
			saprResponse.getErrorList().add(new Error("General Exception","Unable to proceed to saving. Check fields."));
			ex.printStackTrace();
		}
		return saprResponse;
	}


	@Override
	public RetrieveAcitJVListingResponse retrieveAcitJvListing(RetrieveAcitJVListingRequest rajl) throws SQLException {
		RetrieveAcitJVListingResponse response = new RetrieveAcitJVListingResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", rajl.getTranId());
		response.setTransactions(acctITDao.retrieveAcitJVListings(params));
		return response;
	}


	@Override
	public RetrieveAcitJVEntryResponse retrieveAcitJvEntry(RetrieveAcitJVEntryRequest raje) throws SQLException {
		RetrieveAcitJVEntryResponse response = new RetrieveAcitJVEntryResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", raje.getTranId());
		response.setTransactions(acctITDao.retrieveAcitJVEntry(params));
		return response;
	}


	@Override
	public SaveAcitJVEntryResponse saveAcitJVEntry(SaveAcitJVEntryRequest raje) throws SQLException {
		SaveAcitJVEntryResponse response = new SaveAcitJVEntryResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("tranId", raje.getTranId());
			params.put("tranDate", raje.getTranDate());
			params.put("tranClass", raje.getTranClass());
			params.put("tranTypeCd", raje.getTranTypeCd());
			params.put("tranYear", raje.getTranYear());
			params.put("tranClassNo", raje.getTranClassNo());
			params.put("tranStat", raje.getTranStat());
			params.put("closeDate", raje.getCloseDate());
			params.put("deleteDate", raje.getDeleteDate());
			params.put("postDate", raje.getPostDate());
			params.put("createUser", raje.getCreateUser());
			params.put("createDate", raje.getCreateDate());
			params.put("updateUser", raje.getUpdateUser());
			params.put("updateDate", raje.getUpdateDate());
			params.put("tranIdJv", raje.getTranIdJv());
			params.put("jvYear", raje.getJvYear());
			params.put("jvNo", raje.getJvNo());
			params.put("jvDate", raje.getJvDate());
			params.put("jvStatus", raje.getJvStatus());
			params.put("jvTranTypeCd", raje.getJvTranTypeCd());
			params.put("tranTypeName", raje.getTranTypeName());
			params.put("autoTag", raje.getAutoTag());
			params.put("refnoTranId", raje.getRefnoTranId());
			params.put("refnoDate", raje.getRefnoDate());
			params.put("particulars", raje.getParticulars());
			params.put("currCd", raje.getCurrCd());
			params.put("currRate", raje.getCurrRate());
			params.put("jvAmt", raje.getJvAmt());
			params.put("localAmt", raje.getLocalAmt());
			params.put("allocTag", raje.getAllocTag());
			params.put("allocTranId", raje.getAllocTranId());
			params.put("preparedBy", raje.getPreparedBy());
			params.put("preparedDate", raje.getPreparedDate());
			params.put("approvedBy", raje.getApprovedBy());
			params.put("approvedDate", raje.getApprovedDate());
			params.put("createUserJv", raje.getCreateUserJv());
			params.put("createDateJv", raje.getCreateDateJv());
			params.put("updateUserJv", raje.getUpdateUser());
			params.put("updateDateJv", raje.getUpdateDateJv());
			HashMap<String, Object> res = acctITDao.saveAcitJVEntry(params);
			response.setReturnCode((Integer) res.get("errorCode"));
			response.setTranIdOut((Integer) res.get("tranIdOut"));
		} catch (SQLException sqlex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		}
		return response;
	}
}
