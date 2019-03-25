package ph.cpi.rest.api.model.underwriting;

public class Policy {

	private InwPolBalance inwPolBalance;
	private CoInsurance coInsurance;
	public InwPolBalance getInwPolBalance() {
		return inwPolBalance;
	}
	public void setInwPolBalance(InwPolBalance inwPolBalance) {
		this.inwPolBalance = inwPolBalance;
	}
	public CoInsurance getCoInsurance() {
		return coInsurance;
	}
	public void setCoInsurance(CoInsurance coInsurance) {
		this.coInsurance = coInsurance;
	}
	@Override
	public String toString() {
		return "Policy [inwPolBalance=" + inwPolBalance + ", coInsurance=" + coInsurance + "]";
	}
}
