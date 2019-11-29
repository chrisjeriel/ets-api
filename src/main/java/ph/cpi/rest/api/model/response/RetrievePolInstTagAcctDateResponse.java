package ph.cpi.rest.api.model.response;

import org.joda.time.DateTime;

public class RetrievePolInstTagAcctDateResponse {
	private String instTag;
	private DateTime acctDate;
	private DateTime bookingDate;
	public String getInstTag() {
		return instTag;
	}
	public void setInstTag(String instTag) {
		this.instTag = instTag;
	}
	public DateTime getAcctDate() {
		return acctDate;
	}
	public void setAcctDate(DateTime acctDate) {
		this.acctDate = acctDate;
	}
	public DateTime getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(DateTime bookingDate) {
		this.bookingDate = bookingDate;
	}
	@Override
	public String toString() {
		return "RetrievePolInstTagAcctDateResponse [instTag=" + instTag + ", acctDate=" + acctDate + ", bookingDate="
				+ bookingDate + "]";
	}
}
