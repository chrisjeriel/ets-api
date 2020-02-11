package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnBookingMthRequest {
	
	private List<bookingMth> saveBookingMth;
	
	public List<bookingMth> getSaveBookingMth() {
		return saveBookingMth;
	}

	public void setSaveBookingMth(List<bookingMth> saveBookingMth) {
		this.saveBookingMth = saveBookingMth;
	}
	
	@Override
	public String toString() {
		return "SaveMtnBookingMthRequest [saveBookingMth=" + saveBookingMth
				+ "]";
	}
}

class bookingMth{
	
	private String bookingMm;
	private String bookingYear;
	private String tempClosedTag;
	private String remarks;
	private String updateUser;
	private String updateDate;
	
	public String getBookingMm() {
		return bookingMm;
	}
	public void setBookingMm(String bookingMm) {
		this.bookingMm = bookingMm;
	}
	public String getBookingYear() {
		return bookingYear;
	}
	public void setBookingYear(String bookingYear) {
		this.bookingYear = bookingYear;
	}
	public String getTempClosedTag() {
		return tempClosedTag;
	}
	public void setTempClosedTag(String tempClosedTag) {
		this.tempClosedTag = tempClosedTag;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "bookingMth [bookingMm=" + bookingMm + ", bookingYear="
				+ bookingYear + ", tempClosedTag=" + tempClosedTag
				+ ", remarks=" + remarks + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}