package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AdviceWordings;

public class RetrieveMtnAdviceWordingsResponse {
	
	private AdviceWordings adviceWordings;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public AdviceWordings getAdviceWordings() {
		if (adviceWordings == null) {
			adviceWordings = new AdviceWordings();
		}
		return adviceWordings;
	}
	public void setAdviceWordings(AdviceWordings adviceWordings) {
		this.adviceWordings = adviceWordings;
	}
	public PaginationResponse getPaginationResponse() {
		return paginationResponse;
	}
	public void setPaginationResponse(PaginationResponse paginationResponse) {
		this.paginationResponse = paginationResponse;
	}
	public SortResponse getSortResponse() {
		return sortResponse;
	}
	public void setSortResponse(SortResponse sortResponse) {
		this.sortResponse = sortResponse;
	}
	@Override
	public String toString() {
		return "RetrieveMaintenanceAdviceWordingsResponse [adviceWordings=" + adviceWordings + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
	
	
}
