package ph.cpi.rest.api.model.maintenance;

import java.util.List;

import org.joda.time.DateTime;

public class Object_ {
	private String lineCd;
	private String lineDesc;
	private Integer objectId ;
	private String description;
	private String activeTag;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private List<CATPeril> catPerilList;
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getLineDesc() {
		return lineDesc;
	}
	public void setLineDesc(String lineDesc) {
		this.lineDesc = lineDesc;
	}
	public Integer getObjectId() {
		return objectId;
	}
	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
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
	public List<CATPeril> getCatPerilList() {
		return catPerilList;
	}
	public void setCatPerilList(List<CATPeril> catPerilList) {
		this.catPerilList = catPerilList;
	}
	@Override
	public String toString() {
		return "Object_ [lineCd=" + lineCd + ", lineDesc=" + lineDesc + ", objectId=" + objectId + ", description="
				+ description + ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", catPerilList=" + catPerilList + "]";
	}
	
}
