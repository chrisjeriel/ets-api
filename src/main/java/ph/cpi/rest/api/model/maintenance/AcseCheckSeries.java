package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class AcseCheckSeries {
	private Integer bank;
	private Integer bankAcct;
	private Integer checkNo;
	private String checkPrefix;
	private Integer tranId;
	private String usedTag;
	private String checkStatus;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getBank() {
		return bank;
	}
	public void setBank(Integer bank) {
		this.bank = bank;
	}
	public Integer getBankAcct() {
		return bankAcct;
	}
	public void setBankAcct(Integer bankAcct) {
		this.bankAcct = bankAcct;
	}
	public Integer getCheckNo() {
		return checkNo;
	}
	public void setCheckNo(Integer checkNo) {
		this.checkNo = checkNo;
	}
	public String getCheckPrefix() {
		return checkPrefix;
	}
	public void setCheckPrefix(String checkPrefix) {
		this.checkPrefix = checkPrefix;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getUsedTag() {
		return usedTag;
	}
	public void setUsedTag(String usedTag) {
		this.usedTag = usedTag;
	}
	public String getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
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
		return "AcseCheckSeries [bank=" + bank + ", bankAcct=" + bankAcct + ", checkNo=" + checkNo + ", checkPrefix="
				+ checkPrefix + ", tranId=" + tranId + ", usedTag=" + usedTag + ", checkStatus=" + checkStatus
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
