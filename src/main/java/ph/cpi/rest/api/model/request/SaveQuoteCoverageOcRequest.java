package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;

public class SaveQuoteCoverageOcRequest {
	private Integer quoteIdOc;
	private Integer projId;
	private Integer riskId;
	private BigDecimal maxSi;
	private String currencyCd;
	private BigDecimal currencyRt;
	private BigDecimal pctShare;
	private BigDecimal pctPml;
	private BigDecimal totalValue;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getQuoteIdOc() {
		return quoteIdOc;
	}
	public void setQuoteIdOc(Integer quoteIdOc) {
		this.quoteIdOc = quoteIdOc;
	}
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public Integer getRiskId() {
		return riskId;
	}
	public void setRiskId(Integer riskId) {
		this.riskId = riskId;
	}
	public BigDecimal getMaxSi() {
		return maxSi;
	}
	public void setMaxSi(BigDecimal maxSi) {
		this.maxSi = maxSi;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public BigDecimal getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(BigDecimal currencyRt) {
		this.currencyRt = currencyRt;
	}
	public BigDecimal getPctShare() {
		return pctShare;
	}
	public void setPctShare(BigDecimal pctShare) {
		this.pctShare = pctShare;
	}
	public BigDecimal getPctPml() {
		return pctPml;
	}
	public void setPctPml(BigDecimal pctPml) {
		this.pctPml = pctPml;
	}
	public BigDecimal getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
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
		return "SaveQuoteCoverageOcRequest [quoteIdOc=" + quoteIdOc + ", projId=" + projId + ", riskId=" + riskId
				+ ", maxSi=" + maxSi + ", currencyCd=" + currencyCd + ", currencyRt=" + currencyRt + ", pctShare="
				+ pctShare + ", pctPml=" + pctPml + ", totalValue=" + totalValue + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
