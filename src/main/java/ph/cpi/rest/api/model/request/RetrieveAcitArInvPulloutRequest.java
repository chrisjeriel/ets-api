package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcitArInvPulloutRequest {
	private String tranId;
	private String billId;
	private String pulloutType;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getPulloutType() {
		return pulloutType;
	}
	public void setPulloutType(String pulloutType) {
		this.pulloutType = pulloutType;
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
		return "RetrieveAcitArInvPulloutRequest [tranId=" + tranId + ", billId=" + billId + ", pulloutType="
				+ pulloutType + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
