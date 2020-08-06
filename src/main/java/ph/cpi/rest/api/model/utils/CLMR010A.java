package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class CLMR010A {
	private String extractUser;
	private String extractDate;
	private String currencyCd;
	private String lineCd;
	private Integer claimId;
	private String claimNo;
	private String cedingId;
	private String cedingName;
	private String insuredDesc;
	private BigDecimal insuredClm;
	private String distDate;
	private String lossDate;
	private String lossCd;
	private String lossAbbr;
	private String lossDtl;
	private BigDecimal intlResAmt;
	private BigDecimal osAmt;
	private String dateFrom;
	private String dateTo;
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
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public String getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
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
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public BigDecimal getInsuredClm() {
		return insuredClm;
	}
	public void setInsuredClm(BigDecimal insuredClm) {
		this.insuredClm = insuredClm;
	}
	public String getDistDate() {
		return distDate;
	}
	public void setDistDate(String distDate) {
		this.distDate = distDate;
	}
	public String getLossDate() {
		return lossDate;
	}
	public void setLossDate(String lossDate) {
		this.lossDate = lossDate;
	}
	public String getLossCd() {
		return lossCd;
	}
	public void setLossCd(String lossCd) {
		this.lossCd = lossCd;
	}
	public String getLossAbbr() {
		return lossAbbr;
	}
	public void setLossAbbr(String lossAbbr) {
		this.lossAbbr = lossAbbr;
	}
	public String getLossDtl() {
		return lossDtl;
	}
	public void setLossDtl(String lossDtl) {
		this.lossDtl = lossDtl;
	}
	public BigDecimal getIntlResAmt() {
		return intlResAmt;
	}
	public void setIntlResAmt(BigDecimal intlResAmt) {
		this.intlResAmt = intlResAmt;
	}
	public BigDecimal getOsAmt() {
		return osAmt;
	}
	public void setOsAmt(BigDecimal osAmt) {
		this.osAmt = osAmt;
	}
	public String getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}
	public String getDateTo() {
		return dateTo;
	}
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	@Override
	public String toString() {
		return "CLMR010A [extractUser=" + extractUser + ", extractDate=" + extractDate + ", currencyCd=" + currencyCd
				+ ", lineCd=" + lineCd + ", claimId=" + claimId + ", claimNo=" + claimNo + ", cedingId=" + cedingId
				+ ", cedingName=" + cedingName + ", insuredDesc=" + insuredDesc + ", insuredClm=" + insuredClm
				+ ", distDate=" + distDate + ", lossDate=" + lossDate + ", lossCd=" + lossCd + ", lossAbbr=" + lossAbbr
				+ ", lossDtl=" + lossDtl + ", intlResAmt=" + intlResAmt + ", osAmt=" + osAmt + ", dateFrom=" + dateFrom
				+ ", dateTo=" + dateTo + "]";
	}
}
