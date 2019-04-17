package ph.cpi.rest.api.model.underwriting;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;

@Alias("UnderwritingProjectOc")
public class ProjectOc {
	private Integer projId;
	private String projDesc;
	private Integer riskId;
	private String riskName;
	private String regionCd;
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
	private Integer totalSi;
	private String objectId;
	private String objectDesc;
	private String site;
	private String duration;
	private String testing;
	private String prCreateUser;
	private DateTime prCreateDate;
	private String prUpdateUser;
	private DateTime prUpdateDate;
	
	private CoverageOc coverageOc;
	
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

	public String getRegionCd() {
		return regionCd;
	}

	public void setRegionCd(String regionCd) {
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

	public Integer getTotalSi() {
		return totalSi;
	}

	public void setTotalSi(Integer totalSi) {
		this.totalSi = totalSi;
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

	public String getPrCreateUser() {
		return prCreateUser;
	}

	public void setPrCreateUser(String prCreateUser) {
		this.prCreateUser = prCreateUser;
	}

	public DateTime getPrCreateDate() {
		return prCreateDate;
	}

	public void setPrCreateDate(DateTime prCreateDate) {
		this.prCreateDate = prCreateDate;
	}

	public String getPrUpdateUser() {
		return prUpdateUser;
	}

	public void setPrUpdateUser(String prUpdateUser) {
		this.prUpdateUser = prUpdateUser;
	}

	public DateTime getPrUpdateDate() {
		return prUpdateDate;
	}

	public void setPrUpdateDate(DateTime prUpdateDate) {
		this.prUpdateDate = prUpdateDate;
	}

	public CoverageOc getCoverageOc() {
		return coverageOc;
	}

	public void setCoverageOc(CoverageOc coverageOc) {
		this.coverageOc = coverageOc;
	}
	
	@Override
	public String toString() {
		return "ProjectOc [projId=" + projId + ", projDesc=" + projDesc + ", riskId=" + riskId + ", riskName="
				+ riskName + ", regionCd=" + regionCd + ", regionDesc=" + regionDesc + ", provinceCd=" + provinceCd
				+ ", provinceDesc=" + provinceDesc + ", cityCd=" + cityCd + ", cityDesc=" + cityDesc + ", districtCd="
				+ districtCd + ", districtDesc=" + districtDesc + ", blockCd=" + blockCd + ", blockDesc=" + blockDesc
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", totalSi=" + totalSi + ", objectId="
				+ objectId + ", objectDesc=" + objectDesc + ", site=" + site + ", duration=" + duration + ", testing="
				+ testing + ", prCreateUser=" + prCreateUser + ", prCreateDate=" + prCreateDate + ", prUpdateUser="
				+ prUpdateUser + ", prUpdateDate=" + prUpdateDate + ", coverageOc=" + coverageOc + "]";
	}
}
