package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitPrqInwPol;

public class RetrieveAcitPrqInwPolResponse {
	List<AcitPrqInwPol> acitPrqInwPolList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcitPrqInwPol> getAcitPrqInwPolList() {
		return acitPrqInwPolList;
	}
	public void setAcitPrqInwPolList(List<AcitPrqInwPol> acitPrqInwPolList) {
		this.acitPrqInwPolList = acitPrqInwPolList;
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
		return "RetrieveAcitPrqInwPolResponse [acitPrqInwPolList=" + acitPrqInwPolList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
