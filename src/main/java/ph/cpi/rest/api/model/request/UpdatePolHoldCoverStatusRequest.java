package ph.cpi.rest.api.model.request;

public class UpdatePolHoldCoverStatusRequest {
	private String policyId;
	private String holdCovId;
	private String updateType;
	private String updateUser;
	private String updateDate;
	
	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getHoldCovId() {
		return holdCovId;
	}

	public void setHoldCovId(String holdCovId) {
		this.holdCovId = holdCovId;
	}

	public String getUpdateType() {
		return updateType;
	}

	public void setUpdateType(String updateType) {
		this.updateType = updateType;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "UpdatePolHoldCoverStatusRequest [policyId=" + policyId + ", holdCovId=" + holdCovId + ", updateType="
				+ updateType + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
