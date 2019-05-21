package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.ApproverFn;

public class RetrieveMtnApprovalFunctionResponse {
	private List<ApproverFn> approverFn;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<ApproverFn> getApproverFn() {
		return approverFn;
	}
	public void setApproverFn(List<ApproverFn> approverFn) {
		this.approverFn = approverFn;
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
		return "RetrieveMtnApprovalFunctionResponse [approverFn=" + approverFn + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
