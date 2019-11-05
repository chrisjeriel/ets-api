package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcseDefaultWhTax;

public class RetrieveMtnAcseDefWhTaxResponse {
	private List<AcseDefaultWhTax> defWhTax;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseDefaultWhTax> getDefWhTax() {
		return defWhTax;
	}
	public void setDefWhTax(List<AcseDefaultWhTax> defWhTax) {
		this.defWhTax = defWhTax;
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
		return "RetrieveMtnAcseDefWhTaxResponse [defWhTax=" + defWhTax + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
