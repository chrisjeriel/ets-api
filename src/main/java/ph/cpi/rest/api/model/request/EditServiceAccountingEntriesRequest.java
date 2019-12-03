package ph.cpi.rest.api.model.request;

import java.util.List;

public class EditServiceAccountingEntriesRequest {
	
	private String tranId;
	private String histNo;
	private String reason;
	private String createUser;
	private String updateUser;
	private List<EdtAcctEntServ> saveList;
	private List<EdtAcctEntServ> delList;
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getHistNo() {
		return histNo;
	}
	public void setHistNo(String histNo) {
		this.histNo = histNo;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public List<EdtAcctEntServ> getSaveList() {
		return saveList;
	}
	public void setSaveList(List<EdtAcctEntServ> saveList) {
		this.saveList = saveList;
	}
	public List<EdtAcctEntServ> getDelList() {
		return delList;
	}
	public void setDelList(List<EdtAcctEntServ> delList) {
		this.delList = delList;
	}
	@Override
	public String toString() {
		return "EditServiceAccountingEntriesRequest [tranId=" + tranId + ", histNo=" + histNo + ", reason=" + reason
				+ ", createUser=" + createUser + ", updateUser=" + updateUser + ", saveList=" + saveList + ", delList="
				+ delList + "]";
	}
}


class EdtAcctEntServ{
	private String tranId;
	private String entryId;
	private String glAcctId;
	private String slTypeCd;
	private String slCd;
	private String creditAmt;
	private String debitAmt;
	private String foreignCreditAmt;
	private String foreignDebitAmt;
	private String autoTag;
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
	public String getEntryId() {
		return entryId;
	}
	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}
	public String getGlAcctId() {
		return glAcctId;
	}
	public void setGlAcctId(String glAcctId) {
		this.glAcctId = glAcctId;
	}
	public String getSlTypeCd() {
		return slTypeCd;
	}
	public void setSlTypeCd(String slTypeCd) {
		this.slTypeCd = slTypeCd;
	}
	public String getSlCd() {
		return slCd;
	}
	public void setSlCd(String slCd) {
		this.slCd = slCd;
	}
	public String getCreditAmt() {
		return creditAmt;
	}
	public void setCreditAmt(String creditAmt) {
		this.creditAmt = creditAmt;
	}
	public String getDebitAmt() {
		return debitAmt;
	}
	public void setDebitAmt(String debitAmt) {
		this.debitAmt = debitAmt;
	}
	public String getForeignCreditAmt() {
		return foreignCreditAmt;
	}
	public void setForeignCreditAmt(String foreignCreditAmt) {
		this.foreignCreditAmt = foreignCreditAmt;
	}
	public String getForeignDebitAmt() {
		return foreignDebitAmt;
	}
	public void setForeignDebitAmt(String foreignDebitAmt) {
		this.foreignDebitAmt = foreignDebitAmt;
	}
	public String getAutoTag() {
		return autoTag;
	}
	public void setAutoTag(String autoTag) {
		this.autoTag = autoTag;
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
		return "EdtAcctEntServ [tranId=" + tranId + ", entryId=" + entryId + ", glAcctId=" + glAcctId + ", slTypeCd="
				+ slTypeCd + ", slCd=" + slCd + ", creditAmt=" + creditAmt + ", debitAmt=" + debitAmt
				+ ", foreignCreditAmt=" + foreignCreditAmt + ", foreignDebitAmt=" + foreignDebitAmt + ", autoTag="
				+ autoTag + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
