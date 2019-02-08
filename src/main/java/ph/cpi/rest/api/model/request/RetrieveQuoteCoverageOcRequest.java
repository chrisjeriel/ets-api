package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveQuoteCoverageOcRequest {
	private Integer quoteIdOc;
	private String openQuotationNo;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public Integer getQuoteIdOc() {
		return quoteIdOc;
	}
	public void setQuoteIdOc(Integer quoteIdOc) {
		this.quoteIdOc = quoteIdOc;
	}
	public String getOpenQuotationNo() {
		return openQuotationNo;
	}
	public void setOpenQuotationNo(String openQuotationNo) {
		this.openQuotationNo = openQuotationNo;
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
		return "RetrieveQuoteCoverageOcRequest [quoteIdOc=" + quoteIdOc + ", openQuotationNo=" + openQuotationNo + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
}
