package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class POLR044D {
	private String extractUser;
	private String extractDate;
	private String dateParam;
	private String dateRange;
	private String toDate;
	private String lineCd;
	private String currencyCd;
	private String sortSeq;
	private BigDecimal mmPolcountPrev;
	private BigDecimal mmPolcountCur;
	private BigDecimal ytdPolcountPrev;
	private BigDecimal ytdPolcountCur;
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
	public BigDecimal getMmPolcountPrev() {
		return mmPolcountPrev;
	}
	public void setMmPolcountPrev(BigDecimal mmPolcountPrev) {
		this.mmPolcountPrev = mmPolcountPrev;
	}
	public BigDecimal getMmPolcountCur() {
		return mmPolcountCur;
	}
	public void setMmPolcountCur(BigDecimal mmPolcountCur) {
		this.mmPolcountCur = mmPolcountCur;
	}
	public BigDecimal getYtdPolcountPrev() {
		return ytdPolcountPrev;
	}
	public void setYtdPolcountPrev(BigDecimal ytdPolcountPrev) {
		this.ytdPolcountPrev = ytdPolcountPrev;
	}
	public BigDecimal getYtdPolcountCur() {
		return ytdPolcountCur;
	}
	public void setYtdPolcountCur(BigDecimal ytdPolcountCur) {
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
