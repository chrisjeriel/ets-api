package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.quote.ProjectOc;

public class RetrieveQuotationOcResponse {
	private ProjectOc projectOc;

	public ProjectOc getProjectOc() {
		return projectOc;
	}

	public void setProjectOc(ProjectOc projectOc) {
		this.projectOc = projectOc;
	}

	@Override
	public String toString() {
		return "RetrieveQuotationOcResponse [projectOc=" + projectOc + "]";
	}
	
}
