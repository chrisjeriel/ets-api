package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitPremCol;

public class RetrieveAcitPremColResponse {
	private List<AcitPremCol> list;

	public List<AcitPremCol> getList() {
		return list;
	}
	
	public void setList(List<AcitPremCol> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "RetrieveAcitPremColResponse [list=" + list + "]";
	}
	
}
