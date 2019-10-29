package ph.cpi.rest.api.model.accountingservice;

import org.joda.time.DateTime;

public class AcseCancelledOR {
	private String tranClass;
	private String tranId;
	private String orNo;
	private String payor;
	private DateTime orDate;
	private Integer tranTypeCd;
	private String tranTypeDesc;
	private String orStatus;
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
	public String getTranId() {
		return tranId;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getOrNo() {
		return orNo;
	}
	public void setOrNo(String orNo) {
		this.orNo = orNo;
	}
	public String getPayor() {
		return payor;
	}
	public void setPayor(String payor) {
		this.payor = payor;
	}
	public DateTime getOrDate() {
		return orDate;
	}
	public void setOrDate(DateTime orDate) {
		this.orDate = orDate;
	}
	public Integer getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(Integer tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getTranTypeDesc() {
		return tranTypeDesc;
	}
	public void setTranTypeDesc(String tranTypeDesc) {
		this.tranTypeDesc = tranTypeDesc;
	}
	public String getOrStatus() {
		return orStatus;
	}
	public void setOrStatus(String orStatus) {
		this.orStatus = orStatus;
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
		return "AcseCancelledOR [tranClass=" + tranClass + ", tranId=" + tranId + ", orNo=" + orNo + ", payor=" + payor
				+ ", orDate=" + orDate + ", tranTypeCd=" + tranTypeCd + ", tranTypeDesc=" + tranTypeDesc + ", orStatus="
				+ orStatus + ", status=" + status + ", particulars=" + particulars + ", amount=" + amount
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
	
}
