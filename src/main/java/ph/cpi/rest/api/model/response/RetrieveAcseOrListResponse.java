package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;
import ph.cpi.rest.api.model.accountingservice.OfficialReceipt;

public class RetrieveAcseOrListResponse {
	private List<OfficialReceipt> orList;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	public List<OfficialReceipt> getOrList() {
		return orList;
	}
	public void setOrList(List<OfficialReceipt> orList) {
		this.orList = orList;
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
		return "RetrieveAcseOrListResponse [orList=" + orList + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
}
