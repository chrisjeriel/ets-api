package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.UserGrp;

public class RetrieveMtnUserGroupAccessResponse {
	private List<UserGrp> userGroupAccessList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<UserGrp> getUserGroups() {
		return userGroupAccessList;
	}
	public void setUserGroups(List<UserGrp> userGroupAccessList) {
		this.userGroupAccessList = userGroupAccessList;
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
		return "RetrieveMtnUserGroupAccessResponse [userGroupAccessList=" + userGroupAccessList
				+ ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
