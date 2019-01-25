package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.Quotation;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.quote.AlopItem;

public class RetrieveQuoteAlopItemResponse {
	
	private Quotation quotation;
	private AlopItem alopItem;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public Quotation getQuotation() {
		if (quotation == null) {
			quotation = new Quotation();
		}
		return quotation;
	}
	public void setQuotation(Quotation quotation) {
		this.quotation = quotation;
	}
	public AlopItem getAlopItem() {
		if (alopItem == null) {
			alopItem = new AlopItem();
		}
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
