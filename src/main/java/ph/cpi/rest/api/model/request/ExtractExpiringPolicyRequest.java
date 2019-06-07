package ph.cpi.rest.api.model.request;

public class ExtractExpiringPolicyRequest {

	private String policyId;
	private String polLineCd;
	private String polYear;
	private String polSeqNo;
	private String polCedingId;
	private String coSeriesNo;
	private String altNo;
	private String fromExpiryDate;
	private String toExpiryDate;
	private String lineCd;
	private String cedingId;
	private String cessionType;
	private String extractUser;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getPolLineCd() {
		return polLineCd;
	}
	public void setPolLineCd(String polLineCd) {
		this.polLineCd = polLineCd;
	}
	public String getPolYear() {
		return polYear;
	}
	public void setPolYear(String polYear) {
		this.polYear = polYear;
	}
	public String getPolSeqNo() {
		return polSeqNo;
	}
	public void setPolSeqNo(String polSeqNo) {
		this.polSeqNo = polSeqNo;
	}
	public String getPolCedingId() {
		return polCedingId;
	}
	public void setPolCedingId(String polCedingId) {
		this.polCedingId = polCedingId;
	}
	public String getCoSeriesNo() {
		return coSeriesNo;
	}
	public void setCoSeriesNo(String coSeriesNo) {
		this.coSeriesNo = coSeriesNo;
	}
	public String getAltNo() {
		return altNo;
	}
	public void setAltNo(String altNo) {
		this.altNo = altNo;
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
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCessionType() {
		return cessionType;
	}
	public void setCessionType(String cessionType) {
		this.cessionType = cessionType;
	}
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	@Override
	public String toString() {
		return "ExtractExpiringPolicyRequest [policyId=" + policyId + ", polLineCd=" + polLineCd + ", polYear="
				+ polYear + ", polSeqNo=" + polSeqNo + ", polCedingId=" + polCedingId + ", coSeriesNo=" + coSeriesNo
				+ ", altNo=" + altNo + ", fromExpiryDate=" + fromExpiryDate + ", toExpiryDate=" + toExpiryDate
				+ ", lineCd=" + lineCd + ", cedingId=" + cedingId + ", cessionType=" + cessionType + ", extractUser="
				+ extractUser + "]";
	}
	
}
