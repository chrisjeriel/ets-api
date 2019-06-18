package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnRetAmtRequest {

	List<RetAmt> saveRetAmt;
	List<RetAmt> deleteRetAmt;
	
	public List<RetAmt> getSaveRetAmt() {
		return saveRetAmt;
	}
	public void setSaveRetAmt(List<RetAmt> saveRetAmt) {
		this.saveRetAmt = saveRetAmt;
	}
	public List<RetAmt> getDeleteRetAmt() {
		return deleteRetAmt;
	}
	public void setDeleteRetAmt(List<RetAmt> deleteRetAmt) {
		this.deleteRetAmt = deleteRetAmt;
	}
	@Override
	public String toString() {
		return "SaveMtnRetAmtRequest []";
	}
}

@Alias("SaveMtnRetAmt")
class RetAmt {
	private String lineCd;
    private String lineClassCd;
    private String currencyCd;
	private Integer retentionId;
    private String retLineAmt;
    private String effDateFrom;
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
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public Integer getRetentionId() {
		return retentionId;
	}
	public void setRetentionId(Integer retentionId) {
		this.retentionId = retentionId;
	}
	public String getRetLineAmt() {
		return retLineAmt;
	}
	public void setRetLineAmt(String retLineAmt) {
		this.retLineAmt = retLineAmt;
	}
	public String getEffDateFrom() {
		return effDateFrom;
	}
	public void setEffDateFrom(String effDateFrom) {
		this.effDateFrom = effDateFrom;
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
		return "RetAmt [lineCd=" + lineCd + ", lineClassCd=" + lineClassCd + ", currencyCd=" + currencyCd
				+ ", retentionId=" + retentionId + ", retLineAmt=" + retLineAmt + ", effDateFrom=" + effDateFrom
				+ ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
