package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitAmortize;

public class RetrieveAcitAmortizeResponse {

	private List<AcitAmortize> acitAmortizeList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<AcitAmortize> getAcitAmortizeList() {
		return acitAmortizeList;
	}
	public void setAcitAmortizeList(List<AcitAmortize> acitAmortizeList) {
		this.acitAmortizeList = acitAmortizeList;
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
		return "RetrieveAcitAmortizeResponse [acitAmortizeList=" + acitAmortizeList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
