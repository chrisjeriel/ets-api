package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcseBudExpMonthly {
	private Integer budgetYear;
	private Integer itemNo;
	private Integer glAcctId;
	private String glShortCd;
	private String glShortDesc;
	private Integer slTypeCd;
	private String slTypeName;
	private Integer slCd;
	private String slName;
	private BigDecimal totalBudget;
	private BigDecimal totalExpense;
	private BigDecimal jan;
	private BigDecimal feb;
	private BigDecimal mar;
	private BigDecimal apr;
	private BigDecimal may;
	private BigDecimal jun;
	private BigDecimal jul;
	private BigDecimal aug;
	private BigDecimal sep;
	private BigDecimal oct;
	private BigDecimal nov;
	private BigDecimal dec;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getBudgetYear() {
		return budgetYear;
	}
	public void setBudgetYear(Integer budgetYear) {
		this.budgetYear = budgetYear;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public Integer getGlAcctId() {
		return glAcctId;
	}
	public void setGlAcctId(Integer glAcctId) {
		this.glAcctId = glAcctId;
	}
	public String getGlShortCd() {
		return glShortCd;
	}
	public void setGlShortCd(String glShortCd) {
		this.glShortCd = glShortCd;
	}
	public String getGlShortDesc() {
		return glShortDesc;
	}
	public void setGlShortDesc(String glShortDesc) {
		this.glShortDesc = glShortDesc;
	}
	public Integer getSlTypeCd() {
		return slTypeCd;
	}
	public void setSlTypeCd(Integer slTypeCd) {
		this.slTypeCd = slTypeCd;
	}
	public String getSlTypeName() {
		return slTypeName;
	}
	public void setSlTypeName(String slTypeName) {
		this.slTypeName = slTypeName;
	}
	public Integer getSlCd() {
		return slCd;
	}
	public void setSlCd(Integer slCd) {
		this.slCd = slCd;
	}
	public String getSlName() {
		return slName;
	}
	public void setSlName(String slName) {
		this.slName = slName;
	}
	public BigDecimal getTotalBudget() {
		return totalBudget;
	}
	public void setTotalBudget(BigDecimal totalBudget) {
		this.totalBudget = totalBudget;
	}
	public BigDecimal getTotalExpense() {
		return totalExpense;
	}
	public void setTotalExpense(BigDecimal totalExpense) {
		this.totalExpense = totalExpense;
	}
	public BigDecimal getJan() {
		return jan;
	}
	public void setJan(BigDecimal jan) {
		this.jan = jan;
	}
	public BigDecimal getFeb() {
		return feb;
	}
	public void setFeb(BigDecimal feb) {
		this.feb = feb;
	}
	public BigDecimal getMar() {
		return mar;
	}
	public void setMar(BigDecimal mar) {
		this.mar = mar;
	}
	public BigDecimal getApr() {
		return apr;
	}
	public void setApr(BigDecimal apr) {
		this.apr = apr;
	}
	public BigDecimal getMay() {
		return may;
	}
	public void setMay(BigDecimal may) {
		this.may = may;
	}
	public BigDecimal getJun() {
		return jun;
	}
	public void setJun(BigDecimal jun) {
		this.jun = jun;
	}
	public BigDecimal getJul() {
		return jul;
	}
	public void setJul(BigDecimal jul) {
		this.jul = jul;
	}
	public BigDecimal getAug() {
		return aug;
	}
	public void setAug(BigDecimal aug) {
		this.aug = aug;
	}
	public BigDecimal getSep() {
		return sep;
	}
	public void setSep(BigDecimal sep) {
		this.sep = sep;
	}
	public BigDecimal getOct() {
		return oct;
	}
	public void setOct(BigDecimal oct) {
		this.oct = oct;
	}
	public BigDecimal getNov() {
		return nov;
	}
	public void setNov(BigDecimal nov) {
		this.nov = nov;
	}
	public BigDecimal getDec() {
		return dec;
	}
	public void setDec(BigDecimal dec) {
		this.dec = dec;
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
		return "AcseBudExpMonthly [budgetYear=" + budgetYear + ", itemNo=" + itemNo + ", glAcctId=" + glAcctId
				+ ", glShortCd=" + glShortCd + ", glShortDesc=" + glShortDesc + ", slTypeCd=" + slTypeCd
				+ ", slTypeName=" + slTypeName + ", slCd=" + slCd + ", slName=" + slName + ", totalBudget="
				+ totalBudget + ", totalExpense=" + totalExpense + ", jan=" + jan + ", feb=" + feb + ", mar=" + mar
				+ ", apr=" + apr + ", may=" + may + ", jun=" + jun + ", jul=" + jul + ", aug=" + aug + ", sep=" + sep
				+ ", oct=" + oct + ", nov=" + nov + ", dec=" + dec + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
