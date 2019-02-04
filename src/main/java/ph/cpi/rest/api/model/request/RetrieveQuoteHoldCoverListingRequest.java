package ph.cpi.rest.api.model.request;

import org.joda.time.LocalDateTime;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveQuoteHoldCoverListingRequest {
	private String	        	holdCoverNo;
	private String	        	status;
	private String	        	cedingName;
	private String	        	quotationNo;
	private String	        	riskName;
	private String	        	insuredDesc;
	private LocalDateTime   	periodFrom;
	private LocalDateTime		periodTo;
	private String	        	compRefHoldCovNo;
	private String	        	reqBy;
	private LocalDateTime		reqDate;
	private Integer	        	expiringInDays;
	private PaginationRequest 	paginationRequest;
	private SortRequest			sortRequest;
	public String getHoldCoverNo() {
		return holdCoverNo;
	}
	public void setHoldCoverNo(String holdCoverNo) {
		this.holdCoverNo = holdCoverNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getQuotationNo() {
		return quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
	}
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public LocalDateTime getPeriodFrom() {
		return periodFrom;
	}
	public void setPeriodFrom(LocalDateTime periodFrom) {
		this.periodFrom = periodFrom;
	}
	public LocalDateTime getPeriodTo() {
		return periodTo;
	}
	public void setPeriodTo(LocalDateTime periodTo) {
		this.periodTo = periodTo;
	}
	public String getCompRefHoldCovNo() {
		return compRefHoldCovNo;
	}
	public void setCompRefHoldCovNo(String compRefHoldCovNo) {
		this.compRefHoldCovNo = compRefHoldCovNo;
	}
	public String getReqBy() {
		return reqBy;
	}
	public void setReqBy(String reqBy) {
		this.reqBy = reqBy;
	}
	public LocalDateTime getReqDate() {
		return reqDate;
	}
	public void setReqDate(LocalDateTime reqDate) {
		this.reqDate = reqDate;
	}
	public Integer getExpiringInDays() {
		return expiringInDays;
	}
	public void setExpiringInDays(Integer expiringInDays) {
		this.expiringInDays = expiringInDays;
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
		return "RetrieveQuoteHoldCoverListingRequest [holdCoverNo=" + holdCoverNo + ", status=" + status
				+ ", cedingName=" + cedingName + ", quotationNo=" + quotationNo + ", riskName=" + riskName
				+ ", insuredDesc=" + insuredDesc + ", periodFrom=" + periodFrom + ", periodTo=" + periodTo
				+ ", compRefHoldCovNo=" + compRefHoldCovNo + ", reqBy=" + reqBy + ", reqDate=" + reqDate
				+ ", expiringInDays=" + expiringInDays + ", paginationRequest=" + paginationRequest + ", sortRequest="
				+ sortRequest + "]";
	}
	
}
