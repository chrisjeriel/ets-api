package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitCvPaytReq;

public class RetrieveAcitCvPaytReqListResponse {
	private List<AcitCvPaytReq> acitCvPaytReqList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcitCvPaytReq> getAcitCvPaytReqList() {
		return acitCvPaytReqList;
	}
	public void setAcitCvPaytReqList(List<AcitCvPaytReq> acitCvPaytReqList) {
		this.acitCvPaytReqList = acitCvPaytReqList;
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
		return "RetrieveAcitCvPaytReqListResponse [acitCvPaytReqList=" + acitCvPaytReqList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
