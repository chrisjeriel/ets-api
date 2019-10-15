package ph.cpi.rest.api.model.accountingintrust;

import org.joda.time.DateTime;

public class AcitEomUnpostedMonth {

	private Integer eomMm;
	private Integer eomYear;
	private DateTime eomDate;
	
	public Integer getEomMm() {
		return eomMm;
	}
	public void setEomMm(Integer eomMm) {
		this.eomMm = eomMm;
	}
	public Integer getEomYear() {
		return eomYear;
	}
	public void setEomYear(Integer eomYear) {
		this.eomYear = eomYear;
	}
	public DateTime getEomDate() {
		return eomDate;
	}
	public void setEomDate(DateTime eomDate) {
		this.eomDate = eomDate;
	}
	@Override
	public String toString() {
		return "UnpostedMonth [eomMm=" + eomMm + ", eomYear=" + eomYear + "]";
	}
}
