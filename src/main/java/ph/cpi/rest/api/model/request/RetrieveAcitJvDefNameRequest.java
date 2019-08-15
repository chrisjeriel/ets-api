package ph.cpi.rest.api.model.request;

public class RetrieveAcitJvDefNameRequest {
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "RetrieveAcitJvDefNameRequest [userId=" + userId + "]";
	}
	
}
