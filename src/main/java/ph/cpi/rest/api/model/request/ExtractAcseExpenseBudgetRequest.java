package ph.cpi.rest.api.model.request;

public class ExtractAcseExpenseBudgetRequest {

	private String extDate;
	private String extUser;
	
	public String getExtDate() {
		return extDate;
	}
	public void setExtDate(String extDate) {
		this.extDate = extDate;
	}
	public String getExtUser() {
		return extUser;
	}
	public void setExtUser(String extUser) {
		this.extUser = extUser;
	}
	@Override
	public String toString() {
		return "ExtractAcseExpenseBudgetRequest [extDate=" + extDate + ", extUser=" + extUser + "]";
	}
}
