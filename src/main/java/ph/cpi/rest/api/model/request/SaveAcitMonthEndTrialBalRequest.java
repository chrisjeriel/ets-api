package ph.cpi.rest.api.model.request;

public class SaveAcitMonthEndTrialBalRequest {

	private String force;
	private String eomDate;
	private String eomUser;
	private String includeMonth;
	private String includeYear;
	private String aeTag;
	
	public String getForce() {
		return force;
	}
	public void setForce(String force) {
		this.force = force;
	}
	public String getEomDate() {
		return eomDate;
	}
	public void setEomDate(String eomDate) {
		this.eomDate = eomDate;
	}
	public String getEomUser() {
		return eomUser;
	}
	public void setEomUser(String eomUser) {
		this.eomUser = eomUser;
	}
	public String getIncludeMonth() {
		return includeMonth;
	}
	public void setIncludeMonth(String includeMonth) {
		this.includeMonth = includeMonth;
	}
	public String getIncludeYear() {
		return includeYear;
	}
	public void setIncludeYear(String includeYear) {
		this.includeYear = includeYear;
	}
	public String getAeTag() {
		return aeTag;
	}
	public void setAeTag(String aeTag) {
		this.aeTag = aeTag;
	}
	@Override
	public String toString() {
		return "SaveAcitMonthEndTrialBalRequest [force=" + force + ", eomDate=" + eomDate + ", eomUser=" + eomUser
				+ ", includeMonth=" + includeMonth + ", includeYear=" + includeYear + ", aeTag=" + aeTag + "]";
	}
}
