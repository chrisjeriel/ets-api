package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitInwPolPayts;

public class RetrieveAcitInwPolPaytsResponse {
	private List<AcitInwPolPayts> list;

	public List<AcitInwPolPayts> getList() {
		return list;
	}

	public void setList(List<AcitInwPolPayts> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "RetrieveAcitInwPolPaytsResponse [list=" + list + "]";
	}
	
}
