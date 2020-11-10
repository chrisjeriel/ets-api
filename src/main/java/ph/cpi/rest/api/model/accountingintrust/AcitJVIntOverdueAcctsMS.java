package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitJVIntOverdueAcctsMS {
	  private Integer tranId;
	  private String itemNo;
	  private String cedingId;
	  private String cedingName;
	  private Integer policyId;
	  private String policyNo;
	  private Integer instNo;
	  private String soaNo;
	  private String coRefNo;
	  private DateTime effDate;
	  private DateTime dueDate;
	  private Integer actualOverdueDays;
	  private Integer overdueDaysWInt;
	  private BigDecimal interestRate;
	  private String autoTag;
	  private String currCd;
	  private BigDecimal currRate;
	  private BigDecimal balanceAmt;
	  private BigDecimal overdueInt;
	  private BigDecimal localAmt;
	  private String createUser;
	  private DateTime createDate;
	  private String updateUser;
	  private DateTime updateDate;
	  private String cedingAbbr;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
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
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public Integer getInstNo() {
		return instNo;
	}
	public void setInstNo(Integer instNo) {
		this.instNo = instNo;
	}
	public String getSoaNo() {
		return soaNo;
	}
	public void setSoaNo(String soaNo) {
		this.soaNo = soaNo;
	}
	public String getCoRefNo() {
		return coRefNo;
	}
	public void setCoRefNo(String coRefNo) {
		this.coRefNo = coRefNo;
	}
	public DateTime getEffDate() {
		return effDate;
	}
	public void setEffDate(DateTime effDate) {
		this.effDate = effDate;
	}
	public DateTime getDueDate() {
		return dueDate;
	}
	public void setDueDate(DateTime dueDate) {
		this.dueDate = dueDate;
	}
	public Integer getActualOverdueDays() {
		return actualOverdueDays;
	}
	public void setActualOverdueDays(Integer actualOverdueDays) {
		this.actualOverdueDays = actualOverdueDays;
	}
	public Integer getOverdueDaysWInt() {
		return overdueDaysWInt;
	}
	public void setOverdueDaysWInt(Integer overdueDaysWInt) {
		this.overdueDaysWInt = overdueDaysWInt;
	}
	public BigDecimal getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}
	public String getAutoTag() {
		return autoTag;
	}
	public void setAutoTag(String autoTag) {
		this.autoTag = autoTag;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public BigDecimal getCurrRate() {
		return currRate;
	}
	public void setCurrRate(BigDecimal currRate) {
		this.currRate = currRate;
	}
	public BigDecimal getBalanceAmt() {
		return balanceAmt;
	}
	public void setBalanceAmt(BigDecimal balanceAmt) {
		this.balanceAmt = balanceAmt;
	}
	public BigDecimal getOverdueInt() {
		return overdueInt;
	}
	public void setOverdueInt(BigDecimal overdueInt) {
		this.overdueInt = overdueInt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
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
	public String getCedingAbbr() {
		return cedingAbbr;
	}
	public void setCedingAbbr(String cedingAbbr) {
		this.cedingAbbr = cedingAbbr;
	}
	@Override
	public String toString() {
		return "AcitJVIntOverdueAcctsMS [tranId=" + tranId + ", itemNo=" + itemNo + ", cedingId=" + cedingId
				+ ", cedingName=" + cedingName + ", policyId=" + policyId + ", policyNo=" + policyNo + ", instNo="
				+ instNo + ", soaNo=" + soaNo + ", coRefNo=" + coRefNo + ", effDate=" + effDate + ", dueDate=" + dueDate
				+ ", actualOverdueDays=" + actualOverdueDays + ", overdueDaysWInt=" + overdueDaysWInt
				+ ", interestRate=" + interestRate + ", autoTag=" + autoTag + ", currCd=" + currCd + ", currRate="
				+ currRate + ", balanceAmt=" + balanceAmt + ", overdueInt=" + overdueInt + ", localAmt=" + localAmt
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", cedingAbbr=" + cedingAbbr + "]";
	}
	
	
}
