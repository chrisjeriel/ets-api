package ph.cpi.rest.api.model.claims;

import java.util.List;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;

@Alias("ClaimsProject")
public class Project {

	private Integer claimId;
	private Integer projId;
	private String projDesc;
	private Integer riskId;
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
	private String objectId;
	private String objectDesc;
	private String site;
	private String duration;
	private String testing;
	private Integer ipl;
	private Integer timeExc;
	private Integer noClaimPd;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private ClaimHistory clmHistoryList;
	private ClaimReserve clmReserve;
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public String getProjDesc() {
		return projDesc;
	}
	public void setProjDesc(String projDesc) {
		this.projDesc = projDesc;
	}
	public Integer getRiskId() {
		return riskId;
	}
	public void setRiskId(Integer riskId) {
		this.riskId = riskId;
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
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getObjectDesc() {
		return objectDesc;
	}
	public void setObjectDesc(String objectDesc) {
		this.objectDesc = objectDesc;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getTesting() {
		return testing;
	}
	public void setTesting(String testing) {
		this.testing = testing;
	}
	public Integer getIpl() {
		return ipl;
	}
	public void setIpl(Integer ipl) {
		this.ipl = ipl;
	}
	public Integer getTimeExc() {
		return timeExc;
	}
	public void setTimeExc(Integer timeExc) {
		this.timeExc = timeExc;
	}
	public Integer getNoClaimPd() {
		return noClaimPd;
	}
	public void setNoClaimPd(Integer noClaimPd) {
		this.noClaimPd = noClaimPd;
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
	public ClaimHistory getClmHistoryList() {
		return clmHistoryList;
	}
	public void setClmHistoryList(ClaimHistory clmHistoryList) {
		this.clmHistoryList = clmHistoryList;
	}
	public ClaimReserve getClmReserve() {
		return clmReserve;
	}
	public void setClmReserve(ClaimReserve clmReserve) {
		this.clmReserve = clmReserve;
	}
	@Override
	public String toString() {
		return "Project [claimId=" + claimId + ", projId=" + projId + ", projDesc=" + projDesc + ", riskId=" + riskId
				+ ", riskName=" + riskName + ", regionCd=" + regionCd + ", regionDesc=" + regionDesc + ", provinceCd="
				+ provinceCd + ", provinceDesc=" + provinceDesc + ", cityCd=" + cityCd + ", cityDesc=" + cityDesc
				+ ", districtCd=" + districtCd + ", districtDesc=" + districtDesc + ", blockCd=" + blockCd
				+ ", blockDesc=" + blockDesc + ", latitude=" + latitude + ", longitude=" + longitude + ", objectId="
				+ objectId + ", objectDesc=" + objectDesc + ", site=" + site + ", duration=" + duration + ", testing="
				+ testing + ", ipl=" + ipl + ", timeExc=" + timeExc + ", noClaimPd=" + noClaimPd + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", clmHistoryList=" + clmHistoryList + ", clmReserve=" + clmReserve + "]";
	}
	
	
}
