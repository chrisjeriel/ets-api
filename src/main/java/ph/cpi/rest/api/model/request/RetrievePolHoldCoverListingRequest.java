package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrievePolHoldCoverListingRequest {
	private String holdCovNo;
	private String status;
	private String cedingName;
	private String policyNo;
	private String riskName;
	private String insuredDesc;
	private String periodFrom;
	private String periodTo;
	private String compRefHoldCovNo;
	private String reqBy;
	private String reqDateFrom;
	private String reqDateTo;
	private String expiringInDays;
	private PaginationRequest 	paginationRequest;
	private SortRequest			sortRequest;
	public String getHoldCovNo() {
		return holdCovNo;
	}
	public void setHoldCovNo(String holdCovNo) {
		this.holdCovNo = holdCovNo;
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
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
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
	public String getPeriodFrom() {
		return periodFrom;
	}
	public void setPeriodFrom(String periodFrom) {
		this.periodFrom = periodFrom;
	}
	public String getPeriodTo() {
		return periodTo;
	}
	public void setPeriodTo(String periodTo) {
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
	public String getExpiringInDays() {
		return expiringInDays;
	}
	public void setExpiringInDays(String expiringInDays) {
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
		return "RetrievePolHoldCoverListingRequest [holdCovNo=" + holdCovNo + ", status=" + status + ", cedingName="
				+ cedingName + ", policyNo=" + policyNo + ", riskName=" + riskName + ", insuredDesc=" + insuredDesc
				+ ", periodFrom=" + periodFrom + ", periodTo=" + periodTo + ", compRefHoldCovNo=" + compRefHoldCovNo
				+ ", reqBy=" + reqBy + ", reqDateFrom=" + reqDateFrom + ", reqDateTo=" + reqDateTo + ", expiringInDays="
				+ expiringInDays + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
	
}
