package ph.cpi.rest.api.model.request;

public class ExtractExpiringPolicyRequest {

	private String policyId;
	private String policyNo;
	private String fromExpiryDate;
	private String toExpiryDate;
	private String lineCd;
	private String cessionType;
	private String cedingId;
	private String extractUser;
	
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getFromExpiryDate() {
		return fromExpiryDate;
	}
	public void setFromExpiryDate(String fromExpiryDate) {
		this.fromExpiryDate = fromExpiryDate;
	}
	public String getToExpiryDate() {
		return toExpiryDate;
	}
	public void setToExpiryDate(String toExpiryDate) {
		this.toExpiryDate = toExpiryDate;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getCessionType() {
		return cessionType;
	}
	public void setCessionType(String cessionType) {
		this.cessionType = cessionType;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	@Override
	public String toString() {
		return "ExtractExpiringPolicyRequest [policyId=" + policyId + ", policyNo=" + policyNo + ", fromExpiryDate="
				+ fromExpiryDate + ", toExpiryDate=" + toExpiryDate + ", lineCd=" + lineCd + ", cessionType="
				+ cessionType + ", cedingId=" + cedingId + ", extractUser=" + extractUser + "]";
	}
	
}
