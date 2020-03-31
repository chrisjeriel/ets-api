package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;


public class SaveAcseBudgetExpenseRequest {
	private List<SaveAcseBudgetExp> saveBudgetExpense;
	private List<SaveAcseBudgetExp> deleteBudgetExpense;
	public List<SaveAcseBudgetExp> getSaveBudgetExpense() {
		return saveBudgetExpense;
	}
	public void setSaveBudgetExpense(List<SaveAcseBudgetExp> saveBudgetExpense) {
		this.saveBudgetExpense = saveBudgetExpense;
	}
	public List<SaveAcseBudgetExp> getDeleteBudgetExpense() {
		return deleteBudgetExpense;
	}
	public void setDeleteBudgetExpense(List<SaveAcseBudgetExp> deleteBudgetExpense) {
		this.deleteBudgetExpense = deleteBudgetExpense;
	}
	@Override
	public String toString() {
		return "SaveAcseBudgetExpenseRequest [saveBudgetExpense=" + saveBudgetExpense + ", deleteBudgetExpense="
				+ deleteBudgetExpense + "]";
	}
}


class SaveAcseBudgetExp {
	private Integer budgetYear;
	private Integer itemNo;
	private Integer glAcctId;
	private Integer slTypeCd;
	private Integer slCd;
	private BigDecimal totalBudget;
	private BigDecimal totalExpense;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private String glShortDesc;
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
	public Integer getSlTypeCd() {
		return slTypeCd;
	}
	public void setSlTypeCd(Integer slTypeCd) {
		this.slTypeCd = slTypeCd;
	}
	public Integer getSlCd() {
		return slCd;
	}
	public void setSlCd(Integer slCd) {
		this.slCd = slCd;
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
	public String getGlShortDesc() {
		return glShortDesc;
	}
	public void setGlShortDesc(String glShortDesc) {
		this.glShortDesc = glShortDesc;
	}
	@Override
	public String toString() {
		return "SaveAcseBudgetExp [budgetYear=" + budgetYear + ", itemNo=" + itemNo + ", glAcctId=" + glAcctId
				+ ", slTypeCd=" + slTypeCd + ", slCd=" + slCd + ", totalBudget=" + totalBudget + ", totalExpense="
				+ totalExpense + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + ", glShortDesc=" + glShortDesc + "]";
	}
}