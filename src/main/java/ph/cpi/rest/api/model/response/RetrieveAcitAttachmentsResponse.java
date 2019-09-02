package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitAttachments;

public class RetrieveAcitAttachmentsResponse {
	private List<AcitAttachments> acitAttachmentsList;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	public List<AcitAttachments> getAcitAttachmentsList() {
		return acitAttachmentsList;
	}
	public void setAcitAttachmentsList(List<AcitAttachments> acitAttachmentsList) {
		this.acitAttachmentsList = acitAttachmentsList;
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
		return "RetrieveAcitAttachmentsResponse [acitAttachmentsList=" + acitAttachmentsList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
