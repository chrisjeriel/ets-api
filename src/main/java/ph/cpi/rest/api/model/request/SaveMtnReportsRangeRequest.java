package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

public class SaveMtnReportsRangeRequest {
	private List<reportRange> saveReportsRange;
	private List<reportRange> delReportsRange;

	public List<reportRange> getSaveReportsRange() {
		return saveReportsRange;
	}

	public void setSaveReportsRange(List<reportRange> saveReportsRange) {
		this.saveReportsRange = saveReportsRange;
	}
	
	

	public List<reportRange> getDelReportsRange() {
		return delReportsRange;
	}

	public void setDelReportsRange(List<reportRange> delReportsRange) {
		this.delReportsRange = delReportsRange;
	}

	@Override
	public String toString() {
		return "SaveMtnReportsRangeRequest [saveReportsRange=" + saveReportsRange + ", delReportsRange="
				+ delReportsRange + "]";
	}

	
	
}

class reportRange {
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
		return "reportRange [userId=" + userId + ", siRange=" + siRange + ", amount=" + amount + "]";
	}
	
}