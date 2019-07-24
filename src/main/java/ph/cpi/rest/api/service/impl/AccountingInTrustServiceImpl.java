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
import ph.cpi.rest.api.model.request.CancelArRequest;
import ph.cpi.rest.api.model.request.CancelCMDMCMDMRequest;
import ph.cpi.rest.api.model.request.PrintCMDMRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitCvPaytReqListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVListingRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitPaytReqRequest;
import ph.cpi.rest.api.model.request.SaveAcitArTransRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitRefNoLOVRequest;
import ph.cpi.rest.api.model.request.SaveAcitCMDMRequest;
import ph.cpi.rest.api.model.request.SaveAcitPaytReqRequest;
import ph.cpi.rest.api.model.response.RetrieveAcitCMDMListResponse;
import ph.cpi.rest.api.model.response.CancelArResponse;
import ph.cpi.rest.api.model.response.CancelCMDMCMDMResponse;
import ph.cpi.rest.api.model.response.PrintCMDMResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArListResponse;
import ph.cpi.rest.api.model.request.RetrieveAcitPrqTransRequest;
import ph.cpi.rest.api.model.request.SaveAcitPaytReqRequest;
import ph.cpi.rest.api.model.request.UpdateAcitPaytReqStatRequest;
import ph.cpi.rest.api.model.response.RetrieveAcitCvPaytReqListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVListingResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPaytReqResponse;
import ph.cpi.rest.api.model.response.SaveAcitArTransResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitRefNoLOVResponse;
import ph.cpi.rest.api.model.response.SaveAcitCMDMResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPrqTransResponse;
import ph.cpi.rest.api.model.response.SaveAcitPaytReqResponse;
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
	public SaveAcitArTransResponse saveAcitArTrans(SaveAcitArTransRequest saatr) throws SQLException {
		SaveAcitArTransResponse response = new SaveAcitArTransResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", saatr.getTranId());
		params.put("tranDate", saatr.getTranDate());
		params.put("tranClass", saatr.getTranClass());
		params.put("tranTypeCd", saatr.getTranTypeCd());
		params.put("tranYear", saatr.getTranYear());
		params.put("tranClassNo", saatr.getTranClassNo());
		params.put("tranStat", saatr.getTranStat());
		params.put("closeDate", saatr.getCloseDate());
		params.put("deleteDate", saatr.getDeleteDate());
		params.put("postDate", saatr.getPostDate());
		params.put("createUser", saatr.getCreateUser());
		params.put("createDate", saatr.getCreateDate());
		params.put("updateUser", saatr.getUpdateUser());
		params.put("updateDate", saatr.getUpdateDate());
		params.put("arStatus", saatr.getArStatus());
		params.put("dcbYear", saatr.getDcbYear());
		params.put("dcbNo", saatr.getDcbNo());
		params.put("dcbUserCd", saatr.getDcbUserCd());
		params.put("dcbBank", saatr.getDcbBank());
		params.put("dcbBankAcct", saatr.getDcbBankAcct());
		params.put("refNo", saatr.getRefNo());
		params.put("prNo", saatr.getPrNo());
		params.put("prDate", saatr.getPrDate());
		params.put("prPreparedBy", saatr.getPrPreparedBy());
		params.put("payeeNo", saatr.getPayeeNo());
		params.put("payor", saatr.getPayor());
		params.put("particulars", saatr.getParticulars());
		params.put("currCd", saatr.getCurrCd());
		params.put("currRate", saatr.getCurrRate());
		params.put("arAmt", saatr.getArAmt());
		params.put("allocTag", saatr.getAllocTag());
		params.put("allocTranId", saatr.getAllocTranId());
		params.put("savePaytDtl", saatr.getSavePaytDtl());
		params.put("delPaytDtl", saatr.getDelPaytDtl());
		try{
			HashMap<String, Object> daoResponse = acctITDao.saveAcitArTrans(params);
			response.setReturnCode(Integer.parseInt(daoResponse.get("errorCode").toString()));
			response.setOutTranId(Integer.parseInt(daoResponse.get("outTranId").toString()));
			if(response.getOutTranId() == 0){
				response.setReturnCode(0);
				response.getErrorList().add(new Error("General Error","The specified AR No. is not yet generated. Please review your records and make the necessary changes."));
			}
		}catch(Throwable e){
			Throwable t = e;
			while(t.getCause() != null){
				t = t.getCause();
				if(t.toString().contains("unique constraint")){
					response.getErrorList().add(new Error("General Error","The specified AR No. was already taken. Please review your records and make the necessary changes."));
					break;
				}
			}
			response.setReturnCode(0);
			e.printStackTrace();
		}
		
		/*catch (SQLException sqlex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		} catch (Exception ex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Unable to proceed to saving. Check fields."));
			ex.printStackTrace();
		}*/
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
	public CancelArResponse cancelAr(CancelArRequest car) throws SQLException {
		CancelArResponse response = new CancelArResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId",car.getTranId());
		params.put("updateUser", car.getUpdateUser());
		params.put("updateDate", car.getUpdateDate());
		try{
			response.setReturnCode(acctITDao.cancelAr(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception", "Please check field values"));
			e.printStackTrace();
		}
		return response;
	}
}
