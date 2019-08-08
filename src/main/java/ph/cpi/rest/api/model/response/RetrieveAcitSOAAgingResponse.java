package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitSOAAgingDetails;

public class RetrieveAcitSOAAgingResponse {
	private List<AcitSOAAgingDetails> soaDetails;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<AcitSOAAgingDetails> getSoaDetails() {
		return soaDetails;
	}
	public void setSoaDetails(List<AcitSOAAgingDetails> soaDetails) {
		this.soaDetails = soaDetails;
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
		return "RetrieveAcitSOAAgingResponse [soaDetails=" + soaDetails + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
