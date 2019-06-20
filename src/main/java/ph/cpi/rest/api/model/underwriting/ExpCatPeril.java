package ph.cpi.rest.api.model.underwriting;

import org.joda.time.DateTime;

public class ExpCatPeril {
	private String policyId;
	private String catPerilId;
	private String catPerilName;
	private String pctSharePrem;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getCatPerilId() {
		return catPerilId;
	}
	public void setCatPerilId(String catPerilId) {
		this.catPerilId = catPerilId;
	}
	
	public String getCatPerilName() {
		return catPerilName;
	}
	public void setCatPerilName(String catPerilName) {
		this.catPerilName = catPerilName;
	}
	public String getPctSharePrem() {
		return pctSharePrem;
	}
	public void setPctSharePrem(String pctSharePrem) {
		this.pctSharePrem = pctSharePrem;
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
		return "ExpCatPeril [policyId=" + policyId + ", catPerilId=" + catPerilId + ", catPerilName=" + catPerilName
				+ ", pctSharePrem=" + pctSharePrem + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
}
