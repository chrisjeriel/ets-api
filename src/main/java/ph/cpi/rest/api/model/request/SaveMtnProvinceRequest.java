package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnProvinceRequest {
	
	private List<Provinces> saveProvince;
	private List<Provinces> deleteProvince;
	
	public List<Provinces> getSaveProvince() {
		return saveProvince;
	}
	public void setSaveProvince(List<Provinces> saveProvince) {
		this.saveProvince = saveProvince;
	}
	public List<Provinces> getDeleteProvince() {
		return deleteProvince;
	}
	public void setDeleteProvince(List<Provinces> deleteProvince) {
		this.deleteProvince = deleteProvince;
	}
	
	@Override
	public String toString() {
		return "SaveMtnProvinceRequest [saveProvince=" + saveProvince + ", deleteProvince=" + deleteProvince + "]";
	}
}

@Alias("SaveProvince")
class Provinces {
	
	private String provinceCd ;
	private String description ;
	private String regionCd ;
	private String activeTag ;
    private String remarks ;
    private String createUser ;
    private String createDate ;
    private String updateUser ;
    private String updateDate ;
    
	public String getProvinceCd() {
		return provinceCd;
	}
	public void setProvinceCd(String provinceCd) {
		this.provinceCd = provinceCd;
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
		return "Provinces [provinceCd=" + provinceCd + ", description=" + description + ", regionCd=" + regionCd
				+ ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
		
}