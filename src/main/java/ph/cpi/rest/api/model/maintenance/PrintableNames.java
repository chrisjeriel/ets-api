package ph.cpi.rest.api.model.maintenance;

public class PrintableNames {
	private String employeeId;
	private String userId;
	private String userGrp;
	private String printableName;
	private String designation;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserGrp() {
		return userGrp;
	}
	public void setUserGrp(String userGrp) {
		this.userGrp = userGrp;
	}
	public String getPrintableName() {
		return printableName;
	}
	public void setPrintableName(String printableName) {
		this.printableName = printableName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "PrintableNames [employeeId=" + employeeId + ", userId=" + userId + ", userGrp=" + userGrp
				+ ", printableName=" + printableName + ", designation=" + designation + "]";
	}
	
}
