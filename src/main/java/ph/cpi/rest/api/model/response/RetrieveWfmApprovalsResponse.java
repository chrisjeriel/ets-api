package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.workflowmanager.Approval;

public class RetrieveWfmApprovalsResponse {
	private List<Approval> approvalList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<Approval> getApprovalList() {
		if (approvalList == null) {
			approvalList = new ArrayList<Approval>();
		}
		return approvalList;
	}
	public void setApprovalList(List<Approval> approvalList) {
		this.approvalList = approvalList;
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
	
	
}
