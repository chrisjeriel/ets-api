package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.QSOAPrint;

public class RetrieveAcitQsoaPrintResponse {

	private List<QSOAPrint> qsoaPrintList;

	public List<QSOAPrint> getQsoaPrintList() {
		return qsoaPrintList;
	}
	public void setQsoaPrintList(List<QSOAPrint> qsoaPrintList) {
		this.qsoaPrintList = qsoaPrintList;
	}
	@Override
	public String toString() {
		return "RetrieveAcitQsoaPrintResponse [qsoaPrintList=" + qsoaPrintList + "]";
	}
}
