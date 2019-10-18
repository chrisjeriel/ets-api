package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcseDefaultAcctEntries;

public class RetrieveMtnAcseDefAcctEntResponse {
	private List<AcseDefaultAcctEntries> defAccEnt;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseDefaultAcctEntries> getDefAccEnt() {
		return defAccEnt;
	}
	public void setDefAccEnt(List<AcseDefaultAcctEntries> defAccEnt) {
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
		return "RetrieveMtnAcseDefAcctEntResponse [defAccEnt=" + defAccEnt + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
