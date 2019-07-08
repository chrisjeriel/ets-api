package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveClaimPaytReqRequest {
	private List<PaytReqs> saveClmPaytReq;

	public List<PaytReqs> getSaveClmPaytReq() {
		return saveClmPaytReq;
	}

	public void setSaveClmPaytReq(List<PaytReqs> saveClmPaytReq) {
		this.saveClmPaytReq = saveClmPaytReq;
	}
	@Override
	public String toString() {
		return "SaveClaimPaytReqRequest [saveClmPaytReq=" + saveClmPaytReq + "]";
	}
}

class PaytReqs {
	private String claimId;
	private String projId;
	private String histNo;
	private String paytReqId;
	private String paytReqStat;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getProjId() {
		return projId;
	}
	public void setProjId(String projId) {
		this.projId = projId;
	}
	public String getHistNo() {
		return histNo;
	}
	public void setHistNo(String histNo) {
		this.histNo = histNo;
	}
	public String getPaytReqId() {
		return paytReqId;
	}
	public void setPaytReqId(String paytReqId) {
		this.paytReqId = paytReqId;
	}
	public String getPaytReqStat() {
		return paytReqStat;
	}
	public void setPaytReqStat(String paytReqStat) {
		this.paytReqStat = paytReqStat;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "SaveClaimPaytReqRequest [claimId=" + claimId + ", projId=" + projId + ", histNo=" + histNo
				+ ", paytReqId=" + paytReqId + ", paytReqStat=" + paytReqStat + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
