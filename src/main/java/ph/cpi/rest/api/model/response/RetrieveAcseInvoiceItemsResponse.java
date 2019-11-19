package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;
import ph.cpi.rest.api.model.accountingservice.AcseInvoiceItems;

public class RetrieveAcseInvoiceItemsResponse {
	
	private List<AcseInvoiceItems> invoiceItemList;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	
	public List<AcseInvoiceItems> getInvoiceItemList() {
		return invoiceItemList;
	}
	public void setInvoiceItemList(List<AcseInvoiceItems> invoiceItemList) {
		this.invoiceItemList = invoiceItemList;
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
		return "RetrieveAcseInvoiceItemsResponse [invoiceItemList="
				+ invoiceItemList + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
	
}
