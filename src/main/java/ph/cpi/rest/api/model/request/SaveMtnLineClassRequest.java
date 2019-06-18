package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnLineClassRequest {
	
	private List<LineClasses> saveLineClass;
	private List<LineClasses> deleteLineClass;
	public List<LineClasses> getSaveLineClass() {
		return saveLineClass;
	}
	public void setSaveLineClass(List<LineClasses> saveLineClass) {
		this.saveLineClass = saveLineClass;
	}
	public List<LineClasses> getDeleteLineClass() {
		return deleteLineClass;
	}
	public void setDeleteLineClass(List<LineClasses> deleteLineClass) {
		this.deleteLineClass = deleteLineClass;
	}
	@Override
	public String toString() {
		return "SaveMtnLineClassRequest [saveLineClass=" + saveLineClass + ", deleteLineClass=" + deleteLineClass + "]";
	}
	
}

@Alias("SaveMtnLineClass")
class LineClasses {
	private String lineCd;
	private String lineClassCd;
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
	public String getLineClassCd() {
		return lineClassCd;
	}
	public void setLineClassCd(String lineClassCd) {
		this.lineClassCd = lineClassCd;
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
		return "LineClasses [lineCd=" + lineCd + ", lineClassCd=" + lineClassCd + ", description=" + description
				+ ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
