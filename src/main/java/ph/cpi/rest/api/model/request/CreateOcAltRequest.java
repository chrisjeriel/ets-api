package ph.cpi.rest.api.model.request;

public class CreateOcAltRequest {
	private String policyIdOc;
	private String user;
	public String getPolicyIdOc() {
		return policyIdOc;
	}
	public void setPolicyIdOc(String policyIdOc) {
		this.policyIdOc = policyIdOc;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "CreateOcAltRequest [policyIdOc=" + policyIdOc + ", user=" + user + "]";
	}
}
