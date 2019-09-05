package ph.cpi.rest.api.model.request;

import java.util.List;

import ph.cpi.rest.api.model.maintenance.SaveTransaction;

public class SaveTransactionsRequest {
	
	String accessLevel;
	List<SaveTransaction> transactionList;
	
	public String getAccessLevel() {
		return accessLevel;
	}
	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}
	public List<SaveTransaction> getTransactionList() {
		return transactionList;
	}
	public void setTransactionList(List<SaveTransaction> transactionList) {
		this.transactionList = transactionList;
	}
	@Override
	public String toString() {
		return "SaveTransactionsRequest [accessLevel=" + accessLevel + ", transactionList=" + transactionList + "]";
	}
	
}
