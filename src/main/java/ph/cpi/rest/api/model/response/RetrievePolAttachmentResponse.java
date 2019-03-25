package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.Attachment;

public class RetrievePolAttachmentResponse {
	
	private List<Attachment> polAttachmentList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<Attachment> getPolAttachmentList() {
		return polAttachmentList;
	}
	public void setPolAttachmentList(List<Attachment> polAttachmentList) {
		this.polAttachmentList = polAttachmentList;
	}
	public PaginationResponse getPaginationResponse() {
		if(paginationResponse == null){
			paginationResponse = new PaginationResponse();
		}
		return paginationResponse;
	}
	public void setPaginationResponse(PaginationResponse paginationResponse) {
		this.paginationResponse = paginationResponse;
	}
	public SortResponse getSortResponse() {
		if(sortResponse == null){
			sortResponse = new SortResponse();
		}
		return sortResponse;
	}
	public void setSortResponse(SortResponse sortResponse) {
		this.sortResponse = sortResponse;
	}
	
	@Override
	public String toString() {
		return "RetrievePolAttachmentResponse [polAttachmentList=" + polAttachmentList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
