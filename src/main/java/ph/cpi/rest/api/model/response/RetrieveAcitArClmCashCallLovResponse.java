package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitArClmCashCallLov;
import ph.cpi.rest.api.model.accountingintrust.AcitArClmRecoverLov;

public class RetrieveAcitArClmCashCallLovResponse {
	private List<AcitArClmCashCallLov> clmCashCallLovList;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	
	public List<AcitArClmCashCallLov> getClmCashCallLovList() {
		return clmCashCallLovList;
	}
	public void setClmCashCallLovList(List<AcitArClmCashCallLov> clmCashCallLovList) {
		this.clmCashCallLovList = clmCashCallLovList;
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
		return "RetrieveAcitArClmCashCallLovResponse [clmCashCallLovList=" + clmCashCallLovList
				+ ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
