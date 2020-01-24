package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class Currency {
	private String currencyCd;
	//private String currencyAbbr;
	private String currencyWord;
	private Double currencyRt;
	private String currencyDesc;
	private DateTime effDateFrom;
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
	/*public String getCurrencyAbbr() {
		return currencyAbbr;
	}
	public void setCurrencyAbbr(String currencyAbbr) {
		this.currencyAbbr = currencyAbbr;
	}*/
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
	public DateTime getEffDateFrom() {
		return effDateFrom;
	}
	public void setEffDateFrom(DateTime effDateFrom) {
		this.effDateFrom = effDateFrom;
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
		return "Currency [currencyCd=" + currencyCd + ", currencyWord=" + currencyWord + ", currencyRt=" + currencyRt
				+ ", currencyDesc=" + currencyDesc + ", effDateFrom=" + effDateFrom + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
