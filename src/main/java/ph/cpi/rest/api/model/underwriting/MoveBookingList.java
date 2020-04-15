package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class MoveBookingList {
	private String policyId;
	private String policyNo;
	private DateTime bookingDate;
	private String distStatus;
	private String withInst;
	private String cessionDesc;
	private String createUser;
	private BigDecimal totalSi;
	private BigDecimal totalPrem;
	private Integer instNo;
	private String insuredDesc;
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public DateTime getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(DateTime bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getDistStatus() {
		return distStatus;
	}
	public void setDistStatus(String distStatus) {
		this.distStatus = distStatus;
	}
	public String getWithInst() {
		return withInst;
	}
	public void setWithInst(String withInst) {
		this.withInst = withInst;
	}
	public String getCessionDesc() {
		return cessionDesc;
	}
	public void setCessionDesc(String cessionDesc) {
		this.cessionDesc = cessionDesc;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public BigDecimal getTotalSi() {
		return totalSi;
	}
	public void setTotalSi(BigDecimal totalSi) {
		this.totalSi = totalSi;
	}
	public BigDecimal getTotalPrem() {
		return totalPrem;
	}
	public void setTotalPrem(BigDecimal totalPrem) {
		this.totalPrem = totalPrem;
	}
	public Integer getInstNo() {
		return instNo;
	}
	public void setInstNo(Integer instNo) {
		this.instNo = instNo;
	}
	@Override
	public String toString() {
		return "MoveBookingList [policyId=" + policyId + ", policyNo=" + policyNo + ", bookingDate=" + bookingDate
				+ ", distStatus=" + distStatus + ", withInst=" + withInst + ", cessionDesc=" + cessionDesc
				+ ", createUser=" + createUser + ", totalSi=" + totalSi + ", totalPrem=" + totalPrem + ", instNo="
				+ instNo + ", insuredDesc=" + insuredDesc + "]";
	}
	
	
}
