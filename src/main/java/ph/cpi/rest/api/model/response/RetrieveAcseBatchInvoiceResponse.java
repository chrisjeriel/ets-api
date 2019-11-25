package ph.cpi.rest.api.model.response;

import java.util.List;
import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;
import ph.cpi.rest.api.model.accountingservice.AcseBatchInvoice;

public class RetrieveAcseBatchInvoiceResponse {

	private List<AcseBatchInvoice> batchInvoiceList;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	
	public List<AcseBatchInvoice> getBatchInvoiceList() {
		return batchInvoiceList;
	}
	public void setBatchInvoiceList(List<AcseBatchInvoice> batchInvoiceList) {
		this.batchInvoiceList = batchInvoiceList;
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
		return "RetrieveAcseBatchInvoiceResponse [batchInvoiceList="
				+ batchInvoiceList + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}

}
