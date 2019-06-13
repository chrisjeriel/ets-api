package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class PolForPurging {
	private String policyId;
	private String policyNo;
	private String cessionId;
	private String cedingId;
	private BigDecimal totalSi;
	private BigDecimal totalPrem;
	private DateTime expiryDate;
	private String processTag;
	private String expiryTag;
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
	
	public String getCessionId() {
		return cessionId;
	}
	public void setCessionId(String cessionId) {
		this.cessionId = cessionId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public BigDecimal getTotalSi() {
		return totalSi;
	}
	public void setTotalSi(BigDecimal totalSi) {
		this.totalSi = totalSi;
	}
	public BigDecimal getTotalPrem() {
		return totalPrem;
	}
	public void setTotalPrem(BigDecimal totalPrem) {
		this.totalPrem = totalPrem;
	}
	public DateTime getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(DateTime expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getProcessTag() {
		return processTag;
	}
	public void setProcessTag(String processTag) {
		this.processTag = processTag;
	}
	public String getExpiryTag() {
		return expiryTag;
	}
	public void setExpiryTag(String expiryTag) {
		this.expiryTag = expiryTag;
	}
	@Override
	public String toString() {
		return "PolForPurging [policyId=" + policyId + ", policyNo=" + policyNo + ", cessionId=" + cessionId
				+ ", cedingId=" + cedingId + ", totalSi=" + totalSi + ", totalPrem=" + totalPrem + ", expiryDate="
				+ expiryDate + ", processTag=" + processTag + ", expiryTag=" + expiryTag + "]";
	}
}
