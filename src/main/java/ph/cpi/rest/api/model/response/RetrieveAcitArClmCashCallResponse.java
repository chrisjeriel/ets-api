package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitArClmCashCall;

public class RetrieveAcitArClmCashCallResponse {
	private List<AcitArClmCashCall> clmCashCallList;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	public List<AcitArClmCashCall> getClmCashCallList() {
		return clmCashCallList;
	}
	public void setClmCashCallList(List<AcitArClmCashCall> clmCashCallList) {
		this.clmCashCallList = clmCashCallList;
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
		return "RetrieveAcitArClmCashCallResponse [clmCashCallList=" + clmCashCallList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
