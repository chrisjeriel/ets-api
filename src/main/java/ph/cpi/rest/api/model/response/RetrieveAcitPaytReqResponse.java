package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitPaytReq;

public class RetrieveAcitPaytReqResponse {
	private List<AcitPaytReq> acitPaytReq;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcitPaytReq> getAcitPaytReq() {
		return acitPaytReq;
	}
	public void setAcitPaytReq(List<AcitPaytReq> acitPaytReq) {
		this.acitPaytReq = acitPaytReq;
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
		return "RetrieveAcitPaytReqResponse [acitPaytReq=" + acitPaytReq + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
}