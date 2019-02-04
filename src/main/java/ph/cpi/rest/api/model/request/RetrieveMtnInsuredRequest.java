package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnInsuredRequest {
	
	private Integer insuredId;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public Integer getInsuredId() {
		return insuredId;
	}
	public void setInsuredId(Integer insuredId) {
		this.insuredId = insuredId;
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
		return "RetrieveMtnInsuredRequest [insuredId=" + insuredId + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
	
	
}
