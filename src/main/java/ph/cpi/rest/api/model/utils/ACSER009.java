package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class ACSER009 {

	private String periodFrom;
	private String periodTo;
	private String forceExtract;
	private String extractUser;
	private String extractDate;
	private String reportId;
	private String reportName;
	private String taxType;
	
	private String tranId;
	private String tranNo;
	private String tranDate;
	private String tranStat;
	private String status;
	private String payeeClassCd;
	private String payeeCd;
	private String payeeName;
	private String bussTypeCd;
	private String bussTypeName;
	private String tin;
	private String mailAddress;
	private String baseAmt;
	private String taxAmt;
	private String taxCd;
	private String rate;
	private String paramFromDate;
	private String paramToDate;
	
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
	public String getForceExtract() {
		return forceExtract;
	}
	public void setForceExtract(String forceExtract) {
		this.forceExtract = forceExtract;
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
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getTranNo() {
		return tranNo;
	}
	public void setTranNo(String tranNo) {
		this.tranNo = tranNo;
	}
	public String getTranDate() {
		return tranDate;
	}
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	public String getTranStat() {
		return tranStat;
	}
	public void setTranStat(String tranStat) {
		this.tranStat = tranStat;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPayeeClassCd() {
		return payeeClassCd;
	}
	public void setPayeeClassCd(String payeeClassCd) {
		this.payeeClassCd = payeeClassCd;
	}
	public String getPayeeCd() {
		return payeeCd;
	}
	public void setPayeeCd(String payeeCd) {
		this.payeeCd = payeeCd;
	}
	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public String getBussTypeCd() {
		return bussTypeCd;
	}
	public void setBussTypeCd(String bussTypeCd) {
		this.bussTypeCd = bussTypeCd;
	}
	public String getBussTypeName() {
		return bussTypeName;
	}
	public void setBussTypeName(String bussTypeName) {
		this.bussTypeName = bussTypeName;
	}
	public String getTin() {
		return tin;
	}
	public void setTin(String tin) {
		this.tin = tin;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getBaseAmt() {
		return baseAmt;
	}
	public void setBaseAmt(String baseAmt) {
		this.baseAmt = baseAmt;
	}
	public String getTaxAmt() {
		return taxAmt;
	}
	public void setTaxAmt(String taxAmt) {
		this.taxAmt = taxAmt;
	}
	public String getTaxCd() {
		return taxCd;
	}
	public void setTaxCd(String taxCd) {
		this.taxCd = taxCd;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getParamFromDate() {
		return paramFromDate;
	}
	public void setParamFromDate(String paramFromDate) {
		this.paramFromDate = paramFromDate;
	}
	public String getParamToDate() {
		return paramToDate;
	}
	public void setParamToDate(String paramToDate) {
		this.paramToDate = paramToDate;
	}
	@Override
	public String toString() {
		return "ACSER009 [periodFrom=" + periodFrom + ", periodTo=" + periodTo + ", forceExtract=" + forceExtract
				+ ", extractUser=" + extractUser + ", extractDate=" + extractDate + ", reportId=" + reportId
				+ ", reportName=" + reportName + ", taxType=" + taxType + ", tranId=" + tranId + ", tranNo=" + tranNo
				+ ", tranDate=" + tranDate + ", tranStat=" + tranStat + ", status=" + status + ", payeeClassCd="
				+ payeeClassCd + ", payeeCd=" + payeeCd + ", payeeName=" + payeeName + ", bussTypeCd=" + bussTypeCd
				+ ", bussTypeName=" + bussTypeName + ", tin=" + tin + ", mailAddress=" + mailAddress + ", baseAmt="
				+ baseAmt + ", taxAmt=" + taxAmt + ", taxCd=" + taxCd + ", rate=" + rate + ", paramFromDate="
				+ paramFromDate + ", paramToDate=" + paramToDate + "]";
	}
}
