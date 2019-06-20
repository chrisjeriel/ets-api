package ph.cpi.rest.api.model.request;

import java.util.List;

import ph.cpi.rest.api.model.underwriting.PolicyAsIs;
import ph.cpi.rest.api.model.underwriting.PolicyNonRenewal;
import ph.cpi.rest.api.model.underwriting.PolicyWithChanges;

public class ProcessRenewablePolicyRequest {

	private List<PolicyAsIs> renAsIsPolicyList;
	private List<PolicyWithChanges> renWithChangesPolicyList;
	private List<PolicyNonRenewal> nonRenPolicyList;
	
	public List<PolicyAsIs> getRenAsIsPolicyList() {
		return renAsIsPolicyList;
	}
	public void setRenAsIsPolicyList(List<PolicyAsIs> renAsIsPolicyList) {
		this.renAsIsPolicyList = renAsIsPolicyList;
	}
	public List<PolicyWithChanges> getRenWithChangesPolicyList() {
		return renWithChangesPolicyList;
	}
	public void setRenWithChangesPolicyList(List<PolicyWithChanges> renWithChangesPolicyList) {
		this.renWithChangesPolicyList = renWithChangesPolicyList;
	}
	public List<PolicyNonRenewal> getNonRenPolicyList() {
		return nonRenPolicyList;
	}
	public void setNonRenPolicyList(List<PolicyNonRenewal> nonRenPolicyList) {
		this.nonRenPolicyList = nonRenPolicyList;
	}
	@Override
	public String toString() {
		return "ProcessRenewablePolicyRequest [renAsIsPolicyList=" + renAsIsPolicyList + ", renWithChangesPolicyList="
				+ renWithChangesPolicyList + ", nonRenPolicyList=" + nonRenPolicyList + "]";
	}
}

