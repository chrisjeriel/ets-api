package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitSOAAgingDetailsLOV;

public class RetrieveAcitAgingSoaDtlLOVResponse {
	private List<AcitSOAAgingDetailsLOV> soaDtlList;

	public List<AcitSOAAgingDetailsLOV> getSoaDtlList() {
		return soaDtlList;
	}

	public void setSoaDtlList(List<AcitSOAAgingDetailsLOV> soaDtlList) {
		this.soaDtlList = soaDtlList;
	}

	@Override
	public String toString() {
		return "RetrieveAcitAgingSoaDtlLOVResponse [soaDtlList=" + soaDtlList + "]";
	}
}
