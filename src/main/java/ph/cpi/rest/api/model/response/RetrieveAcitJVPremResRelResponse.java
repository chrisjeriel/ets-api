package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitJVPremResReleased;

public class RetrieveAcitJVPremResRelResponse {
	private List<AcitJVPremResReleased> premResRel;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<AcitJVPremResReleased> getPremResRel() {
		return premResRel;
	}
	public void setPremResRel(List<AcitJVPremResReleased> premResRel) {
		this.premResRel = premResRel;
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
		return "RetrieveAcitJVPremResRelResponse [premResRel=" + premResRel + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
