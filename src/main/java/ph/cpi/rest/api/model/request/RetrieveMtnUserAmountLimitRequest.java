package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnUserAmountLimitRequest {
	private Integer userGrp;
	private String lineCd;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public Integer getUserGrp() {
		return userGrp;
	}
	public void setUserGrp(Integer userGrp) {
		this.userGrp = userGrp;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
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
		return "RetrieveMtnUserAmountLimitRequest [userGrp=" + userGrp + ", lineCd=" + lineCd + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
