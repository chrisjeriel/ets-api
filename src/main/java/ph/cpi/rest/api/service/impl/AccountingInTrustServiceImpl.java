
package ph.cpi.rest.api.service.impl;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.controller.WebSocketController;
import ph.cpi.rest.api.dao.AccountingInTrustDao;
import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.accountingintrust.AcctServFeeDist;
import ph.cpi.rest.api.model.request.*;
import ph.cpi.rest.api.model.response.*;
import ph.cpi.rest.api.service.AccountingInTrustService;

@Component
public class AccountingInTrustServiceImpl implements AccountingInTrustService {
	
	@Autowired
	AccountingInTrustDao acctITDao;
	
	@Autowired
	WebSocketController wsController;
	
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
		rapParams.put("reqAmtFrom", racprlp.getReqAmtFrom());
		rapParams.put("reqAmtTo", racprlp.getReqAmtTo());
		rapParams.put("particulars", racprlp.getParticulars());
		rapParams.put("requestedBy", racprlp.getRequestedBy());
		rapParams.put("prqStat", racprlp.getPrqStat());
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
			//saprParams.put("payeeNo", saprr.getPayeeNo());
			saprParams.put("payeeClassCd", saprr.getPayeeClassCd());
			saprParams.put("payeeCd", saprr.getPayeeCd());
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
		params.put("memoId", saprr.getMemoId());
		params.put("memoType", saprr.getMemoType());
		params.put("memoTranType", saprr.getMemoTranType());
		params.put("memoYear", saprr.getMemoYear());
		params.put("memoMm", saprr.getMemoMm());
		params.put("memoSeqNo", saprr.getMemoSeqNo());
		params.put("tranTypeCd", saprr.getTranTypeCd());
		params.put("autoTag", saprr.getAutoTag());
		params.put("memoDate", saprr.getMemoDate());
		params.put("memoStatus", saprr.getMemoStatus());
		params.put("refNoTranId", saprr.getRefNoTranId());
		params.put("refNoDate", saprr.getRefNoDate());
		params.put("policyId", saprr.getPolicyId());
		params.put("instNo", saprr.getInstNo());
		params.put("claimId", saprr.getClaimId());
		params.put("projId", saprr.getProjId());
		params.put("histNo", saprr.getHistNo());
		params.put("payeeClassCd", saprr.getPayeeClassCd());
		params.put("payeeCd", saprr.getPayeeCd());
		params.put("payee", saprr.getPayee());
		params.put("particulars", saprr.getParticulars());
		params.put("currCd", saprr.getCurrCd());
		params.put("currRate", saprr.getCurrRate());
		params.put("cmdmAmt", saprr.getCmdmAmt());
		params.put("localAmt", saprr.getLocalAmt());
		params.put("createUser", saprr.getCreateUser());
		params.put("createDate", saprr.getCreateDate());
		params.put("updateUser", saprr.getUpdateUser());
		params.put("updateDate", saprr.getUpdateDate());
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
		params.put("tranStat", raalr.getTranStat());
		params.put("arStat", raalr.getArStat());
		response.setAr(acctITDao.retrieveArList(params));
		return response;
	}
	
	@Override
	public RetrieveAcitJVListingResponse retrieveAcitJvListing(RetrieveAcitJVListingRequest rajl) throws SQLException {
		RetrieveAcitJVListingResponse response = new RetrieveAcitJVListingResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", rajl.getTranId());
		params.put("jvNo", rajl.getJvNo());
		params.put("jvDateFrom", rajl.getJvDateFrom());
		params.put("jvDateTo", rajl.getJvDateTo());
		params.put("particulars", rajl.getParticulars());
		params.put("tranTypeName", rajl.getTranTypeName());
		params.put("refNo", rajl.getRefNo());
		params.put("preparedBy", rajl.getPreparedBy());
		params.put("jvAmtFrom", rajl.getJvAmtFrom());
		params.put("jvAmtTo", rajl.getJvAmtTo());
		params.put("tranStat", rajl.getTranStat());
		params.put("jvStat", rajl.getJvStat());
		
		params.put("pagination", rajl.getPaginationRequest());
		params.put("sort", rajl.getSortRequest());
		
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
			uaprsParams.put("approvedBy", uaprsr.getApprovedBy());
			uaprsParams.put("approvedDate", uaprsr.getApprovedDate());
			
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
		params.put("payeeClassCd", saatr.getPayeeClassCd());
		params.put("payor", saatr.getPayor());
		params.put("mailAddress", saatr.getMailAddress());
		params.put("bussTypeName", saatr.getBussTypeName());
		params.put("tin", saatr.getTin());
		params.put("particulars", saatr.getParticulars());
		params.put("currCd", saatr.getCurrCd());
		params.put("currRate", saatr.getCurrRate());
		params.put("arAmt", saatr.getArAmt());
		params.put("allocTag", saatr.getAllocTag());
		params.put("allocTranId", saatr.getAllocTranId());
		params.put("savePaytDtl", saatr.getSavePaytDtl());
		params.put("delPaytDtl", saatr.getDelPaytDtl());
		params.put("isPrint", saatr.getIsPrint());
		params.put("genAcctEnt", saatr.getGenAcctEnt());
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
			params.put("adjEntryTag", raje.getAdjEntryTag());
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
			params.put("remarks", raje.getRemarks());
			
			Boolean proceed = false;
			
			if(raje.getJvTranTypeCd() == 28) {
				params.put("profCommId", raje.getProfCommId());
				String tranNo = acctITDao.validateProfCommTran(params);
				proceed = tranNo == null;
				
				if(!proceed) {
					response.setReturnCode(1);
					response.setTranNo(tranNo);
				}
			} else {
				proceed = true;
			}
			
			if(proceed) {
				String checkSeries = acctITDao.checkAcitJvSeries();
				
				if(checkSeries.equals("Y")) {
					System.out.println("here");
					System.out.println(acctITDao.validateRiskDate(params));
					if(raje.getJvTranTypeCd() == 66 && acctITDao.validateRiskDate(params) != null) {
						response.setReturnCode(101);
						response.setTranNo(acctITDao.validateRiskDate(params));
						return response;
					}
					
					HashMap<String, Object> res = acctITDao.saveAcitJVEntry(params);
					response.setReturnCode((Integer) res.get("errorCode"));
					response.setTranIdOut((Integer) res.get("tranIdOut"));
					
					res.put("tranId", res.get("tranIdOut"));
					response.setTranNo(acctITDao.getAcitTranNo(res));
					response.setReturnCode(-1);
				} else {
					response.setReturnCode(100);
				}
			}
		} catch (Exception sqlex) {
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
		
		RetrieveAcitProfCommSummResponse rapcsrResponse =  new RetrieveAcitProfCommSummResponse();
		HashMap<String, Object> rapcsrParams = new HashMap<String, Object>();
		rapcsrParams.put("profcommId", rapcsr.getProfcommId());
		rapcsrParams.put("cedingId", rapcsr.getCedingId());
		rapcsrParams.put("dateTo", rapcsr.getDateTo());
		rapcsrParams.put("dateFrom", rapcsr.getDateFrom());
		rapcsrResponse.setAcitProfCommSummList(acctITDao.retrieveProfCommSumm(rapcsrParams));
		rapcsrResponse.setAcitProfCommParams(acctITDao.retrieveProfCommParams());
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
		} catch (Exception sqlex) {
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
		params.put("reopen", car.getReopen());
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
		} catch (Exception sqlex) {
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
		params.put("currCd", raasdr.getCurrCd());
		params.put("from", raasdr.getFrom());
		params.put("exclude", StringUtils.join(raasdr.getExclude(),','));
		params.put("lovParam", raasdr.getLovParam());
		params.put("page", raasdr.getPaginationRequest());
		params.put("sort", raasdr.getSortRequest());
		response.setSoaDtlList(acctITDao.retrieveAgingSoaDtl(params));
		response.setCount(acctITDao.retrieveAgingSoaDtlCount(params));
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
		params.put("allotedAmt", saipbr.getAllotedAmt());
		params.put("saveInwPolBal", saipbr.getSaveInwPolBal());
		params.put("delInwPolBal", saipbr.getDelInwPolBal());
		try{
			HashMap<String, Object> res = acctITDao.saveArInwPolBal(params);
			response.setReturnCode(Integer.parseInt(res.get("errorCode").toString()));
			/*if(saipbr.getSaveInwPolBal().size() != 0){
				response.setNewPrem(new BigDecimal(res.get("newPrem").toString()));
				response.setNewRiComm(new BigDecimal(res.get("newRiComm").toString()));
				response.setNewRiCommVat(new BigDecimal(res.get("newRiCommVat").toString()));
				response.setNewCharges(new BigDecimal(res.get("newCharges").toString()));
			}*/
			
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
		System.out.println(response.getList());
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
	public RetrieveAcitAllInvestmentIncomeResponse retrieveAcitAllInvestmentIncome(
			RetrieveAcitAllInvestmentIncomeRequest raaii) throws SQLException {	
		RetrieveAcitAllInvestmentIncomeResponse raaiiResponse = new RetrieveAcitAllInvestmentIncomeResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("tranDateFrom", raaii.getTranDateFrom());
		params.put("tranDateTo", raaii.getTranDateTo());
		params.put("tranMonth", raaii.getTranMonth());
		params.put("tranYear", raaii.getTranYear());
		params.put("tranDate", raaii.getTranDate());
		params.put("currCd", raaii.getCurrCd());
		
		raaiiResponse.setAllInvtIncomeList(acctITDao.retrieveAcitAllInvestmentIncome(params));
		logger.info("RetrieveAcitAllInvestmentIncomeResponse : " + raaiiResponse.toString());
		
		return raaiiResponse;
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
		params.put("genAcctEnt", saatdr.getGenAcctEnt());
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
	public RetrieveAcitAllInvestmentIncomeInvtIdResponse retrieveAcitAllInvestmentIncomeInvtId(
			RetrieveAcitAllInvestmentIncomeInvtIdRequest raii) throws SQLException {
		RetrieveAcitAllInvestmentIncomeInvtIdResponse raiResponse = new RetrieveAcitAllInvestmentIncomeInvtIdResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", raii.getTranId());
		raiResponse.setAllInvtIncomeList(acctITDao.retrieveAcitAllInvestmentIncomeInvtId(params));
		logger.info("RetrieveAcitAllInvestmentIncomeInvtIdResponse : " + raiResponse.toString());
		return raiResponse;
	}
	
	public RetrieveQSOAListResponse retrieveQSOAList(RetrieveQSOAListRequest rqlr) throws SQLException {
		RetrieveQSOAListResponse rqlResponse = new RetrieveQSOAListResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("qsoaId", rqlr.getQsoaId());
		params.put("cedingId", StringUtils.join(rqlr.getCedingId(),','));
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
		params.put("tranId", saprr.getTranId());
		params.put("forApproval", saprr.getForApproval());
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
		} catch (Exception sqlex) {
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
			params.put("tranType" , request.getTranType());
			params.put("updateUser" , request.getUpdateUser());
			params.put("updateDate" , request.getUpdateDate());
			HashMap<String, Object> res = acctITDao.cancelJV(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception sqlex) {
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
		rapcdrResponse.setAcitProfCommSumm(acctITDao.retrievePCSummPerCeding(rapcdrParams));
		logger.info("RetrieveAcitProfCommDtlResponse : " + rapcdrResponse.toString());
		return rapcdrResponse;
	}

	@Override
	public RetrieveAcitPrqInwPolResponse retrieveAcitPrqInwPol(RetrieveAcitPrqInwPolRequest rapipp)
			throws SQLException {
		RetrieveAcitPrqInwPolResponse rapipResponse = new RetrieveAcitPrqInwPolResponse();
		HashMap<String, Object> rapipParams = new HashMap<String, Object>();
		rapipParams.put("reqId",rapipp.getReqId());
		rapipParams.put("itemNo",rapipp.getItemNo());
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

	@SuppressWarnings("unchecked")
	@Override
	public RetrieveAcctPrqServFeeResponse retrieveAcctPrqServFee(RetrieveAcctPrqServFeeRequest rasfr)
			throws SQLException {
		RetrieveAcctPrqServFeeResponse rasfmgResponse = new RetrieveAcctPrqServFeeResponse();
		HashMap<String, Object> rasfmParams = new HashMap<String, Object>();
		rasfmParams.put("reqId", rasfr.getReqId());
		rasfmParams.put("quarter", rasfr.getQuarter());
		rasfmParams.put("year", rasfr.getYear());
		rasfmParams.put("groupId", rasfr.getGroupId());
		rasfmParams.put("servFeeAmt", rasfr.getServFeeAmt());
		rasfmParams.put("currCd", rasfr.getCurrCd());
		rasfmParams.put("currRt", rasfr.getCurrRt());
		rasfmParams.put("pwMmFrom", rasfr.getPwMmFrom());
		rasfmParams.put("pwYearFrom", rasfr.getPwYearFrom());
		rasfmParams.put("pwMmTo", rasfr.getPwMmTo());
		rasfmParams.put("pwYearTo", rasfr.getPwYearTo());
		
		if(rasfr.getRetType().equals("generate")) {
			HashMap<String, Object> res = acctITDao.validateServfee(rasfmParams);
			Integer returnCd = (Integer) res.get("return");
			
			rasfmgResponse.setMainDistList(acctITDao.retrieveAcctPrqServFeeMainGnrt(rasfmParams));
			rasfmgResponse.setSubDistList(acctITDao.retrieveAcctPrqServFeeSubGnrt(rasfmParams));
			
			if("N".equals(rasfr.getForce())) {
				switch (returnCd) {
				case 0:
					rasfmgResponse.setReturnCode(0);
					break;
				case 1:
					rasfmgResponse.setUnpostedMonthsList(acctITDao.retrieveAcctPrqServFeeMonths(rasfmParams));
					rasfmgResponse.setReturnCode(1);
					break;
				case 2:
					rasfmgResponse.setRefNo((String) res.get("refNo"));
					rasfmgResponse.setReturnCode(2);
					break;
				case 3:
					rasfmgResponse.setRefNo((String) res.get("refNo"));
					rasfmgResponse.setReturnCode(3);
					break;
				case 4:
					rasfmgResponse.setRefNo((String) res.get("refNo"));
					rasfmgResponse.setAmount((BigDecimal) res.get("amount"));
					rasfmgResponse.setReturnCode(4);
					break;
				}
			} else {
				HashMap<String, Object> cancelReq = new HashMap<String, Object>();
				
				cancelReq.put("reqId", res.get("valReqId"));
				cancelReq.put("reqStatus", "X");
				cancelReq.put("updateUser", rasfr.getUpdateUser());
				cancelReq.put("approvedBy", "");
				cancelReq.put("approvedDate", "");
				
				acctITDao.updateAcitPaytReqStat(cancelReq);
				rasfmgResponse.setReturnCode(0);
			}
		} else if(rasfr.getRetType().equals("normal")) {
			HashMap<String, Object> res = acctITDao.retrieveAcctPrqServFee(rasfmParams);
			
			rasfmgResponse.setMainDistList((List<AcctServFeeDist>) res.get("mainList"));
			rasfmgResponse.setSubDistList((List<AcctServFeeDist>) res.get("subList"));
		}
		
		return rasfmgResponse;
	}

	@Override
	public RetrieveAcitArClmRecoverLovResponse retrieveAcitArClmRecoverLov(RetrieveAcitArClmRecoverLovRequest raacrlr)
			throws SQLException {
		RetrieveAcitArClmRecoverLovResponse response = new RetrieveAcitArClmRecoverLovResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("payeeNo", raacrlr.getPayeeNo());
		params.put("currCd", raacrlr.getCurrCd());
		response.setClaimList(acctITDao.retrieveAcitArClmRecoverLov(params));
		return response;
	}


	@Override
	public SaveAcitArClmCashCallResponse saveAcitArClmCashCall(SaveAcitArClmCashCallRequest saacrr) throws SQLException {
		SaveAcitArClmCashCallResponse response = new SaveAcitArClmCashCallResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", saacrr.getTranId());
		params.put("billId", saacrr.getBillId());
		params.put("billType", saacrr.getBillType());
		params.put("totalLocalAmt", saacrr.getTotalLocalAmt());
		params.put("createUser", saacrr.getCreateUser());
		params.put("createDate", saacrr.getCreateDate());
		params.put("updateUser", saacrr.getUpdateUser());
		params.put("updateDate", saacrr.getUpdateDate());
		params.put("saveClmCashCall", saacrr.getSaveClmCashCall());
		params.put("delClmCashCall", saacrr.getDelClmCashCall());
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
	public SaveAcitAllocInvtIncomeResponse saveAcitAllocInvtIncome(SaveAcitAllocInvtIncomeRequest saaii)
			throws SQLException {
		SaveAcitAllocInvtIncomeResponse response = new SaveAcitAllocInvtIncomeResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("allocTranId", saaii.getAllocTranId());
			params.put("saveAcitAllocInvtIncome", saaii.getSaveAcitAllocInvtIncome());
			params.put("delAcitAllocInvtIncome", saaii.getDelAcitAllocInvtIncome());
			HashMap<String, Object> res = acctITDao.saveAcitAllocInvtIncome(params);
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
	public SaveAcitJVEntryListResponse saveAcitJVEntryList(SaveAcitJVEntryListRequest sajel) throws SQLException {
		SaveAcitJVEntryListResponse response = new SaveAcitJVEntryListResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("saveAcitAllocInvtIncome", sajel.getSaveAcitAllocInvtIncome());
			params.put("saveAcitJvEntryList", sajel.getSaveAcitJvEntryList());
			params.put("tranIdStr", "");
			HashMap<String, Object> res = acctITDao.saveAcitJVEntryList(params);
			response.setReturnCode((Integer) res.get("errorCode"));
			response.setTranIdOut((Integer) res.get("tranIdOut"));
			response.setTranIdStr((String) res.get("tranIdStr"));
		} catch (Exception sqlex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
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
		} catch (Exception sqlex) {
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
		response.setNegativeTrty(acctITDao.retrieveAcitJvNegTrty(params));
		return response;
	}

	@Override
	public RetrieveAcitArClmCashCallLovResponse retrieveAcitArClmCashCallLov(
			RetrieveAcitArClmCashCallLovRequest raaccclr) throws SQLException {
		RetrieveAcitArClmCashCallLovResponse response = new RetrieveAcitArClmCashCallLovResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("payeeNo", raaccclr.getPayeeNo());
		params.put("currCd", raaccclr.getCurrCd());
		response.setClmCashCallLovList(acctITDao.retrieveAcitArClmCashCallLov(params));
		return response;
	}

	@Override
	public SaveAcitArClmRecoverResponse saveAcitArClmRecover(SaveAcitArClmRecoverRequest saacccr)
			throws SQLException {
		SaveAcitArClmRecoverResponse response = new SaveAcitArClmRecoverResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", saacccr.getTranId());
		params.put("billId", saacccr.getBillId());
		params.put("billType", saacccr.getBillType());
		params.put("totalLocalAmt", saacccr.getTotalLocalAmt());
		params.put("createUser", saacccr.getCreateUser());
		params.put("createDate", saacccr.getCreateDate());
		params.put("updateUser", saacccr.getUpdateUser());
		params.put("updateDate", saacccr.getUpdateDate());
		params.put("saveClmRecover", saacccr.getSaveClmRecover());
		params.put("delClmRecover", saacccr.getDelClmRecover());
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
	public SaveAcitJvNegTrtyResponse saveAcitJvNegTrty(SaveAcitJvNegTrtyRequest request) throws SQLException {
		SaveAcitJvNegTrtyResponse response = new SaveAcitJvNegTrtyResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("tranType", request.getTranType());
			params.put("tranId", request.getTranId());
			params.put("saveNegTrty", request.getSaveNegTrty());
			params.put("deleteNegTrty", request.getDeleteNegTrty());
			params.put("saveClmOffset", request.getSaveClmOffset());
			params.put("deleteClmOffset", request.getDeleteClmOffset());
			HashMap<String, Object> res = acctITDao.saveAcitJvNegTrty(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception sqlex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception", "Please check field values."));
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

	@Override
	public RetrieveAcitJVAcctTrtyBalResponse retrieveAcitJvAcctTrtyBal(RetrieveAcitJVAcctTrtyBalRequest request)
			throws SQLException {
		RetrieveAcitJVAcctTrtyBalResponse response = new RetrieveAcitJVAcctTrtyBalResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", request.getTranId());
		response.setAcctTreatyBal(acctITDao.retrieveAcitJvAcctTrtyBal(params));
		return response;
	}


	@Override
	public RetrieveAcitUPRParamsResponse retrieveAcitUPRParams() throws SQLException {
		RetrieveAcitUPRParamsResponse response = new RetrieveAcitUPRParamsResponse();
		response.setParams(acctITDao.retrieveAcitUPRParams());
		return response;
	}

	@Override
	public SaveAcitJVAcctTrtyBalResponse saveAcitJvActTrtyBal(SaveAcitJVAcctTrtyBalRequest request)
			throws SQLException {
		SaveAcitJVAcctTrtyBalResponse response = new SaveAcitJVAcctTrtyBalResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("tranType", request.getTranType());
			params.put("tranId", request.getTranId());
			params.put("saveAcctTrty", request.getSaveAcctTrty());
			params.put("delAcctTrty", request.getDelAcctTrty());
			params.put("saveInwPolOffset", request.getSaveInwPolOffset());
			params.put("delInwPolOffset", request.getDelInwPolOffset());
			HashMap<String, Object> res = acctITDao.saveAcitJvActTrtyBal(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception sqlex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		}
		return response;
	}


	@Override
	public String retrieveAcitExistingUPR(GenerateUPRRequest guprr) throws SQLException {
		String response = new String();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("extMm",guprr.getExtMm());
		params.put("extYear",guprr.getExtYear());
		params.put("extMethod",guprr.getExtMethod());
		response = acctITDao.retrieveAcitExistingUPR(params);
		return response;
	}

	@Override
	public RetrieveAcitJVDefNameResponse retrieveAcitJvDefName(RetrieveAcitJvDefNameRequest request)
			throws SQLException {
		RetrieveAcitJVDefNameResponse response = new RetrieveAcitJVDefNameResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("userId", request.getUserId());
		response.setEmployee(acctITDao.retrieveJVDefName(params));
		return response;
	}


	@Override
	public RetrieveAcitJVAllocInvtIncResponse retrieveAcitJVAllocInvtInc(RetrieveAcitJVAllocInvtIncRequest rajaii)
			throws SQLException {
		RetrieveAcitJVAllocInvtIncResponse response = new RetrieveAcitJVAllocInvtIncResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("allocTranId", rajaii.getAllocTranId());
		response.setAllInvtIncomeList(acctITDao.retrieveAcitJvAllInvtIncome(params));
		return response;
	}
	
	
	@Override	
	public SaveAcctPrqServFeeResponse saveAcctPrqServFee(SaveAcctPrqServFeeRequest sapsfr) throws SQLException {
		SaveAcctPrqServFeeResponse response = new SaveAcctPrqServFeeResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("reqId", sapsfr.getReqId());
		params.put("quarter", sapsfr.getQuarter());
		params.put("year", sapsfr.getYear());
		params.put("servFeeAmt", sapsfr.getServFeeAmt());
		params.put("netServFee", sapsfr.getNetServFee());
		params.put("currCd", sapsfr.getCurrCd());
		params.put("currRt", sapsfr.getCurrRt());
		params.put("createUser", sapsfr.getCreateUser());
		params.put("createDate", sapsfr.getCreateDate());
		params.put("updateUser", sapsfr.getUpdateUser());
		params.put("updateDate", sapsfr.getUpdateDate());
		params.put("pwMmFrom", sapsfr.getPwMmFrom());
		params.put("pwYearFrom", sapsfr.getPwYearFrom());
		params.put("pwMmTo", sapsfr.getPwMmTo());
		params.put("pwYearTo", sapsfr.getPwYearTo());
		params.put("saveAcctServFeeCedantList", sapsfr.getSaveAcctServFeeCedantList());
		
		try {
			response.setReturnCode(acctITDao.saveAcctPrqServFee(params));
			response.setReturnCode(-1);
			
			/*Boolean proceed = false;
			HashMap<String, Object> res = acctITDao.validateServfee(params);
			Integer returnCd = (Integer) res.get("return");
			
			if("N".equals(sapsfr.getForce())) {
				switch (returnCd) {
				case 0:
					proceed = true;
					break;
				case 1:
					proceed = false;
					// retrieve list of unposted months
					response.setReturnCode(1);
					break;
				case 2:
					proceed = false;
					response.setRefNo((String) res.get("refNo"));
					response.setReturnCode(2);
					break;
				case 3:
					proceed = false;
					response.setRefNo((String) res.get("refNo"));
					response.setReturnCode(3);
					break;
				case 4:
					proceed = false;
					response.setRefNo((String) res.get("refNo"));
					response.setAmount((BigDecimal) res.get("amount"));
					response.setReturnCode(4);
					break;
				}
			} else {
				HashMap<String, Object> cancelReq = new HashMap<String, Object>();
				
				cancelReq.put("reqId", res.get("valReqId"));
				cancelReq.put("reqStatus", "X");
				cancelReq.put("updateUser", sapsfr.getUpdateUser());
				cancelReq.put("approvedBy", "");
				cancelReq.put("approvedDate", "");
				
				acctITDao.updateAcitPaytReqStat(cancelReq);
				proceed = true;
			}
			
			if(proceed) {
				response.setReturnCode(acctITDao.saveAcctPrqServFee(params));
				response.setReturnCode(-1);
			}*/
		} catch (Exception e) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			e.printStackTrace();
		}
		
		return response;
	}

	@Override
	public RetrieveAcitJVRcvblsAgnstLosResponse retrieveAcitJVRcvblsAgnstLosses(
			RetrieveAcitJVRcvblsAgnstLosRequest request) throws SQLException {
		RetrieveAcitJVRcvblsAgnstLosResponse response = new RetrieveAcitJVRcvblsAgnstLosResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", request.getTranId());
		response.setReceivables(acctITDao.retrieveAcitJVRcvblsAgnstLosses(params));
		return response;
	}
	
	@Override
	public RetrieveAcitCvResponse retrieveAcitCv(RetrieveAcitCvRequest raptp) throws SQLException {
		RetrieveAcitCvResponse racResponse = new RetrieveAcitCvResponse();
		HashMap<String, Object> racParams = new HashMap<String, Object>();
		racParams.put("tranId",raptp.getTranId());
		racParams.put("cvGenNo",raptp.getCvGenNo());
		racParams.put("cvDateFrom",raptp.getCvDateFrom());
		racParams.put("cvDateTo",raptp.getCvDateTo());
		racParams.put("cvStatusDesc",raptp.getCvStatusDesc());
		racParams.put("payee",raptp.getPayee());
		racParams.put("particulars",raptp.getParticulars());
		racParams.put("cvAmtFrom",raptp.getCvAmtFrom());
		racParams.put("cvAmtTo",raptp.getCvAmtTo());
		racParams.put("tranStat",raptp.getTranStat());
		racParams.put("cvStat",raptp.getCvStat());
		racResponse.setAcitCvList(acctITDao.retrieveAcitCv(racParams));
		logger.info("RetrieveAcitCvResponse : " + racResponse);
		return racResponse;
	}


	@Override
	public UpdateAcitStatusResponse updateAcitStatus(UpdateAcitStatusRequest uasr) throws SQLException {
		UpdateAcitStatusResponse response = new UpdateAcitStatusResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("updateAcitStatusList", uasr.getUpdateAcitStatusList());
		
		List<String> res = new ArrayList<String>();
		HashMap<String, Object> prm = new HashMap<String, Object>();
		
		for(int i=0; i < uasr.getUpdateAcitStatusList().size();i++) {
			prm.put("indiv", uasr.getUpdateAcitStatusList().get(i));
			res.add(acctITDao.validateTranAcctEntDate(prm));
		}
		
		boolean stop = false;
		for(String i : res) {
			if(i != null) {
				stop = true;
				break;
			}
		}
		
		if(stop) {
			response.setReturnCode(0);
			response.setInvalidTranNos(res);
		}else {
			response.setReturnCode(acctITDao.updateAcitStatus(params));
			response.setReturnCode(-1);
		}
		
		return response;
	}
	
	@Override
	public SaveAcitJVRcvblsAgnstLosResponse saveAcitJvRcvblsAgnstLoss(SaveAcitJVRcvblsAgnstLosRequest request)
			throws SQLException {
		SaveAcitJVRcvblsAgnstLosResponse response = new SaveAcitJVRcvblsAgnstLosResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("tranId", request.getTranId());
			params.put("tranType", request.getTranType());
			params.put("saveClmOffset", request.getSaveClmOffset());
			params.put("delClmOffset", request.getDelClmOffset());
			params.put("saveInwPol", request.getSaveInwPol());
			params.put("delInwPol", request.getDelInwPol());
			HashMap<String, Object> res = acctITDao.saveAcitJvRcvblsAgnstLoss(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception sqlex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		}
		return response;
	}

	@Override
	public PrintArResponse printAr(PrintArRequest par) throws SQLException {
		PrintArResponse response = new PrintArResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", par.getTranId());
		params.put("arNo", par.getArNo());
		params.put("updateUser", par.getUpdateUser());
		params.put("updateDate", par.getUpdateDate());
		try{
			response.setReturnCode(acctITDao.printAr(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception", "Please check field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveAcitClmResHistPaytResponse retrieveAcitClmResHistPayts(RetrieveAcitClmResHistPaytRequest request)
			throws SQLException {
		RetrieveAcitClmResHistPaytResponse response = new RetrieveAcitClmResHistPaytResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("cedingId",request.getCedingId());
		params.put("payeeNo",request.getPayeeNo());
		params.put("currCd",request.getCurrCd());
		response.setClmpayments(acctITDao.retrieveAcitClmResHistPayts(params));
		return response;
	}

	@Override
	public SaveAcitCvResponse saveAcitCv(SaveAcitCvRequest sacr) throws SQLException {
		SaveAcitCvResponse sacResponse = new SaveAcitCvResponse();
		HashMap<String, Object> sacParams = new HashMap<String, Object>();
		try {
			sacParams.put("tranIdOut","");
			sacParams.put("mainTranIdOut","");
			sacParams.put("tranId",sacr.getTranId());
	        sacParams.put("cvYear", sacr.getCvYear());
	        sacParams.put("checkId", sacr.getCheckId());
	        sacParams.put("cvNo", sacr.getCvNo());
	        sacParams.put("cvDate", sacr.getCvDate());
	        sacParams.put("cvStatus", sacr.getCvStatus());
	        sacParams.put("paytReqType", sacr.getPaytReqType());
	        sacParams.put("payeeClassCd", sacr.getPayeeClassCd());
	        sacParams.put("payeeCd", sacr.getPayeeCd());
	        sacParams.put("payee", sacr.getPayee());
	        sacParams.put("particulars", sacr.getParticulars());
	        sacParams.put("bank", sacr.getBank());
	        sacParams.put("bankAcct", sacr.getBankAcct());
	        sacParams.put("checkNo", sacr.getCheckNo());
	        sacParams.put("checkDate", sacr.getCheckDate());
	        sacParams.put("checkClass", sacr.getCheckClass());
	        sacParams.put("currCd", sacr.getCurrCd());
	        sacParams.put("currRate", sacr.getCurrRate());
	        sacParams.put("cvAmt", sacr.getCvAmt());
	        sacParams.put("localAmt", sacr.getLocalAmt());
	        sacParams.put("preparedBy", sacr.getPreparedBy());
	        sacParams.put("preparedDate", sacr.getPreparedDate());
	        sacParams.put("certifiedBy", sacr.getCertifiedBy());
	        sacParams.put("certifiedDate", sacr.getCertifiedDate());
	        sacParams.put("createUser", sacr.getCreateUser());
	        sacParams.put("createDate", sacr.getCreateDate());
	        sacParams.put("updateUser", sacr.getUpdateUser());
	        sacParams.put("updateDate", sacr.getUpdateDate());
	        sacParams.put("mainTranId", sacr.getMainTranId());
	        sacParams.put("tranStat", sacr.getTranStat());
	        sacParams.put("closeDate", sacr.getCloseDate());
	        sacParams.put("deleteDate", sacr.getDeleteDate());
	        sacParams.put("postDate", sacr.getPostDate());
	        sacParams.put("disbType", sacr.getDisbType());
	        sacParams.put("destBank", sacr.getDestBank());
	        sacParams.put("destAcctNo", sacr.getDestAcctNo());
	        sacParams.put("destAcctName", sacr.getDestAcctName());
	        sacParams.put("btRefNo", sacr.getBtRefNo());
	        sacParams.put("swiftCd", sacr.getSwiftCd());

	        String checkNo = acctITDao.validateCheckNo(sacParams);	   
	        String isCvNoAvail =  acctITDao.isCvNoAvail();

	        if(isCvNoAvail.equalsIgnoreCase("N") && sacr.getTranId() == null) {
	        	sacResponse.setReturnCode(-300);
	        }else if(checkNo.equalsIgnoreCase("-100") && sacr.getDisbType().equals("CK")) {
	        	sacResponse.setReturnCode(-100);
	        }else if(checkNo.equalsIgnoreCase(sacr.getCheckNo()) || sacr.getDisbType().equals("BT")) {
	        	sacResponse.setReturnCode(Integer.parseInt(checkNo));
	        	HashMap<String, Object> response = acctITDao.saveAcitCv(sacParams);
		        sacResponse.setReturnCode((Integer) response.get("errorCode"));
		        sacResponse.setTranIdOut((Integer) response.get("tranIdOut"));
		        sacResponse.setMainTranIdOut((Integer) response.get("mainTranIdOut"));
		        sacResponse.setReturnCode(-1);
	        } else if(sacr.getDisbType().equals("CK")) {
	        	sacResponse.setReturnCode(2);
	        	sacResponse.setCheckNo(checkNo);
	        }
		} catch (SQLException sqlex) {
			sacResponse.setReturnCode(0);
			sacResponse.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		} catch (Exception ex) {
			sacResponse.setReturnCode(0);
			sacResponse.getErrorList().add(new Error("General Exception","Unable to proceed to saving. Check fields."));
			ex.printStackTrace();
		}
		return sacResponse;
	}

	@Override
	public SaveAcitClmResHistPaytsResponse saveAcitClmResHistPayts(SaveAcitClmResHistPaytsRequest request)
			throws SQLException {
		SaveAcitClmResHistPaytsResponse response = new SaveAcitClmResHistPaytsResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("saveResHistPayments", request.getSaveResHistPayments());
			params.put("delResHistPayments", request.getDelResHistPayments());
			HashMap<String, Object> res = acctITDao.saveAcitClmResHistPayts(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		} catch (SQLException sqlex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		}
		return response;
	}

	@Override
	public SaveAcitCvPaytReqListResponse saveAcitCvPaytReqList(SaveAcitCvPaytReqListRequest sacprr)
			throws SQLException {
		SaveAcitCvPaytReqListResponse response = new SaveAcitCvPaytReqListResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("savePaytReqList", sacprr.getSavePaytReqList());
		params.put("deletePaytReqList", sacprr.getDeletePaytReqList());
		
		try {
			response.setReturnCode(acctITDao.saveAcitCvPaytReqList(params));
		} catch (Exception e) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Unable to proceed to saving. Check fields."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public ApproveJVResponse approveJV(ApproveJVRequest request) throws SQLException {
		ApproveJVResponse response = new ApproveJVResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("tranId", request.getTranId());
			params.put("jvNo", request.getJvNo());
			params.put("jvYear", request.getJvYear());
			params.put("approvedBy", request.getApprovedBy());
			params.put("approvedDate", request.getApprovedDate());
			params.put("updateUser", request.getUpdateUser());
			params.put("updateDate", request.getUpdateDate());
			HashMap<String, Object> res = acctITDao.approveJV(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		} catch (SQLException sqlex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		}
		return response;
	}


	@Override
	public RetrieveAcitAttachmentsResponse retrieveAcitAttachments(RetrieveAcitAttachmentsRequest raar)
			throws SQLException {
		RetrieveAcitAttachmentsResponse response = new RetrieveAcitAttachmentsResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", raar.getTranId());
		response.setAcitAttachmentsList(acctITDao.retrieveAcitAttachments(params));
		return response;
	}
	
	@Override
	public RetrieveAcitJVInvPullOutResponse retrieveAcitJVInvPullOut(RetrieveAcitJvInvPullOutRequest request)
			throws SQLException {
		RetrieveAcitJVInvPullOutResponse response = new RetrieveAcitJVInvPullOutResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId",request.getTranId());
		params.put("bankCd",request.getBankCd());
		params.put("accountNo",request.getAccountNo());
		response.setPullOut(acctITDao.retrieveAcitJVInvPullOut(params));
		return response;
	}


	@Override
	public SaveAcitJVInvPullOutResponse saveAcitJVInvPullOut(SaveAcitJVInvPullOutRequest request) throws SQLException {
		SaveAcitJVInvPullOutResponse response = new SaveAcitJVInvPullOutResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("tranId", request.getTranId());
			params.put("tranType", request.getTranType());
			params.put("saveInvPullOut", request.getSaveInvPullOut());
			params.put("delInvPullOut", request.getDelInvPullOut());
			HashMap<String, Object> res = acctITDao.saveAcitJVInvPullOut(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception sqlex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		}
		return response;
	}
	
	
	@Override
	public RetrieveAcitJVInvtRollOverResponse retrieveAcitJVInvRollOver(RetrieveAcitJVInvtRollOverRequest request)
			throws SQLException {
		RetrieveAcitJVInvtRollOverResponse response = new RetrieveAcitJVInvtRollOverResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId",request.getTranId());
		response.setInvtRollOver(acctITDao.retrieveAcitJVInvRollOver(params));
		return response;
	}


	@Override
	public SaveAcitAttachmentsResponse saveAcitAttachments(SaveAcitAttachmentsRequest saar) throws SQLException {
		SaveAcitAttachmentsResponse response = new SaveAcitAttachmentsResponse();
		try{
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("saveAttachmentsList", saar.getSaveAttachmentsList());
			params.put("delAttachmentsList", saar.getDelAttachmentsList());
			
			HashMap<String, Object> res = acctITDao.saveAcitAttachments(params);
			response.setReturnCode((Integer) res.get("errorCode"));
			response.setUploadDate((String) res.get("uploadDate"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException", "An error has occured. Please check your field values."));
			ex.printStackTrace();
		}
		return response;
	}
	
	@Override
	public UpdateAcitCvStatResponse updateAcitCvStat(UpdateAcitCvStatRequest uacsr) throws SQLException {
		UpdateAcitCvStatResponse uacsResponse = new UpdateAcitCvStatResponse();
		HashMap<String, Object> uacsParams = new HashMap<String, Object>();
		try {
			uacsParams.put("tranId", uacsr.getTranId());
			uacsParams.put("checkId", uacsr.getCheckId());
			uacsParams.put("cvStatus", uacsr.getCvStatus());
			uacsParams.put("printType", uacsr.getPrintType());
			uacsParams.put("updateUser", uacsr.getUpdateUser());
			uacsParams.put("cancelReason", uacsr.getCancelReason());
			
			HashMap<String, Object> response = acctITDao.updateAcitCvStat(uacsParams);
			
			uacsResponse.setReturnCode((Integer) response.get("errorCode"));
		} catch (SQLException sqlex) {
			uacsResponse.setReturnCode(0);
			uacsResponse.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		} catch (Exception ex) {
			uacsResponse.setReturnCode(0);
			uacsResponse.getErrorList().add(new Error("General Exception","Unable to proceed to saving. Check fields."));
			ex.printStackTrace();
		}
		return uacsResponse;
		
	}

	@Override
	public SaveAcitJVInvRollOverResponse saveAcitJVInvRollOver(SaveAcitJVInvRollOverRequest request)
			throws SQLException {
		SaveAcitJVInvRollOverResponse response = new SaveAcitJVInvRollOverResponse();
		try {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("tranId", request.getTranId());
			params.put("tranType", request.getTranType());
			params.put("saveRollOver", request.getSaveRollOver());
			params.put("delRollOver", request.getDelRollOver());
			HashMap<String, Object> res = acctITDao.saveAcitJVInvRollOver(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception sqlex) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveAcitSOAAgingZeroResponse retrieveSoaAgingZeroLOV(RetrieveAcitSOAAgingZeroRequest request)
			throws SQLException {
		RetrieveAcitSOAAgingZeroResponse response = new RetrieveAcitSOAAgingZeroResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyId",request.getPolicyId());
		params.put("instNo",request.getInstNo());
		params.put("cedingId",request.getCedingId());
		params.put("payeeNo",request.getPayeeNo());
		params.put("currCd",request.getCurrCd());
		response.setSoaDtlList(acctITDao.retrieveSoaAgingZeroLOV(params));
		return response;
	}


	@Override
	public RetrieveAcitJvQrtrPremResResponse retrieveQuarterPremRes(RetrieveAcitJvQrtrPremResRequest request)
			throws SQLException {
		RetrieveAcitJvQrtrPremResResponse response = new RetrieveAcitJvQrtrPremResResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("cedingId",request.getCedingId());
		params.put("quarterEnd",request.getQuarterEnd());
		params.put("currCd",request.getCurrCd());
		response.setPremRes(acctITDao.retrieveQuarterPremRes(params));
		return response;
	}


	@Override
	public RetrieveAcitSoaZeroAltResponse retrieveSoaAgingZeroAltLOV(RetrieveAcitSoaZeroAltRequest request)
			throws SQLException {
		RetrieveAcitSoaZeroAltResponse response = new RetrieveAcitSoaZeroAltResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("policyId",request.getPolicyId());
		response.setSoaDtlList(acctITDao.retrieveSoaAgingZeroAltLOV(params));
		return response;
	}


	@Override
	public RetrieveAcitAmortizeResponse retrieveAcitAmortize(RetrieveAcitAmortizeRequest raar) throws SQLException {
		RetrieveAcitAmortizeResponse raaResponse = new RetrieveAcitAmortizeResponse();
		HashMap<String, Object> raaParams = new HashMap<String, Object>();
		raaParams.put("invtId",raar.getInvtId());
		raaResponse.setAcitAmortizeList(acctITDao.retrieveAcitAmortize(raaParams));
		logger.info("RetrieveAcitAmortizeResponse : " + raaResponse);
		return raaResponse;
		
	}


	@Override
	public SaveAcitJVTrtyInvtResponse saveAcitJVTrtyInvt(SaveAcitJVTrtyInvtRequest request) throws SQLException {
		SaveAcitJVTrtyInvtResponse response = new SaveAcitJVTrtyInvtResponse();
		try{
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("tranId", request.getTranId());
			params.put("tranType", request.getTranType());
			params.put("saveaccTrty", request.getSaveaccTrty());
			params.put("delaccTrty", request.getDelaccTrty());
			params.put("saveTrtyInvt", request.getSaveTrtyInvt());
			params.put("delTrtyInvt", request.getDelTrtyInvt());
			HashMap<String, Object> res = acctITDao.saveAcitJVTrtyInvt(params);
			response.setReturnCode((Integer)res.get("errorCode"));
		}catch(Exception exception){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			exception.printStackTrace();
		}
		return response;
	}


	@Override
	public RetrieveAcitJvInvmtOffsetResponse retrieveAcitJvInvmtOffset(RetrieveAcitJvInvmtOffsetRequest request)
			throws SQLException {
		RetrieveAcitJvInvmtOffsetResponse response = new RetrieveAcitJvInvmtOffsetResponse();
		HashMap<String, Object> params =  new HashMap<String, Object>();
		params.put("tranId", request.getTranId());
		response.setAcctTreatyBal(acctITDao.retrieveAcitJvInvmtOffset(params));
		return response;
	}


	@Override
	public RetrieveAcitJvInvPlacementResponse retrieveAcitJvInvPlacement(RetrieveAcitJvInvPlacementRequest request)
			throws SQLException {
		RetrieveAcitJvInvPlacementResponse response = new RetrieveAcitJvInvPlacementResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", request.getTranId());
		response.setInvPlacement(acctITDao.retrieveAcitJvInvPlacement(params));
		return response;
	}


	@Override
	public SaveAcitJVInvPlacementResponse saveAcitJVInvPlacement(SaveAcitJVInvPlacementRequest request)
			throws SQLException {
		SaveAcitJVInvPlacementResponse response = new SaveAcitJVInvPlacementResponse();
		try{
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("tranId", request.getTranId());
			params.put("tranType", request.getTranType());
			params.put("saveInvPlacement", request.getSaveInvPlacement());
			params.put("delInvPlacement", request.getDelInvPlacement());
			HashMap<String, Object> res = acctITDao.saveAcitJVInvPlacement(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception exception){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			exception.printStackTrace();
		}
		return response;
	}


	@Override
	public RetrieveAcitSOADueResponse retrieveAcitSoaDue(RetrieveAcitSOADueRequest request) throws SQLException {
		RetrieveAcitSOADueResponse response = new RetrieveAcitSOADueResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("policyId", request.getPolicyId());
		params.put("instNo", request.getInstNo());
		params.put("cedingId", request.getCedingId());
		params.put("currCd", request.getCurrCd());
		response.setSoaDtlList(acctITDao.retrieveAcitSoaDue(params));
		return response;
	}

	@Override
	public RetrieveAcitInwPolPaytsResponse retrieveAcitInwPolPayts(RetrieveAcitInwPolPaytsRequest raar)
			throws SQLException {
		RetrieveAcitInwPolPaytsResponse response = new RetrieveAcitInwPolPaytsResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("policyId",raar.getPolicyId());
		params.put("policyNo",raar.getPolicyNo());
		response.setList(acctITDao.retrieveAcitInwPolPayts(params));
		return response;
	}
	
	@Override
	public RetrieveAcitCancelTransactionResponse retrieveCancelledTrans(RetrieveAcitCancelTransactionRequest request)
			throws SQLException {
		RetrieveAcitCancelTransactionResponse response = new RetrieveAcitCancelTransactionResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("tranId", request.getTranId());
		params.put("tranClass", request.getTranClass());
		params.put("cancelFrom", request.getCancelFrom());
		params.put("cancelTo", request.getCancelTo());
		response.setCancelledTran(acctITDao.retrieveCancelledTrans(params));
		return response;
	}
	
	@Override
	public SaveAcitMonthEndBatchProdResponse saveAcitMonthEndBatchProd(SaveAcitMonthEndBatchProdRequest samebr)
			throws SQLException {
		SaveAcitMonthEndBatchProdResponse res = new SaveAcitMonthEndBatchProdResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		HashMap<String,Object> validate = new HashMap<String,Object>();
		String procedureName = "";
		Boolean proceed = false;
		String prodReport = "";
		
		params.put("eomDate", samebr.getEomDate());
		params.put("eomUser", samebr.getEomUser());
		params.put("process", "PR");
		
		try {
			if("N".equals(samebr.getForce())) {
				validate = acctITDao.validateEomStat(params);
				
				switch ((String) validate.get("option")) {
				case "N":
					proceed = true;
					break;
				case "Y":
					proceed = false;
					res.setEomMessage((String) validate.get("message"));
					res.setReturnCode(1);
					break;
				case "D":
					proceed = false;
					res.setEomMessage((String) validate.get("message"));
					res.setReturnCode(2);
					break;
				default:
					break;
				}
			} else {
				proceed = true;
			}
			
			if(proceed) {
				prodReport = "Initializing . . .";
				wsController.onReceiveProdLog("Initializing . . .");
				
				if("Y".equals(samebr.getForce())) {
					acctITDao.acitEomUpdateAcctEntDateNull(params);
				}
				
				prodReport += "\nExtracting Inward Production . . .";
				prodReport += "\nExtraction of Inward Production finished.";
				
				procedureName = "Extracting Inward Production";
				wsController.onReceiveProdLog("Extracting Inward Production . . .");
				acctITDao.acitEomExtUwprod(params);
				wsController.onReceiveProdLog("Extraction of Inward Production finished.");
				
				prodReport += "\nGenerating Accounting Entries for Inward Production . . .";
				prodReport += "\nGeneration of Accounting Entries for Inward Production finished.";
				
				procedureName = "Generating Accounting Entries for distribution of Premiums";
				wsController.onReceiveProdLog("Generating Accounting Entries for Inward Production . . .");
				acctITDao.acitEomCreateNetPremJv(params);
				wsController.onReceiveProdLog("Generation of Accounting Entries for Inward Production finished.");
				
				prodReport += "\nExtracting Premium Reserve Retained . . .";
				prodReport += "\nExtraction of Premium Reserve Retained finished.";
				
				procedureName = "Extracting Premium Reserve Retained";
				wsController.onReceiveProdLog("Extracting Premium Reserve Retained . . .");
				acctITDao.acitEomExtEomUpr(params);
				wsController.onReceiveProdLog("Extraction of Premium Reserve Retained finished.");
				
				prodReport += "\nDistributing Inward Production . . .";
				prodReport += "\nDistribution of Inward production finished.";
				
				procedureName = "Distributing Inward Production";
				wsController.onReceiveProdLog("Distributing Inward Production . . .");
				acctITDao.acitEomCreateUprJv(params);
				wsController.onReceiveProdLog("Distribution of Inward production finished.");
				
				prodReport += "\nComputing Interest on Overdue Accounts . . .";
				prodReport += "\nComputation of Interest on Overdue Accounts finished.";
				
				procedureName = "Computing Interest on Overdue Accounts";
				wsController.onReceiveProdLog("Computing Interest on Overdue Accounts . . .");
				acctITDao.acitEomSaveOdInt(params);
				wsController.onReceiveProdLog("Computation of Interest on Overdue Accounts finished.");
				
				prodReport += "\nCreating Loss Reserve Deposit . . .";
				prodReport += "\nCreation of Loss Reserve Deposit finished.";
				
				procedureName = "Creating Loss Reserve Deposit";
				wsController.onReceiveProdLog("Creating Loss Reserve Deposit . . .");
				acctITDao.acitEomCreateLossResDepJv(params);
				wsController.onReceiveProdLog("Creation of Loss Reserve Deposit finished.");
				wsController.onReceiveProdLog("");
				
				acctITDao.acitEomUpdateEomCloseTag(params);
				acctITDao.acitEomUpdateAcctEntDate(params);
				
				procedureName = "Producing Summary Report";
				String summary = acctITDao.acitEomProdSummaryReport(params);
				
				prodReport += "\n\n" + summary;
				wsController.onReceiveProdLog(summary);
								
				params.put("report", prodReport);
				acctITDao.acitEomUpdateReport(params);
				
				acctITDao.commit();
				res.setReturnCode(-1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			acctITDao.rollback();
			acctITDao.acitEomUpdateAcctEntDateNull(params);
			wsController.onReceiveProdLog("An error occured while " + procedureName);
			res.setReturnCode(0);
			res.getErrorList().add(new Error("SQLException","Batch processing failed."));
		}
		
		return res;
	}
	
	@Override
	public SaveAcitMonthEndBatchOSResponse saveAcitMonthEndBatchOS(SaveAcitMonthEndBatchOSRequest samebr)
			throws SQLException {
		SaveAcitMonthEndBatchOSResponse res = new SaveAcitMonthEndBatchOSResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		HashMap<String,Object> validate = new HashMap<String,Object>();
		String procedureName = "";
		Boolean proceed = false;
		String osReport = "";
		
		params.put("eomDate", samebr.getEomDate());
		params.put("eomUser", samebr.getEomUser());
		params.put("process", "OS");
		
		try {
			if("N".equals(samebr.getForce())) {
				validate = acctITDao.validateEomStat(params);
				
				switch ((String) validate.get("option")) {
				case "N":
					proceed = true;
					break;
				case "Y":
					proceed = false;
					res.setEomMessage((String) validate.get("message"));
					res.setReturnCode(1);
					break;
				case "D":
					proceed = false;
					res.setEomMessage((String) validate.get("message"));
					res.setReturnCode(2);
					break;
				default:
					break;
				}
			} else {
				proceed = true;
			}
			
			if(proceed) {
				osReport = "Initializing . . .";
				wsController.onReceiveOsLog("Initializing . . .");
				
				if("Y".equals(samebr.getForce())) {
					acctITDao.acitEomUpdateAcctEntDateNull(params);
				}
				
				osReport += "\nExtracting Outstanding Losses . . .";
				osReport += "\nExtraction of Outstanding Losses finished.";
				
				procedureName = "Extracting Outstanding Losses";
				wsController.onReceiveOsLog("Extracting Outstanding Losses . . .");
				acctITDao.acitEomExtOsLoss(params);
				wsController.onReceiveOsLog("Extraction of Outstanding Losses finished.");
				
				osReport += "\nGenerating Accounting Entries for Outstanding Losses . . .";
				osReport += "\nGeneration of Accounting Entries for Outstanding Losses finished.";
				
				procedureName = "Generating Accounting Entries for Outstanding Losses";
				wsController.onReceiveOsLog("Generating Accounting Entries for Outstanding Losses . . .");
				acctITDao.acitEomCreateOsLossJv(params);
				wsController.onReceiveOsLog("Generation of Accounting Entries for Outstanding Losses finished.");
				
				osReport += "\nAllocating Paid Claims . . .";
				osReport += "\nAllocation of Paid Claims finished.";
				
				procedureName = "Allocating Paid Claims";
				wsController.onReceiveOsLog("Allocating Paid Claims . . .");
				acctITDao.acitEomExtClmpayt(params);
				wsController.onReceiveOsLog("Allocation of Paid Claims finished.");
				
				osReport += "\nGenerating Accounting Entries for Allocation of Paid Claims . . .";
				osReport += "\nGeneration of Accounting Entries for Allocation of Paid Claims finished.";
				
				procedureName = "Generating Accounting Entries for Allocation of Paid Claims";
				wsController.onReceiveOsLog("Generating Accounting Entries for Allocation of Paid Claims . . .");
				acctITDao.acitEomCreateAllocPaidClmJv(params);
				wsController.onReceiveOsLog("Generation of Accounting Entries for Allocation of Paid Claims finished.");
				
				osReport += "\nAllocating Claim Recovery and Overpayments . . .";
				osReport += "\nAllocation of Claim Recovery and Overpayments finished.";
				
				procedureName = "Allocating Claim Recovery and Overpayments";
				wsController.onReceiveOsLog("Allocating Claim Recovery and Overpayments . . .");
				acctITDao.acitEomExtractClmRecover(params);
				wsController.onReceiveOsLog("Allocation of Claim Recovery and Overpayments finished.");
				
				osReport += "\nGenerating Accounting Entries for Allocation of Claim Recovery and Overpayments . . .";
				osReport += "\nGeneration of Accounting Entries for Allocation of Claim Recovery and Overpayments finished.";
				
				procedureName = "Generating Accounting Entries for Allocation of Claim Recovery and Overpayments";
				wsController.onReceiveOsLog("Generating Accounting Entries for Allocation of Claim Recovery and Overpayments . . .");
				acctITDao.acitEomCreateAllocRecoverJv(params);
				wsController.onReceiveOsLog("Generation of Accounting Entries for Allocation of Claim Recovery and Overpayments finished.");
				wsController.onReceiveOsLog("");
				
				acctITDao.acitEomUpdateEomCloseTag(params);
				acctITDao.acitEomUpdateAcctEntDate(params);
				
				procedureName = "Producing Summary Report";
				String summary = acctITDao.acitEomBatchOsSummaryReport(params);
				
				osReport += "\n\n" + summary;
				wsController.onReceiveOsLog(summary);
								
				params.put("report", osReport);
				acctITDao.acitEomUpdateReport(params);
				
				acctITDao.commit();
				res.setReturnCode(-1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			acctITDao.rollback();
			acctITDao.acitEomUpdateAcctEntDateNull(params);
			wsController.onReceiveOsLog("An error occured while " + procedureName);
			res.setReturnCode(0);
			res.getErrorList().add(new Error("SQLException","Batch OS failed."));
		}
		
		return res;
	}


	@Override
	public SaveAcitMonthEndTrialBalResponse saveAcitMonthEndTrialBal(SaveAcitMonthEndTrialBalRequest sametbr)
			throws SQLException {
		SaveAcitMonthEndTrialBalResponse res = new SaveAcitMonthEndTrialBalResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		String validate = "";
		Boolean proceed = false;
		
		params.put("eomDate", sametbr.getEomDate());
		params.put("eomUser", sametbr.getEomUser());
		params.put("includeMonth", sametbr.getIncludeMonth());
		params.put("includeYear", sametbr.getIncludeYear());
		params.put("aeTag", sametbr.getAeTag());
		
		try {
			if("N".equals(sametbr.getForce())) {
				validate = acctITDao.validateTbDate(params);
				
				switch (validate) {
				case "PROCEED":
					proceed = true;
					break;
				case "RERUN":
					proceed = false;
					res.setReturnCode(1);
					break;
				case "POSTED_MONTH":
					proceed = false;
					res.setReturnCode(2);
					break;
				case "TEMP_CLOSE_TB":
					proceed = false;
					res.setReturnCode(3);
					break;
				case "UWPROD_UNDONE":
					proceed = false;
					res.setReturnCode(4);
					break;
				case "OSPROD_UNDONE":
					proceed = false;
					res.setReturnCode(5);
					break;
				default:
					break;
				}
			} else {
				proceed = true;
			}
			
			if(proceed) {
				acctITDao.startTransaction();
				
				if("Y".equals(sametbr.getForce())) {
					acctITDao.acitEomDeleteMonthlyTotalsBackup();
					acctITDao.acitEomInsertMonthlyTotalsBackup(params);
					acctITDao.acitEomDeleteMonthlyTotals(params);
				}
				
				acctITDao.acitEomCloseTrans(params);
				acctITDao.acitEomDeleteTrans(params);
				acctITDao.acitEomInsertMonthlyTotals(params);
				
				acctITDao.commit();
				res.setReturnCode(-1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			acctITDao.rollback();
			res.setReturnCode(0);
			res.getErrorList().add(new Error("SQLException","Trial Balance Processing failed."));
		}
		
		return res;
	}

	@Override
	public RetrieveAcitMonthEndTrialBalResponse retrieveAcitMonthEndTrialBal(
			RetrieveAcitMonthEndTrialBalRequest rametbr) throws SQLException {
		RetrieveAcitMonthEndTrialBalResponse res = new RetrieveAcitMonthEndTrialBalResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		
		params.put("eomDate", rametbr.getEomDate());
		
		res.setMonthlyTotalsList(acctITDao.retrieveAcitMonthEndTrialBal(params));
		
		return res;
	}

	@Override
	public PostAcitMonthEndTrialBalResponse postAcitMonthEndTrialBal(PostAcitMonthEndTrialBalRequest pametbr)
			throws SQLException {
		PostAcitMonthEndTrialBalResponse res = new PostAcitMonthEndTrialBalResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		String validate = "";
		Boolean proceed = false;
		
		params.put("eomDate", pametbr.getEomDate());
		params.put("eomYear", pametbr.getEomYear());
		params.put("eomMm", pametbr.getEomMm());
		params.put("eomUser", pametbr.getEomUser());
		
		try {
			validate = acctITDao.validatePrevMonth(params);
				
			switch (validate) {
			case "0":
				String validateCurrMonth = acctITDao.validateCurrMonth(params);
				
				//
				switch (validateCurrMonth) {
				case "0":
					String equalTb = acctITDao.validateEqualTb(params);
					proceed = "0".equals(equalTb);
					res.setEomMessage(equalTb);
					res.setReturnCode(1);
					break;
				case "1":
					proceed = false;
					res.setEomMessage("NOT_ALLOWED");
					res.setReturnCode(1);
					break;
				default:
					break;
				}
				//
				
				break;
			case "1":
				proceed = false;
				res.setReturnCode(2);
				break;
			default:
				break;
			}
			
			if(proceed) {
				acctITDao.startTransaction();
				
				acctITDao.acitEomPostToFiscalYear(params);
				acctITDao.commit();
				res.setReturnCode(-1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			acctITDao.rollback();
			acctITDao.failedPosting(params);
			res.setReturnCode(0);
			res.getErrorList().add(new Error("SQLException","Trial Balance Posting failed."));
		}
		
		return res;
	}

	@Override
	public RetrieveAcitMonthEndUnpostedMonthsResponse retrieveAcitMonthEndUnpostedMonths() throws SQLException {
		RetrieveAcitMonthEndUnpostedMonthsResponse res = new RetrieveAcitMonthEndUnpostedMonthsResponse();
		res.setUnpostedMonthsList(acctITDao.retrieveAcitMonthEndUnpostedMonths());
		
		return res;
	}

	@Override
	public RetrieveAcitMonthEndResponse retrieveAcitMonthEnd(RetrieveAcitMonthEndRequest ramer) throws SQLException {
		RetrieveAcitMonthEndResponse res = new RetrieveAcitMonthEndResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		
		params.put("eomDate", ramer.getEomDate());
		
		res.setMonthEnd(acctITDao.retrieveAcitMonthEnd(params));
		
		return res;
	}

	@Override
	public SaveQSOAResponse saveQSOA(SaveQSOARequest sqr) throws SQLException {
		SaveQSOAResponse res = new SaveQSOAResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		Boolean proceed = false;
		
		params.put("cedingId", sqr.getCedingId());
		params.put("qtr", sqr.getQtr());
		params.put("year", sqr.getYear());
		params.put("user", sqr.getUser());
		
		res.setCedingId(sqr.getCedingId());
		try {
			if("N".equals(sqr.getForce())) {				
				switch (acctITDao.validateQsoaQtr(params)) {
				case "0":
					proceed = true;
					break;
				case "1":
					proceed = false;
					res.setReturnCode(1);
					break;
				case "2":
					proceed = false;
					res.setReturnCode(2);
					break;
				default:
					break;
				}
			} else {
				proceed = true;
			}
			
			if(proceed) {
				acctITDao.saveQSOA(params);
				res.setReturnCode(-1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			res.setReturnCode(0);
			res.getErrorList().add(new Error("SQLException","QSOA Generation failed."));
		}
		
		return res;
	}

	@Override
	public RetrieveQSOADtlResponse retrieveQSOADtl(RetrieveQSOADtlRequest rqdr) throws SQLException {
		RetrieveQSOADtlResponse res = new RetrieveQSOADtlResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		
		params.put("qsoaId", rqdr.getQsoaId());
		
		res.setQsoaDtlList(acctITDao.retrieveQSOADtl(params));
		res.setQsoaDtlExcludeList(acctITDao.retrieveQSOADtlExclude(params));
		res.setQsoaAcctReceivableList(acctITDao.retrieveQSOAAcctReceivable(params));
		res.setQsoaRemittanceList(acctITDao.retrieveQSOARemittance(params));
		
		return res;
	}

	@Override
	public SaveAcitProfCommResponse saveAcitProfComm(SaveAcitProfCommRequest sapcr) throws SQLException {
		SaveAcitProfCommResponse res = new SaveAcitProfCommResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		
		params.put("cedingId", sapcr.getCedingId());
		params.put("gnrtDate", sapcr.getGnrtDate());
		params.put("createUser", sapcr.getCreateUser());
		params.put("createDate", sapcr.getCreateDate());
		params.put("updateUser", sapcr.getUpdateUser());
		params.put("updateDate", sapcr.getUpdateDate());
		
		try {
			acctITDao.saveAcitProfComm(params);
			res.setReturnCode(-1);
		} catch (Exception e) {
			e.printStackTrace();
			res.setReturnCode(0);
			res.getErrorList().add(new Error("SQLException","Profit Commission Generation failed."));
		}
		
		return res;
	}

	@Override
	public RetrieveAcitEditedAcctEntriesResponse retrieveAcitEditedAcctEntries(
			RetrieveAcitEditedAcctEntriesRequest raeaer) throws SQLException {
		RetrieveAcitEditedAcctEntriesResponse response = new RetrieveAcitEditedAcctEntriesResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", raeaer.getTranId());
		response.setEditedAcctEntries(acctITDao.retrieveAcitEditedAcctEntries(params));
		logger.info(response.toString());
		return response;
	}

	@Override
	public RetrieveAcitOsQsoaResponse retrieveAcitOsQsoa(RetrieveAcitOsQsoaRequest raoqp) throws SQLException {
		RetrieveAcitOsQsoaResponse res = new RetrieveAcitOsQsoaResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("qsoaId", raoqp.getQsoaId());
		params.put("currCd", raoqp.getCurrCd());
		params.put("cedingId", raoqp.getCedingId());
		
		res.setOsQsoaList(acctITDao.retrieveAcitOsQsoa(params));
		
		return res;
	}

	@Override
	public UploadAcctEntryResponse uploadAcctEntry(UploadAcctEntryRequest uaer) throws SQLException {
		UploadAcctEntryResponse res = new UploadAcctEntryResponse();
		
		try {
			acctITDao.startTransaction();
			
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("acctType", uaer.getAeruList().get(0).getAcctType());
			params.put("tranClass", uaer.getAeruList().get(0).getTranClass());
			params.put("tranId", uaer.getAeruList().get(0).getTranId());
			
			acctITDao.deleteAcctEntry(params);
			acctITDao.uploadAcctEntry(uaer.getAeruList());
			
			acctITDao.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			acctITDao.rollback();
			res.getErrorList().add(new Error("Exception", e.getCause().toString().substring(32, e.getCause().toString().indexOf("\n"))));
		}
		
		
		return res;
	}
	
	@Override
	public EditInTrustAccountingEntriesResponse editAcctEnt(EditInTrustAccountingEntriesRequest eitaer)
			throws SQLException {
		EditInTrustAccountingEntriesResponse response = new EditInTrustAccountingEntriesResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", eitaer.getTranId());
		params.put("histNo", eitaer.getHistNo());
		params.put("reason", eitaer.getReason());
		params.put("createUser", eitaer.getCreateUser());
		params.put("updateUser", eitaer.getUpdateUser());
		params.put("saveList", eitaer.getSaveList());
		params.put("delList", eitaer.getDelList());
		try{
			response.setReturnCode(acctITDao.editAcctEnt(params));
		}catch(SQLException e){
			e.printStackTrace();
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException", "Error editing accounting entries."));
		}
		return response;
	}

	public SaveAcitDcbCollectionResponse saveDcbCollection(SaveAcitDcbCollectionRequest request) throws SQLException {
		SaveAcitDcbCollectionResponse response = new SaveAcitDcbCollectionResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("updateDcb", request.getUpdateDcb());
			HashMap<String,Object> res = acctITDao.saveDcbCollection(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public RestoreInTrustAccountingEntriesResponse restoreAcctEnt(RestoreInTrustAccountingEntriesRequest ritaer)
			throws SQLException {
		RestoreInTrustAccountingEntriesResponse response = new RestoreInTrustAccountingEntriesResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", ritaer.getTranId());
		params.put("histNo", ritaer.getHistNo());
		try{
			response.setReturnCode(acctITDao.restoreAcctEnt(params));
		}catch(SQLException e){
			e.printStackTrace();
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException", "Error editing accounting entries."));
		}
		return response;
	}

	public SaveAcitCloseOpenDcbResponse SaveAcitCloseOpenDcb(SaveAcitCloseOpenDcbRequest request) throws SQLException {
		SaveAcitCloseOpenDcbResponse response = new SaveAcitCloseOpenDcbResponse();
		try {
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("saveDcb", request.getSaveDcb());
			HashMap<String,Object> res =  acctITDao.SaveAcitCloseOpenDcb(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveAcitAcctEntInqResponse retrieveAcitAcctEntInq(RetrieveAcitAcctEntInqRequest raaeir)
			throws SQLException {
		RetrieveAcitAcctEntInqResponse response = new RetrieveAcitAcctEntInqResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranClass", raaeir.getTranClass());
		params.put("tranDateFrom", raaeir.getTranDateFrom());
		params.put("tranDateTo", raaeir.getTranDateTo());
		response.setEdtAcctEntList(acctITDao.retrieveEditedAcctEntInq(params));
		return response;
	}
	
	public RetrieveAcitDcbCollectionResponse retrieveAcitDcbCollection(RetrieveAcitDcbCollectionRequest request)
			throws SQLException {
		RetrieveAcitDcbCollectionResponse response = new RetrieveAcitDcbCollectionResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("dcbYear", request.getDcbYear());
		params.put("dcbNo",request.getDcbNo());
		response.setDcbCollection(acctITDao.retrieveAcitDcbCollection(params));
		return response;
	}

	@Override
	public RetrieveAcitAcctEntBackupResponse retrieveAcitAcctEntBackup(RetrieveAcitAcctEntBackupRequest raaebr)
			throws SQLException {
		RetrieveAcitAcctEntBackupResponse response = new RetrieveAcitAcctEntBackupResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", raaebr.getTranId());
		params.put("histNo", raaebr.getHistNo());
		response.setBackupAcctEnt(acctITDao.retrieveAcctEntInqDtl(params));
		return response;
	}
	
	@Override
	public SaveAcitMonthEndTBTempCloseResponse saveAcitMonthEndTBTempClose(SaveAcitMonthEndTBTempCloseRequest sametcr)
			throws SQLException {
		SaveAcitMonthEndTBTempCloseResponse res = new SaveAcitMonthEndTBTempCloseResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("eomDate", sametcr.getEomDate());
		params.put("eomUser", sametcr.getEomUser());
		
		try {
			Boolean proceed = false;
			String validate = acctITDao.validateTempClose(params);
			
			switch (validate) {
			case "PROCEED":
				proceed = true;
				break;
			case "POSTED_MONTH":
				proceed = false;
				res.setReturnCode(1);
				break;
			case "TEMP_CLOSE_TB":
				proceed = false;
				res.setReturnCode(2);
				break;
			case "UWPROD_UNDONE":
				proceed = false;
				res.setReturnCode(3);
				break;
			case "OSPROD_UNDONE":
				proceed = false;
				res.setReturnCode(4);
				break;
			default:
				break;
			}
			
			if(proceed) {
				acctITDao.saveAcitMonthEndTBTempClose(params);
				res.setReturnCode(-1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			res.setReturnCode(0);
			res.getErrorList().add(new Error("SQLException","Temporary closing failed."));
		}
		
		return res;
	}

	@Override
	public SaveAcitMonthEndTBReopenResponse saveAcitMonthEndTBReopen(SaveAcitMonthEndTBReopenRequest sametrr)
			throws SQLException {
		SaveAcitMonthEndTBReopenResponse res = new SaveAcitMonthEndTBReopenResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("eomDate", sametrr.getEomDate());
		params.put("eomUser", sametrr.getEomUser());
		
		try {
			Boolean proceed = false;
			String validate = acctITDao.validateReopen(params);
			
			switch (validate) {
			case "PROCEED":
				proceed = true;
				break;
			case "POSTED_MONTH":
				proceed = false;
				res.setReturnCode(1);
				break;
			case "NOT_YET_CLOSED":
				proceed = false;
				res.setReturnCode(2);
				break;
			default:
				break;
			}
			
			if(proceed) {
				acctITDao.saveAcitMonthEndTBReopen(params);
				res.setReturnCode(-1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			res.setReturnCode(0);
			res.getErrorList().add(new Error("SQLException","Reopening failed."));
		}
		
		return res;
	}
	
	public RetrieveAcitDcbBankDetailsResponse retrieveAcitBankDetails(RetrieveAcitDcbBankDetailsRequest request)
			throws SQLException {
		RetrieveAcitDcbBankDetailsResponse response = new RetrieveAcitDcbBankDetailsResponse();
		HashMap<String,Object> params = new HashMap<String,Object> ();
		params.put("dcbYear", request.getDcbYear());
		params.put("dcbNo",request.getDcbNo());
		response.setBankDetails(acctITDao.retrieveAcitBankDetails(params));
		return response;
	}
	
	@Override
	public RetrieveAcitClmHistResponse retrieveAcitClmHist(RetrieveAcitClmHistRequest rachp) throws SQLException {
		RetrieveAcitClmHistResponse rachResponse =  new RetrieveAcitClmHistResponse();
		HashMap<String, Object> rachParams = new HashMap<String, Object>();
		rachParams.put("reqId", rachp.getReqId());
		rachParams.put("itemNo", rachp.getItemNo());
		rachResponse.setAcitClmHistList(acctITDao.retrieveAcitClmHist(rachParams));
		logger.info("RetrieveAcitClmHistResponse : " + rachResponse.toString());
		return rachResponse;
	}

	@Override
	public SaveAcitProfCommTranResponse saveAcitProfCommTran(SaveAcitProfCommTranRequest saptr) throws SQLException {
		SaveAcitProfCommTranResponse res = new SaveAcitProfCommTranResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("profCommId", saptr.getProfCommId());
		params.put("tranId", saptr.getTranId());
		params.put("updateUser", saptr.getUpdateUser());
		params.put("updateDate", saptr.getUpdateDate());
		
		try {
			acctITDao.saveAcitProfCommTran(params);
			res.setReturnCode(-1);
		} catch (Exception e) {
			e.printStackTrace();
			res.setReturnCode(0);
			res.getErrorList().add(new Error("SQLException","Update failed."));
		}
		
		return res;
	}


	@Override
	public RetrieveAcitUnappliedCollResponse retrieveUnappliedCollection(RetrieveAcitUnappliedCollRequest request)
			throws SQLException {
		RetrieveAcitUnappliedCollResponse response  =  new RetrieveAcitUnappliedCollResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("unappliedId", request.getUnappliedId());
		params.put("cedingId", request.getCedingId());
		params.put("currCd", request.getCurrCd());
		
		response.setUnappliedColl(acctITDao.retrieveUnappliedCollection(params));
		return response;
	}


	@Override
	public RetrieveAcitJvUnappCollResponse retrieveJvUnappliedCollection(RetrieveAcitJvUnappCollRequest request)
			throws SQLException {
		RetrieveAcitJvUnappCollResponse response = new RetrieveAcitJvUnappCollResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("tranId", request.getTranId());
		response.setUnappliedColl(acctITDao.retrieveJvUnappliedCollection(params));
		return response;
	}


	@Override
	public RetrieveAcitJvUnappliedInwResponse retrieveInwUnappliedCollection(RetrieveAcitJvUnappliedInwRequest request)
			throws SQLException {
		RetrieveAcitJvUnappliedInwResponse response = new RetrieveAcitJvUnappliedInwResponse();
		
		HashMap<String,Object> params  = new HashMap<String,Object>();
		params.put("tranId", request.getTranId());
		params.put("policyId", request.getPolicyId());
		params.put("instNo", request.getInstNo());
		response.setInwUnappColl(acctITDao.retrieveInwUnappliedCollection(params));
		return response;
	}


	@Override
	public SaveAcitJVUnappCollResponse saveJVUnappliedColl(SaveAcitJVUnappCollRequest request) throws SQLException {
		SaveAcitJVUnappCollResponse response = new SaveAcitJVUnappCollResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("tranId", request.getTranId());
			params.put("tranType", request.getTranType());
			params.put("saveUnappliedColl", request.getSaveUnappliedColl());
			params.put("delUnappliedColl", request.getDelUnappliedColl());
			HashMap<String,Object> res = acctITDao.saveJVUnappliedColl(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			ex.printStackTrace();
		}
		return response;
	}


	@Override
	public SaveAcitJVInwUnappResponse saveJVInwUnappliedColl(SaveAcitJVInwUnappRequest request) throws SQLException {
		SaveAcitJVInwUnappResponse response = new SaveAcitJVInwUnappResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("tranId", request.getTranId());
			params.put("tranType", request.getTranType());
			params.put("saveInwCollection", request.getSaveInwCollection());
			params.put("delInwCollection", request.getDelInwCollection());
			HashMap<String,Object> res = acctITDao.saveJVInwUnappliedColl(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveAcitJvUnappliedTrtyResponse retrieveTrtyUnappliedCollection(
			RetrieveAcitJvUnappliedTrtyRequest request) throws SQLException {
		RetrieveAcitJvUnappliedTrtyResponse response =  new RetrieveAcitJvUnappliedTrtyResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("tranId", request.getTranId());
		params.put("qsoaId", request.getQsoaId());
		response.setTrtyUnappColl(acctITDao.retrieveTrtyUnappliedCollection(params));
		return response;
	}

	@Override
	public SaveAcitJvUnappliedTrtyResponse saveJVTrtyUnappliedColl(SaveAcitJvUnappliedTrtyRequest request)
			throws SQLException {
		SaveAcitJvUnappliedTrtyResponse response = new SaveAcitJvUnappliedTrtyResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("tranId", request.getTranId());
			params.put("tranType", request.getTranType());
			params.put("saveTrtyUnapplied", request.getSaveTrtyUnapplied());
			params.put("delTrtyUnapplied", request.getDelTrtyUnapplied());
			HashMap<String,Object> res = acctITDao.saveJVTrtyUnappliedColl(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public String retrieveAcitJvListingLength(RetrieveAcitJVListingRequest rajll) throws SQLException {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", rajll.getTranId());
		params.put("jvNo", rajll.getJvNo());
		params.put("jvDateFrom", rajll.getJvDateFrom());
		params.put("jvDateTo", rajll.getJvDateTo());
		params.put("particulars", rajll.getParticulars());
		params.put("tranTypeName", rajll.getTranTypeName());
		params.put("refNo", rajll.getRefNo());
		params.put("preparedBy", rajll.getPreparedBy());
		params.put("jvAmtFrom", rajll.getJvAmtFrom());
		params.put("jvAmtTo", rajll.getJvAmtTo());
		params.put("tranStat", rajll.getTranStat());
		params.put("jvStat", rajll.getJvStat());
		
		return acctITDao.retrieveAcitJvListingLength(params).toString();
	}

	@Override
	public SaveJVMultiOffsetResponse saveJVMultiOffset(SaveJVMultiOffsetRequest request) throws SQLException {
		SaveJVMultiOffsetResponse response = new SaveJVMultiOffsetResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		
		params.put("tranId", request.getTranId());
		params.put("tranType", request.getTranType());
		params.put("saveIpb", request.getSaveIpb());
		params.put("delIpb", request.getDelIpb());
		params.put("saveClm", request.getSaveClm());
		params.put("delClm", request.getDelClm());
		params.put("saveTrty", request.getSaveTrty());
		params.put("delTrty", request.getDelTrty());
		params.put("saveUnapp", request.getSaveUnapp());
		params.put("delUnapp", request.getDelUnapp());
		params.put("saveInvPo", request.getSaveInvPo());
		params.put("delInvPo", request.getDelInvPo());
		params.put("saveInvPl", request.getSaveInvPl());
		params.put("delInvPl", request.getDelInvPl());
		params.put("saveLrd", request.getSaveLrd());
		params.put("delLrd", request.getDelLrd());
		params.put("saveOth", request.getSaveOth());
		params.put("delOth", request.getDelOth());
		
		try {
			acctITDao.saveJVMultiOffset(params);
			response.setReturnCode(-1);
		} catch (Exception e) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			e.printStackTrace();
		}
		
		return response;
	}

	@Override
	public RetrieveAcitJVMultiOffsetResponse retrieveAcitJVMultiOffset(RetrieveAcitJVMultiOffsetRequest request)
			throws SQLException {
		RetrieveAcitJVMultiOffsetResponse response = new RetrieveAcitJVMultiOffsetResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("tranId", request.getTranId());
		params.put("cedingId", request.getCedingId());
		
		switch (request.getFrom()) {
		case "ipb":
			response.setIpbList(acctITDao.retrieveMultiOffsetIpb(params));
			break;
			
		case "clm":
			response.setClmList(acctITDao.retrieveMultiOffsetClm(params));
			break;
			
		case "trty":
			response.setTrtyList(acctITDao.retrieveMultiOffsetTrty(params));
			break;
			
		case "unapp":
			response.setUnappList(acctITDao.retrieveMultiOffsetUnapp(params));
			break;
			
		case "invPo":
			response.setInvPoList(acctITDao.retrieveMultiOffsetInvPo(params));
			break;
			
		case "invPl":
			response.setInvPlList(acctITDao.retrieveMultiOffsetInvPl(params));
			break;
			
		case "lrd":
			response.setLrdList(acctITDao.retrieveMultiOffsetLrd(params));
			break;
			
		case "oth":
			response.setOthList(acctITDao.retrieveMultiOffsetOth(params));
			break;

		default:
			break;
		}
		
//		response.setExisting(acctITDao.retrieveMultiOffsetExisting(params));
		
		return response;
	}

	@Override
	public RetrieveAcitJVCedRepLossResponse retrieveAcitJVCedRepLoss(RetrieveAcitJVCedRepLossRequest request)
			throws SQLException {
		RetrieveAcitJVCedRepLossResponse response = new RetrieveAcitJVCedRepLossResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("cedingId", request.getCedingId());
		params.put("currCd", request.getCurrCd());
		
		response.setCedRepLossList(acctITDao.retrieveAcitJVCedRepLoss(params));
		return response;
	}


	@Override
	public UpdateAgingSoaReponse updateAgingSoa(String eomDate) throws SQLException {
		UpdateAgingSoaReponse response = new UpdateAgingSoaReponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("eomDate", eomDate);
		
		try {
			acctITDao.updateAgingSoa(params);
			response.setReturnCode(-1);
		} catch (Exception e) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Update failed."));
			e.printStackTrace();
		}
		
		return response;
	}


	@Override
	public RetrieveAcitMonthEndJVResponse retrieveAcitMonthEndJV(RetrieveAcitMonthEndJVRequest ramer)
			throws SQLException {
		RetrieveAcitMonthEndJVResponse res = new RetrieveAcitMonthEndJVResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		
		params.put("from", ramer.getFrom());
		params.put("eomDate", ramer.getEomDate());
		
		res.setMonthEndJVList(acctITDao.retrieveAcitMonthEndJV(params));
		
		return res;
	}


	@Override
	public RetrieveAcitQsoaPrintResponse retrieveAcitQsoaPrint(RetrieveAcitQsoaPrintRequest request)
			throws SQLException {
		RetrieveAcitQsoaPrintResponse response = new RetrieveAcitQsoaPrintResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("treatyTag", request.getTreatyTag());
		params.put("cedingId", request.getCedingId());
		params.put("currCd", request.getCurrCd());
		params.put("fromQtr", request.getFromQtr());
		params.put("fromYear", request.getFromYear());
		params.put("toQtr", request.getToQtr());
		params.put("toYear", request.getToYear());
		
		response.setQsoaPrintList(acctITDao.retrieveAcitQsoaPrint(params));
		
		return response;
	}


	@Override
	public RetrieveAcitAcctEntriesExtResponse retrieveAcitAcctEntriesExt(RetrieveAcitAcctEntriesExtRequest request)
			throws SQLException {
		RetrieveAcitAcctEntriesExtResponse response = new RetrieveAcitAcctEntriesExtResponse();
		response.setAcitAcctEntriesExt(acctITDao.retrieveAcitAcctEntriesExt(request));
		return response;
	}


	@Override
	public RetrieveAcitTrialBalExtResponse retrieveAcitTrialBalExt(String extractUser) throws SQLException {
		RetrieveAcitTrialBalExtResponse response = new RetrieveAcitTrialBalExtResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("extractUser", extractUser);
		response.setList(acctITDao.retrieveAcitTrialBalExt(params));
		return response;
	}
	
	@Override
	public RetrieveAcitJVMultiOffsetLovResponse retrieveAcitJVMultiOffsetLov(RetrieveAcitJVMultiOffsetLovRequest request) throws SQLException {
		RetrieveAcitJVMultiOffsetLovResponse response = new RetrieveAcitJVMultiOffsetLovResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		
		switch (request.getFrom()) {
		case "ipb":
			params.put("policyId", request.getPolicyId());
			params.put("instNo", request.getPolicyId());
			params.put("cedingId", request.getCedingId());
			params.put("payeeNo", request.getPayeeNo());
			params.put("zeroBal", request.getZeroBal());
			params.put("currCd", request.getCurrCd());
			
			response.setSoaList(acctITDao.retrieveAcitJVMoSoa(params));
			break;
			
//		case "clm":
//			response.setClmList(acctITDao.retrieveMultiOffsetClm(params));
//			break;
//			
//		case "trty":
//			response.setTrtyList(acctITDao.retrieveMultiOffsetTrty(params));
//			break;
//			
//		case "unapp":
//			response.setUnappList(acctITDao.retrieveMultiOffsetUnapp(params));
//			break;
//			
//		case "lrd":
//			response.setLrdList(acctITDao.retrieveMultiOffsetLrd(params));
//			break;
//			
//		case "oth":
//			response.setOthList(acctITDao.retrieveMultiOffsetOth(params));
//			break;

		default:
			break;
		}
		return response;
	}


	@Override
	public RetrieveAcitJVRiskMgtAllocResponse retrieveAcitJVRiskMgtAlloc(RetrieveAcitJVRiskMgtAllocRequest request)
			throws SQLException {
		RetrieveAcitJVRiskMgtAllocResponse response = new RetrieveAcitJVRiskMgtAllocResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		
		params.put("tranId", request.getTranId());
		params.put("pwFromMm", request.getPwFromMm());
		params.put("pwFromYear", request.getPwFromYear());
		params.put("pwToMm", request.getPwToMm());
		params.put("pwToYear", request.getPwToYear());
		params.put("paytForQtr", request.getPaytForQtr());
		params.put("paytForYear", request.getPaytForYear());
		params.put("totalAmt", request.getTotalAmt());
		params.put("currCd", request.getCurrCd());
		params.put("currRate", request.getCurrRate());
		
		if(request.getGenerate().equals("Y")) {
			response.setRiskMgtAllocList(acctITDao.retrieveAcitJVRiskMgtAllocGnrt(params));
		} else {
			response.setRiskMgtAllocList(acctITDao.retrieveAcitJVRiskMgtAlloc(params));
		}
		
		return response;
	}


	@Override
	public SaveAcitJVRiskMgtAllocResponse saveAcitJVRiskMgtAlloc(SaveAcitJVRiskMgtAllocRequest request)
			throws SQLException {
		
		SaveAcitJVRiskMgtAllocResponse response = new SaveAcitJVRiskMgtAllocResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		
		params.put("tranType", request.getTranType());
		params.put("allocTranId", request.getAllocTranId());
		params.put("paytForQtr", request.getPaytForQtr());
		params.put("paytForYear", request.getPaytForYear());
		params.put("totalAmt", request.getTotalAmt());
		params.put("currCd", request.getCurrCd());
		params.put("currRate", request.getCurrRate());
		params.put("saveRiskMgtAlloc", request.getSaveRiskMgtAlloc());
		
		try {
			acctITDao.saveAcitJVRiskMgtAlloc(params);
			response.setReturnCode(-1);
		} catch (Exception e) {
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			e.printStackTrace();
		}
		
		return response;
	}


	@Override
	public RetrieveAcitInvestmentsListResponse retrieveAcitInvestmentsIncArtUtil(Integer tranId) throws SQLException {
		RetrieveAcitInvestmentsListResponse response = new RetrieveAcitInvestmentsListResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", tranId);
		response.setInvtList(acctITDao.retrieveAcitInvestmentsIncArtUtil(params));
		return response;
	}

	@Override
	public RetrieveAcitOsPolPremResponse retrieveAcitOsPolPrem(RetrieveAcitOsPolPremRequest request)
			throws SQLException {
		RetrieveAcitOsPolPremResponse response = new RetrieveAcitOsPolPremResponse();
		response.setList(acctITDao.retrieveAcitOsPolPrem(request));
		return response;
	}
	
	@Override
	public RetrieveAcitArListResponse retrieveArListChangeTrans(RetrieveAcitArListRequest raalr) throws SQLException {
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
		params.put("tranStat", raalr.getTranStat());
		params.put("arStat", raalr.getArStat());
		response.setAr(acctITDao.retrieveArListChangeTrans(params));
		return response;
	}
	
	@Override
	public RetrieveAcitJVListingResponse retrieveAcitJVListingChangeTrans(RetrieveAcitJVListingRequest rajl) throws SQLException {
		RetrieveAcitJVListingResponse response = new RetrieveAcitJVListingResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", rajl.getTranId());
		params.put("jvNo", rajl.getJvNo());
		params.put("jvDateFrom", rajl.getJvDateFrom());
		params.put("jvDateTo", rajl.getJvDateTo());
		params.put("particulars", rajl.getParticulars());
		params.put("tranTypeName", rajl.getTranTypeName());
		params.put("refNo", rajl.getRefNo());
		params.put("preparedBy", rajl.getPreparedBy());
		params.put("jvAmtFrom", rajl.getJvAmtFrom());
		params.put("jvAmtTo", rajl.getJvAmtTo());
		params.put("tranStat", rajl.getTranStat());
		params.put("jvStat", rajl.getJvStat());
		
		params.put("pagination", rajl.getPaginationRequest());
		params.put("sort", rajl.getSortRequest());
		
		response.setTransactions(acctITDao.retrieveAcitJvListingChangeTrans(params));
		return response;
	}
	
	@Override
	public RetrieveAcitCvResponse retrieveAcitCvChangeTrans(RetrieveAcitCvRequest raptp) throws SQLException {
		RetrieveAcitCvResponse racResponse = new RetrieveAcitCvResponse();
		HashMap<String, Object> racParams = new HashMap<String, Object>();
		racParams.put("tranId",raptp.getTranId());
		racParams.put("cvGenNo",raptp.getCvGenNo());
		racParams.put("cvDateFrom",raptp.getCvDateFrom());
		racParams.put("cvDateTo",raptp.getCvDateTo());
		racParams.put("cvStatusDesc",raptp.getCvStatusDesc());
		racParams.put("payee",raptp.getPayee());
		racParams.put("particulars",raptp.getParticulars());
		racParams.put("cvAmtFrom",raptp.getCvAmtFrom());
		racParams.put("cvAmtTo",raptp.getCvAmtTo());
		racParams.put("tranStat",raptp.getTranStat());
		racParams.put("cvStat",raptp.getCvStat());
		racResponse.setAcitCvList(acctITDao.retrieveAcitCvChangeTrans(racParams));
		logger.info("RetrieveAcitCvResponse : " + racResponse);
		return racResponse;
	}


	@Override
	public RetrieveAcitPremColResponse retrieveAcitPremCol(RetrieveAcitPremColRequest request) throws SQLException {
		RetrieveAcitPremColResponse response = new RetrieveAcitPremColResponse();
		response.setList(acctITDao.retrieveAcitPremCol(request));
		return response;
	}
}
