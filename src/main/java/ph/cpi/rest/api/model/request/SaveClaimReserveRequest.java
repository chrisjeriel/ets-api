package ph.cpi.rest.api.model.request;

public class SaveClaimReserveRequest {
	private String claimId;
	private String projId;
	private String lossResAmt;
	private String lossPdAmt;
	private String lossStatCd;
	private String expResAmt;
	private String expPdAmt;
	private String expStatCd;
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
	public String getLossResAmt() {
		return lossResAmt;
	}
	public void setLossResAmt(String lossResAmt) {
		this.lossResAmt = lossResAmt;
	}
	public String getLossPdAmt() {
		return lossPdAmt;
	}
	public void setLossPdAmt(String lossPdAmt) {
		this.lossPdAmt = lossPdAmt;
	}
	public String getLossStatCd() {
		return lossStatCd;
	}
	public void setLossStatCd(String lossStatCd) {
		this.lossStatCd = lossStatCd;
	}
	public String getExpResAmt() {
		return expResAmt;
	}
	public void setExpResAmt(String expResAmt) {
		this.expResAmt = expResAmt;
	}
	public String getExpPdAmt() {
		return expPdAmt;
	}
	public void setExpPdAmt(String expPdAmt) {
		this.expPdAmt = expPdAmt;
	}
	public String getExpStatCd() {
		return expStatCd;
	}
	public void setExpStatCd(String expStatCd) {
		this.expStatCd = expStatCd;
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
		return "SaveClaimReserveRequest [claimId=" + claimId + ", projId=" + projId + ", lossResAmt=" + lossResAmt
				+ ", lossPdAmt=" + lossPdAmt + ", lossStatCd=" + lossStatCd + ", expResAmt=" + expResAmt + ", expPdAmt="
				+ expPdAmt + ", expStatCd=" + expStatCd + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
