package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class MtnLossCd {
	
	private String lossCd;
	private String lossAbbr;
	private String lossDesc;
	private String lossCdType;
	private String activeTag;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public String getLossCd() {
		return lossCd;
	}
	public void setLossCd(String lossCd) {
		this.lossCd = lossCd;
	}
	public String getLossAbbr() {
		return lossAbbr;
	}
	public void setLossAbbr(String lossAbbr) {
		this.lossAbbr = lossAbbr;
	}
	public String getLossDesc() {
		return lossDesc;
	}
	public void setLossDesc(String lossDesc) {
		this.lossDesc = lossDesc;
	}
	public String getLossCdType() {
		return lossCdType;
	}
	public void setLossCdType(String lossCdType) {
		this.lossCdType = lossCdType;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
		return "MtnLossCd [lossCd=" + lossCd + ", lossAbbr=" + lossAbbr + ", lossDesc=" + lossDesc + ", lossCdType="
				+ lossCdType + ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
