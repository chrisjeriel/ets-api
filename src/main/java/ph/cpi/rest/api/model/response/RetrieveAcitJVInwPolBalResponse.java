package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitJVAdjstInwPolBal;

public class RetrieveAcitJVInwPolBalResponse {
	private List<AcitJVAdjstInwPolBal> inwPolBal;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	
	public List<AcitJVAdjstInwPolBal> getInwPolBal() {
		return inwPolBal;
	}
	public void setInwPolBal(List<AcitJVAdjstInwPolBal> inwPolBal) {
		this.inwPolBal = inwPolBal;
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
		return "RetrieveAcitJVInwPolBalResponse [inwPolBal=" + inwPolBal + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
