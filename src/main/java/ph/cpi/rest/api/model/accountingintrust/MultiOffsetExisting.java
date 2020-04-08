package ph.cpi.rest.api.model.accountingintrust;

public class MultiOffsetExisting {

	private String cedingId;
	private String cedingName;
	
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	@Override
	public String toString() {
		return "MultiOffsetExisting [cedingId=" + cedingId + ", cedingName=" + cedingName + "]";
	}
}
