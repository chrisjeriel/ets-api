package ph.cpi.rest.api.model.maintenance;

import java.util.List;
import org.joda.time.LocalDateTime;

public class City {
	private Integer cityCd;
	private String cityDesc;
	private List<District> districtList;
	private String activeTag;
	private String remarks;
	private Integer zoneCd;
	private String zoneCdDesc;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	private District district;
	
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
	public List<District> getDistrictList() {
		return districtList;
	}
	public void setDistrictList(List<District> districtList) {
		this.districtList = districtList;
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
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	
}
