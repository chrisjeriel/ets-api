package ph.cpi.rest.api.model.request;

public class RetrieveOrSFeeDtlDistRequest {
	private String cedingId;
	private String sFeeYear;
	private String sFeeQtr;
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getsFeeYear() {
		return sFeeYear;
	}
	public void setsFeeYear(String sFeeYear) {
		this.sFeeYear = sFeeYear;
	}
	public String getsFeeQtr() {
		return sFeeQtr;
	}
	public void setsFeeQtr(String sFeeQtr) {
		this.sFeeQtr = sFeeQtr;
	}
	@Override
	public String toString() {
		return "RetrieveOrSFeeDtlDistRequest [cedingId=" + cedingId + ", sFeeYear=" + sFeeYear + ", sFeeQtr=" + sFeeQtr
				+ "]";
	}
}
