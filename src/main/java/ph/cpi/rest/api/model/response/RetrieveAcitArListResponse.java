package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcknowledgementReceipt;

public class RetrieveAcitArListResponse {
	private List<AcknowledgementReceipt> ar;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	
	public List<AcknowledgementReceipt> getAr() {
		return ar;
	}
	public void setAr(List<AcknowledgementReceipt> ar) {
		this.ar = ar;
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
		return "RetrieveAcitArListResponse [ar=" + ar + ", paginationResponse=" + paginationResponse + ", sortResponse="
				+ sortResponse + "]";
	}
	
}
