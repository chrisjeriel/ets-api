package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitAcctEntriesExt;

public class RetrieveAcitAcctEntriesExtResponse {
	private List<AcitAcctEntriesExt> acitAcctEntriesExt;



	public List<AcitAcctEntriesExt> getAcitAcctEntriesExt() {
		return acitAcctEntriesExt;
	}



	public void setAcitAcctEntriesExt(List<AcitAcctEntriesExt> acitAcctEntriesExt) {
		this.acitAcctEntriesExt = acitAcctEntriesExt;
	}



	@Override
	public String toString() {
		return "RetrieveAcitAcctEntriesExtResponse [acitAcctEntriesExt=" + acitAcctEntriesExt + "]";
	}

	
	
}
