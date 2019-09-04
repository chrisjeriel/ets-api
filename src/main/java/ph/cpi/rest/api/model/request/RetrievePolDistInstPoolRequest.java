package ph.cpi.rest.api.model.request;

public class RetrievePolDistInstPoolRequest {
	private Integer distId;
	private Integer altNo;
	private Integer policyId;
	private Integer instNo;
	public Integer getDistId() {
		return distId;
	}
	public void setDistId(Integer distId) {
		this.distId = distId;
	}
	public Integer getAltNo() {
		return altNo;
	}
	public void setAltNo(Integer altNo) {
		this.altNo = altNo;
	}
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
	@Override
	public String toString() {
		return "RetrievePolDistInstPoolRequest [distId=" + distId + ", altNo=" + altNo + ", policyId=" + policyId
				+ ", instNo=" + instNo + "]";
	}
	
}
