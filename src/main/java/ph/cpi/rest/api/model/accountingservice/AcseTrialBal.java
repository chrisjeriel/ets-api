package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcseTrialBal {
	private String extractId;
	private String glAcctId;
	private String acctCode;
	private String acctName;
	private String currCd;
	private String slTypeCd;
	private String slTypeName;
	private String slCd;
	private String slName;
	private BigDecimal totalCredit;
	private BigDecimal totalDebit;
	private DateTime periodFrom;
	private DateTime periodTo;
	private String extractUser;
	private DateTime extractDate;
	private String currCdParam;
	private String type;
	@Override
	public String toString() {
		return "AcseTrialBal [extractId=" + extractId + ", glAcctId=" + glAcctId + ", acctCode=" + acctCode
				+ ", acctName=" + acctName + ", currCd=" + currCd + ", slTypeCd=" + slTypeCd + ", slTypeName="
				+ slTypeName + ", slCd=" + slCd + ", slName=" + slName + ", totalCredit=" + totalCredit
				+ ", totalDebit=" + totalDebit + ", periodFrom=" + periodFrom + ", periodTo=" + periodTo
				+ ", extractUser=" + extractUser + ", extractDate=" + extractDate + ", currCdParam=" + currCdParam
				+ ", type=" + type + "]";
	}
	public String getExtractId() {
		return extractId;
	}
	public void setExtractId(String extractId) {
		this.extractId = extractId;
	}
	public String getGlAcctId() {
		return glAcctId;
	}
	public void setGlAcctId(String glAcctId) {
		this.glAcctId = glAcctId;
	}
	public String getAcctCode() {
		return acctCode;
	}
	public void setAcctCode(String acctCode) {
		this.acctCode = acctCode;
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public String getSlTypeCd() {
		return slTypeCd;
	}
	public void setSlTypeCd(String slTypeCd) {
		this.slTypeCd = slTypeCd;
	}
	public String getSlTypeName() {
		return slTypeName;
	}
	public void setSlTypeName(String slTypeName) {
		this.slTypeName = slTypeName;
	}
	public String getSlCd() {
		return slCd;
	}
	public void setSlCd(String slCd) {
		this.slCd = slCd;
	}
	public String getSlName() {
		return slName;
	}
	public void setSlName(String slName) {
		this.slName = slName;
	}
	public BigDecimal getTotalCredit() {
		return totalCredit;
	}
	public void setTotalCredit(BigDecimal totalCredit) {
		this.totalCredit = totalCredit;
	}
	public BigDecimal getTotalDebit() {
		return totalDebit;
	}
	public void setTotalDebit(BigDecimal totalDebit) {
		this.totalDebit = totalDebit;
	}
	public DateTime getPeriodFrom() {
		return periodFrom;
	}
	public void setPeriodFrom(DateTime periodFrom) {
		this.periodFrom = periodFrom;
	}
	public DateTime getPeriodTo() {
		return periodTo;
	}
	public void setPeriodTo(DateTime periodTo) {
		this.periodTo = periodTo;
	}
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public DateTime getExtractDate() {
		return extractDate;
	}
	public void setExtractDate(DateTime extractDate) {
		this.extractDate = extractDate;
	}
	public String getCurrCdParam() {
		return currCdParam;
	}
	public void setCurrCdParam(String currCdParam) {
		this.currCdParam = currCdParam;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
