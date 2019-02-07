package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveQuoteEndorsementsRequest {

	private Integer quoteId;
	private String quotationNo;
	private Integer optionId;
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
		return paginationRequest;
	}
	public void setPaginationRequest(PaginationRequest paginationRequest) {
		this.paginationRequest = paginationRequest;
	}
	public SortRequest getSortRequest() {
		return sortRequest;
	}
	public void setSortRequest(SortRequest sortRequest) {
		this.sortRequest = sortRequest;
	}
	
	public Integer getOptionId() {
		return optionId;
	}
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}
	
	@Override
	public String toString() {
		return "RetrieveQuoteEndorsementsRequest [quoteId=" + quoteId + ", quotationNo=" + quotationNo + ", optionId="
				+ optionId + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}

	
	
}
