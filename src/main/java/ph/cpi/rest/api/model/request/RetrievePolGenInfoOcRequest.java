package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrievePolGenInfoOcRequest {
	private Integer policyIdOc;
	private String openPolicyNo;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	
	public Integer getPolicyIdOc() {
		return policyIdOc;
	}
	public void setPolicyIdOc(Integer policyIdOc) {
		this.policyIdOc = policyIdOc;
	}
	public String getOpenPolicyNo() {
		return openPolicyNo;
	}
	public void setOpenPolicyNo(String openPolicyNo) {
		this.openPolicyNo = openPolicyNo;
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
		return "RetrievePolGenInfoOcRequest [policyIdOc=" + policyIdOc + ", openPolicyNo=" + openPolicyNo
				+ ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
