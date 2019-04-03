package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.maintenance.Users;

public class UserAuthenticateResponse {

	private Users user;

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserAuthenticateResponse [user=" + user + ", getUser()=" + getUser() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
