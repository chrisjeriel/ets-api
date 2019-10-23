package ph.cpi.rest.api.model.request;

public class RetrieveAcitMonthEndTrialBalRequest {

	private String eomDate;

	public String getEomDate() {
		return eomDate;
	}
	public void setEomDate(String eomDate) {
		this.eomDate = eomDate;
	}
	@Override
	public String toString() {
		return "RetrieveAcitMonthEndTrialBalRequest [eomDate=" + eomDate + "]";
	}
}
