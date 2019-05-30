package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.ApproverFn;

public class RetrieveMtnApproverFnResponse {
	List<ApproverFn> approverFnList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<ApproverFn> getApproverFnList() {
		return approverFnList;
	}
	public void setApproverFnList(List<ApproverFn> approverFnList) {
		this.approverFnList = approverFnList;
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
		return "RetrieveMtnApproverFnResponse [approverFnList=" + approverFnList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
