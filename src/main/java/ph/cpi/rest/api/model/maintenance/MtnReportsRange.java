package ph.cpi.rest.api.model.maintenance;

import java.math.BigDecimal;

public class MtnReportsRange {
	private String userId;
	private int siRange;
	private BigDecimal amount;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getSiRange() {
		return siRange;
	}
	public void setSiRange(int siRange) {
		this.siRange = siRange;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "MtnReportsRange [userId=" + userId + ", siRange=" + siRange + ", amount=" + amount + "]";
	}
	
}
