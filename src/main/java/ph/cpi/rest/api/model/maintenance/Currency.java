package ph.cpi.rest.api.model.maintenance;

import org.joda.time.LocalDateTime;

public class Currency {
	private String currencyCd;
	private String currencyAbbr;
	private String currencyWord;
	private Double currencyRt;
	private String currencyDesc;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getCurrencyAbbr() {
		return currencyAbbr;
	}
	public void setCurrencyAbbr(String currencyAbbr) {
		this.currencyAbbr = currencyAbbr;
	}
	public String getCurrencyWord() {
		return currencyWord;
	}
	public void setCurrencyWord(String currencyWord) {
		this.currencyWord = currencyWord;
	}
	public Double getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(Double currencyRt) {
		this.currencyRt = currencyRt;
	}
	public String getCurrencyDesc() {
		return currencyDesc;
	}
	public void setCurrencyDesc(String currencyDesc) {
		this.currencyDesc = currencyDesc;
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
		return "Currency [currencyCd="+ currencyCd +", currencyAbbr="+ currencyAbbr +", currencyWord="
				+ currencyWord + ", currencyRt=" + currencyRt + ", currencyDesc=" + currencyDesc + ", createUser="
				+ createUser +", createDate="+ createDate +", updateUser="+ updateUser +", updateDate="
				+ updateDate +"]";
	}
}
