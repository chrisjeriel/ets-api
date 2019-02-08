package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.Response;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.quote.AlopItem;
import ph.cpi.rest.api.model.quote.Quotation;

public class RetrieveQuoteAlopItemResponse extends Response {
	
	private List<Quotation> quotation;
	private AlopItem alopItem;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<Quotation> getQuotation() {
		return quotation;
	}
	public void setQuotation(List<Quotation> quotation) {
		this.quotation = quotation;
	}
	public AlopItem getAlopItem() {
		return alopItem;
	}
	public void setAlopItem(AlopItem alopItem) {
		this.alopItem = alopItem;
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
		return "RetrieveQuoteAlopItemResponse [quotation=" + quotation + ", alopItem=" + alopItem
				+ ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
	
	
}