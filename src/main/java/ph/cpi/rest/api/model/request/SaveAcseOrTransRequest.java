package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcseOrTransRequest {
	//ACSE_TRANSACTIONS
	private String tranId;			//same in ACSE_OFFICIAL_RECEIPT
	private String tranDate;		//same in ACSE_OFFICIAL_RECEIPT
	private String tranClass;
	private String tranTypeCd;		//same in ACSE_OFFICIAL_RECEIPT
	private String tranYear;
	private String tranClassNo;		//same in ACSE_OFFICIAL_RECEIPT
	private String tranStat;
	private String closeDate;
	private String deleteDate;
	private String postDate;
	private String createUser;		//same in ACSE_OFFICIAL_RECEIPT
	private String createDate;		//same in ACSE_OFFICIAL_RECEIPT
	private String updateUser;		//same in ACSE_OFFICIAL_RECEIPT
	private String updateDate;		//same in ACSE_OFFICIAL_RECEIPT
	
	//ACSE_OFFICIAL_RECEIPT
	private String orType;
	private String orStatus;
	private String dcbYear;
	private String dcbNo;
	private String dcbUserCd;
	private String dcbBank;
	private String dcbBankAcct;
	private String refNo;
	private String prNo;
	private String prDate;
	private String prPreparedBy;
	private String payeeNo;
	private String payeeClassCd;
	private String payor;
	private String mailAddress;
	private String bussTypeName;
	private String tin;
	private String particulars;
	private String currCd;
	private String currRate;
	private String orAmt;
	private String allocTag;
	private String allocTranId;
	
	//ACSE_OR_PAYTDTL
	private List<SaveOrPaytDtl> savePaytDtl;
	private List<SaveOrPaytDtl> delPaytDtl;
	
	//Utility
	private String isPrint;
	
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getTranDate() {
		return tranDate;
	}
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	public String getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(String tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getTranYear() {
		return tranYear;
	}
	public void setTranYear(String tranYear) {
		this.tranYear = tranYear;
	}
	public String getTranClassNo() {
		return tranClassNo;
	}
	public void setTranClassNo(String tranClassNo) {
		this.tranClassNo = tranClassNo;
	}
	public String getTranStat() {
		return tranStat;
	}
	public void setTranStat(String tranStat) {
		this.tranStat = tranStat;
	}
	public String getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}
	public String getDeleteDate() {
		return deleteDate;
	}
	public void setDeleteDate(String deleteDate) {
		this.deleteDate = deleteDate;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getOrType() {
		return orType;
	}
	public void setOrType(String orType) {
		this.orType = orType;
	}
	public String getOrStatus() {
		return orStatus;
	}
	public void setOrStatus(String orStatus) {
		this.orStatus = orStatus;
	}
	public String getDcbYear() {
		return dcbYear;
	}
	public void setDcbYear(String dcbYear) {
		this.dcbYear = dcbYear;
	}
	public String getDcbNo() {
		return dcbNo;
	}
	public void setDcbNo(String dcbNo) {
		this.dcbNo = dcbNo;
	}
	public String getDcbUserCd() {
		return dcbUserCd;
	}
	public void setDcbUserCd(String dcbUserCd) {
		this.dcbUserCd = dcbUserCd;
	}
	public String getDcbBank() {
		return dcbBank;
	}
	public void setDcbBank(String dcbBank) {
		this.dcbBank = dcbBank;
	}
	public String getDcbBankAcct() {
		return dcbBankAcct;
	}
	public void setDcbBankAcct(String dcbBankAcct) {
		this.dcbBankAcct = dcbBankAcct;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public String getPrDate() {
		return prDate;
	}
	public void setPrDate(String prDate) {
		this.prDate = prDate;
	}
	public String getPrPreparedBy() {
		return prPreparedBy;
	}
	public void setPrPreparedBy(String prPreparedBy) {
		this.prPreparedBy = prPreparedBy;
	}
	public String getPayeeNo() {
		return payeeNo;
	}
	public void setPayeeNo(String payeeNo) {
		this.payeeNo = payeeNo;
	}
	public String getPayeeClassCd() {
		return payeeClassCd;
	}
	public void setPayeeClassCd(String payeeClassCd) {
		this.payeeClassCd = payeeClassCd;
	}
	public String getPayor() {
		return payor;
	}
	public void setPayor(String payor) {
		this.payor = payor;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getBussTypeName() {
		return bussTypeName;
	}
	public void setBussTypeName(String bussTypeName) {
		this.bussTypeName = bussTypeName;
	}
	public String getTin() {
		return tin;
	}
	public void setTin(String tin) {
		this.tin = tin;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public String getCurrRate() {
		return currRate;
	}
	public void setCurrRate(String currRate) {
		this.currRate = currRate;
	}
	public String getOrAmt() {
		return orAmt;
	}
	public void setOrAmt(String orAmt) {
		this.orAmt = orAmt;
	}
	public String getAllocTag() {
		return allocTag;
	}
	public void setAllocTag(String allocTag) {
		this.allocTag = allocTag;
	}
	public String getAllocTranId() {
		return allocTranId;
	}
	public void setAllocTranId(String allocTranId) {
		this.allocTranId = allocTranId;
	}
	public List<SaveOrPaytDtl> getSavePaytDtl() {
		return savePaytDtl;
	}
	public void setSavePaytDtl(List<SaveOrPaytDtl> savePaytDtl) {
		this.savePaytDtl = savePaytDtl;
	}
	public List<SaveOrPaytDtl> getDelPaytDtl() {
		return delPaytDtl;
	}
	public void setDelPaytDtl(List<SaveOrPaytDtl> delPaytDtl) {
		this.delPaytDtl = delPaytDtl;
	}
	public String getIsPrint() {
		return isPrint;
	}
	public void setIsPrint(String isPrint) {
		this.isPrint = isPrint;
	}
	
	@Override
	public String toString() {
		return "SaveAcseOrTransRequest [tranId=" + tranId + ", tranDate=" + tranDate + ", tranClass=" + tranClass
				+ ", tranTypeCd=" + tranTypeCd + ", tranYear=" + tranYear + ", tranClassNo=" + tranClassNo
				+ ", tranStat=" + tranStat + ", closeDate=" + closeDate + ", deleteDate=" + deleteDate + ", postDate="
				+ postDate + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", orType=" + orType + ", orStatus=" + orStatus + ", dcbYear="
				+ dcbYear + ", dcbNo=" + dcbNo + ", dcbUserCd=" + dcbUserCd + ", dcbBank=" + dcbBank + ", dcbBankAcct="
				+ dcbBankAcct + ", refNo=" + refNo + ", prNo=" + prNo + ", prDate=" + prDate + ", prPreparedBy="
				+ prPreparedBy + ", payeeNo=" + payeeNo + ", payeeClassCd=" + payeeClassCd + ", payor=" + payor
				+ ", mailAddress=" + mailAddress + ", bussTypeName=" + bussTypeName + ", tin=" + tin + ", particulars="
				+ particulars + ", currCd=" + currCd + ", currRate=" + currRate + ", orAmt=" + orAmt + ", allocTag="
				+ allocTag + ", allocTranId=" + allocTranId + ", savePaytDtl=" + savePaytDtl + ", delPaytDtl="
				+ delPaytDtl + ", isPrint=" + isPrint + "]";
	}
}

class SaveOrPaytDtl{
	private String tranId;
	private String paytId;
	private String paytMode;
	private String currCd;
	private String currRate;
	private String paytAmt;
	private String bank;
	private String bankAcct;
	private String checkNo;
	private String checkDate;
	private String checkClass;
	private String remarks;
	
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getPaytId() {
		return paytId;
	}
	public void setPaytId(String paytId) {
		this.paytId = paytId;
	}
	public String getPaytMode() {
		return paytMode;
	}
	public void setPaytMode(String paytMode) {
		this.paytMode = paytMode;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public String getCurrRate() {
		return currRate;
	}
	public void setCurrRate(String currRate) {
		this.currRate = currRate;
	}
	public String getPaytAmt() {
		return paytAmt;
	}
	public void setPaytAmt(String paytAmt) {
		this.paytAmt = paytAmt;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBankAcct() {
		return bankAcct;
	}
	public void setBankAcct(String bankAcct) {
		this.bankAcct = bankAcct;
	}
	public String getCheckNo() {
		return checkNo;
	}
	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}
	public String getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}
	public String getCheckClass() {
		return checkClass;
	}
	public void setCheckClass(String checkClass) {
		this.checkClass = checkClass;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@Override
	public String toString() {
		return "SavePaytDtl [tranId=" + tranId + ", paytId=" + paytId + ", paytMode=" + paytMode + ", currCd=" + currCd
				+ ", currRate=" + currRate + ", paytAmt=" + paytAmt + ", bank=" + bank + ", bankAcct=" + bankAcct
				+ ", checkNo=" + checkNo + ", checkDate=" + checkDate + ", checkClass=" + checkClass + ", remarks="
				+ remarks + "]";
	}
}
