package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcitDefaultAmtDtl;

public class RetrieveMtnAcitDefAmtDtlResponse {
	private List<AcitDefaultAmtDtl> defAmtDtl;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	public List<AcitDefaultAmtDtl> getDefAmtDtl() {
		return defAmtDtl;
	}
	public void setDefAmtDtl(List<AcitDefaultAmtDtl> defAmtDtl) {
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
		return "RetrieveMtnAcitDefAmtDtlResponse [defAmtDtl=" + defAmtDtl + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
