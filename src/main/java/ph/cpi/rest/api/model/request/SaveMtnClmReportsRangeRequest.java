package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

public class SaveMtnClmReportsRangeRequest {
	private List<clmReportRange> saveReportsRange;
	private List<clmReportRange> delReportsRange;

	public List<clmReportRange> getSaveReportsRange() {
		return saveReportsRange;
	}

	public void setSaveReportsRange(List<clmReportRange> saveReportsRange) {
		this.saveReportsRange = saveReportsRange;
	}
	
	

	public List<clmReportRange> getDelReportsRange() {
		return delReportsRange;
	}

	public void setDelReportsRange(List<clmReportRange> delReportsRange) {
		this.delReportsRange = delReportsRange;
	}

	@Override
	public String toString() {
		return "SaveMtnReportsRangeRequest [saveReportsRange=" + saveReportsRange + ", delReportsRange="
				+ delReportsRange + "]";
	}

	
	
}

class clmReportRange {
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
		return "clmReportRange [userId=" + userId + ", rangeCd=" + rangeCd + ", rangeValue=" + rangeValue + "]";
	}
	
	
}