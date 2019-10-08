package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingservice.AcseOrServFee;

public class RetrieveAcseOrServFeeResponse {
	private List<AcseOrServFee> servFeeList;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	public List<AcseOrServFee> getServFeeList() {
		return servFeeList;
	}
	public void setServFeeList(List<AcseOrServFee> servFeeList) {
		this.servFeeList = servFeeList;
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
		return "RetrieveAcseOrServFeeResponse [servFeeList=" + servFeeList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
