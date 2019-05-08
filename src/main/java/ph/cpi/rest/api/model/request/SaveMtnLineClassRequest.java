package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnLineClassRequest {
	
	private List<LineClass> saveLineClass;
	private List<LineClass> deleteLineClass;
	
	public List<LineClass> getSaveLineClass() {
		return saveLineClass;
	}
	public void setSaveLineClass(List<LineClass> saveLineClass) {
		this.saveLineClass = saveLineClass;
	}
	public List<LineClass> getDeleteLineClass() {
		return deleteLineClass;
	}
	public void setDeleteLineClass(List<LineClass> deleteLineClass) {
		this.deleteLineClass = deleteLineClass;
	}
	@Override
	public String toString() {
		return "SaveMtnLineClassRequest [saveLineClass=" + saveLineClass + ", deleteLineClass=" + deleteLineClass + "]";
	}
}

@Alias("SaveMtnLineClass")
class LineClass {
	private String lineCd;
	private String lineClassCd;
	private String lineCdDesc;
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
	public String getLineCdDesc() {
		return lineCdDesc;
	}
	public void setLineCdDesc(String lineCdDesc) {
		this.lineCdDesc = lineCdDesc;
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
		return "LineClass [lineCd=" + lineCd + ", lineClassCd=" + lineClassCd + ", lineCdDesc=" + lineCdDesc
				+ ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
