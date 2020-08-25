package ph.cpi.rest.api.model.request;

public class CopyMtnPremPlanRequest {
	private String fromCurrencyCd;
	private String fromLineCd;
	private String fromPlanYear;
	private String toCurrencyCd;
	private String toLineCd;
	private String toPlanYear;
	private String user;
	public String getFromCurrencyCd() {
		return fromCurrencyCd;
	}
	public void setFromCurrencyCd(String fromCurrencyCd) {
		this.fromCurrencyCd = fromCurrencyCd;
	}
	public String getFromLineCd() {
		return fromLineCd;
	}
	public void setFromLineCd(String fromLineCd) {
		this.fromLineCd = fromLineCd;
	}
	public String getFromPlanYear() {
		return fromPlanYear;
	}
	public void setFromPlanYear(String fromPlanYear) {
		this.fromPlanYear = fromPlanYear;
	}
	public String getToCurrencyCd() {
		return toCurrencyCd;
	}
	public void setToCurrencyCd(String toCurrencyCd) {
		this.toCurrencyCd = toCurrencyCd;
	}
	public String getToLineCd() {
		return toLineCd;
	}
	public void setToLineCd(String toLineCd) {
		this.toLineCd = toLineCd;
	}
	public String getToPlanYear() {
		return toPlanYear;
	}
	public void setToPlanYear(String toPlanYear) {
		this.toPlanYear = toPlanYear;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "CopyMtnPremPlanRequest [fromCurrencyCd=" + fromCurrencyCd + ", fromLineCd=" + fromLineCd
				+ ", fromPlanYear=" + fromPlanYear + ", toCurrencyCd=" + toCurrencyCd + ", toLineCd=" + toLineCd
				+ ", toPlanYear=" + toPlanYear + ", user=" + user + "]";
	}
	
	
}
