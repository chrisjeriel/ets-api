package ph.cpi.rest.api.model.request;

public class UpdateHoldCoverStatusRequest {
	private String quoteId;
	private String holdCoverId;
	private String updateUser;
	private String hcStatus;
	private String quoStatus;
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getHoldCoverId() {
		return holdCoverId;
	}
	public void setHoldCoverId(String holdCoverId) {
		this.holdCoverId = holdCoverId;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getHcStatus() {
		return hcStatus;
	}
	public void setHcStatus(String hcStatus) {
		this.hcStatus = hcStatus;
	}
	public String getQuoStatus() {
		return quoStatus;
	}
	public void setQuoStatus(String quoStatus) {
		this.quoStatus = quoStatus;
	}
	@Override
	public String toString() {
		return "UpdateHoldCoverStatusRequest [quoteId=" + quoteId + ", holdCoverId=" + holdCoverId + ", updateUser="
				+ updateUser + ", hcStatus=" + hcStatus + ", quoStatus=" + quoStatus + "]";
	}
}
