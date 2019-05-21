package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.UserAmtLimit;

public class RetMtnUserAmtLimitResponse {
	List<UserAmtLimit> userAmtLimit;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<UserAmtLimit> getUserAmtLimit() {
		return userAmtLimit;
	}
	public void setUserAmtLimit(List<UserAmtLimit> userAmtLimit) {
		this.userAmtLimit = userAmtLimit;
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
		return "RetMtnUserAmtLimitResponse [userAmtLimit=" + userAmtLimit + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
