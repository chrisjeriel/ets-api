package ph.cpi.rest.api.model.maintenance;

import org.joda.time.LocalDateTime;

public class City {
	private Integer cityCd;
	private String cityDesc;
	private String activeTag;
	private String remarks;
	private Integer zoneCd;
	private String zoneCdDesc;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	
	public Integer getCityCd() {
		return cityCd;
	}
	public void setCityCd(Integer cityCd) {
		this.cityCd = cityCd;
	}
	public String getCityDesc() {
		return cityDesc;
	}
	public void setCityDesc(String cityDesc) {
		this.cityDesc = cityDesc;
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
	public Integer getZoneCd() {
		return zoneCd;
	}
	public void setZoneCd(Integer zoneCd) {
		this.zoneCd = zoneCd;
	}
	public String getZoneCdDesc() {
		return zoneCdDesc;
	}
	public void setZoneCdDesc(String zoneCdDesc) {
		this.zoneCdDesc = zoneCdDesc;
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
		return "City [cityCd=" + cityCd + ", cityDesc=" + cityDesc + ", activeTag="
				+ activeTag + ", remarks=" + remarks + ", zoneCd="+ zoneCd +", zoneCdDesc="+ zoneCdDesc +", createUser="
				+ createUser +", createDate="+ createDate +", updateUser="+ updateUser +", updateDate="
				+ updateDate +"]";
	}
	
}
