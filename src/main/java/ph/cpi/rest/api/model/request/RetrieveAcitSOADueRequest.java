package ph.cpi.rest.api.model.request;

public class RetrieveAcitSOADueRequest {
	private Integer policyId;
	private Integer instNo;
	private String cedingId;
	private String currCd;
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public Integer getInstNo() {
		return instNo;
	}
	public void setInstNo(Integer instNo) {
		this.instNo = instNo;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	@Override
	public String toString() {
		return "RetrieveAcitSOADueRequest [policyId=" + policyId + ", instNo=" + instNo + ", cedingId=" + cedingId
				+ ", currCd=" + currCd + "]";
	}
	
}
