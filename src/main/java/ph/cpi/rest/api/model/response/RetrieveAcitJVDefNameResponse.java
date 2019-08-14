package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.UserId;

public class RetrieveAcitJVDefNameResponse {
	private UserId employee;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public UserId getEmployee() {
		return employee;
	}

	public void setEmployee(UserId employee) {
		this.employee = employee;
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
		return "RetrieveAcitJVDefNameResponse [employee=" + employee + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
