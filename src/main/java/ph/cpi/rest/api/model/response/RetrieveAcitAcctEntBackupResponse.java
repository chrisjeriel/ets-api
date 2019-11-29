package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitAcctEntries;

public class RetrieveAcitAcctEntBackupResponse {
	private List<AcitAcctEntries> backupAcctEnt;

	public List<AcitAcctEntries> getBackupAcctEnt() {
		return backupAcctEnt;
	}

	public void setBackupAcctEnt(List<AcitAcctEntries> backupAcctEnt) {
		this.backupAcctEnt = backupAcctEnt;
	}

	@Override
	public String toString() {
		return "RetrieveAcitAcctEntBackupResponse [backupAcctEnt=" + backupAcctEnt + "]";
	}
}
