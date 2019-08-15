package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.ACITSOATreatyDetails;

public class RetrieveAcitSOATreatyDetailsResponse {
	private List<ACITSOATreatyDetails> soaDetails;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<ACITSOATreatyDetails> getSoaDetails() {
		return soaDetails;
	}
	public void setSoaDetails(List<ACITSOATreatyDetails> soaDetails) {
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
		return "RetrieveAcitSOATreatyDetailsResponse [soaDetails=" + soaDetails + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
