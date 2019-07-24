package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;
import ph.cpi.rest.api.model.accountingintrust.RefNoLov;

public class RetrieveAcitRefNoLOVResponse {
	private List<RefNoLov>	refNoList;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public List<RefNoLov> getRefNoList() {
		return refNoList;
	}
	public void setRefNoList(List<RefNoLov> refNoList) {
		this.refNoList = refNoList;
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
		return "RetrieveAcitRefNoLOVResponse [refNoList=" + refNoList + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
	
	
}
