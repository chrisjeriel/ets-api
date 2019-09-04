package ph.cpi.rest.api.model.request;

/**
 * @author User
 *
 */
public class PostPolicyRequest {
	private String policyId;
	private String updateUser;
	private String status;
	private String altCancelTag;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAltCancelTag() {
		return altCancelTag;
	}
	public void setAltCancelTag(String altCancelTag) {
		this.altCancelTag = altCancelTag;
	}
	@Override
	public String toString() {
		return "PostPolicyRequest [policyId=" + policyId + ", updateUser=" + updateUser + ", status=" + status
				+ ", altCancelTag=" + altCancelTag + "]";
	}
	
}
