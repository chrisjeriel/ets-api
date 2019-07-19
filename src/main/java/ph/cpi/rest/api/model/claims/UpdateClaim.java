package ph.cpi.rest.api.model.claims;

public class UpdateClaim {
	private String claimId;
	private String claimNo;
	private String clmStatCd;
	private String clmStatDesc;
	private String reasonCd;
	private String updateUser;
	private String updateDate;
	
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	public String getClmStatCd() {
		return clmStatCd;
	}
	public void setClmStatCd(String clmStatCd) {
		this.clmStatCd = clmStatCd;
	}
	public String getClmStatDesc() {
		return clmStatDesc;
	}
	public void setClmStatDesc(String clmStatDesc) {
		this.clmStatDesc = clmStatDesc;
	}
	public String getReasonCd() {
		return reasonCd;
	}
	public void setReasonCd(String reasonCd) {
		this.reasonCd = reasonCd;
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
		return "UpdateClaim [claimId=" + claimId + ", claimNo=" + claimNo + ", clmStatCd=" + clmStatCd
				+ ", clmStatDesc=" + clmStatDesc + ", reasonCd=" + reasonCd + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
