package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnUserGroupAccessRequest {
	private Integer userGrp;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public Integer getUserGrp() {
		return userGrp;
	}
	public void setUserGrp(Integer userGrp) {
		this.userGrp = userGrp;
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
		return "RetrieveMtnUserGroupRequest [userGrp=" + userGrp + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
}
