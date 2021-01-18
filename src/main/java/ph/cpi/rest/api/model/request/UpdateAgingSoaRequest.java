package ph.cpi.rest.api.model.request;

public class UpdateAgingSoaRequest {

	private String eomDate;
	private String reportId;
	
	public String getEomDate() {
		return eomDate;
	}
	public void setEomDate(String eomDate) {
		this.eomDate = eomDate;
	}
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	@Override
	public String toString() {
		return "UpdateAgingSoaRequest [eomDate=" + eomDate + ", reportId=" + reportId + "]";
	}
}
