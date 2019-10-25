package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;
import ph.cpi.rest.api.model.accountingservice.AcseBatchOR;

public class RetrieveAcseBatchOrResponse {
	
	private List<AcseBatchOR> batchOrList;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();

	public List<AcseBatchOR> getBatchOrList() {
		return batchOrList;
	}
	public void setBatchOrList(List<AcseBatchOR> batchOrList) {
		this.batchOrList = batchOrList;
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
		return "RetrieveAcseBatchOrResponse [batchOrList=" + batchOrList
				+ ", paginationRequest=" + paginationRequest + ", sortRequest="
				+ sortRequest + "]";
	}
	
}
