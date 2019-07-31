package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnBankAcctRequest {
	private List<SaveBankAcct> saveList;
	private List<SaveBankAcct> delList;
	public List<SaveBankAcct> getSaveList() {
		return saveList;
	}
	public void setSaveList(List<SaveBankAcct> saveList) {
		this.saveList = saveList;
	}
	public List<SaveBankAcct> getDelList() {
		return delList;
	}
	public void setDelList(List<SaveBankAcct> delList) {
		this.delList = delList;
	}
	@Override
	public String toString() {
		return "SaveMtnBankAcctRequest [saveList=" + saveList + ", delList=" + delList + "]";
	}
	
}


class SaveBankAcct{
	private String bankCd;
	private String bankAcctCd;
	private String accountNo;
	private String accountName;
	private String acctStatus;
	private String currCd;
	private String bankBranch;
	private String accountType;
	private String openDate;
	private String closeDate;
	private String acitGlDepNo;
	private String acseGlDepNo;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getBankCd() {
		return bankCd;
	}
	public void setBankCd(String bankCd) {
		this.bankCd = bankCd;
	}
	public String getBankAcctCd() {
		return bankAcctCd;
	}
	public void setBankAcctCd(String bankAcctCd) {
		this.bankAcctCd = bankAcctCd;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAcctStatus() {
		return acctStatus;
	}
	public void setAcctStatus(String acctStatus) {
		this.acctStatus = acctStatus;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getOpenDate() {
		return openDate;
	}
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}
	public String getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}
	public String getAcitGlDepNo() {
		return acitGlDepNo;
	}
	public void setAcitGlDepNo(String acitGlDepNo) {
		this.acitGlDepNo = acitGlDepNo;
	}
	public String getAcseGlDepNo() {
		return acseGlDepNo;
	}
	public void setAcseGlDepNo(String acseGlDepNo) {
		this.acseGlDepNo = acseGlDepNo;
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
		return "BankAcct [bankCd=" + bankCd + ", bankAcctCd=" + bankAcctCd + ", accountNo=" + accountNo
				+ ", accountName=" + accountName + ", acctStatus=" + acctStatus + ", currCd=" + currCd + ", bankBranch="
				+ bankBranch + ", accountType=" + accountType + ", openDate=" + openDate + ", closeDate=" + closeDate
				+ ", acitGlDepNo=" + acitGlDepNo + ", acseGlDepNo=" + acseGlDepNo + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}