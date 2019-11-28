package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.Response;
import ph.cpi.rest.api.model.underwriting.PolicyAsIs;

public class ExtGenRenExpPolicyResponse extends Response{
	
	private PolicyAsIs renewedPolicy;
	
	public PolicyAsIs getRenewedPolicy() {
		return renewedPolicy;
	}

	public void setRenewedPolicy(PolicyAsIs renewedPolicy) {
		this.renewedPolicy = renewedPolicy;
	}

	@Override
	public String toString() {
		return "ExtractRenExpPolicyResponse [renewedPolicy=" + renewedPolicy + ", getMessageList()=" + getMessageList()
				+ ", getErrorList()=" + getErrorList() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
