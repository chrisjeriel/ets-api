package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.Response;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.CedingCompany;

public class RetrieveMtnCedingCompanyResponse extends Response {
	private List<CedingCompany> cedingCompany;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<CedingCompany> getCedingCompany() {
		
		return cedingCompany;
	}
	public void setCedingCompany(List<CedingCompany> cedingCompany) {
		this.cedingCompany = cedingCompany;
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
		return "RetrieveMtnCedingCompanyResponse [cedingCompany=" + cedingCompany + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
	
}
