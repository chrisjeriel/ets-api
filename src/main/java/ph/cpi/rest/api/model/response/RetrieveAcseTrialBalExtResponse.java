package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingservice.AcseTrialBal;


public class RetrieveAcseTrialBalExtResponse {
	private List<AcseTrialBal> list;

	public List<AcseTrialBal> getList() {
		return list;
	}

	public void setList(List<AcseTrialBal> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "RetrieveAcseTrialBalExtResponse [list=" + list + "]";
	}

	
}
