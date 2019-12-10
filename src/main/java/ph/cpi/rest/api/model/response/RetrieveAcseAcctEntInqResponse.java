package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingservice.AcseEditedAcctEntries;

public class RetrieveAcseAcctEntInqResponse {
	private List<AcseEditedAcctEntries> edtAcctEntList;

	public List<AcseEditedAcctEntries> getEdtAcctEntList() {
		return edtAcctEntList;
	}

	public void setEdtAcctEntList(List<AcseEditedAcctEntries> list) {
		this.edtAcctEntList = list;
	}

	@Override
	public String toString() {
		return "RetrieveAcseAcctEntInqResponse [edtAcctEntList=" + edtAcctEntList + "]";
	}
}
