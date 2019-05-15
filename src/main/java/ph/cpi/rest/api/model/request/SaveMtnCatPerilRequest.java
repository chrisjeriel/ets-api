package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

public class SaveMtnCatPerilRequest {
	private List<CatPerils> delCatPeril;
	private List<CatPerils> saveCatPeril;
	public List<CatPerils> getDelCatPeril() {
		return delCatPeril;
	}
	public void setDelCatPeril(List<CatPerils> delCatPeril) {
		this.delCatPeril = delCatPeril;
	}
	public List<CatPerils> getSaveCatPeril() {
		return saveCatPeril;
	}
	public void setSaveCatPeril(List<CatPerils> saveCatPeril) {
		this.saveCatPeril = saveCatPeril;
	}
	@Override
	public String toString() {
		return "SaveMtnCatPeril [delCatPeril=" + delCatPeril + ", saveCatPeril=" + saveCatPeril + "]";
	}
	
	
}

class CatPerils {
	private String lineCd;
	private String objectId;
	private String catPerilId;
	private String catPerilName;
	private String catPerilAbbr;
	private BigDecimal pctSharePrem;
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
	public String getCatPerilId() {
		return catPerilId;
	}
	public void setCatPerilId(String catPerilId) {
		this.catPerilId = catPerilId;
	}
	public String getCatPerilName() {
		return catPerilName;
	}
	public void setCatPerilName(String catPerilName) {
		this.catPerilName = catPerilName;
	}
	public String getCatPerilAbbr() {
		return catPerilAbbr;
	}
	public void setCatPerilAbbr(String catPerilAbbr) {
		this.catPerilAbbr = catPerilAbbr;
	}
	public BigDecimal getPctSharePrem() {
		return pctSharePrem;
	}
	public void setPctSharePrem(BigDecimal pctSharePrem) {
		this.pctSharePrem = pctSharePrem;
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
		return "CatPerils [lineCd=" + lineCd + ", objectId=" + objectId + ", catPerilId=" + catPerilId
				+ ", catPerilName=" + catPerilName + ", catPerilAbbr=" + catPerilAbbr + ", pctSharePrem=" + pctSharePrem
				+ ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}