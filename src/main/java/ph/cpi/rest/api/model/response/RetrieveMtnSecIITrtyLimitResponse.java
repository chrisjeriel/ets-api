package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.SecIITreatyLimit;

public class RetrieveMtnSecIITrtyLimitResponse {

	private List<SecIITreatyLimit> secIITreatyLimList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<SecIITreatyLimit> getSecIITreatyLimList() {
		return secIITreatyLimList;
	}
	public void setSecIITreatyLimList(List<SecIITreatyLimit> secIITreatyLimList) {
		this.secIITreatyLimList = secIITreatyLimList;
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
		return "RetrieveMtnSecIITrtyLimitResponse [secIITreatyLimList=" + secIITreatyLimList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
