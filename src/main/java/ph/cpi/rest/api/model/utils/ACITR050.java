package ph.cpi.rest.api.model.utils;

public class ACITR050 {

	private String reportId;
	private Integer qsoaId;
	private String qtrEnding;
	private String currCd;
	private String cedingId;
	
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
	}
	public String getQtrEnding() {
		return qtrEnding;
	}
	public void setQtrEnding(String qtrEnding) {
		this.qtrEnding = qtrEnding;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	@Override
	public String toString() {
		return "ACITR050 [reportId=" + reportId + ", qsoaId=" + qsoaId + ", qtrEnding=" + qtrEnding + ", currCd="
				+ currCd + ", cedingId=" + cedingId + "]";
	}
}
