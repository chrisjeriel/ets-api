package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class POLR044G {
	private String extractUser;
	private String fromDate;
	private String toDate;
	private String lineCd;
	private BigDecimal renThisMmQty;
	private String renThisMmPrem;
	private BigDecimal renCumuQty;
	private String renCumuPrem;
	private BigDecimal newThisMmQty;
	private String newThisMmPrem;
	private BigDecimal newCumuQty;
	private String newCumuPrem;
	private String currencyCd;
	private BigDecimal totThisMmQty;
	private String totThisMmPrem;
	private BigDecimal totCumuQty;
	private String totCumuPrem;
	private String renewTag;
	
	public String getExtractUser() {
		return extractUser;
	}

	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getLineCd() {
		return lineCd;
	}

	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}

	public BigDecimal getRenThisMmQty() {
		return renThisMmQty;
	}

	public void setRenThisMmQty(BigDecimal renThisMmQty) {
		this.renThisMmQty = renThisMmQty;
	}

	public String getRenThisMmPrem() {
		return renThisMmPrem;
	}

	public void setRenThisMmPrem(String renThisMmPrem) {
		this.renThisMmPrem = renThisMmPrem;
	}

	public BigDecimal getRenCumuQty() {
		return renCumuQty;
	}

	public void setRenCumuQty(BigDecimal renCumuQty) {
		this.renCumuQty = renCumuQty;
	}

	public String getRenCumuPrem() {
		return renCumuPrem;
	}

	public void setRenCumuPrem(String renCumuPrem) {
		this.renCumuPrem = renCumuPrem;
	}

	public BigDecimal getNewThisMmQty() {
		return newThisMmQty;
	}

	public void setNewThisMmQty(BigDecimal newThisMmQty) {
		this.newThisMmQty = newThisMmQty;
	}

	public String getNewThisMmPrem() {
		return newThisMmPrem;
	}

	public void setNewThisMmPrem(String newThisMmPrem) {
		this.newThisMmPrem = newThisMmPrem;
	}

	public BigDecimal getNewCumuQty() {
		return newCumuQty;
	}

	public void setNewCumuQty(BigDecimal newCumuQty) {
		this.newCumuQty = newCumuQty;
	}

	public String getNewCumuPrem() {
		return newCumuPrem;
	}

	public void setNewCumuPrem(String newCumuPrem) {
		this.newCumuPrem = newCumuPrem;
	}

	public BigDecimal getTotThisMmQty() {
		return totThisMmQty;
	}

	public void setTotThisMmQty(BigDecimal totThisMmQty) {
		this.totThisMmQty = totThisMmQty;
	}

	public String getTotThisMmPrem() {
		return totThisMmPrem;
	}

	public void setTotThisMmPrem(String totThisMmPrem) {
		this.totThisMmPrem = totThisMmPrem;
	}

	public BigDecimal getTotCumuQty() {
		return totCumuQty;
	}

	public void setTotCumuQty(BigDecimal totCumuQty) {
		this.totCumuQty = totCumuQty;
	}

	public String getTotCumuPrem() {
		return totCumuPrem;
	}

	public void setTotCumuPrem(String totCumuPrem) {
		this.totCumuPrem = totCumuPrem;
	}

	public String getRenewTag() {
		return renewTag;
	}

	public void setRenewTag(String renewTag) {
		this.renewTag = renewTag;
	}

	public String getCurrencyCd() {
		return currencyCd;
	}

	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}

	@Override
	public String toString() {
		return "POLR044G [extractUser=" + extractUser + ", fromDate=" + fromDate + ", toDate=" + toDate + ", lineCd="
				+ lineCd + ", renThisMmQty=" + renThisMmQty + ", renThisMmPrem=" + renThisMmPrem + ", renCumuQty="
				+ renCumuQty + ", renCumuPrem=" + renCumuPrem + ", newThisMmQty=" + newThisMmQty + ", newThisMmPrem="
				+ newThisMmPrem + ", newCumuQty=" + newCumuQty + ", newCumuPrem=" + newCumuPrem + ", currencyCd="
				+ currencyCd + ", totThisMmQty=" + totThisMmQty + ", totThisMmPrem=" + totThisMmPrem + ", totCumuQty="
				+ totCumuQty + ", totCumuPrem=" + totCumuPrem + ", renewTag=" + renewTag + "]";
	}
}
