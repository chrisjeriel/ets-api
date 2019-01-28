package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.quote.QuotationOc;

public class RetrieveQuoteCoverageOcResponse {
	private List<QuotationOc> quotationOc;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<QuotationOc> getQuotationOc() {
		return quotationOc;
	}
	public void setQuotationOc(List<QuotationOc> quotationOc) {
		this.quotationOc = quotationOc;
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
		return "RetrieveQuoteCoverageOcResponse [quotationOc=" + quotationOc 
				+ ", paginationResponse=" + paginationResponse + ", sortResponse=" 
				+ sortResponse +"]";
	}
}
