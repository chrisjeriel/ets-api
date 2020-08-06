package ph.cpi.rest.api.model.request;

public class RetrieveMtnPremPlanRequest {
	private String currencyCd;
	private String lineCd;
	private String planYear;
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getPlanYear() {
		return planYear;
	}
	public void setPlanYear(String planYear) {
		this.planYear = planYear;
	}
	@Override
	public String toString() {
		return "RetrieveMtnPremPlanRequest [currencyCd=" + currencyCd + ", lineCd=" + lineCd + ", planYear=" + planYear
				+ "]";
	}
	
}
