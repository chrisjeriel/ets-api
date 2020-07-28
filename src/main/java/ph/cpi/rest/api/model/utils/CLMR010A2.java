package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class CLMR010A2 {
	private String extractUser;
	private String dateParam;
	private String dateRange;
	private Integer claimId;
	private String claimNo;
	private Integer treatyId;
	private String treatyName;
	private String trtyCedId;
	private String treatyCompany;
	private Integer retLayer;
	private String retName;
	private BigDecimal osAmt;
	private BigDecimal pdAmt;
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public String getDateParam() {
		return dateParam;
	}
	public void setDateParam(String dateParam) {
		this.dateParam = dateParam;
	}
	public String getDateRange() {
		return dateRange;
	}
	public void setDateRange(String dateRange) {
		this.dateRange = dateRange;
	}
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public String getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	public Integer getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(Integer treatyId) {
		this.treatyId = treatyId;
	}
	public String getTreatyName() {
		return treatyName;
	}
	public void setTreatyName(String treatyName) {
		this.treatyName = treatyName;
	}
	public String getTrtyCedId() {
		return trtyCedId;
	}
	public void setTrtyCedId(String trtyCedId) {
		this.trtyCedId = trtyCedId;
	}
	public String getTreatyCompany() {
		return treatyCompany;
	}
	public void setTreatyCompany(String treatyCompany) {
		this.treatyCompany = treatyCompany;
	}
	public Integer getRetLayer() {
		return retLayer;
	}
	public void setRetLayer(Integer retLayer) {
		this.retLayer = retLayer;
	}
	public String getRetName() {
		return retName;
	}
	public void setRetName(String retName) {
		this.retName = retName;
	}
	public BigDecimal getOsAmt() {
		return osAmt;
	}
	public void setOsAmt(BigDecimal osAmt) {
		this.osAmt = osAmt;
	}
	public BigDecimal getPdAmt() {
		return pdAmt;
	}
	public void setPdAmt(BigDecimal pdAmt) {
		this.pdAmt = pdAmt;
	}
	@Override
	public String toString() {
		return "CLMR010A2 [extractUser=" + extractUser + ", dateParam=" + dateParam + ", dateRange=" + dateRange
				+ ", claimId=" + claimId + ", claimNo=" + claimNo + ", treatyId=" + treatyId + ", treatyName="
				+ treatyName + ", trtyCedId=" + trtyCedId + ", treatyCompany=" + treatyCompany + ", retLayer="
				+ retLayer + ", retName=" + retName + ", osAmt=" + osAmt + ", pdAmt=" + pdAmt + "]";
	}
}
