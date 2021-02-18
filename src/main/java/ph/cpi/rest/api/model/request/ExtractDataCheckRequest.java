package ph.cpi.rest.api.model.request;

import java.util.List;

public class ExtractDataCheckRequest {

	private Integer bookingMonth;
	private Integer bookingYear;
	private String extractUser;
	private String force;
	private List<DataCheckScriptExt> dataCheckScriptList;
	
	public Integer getBookingMonth() {
		return bookingMonth;
	}
	public void setBookingMonth(Integer bookingMonth) {
		this.bookingMonth = bookingMonth;
	}
	public Integer getBookingYear() {
		return bookingYear;
	}
	public void setBookingYear(Integer bookingYear) {
		this.bookingYear = bookingYear;
	}
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public String getForce() {
		return force;
	}
	public void setForce(String force) {
		this.force = force;
	}
	public List<DataCheckScriptExt> getDataCheckScriptList() {
		return dataCheckScriptList;
	}
	public void setDataCheckScriptList(List<DataCheckScriptExt> dataCheckScriptList) {
		this.dataCheckScriptList = dataCheckScriptList;
	}
	@Override
	public String toString() {
		return "ExtractDataCheckRequest [bookingMonth=" + bookingMonth + ", bookingYear=" + bookingYear
				+ ", extractUser=" + extractUser + ", force=" + force + ", dataCheckScriptList=" + dataCheckScriptList
				+ "]";
	}
}

class DataCheckScriptExt {
	private Integer scriptNo;
	private String scriptTitle;
	private String scriptSoln;
	
	public Integer getScriptNo() {
		return scriptNo;
	}
	public void setScriptNo(Integer scriptNo) {
		this.scriptNo = scriptNo;
	}
	public String getScriptTitle() {
		return scriptTitle;
	}
	public void setScriptTitle(String scriptTitle) {
		this.scriptTitle = scriptTitle;
	}
	public String getScriptSoln() {
		return scriptSoln;
	}
	public void setScriptSoln(String scriptSoln) {
		this.scriptSoln = scriptSoln;
	}
	@Override
	public String toString() {
		return "DataCheckScript [scriptNo=" + scriptNo + ", scriptTitle=" + scriptTitle + ", scriptSoln=" + scriptSoln
				+ "]";
	}
}
