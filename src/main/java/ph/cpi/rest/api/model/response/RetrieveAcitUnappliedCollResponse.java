package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitUnappliedCollection;

public class RetrieveAcitUnappliedCollResponse {
	private List<AcitUnappliedCollection> unappliedColl;

	public List<AcitUnappliedCollection> getUnappliedColl() {
		return unappliedColl;
	}

	public void setUnappliedColl(List<AcitUnappliedCollection> unappliedColl) {
		this.unappliedColl = unappliedColl;
	}

	@Override
	public String toString() {
		return "RetrieveAcitUnappliedCollResponse [unappliedColl=" + unappliedColl + "]";
	}
	
	
}
