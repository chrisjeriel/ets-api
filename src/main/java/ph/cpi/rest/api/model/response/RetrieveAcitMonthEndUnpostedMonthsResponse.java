package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitEomUnpostedMonth;

public class RetrieveAcitMonthEndUnpostedMonthsResponse {

	List<AcitEomUnpostedMonth> unpostedMonthsList;

	public List<AcitEomUnpostedMonth> getUnpostedMonthsList() {
		return unpostedMonthsList;
	}
	public void setUnpostedMonthsList(List<AcitEomUnpostedMonth> unpostedMonthsList) {
		this.unpostedMonthsList = unpostedMonthsList;
	}
	@Override
	public String toString() {
		return "RetrieveAcitMonthEndUnpostedMonthsResponse [unpostedMonthsList=" + unpostedMonthsList + "]";
	}
}
