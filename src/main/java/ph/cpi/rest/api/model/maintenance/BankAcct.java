package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class BankAcct {
	private Integer bankCd;
	private Integer bankAcctCd;
	private String accountNo;
	private String accountName;
	private String acctStatus;
	private String acctStatusName;
	private String currCd;
	private String bankBranch;
	private String accountType;
	private String acctTypeName;
	private DateTime openDate;
	private DateTime closeDate;
	private Integer acItGlDepNo;
	private Integer acSeGlDepNo;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String dcbTag;
	private String okDelete;
	private String bankName;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getOkDelete() {
		return okDelete;
	}
	public void setOkDelete(String okDelete) {
		this.okDelete = okDelete;
	}
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
	public String getAcctStatusName() {
		return acctStatusName;
	}
	public void setAcctStatusName(String acctStatusName) {
		this.acctStatusName = acctStatusName;
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
	public String getAcctTypeName() {
		return acctTypeName;
	}
	public void setAcctTypeName(String acctTypeName) {
		this.acctTypeName = acctTypeName;
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
	public Integer getAcItGlDepNo() {
		return acItGlDepNo;
	}
	public void setAcItGlDepNo(Integer acItGlDepNo) {
		this.acItGlDepNo = acItGlDepNo;
	}
	public Integer getAcSeGlDepNo() {
		return acSeGlDepNo;
	}
	public void setAcSeGlDepNo(Integer acSeGlDepNo) {
		this.acSeGlDepNo = acSeGlDepNo;
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
	public String getDcbTag() {
		return dcbTag;
	}
	public void setDcbTag(String dcbTag) {
		this.dcbTag = dcbTag;
	}
	@Override
	public String toString() {
		return "BankAcct [bankCd=" + bankCd + ", bankAcctCd=" + bankAcctCd
				+ ", accountNo=" + accountNo + ", accountName=" + accountName
				+ ", acctStatus=" + acctStatus + ", acctStatusName="
				+ acctStatusName + ", currCd=" + currCd + ", bankBranch="
				+ bankBranch + ", accountType=" + accountType
				+ ", acctTypeName=" + acctTypeName + ", openDate=" + openDate
				+ ", closeDate=" + closeDate + ", acItGlDepNo=" + acItGlDepNo
				+ ", acSeGlDepNo=" + acSeGlDepNo + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", dcbTag=" + dcbTag + ", okDelete=" + okDelete
				+ ", bankName=" + bankName + "]";
	}
	
}
