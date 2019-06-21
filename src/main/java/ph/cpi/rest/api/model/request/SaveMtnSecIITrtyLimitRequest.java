package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnSecIITrtyLimitRequest {

	List<SecIITreatyLimit> saveSecIITrtyLimit;
	List<SecIITreatyLimit> deleteSecIITrtyLimit;
	
	public List<SecIITreatyLimit> getSaveSecIITrtyLimit() {
		return saveSecIITrtyLimit;
	}
	public void setSaveSecIITrtyLimit(List<SecIITreatyLimit> saveSecIITrtyLimit) {
		this.saveSecIITrtyLimit = saveSecIITrtyLimit;
	}
	public List<SecIITreatyLimit> getDeleteSecIITrtyLimit() {
		return deleteSecIITrtyLimit;
	}
	public void setDeleteSecIITrtyLimit(List<SecIITreatyLimit> deleteSecIITrtyLimit) {
		this.deleteSecIITrtyLimit = deleteSecIITrtyLimit;
	}
	@Override
	public String toString() {
		return "SaveMtnSecIITrtyLimitRequest [saveSecIITrtyLimit=" + saveSecIITrtyLimit + ", deleteSecIITrtyLimit="
				+ deleteSecIITrtyLimit + "]";
	}
}

@Alias("SaveMtnSecIITrtyLimit")
class SecIITreatyLimit {
	private String lineCd;
	private String lineClassCd;
	private String currencyCd;
	private Integer seciiTrtyLimId;
    private BigDecimal amount;
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
	public Integer getSeciiTrtyLimId() {
		return seciiTrtyLimId;
	}
	public void setSeciiTrtyLimId(Integer seciiTrtyLimId) {
		this.seciiTrtyLimId = seciiTrtyLimId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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
		return "SecIITreatyLimit [lineCd=" + lineCd + ", lineClassCd=" + lineClassCd + ", currencyCd=" + currencyCd
				+ ", seciiTrtyLimId=" + seciiTrtyLimId + ", amount=" + amount + ", effDateFrom=" + effDateFrom
				+ ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
