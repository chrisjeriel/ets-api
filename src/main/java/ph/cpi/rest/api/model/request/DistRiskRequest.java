package ph.cpi.rest.api.model.request;

public class DistRiskRequest {
	private String riskDistId;
	private String altNo;
	private String updateUser;
	public String getRiskDistId() {
		return riskDistId;
	}
	public void setRiskDistId(String riskDistId) {
		this.riskDistId = riskDistId;
	}
	public String getAltNo() {
		return altNo;
	}
	public void setAltNo(String altNo) {
		this.altNo = altNo;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	@Override
	public String toString() {
		return "DistRiskRequest [riskDistId=" + riskDistId + ", altNo=" + altNo + ", updateUser=" + updateUser + "]";
	}
	
}
