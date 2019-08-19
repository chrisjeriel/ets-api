package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitCv;

public class RetrieveAcitCvResponse {
	private List<AcitCv> acitCvPaytReqList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcitCv> getAcitCvPaytReqList() {
		return acitCvPaytReqList;
	}
	public void setAcitCvPaytReqList(List<AcitCv> acitCvPaytReqList) {
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
		return "RetrieveAcitCvResponse [acitCvPaytReqList=" + acitCvPaytReqList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
