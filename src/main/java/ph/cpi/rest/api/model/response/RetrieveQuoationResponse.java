package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.quote.HoldCover;
import ph.cpi.rest.api.model.quote.Project;

public class RetrieveQuoationResponse {	
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
		return "RetrieveQuoationResponse [holdCover=" + holdCover + ", project=" + project + "]";
	}
	
}
