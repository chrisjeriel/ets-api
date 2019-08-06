package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class AcitChartAcct {
	private Integer glAcctId;
	private Integer glAcctCategory;
	private String glAcctCategoryDesc;
	private Integer glAcctControl;
	private Integer glAcctSub1;
	private Integer glAcctSub2;
	private Integer glAcctSub3;
	private String shortDesc;
	private String longDesc;
	private String shortCode;
	private Integer slTypeCd;
	private String slTypeName;
	private String drCrTag;
	private String postTag;
	private String activeTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
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
	public String getGlAcctCategoryDesc() {
		return glAcctCategoryDesc;
	}
	public void setGlAcctCategoryDesc(String glAcctCategoryDesc) {
		this.glAcctCategoryDesc = glAcctCategoryDesc;
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
	public String getSlTypeName() {
		return slTypeName;
	}
	public void setSlTypeName(String slTypeName) {
		this.slTypeName = slTypeName;
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
	@Override
	public String toString() {
		return "AcitChartAcct [glAcctId=" + glAcctId + ", glAcctCategory=" + glAcctCategory + ", glAcctCategoryDesc="
				+ glAcctCategoryDesc + ", glAcctControl=" + glAcctControl + ", glAcctSub1=" + glAcctSub1
				+ ", glAcctSub2=" + glAcctSub2 + ", glAcctSub3=" + glAcctSub3 + ", shortDesc=" + shortDesc
				+ ", longDesc=" + longDesc + ", shortCode=" + shortCode + ", slTypeCd=" + slTypeCd + ", slTypeName="
				+ slTypeName + ", drCrTag=" + drCrTag + ", postTag=" + postTag + ", activeTag=" + activeTag
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
