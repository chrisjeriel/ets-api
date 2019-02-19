package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.Response;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.quote.QuotationOc;

public class RetrieveQuoteListingOcResponse extends Response{

	private List<QuotationOc> quotationOcList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<QuotationOc> getQuotationOcList() {
		return quotationOcList;
	}
	public void setQuotationOcList(List<QuotationOc> quotationOcList) {
		this.quotationOcList = quotationOcList;
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
		return "RetrieveQuoteListingOcResponse [quotationOcList=" + quotationOcList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
