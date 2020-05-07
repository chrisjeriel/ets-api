package ph.cpi.rest.api.model.request;

public class RetrieveExtractToCsvRequest {
	private String extractUser;
	private String reportName;
	private String prodDate;
	private String paramDate;
	private String paramCurrency;

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

	public String getProdDate() {
		return prodDate;
	}

	public void setProdDate(String prodDate) {
		this.prodDate = prodDate;
	}

	public String getParamDate() {
		return paramDate;
	}

	public void setParamDate(String paramDate) {
		this.paramDate = paramDate;
	}

	public String getParamCurrency() {
		return paramCurrency;
	}

	public void setParamCurrency(String paramCurrency) {
		this.paramCurrency = paramCurrency;
	}

	@Override
	public String toString() {
		return "RetrieveExtractToCsvRequest [extractUser=" + extractUser + ", reportName=" + reportName + ", prodDate="
				+ prodDate + ", paramDate=" + paramDate + ", paramCurrency=" + paramCurrency + "]";
	}
}
