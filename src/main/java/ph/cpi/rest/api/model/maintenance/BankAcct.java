package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class BankAcct {
	private Integer bankCd;
	private Integer bankAcctCd;
	private String accountNo;
	private String accountName;
	private String acctStatus;
	private String currCd;
	private String bankBranch;
	private String accountType;
	private DateTime openDate;
	private DateTime closeDate;
	private Integer defaultAcitGl;
	private Integer defaultAcseGl;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public Integer getBankCd() {
		return bankCd;
	}
	public void setBankCd(Integer bankCd) {
		this.bankCd = bankCd;
	}
	public Integer getBankAcctCd() {
		return bankAcctCd;
	}
	public void setBankAcctCd(Integer bankAcctCd) {
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
	public DateTime getOpenDate() {
		return openDate;
	}
	public void setOpenDate(DateTime openDate) {
		this.openDate = openDate;
	}
	public DateTime getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(DateTime closeDate) {
		this.closeDate = closeDate;
	}
	public Integer getDefaultAcitGl() {
		return defaultAcitGl;
	}
	public void setDefaultAcitGl(Integer defaultAcitGl) {
		this.defaultAcitGl = defaultAcitGl;
	}
	public Integer getDefaultAcseGl() {
		return defaultAcseGl;
	}
	public void setDefaultAcseGl(Integer defaultAcseGl) {
		this.defaultAcseGl = defaultAcseGl;
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
		return "BankAcct [bankCd=" + bankCd + ", bankAcctCd=" + bankAcctCd + ", accountNo=" + accountNo
				+ ", accountName=" + accountName + ", acctStatus=" + acctStatus + ", currCd=" + currCd + ", bankBranch="
				+ bankBranch + ", accountType=" + accountType + ", openDate=" + openDate + ", closeDate=" + closeDate
				+ ", defaultAcitGl=" + defaultAcitGl + ", defaultAcseGl=" + defaultAcseGl + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
