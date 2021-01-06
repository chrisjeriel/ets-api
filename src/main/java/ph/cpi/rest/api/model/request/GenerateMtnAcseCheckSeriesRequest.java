package ph.cpi.rest.api.model.request;

public class GenerateMtnAcseCheckSeriesRequest {
	private Integer bank;
	private String bankAcct;
	private String checkNoFrom;
	private String checkNoTo;
	private String user;
	public Integer getBank() {
		return bank;
	}
	public void setBank(Integer bank) {
		this.bank = bank;
	}
	public String getBankAcct() {
		return bankAcct;
	}
	public void setBankAcct(String bankAcct) {
		this.bankAcct = bankAcct;
	}
	public String getCheckNoFrom() {
		return checkNoFrom;
	}
	public void setCheckNoFrom(String checkNoFrom) {
		this.checkNoFrom = checkNoFrom;
	}
	public String getCheckNoTo() {
		return checkNoTo;
	}
	public void setCheckNoTo(String checkNoTo) {
		this.checkNoTo = checkNoTo;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "GenerateMtnAcseCheckSeriesRequest [bank=" + bank + ", bankAcct=" + bankAcct + ", checkNoFrom="
				+ checkNoFrom + ", checkNoTo=" + checkNoTo + ", user=" + user + "]";
	}
}
