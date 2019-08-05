package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.CedingCompany;

public class RetrieveMtnCedingTreatyResponse {
	private List<CedingCompany> cedingcompany;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<CedingCompany> getCedingcompany() {
		return cedingcompany;
	}
	public void setCedingcompany(List<CedingCompany> cedingcompany) {
		this.cedingcompany = cedingcompany;
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
		return "RetrieveMtnCedingTreatyResponse [cedingcompany=" + cedingcompany + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
