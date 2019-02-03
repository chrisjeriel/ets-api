package ph.cpi.rest.api.model.quote;

public class Project {

	private String riskName;
	private String objectDesc;
	private String site;
	
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
	@Override
	public String toString() {
		return "Project [riskName=" + riskName + ", objectDesc=" + objectDesc + ", site=" + site + "]";
	}
}
