package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitSOAAgingDetails;

public class RetrieveAcitAgingSoaDtlResponse {
	
	private List<AcitSOAAgingDetails> soaDtlList;
	private Integer count;
	
	public List<AcitSOAAgingDetails> getSoaDtlList() {
		return soaDtlList;
	}
	public void setSoaDtlList(List<AcitSOAAgingDetails> soaDtlList) {
		this.soaDtlList = soaDtlList;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "RetrieveAcitAgingSoaDtlResponse [soaDtlList=" + soaDtlList + ", count=" + count + "]";
	}
}
