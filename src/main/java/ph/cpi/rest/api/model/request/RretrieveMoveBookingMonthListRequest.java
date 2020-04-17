package ph.cpi.rest.api.model.request;

public class RretrieveMoveBookingMonthListRequest {
	private String policyNo;
	private String distStatus;
	private String bookingFrom;
	private String bookingTo;
	private String cessionDesc;
	private String createdBy;
	private String totalSiFrom;
	private String totalSiTo;
	private String totalPremFrom;
	private String totalPremTo;
	private String insuredDesc;
	private String instNo;
	
	public String getInstNo() {
		return instNo;
	}
	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getDistStatus() {
		return distStatus;
	}
	public void setDistStatus(String distStatus) {
		this.distStatus = distStatus;
	}
	public String getBookingFrom() {
		return bookingFrom;
	}
	public void setBookingFrom(String bookingFrom) {
		this.bookingFrom = bookingFrom;
	}
	public String getBookingTo() {
		return bookingTo;
	}
	public void setBookingTo(String bookingTo) {
		this.bookingTo = bookingTo;
	}
	public String getCessionDesc() {
		return cessionDesc;
	}
	public void setCessionDesc(String cessionDesc) {
		this.cessionDesc = cessionDesc;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getTotalSiFrom() {
		return totalSiFrom;
	}
	public void setTotalSiFrom(String totalSiFrom) {
		this.totalSiFrom = totalSiFrom;
	}
	public String getTotalSiTo() {
		return totalSiTo;
	}
	public void setTotalSiTo(String totalSiTo) {
		this.totalSiTo = totalSiTo;
	}
	public String getTotalPremFrom() {
		return totalPremFrom;
	}
	public void setTotalPremFrom(String totalPremFrom) {
		this.totalPremFrom = totalPremFrom;
	}
	public String getTotalPremTo() {
		return totalPremTo;
	}
	public void setTotalPremTo(String totalPremTo) {
		this.totalPremTo = totalPremTo;
	}
	@Override
	public String toString() {
		return "RretrieveMoveBookingMonthListRequest [policyNo=" + policyNo + ", distStatus=" + distStatus
				+ ", bookingFrom=" + bookingFrom + ", bookingTo=" + bookingTo + ", cessionDesc=" + cessionDesc
				+ ", createdBy=" + createdBy + ", totalSiFrom=" + totalSiFrom + ", totalSiTo=" + totalSiTo
				+ ", totalPremFrom=" + totalPremFrom + ", totalPremTo=" + totalPremTo + ", insuredDesc=" + insuredDesc
				+ ", instNo=" + instNo + "]";
	}
	
	
	
}
