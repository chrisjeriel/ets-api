package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcseChartAcct;

public class RetrieveMtnAcseChartAcctResponse {
	
	private List<AcseChartAcct> acseChartAcctList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<AcseChartAcct> getAcseChartAcctList() {
		return acseChartAcctList;
	}
	public void setAcseChartAcctList(List<AcseChartAcct> acseChartAcctList) {
		this.acseChartAcctList = acseChartAcctList;
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
		return "RetrieveMtnAcseChartAcctResponse [acseChartAcctList="
				+ acseChartAcctList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
