package ph.cpi.rest.api.model.request;

public class RetrieveAcitJVCedRepLossRequest {

	private String cedingId;

	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	@Override
	public String toString() {
		return "RetrieveAcitJVCedRepLossRequest [cedingId=" + cedingId + "]";
	}
}
