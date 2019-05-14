package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnObjectRequest {
	
	private List<Object_> saveObject;
	private List<Object_> deleteObject;
	
	public List<Object_> getSaveObject() {
		return saveObject;
	}
	public void setSaveObject(List<Object_> saveObject) {
		this.saveObject = saveObject;
	}
	public List<Object_> getDeleteObject() {
		return deleteObject;
	}
	public void setDeleteObject(List<Object_> deleteObject) {
		this.deleteObject = deleteObject;
	}
	@Override
	public String toString() {
		return "SaveMtnObjectRequest [saveObject=" + saveObject + ", deleteObject=" + deleteObject + "]";
	}
}

@Alias("SaveMtnObject")
class Object_ {
	private String lineCd;
	private String objectId;
	private String description;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
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
		return "Object_ [lineCd=" + lineCd + ", objectId=" + objectId + ", description=" + description + ", activeTag="
				+ activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}

}
