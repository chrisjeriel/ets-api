package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnAdviceWordingsRequest {
	
	private String adviceWordId;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public String getAdviceWordId() {
		return adviceWordId;
	}
	public void setAdviceWordId(String adviceWordId) {
		this.adviceWordId = adviceWordId;
	}
	public PaginationRequest getPaginationRequest() {
		return paginationRequest;
	}
	public void setPaginationRequest(PaginationRequest paginationRequest) {
		this.paginationRequest = paginationRequest;
	}
	public SortRequest getSortRequest() {
		return sortRequest;
	}
	public void setSortRequest(SortRequest sortRequest) {
		this.sortRequest = sortRequest;
	}
	@Override
	public String toString() {
		return "RetrieveMaintenanceAdviceWordings [adviceWordId=" + adviceWordId + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
	
	
}
