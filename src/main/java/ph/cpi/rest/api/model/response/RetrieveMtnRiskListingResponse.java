package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Risk;

public class RetrieveMtnRiskListingResponse {

	private List<Risk> risk;
	private Integer count;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<Risk> getRisk() {
		return risk;
	}
	public void setRisk(List<Risk> risk) {
		this.risk = risk;
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
		return "RetrieveMtnRiskListingResponse [risk=" + risk + ", count=" + count + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
