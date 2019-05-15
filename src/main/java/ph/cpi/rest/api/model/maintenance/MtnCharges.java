package ph.cpi.rest.api.model.maintenance;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class MtnCharges {
	private Integer chargeCd; 
	private String chargeDesc;
	private String chargeType;
	private BigDecimal premRt;	
	private BigDecimal defaultAmt;
	private String activeTag;
	private String remarks;
	private String deleteTag;
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
	public String getChargeType() {
		return chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	public BigDecimal getPremRt() {
		return premRt;
	}
	public void setPremRt(BigDecimal premRt) {
		this.premRt = premRt;
	}
	public BigDecimal getDefaultAmt() {
		return defaultAmt;
	}
	public void setDefaultAmt(BigDecimal defaultAmt) {
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
	public String getDeleteTag() {
		return deleteTag;
	}
	public void setDeleteTag(String deleteTag) {
		this.deleteTag = deleteTag;
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
		return "MtnCharges [chargeCd=" + chargeCd + ", chargeDesc=" + chargeDesc + ", chargeType=" + chargeType
				+ ", premRt=" + premRt + ", defaultAmt=" + defaultAmt + ", activeTag=" + activeTag + ", remarks="
				+ remarks + ", deleteTag=" + deleteTag + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
