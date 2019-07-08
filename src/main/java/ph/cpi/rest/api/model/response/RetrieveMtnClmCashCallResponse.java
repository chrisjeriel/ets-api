package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.MtnClmCashCall;

public class RetrieveMtnClmCashCallResponse {
	
	private List<MtnClmCashCall> cashCallList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<MtnClmCashCall> getCashCallList() {
		return cashCallList;
	}
	public void setCashCallList(List<MtnClmCashCall> cashCallList) {
		this.cashCallList = cashCallList;
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
		return "RetrieveMtnClmCashCallResponse [cashCallList=" + cashCallList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
