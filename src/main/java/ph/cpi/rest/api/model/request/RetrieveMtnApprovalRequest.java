package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnApprovalRequest {
	private String approvalCd;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public String getApprovalCd() {
		return approvalCd;
	}
	public void setApprovalCd(String approvalCd) {
		this.approvalCd = approvalCd;
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
		return "RetrieveMtnApprovalFunctionRequest [approvalCd=" + approvalCd + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
