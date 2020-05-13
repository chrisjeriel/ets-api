package ph.cpi.rest.api.model.utils;

public class ACITR049 {

	private String reportId;
	private Integer profCommId;
	
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public Integer getProfCommId() {
		return profCommId;
	}
	public void setProfCommId(Integer profCommId) {
		this.profCommId = profCommId;
	}
	@Override
	public String toString() {
		return "ACITR049 [reportId=" + reportId + ", profCommId=" + profCommId + "]";
	}
}
