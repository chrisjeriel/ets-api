package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class ACSER008_CSV {
	private Integer extractId;
	private Integer glAcctId;
	private String acctCode;
	private String acctName;
	private String currCd;
	private Integer slTypeCd;
	private String slTypeName;
	private Integer slCd;
	private String slName;
	private BigDecimal totalCredit;
	private BigDecimal totalDebit;
	private String periodFrom;
	private String periodTo;
	private String extractUser;
	private String extractDate;
	private String currCdParam;
	private String extType;
	public Integer getExtractId() {
		return extractId;
	}
	public void setExtractId(Integer extractId) {
		this.extractId = extractId;
	}
	public Integer getGlAcctId() {
		return glAcctId;
	}
	public void setGlAcctId(Integer glAcctId) {
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
	public Integer getSlTypeCd() {
		return slTypeCd;
	}
	public void setSlTypeCd(Integer slTypeCd) {
		this.slTypeCd = slTypeCd;
	}
	public String getSlTypeName() {
		return slTypeName;
	}
	public void setSlTypeName(String slTypeName) {
		this.slTypeName = slTypeName;
	}
	public Integer getSlCd() {
		return slCd;
	}
	public void setSlCd(Integer slCd) {
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
	public String getPeriodFrom() {
		return periodFrom;
	}
	public void setPeriodFrom(String periodFrom) {
		this.periodFrom = periodFrom;
	}
	public String getPeriodTo() {
		return periodTo;
	}
	public void setPeriodTo(String periodTo) {
		this.periodTo = periodTo;
	}
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public String getExtractDate() {
		return extractDate;
	}
	public void setExtractDate(String extractDate) {
		this.extractDate = extractDate;
	}
	public String getCurrCdParam() {
		return currCdParam;
	}
	public void setCurrCdParam(String currCdParam) {
		this.currCdParam = currCdParam;
	}
	public String getExtType() {
		return extType;
	}
	public void setExtType(String extType) {
		this.extType = extType;
	}
	@Override
	public String toString() {
		return "ACSER008_CSV [extractId=" + extractId + ", glAcctId=" + glAcctId + ", acctCode=" + acctCode
				+ ", acctName=" + acctName + ", currCd=" + currCd + ", slTypeCd=" + slTypeCd + ", slTypeName="
				+ slTypeName + ", slCd=" + slCd + ", slName=" + slName + ", totalCredit=" + totalCredit
				+ ", totalDebit=" + totalDebit + ", periodFrom=" + periodFrom + ", periodTo=" + periodTo
				+ ", extractUser=" + extractUser + ", extractDate=" + extractDate + ", currCdParam=" + currCdParam
				+ ", extType=" + extType + "]";
	}
}
