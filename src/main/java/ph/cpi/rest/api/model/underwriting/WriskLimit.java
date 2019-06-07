package ph.cpi.rest.api.model.underwriting;

import org.joda.time.DateTime;

public class WriskLimit {
	private Integer treatyLimitId;
	private String treatyName;
	private Double amount;
	private String trtyLayerDesc;
	private DateTime effDateFrom;
	private DateTime effDateTo;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public Integer getTreatyLimitId() {
		return treatyLimitId;
	}
	public void setTreatyLimitId(Integer treatyLimitId) {
		this.treatyLimitId = treatyLimitId;
	}
	public String getTreatyName() {
		return treatyName;
	}
	public void setTreatyName(String treatyName) {
		this.treatyName = treatyName;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
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
	public DateTime getEffDateTo() {
		return effDateTo;
	}
	public void setEffDateTo(DateTime effDateTo) {
		this.effDateTo = effDateTo;
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
		return "WriskLimit [treatyLimitId=" + treatyLimitId + ", treatyName=" + treatyName + ", amount=" + amount
				+ ", trtyLayerDesc=" + trtyLayerDesc + ", effDateFrom=" + effDateFrom + ", effDateTo=" + effDateTo
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
}
