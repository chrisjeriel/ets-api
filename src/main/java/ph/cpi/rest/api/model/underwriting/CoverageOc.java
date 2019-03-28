package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;

@Alias("UnderwritingCoverageOc")
public class CoverageOc {
	private BigDecimal sectionISi;
	private BigDecimal sectionIISi;
	private BigDecimal sectionIIISi;
	private BigDecimal totalSi;
	private BigDecimal sectionIPrem;
	private BigDecimal sectionIIPrem;
	private BigDecimal sectionIIIPrem;
	private BigDecimal totalPrem;
	private String currencyCd;
	private BigDecimal currencyRt;
	private BigDecimal pctShare;
	private BigDecimal pctPml;
	private BigDecimal totalValue;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	private List<SectionCoversOc> sectionCoversOc;
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
	public BigDecimal getSectionIPrem() {
		return sectionIPrem;
	}
	public void setSectionIPrem(BigDecimal sectionIPrem) {
		this.sectionIPrem = sectionIPrem;
	}
	public BigDecimal getSectionIIPrem() {
		return sectionIIPrem;
	}
	public void setSectionIIPrem(BigDecimal sectionIIPrem) {
		this.sectionIIPrem = sectionIIPrem;
	}
	public BigDecimal getSectionIIIPrem() {
		return sectionIIIPrem;
	}
	public void setSectionIIIPrem(BigDecimal sectionIIIPrem) {
		this.sectionIIIPrem = sectionIIIPrem;
	}
	public BigDecimal getTotalPrem() {
		return totalPrem;
	}
	public void setTotalPrem(BigDecimal totalPrem) {
		this.totalPrem = totalPrem;
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
	public List<SectionCoversOc> getSectionCoversOc() {
		return sectionCoversOc;
	}
	public void setSectionCoversOc(List<SectionCoversOc> sectionCoversOc) {
		this.sectionCoversOc = sectionCoversOc;
	}
	@Override
	public String toString() {
		return "CoverageOc [sectionISi=" + sectionISi + ", sectionIISi=" + sectionIISi + ", sectionIIISi="
				+ sectionIIISi + ", totalSi=" + totalSi + ", sectionIPrem=" + sectionIPrem + ", sectionIIPrem="
				+ sectionIIPrem + ", sectionIIIPrem=" + sectionIIIPrem + ", totalPrem=" + totalPrem + ", currencyCd="
				+ currencyCd + ", currencyRt=" + currencyRt + ", pctShare=" + pctShare + ", pctPml=" + pctPml
				+ ", totalValue=" + totalValue + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", sectionCoversOc="
				+ sectionCoversOc + "]";
	}
	
}
