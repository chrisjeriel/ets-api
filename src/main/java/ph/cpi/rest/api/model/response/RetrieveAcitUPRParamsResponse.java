package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.accountingintrust.GenUPRParams;

public class RetrieveAcitUPRParamsResponse {
	private GenUPRParams params;

	public GenUPRParams getParams() {
		return params;
	}

	public void setParams(GenUPRParams params) {
		this.params = params;
	}

	@Override
	public String toString() {
		return "RetrieveAcitUPRParamsResponse [params=" + params + "]";
	}
	
}
