package ph.cpi.rest.api.model.request;

import java.util.List;

import ph.cpi.rest.api.model.maintenance.SaveTransaction;

public class SaveTransactionsRequest {
	
	String accessLevel;
	List<SaveTransaction> transactionList;
	List<delModuleTran> delTranList;
	
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
	
	public List<delModuleTran> getDelTranList() {
		return delTranList;
	}
	public void setDelTranList(List<delModuleTran> delTranList) {
		this.delTranList = delTranList;
	}
	@Override
	public String toString() {
		return "SaveTransactionsRequest [accessLevel=" + accessLevel + ", transactionList=" + transactionList
				+ ", delTranList=" + delTranList + "]";
	}
	
}

class delModuleTran {
	private String userId;
	private Integer tranCd;
	private String userGrp;
	
	public String getUserGrp() {
		return userGrp;
	}
	public void setUserGrp(String userGrp) {
		this.userGrp = userGrp;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getTranCd() {
		return tranCd;
	}
	public void setTranCd(Integer tranCd) {
		this.tranCd = tranCd;
	}
	@Override
	public String toString() {
		return "delModuleTran [userId=" + userId + ", tranCd=" + tranCd + ", userGrp=" + userGrp + "]";
	}
	
}
