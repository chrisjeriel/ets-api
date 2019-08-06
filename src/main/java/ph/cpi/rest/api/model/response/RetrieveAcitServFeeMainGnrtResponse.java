package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcctServFeeDist;

public class RetrieveAcitServFeeMainGnrtResponse {

	private List<AcctServFeeDist> mainDistList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<AcctServFeeDist> getMainDistList() {
		return mainDistList;
	}
	public void setMainDistList(List<AcctServFeeDist> mainDistList) {
		this.mainDistList = mainDistList;
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
		return "RetrieveAcitServFeeMainGnrtResponse [mainDistList=" + mainDistList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
