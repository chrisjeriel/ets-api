package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class InvtSecurityType {

	private Integer invtSecCd;
	private String secDesc;
	private String remarks;
	private String activeTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public Integer getInvtSecCd() {
		return invtSecCd;
	}
	public void setInvtSecCd(Integer invtSecCd) {
		this.invtSecCd = invtSecCd;
	}
	public String getSecDesc() {
		return secDesc;
	}
	public void setSecDesc(String secDesc) {
		this.secDesc = secDesc;
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
		return "InvtSecurityType [invtSecCd=" + invtSecCd + ", secDesc=" + secDesc + ", remarks=" + remarks
				+ ", activeTag=" + activeTag + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
