package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.underwriting.PolOcInfo;

public class RetrievePolOcInfoResponse {
	private PolOcInfo policy;

	public PolOcInfo getPolicy() {
		return policy;
	}

	public void setPolicy(PolOcInfo policy) {
		this.policy = policy;
	}

	@Override
	public String toString() {
		return "RetrievePolOcInfoResponse [policy=" + policy + "]";
	}
	
}
