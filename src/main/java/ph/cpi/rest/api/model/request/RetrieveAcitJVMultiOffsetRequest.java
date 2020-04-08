package ph.cpi.rest.api.model.request;

public class RetrieveAcitJVMultiOffsetRequest {
	
	private Integer tranId;
	private String cedingId;
	private String from;
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
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
	@Override
	public String toString() {
		return "RetrieveAcitJVMultiOffsetRequest [tranId=" + tranId + ", cedingId=" + cedingId + ", from=" + from + "]";
	}

}
