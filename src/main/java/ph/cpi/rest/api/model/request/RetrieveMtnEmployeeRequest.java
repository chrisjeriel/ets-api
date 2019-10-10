package ph.cpi.rest.api.model.request;

public class RetrieveMtnEmployeeRequest {
	
	private String companyId;
	private String employeeId;
	
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "RetrieveMtnEmployeeRequest [companyId=" + companyId
				+ ", employeeId=" + employeeId + "]";
	}

}
