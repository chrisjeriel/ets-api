package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class CLMR010D {
	private String extractUser;
	private String extractDate;
	private Integer claimId;
	private String claimNo;
	private String histCategory;
	private String histCatDesc;
	private String lossDate;
	private Integer adjId;
	private String adjName;
	private String cedingId;
	private String cedingName;
	private Integer policyId;
	private String policyNo;
	private String coRefNo;
	private String currencyCd;
	private String insuredDesc;
	private BigDecimal insuredClm;
	private String lossCd;
	private String lossAbbr;
	private BigDecimal totalResAmt;
	private Integer treatyId;
	private String treatyName;
	private String trtyCedId;
	private String treatyCompany;
	private BigDecimal distributionShare;
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
	public String getHistCategory() {
		return histCategory;
	}
	public void setHistCategory(String histCategory) {
		this.histCategory = histCategory;
	}
	public String getHistCatDesc() {
		return histCatDesc;
	}
	public void setHistCatDesc(String histCatDesc) {
		this.histCatDesc = histCatDesc;
	}
	public String getLossDate() {
		return lossDate;
	}
	public void setLossDate(String lossDate) {
		this.lossDate = lossDate;
	}
	public Integer getAdjId() {
		return adjId;
	}
	public void setAdjId(Integer adjId) {
		this.adjId = adjId;
	}
	public String getAdjName() {
		return adjName;
	}
	public void setAdjName(String adjName) {
		this.adjName = adjName;
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
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getCoRefNo() {
		return coRefNo;
	}
	public void setCoRefNo(String coRefNo) {
		this.coRefNo = coRefNo;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
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
	public BigDecimal getTotalResAmt() {
		return totalResAmt;
	}
	public void setTotalResAmt(BigDecimal totalResAmt) {
		this.totalResAmt = totalResAmt;
	}
	public Integer getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(Integer treatyId) {
		this.treatyId = treatyId;
	}
	public String getTreatyName() {
		return treatyName;
	}
	public void setTreatyName(String treatyName) {
		this.treatyName = treatyName;
	}
	public String getTrtyCedId() {
		return trtyCedId;
	}
	public void setTrtyCedId(String trtyCedId) {
		this.trtyCedId = trtyCedId;
	}
	public String getTreatyCompany() {
		return treatyCompany;
	}
	public void setTreatyCompany(String treatyCompany) {
		this.treatyCompany = treatyCompany;
	}
	public BigDecimal getDistributionShare() {
		return distributionShare;
	}
	public void setDistributionShare(BigDecimal distributionShare) {
		this.distributionShare = distributionShare;
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
		return "CLMR010D [extractUser=" + extractUser + ", extractDate=" + extractDate + ", claimId=" + claimId
				+ ", claimNo=" + claimNo + ", histCategory=" + histCategory + ", histCatDesc=" + histCatDesc
				+ ", lossDate=" + lossDate + ", adjId=" + adjId + ", adjName=" + adjName + ", cedingId=" + cedingId
				+ ", cedingName=" + cedingName + ", policyId=" + policyId + ", policyNo=" + policyNo + ", coRefNo="
				+ coRefNo + ", currencyCd=" + currencyCd + ", insuredDesc=" + insuredDesc + ", insuredClm=" + insuredClm
				+ ", lossCd=" + lossCd + ", lossAbbr=" + lossAbbr + ", totalResAmt=" + totalResAmt + ", treatyId="
				+ treatyId + ", treatyName=" + treatyName + ", trtyCedId=" + trtyCedId + ", treatyCompany="
				+ treatyCompany + ", distributionShare=" + distributionShare + ", dateFrom=" + dateFrom + ", dateTo="
				+ dateTo + "]";
	}
}
