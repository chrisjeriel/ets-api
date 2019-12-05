package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingservice.AcseEditedAcctEntries;

public class RetrieveAcseEditedAcctEntriesResponse {
	private AcseEditedAcctEntries editedAcctEntries;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	public AcseEditedAcctEntries getEditedAcctEntries() {
		return editedAcctEntries;
	}
	public void setEditedAcctEntries(AcseEditedAcctEntries editedAcctEntries) {
		this.editedAcctEntries = editedAcctEntries;
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
		return "RetrieveAcseEditedAcctEntriesResponse [editedAcctEntries=" + editedAcctEntries + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
