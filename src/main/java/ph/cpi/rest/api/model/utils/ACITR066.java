package ph.cpi.rest.api.model.utils;

public class ACITR066 {

	private String reportId;
	private String eomDate;
	private String cedingId;
	private String currCd;
	
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getEomDate() {
		return eomDate;
	}
	public void setEomDate(String eomDate) {
		this.eomDate = eomDate;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	@Override
	public String toString() {
		return "ACITR066 [reportId=" + reportId + ", eomDate=" + eomDate + ", cedingId=" + cedingId + ", currCd="
				+ currCd + "]";
	}
}
