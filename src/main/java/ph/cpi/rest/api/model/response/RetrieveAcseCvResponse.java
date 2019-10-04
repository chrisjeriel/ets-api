package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingservice.AcseCv;

public class RetrieveAcseCvResponse {
	private List<AcseCv> acseCvList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseCv> getAcseCvList() {
		return acseCvList;
	}
	public void setAcseCvList(List<AcseCv> acseCvList) {
		this.acseCvList = acseCvList;
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
		return "RetrieveAcseCvResponse [acseCvList=" + acseCvList + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
}
