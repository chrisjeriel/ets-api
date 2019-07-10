package ph.cpi.rest.api.model.request;

import java.util.List;

import org.joda.time.DateTime;

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
	private DateTime effDateFrom;
	private String activeTag;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
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
	public DateTime getEffDateFrom() {
		return effDateFrom;
	}
	public void setEffDateFrom(DateTime effDateFrom) {
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
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "CashCall [treatyId=" + treatyId + ", treatyCedId=" + treatyCedId + ", currCd=" + currCd + ", histNo="
				+ histNo + ", effDateFrom=" + effDateFrom + ", activeTag=" + activeTag + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}