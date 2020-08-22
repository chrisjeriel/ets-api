package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;

public class RetrieveAcitJVRiskMgtAllocRequest {

	private String generate;
	private Integer tranId;
	private Integer pwFromMm;
	private Integer pwFromYear;
	private Integer pwToMm;
	private Integer pwToYear;
	private Integer paytForQtr;
	private Integer paytForYear;
	private BigDecimal totalAmt;
	private String currCd;
	private BigDecimal currRate;
	
	public String getGenerate() {
		return generate;
	}
	public void setGenerate(String generate) {
		this.generate = generate;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getPwFromMm() {
		return pwFromMm;
	}
	public void setPwFromMm(Integer pwFromMm) {
		this.pwFromMm = pwFromMm;
	}
	public Integer getPwFromYear() {
		return pwFromYear;
	}
	public void setPwFromYear(Integer pwFromYear) {
		this.pwFromYear = pwFromYear;
	}
	public Integer getPwToMm() {
		return pwToMm;
	}
	public void setPwToMm(Integer pwToMm) {
		this.pwToMm = pwToMm;
	}
	public Integer getPwToYear() {
		return pwToYear;
	}
	public void setPwToYear(Integer pwToYear) {
		this.pwToYear = pwToYear;
	}
	public Integer getPaytForQtr() {
		return paytForQtr;
	}
	public void setPaytForQtr(Integer paytForQtr) {
		this.paytForQtr = paytForQtr;
	}
	public Integer getPaytForYear() {
		return paytForYear;
	}
	public void setPaytForYear(Integer paytForYear) {
		this.paytForYear = paytForYear;
	}
	public BigDecimal getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
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
		return "RetrieveAcitJVRiskMgtAllocRequest [generate=" + generate + ", tranId=" + tranId + ", pwFromMm="
				+ pwFromMm + ", pwFromYear=" + pwFromYear + ", pwToMm=" + pwToMm + ", pwToYear=" + pwToYear
				+ ", paytForQtr=" + paytForQtr + ", paytForYear=" + paytForYear + ", totalAmt=" + totalAmt + ", currCd="
				+ currCd + ", currRate=" + currRate + "]";
	}
}
