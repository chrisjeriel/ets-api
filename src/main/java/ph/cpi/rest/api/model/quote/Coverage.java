package ph.cpi.rest.api.model.quote;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

public class Coverage {
	
	Integer riskId;
	private BigDecimal sectionISi;
	private BigDecimal sectionIISi;
	private BigDecimal sectionIIISi;
	private BigDecimal totalSi;
	private String currencyCd;
	private BigDecimal currencyRt;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	private BigDecimal totalValue;
	
	private List<SectionCovers> sectionCovers;
	
	
	public Integer getRiskId() {
		return riskId;
	}
	public void setRiskId(Integer riskId) {
		this.riskId = riskId;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	public BigDecimal getSectionISi() {
		return sectionISi;
	}
	public void setSectionISi(BigDecimal sectionISi) {
		this.sectionISi = sectionISi;
	}
	public BigDecimal getSectionIISi() {
		return sectionIISi;
	}
	public void setSectionIISi(BigDecimal sectionIISi) {
		this.sectionIISi = sectionIISi;
	}
	public BigDecimal getSectionIIISi() {
		return sectionIIISi;
	}
	public void setSectionIIISi(BigDecimal sectionIIISi) {
		this.sectionIIISi = sectionIIISi;
	}
	public BigDecimal getTotalSi() {
		return totalSi;
	}
	public void setTotalSi(BigDecimal totalSi) {
		this.totalSi = totalSi;
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
	public List<SectionCovers> getSectionCovers() {
		return sectionCovers;
	}
	public void setSectionCovers(List<SectionCovers> sectionCovers) {
		this.sectionCovers = sectionCovers;
	}
	
	public BigDecimal getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}
	@Override
	public String toString() {
		return "Coverage [riskId=" + riskId + ", sectionISi=" + sectionISi + ", sectionIISi=" + sectionIISi
				+ ", sectionIIISi=" + sectionIIISi + ", totalSi=" + totalSi + ", currencyCd=" + currencyCd
				+ ", currencyRt=" + currencyRt + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", totalValue="
				+ totalValue + ", sectionCovers=" + sectionCovers + "]";
	}
}
