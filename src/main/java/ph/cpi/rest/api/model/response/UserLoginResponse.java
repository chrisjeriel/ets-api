package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

public class UserLoginResponse {
	
	private String userId;
	private List<String> modulesList;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<String> getModulesList() {
		
		if (modulesList == null) {
			modulesList = new ArrayList<String>();
		}
		
		return modulesList;
	}
	public void setModulesList(List<String> modulesList) {
		this.modulesList = modulesList;
	}
	@Override
	public String toString() {
		return "UserLoginResponse [userId=" + userId + ", modulesList=" + modulesList + "]";
	}
	
}
