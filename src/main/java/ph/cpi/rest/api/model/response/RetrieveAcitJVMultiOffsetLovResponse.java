package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitSOAAgingDetails;

public class RetrieveAcitJVMultiOffsetLovResponse {

	private List<AcitSOAAgingDetails> soaList;
	
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<AcitSOAAgingDetails> getSoaList() {
		return soaList;
	}
	public void setSoaList(List<AcitSOAAgingDetails> soaList) {
		this.soaList = soaList;
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
		return "RetrieveAcitJVMultiOffsetLovResponse [soaList=" + soaList + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
}
