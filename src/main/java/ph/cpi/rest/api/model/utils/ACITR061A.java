package ph.cpi.rest.api.model.utils;

public class ACITR061A {
	private String shortCode;
	private String glAcctId;
	private String shortDesc;
	private String creditAmt;
	private String debitAmt;
	private String tranClass;
	private String paytMode;
	private String paytModeDesc;
	private String tranTypeCd;
	private String tranTypeName;
	private String fromDate;
	private String toDate;
	private String printedBy;
	private String incClosedTran;
	private String incCancelTran;
	private String tranpostDate;
	private String tranpostDateDesc;
	public String getShortCode() {
		return shortCode;
	}
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}
	public String getGlAcctId() {
		return glAcctId;
	}
	public void setGlAcctId(String glAcctId) {
		this.glAcctId = glAcctId;
	}
	public String getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	public String getCreditAmt() {
		return creditAmt;
	}
	public void setCreditAmt(String creditAmt) {
		this.creditAmt = creditAmt;
	}
	public String getDebitAmt() {
		return debitAmt;
	}
	public void setDebitAmt(String debitAmt) {
		this.debitAmt = debitAmt;
	}
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	public String getPaytMode() {
		return paytMode;
	}
	public void setPaytMode(String paytMode) {
		this.paytMode = paytMode;
	}
	public String getPaytModeDesc() {
		return paytModeDesc;
	}
	public void setPaytModeDesc(String paytModeDesc) {
		this.paytModeDesc = paytModeDesc;
	}
	public String getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(String tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getTranTypeName() {
		return tranTypeName;
	}
	public void setTranTypeName(String tranTypeName) {
		this.tranTypeName = tranTypeName;
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
	public String getPrintedBy() {
		return printedBy;
	}
	public void setPrintedBy(String printedBy) {
		this.printedBy = printedBy;
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
	public String getTranpostDateDesc() {
		return tranpostDateDesc;
	}
	public void setTranpostDateDesc(String tranpostDateDesc) {
		this.tranpostDateDesc = tranpostDateDesc;
	}
	@Override
	public String toString() {
		return "ACITR061A [shortCode=" + shortCode + ", glAcctId=" + glAcctId + ", shortDesc=" + shortDesc
				+ ", creditAmt=" + creditAmt + ", debitAmt=" + debitAmt + ", tranClass=" + tranClass + ", paytMode="
				+ paytMode + ", paytModeDesc=" + paytModeDesc + ", tranTypeCd=" + tranTypeCd + ", tranTypeName="
				+ tranTypeName + ", fromDate=" + fromDate + ", toDate=" + toDate + ", printedBy=" + printedBy
				+ ", incClosedTran=" + incClosedTran + ", incCancelTran=" + incCancelTran + ", tranpostDate="
				+ tranpostDate + ", tranpostDateDesc=" + tranpostDateDesc + "]";
	}
}
