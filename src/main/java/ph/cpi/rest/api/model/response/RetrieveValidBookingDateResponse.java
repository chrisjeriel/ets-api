package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.underwriting.BookingDate;

public class RetrieveValidBookingDateResponse {
	private BookingDate dates;

	public BookingDate getDates() {
		return dates;
	}

	public void setDates(BookingDate dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "RetrieveValidBookingDateResponse [dates=" + dates + "]";
	}
	
}
