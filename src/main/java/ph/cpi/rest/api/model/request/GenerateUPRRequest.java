package ph.cpi.rest.api.model.request;

public class GenerateUPRRequest {
	private String extMm;
	private String extYear;
	private String extMethod;
	private String extractUser;
	private String extractDate;
	public String getExtMm() {
		return extMm;
	}
	public void setExtMm(String extMm) {
		this.extMm = extMm;
	}
	public String getExtYear() {
		return extYear;
	}
	public void setExtYear(String extYear) {
		this.extYear = extYear;
	}
	public String getExtMethod() {
		return extMethod;
	}
	public void setExtMethod(String extMethod) {
		this.extMethod = extMethod;
	}
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public String getExtractDate() {
		return extractDate;
	}
	public void setExtractDate(String extractDate) {
		this.extractDate = extractDate;
	}
	@Override
	public String toString() {
		return "GenerateUPRRequest [extMm=" + extMm + ", extYear=" + extYear + ", extMethod=" + extMethod
				+ ", extractUser=" + extractUser + ", extractDate=" + extractDate + "]";
	}
	
}
