package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitClmHist;

public class RetrieveAcitClmHistResponse {
	private List<AcitClmHist> acitClmHistList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcitClmHist> getAcitClmHistList() {
		return acitClmHistList;
	}
	public void setAcitClmHistList(List<AcitClmHist> acitClmHistList) {
		this.acitClmHistList = acitClmHistList;
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
		return "RetrieveAcitClmHistResponse [acitClmHistList=" + acitClmHistList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
