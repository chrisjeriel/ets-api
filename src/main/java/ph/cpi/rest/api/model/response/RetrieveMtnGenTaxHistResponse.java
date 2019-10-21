package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.GeneralTaxes;

public class RetrieveMtnGenTaxHistResponse {
	
	private List<GeneralTaxes> genTaxList;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	
	public List<GeneralTaxes> getGenTaxList() {
		return genTaxList;
	}
	public void setGenTaxList(List<GeneralTaxes> genTaxList) {
		this.genTaxList = genTaxList;
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
		return "RetrieveMtnGenTaxHistResponse [genTaxList=" + genTaxList
				+ ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
}
