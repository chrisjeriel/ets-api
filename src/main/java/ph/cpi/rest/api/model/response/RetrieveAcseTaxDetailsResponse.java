package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingservice.AcseTaxDetails;

public class RetrieveAcseTaxDetailsResponse {
	private List<AcseTaxDetails> taxDetails;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseTaxDetails> getTaxDetails() {
		return taxDetails;
	}
	public void setTaxDetails(List<AcseTaxDetails> taxDetails) {
		this.taxDetails = taxDetails;
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
		return "RetrieveAcseTaxDetailsResponse [taxDetails=" + taxDetails + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
