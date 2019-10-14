package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcseBudgetExpense {
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
		return "AcseBudgetExpense [budgetYear=" + budgetYear + ", itemNo=" + itemNo + ", glAcctId=" + glAcctId
				+ ", glShortCd=" + glShortCd + ", glShortDesc=" + glShortDesc + ", slTypeCd=" + slTypeCd
				+ ", slTypeName=" + slTypeName + ", slCd=" + slCd + ", slName=" + slName + ", totalBudget="
				+ totalBudget + ", totalExpense=" + totalExpense + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
