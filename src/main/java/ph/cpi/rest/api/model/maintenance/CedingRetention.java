package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class CedingRetention {

	private Integer treatyYear;
	private Integer treatyId;
	private String trtyCedId;
	private String cedingId;
    private String cedingName;
    private String membershipTag;
    private DateTime inactiveDate;
    private Integer retLine1;
    private Integer retLine2;
    private String remarks;
    private String createUser;
    private DateTime createDate;
    private String updateUser;
    private DateTime updateDate;
    private String okDelete;
    
	public Integer getTreatyYear() {
		return treatyYear;
	}
	public void setTreatyYear(Integer treatyYear) {
		this.treatyYear = treatyYear;
	}
	public Integer getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(Integer treatyId) {
		this.treatyId = treatyId;
	}
	public String getTrtyCedId() {
		return trtyCedId;
	}
	public void setTrtyCedId(String trtyCedId) {
		this.trtyCedId = trtyCedId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getMembershipTag() {
		return membershipTag;
	}
	public void setMembershipTag(String membershipTag) {
		this.membershipTag = membershipTag;
	}
	public DateTime getInactiveDate() {
		return inactiveDate;
	}
	public void setInactiveDate(DateTime inactiveDate) {
		this.inactiveDate = inactiveDate;
	}
	public Integer getRetLine1() {
		return retLine1;
	}
	public void setRetLine1(Integer retLine1) {
		this.retLine1 = retLine1;
	}
	public Integer getRetLine2() {
		return retLine2;
	}
	public void setRetLine2(Integer retLine2) {
		this.retLine2 = retLine2;
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
	public String getOkDelete() {
		return okDelete;
	}
	public void setOkDelete(String okDelete) {
		this.okDelete = okDelete;
	}
	@Override
	public String toString() {
		return "CedingRetention [treatyYear=" + treatyYear + ", treatyId=" + treatyId + ", trtyCedId=" + trtyCedId
				+ ", cedingId=" + cedingId + ", cedingName=" + cedingName + ", membershipTag=" + membershipTag
				+ ", inactiveDate=" + inactiveDate + ", retLine1=" + retLine1 + ", retLine2=" + retLine2 + ", remarks="
				+ remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", okDelete=" + okDelete + "]";
	}
}
