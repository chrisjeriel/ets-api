package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.PolicyOc;

public class RetrievePolAttachmentOcResponse {
	private PolicyOc attachmentsList;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	
	public PolicyOc getAttachmentsList() {
		return attachmentsList;
	}
	public void setAttachmentsList(PolicyOc attachmentsList) {
		this.attachmentsList = attachmentsList;
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
		return "RetrievePolAttachmentOcResponse [attachmentsList=" + attachmentsList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
