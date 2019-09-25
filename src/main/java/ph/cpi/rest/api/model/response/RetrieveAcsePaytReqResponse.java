package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingservice.AcsePaytReq;

public class RetrieveAcsePaytReqResponse {
	private List<AcsePaytReq> acsePaytReq;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcsePaytReq> getAcsePaytReq() {
		return acsePaytReq;
	}
	public void setAcsePaytReq(List<AcsePaytReq> acsePaytReq) {
		this.acsePaytReq = acsePaytReq;
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
		return "RetrieveAcsePaytReqResponse [acsePaytReq=" + acsePaytReq + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
}
