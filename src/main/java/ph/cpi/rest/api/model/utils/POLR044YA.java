package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class POLR044YA {
	private String extractUser;
	private String paramDate;
	private String paramCurrency;
	private String paramCedingId;
	private String cedingId;
	private String cedingName;
	private String currency;
	private Integer policyId;
	private Integer instNo;
	private String policyNo;
	private String policyRef;
	private Integer prinId;
	private Integer contractorId;
	private String insured;
	private BigDecimal premium;
	private BigDecimal commission;
	private BigDecimal vatOnComm;
	private BigDecimal netDue;
	private String dueDate;
	private String bookingDate;
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public String getParamDate() {
		return paramDate;
	}
	public void setParamDate(String paramDate) {
		this.paramDate = paramDate;
	}
	public String getParamCurrency() {
		return paramCurrency;
	}
	public void setParamCurrency(String paramCurrency) {
		this.paramCurrency = paramCurrency;
	}
	public String getParamCedingId() {
		return paramCedingId;
	}
	public void setParamCedingId(String paramCedingId) {
		this.paramCedingId = paramCedingId;
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
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public Integer getInstNo() {
		return instNo;
	}
	public void setInstNo(Integer instNo) {
		this.instNo = instNo;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyRef() {
		return policyRef;
	}
	public void setPolicyRef(String policyRef) {
		this.policyRef = policyRef;
	}
	public Integer getPrinId() {
		return prinId;
	}
	public void setPrinId(Integer prinId) {
		this.prinId = prinId;
	}
	public Integer getContractorId() {
		return contractorId;
	}
	public void setContractorId(Integer contractorId) {
		this.contractorId = contractorId;
	}
	public String getInsured() {
		return insured;
	}
	public void setInsured(String insured) {
		this.insured = insured;
	}
	public BigDecimal getPremium() {
		return premium;
	}
	public void setPremium(BigDecimal premium) {
		this.premium = premium;
	}
	public BigDecimal getCommission() {
		return commission;
	}
	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}
	public BigDecimal getVatOnComm() {
		return vatOnComm;
	}
	public void setVatOnComm(BigDecimal vatOnComm) {
		this.vatOnComm = vatOnComm;
	}
	public BigDecimal getNetDue() {
		return netDue;
	}
	public void setNetDue(BigDecimal netDue) {
		this.netDue = netDue;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	@Override
	public String toString() {
		return "POLR044YA [extractUser=" + extractUser + ", paramDate=" + paramDate + ", paramCurrency=" + paramCurrency
				+ ", paramCedingId=" + paramCedingId + ", cedingId=" + cedingId + ", cedingName=" + cedingName
				+ ", currency=" + currency + ", policyId=" + policyId + ", instNo=" + instNo + ", policyNo=" + policyNo
				+ ", policyRef=" + policyRef + ", prinId=" + prinId + ", contractorId=" + contractorId + ", insured="
				+ insured + ", premium=" + premium + ", commission=" + commission + ", vatOnComm=" + vatOnComm
				+ ", netDue=" + netDue + ", dueDate=" + dueDate + ", bookingDate=" + bookingDate + "]";
	}
}
