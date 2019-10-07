package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingservice.AcseAttachments;

public class RetrieveAcseAttachmentsResponse {
	private List<AcseAttachments> acseAttachmentsList;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	
	
	public List<AcseAttachments> getAcseAttachmentsList() {
		return acseAttachmentsList;
	}
	public void setAcseAttachmentsList(List<AcseAttachments> acseAttachmentsList) {
		this.acseAttachmentsList = acseAttachmentsList;
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
		return "RetrieveAcseAttachmentsResponse [acseAttachmentsList=" + acseAttachmentsList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
