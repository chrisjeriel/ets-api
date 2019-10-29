package ph.cpi.rest.api.model.accountingservice;

import org.joda.time.DateTime;

public class AcseCancelledCV {
	private String tranClass;
	private Integer tranId;
	private String cvNo;
	private String payee;
	private DateTime cvDate;
	private String cvStatus;
	private String status;
	private String particulars;
	private String amount;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getCvNo() {
		return cvNo;
	}
	public void setCvNo(String cvNo) {
		this.cvNo = cvNo;
	}
	public String getPayee() {
		return payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}
	public DateTime getCvDate() {
		return cvDate;
	}
	public void setCvDate(DateTime cvDate) {
		this.cvDate = cvDate;
	}
	public String getCvStatus() {
		return cvStatus;
	}
	public void setCvStatus(String cvStatus) {
		this.cvStatus = cvStatus;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
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
		return "AcseCancelledCV [tranClass=" + tranClass + ", tranId=" + tranId + ", cvNo=" + cvNo + ", payee=" + payee
				+ ", cvDate=" + cvDate + ", cvStatus=" + cvStatus + ", status=" + status + ", particulars="
				+ particulars + ", amount=" + amount + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
