package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.accountingintrust.AcitJVQuarterPremRes;

public class RetrieveAcitJvQrtrPremResResponse {
	private AcitJVQuarterPremRes premRes;

	public AcitJVQuarterPremRes getPremRes() {
		return premRes;
	}

	public void setPremRes(AcitJVQuarterPremRes premRes) {
		this.premRes = premRes;
	}

	@Override
	public String toString() {
		return "RetrieveAcitJvQrtrPremResResponse [premRes=" + premRes + "]";
	}
	
}
