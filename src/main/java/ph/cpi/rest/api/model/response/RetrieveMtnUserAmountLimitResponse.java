package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.UserAmtLimit;

public class RetrieveMtnUserAmountLimitResponse {
	private List<UserAmtLimit> userAmtLmtList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<UserAmtLimit> getUserAmtLmtList() {
		return userAmtLmtList;
	}
	public void setUserAmtLmtList(List<UserAmtLimit> userAmtLmtList) {
		this.userAmtLmtList = userAmtLmtList;
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
		return "RetrieveMtnUserAmountLimitResponse [userAmtLmtList=" + userAmtLmtList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
