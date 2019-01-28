package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveEndtCodeRequest {
	
	private String lineCd;
	private Integer endtCd;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public Integer getEndtCd() {
		return endtCd;
	}
	public void setEndtCd(Integer endtCd) {
		this.endtCd = endtCd;
	}
	public PaginationRequest getPaginationRequest() {
		return paginationRequest;
	}
	public void setPaginationRequest(PaginationRequest paginationRequest) {
		this.paginationRequest = paginationRequest;
	}
	public SortRequest getSortRequest() {
		return sortRequest;
	}
	public void setSortRequest(SortRequest sortRequest) {
		this.sortRequest = sortRequest;
	}
	@Override
	public String toString() {
		return "RetrieveEndtCodeRequest [lineCd=" + lineCd + ", endtCd=" + endtCd + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}

	
}
