package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAlterationsPerPolicyRequest {
	
	private String checkingType;
	private Integer policyId;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public String getCheckingType() {
		return checkingType;
	}
	public void setCheckingType(String checkingType) {
		this.checkingType = checkingType;
	}
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
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
		return "RetrieveAlterationsPerPolicyRequest [checkingType=" + checkingType + ", policyId=" + policyId
				+ ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
