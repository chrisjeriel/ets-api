package ph.cpi.rest.api.model.request;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.maintenance.Users;

public class SaveMtnUserRequest {

	List<Users> usersList;

	public List<Users> getUsersList() {
		
		if (usersList == null) {
			usersList = new ArrayList<Users>();
		}
		
		return usersList;
	}

	public void setUsersList(List<Users> usersList) {
		this.usersList = usersList;
	}

	@Override
	public String toString() {
		return "SaveMtnUserRequest [usersList=" + usersList + "]";
	}
	
	
}
