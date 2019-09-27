package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.MtnAcseTranType;

public class RetrieveMtnAcseTranTypeResponse {
	private List<MtnAcseTranType> tranTypeList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<MtnAcseTranType> getTranTypeList() {
		return tranTypeList;
	}
	public void setTranTypeList(List<MtnAcseTranType> tranTypeList) {
		this.tranTypeList = tranTypeList;
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
		return "RetrieveMtnAcseTranTypeResponse [tranTypeList=" + tranTypeList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
