package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitTrialBal;


public class RetrieveAcitTrialBalExtResponse {
	private List<AcitTrialBal> list;

	public List<AcitTrialBal> getList() {
		return list;
	}

	public void setList(List<AcitTrialBal> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "RetrieveAcitTrialBalExtResponse [list=" + list + "]";
	}
	
	
}
