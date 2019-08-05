package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcitServFeeMainGnrtRequest {

	private String prdAsOf;
	private Integer year;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public String getPrdAsOf() {
		return prdAsOf;
	}
	public void setPrdAsOf(String prdAsOf) {
		this.prdAsOf = prdAsOf;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
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
		return "RetrieveAcitServFeeMainGnrtRequest [prdAsOf=" + prdAsOf + ", year=" + year + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
