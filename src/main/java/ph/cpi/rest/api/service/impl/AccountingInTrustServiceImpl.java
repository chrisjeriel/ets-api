package ph.cpi.rest.api.service.impl;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.AccountingInTrustDao;
import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.request.CancelArRequest;
import ph.cpi.rest.api.model.request.CancelCMDMCMDMRequest;
import ph.cpi.rest.api.model.request.CancelJournalVoucherRequest;
import ph.cpi.rest.api.model.request.GenerateUPRRequest;
import ph.cpi.rest.api.model.request.PrintCMDMRequest;
import ph.cpi.rest.api.model.request.PrintJVRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitAcctEntriesRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitAgingSoaDtlRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArAmtDtlRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArClmCashCallLovRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArClmCashCallRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArClmRecoverLovRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArClmRecoverRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArInvPulloutRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArInwPolBalRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArNegTrtyBalRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitArTransDtlRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitCMDMListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitCvPaytReqListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitInvestmentsListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVAppPaytZeroRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVClmNegTrtyRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVClmOffLOVRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVInPolBalRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVIntOverdAcctMSRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVListingRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitJVPremResRelRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitPaytReqRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitProfCommDtlRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitProfCommSummRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitPrqInwPolRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitPrqTransRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitRefNoLOVRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitSOAAgingDetailsRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitSOATreatyDetailsRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitServFeeMainGnrtRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitUPRPerCedeRequest;
import ph.cpi.rest.api.model.request.RetrieveQSOAListRequest;
import ph.cpi.rest.api.model.request.SaveAcitAcctEntriesRequest;
import ph.cpi.rest.api.model.request.SaveAcitArAmtDtlRequest;
import ph.cpi.rest.api.model.request.SaveAcitArClmCashCallRequest;
import ph.cpi.rest.api.model.request.SaveAcitArClmRecoverRequest;
import ph.cpi.rest.api.model.request.SaveAcitArInvPulloutRequest;
import ph.cpi.rest.api.model.request.SaveAcitArInwPolBalRequest;
import ph.cpi.rest.api.model.request.SaveAcitArNegTrtyBalRequest;
import ph.cpi.rest.api.model.request.SaveAcitArTransDtlRequest;
import ph.cpi.rest.api.model.request.SaveAcitArTransRequest;
import ph.cpi.rest.api.model.request.SaveAcitCMDMRequest;
import ph.cpi.rest.api.model.request.SaveAcitInvestmentsRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVAdjInwPolBalRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVAppPaytZeroRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVEntryRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVIntOverdAcctMSRequest;
import ph.cpi.rest.api.model.request.SaveAcitJVPremResRelRequest;
import ph.cpi.rest.api.model.request.SaveAcitJvNegTrtyRequest;
import ph.cpi.rest.api.model.request.SaveAcitPaytReqRequest;
import ph.cpi.rest.api.model.request.SaveAcitPrqInwPolRequest;
import ph.cpi.rest.api.model.request.SaveAcitPrqTransRequest;
import ph.cpi.rest.api.model.request.UpdateAcitPaytReqStatRequest;
import ph.cpi.rest.api.model.response.CancelArResponse;
import ph.cpi.rest.api.model.response.CancelCMDMCMDMResponse;
import ph.cpi.rest.api.model.response.CancelJournalVoucherResponse;
import ph.cpi.rest.api.model.response.GenerateUPRResponse;
import ph.cpi.rest.api.model.response.PrintCMDMResponse;
import ph.cpi.rest.api.model.response.PrintJVResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitAcctEntriesResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitAgingSoaDtlResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArAmtDtlResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArClmCashCallLovResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArClmCashCallResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArClmRecoverLovResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArClmRecoverResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArInvPulloutResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArInwPolBalResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArNegTrtyBalResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitArTransDtlResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitCMDMListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitCvPaytReqListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitInvestmentsListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVAppPaytZeroResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVClmNegTrtyResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVClmOffLOVResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVIntOverdAcctMSResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVInwPolBalResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVListingResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitJVPremResRelResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPaytReqResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitProfCommDtlResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitProfCommSummResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPrqInwPolResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPrqTransResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitRefNoLOVResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitSOAAgingResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitSOATreatyDetailsResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitServFeeMainGnrtResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitUPRPerCedeResponse;
import ph.cpi.rest.api.model.response.RetrieveQSOAListResponse;
import ph.cpi.rest.api.model.response.SaveAcitAcctEntriesResponse;
import ph.cpi.rest.api.model.response.SaveAcitArAmtDtlResponse;
import ph.cpi.rest.api.model.response.SaveAcitArClmCashCallResponse;
import ph.cpi.rest.api.model.response.SaveAcitArClmRecoverResponse;
import ph.cpi.rest.api.model.response.SaveAcitArInvPulloutResponse;
import ph.cpi.rest.api.model.response.SaveAcitArInwPolBalResponse;
import ph.cpi.rest.api.model.response.SaveAcitArNegTrtyBalResponse;
import ph.cpi.rest.api.model.response.SaveAcitArTransDtlResponse;
import ph.cpi.rest.api.model.response.SaveAcitArTransResponse;
import ph.cpi.rest.api.model.response.SaveAcitCMDMResponse;
import ph.cpi.rest.api.model.response.SaveAcitInvestmentsResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVAdjInwPolBalResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVAppPaytZeroResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVEntryResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVIntOverdAcctMSResponse;
import ph.cpi.rest.api.model.response.SaveAcitJVPremResRelResponse;
import ph.cpi.rest.api.model.response.SaveAcitJvNegTrtyResponse;
import ph.cpi.rest.api.model.response.SaveAcitPaytReqResponse;
import ph.cpi.rest.api.model.response.SaveAcitPrqInwPolResponse;
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
			saprResponse.setReqIdOut((Integer) response.get("reqId"));
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


