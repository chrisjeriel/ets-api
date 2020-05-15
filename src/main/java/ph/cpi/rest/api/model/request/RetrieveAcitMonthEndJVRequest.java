package ph.cpi.rest.api.model.request;

public class RetrieveAcitMonthEndJVRequest {

	private String from;
	private String eomDate;
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getEomDate() {
		return eomDate;
	}
	public void setEomDate(String eomDate) {
		this.eomDate = eomDate;
	}
	@Override
	public String toString() {
		return "RetrieveAcitMonthEndJVRequest [from=" + from + ", eomDate=" + eomDate + "]";
	}
}
