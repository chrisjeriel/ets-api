package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnCurrencyRtRequest {
	
	private List<MtnCurrencyRt> delCurrencyRt;
	private List<MtnCurrencyRt> saveCurrencyRt;
	
	
	public List<MtnCurrencyRt> getDelCurrencyRt() {
		return delCurrencyRt;
	}

	public void setDelCurrencyRt(List<MtnCurrencyRt> delCurrencyRt) {
		this.delCurrencyRt = delCurrencyRt;
	}

	public List<MtnCurrencyRt> getSaveCurrencyRt() {
		return saveCurrencyRt;
	}

	public void setSaveCurrencyRt(List<MtnCurrencyRt> saveCurrencyRt) {
		this.saveCurrencyRt = saveCurrencyRt;
	}

	@Override
	public String toString() {
		return "SaveMtnCurrencyRtRequest [delCurrencyRt=" + delCurrencyRt + ", saveCurrencyRt=" + saveCurrencyRt + "]";
	}

	
	
}
@Alias ("MtnSaveCurrRt")
class MtnCurrencyRt {
	private String currencyCd;
	private Integer histNo;
	private BigDecimal currencyRt;
	private String effDateFrom;
	private String effDateTo;
	private String activeTag;
	private String remarks;
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
	public Integer getHistNo() {
		return histNo;
	}
	public void setHistNo(Integer histNo) {
		this.histNo = histNo;
	}
	public BigDecimal getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(BigDecimal currencyRt) {
		this.currencyRt = currencyRt;
	}
	public String getEffDateFrom() {
		return effDateFrom;
	}
	public void setEffDateFrom(String effDateFrom) {
		this.effDateFrom = effDateFrom;
	}
	public String getEffDateTo() {
		return effDateTo;
	}
	public void setEffDateTo(String effDateTo) {
		this.effDateTo = effDateTo;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
		return "SaveMtnCurrencyRtRequest [currencyCd=" + currencyCd + ", histNo=" + histNo + ", currencyRt=" + currencyRt
				+ ", effDateFrom=" + effDateFrom + ", effDateTo=" + effDateTo + ", activeTag=" + activeTag
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
}