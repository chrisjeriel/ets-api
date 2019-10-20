package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitMonthEnd;

public class RetrieveAcitMonthEndResponse {

	private List<AcitMonthEnd> monthEnd;
	
	public List<AcitMonthEnd> getMonthEnd() {
		return monthEnd;
	}
	public void setMonthEnd(List<AcitMonthEnd> monthEnd) {
		this.monthEnd = monthEnd;
	}
	@Override
	public String toString() {
		return "RetrieveAcitMonthEndResponse []";
	}
}
