package ph.cpi.rest.api.model.underwriting;

public class BatchPost {
	private Integer riskDistId;
	private Integer policyId;
	private String policyNo;
	private String distId;
	private String createDate;
	private Integer altNo;
	private String message;
	public Integer getRiskDistId() {
		return riskDistId;
	}
	public void setRiskDistId(Integer riskDistId) {
		this.riskDistId = riskDistId;
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
	public String getDistId() {
		return distId;
	}
	public void setDistId(String distId) {
		this.distId = distId;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public Integer getAltNo() {
		return altNo;
	}
	public void setAltNo(Integer altNo) {
		this.altNo = altNo;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "BatchPost [riskDistId=" + riskDistId + ", policyId=" + policyId + ", policyNo=" + policyNo + ", distId="
				+ distId + ", createDate=" + createDate + ", altNo=" + altNo + ", message=" + message + "]";
	}
	
}
