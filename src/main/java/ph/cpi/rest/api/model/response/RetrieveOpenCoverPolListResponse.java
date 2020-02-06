package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.underwriting.PolOcList;

public class RetrieveOpenCoverPolListResponse {
	private List<PolOcList> polList;

	public List<PolOcList> getPolList() {
		return polList;
	}

	public void setPolList(List<PolOcList> polList) {
		this.polList = polList;
	}

	@Override
	public String toString() {
		return "RetrieveOpenCoverPolListResponse [polList=" + polList + "]";
	}
	
}
