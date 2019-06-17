package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.claims.Claims;

public class RetrieveClaimsAttachmentResponse {

	private Claims clmAttachmentList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public Claims getClmAttachmentList() {
		return clmAttachmentList;
	}
	public void setClmAttachmentList(Claims clmAttachmentList) {
		this.clmAttachmentList = clmAttachmentList;
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
		return "RetrieveClaimsAttachmentResponse [clmAttachmentList=" + clmAttachmentList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
