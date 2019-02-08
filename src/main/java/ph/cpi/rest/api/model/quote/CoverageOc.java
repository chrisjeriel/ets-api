package ph.cpi.rest.api.model.quote;

import java.math.BigDecimal;
import org.joda.time.LocalDateTime;

public class CoverageOc {
	private Integer riskId;
	private BigDecimal maxSi;
	private String currencyCd;
	private BigDecimal currencyRt;
	private BigDecimal pctShare;
	private BigDecimal pctPml;
	private BigDecimal totalValue;
	private Double maxSiD; //Must be BigDecimal, must be removed but check XML mapper first.
	private Double currencyRtD; //Must be BigDecimal, must be removed but check XML mapper first.
	private Double pctShareD; //Must be BigDecimal, must be removed but check XML mapper first.
	private Double pctPmlD; //Must be BigDecimal, must be removed but check XML mapper first.
	private Double totalValueD; //Must be BigDecimal, must be removed but check XML mapper first.
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
	public Double getMaxSiD() {
		return maxSiD;
	}
	public void setMaxSiD(Double maxSiD) {
		this.maxSiD = maxSiD;
	}
	public Double getCurrencyRtD() {
		return currencyRtD;
	}
	public void setCurrencyRtD(Double currencyRtD) {
		this.currencyRtD = currencyRtD;
	}
	public Double getPctShareD() {
		return pctShareD;
	}
	public void setPctShareD(Double pctShareD) {
		this.pctShareD = pctShareD;
	}
	public Double getPctPmlD() {
		return pctPmlD;
	}
	public void setPctPmlD(Double pctPmlD) {
		this.pctPmlD = pctPmlD;
	}
	public Double getTotalValueD() {
		return totalValueD;
	}
	public void setTotalValueD(Double totalValueD) {
		this.totalValueD = totalValueD;
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
		return "CoverageOc [riskId=" + riskId + ", maxSi=" + maxSi + ", currencyCd=" + currencyCd + ", currencyRt="
				+ currencyRt + ", pctShare=" + pctShare + ", pctPml=" + pctPml + ", totalValue=" + totalValue
				+ ", maxSiD=" + maxSiD + ", currencyRtD=" + currencyRtD + ", pctShareD=" + pctShareD + ", pctPmlD="
				+ pctPmlD + ", totalValueD=" + totalValueD + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
}
