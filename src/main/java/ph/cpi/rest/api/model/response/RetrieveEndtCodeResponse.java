package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.EndtCode;;

public class RetrieveEndtCodeResponse {
	private List<EndtCode> endtCode;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<EndtCode> getEndtCode() {
		return endtCode;
	}
	public void setEndtCode(List<EndtCode> endtCode) {
		this.endtCode = endtCode;
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
		return "RetrieveEndtCodeResponse [endtCode=" + endtCode + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
	
}
