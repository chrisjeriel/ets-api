package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.GeneralTaxes;

public class RetrieveMtnGenTaxRangeResponse {
	
	private List<GeneralTaxes> genTaxListRange;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	
	public List<GeneralTaxes> getGenTaxListRange() {
		return genTaxListRange;
	}
	public void setGenTaxListRange(List<GeneralTaxes> genTaxListRange) {
		this.genTaxListRange = genTaxListRange;
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
		return "RetrieveMtnGenTaxRangeResponse [genTaxListRange="
				+ genTaxListRange + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	

}
