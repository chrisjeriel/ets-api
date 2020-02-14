package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.underwriting.PolicyLOV;

public class RetrieveEditableDistListResponse {
	List<PolicyLOV> polList;

	public List<PolicyLOV> getPolList() {
		return polList;
	}

	public void setPolList(List<PolicyLOV> polList) {
		this.polList = polList;
	}

	@Override
	public String toString() {
		return "RetrieveEditableDistListResponse [polList=" + polList + "]";
	}
	
}
