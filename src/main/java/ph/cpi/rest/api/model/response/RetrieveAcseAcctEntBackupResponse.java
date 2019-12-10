package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingservice.AcseAcctEntries;

public class RetrieveAcseAcctEntBackupResponse {
	private List<AcseAcctEntries> backupAcctEnt;

	public List<AcseAcctEntries> getBackupAcctEnt() {
		return backupAcctEnt;
	}

	public void setBackupAcctEnt(List<AcseAcctEntries> list) {
		this.backupAcctEnt = list;
	}

	@Override
	public String toString() {
		return "RetrieveAcseAcctEntBackupResponse [backupAcctEnt=" + backupAcctEnt + "]";
	}
}
