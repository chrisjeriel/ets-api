package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.QSOADtl;

public class RetrieveQSOADtlResponse {
	
	private List<QSOADtl> qsoaDtlList;

	public List<QSOADtl> getQsoaDtlList() {
		return qsoaDtlList;
	}
	public void setQsoaDtlList(List<QSOADtl> qsoaDtlList) {
		this.qsoaDtlList = qsoaDtlList;
	}

	@Override
	public String toString() {
		return "RetrieveQSOADtlResponse [qsoaDtlList=" + qsoaDtlList + "]";
	}
}
