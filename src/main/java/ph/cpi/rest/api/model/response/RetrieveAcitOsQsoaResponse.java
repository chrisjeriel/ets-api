package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitOsQsoa;

public class RetrieveAcitOsQsoaResponse {

	private List<AcitOsQsoa> osQsoaList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<AcitOsQsoa> getOsQsoaList() {
		return osQsoaList;
	}
	public void setOsQsoaList(List<AcitOsQsoa> osQsoaList) {
		this.osQsoaList = osQsoaList;
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
		return "RetrieveAcitOsQsoaResponse [osQsoaList=" + osQsoaList + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
}
