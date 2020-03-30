package ph.cpi.rest.api.model.maintenance;

import java.math.BigDecimal;

public class ClaimReportsRange {
	private String userId;
	private String rangeCd;
	private BigDecimal rangeValue;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRangeCd() {
		return rangeCd;
	}
	public void setRangeCd(String rangeCd) {
		this.rangeCd = rangeCd;
	}
	public BigDecimal getRangeValue() {
		return rangeValue;
	}
	public void setRangeValue(BigDecimal rangeValue) {
		this.rangeValue = rangeValue;
	}
	@Override
	public String toString() {
		return "ClaimReportsRange [userId=" + userId + ", rangeCd=" + rangeCd + ", rangeValue=" + rangeValue + "]";
	}
	
}
