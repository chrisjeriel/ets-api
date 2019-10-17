package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcitDefaultAccEntries;

public class RetrieveMtnAcitDefAcctEntResponse {
	private List<AcitDefaultAccEntries> defAccEnt;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	public List<AcitDefaultAccEntries> getDefAccEnt() {
		return defAccEnt;
	}
	public void setDefAccEnt(List<AcitDefaultAccEntries> defAccEnt) {
		this.defAccEnt = defAccEnt;
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
		return "RetrieveMtnAcitDefAcctEntResponse [defAccEnt=" + defAccEnt + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
