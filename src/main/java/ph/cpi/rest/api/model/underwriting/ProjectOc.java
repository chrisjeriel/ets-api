package ph.cpi.rest.api.model.underwriting;

import org.apache.ibatis.type.Alias;

@Alias("UnderwritingProjectOc")
public class ProjectOc {
	private Integer riskId;
	private String riskName;
	private String objectDesc;
	private String site;
	
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

	public String getObjectDesc() {
		return objectDesc;
	}

	public void setObjectDesc(String objectDesc) {
		this.objectDesc = objectDesc;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public CoverageOc getCoverageOc() {
		return coverageOc;
	}

	public void setCoverageOc(CoverageOc coverageOc) {
		this.coverageOc = coverageOc;
	}

	@Override
	public String toString() {
		return "ProjectOc [riskId=" + riskId + ", riskName=" + riskName + ", objectDesc=" + objectDesc + ", site="
				+ site + ", coverageOc=" + coverageOc + "]";
	}
	
	

	
	
}
