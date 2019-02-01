package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.quote.ProjectOc;

public class RetrieveQuotationOcRequest {
	private ProjectOc projectOc;

	public ProjectOc getProjectOc() {
		return projectOc;
	}

	public void setProjectOc(ProjectOc projectOc) {
		this.projectOc = projectOc;
	}

	@Override
	public String toString() {
		return "RetrieveQuotationOcRequest []";
	}
	
}
