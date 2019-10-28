package ph.cpi.rest.api.model.request;

import java.util.List;

import ph.cpi.rest.api.model.underwriting.BatchPost;

public class BatchPostingRequest {
	private List<BatchPost> distList;
	private String user;
	public List<BatchPost> getDistList() {
		return distList;
	}
	public void setDistList(List<BatchPost> distList) {
		this.distList = distList;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "BatchPostingRequest [distList=" + distList + ", user=" + user + "]";
	}
	
}
