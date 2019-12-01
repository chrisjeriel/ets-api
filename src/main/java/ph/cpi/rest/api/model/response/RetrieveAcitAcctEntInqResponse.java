package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitEditedAcctEntries;

public class RetrieveAcitAcctEntInqResponse {
	private List<AcitEditedAcctEntries> edtAcctEntList;

	public List<AcitEditedAcctEntries> getEdtAcctEntList() {
		return edtAcctEntList;
	}
	public void setEdtAcctEntList(List<AcitEditedAcctEntries> edtAcctEntList) {
		this.edtAcctEntList = edtAcctEntList;
	}
	
	@Override
	public String toString() {
		return "RetrieveAcitAcctEntInqResponse [edtAcctEntList=" + edtAcctEntList + "]";
	}
}
