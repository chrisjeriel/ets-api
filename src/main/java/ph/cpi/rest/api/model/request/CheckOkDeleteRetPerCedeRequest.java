package ph.cpi.rest.api.model.request;

public class CheckOkDeleteRetPerCedeRequest {
	private String retHistId;
	private String currencyCd;
	public String getRetHistId() {
		return retHistId;
	}
	public void setRetHistId(String retHistId) {
		this.retHistId = retHistId;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	@Override
	public String toString() {
		return "CheckOkDeleteRetPerCedeRequest [retHistId=" + retHistId + ", currencyCd=" + currencyCd + "]";
	}
}
