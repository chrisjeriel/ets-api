package ph.cpi.rest.api.model.request;

public class RetrieveMtnClmReportsRangeRequest {
	private String userId;

	@Override
	public String toString() {
		return "RetrieveMtnClmReportsRangeRequest [userId=" + userId + "]";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
