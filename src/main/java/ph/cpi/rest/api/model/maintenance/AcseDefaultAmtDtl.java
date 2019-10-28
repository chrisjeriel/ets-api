package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class AcseDefaultAmtDtl {
	private String tranClass;
	private Integer tranTypeCd;
	private Integer itemNo;
	private String itemText;
	private String defaultGl;
	private String shortCode;
	private String acctAmtTag;
	private String signTag;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	public Integer getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(Integer tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemText() {
		return itemText;
	}
	public void setItemText(String itemText) {
		this.itemText = itemText;
	}
	public String getDefaultGl() {
		return defaultGl;
	}
	public void setDefaultGl(String defaultGl) {
		this.defaultGl = defaultGl;
	}
	public String getShortCode() {
		return shortCode;
	}
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}
	public String getAcctAmtTag() {
		return acctAmtTag;
	}
	public void setAcctAmtTag(String acctAmtTag) {
		this.acctAmtTag = acctAmtTag;
	}
	public String getSignTag() {
		return signTag;
	}
	public void setSignTag(String signTag) {
		this.signTag = signTag;
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
		return "AcseDefaultAmtDtl [tranClass=" + tranClass + ", tranTypeCd=" + tranTypeCd + ", itemNo=" + itemNo
				+ ", itemText=" + itemText + ", defaultGl=" + defaultGl + ", shortCode=" + shortCode + ", acctAmtTag="
				+ acctAmtTag + ", signTag=" + signTag + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
