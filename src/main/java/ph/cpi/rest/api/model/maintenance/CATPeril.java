package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class CATPeril {
	private String lineCd; 
	private String lineDesc;
	private String objectId; 
	private Integer catPerilId;
	private String catPerilAbbr;
	private String catPerilName;
	private Integer pctSharePrem;
	private String defaultTag;
	private String activeTag; 
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
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
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public Integer getCatPerilId() {
		return catPerilId;
	}
	public void setCatPerilId(Integer catPerilId) {
		this.catPerilId = catPerilId;
	}
	public String getCatPerilAbbr() {
		return catPerilAbbr;
	}
	public void setCatPerilAbbr(String catPerilAbbr) {
		this.catPerilAbbr = catPerilAbbr;
	}
	public String getCatPerilName() {
		return catPerilName;
	}
	public void setCatPerilName(String catPerilName) {
		this.catPerilName = catPerilName;
	}
	public Integer getPctSharePrem() {
		return pctSharePrem;
	}
	public void setPctSharePrem(Integer pctSharePrem) {
		this.pctSharePrem = pctSharePrem;
	}
	public String getDefaultTag() {
		return defaultTag;
	}
	public void setDefaultTag(String defaultTag) {
		this.defaultTag = defaultTag;
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
	
	@Override
	public String toString() {
		return "CATPeril [lineCd=" + lineCd + ", lineDesc=" + lineDesc + ", objectId=" + objectId + ", catPerilId="
				+ catPerilId + ", catPerilAbbr=" + catPerilAbbr + ", catPerilName=" + catPerilName + ", pctSharePrem="
				+ pctSharePrem + ", defaultTag=" + defaultTag + ", activeTag=" + activeTag + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
