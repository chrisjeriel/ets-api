package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitPrqTrans;

public class RetrieveAcitPrqTransResponse {
	private List<AcitPrqTrans> acitPrqTrans;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcitPrqTrans> getAcitPrqTrans() {
		return acitPrqTrans;
	}
	public void setAcitPrqTrans(List<AcitPrqTrans> acitPrqTrans) {
		this.acitPrqTrans = acitPrqTrans;
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
		return "RetrieveAcitPrqResponse [acitPrqTrans=" + acitPrqTrans + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
}
