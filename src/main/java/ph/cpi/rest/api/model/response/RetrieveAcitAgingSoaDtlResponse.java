package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitSOAAgingDetails;

public class RetrieveAcitAgingSoaDtlResponse {
	private List<AcitSOAAgingDetails> soaDtlList;

	public List<AcitSOAAgingDetails> getSoaDtlList() {
		return soaDtlList;
	}
	public void setSoaDtlList(List<AcitSOAAgingDetails> soaDtlList) {
		this.soaDtlList = soaDtlList;
	}

	@Override
	public String toString() {
		return "AcitAgingSoaDtlResponse [soaDtlList=" + soaDtlList + "]";
	}
}
