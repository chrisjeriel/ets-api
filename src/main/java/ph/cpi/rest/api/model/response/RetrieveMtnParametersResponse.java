package ph.cpi.rest.api.model.response;
import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Parameters;

public class RetrieveMtnParametersResponse {
	private List<Parameters> parameters;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	
	public List<Parameters> getParameters() {
		return parameters;
	}
	public void setParameters(List<Parameters> parameters) {
		this.parameters = parameters;
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
		return "RetrieveMtnParametersResponse [parameters=" + parameters + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
}
