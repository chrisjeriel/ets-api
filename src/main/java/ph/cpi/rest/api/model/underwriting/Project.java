package ph.cpi.rest.api.model.underwriting;

import org.apache.ibatis.type.Alias;

@Alias("UnderwritingProject")
public class Project {
	private Integer projId;
	private Integer riskId;
	private String riskName;
	
	private Coverage coverage;

	public Integer getProjId() {
		return projId;
	}

	public void setProjId(Integer projId) {
		this.projId = projId;
	}

	public Integer getRiskId() {
		return riskId;
	}

	public void setRiskId(Integer riskId) {
		this.riskId = riskId;
	}

	public String getRiskName() {
		return riskName;
	}

	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}

	public Coverage getCoverage() {
		return coverage;
	}

	public void setCoverage(Coverage coverage) {
		this.coverage = coverage;
	}
	
	
}
