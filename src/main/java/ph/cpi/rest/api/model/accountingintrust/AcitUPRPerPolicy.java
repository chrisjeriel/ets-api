package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitUPRPerPolicy {
	private String lineCd;
	private String policyNo;
	private DateTime effDate;
	private DateTime expiryDate;
	private Integer numeratorFactor;
	private Integer denominatorFactor;
	private BigDecimal premGross;
	private BigDecimal defPremGross;
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public DateTime getEffDate() {
		return effDate;
	}
	public void setEffDate(DateTime effDate) {
		this.effDate = effDate;
	}
	public DateTime getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(DateTime expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Integer getNumeratorFactor() {
		return numeratorFactor;
	}
	public void setNumeratorFactor(Integer numeratorFactor) {
		this.numeratorFactor = numeratorFactor;
	}
	public Integer getDenominatorFactor() {
		return denominatorFactor;
	}
	public void setDenominatorFactor(Integer denominatorFactor) {
		this.denominatorFactor = denominatorFactor;
	}
	public BigDecimal getPremGross() {
		return premGross;
	}
	public void setPremGross(BigDecimal premGross) {
		this.premGross = premGross;
	}
	public BigDecimal getDefPremGross() {
		return defPremGross;
	}
	public void setDefPremGross(BigDecimal defPremGross) {
		this.defPremGross = defPremGross;
	}
	@Override
	public String toString() {
		return "AcitUPRPerPolicy [lineCd=" + lineCd + ", policyNo=" + policyNo + ", effDate=" + effDate
				+ ", expiryDate=" + expiryDate + ", numeratorFactor=" + numeratorFactor + ", denominatorFactor="
				+ denominatorFactor + ", premGross=" + premGross + ", defPremGross=" + defPremGross + "]";
	}
}
