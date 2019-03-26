package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class MtnCharges {
	private Integer chargeCd; 
	private String chargeDesc;
	private Integer defaultAmt;
	private String activeTag;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public Integer getChargeCd() {
		return chargeCd;
	}
	public void setChargeCd(Integer chargeCd) {
		this.chargeCd = chargeCd;
	}
	public String getChargeDesc() {
		return chargeDesc;
	}
	public void setChargeDesc(String chargeDesc) {
		this.chargeDesc = chargeDesc;
	}
	public Integer getDefaultAmt() {
		return defaultAmt;
	}
	public void setDefaultAmt(Integer defaultAmt) {
		this.defaultAmt = defaultAmt;
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
		return "MtnCharges [chargeCd=" + chargeCd + ", chargeDesc=" + chargeDesc + ", defaultAmt=" + defaultAmt
				+ ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
