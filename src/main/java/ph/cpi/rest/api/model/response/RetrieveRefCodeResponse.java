package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.RefCode;

public class RetrieveRefCodeResponse {
	
	private List<RefCode> refCodeList;

	public List<RefCode> getRefCodeList() {
		return refCodeList;
	}

	public void setRefCodeList(List<RefCode> refCodeList) {
		this.refCodeList = refCodeList;
	}

	@Override
	public String toString() {
		return "RetrieveRefCodeResponse [refCodeList=" + refCodeList + "]";
	}
	
}
