package ph.cpi.rest.api.model.request;

public class RetrieveClmDistRequest {
	private String claimId;
	private String projId;
	private String histNo;
	private String histType;
	private String bookingMonth;
	private String bookingYear;
	private String distStatus;
	private String histCategory;
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getProjId() {
		return projId;
	}
	public void setProjId(String projId) {
		this.projId = projId;
	}
	public String getHistNo() {
		return histNo;
	}
	public void setHistNo(String histNo) {
		this.histNo = histNo;
	}
	public String getHistType() {
		return histType;
	}
	public void setHistType(String histType) {
		this.histType = histType;
	}
	public String getBookingMonth() {
		return bookingMonth;
	}
	public void setBookingMonth(String bookingMonth) {
		this.bookingMonth = bookingMonth;
	}
	public String getBookingYear() {
		return bookingYear;
	}
	public void setBookingYear(String bookingYear) {
		this.bookingYear = bookingYear;
	}
	public String getDistStatus() {
		return distStatus;
	}
	public void setDistStatus(String distStatus) {
		this.distStatus = distStatus;
	}
	public String getHistCategory() {
		return histCategory;
	}
	public void setHistCategory(String histCategory) {
		this.histCategory = histCategory;
	}
	@Override
	public String toString() {
		return "RetrieveClmDistRequest [claimId=" + claimId + ", projId=" + projId + ", histNo=" + histNo
				+ ", histType=" + histType + ", bookingMonth=" + bookingMonth + ", bookingYear=" + bookingYear
				+ ", distStatus=" + distStatus + ", histCategory=" + histCategory + "]";
	}
	
}
