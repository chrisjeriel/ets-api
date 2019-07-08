package ph.cpi.rest.api.model.claims;

import org.joda.time.DateTime;

public class ClaimPaytReq {
	private Integer claimId;
	private Integer projId;
	private Integer histNo;
	private Integer paytReqId;
	private String paytReqStat;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public Integer getHistNo() {
		return histNo;
	}
	public void setHistNo(Integer histNo) {
		this.histNo = histNo;
	}
	public Integer getPaytReqId() {
		return paytReqId;
	}
	public void setPaytReqId(Integer paytReqId) {
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
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "ClaimPaytReq [claimId=" + claimId + ", projId=" + projId + ", histNo=" + histNo + ", paytReqId="
				+ paytReqId + ", paytReqStat=" + paytReqStat + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
