package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveQuoteHoldCoverRequest {
	private Integer holdCoverId;
	private String holdCoverNo;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public Integer getHoldCoverId() {
		return holdCoverId;
	}
	public void setHoldCoverId(Integer holdCoverId) {
		this.holdCoverId = holdCoverId;
	}
	public String getHoldCoverNo() {
		return holdCoverNo;
	}
	public void setHoldCoverNo(String holdCoverNo) {
		this.holdCoverNo = holdCoverNo;
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
		return "RetrieveQuoteHoldCoverRequest [holdCoverId=" + holdCoverId + ", holdCoverNo=" + holdCoverNo
				+ ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
