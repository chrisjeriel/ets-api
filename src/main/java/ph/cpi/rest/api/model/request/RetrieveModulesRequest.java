package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveModulesRequest {

	private String accessLevel;
	private String userId;
	private String userGrp;
	private Integer tranCd;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public String getAccessLevel() {
		return accessLevel;
	}
	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserGrp() {
		return userGrp;
	}
	public void setUserGrp(String userGrp) {
		this.userGrp = userGrp;
	}
	public Integer getTranCd() {
		return tranCd;
	}
	public void setTranCd(Integer tranCd) {
		this.tranCd = tranCd;
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
		return "RetrieveModulesRequest [accessLevel=" + accessLevel + ", userId=" + userId + ", userGrp=" + userGrp
				+ ", tranCd=" + tranCd + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest
				+ "]";
	}
	
}
