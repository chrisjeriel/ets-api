package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcitPaytReqRequest {
	private String reqId;
    private String paytReqNo;
    private String tranTypeDesc;
    private String reqDateFrom;
    private String reqDateTo;
    private String reqStatusDesc;
    private String payee;
    private String currCd;
    private String reqAmt;
    private String particulars;
    private String requestedBy;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public String getReqId() {
		return reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	public String getPaytReqNo() {
		return paytReqNo;
	}
	public void setPaytReqNo(String paytReqNo) {
		this.paytReqNo = paytReqNo;
	}
	public String getTranTypeDesc() {
		return tranTypeDesc;
	}
	public void setTranTypeDesc(String tranTypeDesc) {
		this.tranTypeDesc = tranTypeDesc;
	}
	public String getReqDateFrom() {
		return reqDateFrom;
	}
	public void setReqDateFrom(String reqDateFrom) {
		this.reqDateFrom = reqDateFrom;
	}
	public String getReqDateTo() {
		return reqDateTo;
	}
	public void setReqDateTo(String reqDateTo) {
		this.reqDateTo = reqDateTo;
	}
	public String getReqStatusDesc() {
		return reqStatusDesc;
	}
	public void setReqStatusDesc(String reqStatusDesc) {
		this.reqStatusDesc = reqStatusDesc;
	}
	public String getPayee() {
		return payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public String getReqAmt() {
		return reqAmt;
	}
	public void setReqAmt(String reqAmt) {
		this.reqAmt = reqAmt;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getRequestedBy() {
		return requestedBy;
	}
	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
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
		return "RetrieveAcitPaytReqRequest [reqId=" + reqId + ", paytReqNo=" + paytReqNo + ", tranTypeDesc="
				+ tranTypeDesc + ", reqDateFrom=" + reqDateFrom + ", reqDateTo=" + reqDateTo + ", reqStatusDesc="
				+ reqStatusDesc + ", payee=" + payee + ", currCd=" + currCd + ", reqAmt=" + reqAmt + ", particulars="
				+ particulars + ", requestedBy=" + requestedBy + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
}