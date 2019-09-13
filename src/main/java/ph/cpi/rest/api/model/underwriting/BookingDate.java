package ph.cpi.rest.api.model.underwriting;

import org.joda.time.DateTime;

public class BookingDate {
	private DateTime suggestedDate;
	private DateTime minDate;
	public DateTime getSuggestedDate() {
		return suggestedDate;
	}
	public void setSuggestedDate(DateTime suggestedDate) {
		this.suggestedDate = suggestedDate;
	}
	public DateTime getMinDate() {
		return minDate;
	}
	public void setMinDate(DateTime minDate) {
		this.minDate = minDate;
	}
	@Override
	public String toString() {
		return "BookingDate [suggestedDate=" + suggestedDate + ", minDate=" + minDate + "]";
	}
}
