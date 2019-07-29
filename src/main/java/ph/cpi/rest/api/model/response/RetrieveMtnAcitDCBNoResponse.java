package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcitDCBNo;

public class RetrieveMtnAcitDCBNoResponse {
	private List<AcitDCBNo> dcbNoList;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	
	public List<AcitDCBNo> getDcbNoList() {
		return dcbNoList;
	}
	public void setDcbNoList(List<AcitDCBNo> dcbNoList) {
		this.dcbNoList = dcbNoList;
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
		return "RetrieveMtnAcitDCBNoResponse [dcbNoList=" + dcbNoList + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
}
