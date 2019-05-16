package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnOtherChargeRequest {

	private List<OtherCharge> saveOChrg;
	private List<OtherCharge> deleteOChrg;
	
	public List<OtherCharge> getSaveOChrg() {
		return saveOChrg;
	}
	public void setSaveOChrg(List<OtherCharge> saveOChrg) {
		this.saveOChrg = saveOChrg;
	}
	public List<OtherCharge> getDeleteOChrg() {
		return deleteOChrg;
	}
	public void setDeleteOChrg(List<OtherCharge> deleteOChrg) {
		this.deleteOChrg = deleteOChrg;
	}
	@Override
	public String toString() {
		return "SaveMtnOtherChargeRequest []";
	}
}

@Alias("SaveMtnOtherCharge")
class OtherCharge {
	private Integer chargeCd; 
	private String chargeDesc;
	private String chargeType;
	private String premRt;	
	private String defaultAmt;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
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
	public String getPremRt() {
		return premRt;
	}
	public void setPremRt(String premRt) {
		this.premRt = premRt;
	}
	public String getDefaultAmt() {
		return defaultAmt;
	}
	public void setDefaultAmt(String defaultAmt) {
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
		return "OtherCharge [chargeCd=" + chargeCd + ", chargeDesc=" + chargeDesc + ", chargeType=" + chargeType
				+ ", premRt=" + premRt + ", defaultAmt=" + defaultAmt + ", activeTag=" + activeTag + ", remarks="
				+ remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
