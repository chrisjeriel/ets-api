package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class QSOA {

	private Integer qsoaId;
	private String currCd;
	private String cedingId;
	private String cedingName;
	private DateTime quarterEnding;
	private String qsoaStatus;
	private String qsoaStatusDesc;
	private BigDecimal totalDebitAmt;
	private BigDecimal totalCreditAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String refNo;
	private BigDecimal netQsoaAmt;
	
	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public DateTime getQuarterEnding() {
		return quarterEnding;
	}
	public void setQuarterEnding(DateTime quarterEnding) {
		this.quarterEnding = quarterEnding;
	}
	public String getQsoaStatus() {
		return qsoaStatus;
	}
	public void setQsoaStatus(String qsoaStatus) {
		this.qsoaStatus = qsoaStatus;
	}
	public String getQsoaStatusDesc() {
		return qsoaStatusDesc;
	}
	public void setQsoaStatusDesc(String qsoaStatusDesc) {
		this.qsoaStatusDesc = qsoaStatusDesc;
	}
	public BigDecimal getTotalDebitAmt() {
		return totalDebitAmt;
	}
	public void setTotalDebitAmt(BigDecimal totalDebitAmt) {
		this.totalDebitAmt = totalDebitAmt;
	}
	public BigDecimal getTotalCreditAmt() {
		return totalCreditAmt;
	}
	public void setTotalCreditAmt(BigDecimal totalCreditAmt) {
		this.totalCreditAmt = totalCreditAmt;
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
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public BigDecimal getNetQsoaAmt() {
		return netQsoaAmt;
	}
	public void setNetQsoaAmt(BigDecimal netQsoaAmt) {
		this.netQsoaAmt = netQsoaAmt;
	}
	@Override
	public String toString() {
		return "QSOA [qsoaId=" + qsoaId + ", currCd=" + currCd + ", cedingId=" + cedingId + ", cedingName=" + cedingName
				+ ", quarterEnding=" + quarterEnding + ", qsoaStatus=" + qsoaStatus + ", qsoaStatusDesc="
				+ qsoaStatusDesc + ", totalDebitAmt=" + totalDebitAmt + ", totalCreditAmt=" + totalCreditAmt
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", refNo=" + refNo + ", netQsoaAmt=" + netQsoaAmt + "]";
	}
}
