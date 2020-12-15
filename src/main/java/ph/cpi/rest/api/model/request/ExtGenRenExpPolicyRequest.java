package ph.cpi.rest.api.model.request;

public class ExtGenRenExpPolicyRequest {
	private String policyId;
	private String procBy;
	private String expiryDate;
	private String inceptDate;
	
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getInceptDate() {
		return inceptDate;
	}
	public void setInceptDate(String inceptDate) {
		this.inceptDate = inceptDate;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getProcBy() {
		return procBy;
	}
	public void setProcBy(String procBy) {
		this.procBy = procBy;
	}
	@Override
	public String toString() {
		return "ExtGenRenExpPolicyRequest [policyId=" + policyId + ", procBy=" + procBy + ", expiryDate=" + expiryDate
				+ ", inceptDate=" + inceptDate + "]";
	}
	
}
