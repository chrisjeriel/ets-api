package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Risk;
import ph.cpi.rest.api.model.maintenance.SectionCovers;

public class RetrieveMtnSectionCoversResponse {
	
	private SectionCovers sectionCovers;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public SectionCovers getSectionCovers() {
		return sectionCovers;
	}
	public void setSectionCovers(SectionCovers sectionCovers) {
		this.sectionCovers = sectionCovers;
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
		return "RetrieveMtnSectionCoversResponse [sectionCovers=" + sectionCovers + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}