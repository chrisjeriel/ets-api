package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.quote.HoldCover;
import ph.cpi.rest.api.model.quote.Project;

public class RetrieveQuotationRequest {
	private HoldCover holdCover;
	private Project project;
	public HoldCover getHoldCover() {
		return holdCover;
	}
	public void setHoldCover(HoldCover holdCover) {
		this.holdCover = holdCover;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "RetrieveQuotationRequest [holdCover=" + holdCover + ", project=" + project + "]";
	}
	
}
