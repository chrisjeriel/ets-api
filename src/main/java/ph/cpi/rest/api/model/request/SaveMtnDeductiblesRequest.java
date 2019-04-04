package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnDeductiblesRequest {
	List<Deductibless> saveDeductibles;
	List<Deductibless> deleteDeductibles;
	public List<Deductibless> getSaveDeductibles() {
		return saveDeductibles;
	}
	public void setSaveDeductibles(List<Deductibless> saveDeductibles) {
		this.saveDeductibles = saveDeductibles;
	}
	public List<Deductibless> getDeleteDeductibles() {
		return deleteDeductibles;
	}
	public void setDeleteDeductibles(List<Deductibless> deleteDeductibles) {
		this.deleteDeductibles = deleteDeductibles;
	}
	@Override
	public String toString() {
		return "SaveMtnDeductiblesRequest [saveDeductibles=" + saveDeductibles + ", deleteDeductibles="
				+ deleteDeductibles + "]";
	}
}

class Deductibless {
	private String lineCd;
	private String coverCd;
	private String endtCd;
	private String deductibleCd;
	private String deductibleTitle;
	private String deductibleText;
	private String deductibleType;
	private String deductibleRate;
	private String deductibleAmt;
	private String minAmt;
	private String maxAmt;
	private String activeTag;
	private String defaultTag;
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
	public String getCoverCd() {
		return coverCd;
	}
	public void setCoverCd(String coverCd) {
		this.coverCd = coverCd;
	}
	public String getEndtCd() {
		return endtCd;
	}
	public void setEndtCd(String endtCd) {
		this.endtCd = endtCd;
	}
	public String getDeductibleCd() {
		return deductibleCd;
	}
	public void setDeductibleCd(String deductibleCd) {
		this.deductibleCd = deductibleCd;
	}
	public String getDeductibleTitle() {
		return deductibleTitle;
	}
	public void setDeductibleTitle(String deductibleTitle) {
		this.deductibleTitle = deductibleTitle;
	}
	public String getDeductibleText() {
		return deductibleText;
	}
	public void setDeductibleText(String deductibleText) {
		this.deductibleText = deductibleText;
	}
	public String getDeductibleType() {
		return deductibleType;
	}
	public void setDeductibleType(String deductibleType) {
		this.deductibleType = deductibleType;
	}
	public String getDeductibleRate() {
		return deductibleRate;
	}
	public void setDeductibleRate(String deductibleRate) {
		this.deductibleRate = deductibleRate;
	}
	public String getDeductibleAmt() {
		return deductibleAmt;
	}
	public void setDeductibleAmt(String deductibleAmt) {
		this.deductibleAmt = deductibleAmt;
	}
	public String getMinAmt() {
		return minAmt;
	}
	public void setMinAmt(String minAmt) {
		this.minAmt = minAmt;
	}
	public String getMaxAmt() {
		return maxAmt;
	}
	public void setMaxAmt(String maxAmt) {
		this.maxAmt = maxAmt;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getDefaultTag() {
		return defaultTag;
	}
	public void setDefaultTag(String defaultTag) {
		this.defaultTag = defaultTag;
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
		return "Deductibless [lineCd=" + lineCd + ", coverCd=" + coverCd + ", endtCd=" + endtCd + ", deductibleCd="
				+ deductibleCd + ", deductibleTitle=" + deductibleTitle + ", deductibleText=" + deductibleText
				+ ", deductibleType=" + deductibleType + ", deductibleRate=" + deductibleRate + ", deductibleAmt="
				+ deductibleAmt + ", minAmt=" + minAmt + ", maxAmt=" + maxAmt + ", activeTag=" + activeTag
				+ ", defaultTag=" + defaultTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
