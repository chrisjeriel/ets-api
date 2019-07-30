package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.AccountingInTrustDao;
import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.request.RetrieveAcitCMDMListRequest;
import ph.cpi.rest.api.model.request.CancelCMDMCMDMRequest;
import ph.cpi.rest.api.model.request.CancelJournalVoucherRequest;
import ph.cpi.rest.api.model.request.PrintCMDMRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitAcctEntriesRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitCvPaytReqListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVInPolBalRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVIntOverdAcctMSRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVListingRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVPremResRelRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitPaytReqRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitSOAAgingDetailsRequest;
import ph.cpi.rest.api.model.request.RetrieveQSOAListRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVEntryRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVIntOverdAcctMSRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVPremResRelRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitRefNoLOVRequest;
import ph.cpi.rest.api.model.request.SaveAcitAcctEntriesRequest;
import ph.cpi.rest.api.model.request.SaveAcitCMDMRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVAdjInwPolBalRequest;
import ph.cpi.rest.api.model.request.SaveAcitPaytReqRequest;
import ph.cpi.rest.api.model.request.SaveAcitPrqTransRequest;
import ph.cpi.rest.api.model.response.RetrieveAcitCMDMListResponse;
import ph.cpi.rest.api.model.response.CancelCMDMCMDMResponse;
import ph.cpi.rest.api.model.response.CancelJournalVoucherResponse;
import ph.cpi.rest.api.model.response.PrintCMDMResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitAcctEntriesResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArListResponse;
import ph.cpi.rest.api.model.request.RetrieveAcitPrqTransRequest;
import ph.cpi.rest.api.model.request.SaveAcitPaytReqRequest;
import ph.cpi.rest.api.model.request.UpdateAcitPaytReqStatRequest;
import ph.cpi.rest.api.model.response.RetrieveAcitCvPaytReqListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVIntOverdAcctMSResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVInwPolBalResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVListingResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVPremResRelResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPaytReqResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitSOAAgingResponse;
import ph.cpi.rest.api.model.response.RetrieveQSOAListResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVEntryResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVIntOverdAcctMSResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVPremResRelResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitRefNoLOVResponse;
import ph.cpi.rest.api.model.response.SaveAcitAcctEntriesResponse;
import ph.cpi.rest.api.model.response.SaveAcitCMDMResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVAdjInwPolBalResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPrqTransResponse;
import ph.cpi.rest.api.model.response.SaveAcitPaytReqResponse;
import ph.cpi.rest.api.model.response.SaveAcitPrqTransResponse;
import ph.cpi.rest.api.model.response.UpdateAcitPaytReqStatResponse;
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
	public RetrieveAcitCMDMListResponse retrieveAcitCMDMList(RetrieveAcitCMDMListRequest racitcmdmlr)
			throws SQLException {
		RetrieveAcitCMDMListResponse response = new RetrieveAcitCMDMListResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", racitcmdmlr.getTranId());
		params.put("memoType", racitcmdmlr.getMemoType());
		params.put("memoTranType", racitcmdmlr.getMemoTranType());
		params.put("memoDate", racitcmdmlr.getMemoDate());
		params.put("memoStatus", racitcmdmlr.getMemoStatus());
		params.put("refNoDate", racitcmdmlr.getRefNoDate());
		params.put("payee", racitcmdmlr.getPayee());
		params.put("particulars", racitcmdmlr.getParticulars());
		params.put("currCd", racitcmdmlr.getCurrCd());
		params.put("cmdmAmt", racitcmdmlr.getCmdmAmt());
		params.put("localAmt", racitcmdmlr.getLocalAmt());
		
		response.setCmdmList(acctITDao.retrieveAcitCMDMList(params));
		return response;
	}

	@Override
	public SaveAcitCMDMResponse saveAcitCMDM(SaveAcitCMDMRequest saprr) throws SQLException {
		SaveAcitCMDMResponse response = new SaveAcitCMDMResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId",saprr.getTranId());
		params.put("memoType",saprr.getMemoType());
		params.put("memoTranType",saprr.getMemoTranType());
		params.put("memoYear",saprr.getMemoYear());
		params.put("memoMm",saprr.getMemoMm());
		params.put("memoSeqNo",saprr.getMemoSeqNo());
		params.put("tranTypeCd",saprr.getTranTypeCd());
		params.put("autoTag",saprr.getAutoTag());
		params.put("memoDate",saprr.getMemoDate());
		params.put("memoStatus",saprr.getMemoStatus());
		params.put("refNoTranId",saprr.getRefNoTranId());
		params.put("refNoDate",saprr.getRefNoDate());
		params.put("payeeNo",saprr.getPayeeNo());
		params.put("payee",saprr.getPayee());
		params.put("particulars",saprr.getParticulars());
		params.put("currCd",saprr.getCurrCd());
		params.put("currRate",saprr.getCurrRate());
		params.put("cmdmAmt",saprr.getCmdmAmt());
		params.put("localAmt",saprr.getLocalAmt());
		params.put("createUser",saprr.getCreateUser());
		params.put("createDate",saprr.getCreateDate());
		params.put("updateUser",saprr.getUpdateUser());
		params.put("updateDate",saprr.getUpdateDate());
		try{
			response.setReturnCode(acctITDao.saveAcitCMDM(params));
			response.setCmdm(acctITDao.retrieveAcitCMDMList(params));
		}catch (Exception ex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Unable to proceed to saving. Check fields."));
			ex.printStackTrace();
		}
		return response;
	}
	
	@Override
	public RetrieveAcitArListResponse retrieveArList(RetrieveAcitArListRequest raalr) throws SQLException {
		RetrieveAcitArListResponse response = new RetrieveAcitArListResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("arNo", raalr.getArNo());
		params.put("payor", raalr.getPayor());
		params.put("arDateFrom", raalr.getArDateFrom());
		params.put("arDateTo", raalr.getArDateTo());
		params.put("tranTypeName", raalr.getTranTypeName());
		params.put("arStatus", raalr.getArStatus());
		params.put("particulars", raalr.getParticulars());
		params.put("arAmtFrom", raalr.getArAmtFrom());
		params.put("arAmtTo", raalr.getArAmtTo());
		response.setAr(acctITDao.retrieveArList(params));
		return response;
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
	public UpdateAcitPaytReqStatResponse updateAcitPaytReqStat(UpdateAcitPaytReqStatRequest uaprsr)
			throws SQLException {
		UpdateAcitPaytReqStatResponse uaprsResponse = new UpdateAcitPaytReqStatResponse();
		HashMap<String, Object> uaprsParams = new HashMap<String, Object>();
		try {
			uaprsParams.put("reqId", uaprsr.getReqId());
			uaprsParams.put("reqStatus", uaprsr.getReqStatus());
			uaprsParams.put("updateUser", uaprsr.getUpdateUser());
			
			HashMap<String, Object> response = acctITDao.updateAcitPaytReqStat(uaprsParams);
			
			uaprsResponse.setReturnCode((Integer) response.get("errorCode"));
		} catch (SQLException sqlex) {
			uaprsResponse.setReturnCode(0);
			uaprsResponse.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		} catch (Exception ex) {
			uaprsResponse.setReturnCode(0);
			uaprsResponse.getErrorList().add(new Error("General Exception","Unable to proceed to saving. Check fields."));
			ex.printStackTrace();
		}
		return uaprsResponse;
	}


	@Override
	public RetrieveAcitRefNoLOVResponse retrieveAcitRefNoLOV(RetrieveAcitRefNoLOVRequest racitcmdmlr)
			throws SQLException {
		RetrieveAcitRefNoLOVResponse reponse = new RetrieveAcitRefNoLOVResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("arTag", racitcmdmlr.getArTag());
		params.put("cvTag", racitcmdmlr.getCvTag());
		params.put("jvTag", racitcmdmlr.getJvTag());
		params.put("cmTag", racitcmdmlr.getCmTag());
		params.put("dmTag", racitcmdmlr.getDmTag());
		params.put("groupTag", racitcmdmlr.getGroupTag());
		params.put("tranStat", racitcmdmlr.getTranStat());
		params.put("arStatus", racitcmdmlr.getArStatus());
		params.put("cvStatus", racitcmdmlr.getCvStatus());
		params.put("jvStatus", racitcmdmlr.getJvStatus());
		params.put("memoStatus", racitcmdmlr.getMemoStatus());
		reponse.setRefNoList(acctITDao.retrieveAcitRefNoLOV(params));
		return reponse;
	}

	@Override
	public RetrieveAcitArEntryResponse retrieveArEntry(RetrieveAcitArEntryRequest raaer) throws SQLException {
		RetrieveAcitArEntryResponse response = new RetrieveAcitArEntryResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", raaer.getTranId());
		params.put("arNo", raaer.getArNo());
		response.setAr(acctITDao.retrieveArEntry(params));
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


	@Override
	public RetrieveAcitSOAAgingResponse retrieveAcitSOAAging(RetrieveAcitSOAAgingDetailsRequest rasd)
			throws SQLException {
		RetrieveAcitSOAAgingResponse response = new RetrieveAcitSOAAgingResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", rasd.getTranId());
		params.put("policyId", rasd.getPolicyId());
		params.put("instNo", rasd.getInstNo());
		params.put("cedingId", rasd.getCedingId());
		response.setSoaDetails(acctITDao.retrieveAcitSOAAging(params));
		return response;
	}


	@Override
	public RetrieveAcitJVInwPolBalResponse retrieveAcitJvAdjstInwPolBal(RetrieveAcitJVInPolBalRequest rajipb)
			throws SQLException {
		RetrieveAcitJVInwPolBalResponse response = new RetrieveAcitJVInwPolBalResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", rajipb.getTranId());
		params.put("instNo", rajipb.getInstNo());
		params.put("cedingCo", rajipb.getCedingCo());
		response.setInwPolBal(acctITDao.retrieveAcitJVAdjstInwPolBal(params));
		return response;
	}


	@Override
	public RetrieveAcitPrqTransResponse retrieveAcitPrqTrans(RetrieveAcitPrqTransRequest raptp) throws SQLException {
		RetrieveAcitPrqTransResponse raptResponse =  new RetrieveAcitPrqTransResponse();
		HashMap<String, Object> raptParams = new HashMap<String, Object>();
		raptParams.put("reqId", raptp.getReqId());
		raptParams.put("itemNo", raptp.getItemNo());
		raptResponse.setAcitPrqTrans(acctITDao.retrieveAcitPrqTrans(raptParams));
		logger.info("RetrieveAcitPrqTransResponse : " + raptResponse.toString());
		return raptResponse;
	}

	@Override
	public RetrieveAcitJVIntOverdAcctMSResponse retrieveAcitJVIntOverdue(RetrieveAcitJVIntOverdAcctMSRequest rajvo)
			throws SQLException {
		RetrieveAcitJVIntOverdAcctMSResponse response = new RetrieveAcitJVIntOverdAcctMSResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", rajvo.getTranId());
		params.put("instNo", rajvo.getInstNo());
		params.put("cedingId", rajvo.getCedingId());
		response.setOverDueAccts(acctITDao.retrieveAcitJVIntOverdAcctsMS(params));
		return response;
	}

	@Override
	public SaveAcitPrqTransResponse saveAcitPrqTrans(SaveAcitPrqTransRequest saptr) throws SQLException {
		SaveAcitPrqTransResponse saptResponse = new SaveAcitPrqTransResponse();
		HashMap<String, Object> saptParams = new HashMap<String, Object>();
		try {
			saptParams.put("deletePrqTrans", saptr.getDeletePrqTrans());
			saptParams.put("savePrqTrans", saptr.getSavePrqTrans());
			
			HashMap<String, Object> response = acctITDao.saveAcitPrqTrans(saptParams);
			saptResponse.setReturnCode((Integer) response.get("errorCode"));
		} catch (SQLException sqlex) {
			saptResponse.setReturnCode(0);
			saptResponse.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		} catch (Exception ex) {
			saptResponse.setReturnCode(0);
			saptResponse.getErrorList().add(new Error("General Exception","Unable to proceed to saving. Check fields."));
			ex.printStackTrace();
		}
		return saptResponse;
	}

	@Override
	public CancelCMDMCMDMResponse cancelCMDMCMDM(CancelCMDMCMDMRequest saprr) throws SQLException {
		CancelCMDMCMDMResponse response = new CancelCMDMCMDMResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId",saprr.getTranId());
		params.put("updateUser", saprr.getUpdateUser());
		params.put("updateDate", saprr.getUpdateDate());
		response.setReturnCode(acctITDao.cancelCMDM(params));
		return response;
	}


	@Override
	public SaveAcitJVAdjInwPolBalResponse saveAcitJvInwPolBal(SaveAcitJVAdjInwPolBalRequest request)
			throws SQLException {
		SaveAcitJVAdjInwPolBalResponse response = new SaveAcitJVAdjInwPolBalResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("saveInwPol" , request.getSaveInwPol());
			params.put("deleteInwPol" , request.getDeleteInwPol());
			HashMap<String, Object> res = acctITDao.saveAcitJVAdjInwPolBal(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		} catch (SQLException sqlex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		}
		return response;
	}

	public PrintCMDMResponse printCMDM(PrintCMDMRequest saprr) throws SQLException {
		PrintCMDMResponse response = new PrintCMDMResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId",saprr.getTranId());
		params.put("updateUser", saprr.getUpdateUser());
		params.put("updateDate", saprr.getUpdateDate());
		response.setReturnCode(acctITDao.printCMDM(params));
		return response;
	}


	@Override
	public SaveAcitJVIntOverdAcctMSResponse saveAcitJvOverdueAccts(SaveAcitJVIntOverdAcctMSRequest request)
			throws SQLException {
		SaveAcitJVIntOverdAcctMSResponse response = new SaveAcitJVIntOverdAcctMSResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("saveOverdueAccts" , request.getSaveOverdueAccts());
			params.put("deleteOverdueAccts" , request.getDeleteOverdueAccts());
			HashMap<String, Object> res = acctITDao.saveAcitJVOverdueAccts(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		} catch (SQLException sqlex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		}
		return response;
	}

	public RetrieveAcitAcctEntriesResponse retrieveAcitAcctEntries(RetrieveAcitAcctEntriesRequest racitcmdmlr)
			throws SQLException {
		RetrieveAcitAcctEntriesResponse response = new RetrieveAcitAcctEntriesResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", racitcmdmlr.getTranId()) ;
		params.put("entryId", racitcmdmlr.getEntryId()) ;
		params.put("glAcctId", racitcmdmlr.getGlAcctId()) ;
		params.put("slTypeCd", racitcmdmlr.getSlTypeCd()) ;
		params.put("slCd", racitcmdmlr.getSlCd()) ;
		response.setList(acctITDao.retrieveAcitAcctEntries(params));
		return response;
	}


	@Override
	public RetrieveAcitJVPremResRelResponse retrieveAcitJVPremresRel(RetrieveAcitJVPremResRelRequest request)
			throws SQLException {
		RetrieveAcitJVPremResRelResponse response = new RetrieveAcitJVPremResRelResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", request.getTranId());
		response.setPremResRel(acctITDao.retrieveAcitJVPremResRel(params));
		return response;
	}

	public RetrieveQSOAListResponse retrieveQSOAList(RetrieveQSOAListRequest rqlr) throws SQLException {
		RetrieveQSOAListResponse rqlResponse = new RetrieveQSOAListResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("qsoaId", rqlr.getQsoaId());
		params.put("cedingId", rqlr.getCedingId());
		params.put("fromQtr", rqlr.getFromQtr());
		params.put("fromYear", rqlr.getFromYear());
		params.put("toQtr", rqlr.getToQtr());
		params.put("toYear", rqlr.getToYear());
		
		rqlResponse.setQsoaList(acctITDao.retrieveQSOAList(params));
		
		return rqlResponse;
	}

	@Override
	public SaveAcitAcctEntriesResponse saveAcitAcctEntries(SaveAcitAcctEntriesRequest saprr) throws SQLException {
		SaveAcitAcctEntriesResponse response = new SaveAcitAcctEntriesResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveList", saprr.getSaveList()) ;
		params.put("delList", saprr.getDelList()) ;
		try{
			response.setReturnCode(acctITDao.saveAcitAcctEntries(params));
		}catch (Exception ex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Unable to proceed to saving. Check fields."));
			ex.printStackTrace();
		}
		return response;
	}


	@Override
	public SaveAcitJVPremResRelResponse saveAcitJVPremResRel(SaveAcitJVPremResRelRequest request) throws SQLException {
		SaveAcitJVPremResRelResponse response = new SaveAcitJVPremResRelResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("savePremResRel" , request.getSavePremResRel());
			params.put("deletePremResRel" , request.getDeletePremResRel());
			HashMap<String, Object> res = acctITDao.saveAcitJVPremResRel(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		} catch (SQLException sqlex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		}
		return response;
	}


	@Override
	public CancelJournalVoucherResponse cancelJV(CancelJournalVoucherRequest request) throws SQLException {
		CancelJournalVoucherResponse response = new CancelJournalVoucherResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("tranId" , request.getTranId());
			params.put("jvYear" , request.getJvYear());
			params.put("jvNo" , request.getJvNo());
			params.put("updateUser" , request.getUpdateUser());
			params.put("updateDate" , request.getUpdateDate());
			HashMap<String, Object> res = acctITDao.cancelJV(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		} catch (SQLException sqlex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		}
		return response;
	}
}
