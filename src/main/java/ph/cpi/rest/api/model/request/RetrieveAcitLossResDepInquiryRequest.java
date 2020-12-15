package ph.cpi.rest.api.model.request;

public class RetrieveAcitLossResDepInquiryRequest {

	private String from;
	private String cedingId;
	private String currCd;
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
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
		return "RetrieveAcitLossResDepInquiryRequest [from=" + from + ", cedingId=" + cedingId + ", currCd=" + currCd
				+ "]";
	}
}
