package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitJVQuarterPremRes {
	private BigDecimal fundsHeld;
	private DateTime quarterEnding;
	public BigDecimal getFundsHeld() {
		return fundsHeld;
	}
	public void setFundsHeld(BigDecimal fundsHeld) {
		this.fundsHeld = fundsHeld;
	}
	public DateTime getQuarterEnding() {
		return quarterEnding;
	}
	public void setQuarterEnding(DateTime quarterEnding) {
		this.quarterEnding = quarterEnding;
	}
	@Override
	public String toString() {
		return "AcitJVQuarterPremRes [fundsHeld=" + fundsHeld + ", quarterEnding=" + quarterEnding + "]";
	}
	
}
