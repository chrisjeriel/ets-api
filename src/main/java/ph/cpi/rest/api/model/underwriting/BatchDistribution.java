package ph.cpi.rest.api.model.underwriting;

public class BatchDistribution {
	private Integer riskDistId;
	private String policyNo;
	private String createDate;
	private Integer altNo;
	private String message;
	public Integer getRiskDistId() {
		return riskDistId;
	}
	public void setRiskDistId(Integer riskDistId) {
		this.riskDistId = riskDistId;
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
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	@Override
	public String toString() {
		return "BatchDistribution [riskDistId=" + riskDistId + ", policyNo=" + policyNo + ", createDate=" + createDate
				+ ", altNo=" + altNo + ", message=" + message + "]";
	}
	
}
