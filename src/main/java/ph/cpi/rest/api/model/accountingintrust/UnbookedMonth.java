package ph.cpi.rest.api.model.accountingintrust;

public class UnbookedMonth {

	private Integer bookingMonth;

	public Integer getBookingMonth() {
		return bookingMonth;
	}
	public void setBookingMonth(Integer bookingMonth) {
		this.bookingMonth = bookingMonth;
	}
	@Override
	public String toString() {
		return "UnbookedMonth [bookingMonth=" + bookingMonth + "]";
	}
}
