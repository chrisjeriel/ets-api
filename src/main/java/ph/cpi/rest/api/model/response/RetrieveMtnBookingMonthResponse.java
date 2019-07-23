package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.BookingMonth;

public class RetrieveMtnBookingMonthResponse {
	private List<BookingMonth> bookingMonthList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<BookingMonth> getBookingMonthList() {
		return bookingMonthList;
	}
	public void setBookingMonthList(List<BookingMonth> bookingMonthList) {
		this.bookingMonthList = bookingMonthList;
	}
	public PaginationResponse getPaginationResponse() {
		return paginationResponse;
	}
	public void setPaginationResponse(PaginationResponse paginationResponse) {
		this.paginationResponse = paginationResponse;
	}
	public SortResponse getSortResponse() {
		return sortResponse;
	}
	public void setSortResponse(SortResponse sortResponse) {
		this.sortResponse = sortResponse;
	}
	@Override
	public String toString() {
		return "RetrieveMtnBookingMonthResponse [bookingMonthList=" + bookingMonthList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
