package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcseDefaultAmtDtl;

public class RetrieveMtnAcseDefAmtResponse {
	private List<AcseDefaultAmtDtl> defAmtDtl;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseDefaultAmtDtl> getDefAmtDtl() {
		return defAmtDtl;
	}
	public void setDefAmtDtl(List<AcseDefaultAmtDtl> defAmtDtl) {
		this.defAmtDtl = defAmtDtl;
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
		return "RetrieveMtnAcseDefAmtResponse [paginationResponse=" + paginationResponse + ", sortResponse="
				+ sortResponse + "]";
	}
	
}
