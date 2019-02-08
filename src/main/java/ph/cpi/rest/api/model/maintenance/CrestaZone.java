package ph.cpi.rest.api.model.maintenance;

import org.joda.time.LocalDateTime;

public class CrestaZone {
	private Integer zoneCd;
	private String zoneDesc;
	private String activeTag;
	private String remarks;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	
	public Integer getZoneCd() {
		return zoneCd;
	}
	public void setZoneCd(Integer zoneCd) {
		this.zoneCd = zoneCd;
	}
	public String getZoneDesc() {
		return zoneDesc;
	}
	public void setZoneDesc(String zoneDesc) {
		this.zoneDesc = zoneDesc;
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
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "CrestaZone [zoneCd="+ zoneCd +", zoneCdDesc="+ zoneDesc +", activeTag="
				+ activeTag + ", remarks=" + remarks + ", createUser="
				+ createUser +", createDate="+ createDate +", updateUser="+ updateUser +", updateDate="
				+ updateDate +"]";
	}
	
}
