package ph.cpi.rest.api.model.request;

public class UpdatePolGenInfoSpoilageRequest {
	private String policyId;
	private String status;
	private String spldUser;
	private String updateUser;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSpldUser() {
		return spldUser;
	}
	public void setSpldUser(String spldUser) {
		this.spldUser = spldUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	@Override
	public String toString() {
		return "UpdatePolGenInfoSpoilageRequest [policyId=" + policyId + ", status=" + status + ", spldUser=" + spldUser
				+ ", updateUser=" + updateUser + "]";
	}
}
