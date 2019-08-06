package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcitArInvPulloutRequest {
	private String tranId;
	private String billId;
	private String billType;
	private String totalLocalAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	private List<SaveArInvPullout> saveInvPullout;
	private List<SaveArInvPullout> delInvPullout;
	
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public String getTotalLocalAmt() {
		return totalLocalAmt;
	}
	public void setTotalLocalAmt(String totalLocalAmt) {
		this.totalLocalAmt = totalLocalAmt;
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
	public List<SaveArInvPullout> getSaveInvPullout() {
		return saveInvPullout;
	}
	public void setSaveInvPullout(List<SaveArInvPullout> saveInvPullout) {
		this.saveInvPullout = saveInvPullout;
	}
	public List<SaveArInvPullout> getDelInvPullout() {
		return delInvPullout;
	}
	public void setDelInvPullout(List<SaveArInvPullout> delInvPullout) {
		this.delInvPullout = delInvPullout;
	}
	
	@Override
	public String toString() {
		return "SaveAcitArInvPulloutRequest [tranId=" + tranId + ", billId=" + billId + ", billType=" + billType
				+ ", totalLocalAmt=" + totalLocalAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", saveInvPullout=" + saveInvPullout
				+ ", delInvPullout=" + delInvPullout + "]";
	}
}

class SaveArInvPullout{
	private String tranId;
	private String billId;
	private String itemNo;
	private String invtId;
	private String pulloutType;
	private String currCd;
	private String currRate;
	private String invtAmt;
	private String incomeAmt;
	private String bankCharge;
	private String whtaxAmt;
	private String maturityValue;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getInvtId() {
		return invtId;
	}
	public void setInvtId(String invtId) {
		this.invtId = invtId;
	}
	public String getPulloutType() {
		return pulloutType;
	}
	public void setPulloutType(String pulloutType) {
		this.pulloutType = pulloutType;
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
	public String getInvtAmt() {
		return invtAmt;
	}
	public void setInvtAmt(String invtAmt) {
		this.invtAmt = invtAmt;
	}
	public String getIncomeAmt() {
		return incomeAmt;
	}
	public void setIncomeAmt(String incomeAmt) {
		this.incomeAmt = incomeAmt;
	}
	public String getBankCharge() {
		return bankCharge;
	}
	public void setBankCharge(String bankCharge) {
		this.bankCharge = bankCharge;
	}
	public String getWhtaxAmt() {
		return whtaxAmt;
	}
	public void setWhtaxAmt(String whtaxAmt) {
		this.whtaxAmt = whtaxAmt;
	}
	public String getMaturityValue() {
		return maturityValue;
	}
	public void setMaturityValue(String maturityValue) {
		this.maturityValue = maturityValue;
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
	@Override
	public String toString() {
		return "SaveArInvPullout [tranId=" + tranId + ", billId=" + billId + ", itemNo=" + itemNo + ", invtId=" + invtId
				+ ", pulloutType=" + pulloutType + ", currCd=" + currCd + ", currRate=" + currRate + ", invtAmt="
				+ invtAmt + ", incomeAmt=" + incomeAmt + ", bankCharge=" + bankCharge + ", whtaxAmt=" + whtaxAmt
				+ ", maturityValue=" + maturityValue + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
