package ph.cpi.rest.api.model.response;
import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitProfCommSumm;

public class RetrieveAcitProfCommSummResponse {

	private List<AcitProfCommSumm> acitProfCommSummList;
	private List<AcitProfCommSumm> acitProfCommParams;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<AcitProfCommSumm> getAcitProfCommSummList() {
		return acitProfCommSummList;
	}
	public void setAcitProfCommSummList(List<AcitProfCommSumm> acitProfCommSummList) {
		this.acitProfCommSummList = acitProfCommSummList;
	}
	public List<AcitProfCommSumm> getAcitProfCommParams() {
		return acitProfCommParams;
	}
	public void setAcitProfCommParams(List<AcitProfCommSumm> acitProfCommParams) {
		this.acitProfCommParams = acitProfCommParams;
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
		return "RetrieveAcitProfCommSummResponse [acitProfCommSummList=" + acitProfCommSummList
				+ ", acitProfCommParams=" + acitProfCommParams + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
}
