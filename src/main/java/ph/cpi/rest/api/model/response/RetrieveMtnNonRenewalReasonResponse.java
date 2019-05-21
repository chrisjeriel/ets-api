package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.NonRenewalReason;

public class RetrieveMtnNonRenewalReasonResponse {
	private List<NonRenewalReason> nonRenewalReasonList;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	
	public List<NonRenewalReason> getNonRenewalReasonList() {
		return nonRenewalReasonList;
	}
	public void setNonRenewalReason(List<NonRenewalReason> nonRenewalReasonList) {
		this.nonRenewalReasonList = nonRenewalReasonList;
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
		return "RetrieveMtnNonRenewalReasonResponse [nonRenewalReason=" + nonRenewalReasonList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
