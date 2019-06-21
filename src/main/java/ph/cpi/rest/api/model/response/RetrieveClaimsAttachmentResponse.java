package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.claims.Attachment;

public class RetrieveClaimsAttachmentResponse {

	private List<Attachment> claimsAttachmentList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<Attachment> getClaimsAttachmentList() {
		return claimsAttachmentList;
	}
	public void setClaimsAttachmentList(List<Attachment> claimsAttachmentList) {
		this.claimsAttachmentList = claimsAttachmentList;
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
		return "RetrieveClaimsAttachmentResponse [claimsAttachmentList=" + claimsAttachmentList
				+ ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
	
		
}
