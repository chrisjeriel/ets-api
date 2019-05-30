package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class TreatyShare {

	private Integer treatyYear;
    private Integer treatyId;
    private String trtyCedId;
    private String cedingName;
    private String cedingAbbr;
    private Double pctShare;
    private Integer sortSeq;
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
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getCedingAbbr() {
		return cedingAbbr;
	}
	public void setCedingAbbr(String cedingAbbr) {
		this.cedingAbbr = cedingAbbr;
	}
	public Double getPctShare() {
		return pctShare;
	}
	public void setPctShare(Double pctShare) {
		this.pctShare = pctShare;
	}
	public Integer getSortSeq() {
		return sortSeq;
	}
	public void setSortSeq(Integer sortSeq) {
		this.sortSeq = sortSeq;
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
		return "TreatyShare [treatyYear=" + treatyYear + ", treatyId=" + treatyId + ", trtyCedId=" + trtyCedId
				+ ", cedingName=" + cedingName + ", cedingAbbr=" + cedingAbbr + ", pctShare=" + pctShare + ", sortSeq="
				+ sortSeq + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", okDelete=" + okDelete + "]";
	}
}
