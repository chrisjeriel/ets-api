package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingservice.AcseJournalVoucherList;

public class RetrieveAcseJVListResponse {
	private List<AcseJournalVoucherList> jvList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseJournalVoucherList> getJvList() {
		return jvList;
	}
	public void setJvList(List<AcseJournalVoucherList> jvList) {
		this.jvList = jvList;
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
		return "RetrieveAcseJVListResponse [jvList=" + jvList + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
	
}
