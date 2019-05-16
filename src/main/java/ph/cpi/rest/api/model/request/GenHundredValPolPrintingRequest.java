package ph.cpi.rest.api.model.request;

public class GenHundredValPolPrintingRequest {
	private String policyId;
	private String projId;
	private String riskId;
	private String lineCd;
	private String treatyShare;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getProjId() {
		return projId;
	}
	public void setProjId(String projId) {
		this.projId = projId;
	}
	public String getRiskId() {
		return riskId;
	}
	public void setRiskId(String riskId) {
		this.riskId = riskId;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getTreatyShare() {
		return treatyShare;
	}
	public void setTreatyShare(String treatyShare) {
		this.treatyShare = treatyShare;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "GenHundredValPolPrintingRequest [policyId=" + policyId + ", projId=" + projId + ", riskId=" + riskId
				+ ", lineCd=" + lineCd + ", treatyShare=" + treatyShare + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}

