package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitMonthEndJV;

public class RetrieveAcitMonthEndJVResponse {

	private List<AcitMonthEndJV> monthEndJVList;

	public List<AcitMonthEndJV> getMonthEndJVList() {
		return monthEndJVList;
	}
	public void setMonthEndJVList(List<AcitMonthEndJV> monthEndJVList) {
		this.monthEndJVList = monthEndJVList;
	}
	@Override
	public String toString() {
		return "RetrieveAcitMonthEndJVResponse [monthEndJVList=" + monthEndJVList + "]";
	}
	
}
