package ph.cpi.rest.api.model.workflowmanager;

public class UserNotif {
	private String user;
	private Integer count;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "{ " + "\"user\":" + "\"" + user + "\"" + ", \"count\":" + count + "}";
	}
	
}