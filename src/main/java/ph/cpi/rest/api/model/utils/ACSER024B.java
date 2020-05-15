package ph.cpi.rest.api.model.utils;

public class ACSER024B {
	private String itemNo;
	private String itemName;
	private String currIncome;
	private String currExpense;
	private String prevIncome;
	private String prevExpense;
	private String paramDate;
	
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getCurrIncome() {
		return currIncome;
	}
	public void setCurrIncome(String currIncome) {
		this.currIncome = currIncome;
	}
	public String getCurrExpense() {
		return currExpense;
	}
	public void setCurrExpense(String currExpense) {
		this.currExpense = currExpense;
	}
	public String getPrevIncome() {
		return prevIncome;
	}
	public void setPrevIncome(String prevIncome) {
		this.prevIncome = prevIncome;
	}
	public String getPrevExpense() {
		return prevExpense;
	}
	public void setPrevExpense(String prevExpense) {
		this.prevExpense = prevExpense;
	}
	public String getParamDate() {
		return paramDate;
	}
	public void setParamDate(String paramDate) {
		this.paramDate = paramDate;
	}
	@Override
	public String toString() {
		return "ACSER024B [itemNo=" + itemNo + ", itemName=" + itemName + ", currIncome=" + currIncome
				+ ", currExpense=" + currExpense + ", prevIncome=" + prevIncome + ", prevExpense=" + prevExpense
				+ ", paramDate=" + paramDate + "]";
	}
}
