package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.QSOAAcctReceivable;
import ph.cpi.rest.api.model.accountingintrust.QSOADtl;
import ph.cpi.rest.api.model.accountingintrust.QSOADtlExclude;
import ph.cpi.rest.api.model.accountingintrust.QSOARemittance;

public class RetrieveQSOADtlResponse {
	
	private List<QSOADtl> qsoaDtlList;
	private List<QSOADtlExclude> qsoaDtlExcludeList;
	private List<QSOAAcctReceivable> qsoaAcctReceivableList;
	private List<QSOARemittance> qsoaRemittanceList;
	
	public List<QSOADtl> getQsoaDtlList() {
		return qsoaDtlList;
	}
	public void setQsoaDtlList(List<QSOADtl> qsoaDtlList) {
		this.qsoaDtlList = qsoaDtlList;
	}
	public List<QSOADtlExclude> getQsoaDtlExcludeList() {
		return qsoaDtlExcludeList;
	}
	public void setQsoaDtlExcludeList(List<QSOADtlExclude> qsoaDtlExcludeList) {
		this.qsoaDtlExcludeList = qsoaDtlExcludeList;
	}
	public List<QSOAAcctReceivable> getQsoaAcctReceivableList() {
		return qsoaAcctReceivableList;
	}
	public void setQsoaAcctReceivableList(List<QSOAAcctReceivable> qsoaAcctReceivableList) {
		this.qsoaAcctReceivableList = qsoaAcctReceivableList;
	}
	public List<QSOARemittance> getQsoaRemittanceList() {
		return qsoaRemittanceList;
	}
	public void setQsoaRemittanceList(List<QSOARemittance> qsoaRemittanceList) {
		this.qsoaRemittanceList = qsoaRemittanceList;
	}
	@Override
	public String toString() {
		return "RetrieveQSOADtlResponse [qsoaDtlList=" + qsoaDtlList + ", qsoaDtlExcludeList=" + qsoaDtlExcludeList
				+ ", qsoaAcctReceivableList=" + qsoaAcctReceivableList + ", qsoaRemittanceList=" + qsoaRemittanceList
				+ "]";
	}
}
