package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Reports;

public class RetrieveMtnReportsResponse {
	
	private List<Reports> reports;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	
	public List<Reports> getReports() {
		return reports;
	}


	public void setReports(List<Reports> reports) {
		this.reports = reports;
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
		return "RetrieveMtnReportsResponse [reports=" + reports + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
	
}
