package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnAcitDefAmtDtlRequest {
	private List<defAmt> saveDefAmt;
	private List<defAmt> delDefAmt;
	
	public List<defAmt> getSaveDefAmt() {
		return saveDefAmt;
	}

	public void setSaveDefAmt(List<defAmt> saveDefAmt) {
		this.saveDefAmt = saveDefAmt;
	}

	public List<defAmt> getDelDefAmt() {
		return delDefAmt;
	}

	public void setDelDefAmt(List<defAmt> delDefAmt) {
		this.delDefAmt = delDefAmt;
	}

	@Override
	public String toString() {
		return "SaveMtnAcitDefAmtDtlRequest [saveDefAmt=" + saveDefAmt + ", delDefAmt=" + delDefAmt + "]";
	}
	
}

class defAmt{
	private String tranClass;
	private Integer tranTypeCd;
	private Integer itemNo;
	private String itemText;
	private String defaultGl;
	private String acctAmtTag;
	private String signTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
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
		return "defAmt [tranClass=" + tranClass + ", tranTypeCd=" + tranTypeCd + ", itemNo=" + itemNo + ", itemText="
				+ itemText + ", defaultGl=" + defaultGl + ", acctAmtTag=" + acctAmtTag + ", signTag=" + signTag
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
	
}