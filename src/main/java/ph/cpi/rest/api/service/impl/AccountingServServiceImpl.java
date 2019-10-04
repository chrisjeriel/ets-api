package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.AccountingServDao;
import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.request.RetrieveAcseCvRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseOrEntryRequest;
import ph.cpi.rest.api.model.request.RetrieveAcseOrListRequest;
import ph.cpi.rest.api.model.request.RetrieveAcsePaytReqRequest;
import ph.cpi.rest.api.model.request.RetrieveAcsePrqTransRequest;
import ph.cpi.rest.api.model.request.SaveAcseCvRequest;
import ph.cpi.rest.api.model.response.RetrieveAcseCvResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseOrEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseOrListResponse;
import ph.cpi.rest.api.model.response.RetrieveAcsePaytReqResponse;
import ph.cpi.rest.api.model.response.RetrieveAcsePrqTransResponse;
import ph.cpi.rest.api.model.response.SaveAcseCvResponse;
import ph.cpi.rest.api.model.request.SaveAcseOrTransRequest;
import ph.cpi.rest.api.model.request.SaveAcsePaytReqRequest;
import ph.cpi.rest.api.model.request.SaveAcsePrqTransRequest;
import ph.cpi.rest.api.model.request.UpdateAcsePaytReqStatRequest;
import ph.cpi.rest.api.model.response.RetrieveAcseOrEntryResponse;
import ph.cpi.rest.api.model.response.RetrieveAcseOrListResponse;
import ph.cpi.rest.api.model.response.SaveAcseOrTransResponse;
import ph.cpi.rest.api.model.response.SaveAcsePaytReqResponse;
import ph.cpi.rest.api.model.response.SaveAcsePrqTransResponse;
import ph.cpi.rest.api.model.response.UpdateAcsePaytReqStatResponse;
import ph.cpi.rest.api.service.AccountingServService;

@Component
public class AccountingServServiceImpl implements AccountingServService{
	@Autowired
	AccountingServDao acctServDao;
	
	private static final Logger logger = LoggerFactory.getLogger(AccountingServServiceImpl.class);

	@Override
	public RetrieveAcseOrListResponse retrieveAcseOrList(RetrieveAcseOrListRequest raolr) throws SQLException {
		RetrieveAcseOrListResponse response = new RetrieveAcseOrListResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("orType", raolr.getOrType());
		params.put("orNo", raolr.getOrNo());
		params.put("payor", raolr.getPayor());
		params.put("orDateFrom", raolr.getOrDateFrom());
		params.put("orDateTo", raolr.getOrDateTo());
		params.put("tranTypeName", raolr.getTranTypeName());
		params.put("orStatDesc", raolr.getOrStatDesc());
		params.put("particulars", raolr.getParticulars());
		params.put("orAmtFrom", raolr.getOrAmtFrom());
		params.put("orAmtTo", raolr.getOrAmtTo());
		response.setOrList(acctServDao.retrieveOrList(params));
		logger.info("RetrieveAcseOrListResponse : " + response.toString());
		return response;
	}

	@Override
	public RetrieveAcseOrEntryResponse retrieveAcseOrEntry(RetrieveAcseOrEntryRequest raoer) throws SQLException {
		RetrieveAcseOrEntryResponse response = new RetrieveAcseOrEntryResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", raoer.getTranId());
		params.put("orNo", raoer.getOrNo());
		response.setOrEntry(acctServDao.retrieveOrEntry(params));
		logger.info("RetrieveAcseOrEntryRequest : " + response.toString());
		return response;
	}
	
	@Override
	public RetrieveAcsePaytReqResponse retrieveAcsePaytReq(RetrieveAcsePaytReqRequest racprlp) throws SQLException {
		RetrieveAcsePaytReqResponse rapResponse = new RetrieveAcsePaytReqResponse();
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
		rapResponse.setAcsePaytReq(acctServDao.retrieveAcsePaytReq(rapParams));
		logger.info("RetrieveAcsePaytReqResponse : " + rapResponse.toString());
		return rapResponse;
	}

