package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingservice.AcseJournalVoucherEntry;

public class RetrieveAcseJVEntryResponse {
	private AcseJournalVoucherEntry jvEntry;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	
	public AcseJournalVoucherEntry getJvEntry() {
		return jvEntry;
	}
	public void setJvEntry(AcseJournalVoucherEntry jvEntry) {
		this.jvEntry = jvEntry;
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
		return "RetrieveAcseJVEntryResponse [jvEntry=" + jvEntry + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
