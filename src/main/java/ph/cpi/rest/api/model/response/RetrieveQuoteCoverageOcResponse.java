package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.quote.QuotationOc;

public class RetrieveQuoteCoverageOcResponse {
	private QuotationOc quotationOc;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public QuotationOc getQuotationOc() {
		return quotationOc;
	}
	public void setQuotationOc(QuotationOc quotationOc) {
		this.quotationOc = quotationOc;
	}
	public PaginationResponse getPaginationResponse() {
		if(paginationResponse == null){
			paginationResponse = new PaginationResponse();
		}
		return paginationResponse;
	}
	public void setPaginationResponse(PaginationResponse paginationResponse) {
		this.paginationResponse = paginationResponse;
	}
	public SortResponse getSortResponse() {
		if(sortResponse == null){
			sortResponse = new SortResponse();
		}
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
