package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveTransactionsRequest {
	private String tranTitle;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public String getTranTitle() {
		return tranTitle;
	}
	public void setTranTitle(String tranTitle) {
		this.tranTitle = tranTitle;
	}
	public PaginationRequest getPaginationRequest() {
		if(paginationRequest == null){
			paginationRequest = new PaginationRequest();
		}
		return paginationRequest;
	}
	public void setPaginationRequest(PaginationRequest paginationRequest) {
		this.paginationRequest = paginationRequest;
	}
	public SortRequest getSortRequest() {
		if(sortRequest == null){
			sortRequest = new SortRequest();
		}
		return sortRequest;
	}
	public void setSortRequest(SortRequest sortRequest) {
		this.sortRequest = sortRequest;
	}
	@Override
	public String toString() {
		return "RetrieveTransactionsRequest [tranTitle=" + tranTitle + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
}
