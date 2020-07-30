package ph.cpi.rest.api.model.request;

public class RetrieveMtnAcitChartAcctLovRequest {

	private String glShortCd;
	
	public String getGlShortCd() {
		return glShortCd;
	}
	public void setGlShortCd(String glShortCd) {
		this.glShortCd = glShortCd;
	}
	@Override
	public String toString() {
		return "RetrieveMtnAcitChartAcctLovRequest [glShortCd=" + glShortCd + "]";
	}
}
