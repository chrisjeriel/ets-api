package ph.cpi.rest.api.model.maintenance;

import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

public class City {
	private Integer cityCd;
	private String cityDesc;
	private List<District> districtList;
	private String activeTag;
	private String remarks;
	private Integer zoneCd;
	private String zoneDesc;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
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
	
	public String getZoneDesc() {
		return zoneDesc;
	}
	public void setZoneDesc(String zoneDesc) {
		this.zoneDesc = zoneDesc;
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
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	@Override
	public String toString() {
		return "City [cityCd=" + cityCd + ", cityDesc=" + cityDesc + ", districtList=" + districtList + ", activeTag="
				+ activeTag + ", remarks=" + remarks + ", zoneCd=" + zoneCd + ", zoneDesc=" + zoneDesc + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", district=" + district + "]";
	}
	
	
}
