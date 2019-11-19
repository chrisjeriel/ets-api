package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class Risk {
	
	private Integer riskId;
	private String oldRiskId;
	private String riskAbbr;
	private String riskName;
	private Integer regionCd;
	private String regionDesc;
	private Integer provinceCd;
	private String provinceDesc;
	private Integer cityCd;
	private String cityDesc;
	private String districtCd;
	private String districtDesc;
	private String blockCd;
	private String blockDesc;
	private String latitude;
	private String longitude;
	private String zoneCd;
	private String zoneDesc;
	private String activeTag;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public String getOldRiskId() {
		return oldRiskId;
	}
	public void setOldRiskId(String oldRiskId) {
		this.oldRiskId = oldRiskId;
	}
	public Integer getRiskId() {
		return riskId;
	}
	public void setRiskId(Integer riskId) {
		this.riskId = riskId;
	}
	public String getRiskAbbr() {
		return riskAbbr;
	}
	public void setRiskAbbr(String riskAbbr) {
		this.riskAbbr = riskAbbr;
	}
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public Integer getRegionCd() {
		return regionCd;
	}
	public void setRegionCd(Integer regionCd) {
		this.regionCd = regionCd;
	}
	public String getRegionDesc() {
		return regionDesc;
	}
	public void setRegionDesc(String regionDesc) {
		this.regionDesc = regionDesc;
	}
	public Integer getProvinceCd() {
		return provinceCd;
	}
	public void setProvinceCd(Integer provinceCd) {
		this.provinceCd = provinceCd;
	}
	public String getProvinceDesc() {
		return provinceDesc;
	}
	public void setProvinceDesc(String provinceDesc) {
		this.provinceDesc = provinceDesc;
	}
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
	public String getDistrictCd() {
		return districtCd;
	}
	public void setDistrictCd(String districtCd) {
		this.districtCd = districtCd;
	}
	public String getDistrictDesc() {
		return districtDesc;
	}
	public void setDistrictDesc(String districtDesc) {
		this.districtDesc = districtDesc;
	}
	public String getBlockCd() {
		return blockCd;
	}
	public void setBlockCd(String blockCd) {
		this.blockCd = blockCd;
	}
	public String getBlockDesc() {
		return blockDesc;
	}
	public void setBlockDesc(String blockDesc) {
		this.blockDesc = blockDesc;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getZoneCd() {
		return zoneCd;
	}
	public void setZoneCd(String zoneCd) {
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
		return "Risk [riskId=" + riskId + ", oldRiskId=" + oldRiskId + ", riskAbbr=" + riskAbbr + ", riskName="
				+ riskName + ", regionCd=" + regionCd + ", regionDesc=" + regionDesc + ", provinceCd=" + provinceCd
				+ ", provinceDesc=" + provinceDesc + ", cityCd=" + cityCd + ", cityDesc=" + cityDesc + ", districtCd="
				+ districtCd + ", districtDesc=" + districtDesc + ", blockCd=" + blockCd + ", blockDesc=" + blockDesc
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", zoneCd=" + zoneCd + ", zoneDesc="
				+ zoneDesc + ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
