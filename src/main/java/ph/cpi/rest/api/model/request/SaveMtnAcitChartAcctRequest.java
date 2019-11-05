package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnAcitChartAcctRequest {
	private List<chartAcct> saveAcitChartAcct;
	private List<chartAcct> deleteAcitChartAcct;
	public List<chartAcct> getSaveAcitChartAcct() {
		return saveAcitChartAcct;
	}
	public void setSaveAcitChartAcct(List<chartAcct> saveAcitChartAcct) {
		this.saveAcitChartAcct = saveAcitChartAcct;
	}
	public List<chartAcct> getDeleteAcitChartAcct() {
		return deleteAcitChartAcct;
	}
	public void setDeleteAcitChartAcct(List<chartAcct> deleteAcitChartAcct) {
		this.deleteAcitChartAcct = deleteAcitChartAcct;
	}
	@Override
	public String toString() {
		return "SaveMtnAcitChartAcctRequest [saveAcitChartAcct=" + saveAcitChartAcct + ", deleteAcitChartAcct="
				+ deleteAcitChartAcct + "]";
	}
	
}

class chartAcct{
	private Integer glAcctId;
	private Integer glAcctCategory;
	private Integer glAcctControl;
	private Integer glAcctSub1;
	private Integer glAcctSub2;
	private Integer glAcctSub3;
	private String shortDesc;
	private String longDesc;
	private String shortCode;
	private Integer slTypeCd;
	private String drCrTag;
	private String postTag;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public Integer getGlAcctId() {
		return glAcctId;
	}
	public void setGlAcctId(Integer glAcctId) {
		this.glAcctId = glAcctId;
	}
	public Integer getGlAcctCategory() {
		return glAcctCategory;
	}
	public void setGlAcctCategory(Integer glAcctCategory) {
		this.glAcctCategory = glAcctCategory;
	}
	public Integer getGlAcctControl() {
		return glAcctControl;
	}
	public void setGlAcctControl(Integer glAcctControl) {
		this.glAcctControl = glAcctControl;
	}
	public Integer getGlAcctSub1() {
		return glAcctSub1;
	}
	public void setGlAcctSub1(Integer glAcctSub1) {
		this.glAcctSub1 = glAcctSub1;
	}
	public Integer getGlAcctSub2() {
		return glAcctSub2;
	}
	public void setGlAcctSub2(Integer glAcctSub2) {
		this.glAcctSub2 = glAcctSub2;
	}
	public Integer getGlAcctSub3() {
		return glAcctSub3;
	}
	public void setGlAcctSub3(Integer glAcctSub3) {
		this.glAcctSub3 = glAcctSub3;
	}
	public String getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	public String getLongDesc() {
		return longDesc;
	}
	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}
	public String getShortCode() {
		return shortCode;
	}
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}
	public Integer getSlTypeCd() {
		return slTypeCd;
	}
	public void setSlTypeCd(Integer slTypeCd) {
		this.slTypeCd = slTypeCd;
	}
	public String getDrCrTag() {
		return drCrTag;
	}
	public void setDrCrTag(String drCrTag) {
		this.drCrTag = drCrTag;
	}
	public String getPostTag() {
		return postTag;
	}
	public void setPostTag(String postTag) {
		this.postTag = postTag;
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
		return "acitChartAcct [glAcctId=" + glAcctId + ", glAcctCategory=" + glAcctCategory + ", glAcctControl="
				+ glAcctControl + ", glAcctSub1=" + glAcctSub1 + ", glAcctSub2=" + glAcctSub2 + ", glAcctSub3="
				+ glAcctSub3 + ", shortDesc=" + shortDesc + ", longDesc=" + longDesc + ", shortCode=" + shortCode
				+ ", slTypeCd=" + slTypeCd + ", drCrTag=" + drCrTag + ", postTag=" + postTag + ", activeTag="
				+ activeTag + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}