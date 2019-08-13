package ph.cpi.rest.api.model.request;

public class RetrieveAcitUPRPerCedeRequest {
	private String extMm;
	private String extYear;
	private String extMethod;
	private String cedingId;
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
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	@Override
	public String toString() {
		return "RetrieveAcitUPRPerCedeRequest [extMm=" + extMm + ", extYear=" + extYear + ", extMethod=" + extMethod
				+ ", cedingId=" + cedingId + "]";
	}
	
}
