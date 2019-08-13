package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class BookingMonth {
	private String  	bookingMm;
	private Integer 	bookingYear;
	private String  	bookedTag;
	private String  	remarks;
	private String  	createUser;
	private DateTime  	createDate;
	private String  	updateUser;
	private DateTime  	updateDate;
	public String getBookingMm() {
		return bookingMm;
	}
	public void setBookingMm(String bookingMm) {
		this.bookingMm = bookingMm;
	}
	public Integer getBookingYear() {
		return bookingYear;
	}
	public void setBookingYear(Integer bookingYear) {
		this.bookingYear = bookingYear;
	}
	public String getBookedTag() {
		return bookedTag;
	}
	public void setBookedTag(String bookedTag) {
		this.bookedTag = bookedTag;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "BookingMonth [bookingMm=" + bookingMm + ", bookingYear=" + bookingYear + ", bookedTag=" + bookedTag
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
}
