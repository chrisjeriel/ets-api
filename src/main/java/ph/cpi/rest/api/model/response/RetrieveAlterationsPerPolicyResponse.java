package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.Policy;

public class RetrieveAlterationsPerPolicyResponse {
	
	private Integer coInsStatus;
	private Integer coInsAlt;
	private List<Policy> policyList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public Integer getCoInsStatus() {
		return coInsStatus;
	}
	public void setCoInsStatus(Integer coInsStatus) {
		this.coInsStatus = coInsStatus;
	}
	public Integer getCoInsAlt() {
		return coInsAlt;
	}
	public void setCoInsAlt(Integer coInsAlt) {
		this.coInsAlt = coInsAlt;
	}
	public List<Policy> getPolicyList() {
		return policyList;
	}
	public void setPolicyList(List<Policy> policyList) {
		this.policyList = policyList;
	}
	public PaginationResponse getPaginationResponse() {
		return paginationResponse;
	}
	public void setPaginationResponse(PaginationResponse paginationResponse) {
		this.paginationResponse = paginationResponse;
	}
	public SortResponse getSortResponse() {
		return sortResponse;
	}
	public void setSortResponse(SortResponse sortResponse) {
		this.sortResponse = sortResponse;
	}
	@Override
	public String toString() {
		return "RetrieveAlterationsPerPolicyResponse [coInsStatus=" + coInsStatus + ", coInsAlt=" + coInsAlt
				+ ", policyList=" + policyList + ", paginationResponse=" + paginationResponse + ", sortResponse="
				+ sortResponse + "]";
	}
}
