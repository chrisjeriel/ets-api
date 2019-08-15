package ph.cpi.rest.api.model.maintenance;

public class UserId {
	private String userName;
	private String employeeName;
	private String designation;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "UserId [userName=" + userName + ", employeeName=" + employeeName + ", designation=" + designation + "]";
	}
	
}
