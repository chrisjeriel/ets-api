package ph.cpi.rest.api.model.quote;

import org.joda.time.LocalDateTime;

public class CoverageOc {
	private Integer riskId;
	private Double maxSi;
	private String currencyCd;
	private Double currencyRt;
	private Double pctShare;
	private Double pctPml;
	private Double totalValue;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	public Integer getRiskId() {
		return riskId;
	}
	public void setRiskId(Integer riskId) {
		this.riskId = riskId;
	}
	public Double getMaxSi() {
		return maxSi;
	}
	public void setMaxSi(Double maxSi) {
		this.maxSi = maxSi;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public Double getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(Double currencyRt) {
		this.currencyRt = currencyRt;
	}
	public Double getPctShare() {
		return pctShare;
	}
	public void setPctShare(Double pctShare) {
		this.pctShare = pctShare;
	}
	public Double getPctPml() {
		return pctPml;
	}
	public void setPctPml(Double pctPml) {
		this.pctPml = pctPml;
	}
	public Double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
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
