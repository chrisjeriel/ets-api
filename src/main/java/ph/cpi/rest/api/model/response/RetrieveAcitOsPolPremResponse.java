package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitOsPolPrem;

public class RetrieveAcitOsPolPremResponse {
	private List<AcitOsPolPrem> list;

	public List<AcitOsPolPrem> getList() {
		return list;
	}

	public void setList(List<AcitOsPolPrem> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "RetrieveAcitOsPolPremResponse [list=" + list + "]";
	}
	
}
