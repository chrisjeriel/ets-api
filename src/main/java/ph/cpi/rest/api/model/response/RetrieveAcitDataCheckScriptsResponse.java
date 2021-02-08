package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.DataCheckScript;
import ph.cpi.rest.api.model.maintenance.BookingMonth;

public class RetrieveAcitDataCheckScriptsResponse {
	
	private List<BookingMonth> bookingMonthList;
	private List<DataCheckScript> dataCheckScriptList;
	
	public List<BookingMonth> getBookingMonthList() {
		return bookingMonthList;
	}
	public void setBookingMonthList(List<BookingMonth> bookingMonthList) {
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
