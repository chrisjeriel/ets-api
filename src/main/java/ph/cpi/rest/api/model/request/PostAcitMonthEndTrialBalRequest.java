package ph.cpi.rest.api.model.request;

public class PostAcitMonthEndTrialBalRequest {

	private String eomDate;
	private Integer eomMm;
	private Integer eomYear;
	private String eomUser;
	
	public String getEomDate() {
		return eomDate;
	}
	public void setEomDate(String eomDate) {
		this.eomDate = eomDate;
	}
	public Integer getEomMm() {
		return eomMm;
	}
	public void setEomMm(Integer eomMm) {
		this.eomMm = eomMm;
	}
	public Integer getEomYear() {
		return eomYear;
	}
	public void setEomYear(Integer eomYear) {
		this.eomYear = eomYear;
	}
	public String getEomUser() {
		return eomUser;
	}
	public void setEomUser(String eomUser) {
		this.eomUser = eomUser;
	}
	@Override
	public String toString() {
		return "PostAcitMonthEndTrialBalRequest [eomDate=" + eomDate + ", eomMm=" + eomMm + ", eomYear=" + eomYear
				+ ", eomUser=" + eomUser + "]";
	}
}
