package ph.cpi.rest.api.model.claims;

import org.joda.time.DateTime;

public class ClaimAdjuster {
	private Integer claimId;
	private String adjId;
	private String adjName;
	private String adjRefNo;
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
	public String getAdjId() {
		return adjId;
	}
	public void setAdjId(String adjId) {
		this.adjId = adjId;
	}
	public String getAdjName() {
		return adjName;
	}
	public void setAdjName(String adjName) {
		this.adjName = adjName;
	}
	public String getAdjRefNo() {
		return adjRefNo;
	}
	public void setAdjRefNo(String adjRefNo) {
		this.adjRefNo = adjRefNo;
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
		return "ClaimAdjuster [claimId=" + claimId + ", adjId=" + adjId + ", adjName=" + adjName + ", adjRefNo="
				+ adjRefNo + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}
