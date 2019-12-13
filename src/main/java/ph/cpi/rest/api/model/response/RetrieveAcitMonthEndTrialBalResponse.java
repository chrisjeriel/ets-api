package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitEomMonthlyTotals;

public class RetrieveAcitMonthEndTrialBalResponse {

	private List<AcitEomMonthlyTotals> monthlyTotalsList;
	private String eom;

	public List<AcitEomMonthlyTotals> getMonthlyTotalsList() {
		return monthlyTotalsList;
	}
	public void setMonthlyTotalsList(List<AcitEomMonthlyTotals> monthlyTotalsList) {
		this.monthlyTotalsList = monthlyTotalsList;
	}
	public String getEom() {
		return eom;
	}
	public void setEom(String eom) {
		this.eom = eom;
	}
	@Override
	public String toString() {
		return "RetrieveAcitMonthEndTrialBalResponse [monthlyTotalsList=" + monthlyTotalsList + ", eom=" + eom + "]";
	}
}
