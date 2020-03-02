package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.underwriting.PolOcLov;

public class RetrieveCreateOcAltLovResponse {
	private List<PolOcLov> polList;

	public List<PolOcLov> getPolList() {
		return polList;
	}

	public void setPolList(List<PolOcLov> polList) {
		this.polList = polList;
	}

	@Override
	public String toString() {
		return "RetrieveCreateOcAltLovResponse [polList=" + polList + "]";
	}

	
}
