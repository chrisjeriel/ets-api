package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitJVInvestmentPlacement;

public class RetrieveAcitJvInvPlacementResponse {
	private List<AcitJVInvestmentPlacement> invPlacement;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcitJVInvestmentPlacement> getInvPlacement() {
		return invPlacement;
	}
	public void setInvPlacement(List<AcitJVInvestmentPlacement> invPlacement) {
		this.invPlacement = invPlacement;
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
		return "RetrieveAcitJvInvPlacementResponse [invPlacement=" + invPlacement + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
