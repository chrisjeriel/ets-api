package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class TreatyLayer {

	private Integer treatyLimitId;
	private Integer treatyId;
	private String treatyName;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public Integer getTreatyLimitId() {
		return treatyLimitId;
	}
	public void setTreatyLimitId(Integer treatyLimitId) {
		this.treatyLimitId = treatyLimitId;
	}
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
		return "TreatyLayer [treatyLimitId=" + treatyLimitId + ", treatyId=" + treatyId + ", treatyName=" + treatyName
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}