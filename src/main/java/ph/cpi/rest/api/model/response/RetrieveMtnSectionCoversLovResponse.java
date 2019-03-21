package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.SectionCovers;

public class RetrieveMtnSectionCoversLovResponse {

	private List<SectionCovers> sectionCovers;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<SectionCovers> getSectionCovers() {
		return sectionCovers;
	}
	public void setSectionCovers(List<SectionCovers> sectionCovers) {
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
		return "RetrieveMtnSectionCoversLovResponse [sectionCovers=" + sectionCovers + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
