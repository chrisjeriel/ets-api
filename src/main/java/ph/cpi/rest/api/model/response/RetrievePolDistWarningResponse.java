package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.Warning;

public class RetrievePolDistWarningResponse {
	
	private List<Warning> warningList= new ArrayList<Warning>();
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<Warning> getWarningList() {
		return warningList;
	}
	public void setWarningList(List<Warning> warningList) {
		this.warningList = warningList;
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
		return "RetrievePolDistWarningResponse [warningList=" + warningList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
	
}

