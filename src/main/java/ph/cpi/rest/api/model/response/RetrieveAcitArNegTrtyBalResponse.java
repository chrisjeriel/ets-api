package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitArNegTrtyBal;

public class RetrieveAcitArNegTrtyBalResponse {
	private List<AcitArNegTrtyBal> negTrtyBalList;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	public List<AcitArNegTrtyBal> getNegTrtyBalList() {
		return negTrtyBalList;
	}
	public void setNegTrtyBalList(List<AcitArNegTrtyBal> negTrtyBalList) {
		this.negTrtyBalList = negTrtyBalList;
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
}
