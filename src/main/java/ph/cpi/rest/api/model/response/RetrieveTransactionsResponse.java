package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.workflow.DashboardTran;

public class RetrieveTransactionsResponse {
	private List<DashboardTran> dashboardTran;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<DashboardTran> getDashboardTran() {
		return dashboardTran;
	}
	public void setDashboardTran(List<DashboardTran> dashboardTran) {
		this.dashboardTran = dashboardTran;
	}
	public PaginationResponse getPaginationResponse() {
		if(paginationResponse == null){
			paginationResponse = new PaginationResponse();
		}
		return paginationResponse;
	}
	public void setPaginationResponse(PaginationResponse paginationResponse) {
		this.paginationResponse = paginationResponse;
	}
	public SortResponse getSortResponse() {
		if(sortResponse == null){
			sortResponse = new SortResponse();
		}
		return sortResponse;
	}
	public void setSortResponse(SortResponse sortResponse) {
		this.sortResponse = sortResponse;
	}
	@Override
	public String toString() {
		return "RetrieveTransactionsResponse [dashboardTran=" + dashboardTran + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
