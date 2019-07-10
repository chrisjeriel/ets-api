package ph.cpi.rest.api.model.request;

public class SaveClaimResStatRequest {
	private String claimId;
	private String projId;
	private String lossStatCd;
	private String expStatCd;
	private String updateUser;
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
	public String getLossStatCd() {
		return lossStatCd;
	}
	public void setLossStatCd(String lossStatCd) {
		this.lossStatCd = lossStatCd;
	}
	public String getExpStatCd() {
		return expStatCd;
	}
	public void setExpStatCd(String expStatCd) {
		this.expStatCd = expStatCd;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	@Override
	public String toString() {
		return "SaveClaimResStatRequest [claimId=" + claimId + ", projId=" + projId + ", lossStatCd=" + lossStatCd
				+ ", expStatCd=" + expStatCd + ", updateUser=" + updateUser + "]";
	}
}
