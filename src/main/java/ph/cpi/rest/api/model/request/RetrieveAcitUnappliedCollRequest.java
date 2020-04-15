package ph.cpi.rest.api.model.request;

public class RetrieveAcitUnappliedCollRequest {
	
	private Integer unappliedId;
	private String cedingId;
	private String currCd;
	
	public Integer getUnappliedId() {
		return unappliedId;
	}
	public void setUnappliedId(Integer unappliedId) {
		this.unappliedId = unappliedId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	@Override
	public String toString() {
		return "RetrieveAcitUnappliedCollRequest [unappliedId=" + unappliedId + ", cedingId=" + cedingId + ", currCd="
				+ currCd + "]";
	}
}
