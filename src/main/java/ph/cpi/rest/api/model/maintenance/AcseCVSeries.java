package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class AcseCVSeries {
	private Integer cvYear;
	private String cvNo;
	private Integer tranId;
	private String usedTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getCvYear() {
		return cvYear;
	}
	public void setCvYear(Integer cvYear) {
		this.cvYear = cvYear;
	}
	public String getCvNo() {
		return cvNo;
	}
	public void setCvNo(String cvNo) {
		this.cvNo = cvNo;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getUsedTag() {
		return usedTag;
	}
	public void setUsedTag(String usedTag) {
		this.usedTag = usedTag;
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
		return "AcseCVSeries [cvYear=" + cvYear + ", cvNo=" + cvNo + ", tranId=" + tranId + ", usedTag=" + usedTag
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
	
}
