package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveAcseAcctEntriesRequest {
	private String tranId;
	private String forApproval;
	private List<acctEntries> saveList;
	private List<acctEntries> delList;
	
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getForApproval() {
		return forApproval;
	}
	public void setForApproval(String forApproval) {
		this.forApproval = forApproval;
	}
	public List<acctEntries> getSaveList() {
		return saveList;
	}
	public void setSaveList(List<acctEntries> saveList) {
		this.saveList = saveList;
	}
	public List<acctEntries> getDelList() {
		return delList;
	}
	public void setDelList(List<acctEntries> delList) {
		this.delList = delList;
	}
	@Override
	public String toString() {
		return "SaveAcseAcctEntriesRequest [tranId=" + tranId + ", forApproval=" + forApproval + ", saveList="
				+ saveList + ", delList=" + delList + "]";
	}
	
}

@Alias ("ACSEacctEntry")
class acctEntries {
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
		return "acctEntries [tranId=" + tranId + ", entryId=" + entryId + ", glAcctId=" + glAcctId + ", slTypeCd="
				+ slTypeCd + ", slCd=" + slCd + ", creditAmt=" + creditAmt + ", debitAmt=" + debitAmt
				+ ", foreignCreditAmt=" + foreignCreditAmt + ", foreignDebitAmt=" + foreignDebitAmt + ", autoTag="
				+ autoTag + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}