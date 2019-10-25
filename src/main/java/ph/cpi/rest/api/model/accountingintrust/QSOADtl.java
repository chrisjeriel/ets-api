package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class QSOADtl {

	private Integer qsoaId;
	private Integer qsoaMapNo;
	private String particulars;
	private BigDecimal debitAmt;
	private BigDecimal creditAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
	}
	public Integer getQsoaMapNo() {
		return qsoaMapNo;
	}
	public void setQsoaMapNo(Integer qsoaMapNo) {
		this.qsoaMapNo = qsoaMapNo;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public BigDecimal getDebitAmt() {
		return debitAmt;
	}
	public void setDebitAmt(BigDecimal debitAmt) {
		this.debitAmt = debitAmt;
	}
	public BigDecimal getCreditAmt() {
		return creditAmt;
	}
	public void setCreditAmt(BigDecimal creditAmt) {
		this.creditAmt = creditAmt;
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
		return "QSOADtl [qsoaId=" + qsoaId + ", qsoaMapNo=" + qsoaMapNo + ", particulars=" + particulars + ", debitAmt="
				+ debitAmt + ", creditAmt=" + creditAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
