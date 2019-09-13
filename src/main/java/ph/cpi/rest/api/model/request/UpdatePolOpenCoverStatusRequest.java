package ph.cpi.rest.api.model.request;

public class UpdatePolOpenCoverStatusRequest {
	private String policyIdOc;
	private String updateUser;
	@Override
	public String toString() {
		return "UpdatePolOpenCoverStatusRequest [policyIdOc=" + policyIdOc + ", updateUser=" + updateUser + "]";
	}
	public String getPolicyIdOc() {
		return policyIdOc;
	}
	public void setPolicyIdOc(String policyIdOc) {
		this.policyIdOc = policyIdOc;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
}
