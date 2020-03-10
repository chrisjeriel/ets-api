package ph.cpi.rest.api.model.utils;

public class POLR044E {
	private String extractUser;
	private String fromDate;
	private String toDate;
	private String currCdParam;
	private String lineCdParam;
	private String siRange;
	private String amtMth;
	private String amtCum;
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
	public String getCurrCdParam() {
		return currCdParam;
	}
	public void setCurrCdParam(String currCdParam) {
		this.currCdParam = currCdParam;
	}
	public String getLineCdParam() {
		return lineCdParam;
	}
	public void setLineCdParam(String lineCdParam) {
		this.lineCdParam = lineCdParam;
	}
	public String getSiRange() {
		return siRange;
	}
	public void setSiRange(String siRange) {
		this.siRange = siRange;
	}
	public String getAmtMth() {
		return amtMth;
	}
	public void setAmtMth(String amtMth) {
		this.amtMth = amtMth;
	}
	public String getAmtCum() {
		return amtCum;
	}
	public void setAmtCum(String amtCum) {
		this.amtCum = amtCum;
	}
	@Override
	public String toString() {
		return "POLR044E [extractUser=" + extractUser + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", currCdParam=" + currCdParam + ", lineCdParam=" + lineCdParam + ", siRange=" + siRange + ", amtMth="
				+ amtMth + ", amtCum=" + amtCum + "]";
	}
}
