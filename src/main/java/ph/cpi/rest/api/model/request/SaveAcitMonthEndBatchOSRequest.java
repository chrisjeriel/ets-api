package ph.cpi.rest.api.model.request;

public class SaveAcitMonthEndBatchOSRequest {

	private String eomDate;
	private String eomUser;
	
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
	@Override
	public String toString() {
		return "SaveAcitMonthEndBatchOSRequest [eomDate=" + eomDate + ", eomUser=" + eomUser + "]";
	}
}
