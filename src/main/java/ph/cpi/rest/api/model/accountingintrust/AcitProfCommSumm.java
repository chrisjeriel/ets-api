package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitProfCommSumm {
	
	private Integer profCommId;
	private String cedingId;
	private String cedingName;
	private String cedingAbbr;
	private String month;
	private String year;
	private BigDecimal profitLossAmt;
	private BigDecimal totIncome;
	private BigDecimal totOutgo;
	private BigDecimal lossCarry;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public Integer getProfCommId() {
		return profCommId;
	}
	public void setProfCommId(Integer profCommId) {
		this.profCommId = profCommId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getCedingAbbr() {
		return cedingAbbr;
	}
	public void setCedingAbbr(String cedingAbbr) {
		this.cedingAbbr = cedingAbbr;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public BigDecimal getProfitLossAmt() {
		return profitLossAmt;
	}
	public void setProfitLossAmt(BigDecimal profitLossAmt) {
		this.profitLossAmt = profitLossAmt;
	}
	public BigDecimal getTotIncome() {
		return totIncome;
	}
	public void setTotIncome(BigDecimal totIncome) {
		this.totIncome = totIncome;
	}
	public BigDecimal getTotOutgo() {
		return totOutgo;
	}
	public void setTotOutgo(BigDecimal totOutgo) {
		this.totOutgo = totOutgo;
	}
	public BigDecimal getLossCarry() {
		return lossCarry;
	}
	public void setLossCarry(BigDecimal lossCarry) {
		this.lossCarry = lossCarry;
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
		return "AcitProfCommSumm [profCommId=" + profCommId + ", cedingId=" + cedingId + ", cedingName=" + cedingName
				+ ", cedingAbbr=" + cedingAbbr + ", month=" + month + ", year=" + year + ", profitLossAmt="
				+ profitLossAmt + ", totIncome=" + totIncome + ", totOutgo=" + totOutgo + ", lossCarry=" + lossCarry
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}

}