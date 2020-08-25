package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingservice.AcseAcctEntriesExt;

public class RetrieveAcseAcctEntriesExtResponse {
	private List<AcseAcctEntriesExt> acseAcctEntriesExt;

	public List<AcseAcctEntriesExt> getAcseAcctEntriesExt() {
		return acseAcctEntriesExt;
	}

	public void setAcseAcctEntriesExt(List<AcseAcctEntriesExt> acseAcctEntriesExt) {
		this.acseAcctEntriesExt = acseAcctEntriesExt;
	}

	@Override
	public String toString() {
		return "RetrieveAcseAcctEntriesExtResponse [acseAcctEntriesExt=" + acseAcctEntriesExt + "]";
	}
	

	
	
}
