package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnRegionRequest {
	
	private List<Regions> saveRegion;
	private List<Regions> deleteRegion;
	 
	public List<Regions> getSaveRegion() {
		return saveRegion;
	}
	public void setSaveRegion(List<Regions> saveRegion) {
		this.saveRegion = saveRegion;
	}
	public List<Regions> getDeleteRegion() {
		return deleteRegion;
	}
	public void setDeleteRegion(List<Regions> deleteRegion) {
		this.deleteRegion = deleteRegion;
	}
	
	 @Override
		public String toString() {
			return "SaveMtnRegionRequest [saveRegion=" + saveRegion + ", deleteRegion=" + deleteRegion + "]";
		}
}

@Alias("SaveRegion")

class Regions {
	private String regionCd ;
	private String description ;
    private String activeTag ;
    private String remarks ;
    private String createUser ;
    private String createDate ;
    private String updateUser ;
    private String updateDate ;
    
    public String getRegionCd() {
		return regionCd;
	}
	public void setRegionCd(String regionCd) {
		this.regionCd = regionCd;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
		return "Region [regionCd=" + regionCd + ", description=" + description + ", activeTag=" + activeTag
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
