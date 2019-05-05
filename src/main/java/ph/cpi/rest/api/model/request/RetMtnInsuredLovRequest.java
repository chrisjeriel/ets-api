package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetMtnInsuredLovRequest {
	
	private String lovParam;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public String getLovParam() {
		return lovParam;
	}
	public void setLovParam(String lovParam) {
		this.lovParam = lovParam;
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
		return "RetMtnInsuredLovRequest [lovParam=" + lovParam + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
	
}
