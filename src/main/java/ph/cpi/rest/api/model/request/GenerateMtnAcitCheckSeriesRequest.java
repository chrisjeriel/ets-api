package ph.cpi.rest.api.model.request;

public class GenerateMtnAcitCheckSeriesRequest {
	private Integer bank;
	private String bankAcct;
	private Integer checkNoFrom;
	private Integer checkNoTo;
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
	public Integer getCheckNoFrom() {
		return checkNoFrom;
	}
	public void setCheckNoFrom(Integer checkNoFrom) {
		this.checkNoFrom = checkNoFrom;
	}
	public Integer getCheckNoTo() {
		return checkNoTo;
	}
	public void setCheckNoTo(Integer checkNoTo) {
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
		return "GenerateMtnAcitCheckSeriesRequest [bank=" + bank + ", bankAcct=" + bankAcct + ", checkNoFrom="
				+ checkNoFrom + ", checkNoTo=" + checkNoTo + ", user=" + user + "]";
	}
}
