package ph.cpi.rest.api.model.request;

public class UpdatePolGenInfoRequest {
	
	private String policyId;
	private String riskId;
	private String coRefNo;
	private String riBinderNo;
	private String insuredDesc;
	private String latitude;
	private String longitude;
	private String updateUser;
	private String updateDate;

	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getRiskId() {
		return riskId;
	}
	public void setRiskId(String riskId) {
		this.riskId = riskId;
	}
	public String getCoRefNo() {
		return coRefNo;
	}
	public void setCoRefNo(String coRefNo) {
		this.coRefNo = coRefNo;
	}
	public String getRiBinderNo() {
		return riBinderNo;
	}
	public void setRiBinderNo(String riBinderNo) {
		this.riBinderNo = riBinderNo;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
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
		return "UpdatePolGenInfoRequest [policyId=" + policyId + ", riskId=" + riskId + ", coRefNo=" + coRefNo
				+ ", riBinderNo=" + riBinderNo + ", insuredDesc=" + insuredDesc + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}