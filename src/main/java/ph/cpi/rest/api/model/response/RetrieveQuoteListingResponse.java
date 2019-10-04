package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.Response;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.quote.Quotation;

public class RetrieveQuoteListingResponse extends Response{

	private List<Quotation> quotationList;
	private Integer length;
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<Quotation> getQuotationList() {
		if (quotationList == null) {
			quotationList = new ArrayList<Quotation>();
		}
		
		return quotationList;
	}
	public void setQuotationList(List<Quotation> quotationList) {
		this.quotationList = quotationList;
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
		return "RetrieveQuoteListingResponse [quotationList=" + quotationList + ", length=" + length
				+ ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
