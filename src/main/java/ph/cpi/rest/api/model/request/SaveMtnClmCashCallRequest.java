package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnClmCashCallRequest {
	
	private List<CashCall> saveCashCall;
	private List<CashCall> delCashCall;
	
	public List<CashCall> getSaveCashCall() {
		return saveCashCall;
	}
	public void setSaveCashCall(List<CashCall> saveCashCall) {
		this.saveCashCall = saveCashCall;
	}
	public List<CashCall> getDelCashCall() {
		return delCashCall;
	}
	public void setDelCashCall(List<CashCall> delCashCall) {
		this.delCashCall = delCashCall;
	}
	
	@Override
	public String toString() {
		return "SaveMtnClmCashCallRequest [saveCashCall=" + saveCashCall + ", delCashCall=" + delCashCall + "]";
	}
}

class CashCall {

	private Integer treatyId;
	private String treatyCedId;
	private String currCd;
	private Integer histNo;
	private Integer amount;
	private String effDateFrom;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getTreatyId() {
		return treatyId;
	}

	public void setTreatyId(Integer treatyId) {
		this.treatyId = treatyId;
	}

	public String getTreatyCedId() {
		return treatyCedId;
	}

	public void setTreatyCedId(String treatyCedId) {
		this.treatyCedId = treatyCedId;
	}

	public String getCurrCd() {
		return currCd;
	}

	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}

	public Integer getHistNo() {
		return histNo;
	}

	public void setHistNo(Integer histNo) {
		this.histNo = histNo;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getEffDateFrom() {
		return effDateFrom;
	}

	public void setEffDateFrom(String effDateFrom) {
		this.effDateFrom = effDateFrom;
	}

	public String getActiveTag() {
		return activeTag;
	}

	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
		return "CashCall [treatyId=" + treatyId + ", treatyCedId=" + treatyCedId + ", currCd=" + currCd + ", histNo="
				+ histNo + ", amount=" + amount + ", effDateFrom=" + effDateFrom + ", activeTag=" + activeTag
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
}