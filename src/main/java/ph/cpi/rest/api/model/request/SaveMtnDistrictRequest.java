package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnDistrictRequest {
	private String regionCd;
	private String provinceCd;
	private String cityCd;
	private List<SaveDistrict> saveDistrict;
	private List<SaveDistrict> delDistrict;
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
	public List<SaveDistrict> getSaveDistrict() {
		return saveDistrict;
	}
	public void setSaveDistrict(List<SaveDistrict> saveDistrict) {
		this.saveDistrict = saveDistrict;
	}
	public List<SaveDistrict> getDelDistrict() {
		return delDistrict;
	}
	public void setDelDistrict(List<SaveDistrict> delDistrict) {
		this.delDistrict = delDistrict;
	}
	@Override
	public String toString() {
		return "SaveMtnDistrictRequest [regionCd=" + regionCd + ", provinceCd=" + provinceCd + ", cityCd=" + cityCd
				+ ", saveDistrict=" + saveDistrict + ", delDistrict=" + delDistrict + "]";
	}
	
}

class SaveDistrict{
	private String districtCd;
	private String districtDesc;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
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
		return "SaveDistrict [districtCd=" + districtCd + ", districtDesc=" + districtDesc + ", activeTag=" + activeTag
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
	
}