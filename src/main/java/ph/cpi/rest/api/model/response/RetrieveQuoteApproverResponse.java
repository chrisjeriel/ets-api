package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Approver;
import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;

public class RetrieveQuoteApproverResponse {

	List<Approver> approverList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<Approver> getApproverList() {
		if (approverList == null) {
			approverList = new ArrayList<Approver>();
		}
		return approverList;
	}
	public void setApproverList(List<Approver> approverList) {
		this.approverList = approverList;
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
		return "RetrieveQuoteApproverResponse [approverList=" + approverList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
