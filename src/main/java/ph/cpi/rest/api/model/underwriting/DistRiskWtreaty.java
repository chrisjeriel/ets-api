package ph.cpi.rest.api.model.underwriting;

import org.joda.time.DateTime;

public class DistRiskWtreaty {
	private Integer treatyId;
	private String treatyName;
	private String trtyCedId;
	private String trtyCedName;
	private Double pctShare;
	private Double siAmt;
	private Double premAmt;
	private Double commShare;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public Integer getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(Integer treatyId) {
		this.treatyId = treatyId;
	}
	public String getTreatyName() {
		return treatyName;
	}
	public void setTreatyName(String treatyName) {
		this.treatyName = treatyName;
	}
	public String getTrtyCedId() {
		return trtyCedId;
	}
	public void setTrtyCedId(String trtyCedId) {
		this.trtyCedId = trtyCedId;
	}
	public String getTrtyCedName() {
		return trtyCedName;
	}
	public void setTrtyCedName(String trtyCedName) {
		this.trtyCedName = trtyCedName;
	}
	public Double getPctShare() {
		return pctShare;
	}
	public void setPctShare(Double pctShare) {
		this.pctShare = pctShare;
	}
	public Double getSiAmt() {
		return siAmt;
	}
	public void setSiAmt(Double siAmt) {
		this.siAmt = siAmt;
	}
	public Double getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(Double premAmt) {
		this.premAmt = premAmt;
	}
	public Double getCommShare() {
		return commShare;
	}
	public void setCommShare(Double commShare) {
		this.commShare = commShare;
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
		return "DistRiskWtreaty [treatyId=" + treatyId + ", treatyName=" + treatyName + ", trtyCedId=" + trtyCedId
				+ ", trtyCedName=" + trtyCedName + ", pctShare=" + pctShare + ", siAmt=" + siAmt + ", premAmt="
				+ premAmt + ", commShare=" + commShare + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