	@Override
	public SaveAcseOrTransResponse saveOrEntry(SaveAcseOrTransRequest soetr) throws SQLException {
		SaveAcseOrTransResponse response = new SaveAcseOrTransResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranId", soetr.getTranId());
		params.put("tranDate", soetr.getTranDate());
		params.put("tranClass", soetr.getTranClass());
		params.put("tranTypeCd", soetr.getTranTypeCd());
		params.put("tranYear", soetr.getTranYear());
		params.put("tranClassNo", soetr.getTranClassNo());
		params.put("tranStat", soetr.getTranStat());
		params.put("closeDate", soetr.getCloseDate());
		params.put("deleteDate", soetr.getDeleteDate());
		params.put("postDate", soetr.getPostDate());
		params.put("createUser", soetr.getCreateUser());
		params.put("createDate", soetr.getCreateDate());
		params.put("updateUser", soetr.getUpdateUser());
		params.put("updateDate", soetr.getUpdateDate());
		params.put("orType", soetr.getOrType());
		params.put("orStatus", soetr.getOrStatus());
		params.put("dcbYear", soetr.getDcbYear());
		params.put("dcbNo", soetr.getDcbNo());
		params.put("dcbUserCd", soetr.getDcbUserCd());
		params.put("dcbBank", soetr.getDcbBank());
		params.put("dcbBankAcct", soetr.getDcbBankAcct());
		params.put("refNo", soetr.getRefNo());
		params.put("prNo", soetr.getPrNo());
		params.put("prDate", soetr.getPrDate());
		params.put("prPreparedBy", soetr.getPrPreparedBy());
		params.put("payeeNo", soetr.getPayeeNo());
		params.put("payeeClassCd", soetr.getPayeeClassCd());
		params.put("payor", soetr.getPayor());
		params.put("mailAddress", soetr.getMailAddress());
		params.put("bussTypeName", soetr.getBussTypeName());
		params.put("tin", soetr.getTin());
		params.put("particulars", soetr.getParticulars());
		params.put("currCd", soetr.getCurrCd());
		params.put("currRate", soetr.getCurrRate());
		params.put("orAmt", soetr.getOrAmt());
		params.put("allocTag", soetr.getAllocTag());
		params.put("allocTranId", soetr.getAllocTranId());
		params.put("savePaytDtl", soetr.getSavePaytDtl());
		params.put("delPaytDtl", soetr.getDelPaytDtl());
		try{
			HashMap<String, Object> daoResponse = acctServDao.saveOrEntry(params);
			response.setReturnCode(Integer.parseInt(daoResponse.get("errorCode").toString()));
			response.setOutTranId(Integer.parseInt(daoResponse.get("outTranId").toString()));
			if(response.getOutTranId() == 0){
				response.setReturnCode(0);
				response.getErrorList().add(new Error("General Error","The specified OR No. is not yet generated. Please review your records and make the necessary changes."));
			}
		}catch(Throwable e){
			Throwable t = e;
			while(t.getCause() != null){
				t = t.getCause();
				if(t.toString().contains("unique constraint")){
					response.getErrorList().add(new Error("General Error","The specified OR No. was already taken. Please review your records and make the necessary changes."));
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
	public SaveAcsePaytReqResponse saveAcsePaytReq(SaveAcsePaytReqRequest saprr) throws SQLException {
		SaveAcsePaytReqResponse saprResponse = new SaveAcsePaytReqResponse();
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
			
			HashMap<String, Object> response = acctServDao.saveAcsePaytReq(saprParams);
			
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
	public UpdateAcsePaytReqStatResponse updateAcsePaytReqStat(UpdateAcsePaytReqStatRequest uaprsr)
			throws SQLException {
		UpdateAcsePaytReqStatResponse uaprsResponse = new UpdateAcsePaytReqStatResponse();
		HashMap<String, Object> uaprsParams = new HashMap<String, Object>();
		try {
			uaprsParams.put("reqId", uaprsr.getReqId());
			uaprsParams.put("reqStatus", uaprsr.getReqStatus());
			uaprsParams.put("updateUser", uaprsr.getUpdateUser());
			uaprsParams.put("approvedBy", uaprsr.getApprovedBy());
			uaprsParams.put("approvedDate", uaprsr.getApprovedDate());
			
			HashMap<String, Object> response = acctServDao.updateAcsePaytReqStat(uaprsParams);
			
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
	public RetrieveAcsePrqTransResponse retrieveAcsePrqTrans(RetrieveAcsePrqTransRequest raptp) throws SQLException {
		RetrieveAcsePrqTransResponse raptResponse =  new RetrieveAcsePrqTransResponse();
		HashMap<String, Object> raptParams = new HashMap<String, Object>();
		raptParams.put("reqId", raptp.getReqId());
		raptParams.put("itemNo", raptp.getItemNo());
		raptResponse.setAcsePrqTrans(acctServDao.retrieveAcsePrqTrans(raptParams));
		logger.info("RetrieveAcsePrqTransResponse : " + raptResponse.toString());
		return raptResponse;
		
	}
	
	@Override
	public SaveAcsePrqTransResponse saveAcsePrqTrans(SaveAcsePrqTransRequest saptr) throws SQLException {
		SaveAcsePrqTransResponse saptResponse = new SaveAcsePrqTransResponse();
		HashMap<String, Object> saptParams = new HashMap<String, Object>();
		try {
			saptParams.put("deletePrqTrans", saptr.getDeletePrqTrans());
			saptParams.put("savePrqTrans", saptr.getSavePrqTrans());
			
			HashMap<String, Object> response = acctServDao.saveAcsePrqTrans(saptParams);
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
	public RetrieveAcseCvResponse retrieveAcseCv(RetrieveAcseCvRequest raptp) throws SQLException {
		RetrieveAcseCvResponse racResponse = new RetrieveAcseCvResponse();
		HashMap<String, Object> racParams = new HashMap<String, Object>();
		racParams.put("tranId",raptp.getTranId());
		racParams.put("cvGenNo",raptp.getCvGenNo());
		racParams.put("cvDateFrom",raptp.getCvDateFrom());
		racParams.put("cvDateTo",raptp.getCvDateTo());
		racParams.put("cvStatusDesc",raptp.getCvStatusDesc());
		racParams.put("payee",raptp.getPayee());
		racParams.put("particulars",raptp.getParticulars());
		racParams.put("cvAmt",raptp.getCvAmt());
		racResponse.setAcseCvList(acctServDao.retrieveAcseCv(racParams));
		logger.info("RetrieveAcseCvResponse : " + racResponse);
		return racResponse;
	}
	
	@Override
	public SaveAcseCvResponse saveAcseCv(SaveAcseCvRequest sacr) throws SQLException {
		SaveAcseCvResponse sacResponse = new SaveAcseCvResponse();
		HashMap<String, Object> sacParams = new HashMap<String, Object>();
		try {
			sacParams.put("tranIdOut","");
			sacParams.put("mainTranIdOut","");
			sacParams.put("tranId",sacr.getTranId());
	        sacParams.put("cvYear", sacr.getCvYear());
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
	        
	        HashMap<String, Object> response = acctServDao.saveAcseCv(sacParams);
	        sacResponse.setReturnCode((Integer) response.get("errorCode"));
	        sacResponse.setTranIdOut((Integer) response.get("tranIdOut"));
	        sacResponse.setMainTranIdOut((Integer) response.get("mainTranIdOut"));
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
}
