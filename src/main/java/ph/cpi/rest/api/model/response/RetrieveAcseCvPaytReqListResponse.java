package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingservice.AcseCvPaytReq;

public class RetrieveAcseCvPaytReqListResponse {
	private List<AcseCvPaytReq> acseCvPaytReqList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseCvPaytReq> getAcseCvPaytReqList() {
		return acseCvPaytReqList;
	}
	public void setAcseCvPaytReqList(List<AcseCvPaytReq> acseCvPaytReqList) {
		this.acseCvPaytReqList = acseCvPaytReqList;
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
		return "RetrieveAcseCvPaytReqListResponse [acseCvPaytReqList=" + acseCvPaytReqList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
