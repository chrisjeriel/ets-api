package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitArClmCashCallLov {
	private Integer claimId;
	private String claimNo;
	private Integer policyId;
	private String policyNo;
	private DateTime lossDate;
	private String coClmNo;
	private String currCd;
	private BigDecimal currRate;
	
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
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public DateTime getLossDate() {
		return lossDate;
	}
	public void setLossDate(DateTime lossDate) {
		this.lossDate = lossDate;
	}
	public String getCoClmNo() {
		return coClmNo;
	}
	public void setCoClmNo(String coClmNo) {
		this.coClmNo = coClmNo;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public BigDecimal getCurrRate() {
		return currRate;
	}
	public void setCurrRate(BigDecimal currRate) {
		this.currRate = currRate;
	}
	
	@Override
	public String toString() {
		return "AcitArClmCashCallLov [claimId=" + claimId + ", claimNo=" + claimNo + ", policyId=" + policyId
				+ ", policyNo=" + policyNo + ", lossDate=" + lossDate + ", coClmNo=" + coClmNo + ", currCd=" + currCd
				+ ", currRate=" + currRate + "]";
	}
}
