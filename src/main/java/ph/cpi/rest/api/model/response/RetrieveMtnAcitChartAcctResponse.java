package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcitChartAcct;

public class RetrieveMtnAcitChartAcctResponse {
	private List<AcitChartAcct> list;	
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcitChartAcct> getList() {
		return list;
	}
	public void setList(List<AcitChartAcct> list) {
		this.list = list;
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
		return "RetrieveMtnAcitChartAcctResponse [list=" + list + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
