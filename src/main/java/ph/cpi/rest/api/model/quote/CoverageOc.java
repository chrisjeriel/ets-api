package ph.cpi.rest.api.model.quote;

import java.util.Date;

public class CoverageOc {
	private Integer riskId;
	private Integer maxSi;
	private String currencyCd;
	private Integer currencyRt;
	private Integer pctShare;
	private Integer pctPml;
	private Integer totalValue;
	private String createUser;
	private Date createDate;
	private String updateUser;
	private Date updateDate;
	public Integer getRiskId() {
		return riskId;
	}
	public void setRiskId(Integer riskId) {
		this.riskId = riskId;
	}
	public Integer getMaxSi() {
		return maxSi;
	}
	public void setMaxSi(Integer maxSi) {
		this.maxSi = maxSi;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public Integer getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(Integer currencyRt) {
		this.currencyRt = currencyRt;
	}
	public Integer getPctShare() {
		return pctShare;
	}
	public void setPctShare(Integer pctShare) {
		this.pctShare = pctShare;
	}
	public Integer getPctPml() {
		return pctPml;
	}
	public void setPctPml(Integer pctPml) {
		this.pctPml = pctPml;
	}
	public Integer getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(Integer totalValue) {
		this.totalValue = totalValue;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "CoverageOc [riskId=" + riskId + ", maxSi=" + maxSi + ", currencyCd="
				+ currencyCd + ", currencyRt=" + currencyRt + ", pctShare="+ pctShare +", pctPml="
				+ pctPml +", totalValue="+ totalValue +",createUser="
				+ createUser +", createDate="+ createDate +", updateUser="+ updateUser +", updateDate="
				+ updateDate +"]";
	}
}
