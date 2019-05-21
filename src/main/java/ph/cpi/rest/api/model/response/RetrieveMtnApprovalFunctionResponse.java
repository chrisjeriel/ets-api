package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.ApprovalFunction;

public class RetrieveMtnApprovalFunctionResponse {
	private List<ApprovalFunction> approvalFunction;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<ApprovalFunction> getApprovalFunction() {
		return approvalFunction;
	}
	public void setApprovalFunction(List<ApprovalFunction> approvalFunction) {
		this.approvalFunction = approvalFunction;
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
		return "RetrieveMtnApprovalFunctionResponse [approvalFunction=" + approvalFunction + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
	
}
