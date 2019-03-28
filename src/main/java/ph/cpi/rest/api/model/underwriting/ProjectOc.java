package ph.cpi.rest.api.model.underwriting;

import org.apache.ibatis.type.Alias;

@Alias("UnderwritingProjectOc")
public class ProjectOc {
	private Integer riskId;
	private String riskName;
	
	private CoverageOc coverageOc;
	
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

	public CoverageOc getCoverageOc() {
		return coverageOc;
	}

	public void setCoverageOc(CoverageOc coverageOc) {
		this.coverageOc = coverageOc;
	}

	@Override
	public String toString() {
		return "ProjectOc [riskId=" + riskId + ", riskName=" + riskName + ", coverageOc=" + coverageOc + "]";
	}
	
	
}
