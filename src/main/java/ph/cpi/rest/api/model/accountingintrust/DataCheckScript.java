package ph.cpi.rest.api.model.accountingintrust;

import org.joda.time.DateTime;

public class DataCheckScript {

	private Integer scriptNo;
	private String scriptTitle;
	private String scriptSoln;
	private String remarks;
	private String activeTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public Integer getScriptNo() {
		return scriptNo;
	}
	public void setScriptNo(Integer scriptNo) {
		this.scriptNo = scriptNo;
	}
	public String getScriptTitle() {
		return scriptTitle;
	}
	public void setScriptTitle(String scriptTitle) {
		this.scriptTitle = scriptTitle;
	}
	public String getScriptSoln() {
		return scriptSoln;
	}
	public void setScriptSoln(String scriptSoln) {
		this.scriptSoln = scriptSoln;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
		return "DataCheckScript [scriptNo=" + scriptNo + ", scriptTitle=" + scriptTitle + ", scriptSoln=" + scriptSoln
				+ ", remarks=" + remarks + ", activeTag=" + activeTag + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
