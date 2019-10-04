package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingservice.AcsePrqTrans;

public class RetrieveAcsePrqTransResponse {
	private List<AcsePrqTrans> acsePrqTrans;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcsePrqTrans> getAcsePrqTrans() {
		return acsePrqTrans;
	}
	public void setAcsePrqTrans(List<AcsePrqTrans> acsePrqTrans) {
		this.acsePrqTrans = acsePrqTrans;
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
		return "RetrieveAcsePrqTransResponse [acsePrqTrans=" + acsePrqTrans + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
