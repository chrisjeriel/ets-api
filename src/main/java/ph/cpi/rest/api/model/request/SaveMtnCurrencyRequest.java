package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnCurrencyRequest {
	private List<MtnCurrency> saveCurrency;

	public List<MtnCurrency> getSaveCurrency() {
		return saveCurrency;
	}

	public void setSaveCurrency(List<MtnCurrency> saveCurrency) {
		this.saveCurrency = saveCurrency;
	}

	@Override
	public String toString() {
		return "SaveMtnCurrencyRequest [saveCurrency=" + saveCurrency + "]";
	}
	
	
	
}

@Alias ("MtnSaveCurr")
class MtnCurrency {
	private String currencyCd;
	private String currencyWord;
	private String description;
	private String remarks;
	private String activeTag;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
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
		return "MtnCurrency [currencyCd=" + currencyCd + ", currencyWord=" + currencyWord + ", description="
				+ description + ", remarks=" + remarks + ", activeTag=" + activeTag + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
