package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitArAmtDtl;

public class RetrieveAcitArAmtDtlResponse {
	private List<AcitArAmtDtl> arAmtDtlList;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	
	public List<AcitArAmtDtl> getArAmtDtlList() {
		return arAmtDtlList;
	}
	public void setArAmtDtlList(List<AcitArAmtDtl> arAmtDtlList) {
		this.arAmtDtlList = arAmtDtlList;
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
		return "RetrieveAcitArAmtDtlResponse [arAmtDtlList=" + arAmtDtlList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
