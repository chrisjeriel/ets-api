package ph.cpi.rest.api.model.request;

public class RetrieveAcitOsPolPremRequest {
	private String cedingId;
	private String from;
	private String to;
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	@Override
	public String toString() {
		return "RetrieveAcitOsPolPremRequest [cedingId=" + cedingId + ", from=" + from + ", to=" + to + "]";
	}
	
}
