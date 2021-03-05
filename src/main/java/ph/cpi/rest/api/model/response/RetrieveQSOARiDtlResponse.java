package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.QsoaRiDtl;

public class RetrieveQSOARiDtlResponse {

	List<QsoaRiDtl> qsoaRiDtlList;

	public List<QsoaRiDtl> getQsoaRiDtlList() {
		return qsoaRiDtlList;
	}
	public void setQsoaRiDtlList(List<QsoaRiDtl> qsoaRiDtlList) {
		this.qsoaRiDtlList = qsoaRiDtlList;
	}
	@Override
	public String toString() {
		return "RetrieveQSOARiDtlResponse [qsoaRiDtlList=" + qsoaRiDtlList + "]";
	}
	
}
