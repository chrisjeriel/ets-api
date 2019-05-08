package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class MtnCurrency {
	private String currencyCd;
	private String currencyWord;
	private String description;
	private String remarks;
	private String activeTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getCurrencyWord() {
		return currencyWord;
	}
	public void setCurrencyWord(String currencyWord) {
		this.currencyWord = currencyWord;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
		return "MtnCurrency [currencyCd=" + currencyCd + ", currencyWord=" + currencyWord + ", description="
				+ description + ", remarks=" + remarks + ", activeTag=" + activeTag + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
