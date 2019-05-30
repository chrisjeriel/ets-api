package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.CedingRetention;

public class RetrieveMtnCedingRetentionResponse {

	private List<CedingRetention> cedingRetentionList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<CedingRetention> getCedingRetentionList() {
		return cedingRetentionList;
	}
	public void setCedingRetentionList(List<CedingRetention> cedingRetentionList) {
		this.cedingRetentionList = cedingRetentionList;
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
		return "RetrieveMtnCedingRetentionResponse [cedingRetentionList=" + cedingRetentionList
				+ ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
