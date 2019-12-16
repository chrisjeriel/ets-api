package ph.cpi.rest.api.model.request;

public class RetrieveAcitUnappliedCollRequest {
	
	private String cedingId;

	public String getCedingId() {
		return cedingId;
	}

	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}

	@Override
	public String toString() {
		return "RetrieveAcitUnappliedCollRequest [cedingId=" + cedingId + "]";
	}
	
}
