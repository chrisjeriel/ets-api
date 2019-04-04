package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.maintenance.Users;

public class UserAuthenticateResponse {

	private Users user;
	private Integer returnCode;

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Integer getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}

	@Override
	public String toString() {
		return "UserAuthenticateResponse [user=" + user + ", returnCode=" + returnCode + "]";
	}

}
