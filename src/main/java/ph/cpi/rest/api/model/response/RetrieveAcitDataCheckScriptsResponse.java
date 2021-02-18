package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.BookingYear;
import ph.cpi.rest.api.model.accountingintrust.DataCheckScript;

public class RetrieveAcitDataCheckScriptsResponse {
	
	private List<BookingYear> bookingMonthList;
	private List<DataCheckScript> dataCheckScriptList;
	
	public List<BookingYear> getBookingMonthList() {
		return bookingMonthList;
	}
	public void setBookingMonthList(List<BookingYear> bookingMonthList) {
		this.bookingMonthList = bookingMonthList;
	}
	public List<DataCheckScript> getDataCheckScriptList() {
		return dataCheckScriptList;
	}
	public void setDataCheckScriptList(List<DataCheckScript> dataCheckScriptList) {
		this.dataCheckScriptList = dataCheckScriptList;
	}
	@Override
	public String toString() {
		return "RetrieveAcitDataCheckScriptsResponse [bookingMonthList=" + bookingMonthList + ", dataCheckScriptList="
				+ dataCheckScriptList + "]";
	}
}
