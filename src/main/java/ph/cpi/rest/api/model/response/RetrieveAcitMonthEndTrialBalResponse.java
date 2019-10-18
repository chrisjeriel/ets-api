package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitEomMonthlyTotals;

public class RetrieveAcitMonthEndTrialBalResponse {

	private List<AcitEomMonthlyTotals> monthlyTotalsList;

	public List<AcitEomMonthlyTotals> getMonthlyTotalsList() {
		return monthlyTotalsList;
	}
	public void setMonthlyTotalsList(List<AcitEomMonthlyTotals> monthlyTotalsList) {
		this.monthlyTotalsList = monthlyTotalsList;
	}
	@Override
	public String toString() {
		return "RetrieveAcitMonthEndTrialBalResponse [monthlyTotalsList=" + monthlyTotalsList + "]";
	}
}
