package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnCityRequest {
	
	private List<Cities> saveCity;
	private List<Cities> deleteCity;
	
	public List<Cities> getSaveCity() {
		return saveCity;
	}
	public void setSaveCity(List<Cities> saveCity) {
		this.saveCity = saveCity;
	}
	public List<Cities> getDeleteCity() {
		return deleteCity;
	}
	public void setDeleteCity(List<Cities> deleteCity) {
		this.deleteCity = deleteCity;
	}
	
	@Override
	public String toString() {
		return "SaveMtnCityRequest [saveCity=" + saveCity + ", deleteCity=" + deleteCity + "]";
	}
}
@Alias("SaveCity")
class Cities {
	private String cityCd ;
	private String description ;
	private String regionCd ;
	private String provinceCd ;
	private String activeTag ;
    private String remarks ;
    private String zoneCd ;
    private String createUser ;
    private String createDate ;
    private String updateUser ;
    private String updateDate ;
    
	public String getCityCd() {
		return cityCd;
	}
	public void setCityCd(String cityCd) {
		this.cityCd = cityCd;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getZoneCd() {
		return zoneCd;
	}
	public void setZoneCd(String zoneCd) {
		this.zoneCd = zoneCd;
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
		return "City [cityCd=" + cityCd + ", description=" + description + ", regionCd=" + regionCd + ", provinceCd="
				+ provinceCd + ", activeTag=" + activeTag + ", remarks=" + remarks + ", zoneCd=" + zoneCd
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
    
}