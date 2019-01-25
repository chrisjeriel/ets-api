package ph.cpi.rest.api.model.quote;

public class ProjectOc {
	private Integer projId;
	private String projDesc;
	private CoverageOc coverageOc;
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public String getProjDesc() {
		return projDesc;
	}
	public void setProjDesc(String projDesc) {
		this.projDesc = projDesc;
	}
	public CoverageOc getCoverageOc() {
		return coverageOc;
	}
	public void setCoverageOc(CoverageOc coverageOc) {
		this.coverageOc = coverageOc;
	}
	@Override
	public String toString() {
		return "ProjectOc [projId=" + projId + ", projDesc=" + projDesc + ", CoverageOc=" + coverageOc + "]";
	}
}
