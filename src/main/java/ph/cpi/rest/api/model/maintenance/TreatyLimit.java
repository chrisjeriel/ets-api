package ph.cpi.rest.api.model.maintenance;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class TreatyLimit {

	private String lineCd;
	private String lineClassCd;
	private String currencyCd;
	private Integer treatyLimitId;
	private BigDecimal amount;
	private String trtyLayerDesc;
	private DateTime effDateFrom;
	private String activeTag;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	List<TreatyLayer> treatyLayerList;
	
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
	public Integer getTreatyLimitId() {
		return treatyLimitId;
	}
	public void setTreatyLimitId(Integer treatyLimitId) {
		this.treatyLimitId = treatyLimitId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getTrtyLayerDesc() {
		return trtyLayerDesc;
	}
	public void setTrtyLayerDesc(String trtyLayerDesc) {
		this.trtyLayerDesc = trtyLayerDesc;
	}
	public DateTime getEffDateFrom() {
		return effDateFrom;
	}
	public void setEffDateFrom(DateTime effDateFrom) {
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
	public List<TreatyLayer> getTreatyLayerList() {
		return treatyLayerList;
	}
	public void setTreatyLayerList(List<TreatyLayer> treatyLayerList) {
		this.treatyLayerList = treatyLayerList;
	}
	@Override
	public String toString() {
		return "TreatyLimit [lineCd=" + lineCd + ", lineClassCd=" + lineClassCd + ", currencyCd=" + currencyCd
				+ ", treatyLimitId=" + treatyLimitId + ", amount=" + amount + ", trtyLayerDesc=" + trtyLayerDesc
				+ ", effDateFrom=" + effDateFrom + ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", treatyLayerList=" + treatyLayerList + "]";
	}
}
