package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class POLR044U {
	private String extractUser;
	private String extractDate;
	private Integer uwYear;
	private String transactDate;
	private String currencyCd;
	private Integer treatyId;
	private String treatyName;
	private Integer retLayer;
	private String retLayerDesc;
	private String trtyCedId;
	private String trtyCedName;
	private BigDecimal premAmt;
	private BigDecimal commAmt;
	private BigDecimal riCommVat;
	private BigDecimal lossAmt;
	private BigDecimal paidLoss;
	private BigDecimal incurredLoss;
	private BigDecimal lossRatio;
	private String fromDate;
	private String toDate;
	private String lineCdParam;
	private String cedingIdParam;
	private String dateParam;
	private String dateRange;
	private String incRecTag;
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
	public Integer getUwYear() {
		return uwYear;
	}
	public void setUwYear(Integer uwYear) {
		this.uwYear = uwYear;
	}
	public String getTransactDate() {
		return transactDate;
	}
	public void setTransactDate(String transactDate) {
		this.transactDate = transactDate;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
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
	public Integer getRetLayer() {
		return retLayer;
	}
	public void setRetLayer(Integer retLayer) {
		this.retLayer = retLayer;
	}
	public String getRetLayerDesc() {
		return retLayerDesc;
	}
	public void setRetLayerDesc(String retLayerDesc) {
		this.retLayerDesc = retLayerDesc;
	}
	public String getTrtyCedId() {
		return trtyCedId;
	}
	public void setTrtyCedId(String trtyCedId) {
		this.trtyCedId = trtyCedId;
	}
	public String getTrtyCedName() {
		return trtyCedName;
	}
	public void setTrtyCedName(String trtyCedName) {
		this.trtyCedName = trtyCedName;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}
	public BigDecimal getCommAmt() {
		return commAmt;
	}
	public void setCommAmt(BigDecimal commAmt) {
		this.commAmt = commAmt;
	}
	public BigDecimal getRiCommVat() {
		return riCommVat;
	}
	public void setRiCommVat(BigDecimal riCommVat) {
		this.riCommVat = riCommVat;
	}
	public BigDecimal getLossAmt() {
		return lossAmt;
	}
	public void setLossAmt(BigDecimal lossAmt) {
		this.lossAmt = lossAmt;
	}
	public BigDecimal getPaidLoss() {
		return paidLoss;
	}
	public void setPaidLoss(BigDecimal paidLoss) {
		this.paidLoss = paidLoss;
	}
	public BigDecimal getIncurredLoss() {
		return incurredLoss;
	}
	public void setIncurredLoss(BigDecimal incurredLoss) {
		this.incurredLoss = incurredLoss;
	}
	public BigDecimal getLossRatio() {
		return lossRatio;
	}
	public void setLossRatio(BigDecimal lossRatio) {
		this.lossRatio = lossRatio;
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
	public String getLineCdParam() {
		return lineCdParam;
	}
	public void setLineCdParam(String lineCdParam) {
		this.lineCdParam = lineCdParam;
	}
	public String getCedingIdParam() {
		return cedingIdParam;
	}
	public void setCedingIdParam(String cedingIdParam) {
		this.cedingIdParam = cedingIdParam;
	}
	public String getDateParam() {
		return dateParam;
	}
	public void setDateParam(String dateParam) {
		this.dateParam = dateParam;
	}
	public String getDateRange() {
		return dateRange;
	}
	public void setDateRange(String dateRange) {
		this.dateRange = dateRange;
	}
	public String getIncRecTag() {
		return incRecTag;
	}
	public void setIncRecTag(String incRecTag) {
		this.incRecTag = incRecTag;
	}
	@Override
	public String toString() {
		return "POLR044U [extractUser=" + extractUser + ", extractDate=" + extractDate + ", uwYear=" + uwYear
				+ ", transactDate=" + transactDate + ", currencyCd=" + currencyCd + ", treatyId=" + treatyId
				+ ", treatyName=" + treatyName + ", retLayer=" + retLayer + ", retLayerDesc=" + retLayerDesc
				+ ", trtyCedId=" + trtyCedId + ", trtyCedName=" + trtyCedName + ", premAmt=" + premAmt + ", commAmt="
				+ commAmt + ", riCommVat=" + riCommVat + ", lossAmt=" + lossAmt + ", paidLoss=" + paidLoss
				+ ", incurredLoss=" + incurredLoss + ", lossRatio=" + lossRatio + ", fromDate=" + fromDate + ", toDate="
				+ toDate + ", lineCdParam=" + lineCdParam + ", cedingIdParam=" + cedingIdParam + ", dateParam="
				+ dateParam + ", dateRange=" + dateRange + ", incRecTag=" + incRecTag + "]";
	}
}
