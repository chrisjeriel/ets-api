package ph.cpi.rest.api.model.request;

public class RetrieveAcitAgingSoaDtlRequest {
	private String policyId;
	private String instNo;
	private String cedingId;
	private String payeeNo;
	
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getInstNo() {
		return instNo;
	}
	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getPayeeNo() {
		return payeeNo;
	}
	public void setPayeeNo(String payeeNo) {
		this.payeeNo = payeeNo;
	}
	
	@Override
	public String toString() {
		return "AcitAgingSoaDtlRequest [policyId=" + policyId + ", instNo=" + instNo + ", cedingId=" + cedingId
				+ ", payeeNo=" + payeeNo + "]";
	}
}
