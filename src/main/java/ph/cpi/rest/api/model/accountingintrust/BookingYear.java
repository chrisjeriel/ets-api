package ph.cpi.rest.api.model.accountingintrust;

import java.util.List;

public class BookingYear {

	private Integer bookingYear;
	private List<UnbookedMonth> bookingMonthList;
	
	public Integer getBookingYear() {
		return bookingYear;
	}
	public void setBookingYear(Integer bookingYear) {
		this.bookingYear = bookingYear;
	}
	public List<UnbookedMonth> getBookingMonthList() {
		return bookingMonthList;
	}
	public void setBookingMonthList(List<UnbookedMonth> bookingMonthList) {
		this.bookingMonthList = bookingMonthList;
	}
	@Override
	public String toString() {
		return "BookingYear [bookingYear=" + bookingYear + ", bookingMonthList=" + bookingMonthList + "]";
	}
}
