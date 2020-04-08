package ph.cpi.rest.api.model.utils;

public class CLMR010K {
	private String extractUser;
	private String extractDate;
	private String currencyCd;
	private String cedingId;
	private String cedingIdName;
	private String ret1ClmAmt;
	private String ret2ClmAmt;
	private String total;
	private String osPaidTag;
	private String extTypeTag;
	private String dateParam;
	private String dateRange;
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
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingIdName() {
		return cedingIdName;
	}
	public void setCedingIdName(String cedingIdName) {
		this.cedingIdName = cedingIdName;
	}
	public String getRet1ClmAmt() {
		return ret1ClmAmt;
	}
	public void setRet1ClmAmt(String ret1ClmAmt) {
		this.ret1ClmAmt = ret1ClmAmt;
	}
	public String getRet2ClmAmt() {
		return ret2ClmAmt;
	}
	public void setRet2ClmAmt(String ret2ClmAmt) {
		this.ret2ClmAmt = ret2ClmAmt;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getOsPaidTag() {
		return osPaidTag;
	}
	public void setOsPaidTag(String osPaidTag) {
		this.osPaidTag = osPaidTag;
	}
	public String getExtTypeTag() {
		return extTypeTag;
	}
	public void setExtTypeTag(String extTypeTag) {
		this.extTypeTag = extTypeTag;
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
		return "CLMR010K [extractUser=" + extractUser + ", extractDate=" + extractDate + ", currencyCd=" + currencyCd
				+ ", cedingId=" + cedingId + ", cedingIdName=" + cedingIdName + ", ret1ClmAmt=" + ret1ClmAmt
				+ ", ret2ClmAmt=" + ret2ClmAmt + ", total=" + total + ", osPaidTag=" + osPaidTag + ", extTypeTag="
				+ extTypeTag + ", dateParam=" + dateParam + ", dateRange=" + dateRange + ", dateFrom=" + dateFrom
				+ ", dateTo=" + dateTo + "]";
	}
}
