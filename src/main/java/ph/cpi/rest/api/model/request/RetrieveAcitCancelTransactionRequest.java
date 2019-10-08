package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcitCancelTransactionRequest {
	private Integer tranId;
	private String tranClass;
	private String cancelFrom;
	private String cancelTo;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	public String getCancelFrom() {
		return cancelFrom;
	}
	public void setCancelFrom(String cancelFrom) {
		this.cancelFrom = cancelFrom;
	}
	public String getCancelTo() {
		return cancelTo;
	}
	public void setCancelTo(String cancelTo) {
		this.cancelTo = cancelTo;
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
		return "RetrieveAcseCancelTransactionRequest [tranId=" + tranId + ", tranClass=" + tranClass + ", cancelFrom="
				+ cancelFrom + ", cancelTo=" + cancelTo + ", paginationRequest=" + paginationRequest + ", sortRequest="
				+ sortRequest + "]";
	}
	
	
}
