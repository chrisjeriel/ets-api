package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveAcseBudExpMonthlyRequest {
	private List<SaveBudExpMonthly> saveBudExpMonthly;

	public List<SaveBudExpMonthly> getSaveBudExpMonthly() {
		return saveBudExpMonthly;
	}

	public void setSaveBudExpMonthly(List<SaveBudExpMonthly> saveBudExpMonthly) {
		this.saveBudExpMonthly = saveBudExpMonthly;
	}

	@Override
	public String toString() {
		return "SaveAcseBudExpMonthlyRequest [saveBudExpMonthly=" + saveBudExpMonthly + "]";
	}
}

@Alias("SaveBudExpMonthly")
class SaveBudExpMonthly{
	private String budgetYear;
	private String itemNo;
	private String mm;
	private String glAcctId;
	private String slTypeCd;
	private String slCd;
	private String budgetAmt;
	private String expenseAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getBudgetYear() {
		return budgetYear;
	}
	public void setBudgetYear(String budgetYear) {
		this.budgetYear = budgetYear;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getMm() {
		return mm;
	}
	public void setMm(String mm) {
		this.mm = mm;
	}
	public String getGlAcctId() {
		return glAcctId;
	}
	public void setGlAcctId(String glAcctId) {
		this.glAcctId = glAcctId;
	}
	public String getSlTypeCd() {
		return slTypeCd;
	}
	public void setSlTypeCd(String slTypeCd) {
		this.slTypeCd = slTypeCd;
	}
	public String getSlCd() {
		return slCd;
	}
	public void setSlCd(String slCd) {
		this.slCd = slCd;
	}
	public String getBudgetAmt() {
		return budgetAmt;
	}
	public void setBudgetAmt(String budgetAmt) {
		this.budgetAmt = budgetAmt;
	}
	public String getExpenseAmt() {
		return expenseAmt;
	}
	public void setExpenseAmt(String expenseAmt) {
		this.expenseAmt = expenseAmt;
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
		return "SaveBudExpMonthly [budgetYear=" + budgetYear + ", itemNo=" + itemNo + ", mm=" + mm + ", glAcctId="
				+ glAcctId + ", slTypeCd=" + slTypeCd + ", slCd=" + slCd + ", budgetAmt=" + budgetAmt + ", expenseAmt="
				+ expenseAmt + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
}
