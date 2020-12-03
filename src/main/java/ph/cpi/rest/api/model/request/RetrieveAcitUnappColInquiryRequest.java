package ph.cpi.rest.api.model.request;

public class RetrieveAcitUnappColInquiryRequest {

	private String cedingId;
	private String currCd;
	
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
		return "RetrieveAcitUnappColInquiryRequest [cedingId=" + cedingId + ", currCd=" + currCd + "]";
	}
}
