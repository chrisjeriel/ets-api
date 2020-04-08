package ph.cpi.rest.api.model.utils;

public class POLR044D {
	private String extractUser;
	private String extractDate;
	private String dateParam;
	private String dateRange;
	private String toDate;
	private String lineCd;
	private String currencyCd;
	private String sortSeq;
	private String mmPolcountPrev;
	private String mmPolcountCur;
	private String ytdPolcountPrev;
	private String ytdPolcountCur;
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
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getSortSeq() {
		return sortSeq;
	}
	public void setSortSeq(String sortSeq) {
		this.sortSeq = sortSeq;
	}
	public String getMmPolcountPrev() {
		return mmPolcountPrev;
	}
	public void setMmPolcountPrev(String mmPolcountPrev) {
		this.mmPolcountPrev = mmPolcountPrev;
	}
	public String getMmPolcountCur() {
		return mmPolcountCur;
	}
	public void setMmPolcountCur(String mmPolcountCur) {
		this.mmPolcountCur = mmPolcountCur;
	}
	public String getYtdPolcountPrev() {
		return ytdPolcountPrev;
	}
	public void setYtdPolcountPrev(String ytdPolcountPrev) {
		this.ytdPolcountPrev = ytdPolcountPrev;
	}
	public String getYtdPolcountCur() {
		return ytdPolcountCur;
	}
	public void setYtdPolcountCur(String ytdPolcountCur) {
		this.ytdPolcountCur = ytdPolcountCur;
	}
	@Override
	public String toString() {
		return "POLR044D [extractUser=" + extractUser + ", extractDate=" + extractDate + ", dateParam=" + dateParam
				+ ", dateRange=" + dateRange + ", toDate=" + toDate + ", lineCd=" + lineCd + ", currencyCd="
				+ currencyCd + ", sortSeq=" + sortSeq + ", mmPolcountPrev=" + mmPolcountPrev + ", mmPolcountCur="
				+ mmPolcountCur + ", ytdPolcountPrev=" + ytdPolcountPrev + ", ytdPolcountCur=" + ytdPolcountCur + "]";
	}
}
