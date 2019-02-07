package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveQuoteGeneralInfoOcRequest {
	private String quoteIdOc;
	private String openQuotationNo;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public String getQuoteIdOc() {
		return quoteIdOc;
	}
	public void setQuoteIdOc(String quoteIdOc) {
		this.quoteIdOc = quoteIdOc;
	}
	public String getOpenQuotationNo() {
		return openQuotationNo;
	}
	public void setOpenQuotationNo(String openQuotationNo) {
		this.openQuotationNo = openQuotationNo;
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
	@Override
	public String toString() {
		return "RetrieveQuoteGeneralInfoOcRequest [quoteIdOc=" + quoteIdOc + ", openQuotationNo=" + openQuotationNo
				+ ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
