package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcseWhTaxHistory;

public class RetrieveMtnAcseWhTaxHistResponse {
	private List<AcseWhTaxHistory> whTaxHist;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseWhTaxHistory> getWhTaxHist() {
		return whTaxHist;
	}
	public void setWhTaxHist(List<AcseWhTaxHistory> whTaxHist) {
		this.whTaxHist = whTaxHist;
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
		return "RetrieveMtnAcseWhTaxHistResponse [whTaxHist=" + whTaxHist + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
