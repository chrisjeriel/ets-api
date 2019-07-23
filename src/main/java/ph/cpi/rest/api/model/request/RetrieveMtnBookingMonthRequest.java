package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnBookingMonthRequest {
	private String  	bookingMm;
	private String 		bookingYear;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
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
	public PaginationRequest getPaginationRequest() {
		return paginationRequest;
	}
	public void setPaginationRequest(PaginationRequest paginationRequest) {
		this.paginationRequest = paginationRequest;
	}
	public SortRequest getSortRequest() {
		return sortRequest;
	}
	public void setSortRequest(SortRequest sortRequest) {
		this.sortRequest = sortRequest;
	}
	@Override
	public String toString() {
		return "RetrieveMtnBookingMonthRequest [bookingMm=" + bookingMm + ", bookingYear=" + bookingYear
				+ ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
