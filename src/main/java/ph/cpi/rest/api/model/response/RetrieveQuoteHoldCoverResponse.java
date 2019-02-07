package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.quote.Quotation;

public class RetrieveQuoteHoldCoverResponse {
	private Quotation quotation;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	private List<Quotation> quotationList;//hold cover listing

	public Quotation getQuotation() {
		return quotation;
	}

	public void setQuotation(Quotation quotation) {
		this.quotation = quotation;
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

	public List<Quotation> getQuotationList() {
		return quotationList;
	}

	public void setQuotationList(List<Quotation> quotationList) {
		this.quotationList = quotationList;
	}

	@Override
	public String toString() {
		return "RetrieveQuoteHoldCoverResponse [quotation=" + quotation + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + ", quotationList=" + quotationList + "]";
	}
	
}
