package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveChangeClaimStatusRequest {
	private Integer claimId;
	private Integer policyId;
	private Integer cessionId;
	private String cedingId;
	private Integer riskId;
	private String batchOpt;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public Integer getCessionId() {
		return cessionId;
	}
	public void setCessionId(Integer cessionId) {
		this.cessionId = cessionId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public Integer getRiskId() {
		return riskId;
	}
	public void setRiskId(Integer riskId) {
		this.riskId = riskId;
	}
	public String getBatchOpt() {
		return batchOpt;
	}
	public void setBatchOpt(String batchOpt) {
		this.batchOpt = batchOpt;
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
		return "RetrieveChangeClaimStatusRequest [claimId=" + claimId + ", policyId=" + policyId + ", cessionId="
				+ cessionId + ", cedingId=" + cedingId + ", riskId=" + riskId + ", batchOpt=" + batchOpt
				+ ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
