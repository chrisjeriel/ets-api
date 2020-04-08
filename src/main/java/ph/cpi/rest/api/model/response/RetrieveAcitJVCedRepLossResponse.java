package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.MultiOffsetLrd;

public class RetrieveAcitJVCedRepLossResponse {

	private List<MultiOffsetLrd> cedRepLossList;

	public List<MultiOffsetLrd> getCedRepLossList() {
		return cedRepLossList;
	}
	public void setCedRepLossList(List<MultiOffsetLrd> cedRepLossList) {
		this.cedRepLossList = cedRepLossList;
	}
	@Override
	public String toString() {
		return "RetrieveAcitJVCedRepLossResponse [cedRepLossList=" + cedRepLossList + "]";
	}
}
