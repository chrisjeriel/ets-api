package ph.cpi.rest.api.model.request;

public class RetrieveExtractToCsvRequest {
	private String extractUser;
	private String reportName;
	private String prodDate;
	private String paramDate;
	private String paramCurrency;
	private String cedingId;
	
	private String paymentMode;
	private String paymentType;
	private String fromDate;
	private String toDate;
	private String incClosedTran;
	private String incCancelTran;
	private String tranpostDate;
	
	private String chkDate;
	private String bank;
	private String bankAcct;
	private String sortBy;
	

	public String getExtractUser() {
		return extractUser;
	}

	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getProdDate() {
		return prodDate;
	}

	public void setProdDate(String prodDate) {
		this.prodDate = prodDate;
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

	public String getCedingId() {
		return cedingId;
	}

	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
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

	public String getIncClosedTran() {
		return incClosedTran;
	}

	public void setIncClosedTran(String incClosedTran) {
		this.incClosedTran = incClosedTran;
	}

	public String getIncCancelTran() {
		return incCancelTran;
	}

	public void setIncCancelTran(String incCancelTran) {
		this.incCancelTran = incCancelTran;
	}

	public String getTranpostDate() {
		return tranpostDate;
	}

	public void setTranpostDate(String tranpostDate) {
		this.tranpostDate = tranpostDate;
	}

	public String getChkDate() {
		return chkDate;
	}

	public void setChkDate(String chkDate) {
		this.chkDate = chkDate;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBankAcct() {
		return bankAcct;
	}

	public void setBankAcct(String bankAcct) {
		this.bankAcct = bankAcct;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	@Override
	public String toString() {
		return "RetrieveExtractToCsvRequest [extractUser=" + extractUser + ", reportName=" + reportName + ", prodDate="
				+ prodDate + ", paramDate=" + paramDate + ", paramCurrency=" + paramCurrency + ", cedingId=" + cedingId
				+ ", paymentMode=" + paymentMode + ", paymentType=" + paymentType + ", fromDate=" + fromDate
				+ ", toDate=" + toDate + ", incClosedTran=" + incClosedTran + ", incCancelTran=" + incCancelTran
				+ ", tranpostDate=" + tranpostDate + ", chkDate=" + chkDate + ", bank=" + bank + ", bankAcct="
				+ bankAcct + ", sortBy=" + sortBy + "]";
	}
}