//	@Override
//	public RetrieveAcitProfCommSummResponse retrieveAcitProfCommSumm(RetrieveAcitProfCommSummRequest rapcsr)
//			throws SQLException {
//		// TODO Auto-generated method stub
//		RetrieveAcitProfCommSummResponse rapcsrResponse =  new RetrieveAcitProfCommSummResponse();
//		HashMap<String, Object> rapcsrParams = new HashMap<String, Object>();
//		rapcsrParams.put("profcommId", rapcsr.getProfcommId());
//		rapcsrParams.put("cedingId", rapcsr.getCedingId());
//		rapcsrParams.put("month", rapcsr.getMonth());
//		rapcsrParams.put("year", rapcsr.getYear());
//		rapcsrResponse.setAcitProfCommSummList(acctITDao.retrieveProfCommSumm(rapcsrParams));
//		logger.info("RetrieveAcitProfCommSummResponse : " + rapcsrResponse.toString());
//		return rapcsrResponse;
//	}


//	@Override
//	public RetrieveAcitProfCommDtlResponse retrieveAcitProfCommDtl(RetrieveAcitProfCommDtlRequest rapcdr)
//			throws SQLException {
//		RetrieveAcitProfCommDtlResponse rapcdrResponse =  new RetrieveAcitProfCommDtlResponse();
//		HashMap<String, Object> rapcdrParams = new HashMap<String, Object>();
//		rapcdrParams.put("profcommId", rapcdr.getProfcommId());		
//		rapcdrResponse.setAcitProfCommDtl(acctITDao.retrieveProfCommDtl(rapcdrParams));
//		logger.info("RetrieveAcitProfCommDtlResponse : " + rapcdrResponse.toString());
//		return rapcdrResponse;
//	}

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
	public RetrieveAcitInvestmentsListResponse retrieveAcitInvestmentList(RetrieveAcitInvestmentsListRequest railr)
			throws SQLException {
		// TODO Auto-generated method stub
		
		RetrieveAcitInvestmentsListResponse railrResponse = new RetrieveAcitInvestmentsListResponse();
		HashMap<String, Object> railrParams = new HashMap<String, Object>();
		railrParams.put("invtId", railr.getInvtId());
		railrParams.put("invtCd", railr.getInvtCd());
		railrParams.put("bank", railr.getBank());
		railrParams.put("bankCd", railr.getBankCd());
		railrParams.put("invtType", railr.getInvtType());
		railrParams.put("invtSecCd", railr.getInvtSecCd());
		railrParams.put("invtStatus", railr.getInvtStatus());
		railrParams.put("matPeriod", railr.getMatPeriod());
		railrParams.put("durUnit", railr.getDurUnit());
		railrParams.put("purDate", railr.getPurDate());
		railrParams.put("matDateFrom", railr.getMatDateFrom());
		railrParams.put("matDateTo", railr.getMatDateTo());
		railrParams.put("currCd", railr.getCurrCd());
		
		railrResponse.setInvtList(acctITDao.retrieveInvestmentList(railrParams));
		logger.info("RetrieveAcitInvestmentsListResponse : " + railrResponse.toString());
		return railrResponse;
	}


	@Override
	public SaveAcitInvestmentsResponse saveAcitInvestments(SaveAcitInvestmentsRequest rair) throws SQLException {
		// TODO Auto-generated method stub
		SaveAcitInvestmentsResponse sairResponse = new SaveAcitInvestmentsResponse();
		HashMap<String, Object> sairParams = new HashMap<String, Object>();
		try {
			sairParams.put("saveAcitInvestments",rair.getSaveAcitInvestments());
			sairParams.put("delAcitInvestments", rair.getDelAcitInvestments());
			sairResponse.setReturnCode(acctITDao.saveAcitInvestments(sairParams));
			logger.info("SaveAcitInvestmentsResponse : " + sairResponse.toString());
		} catch (SQLException sqlex) {
			sairResponse.setReturnCode(0);
			sqlex.printStackTrace();
		} catch (Exception ex) {
			sairResponse.setReturnCode(0);
			sairResponse.getErrorList().add(new Error("General Exception","Unable to proceed to saving. Check fields."));
			ex.printStackTrace();
		}
		return sairResponse;
	}
	
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
	public RetrieveAcitProfCommSummResponse retrieveAcitProfCommSumm(RetrieveAcitProfCommSummRequest rapcsr)
			throws SQLException {
		// TODO Auto-generated method stub
		
		RetrieveAcitProfCommSummResponse rapcsrResponse =  new RetrieveAcitProfCommSummResponse();
		HashMap<String, Object> rapcsrParams = new HashMap<String, Object>();
		rapcsrParams.put("profcommId", rapcsr.getProfcommId());
		rapcsrParams.put("cedingId", rapcsr.getCedingId());
		rapcsrParams.put("month", rapcsr.getMonth());
		rapcsrParams.put("year", rapcsr.getYear());
		rapcsrResponse.setAcitProfCommSummList(acctITDao.retrieveProfCommSumm(rapcsrParams));
		logger.info("RetrieveAcitProfCommSummResponse : " + rapcsrResponse.toString());
		return rapcsrResponse;
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
			params.put("tranType", request.getTranType());
			params.put("tranId", request.getTranId());
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


	@Override
	public SaveAcitJVIntOverdAcctMSResponse saveAcitJvOverdueAccts(SaveAcitJVIntOverdAcctMSRequest request)
			throws SQLException {
		SaveAcitJVIntOverdAcctMSResponse response = new SaveAcitJVIntOverdAcctMSResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("tranType" , request.getTranType());
			params.put("tranId" , request.getTranId());
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

	@Override
	public RetrieveAcitAgingSoaDtlResponse retrieveAgingSoaDtl(RetrieveAcitAgingSoaDtlRequest raasdr)
			throws SQLException {
		RetrieveAcitAgingSoaDtlResponse response = new RetrieveAcitAgingSoaDtlResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyId", raasdr.getPolicyId());
		params.put("instNo", raasdr.getInstNo());
		params.put("cedingId", raasdr.getCedingId());
		params.put("payeeNo", raasdr.getPayeeNo());
		params.put("zeroBal", raasdr.getZeroBal());
		response.setSoaDtlList(acctITDao.retrieveAgingSoaDtl(params));
		return response;
	}
	
	@Override
	public SaveAcitArInwPolBalResponse saveArInwPolBal(SaveAcitArInwPolBalRequest saipbr) throws SQLException {
		SaveAcitArInwPolBalResponse response = new SaveAcitArInwPolBalResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", saipbr.getTranId());
		params.put("billId", saipbr.getBillId());
		params.put("billType", saipbr.getBillType());
		params.put("totalLocalAmt", saipbr.getTotalLocalAmt());
		params.put("createUser", saipbr.getCreateUser());
		params.put("createDate", saipbr.getCreateDate());
		params.put("updateUser", saipbr.getUpdateUser());
		params.put("updateDate", saipbr.getUpdateDate());
		params.put("saveInwPolBal", saipbr.getSaveInwPolBal());
		params.put("delInwPolBal", saipbr.getDelInwPolBal());
		try{
			HashMap<String, Object> res = acctITDao.saveArInwPolBal(params);
			response.setReturnCode(Integer.parseInt(res.get("errorCode").toString()));
			if(saipbr.getSaveInwPolBal().size() != 0){
				response.setNewPrem(new BigDecimal(res.get("newPrem").toString()));
				response.setNewRiComm(new BigDecimal(res.get("newRiComm").toString()));
				response.setNewRiCommVat(new BigDecimal(res.get("newRiCommVat").toString()));
				response.setNewCharges(new BigDecimal(res.get("newCharges").toString()));
			}
			
			if(res.get("custReturnCode") != null){
				response.getErrorList().add(new Error("Exceeded AR Amount", "Cannot save. AR Amount exceeded"));
				response.setReturnCode(0);
				response.setCustReturnCode(Integer.parseInt(res.get("custReturnCode").toString()));
			}
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception", "Please check field values."));
			e.printStackTrace();
		}
		logger.info(response.toString());
		return response;
	}

	@Override
	public RetrieveAcitArInwPolBalResponse retrieveArInwPolBal(RetrieveAcitArInwPolBalRequest raaipbr)
			throws SQLException {
		RetrieveAcitArInwPolBalResponse response = new RetrieveAcitArInwPolBalResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", raaipbr.getTranId());
		params.put("billId", raaipbr.getBillId());
		response.setArInwPolBal(acctITDao.retrieveAcitArInwPolBal(params));
		return response;
	}
	
	@Override
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
		params.put("cedingId", request.getCedingId());
		response.setPremResRel(acctITDao.retrieveAcitJVPremResRel(params));
		return response;
	}

	@Override
	public RetrieveAcitArTransDtlResponse retrieveARTransDtl(RetrieveAcitArTransDtlRequest raatdr) throws SQLException {
		RetrieveAcitArTransDtlResponse response = new RetrieveAcitArTransDtlResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", raatdr.getTranId());
		params.put("billId", raatdr.getBillId());
		response.setTransDtlList(acctITDao.retrieveAcitArTransDtl(params));
		return response;
	}


	@Override
	public SaveAcitArTransDtlResponse saveAcitArTransDtl(SaveAcitArTransDtlRequest saatdr) throws SQLException {
		SaveAcitArTransDtlResponse response = new SaveAcitArTransDtlResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", saatdr.getTranId());
		params.put("billId", saatdr.getBillId());
		params.put("billType", saatdr.getBillType());
		params.put("totalLocalAmt", saatdr.getTotalLocalAmt());
		params.put("createUser", saatdr.getCreateUser());
		params.put("createDate", saatdr.getCreateDate());
		params.put("updateUser", saatdr.getUpdateUser());
		params.put("updateDate", saatdr.getUpdateDate());
		params.put("saveTransDtl", saatdr.getSaveTransDtl());
		params.put("delTransDtl", saatdr.getDelTransDtl());
		try{
			HashMap<String, Object> res = acctITDao.saveArTransDtl(params);
			response.setReturnCode(Integer.parseInt(res.get("errorCode").toString()));
			
			if(res.get("custReturnCode") != null){
				response.getErrorList().add(new Error("Exceeded AR Amount", "Cannot save. AR Amount exceeded"));
				response.setReturnCode(0);
				response.setCustReturnCode(Integer.parseInt(res.get("custReturnCode").toString()));
			}
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception", "Please check field values."));
			e.printStackTrace();
		}
		return response;
	}
	
	@Override
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
			params.put("tranType" , request.getTranType());
			params.put("tranId" , request.getTranId());
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


	@Override
	public PrintJVResponse printJV(PrintJVRequest request) throws SQLException {
		PrintJVResponse response = new PrintJVResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("tranId" , request.getTranId());
			params.put("jvYear" , request.getJvYear());
			params.put("jvNo" , request.getJvNo());
			params.put("updateUser" , request.getUpdateUser());
			params.put("updateDate" , request.getUpdateDate());
			HashMap<String, Object> res = acctITDao.printJV(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		} catch (SQLException sqlex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		}
		return response;
	}
	
	@Override
	public RetrieveAcitProfCommDtlResponse retrieveAcitProfCommDtl(RetrieveAcitProfCommDtlRequest rapcdr)
			throws SQLException {
		RetrieveAcitProfCommDtlResponse rapcdrResponse =  new RetrieveAcitProfCommDtlResponse();
		HashMap<String, Object> rapcdrParams = new HashMap<String, Object>();
		rapcdrParams.put("profcommId", rapcdr.getProfcommId());		
		rapcdrResponse.setAcitProfCommDtl(acctITDao.retrieveProfCommDtl(rapcdrParams));
		logger.info("RetrieveAcitProfCommDtlResponse : " + rapcdrResponse.toString());
		return rapcdrResponse;
	}


	@Override
	public RetrieveAcitPrqInwPolResponse retrieveAcitPrqInwPol(RetrieveAcitPrqInwPolRequest rapipp)
			throws SQLException {
		RetrieveAcitPrqInwPolResponse rapipResponse = new RetrieveAcitPrqInwPolResponse();
		HashMap<String, Object> rapipParams = new HashMap<String, Object>();
		rapipParams.put("",rapipp.getReqId());
		rapipParams.put("",rapipp.getItemNo());
		rapipResponse.setAcitPrqInwPolList(acctITDao.retrieveAcitPrqInwPol(rapipParams));
		logger.info("RetrieveAcitPrqInwPolResponse : " + rapipResponse.toString());
		return rapipResponse;
	}

	@Override
	public RetrieveAcitArClmRecoverResponse retrieveAcitArClmRecover(RetrieveAcitArClmRecoverRequest raacrr)
			throws SQLException {
		RetrieveAcitArClmRecoverResponse response = new RetrieveAcitArClmRecoverResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", raacrr.getTranId());
		params.put("billId", raacrr.getBillId());
		response.setArClmRecover(acctITDao.retrieveAcitArClmRecover(params));
		return response;
	}

	@Override
	public RetrieveAcitJVAppPaytZeroResponse retrieveAcitJVAppPaytZeroBal(RetrieveAcitJVAppPaytZeroRequest request)
			throws SQLException {
		RetrieveAcitJVAppPaytZeroResponse response =  new RetrieveAcitJVAppPaytZeroResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", request.getTranId());		
		params.put("instNo", request.getInstNo());	
		params.put("cedingId", request.getCedingId());	
		response.setZeroBal(acctITDao.retrieveAcitJVAppPaytZeroBal(params));
		logger.info("RetrieveAcitJVAppPaytZeroResponse : " + response.toString());
		return response;
	}


	@Override
	public SaveAcitPrqInwPolResponse saveAcitPrqInwPol(SaveAcitPrqInwPolRequest sapipp) throws SQLException {
		SaveAcitPrqInwPolResponse sapipResponse = new SaveAcitPrqInwPolResponse();
		HashMap<String, Object> sapipParams = new HashMap<String, Object>();
		try {
			sapipParams.put("saveAcitPrqInwPol",sapipp.getSaveAcitPrqInwPol());
			sapipParams.put("deleteAcitPrqInwPol",sapipp.getDeleteAcitPrqInwPol());
			
			HashMap<String, Object> response = acctITDao.saveAcitPrqInwPol(sapipParams);
			sapipResponse.setReturnCode((Integer) response.get("errorCode"));
		} catch (SQLException sqlex) {
			sapipResponse.setReturnCode(0);
			sapipResponse.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		} catch (Exception ex) {
			sapipResponse.setReturnCode(0);
			sapipResponse.getErrorList().add(new Error("General Exception","Unable to proceed to saving. Check fields."));
			ex.printStackTrace();
		}
		return sapipResponse;
	}

	@Override
	public RetrieveAcitServFeeMainGnrtResponse retrieveAcitServFeeMainGnrt(RetrieveAcitServFeeMainGnrtRequest rasfmr)
			throws SQLException {
		RetrieveAcitServFeeMainGnrtResponse rasfmgResponse = new RetrieveAcitServFeeMainGnrtResponse();
		HashMap<String, Object> rasfmParams = new HashMap<String, Object>();
		rasfmParams.put("prdAsOf", rasfmr.getPrdAsOf());
		rasfmParams.put("year", rasfmr.getYear());
		rasfmParams.put("servFeeAmt", rasfmr.getServFeeAmt());
		
		rasfmgResponse.setMainDistList(acctITDao.retrieveAcitServFeeMainGnrt(rasfmParams));
		
		return rasfmgResponse;
	}

	@Override
	public RetrieveAcitArClmRecoverLovResponse retrieveAcitArClmRecoverLov(RetrieveAcitArClmRecoverLovRequest raacrlr)
			throws SQLException {
		RetrieveAcitArClmRecoverLovResponse response = new RetrieveAcitArClmRecoverLovResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("payeeNo", raacrlr.getPayeeNo());
		response.setClaimList(acctITDao.retrieveAcitArClmRecoverLov(params));
		return response;
	}


	@Override
	public SaveAcitArClmRecoverResponse saveArClmRecover(SaveAcitArClmRecoverRequest saacrr) throws SQLException {
		SaveAcitArClmRecoverResponse response = new SaveAcitArClmRecoverResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", saacrr.getTranId());
		params.put("billId", saacrr.getBillId());
		params.put("billType", saacrr.getBillType());
		params.put("totalLocalAmt", saacrr.getTotalLocalAmt());
		params.put("createUser", saacrr.getCreateUser());
		params.put("createDate", saacrr.getCreateDate());
		params.put("updateUser", saacrr.getUpdateUser());
		params.put("updateDate", saacrr.getUpdateDate());
		params.put("saveClmRecover", saacrr.getSaveClmRecover());
		params.put("delClmRecover", saacrr.getDelClmRecover());
		try{
			HashMap<String, Object> res = acctITDao.saveArClmRecover(params);
			response.setReturnCode(Integer.parseInt(res.get("errorCode").toString()));
			
			if(res.get("custReturnCode") != null){
				response.getErrorList().add(new Error("Exceeded AR Amount", "Cannot save. AR Amount exceeded"));
				response.setReturnCode(0);
				response.setCustReturnCode(Integer.parseInt(res.get("custReturnCode").toString()));
			}
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception", "Please check field values."));
			e.printStackTrace();
		}
		return response;
	}


	@Override
	public RetrieveAcitArInvPulloutResponse retrieveAcitArInvArPullout(RetrieveAcitArInvPulloutRequest raaipr)
			throws SQLException {
		RetrieveAcitArInvPulloutResponse response = new RetrieveAcitArInvPulloutResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", raaipr.getTranId());
		params.put("billId", raaipr.getBillId());
		params.put("pulloutType", raaipr.getPulloutType());
		response.setInvPulloutList(acctITDao.retrieveAcitArPullout(params));
		return response;
	}
	
	@Override
	public SaveAcitJVAppPaytZeroResponse saveAcitJVAppPaytZeroBal(SaveAcitJVAppPaytZeroRequest request)
			throws SQLException {
		SaveAcitJVAppPaytZeroResponse response = new SaveAcitJVAppPaytZeroResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("tranType" , request.getTranType());
			params.put("tranId", request.getTranId());
			params.put("saveZeroBal" , request.getSaveZeroBal());
			params.put("saveZeroBal" , request.getSaveZeroBal());
			params.put("deleteZeroBal" , request.getDeleteZeroBal());
			HashMap<String, Object> res = acctITDao.saveAcitJVAppPaytZeroBal(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		} catch (SQLException sqlex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		}
		return response;
	}


	@Override
	public RetrieveAcitSOATreatyDetailsResponse retrieveAcitSOATrtyDetails(RetrieveAcitSOATreatyDetailsRequest request)
			throws SQLException {
		RetrieveAcitSOATreatyDetailsResponse response = new RetrieveAcitSOATreatyDetailsResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyId", request.getPolicyId());
		params.put("instNo", request.getInstNo());
		params.put("cedingId", request.getCedingId());
		params.put("payeeNo", request.getPayeeNo());
		params.put("zeroBal", request.getZeroBal());
		response.setSoaDetails(acctITDao.retrieveAcitSoaTrtyList(params));
		return response;
	}
	
	@Override
	public SaveAcitArInvPulloutResponse saveAcitArInvPullout(SaveAcitArInvPulloutRequest saaipr) throws SQLException {
		SaveAcitArInvPulloutResponse response = new SaveAcitArInvPulloutResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", saaipr.getTranId());
		params.put("billId", saaipr.getBillId());
		params.put("billType", saaipr.getBillType());
		params.put("totalLocalAmt", saaipr.getTotalLocalAmt());
		params.put("createUser", saaipr.getCreateUser());
		params.put("createDate", saaipr.getCreateDate());
		params.put("updateUser", saaipr.getUpdateUser());
		params.put("updateDate", saaipr.getUpdateDate());
		params.put("saveInvPullout", saaipr.getSaveInvPullout());
		params.put("delInvPullout", saaipr.getDelInvPullout());
		try{
			HashMap<String, Object> res = acctITDao.saveAcitArInvPullout(params);
			response.setReturnCode(Integer.parseInt(res.get("errorCode").toString()));
			
			if(res.get("custReturnCode") != null){
				response.getErrorList().add(new Error("Exceeded AR Amount", "Cannot save. AR Amount exceeded"));
				response.setReturnCode(0);
				response.setCustReturnCode(Integer.parseInt(res.get("custReturnCode").toString()));
			}
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception", "Please check field values."));
			e.printStackTrace();
		}
		return response;
	}


	@Override
	public RetrieveAcitJVClmOffLOVResponse retrieveAcitJvClmOff(RetrieveAcitJVClmOffLOVRequest request)
			throws SQLException {
		RetrieveAcitJVClmOffLOVResponse response = new RetrieveAcitJVClmOffLOVResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("cedingId", request.getCedingId());
		response.setClaimOffset(acctITDao.retrieveAcitJvClmOff(params));
		return response;
	}

	@Override
	public RetrieveAcitArNegTrtyBalResponse retrieveAcitArNegTrtyBal(RetrieveAcitArNegTrtyBalRequest raantbr)
			throws SQLException {
		RetrieveAcitArNegTrtyBalResponse response = new RetrieveAcitArNegTrtyBalResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", raantbr.getTranId());
		params.put("billId", raantbr.getBillId());
		response.setNegTrtyBalList(acctITDao.retrieveAcitArNegTrtyBal(params));
		return response;
	}

	@Override
	public SaveAcitArNegTrtyBalResponse saveAcitArNegTrtyBal(SaveAcitArNegTrtyBalRequest saantbr) throws SQLException {
		SaveAcitArNegTrtyBalResponse response = new SaveAcitArNegTrtyBalResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", saantbr.getTranId());
		params.put("billId", saantbr.getBillId());
		params.put("billType", saantbr.getBillType());
		params.put("totalLocalAmt", saantbr.getTotalLocalAmt());
		params.put("createUser", saantbr.getCreateUser());
		params.put("createDate", saantbr.getCreateDate());
		params.put("updateUser", saantbr.getUpdateUser());
		params.put("updateDate", saantbr.getUpdateDate());
		params.put("saveNegTrtyBal", saantbr.getSaveNegTrtyBal());
		params.put("delNegTrtyBal", saantbr.getDelNegTrtyBal());
		try{
			HashMap<String, Object> res = acctITDao.saveAcitArNegTrtyBal(params);
			response.setReturnCode(Integer.parseInt(res.get("errorCode").toString()));
			
			if(res.get("custReturnCode") != null){
				response.getErrorList().add(new Error("Exceeded AR Amount", "Cannot save. AR Amount exceeded"));
				response.setReturnCode(0);
				response.setCustReturnCode(Integer.parseInt(res.get("custReturnCode").toString()));
			}
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception", "Please check field values."));
			e.printStackTrace();
		}
		return response;
	}
	
	@Override
	public GenerateUPRResponse generateUPR(GenerateUPRRequest guprr) throws SQLException {
		GenerateUPRResponse response = new GenerateUPRResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		try{
			params.put("extMm",guprr.getExtMm());
			params.put("extYear",guprr.getExtYear());
			params.put("extMethod",guprr.getExtMethod());
			params.put("extractUser",guprr.getExtractUser());
			params.put("extractDate",guprr.getExtractDate());
			response.setReturnCode(acctITDao.generateUPR(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception", "Please check field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveAcitArClmCashCallResponse retrieveAcitArClmCashCall(RetrieveAcitArClmCashCallRequest raacccr)
			throws SQLException {
		RetrieveAcitArClmCashCallResponse response = new RetrieveAcitArClmCashCallResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", raacccr.getTranId());
		params.put("billId", raacccr.getBillId());
		response.setClmCashCallList(acctITDao.retrieveAcitArClmCashCall(params));
		return response;
	}

	@Override
	public RetrieveAcitJVClmNegTrtyResponse retrieveAcitJvNegTrty(RetrieveAcitJVClmNegTrtyRequest request)
			throws SQLException {
		RetrieveAcitJVClmNegTrtyResponse response = new RetrieveAcitJVClmNegTrtyResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", request.getTranId());
		params.put("cedingId", request.getCedingId());
		response.setNegativeTrty(acctITDao.retrieveAcitJvNegTrty(params));
		return response;
	}

	@Override
	public RetrieveAcitArClmCashCallLovResponse retrieveAcitArClmCashCallLov(
			RetrieveAcitArClmCashCallLovRequest raaccclr) throws SQLException {
		RetrieveAcitArClmCashCallLovResponse response = new RetrieveAcitArClmCashCallLovResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("payeeNo", raaccclr.getPayeeNo());
		response.setClmCashCallLovList(acctITDao.retrieveAcitArClmCashCallLov(params));
		return response;
	}

	@Override
	public SaveAcitArClmCashCallResponse saveAcitArClmCashCall(SaveAcitArClmCashCallRequest saacccr)
			throws SQLException {
		SaveAcitArClmCashCallResponse response = new SaveAcitArClmCashCallResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", saacccr.getTranId());
		params.put("billId", saacccr.getBillId());
		params.put("billType", saacccr.getBillType());
		params.put("totalLocalAmt", saacccr.getTotalLocalAmt());
		params.put("createUser", saacccr.getCreateUser());
		params.put("createDate", saacccr.getCreateDate());
		params.put("updateUser", saacccr.getUpdateUser());
		params.put("updateDate", saacccr.getUpdateDate());
		params.put("saveClmCashCall", saacccr.getSaveClmCashCall());
		params.put("delClmCashCall", saacccr.getDelClmCashCall());
		try{
			HashMap<String, Object> res = acctITDao.saveAcitArClmCashCallLov(params);
			response.setReturnCode(Integer.parseInt(res.get("errorCode").toString()));
			
			if(res.get("custReturnCode") != null){
				response.getErrorList().add(new Error("Exceeded AR Amount", "Cannot save. AR Amount exceeded"));
				response.setReturnCode(0);
				response.setCustReturnCode(Integer.parseInt(res.get("custReturnCode").toString()));
			}
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception", "Please check field values."));
			e.printStackTrace();
		}
		return response;
	}


	@Override
	public SaveAcitJvNegTrtyResponse saveAcitJvNegTrty(SaveAcitJvNegTrtyRequest request) throws SQLException {
		SaveAcitJvNegTrtyResponse response = new SaveAcitJvNegTrtyResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("saveNegTrty", request.getSaveNegTrty());
			params.put("deleteNegTrty", request.getDeleteNegTrty());
			params.put("saveClmOffset", request.getSaveClmOffset());
			params.put("deleteClmOffset", request.getDeleteClmOffset());
			HashMap<String, Object> res = acctITDao.saveAcitJvNegTrty(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		} catch (SQLException sqlex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveAcitArAmtDtlResponse retrieveAcitArAmtDtl(RetrieveAcitArAmtDtlRequest raaadr) throws SQLException {
		RetrieveAcitArAmtDtlResponse response = new RetrieveAcitArAmtDtlResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", raaadr.getTranId());
		response.setArAmtDtlList(acctITDao.retrieveAcitArAmtDtl(params));
		return response;
	}


	@Override
	public SaveAcitArAmtDtlResponse saveAcitArAmtDtl(SaveAcitArAmtDtlRequest saaadr) throws SQLException {
		SaveAcitArAmtDtlResponse response = new SaveAcitArAmtDtlResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", saaadr.getTranId());
		params.put("totalLocalAmt", saaadr.getTotalLocalAmt());
		params.put("saveAmtDtl", saaadr.getSaveAmtDtl());
		params.put("delAmtDtl", saaadr.getDelAmtDtl());
		try{
			HashMap<String, Object> res = acctITDao.saveAcitArAmtDtl(params);
			response.setReturnCode(Integer.parseInt(res.get("errorCode").toString()));
			
			if(res.get("custReturnCode") != null){
				response.getErrorList().add(new Error("Exceeded AR Amount", "Cannot save. AR Amount exceeded"));
				response.setReturnCode(0);
				response.setCustReturnCode(Integer.parseInt(res.get("custReturnCode").toString()));
			}
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception", "Please check field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveAcitUPRPerCedeResponse retrieveAcitUPRPerCede(RetrieveAcitUPRPerCedeRequest raupcr)
			throws SQLException {
		RetrieveAcitUPRPerCedeResponse response = new RetrieveAcitUPRPerCedeResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("extMm",raupcr.getExtMm());
		params.put("extYear",raupcr.getExtYear());
		params.put("extMethod",raupcr.getExtMethod());
		params.put("cedingId",raupcr.getCedingId());
		response.setPerLine(acctITDao.retrieveAcitUPRPerLine(params));
		response.setPerPol(acctITDao.retrieveAcitUPRPerPol(params));
		return response;
	}
}
