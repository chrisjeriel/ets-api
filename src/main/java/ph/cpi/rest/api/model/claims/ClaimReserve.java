package ph.cpi.rest.api.model.claims;

import org.joda.time.DateTime;

public class ClaimReserve {
	private Integer  claimId;
	private Integer  projId;
	private Integer  lossResAmt;
	private Integer  lossPdAmt;
	private String 	 lossStatCd;
	private Integer  expResAmt;
	private Integer  expPdAmt;
	private String 	 expStatCd;
	private String 	 createUser;
	private DateTime createDate;
	private String 	 updateUser;
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
	public Integer getLossResAmt() {
		return lossResAmt;
	}
	public void setLossResAmt(Integer lossResAmt) {
		this.lossResAmt = lossResAmt;
	}
	public Integer getLossPdAmt() {
		return lossPdAmt;
	}
	public void setLossPdAmt(Integer lossPdAmt) {
		this.lossPdAmt = lossPdAmt;
	}
	public String getLossStatCd() {
		return lossStatCd;
	}
	public void setLossStatCd(String lossStatCd) {
		this.lossStatCd = lossStatCd;
	}
	public Integer getExpResAmt() {
		return expResAmt;
	}
	public void setExpResAmt(Integer expResAmt) {
		this.expResAmt = expResAmt;
	}
	public Integer getExpPdAmt() {
		return expPdAmt;
	}
	public void setExpPdAmt(Integer expPdAmt) {
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
		return "ClaimReserve [claimId=" + claimId + ", projId=" + projId + ", lossResAmt=" + lossResAmt + ", lossPdAmt="
				+ lossPdAmt + ", lossStatCd=" + lossStatCd + ", expResAmt=" + expResAmt + ", expPdAmt=" + expPdAmt
				+ ", expStatCd=" + expStatCd + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
