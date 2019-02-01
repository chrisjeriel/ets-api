package ph.cpi.rest.api.model.quote;

public class Project {
	private String riskName;

	public String getRiskName() {
		return riskName;
	}

	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}

	@Override
	public String toString() {
		return "Project [riskName=" + riskName + "]";
	}
}
