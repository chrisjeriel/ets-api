package ph.cpi.rest.api.model.request;

public class SaveMtnRiskRequest {
	private String riskId;
	private String riskAbbr;
	private String riskName;
	private String regionCd;
	private String provinceCd;
	private String cityCd;
	private String districtCd;
	private String latitude;
	private String longitude;
	private String zoneCd;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private String blockCd;
	
	public String getBlockCd() {
		return blockCd;
	}
	public void setBlockCd(String blockCd) {
		this.blockCd = blockCd;
	}
	public String getRiskId() {
		return riskId;
	}
	public void setRiskId(String riskId) {
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
	public String getRegionCd() {
		return regionCd;
	}
	public void setRegionCd(String regionCd) {
		this.regionCd = regionCd;
	}
	public String getProvinceCd() {
		return provinceCd;
	}
	public void setProvinceCd(String provinceCd) {
		this.provinceCd = provinceCd;
	}
	public String getCityCd() {
		return cityCd;
	}
	public void setCityCd(String cityCd) {
		this.cityCd = cityCd;
	}
	public String getDistrictCd() {
		return districtCd;
	}
	public void setDistrictCd(String districtCd) {
		this.districtCd = districtCd;
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
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "SaveMtnRiskRequest [riskId=" + riskId + ", riskAbbr=" + riskAbbr + ", riskName=" + riskName
				+ ", regionCd=" + regionCd + ", provinceCd=" + provinceCd + ", cityCd=" + cityCd + ", districtCd="
				+ districtCd + ", latitude=" + latitude + ", longitude=" + longitude + ", zoneCd=" + zoneCd
				+ ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", blockCd=" + blockCd
				+ "]";
	}

	
	
}
