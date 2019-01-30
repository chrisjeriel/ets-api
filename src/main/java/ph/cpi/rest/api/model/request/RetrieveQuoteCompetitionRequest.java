package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveQuoteCompetitionRequest {
	private Integer quoteId;
	private String quotationNo;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public String getQuotationNo() {
		return quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
	}
	public PaginationRequest getPaginationRequest() {
		if(paginationRequest == null){
			paginationRequest = new PaginationRequest();
		}
		return paginationRequest;
	}
	public void setPaginationRequest(PaginationRequest paginationRequest) {
		this.paginationRequest = paginationRequest;
	}
	public SortRequest getSortRequest() {
		if(sortRequest == null){
			sortRequest = new SortRequest();
		}
		return sortRequest;
	}
	public void setSortRequest(SortRequest sortRequest) {
		this.sortRequest = sortRequest;
	}
	
	@Override
	public String toString() {
		return "RetrieveQuoteCompetitionRequest [quoteId=" + quoteId + ", quotationNo=" + quotationNo + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
