package ph.cpi.rest.api.model.request;

public class RetrieveExtractToCsvRequest {
	private String extractUser;
	private String reportName;

	public String getExtractUser() {
		return extractUser;
	}

	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	@Override
	public String toString() {
		return "RetrieveExtractToCsvRequest [extractUser=" + extractUser + ", reportName=" + reportName + "]";
	}
}
