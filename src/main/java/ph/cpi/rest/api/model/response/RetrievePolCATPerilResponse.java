package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.CATPeril;
import ph.cpi.rest.api.model.underwriting.Item;

public class RetrievePolCATPerilResponse {
	
	private CATPeril catPeril;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public CATPeril getCatPeril() {
		return catPeril;
	}
	public void setCatPeril(CATPeril catPeril) {
		this.catPeril = catPeril;
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
		return "RetrievePolCATPerilResponse [catPeril=" + catPeril + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	

}
