package ph.cpi.rest.api.model.accountingintrust;

public class DataCheckExt {

	private Integer extractId;
	private Integer scriptNo;
	private String scriptTitle;
	private String scriptSoln;
	private Integer distId;
	private Integer histNo;
	private Integer policyId;
	private String policyNo;
	private Integer instNo;
	private String extractUser;
	private String extractDate;
	private Integer pBookingMm;
	private Integer pBookingYear;
	
	public Integer getExtractId() {
		return extractId;
	}
	public void setExtractId(Integer extractId) {
		this.extractId = extractId;
	}
	public Integer getScriptNo() {
		return scriptNo;
	}
	public void setScriptNo(Integer scriptNo) {
		this.scriptNo = scriptNo;
	}
	public String getScriptTitle() {
		return scriptTitle;
	}
	public void setScriptTitle(String scriptTitle) {
		this.scriptTitle = scriptTitle;
	}
	public String getScriptSoln() {
		return scriptSoln;
	}
	public void setScriptSoln(String scriptSoln) {
		this.scriptSoln = scriptSoln;
	}
	public Integer getDistId() {
		return distId;
	}
	public void setDistId(Integer distId) {
		this.distId = distId;
	}
	public Integer getHistNo() {
		return histNo;
	}
	public void setHistNo(Integer histNo) {
		this.histNo = histNo;
	}
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public Integer getInstNo() {
		return instNo;
	}
	public void setInstNo(Integer instNo) {
		this.instNo = instNo;
	}
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public String getExtractDate() {
		return extractDate;
	}
	public void setExtractDate(String extractDate) {
		this.extractDate = extractDate;
	}
	public Integer getpBookingMm() {
		return pBookingMm;
	}
	public void setpBookingMm(Integer pBookingMm) {
		this.pBookingMm = pBookingMm;
	}
	public Integer getpBookingYear() {
		return pBookingYear;
	}
	public void setpBookingYear(Integer pBookingYear) {
		this.pBookingYear = pBookingYear;
	}
	@Override
	public String toString() {
		return "DataCheckExt [extractId=" + extractId + ", scriptNo=" + scriptNo + ", scriptTitle=" + scriptTitle
				+ ", scriptSoln=" + scriptSoln + ", distId=" + distId + ", histNo=" + histNo + ", policyId=" + policyId
				+ ", policyNo=" + policyNo + ", instNo=" + instNo + ", extractUser=" + extractUser + ", extractDate="
				+ extractDate + ", pBookingMm=" + pBookingMm + ", pBookingYear=" + pBookingYear + "]";
	}
}
