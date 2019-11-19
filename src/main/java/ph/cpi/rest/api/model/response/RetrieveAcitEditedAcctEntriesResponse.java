package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitEditedAcctEntries;

public class RetrieveAcitEditedAcctEntriesResponse {
	private AcitEditedAcctEntries editedAcctEntries;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	public AcitEditedAcctEntries getEditedAcctEntries() {
		return editedAcctEntries;
	}
	public void setEditedAcctEntries(AcitEditedAcctEntries editedAcctEntries) {
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
		return "RetrieveAcitEditedAcctEntriesResponse [editedAcctEntries=" + editedAcctEntries + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
