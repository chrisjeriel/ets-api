package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcseDefaultTax;

public class RetrieveMtnAcseDefTaxResponse {
	private List<AcseDefaultTax> defTax;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseDefaultTax> getDefTax() {
		return defTax;
	}
	public void setDefTax(List<AcseDefaultTax> defTax) {
		this.defTax = defTax;
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
		return "RetrieveMtnAcseDefTaxResponse [defTax=" + defTax + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
