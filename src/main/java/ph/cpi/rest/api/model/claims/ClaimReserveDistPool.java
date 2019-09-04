package ph.cpi.rest.api.model.claims;

import java.math.BigDecimal;

public class ClaimReserveDistPool {
	private String treatyAbbr;
	private String cedingAbbr;
	private Integer ret1Lines;
	private BigDecimal ret1Amt;
	private BigDecimal ret1PaytAmt;
	private Integer ret2Lines;
	private BigDecimal ret2Amt;
	private BigDecimal ret2PaytAmt;
	public String getTreatyAbbr() {
		return treatyAbbr;
	}
	public void setTreatyAbbr(String treatyAbbr) {
		this.treatyAbbr = treatyAbbr;
	}
	public String getCedingAbbr() {
		return cedingAbbr;
	}
	public void setCedingAbbr(String cedingAbbr) {
		this.cedingAbbr = cedingAbbr;
	}
	public Integer getRet1Lines() {
		return ret1Lines;
	}
	public void setRet1Lines(Integer ret1Lines) {
		this.ret1Lines = ret1Lines;
	}
	public BigDecimal getRet1Amt() {
		return ret1Amt;
	}
	public void setRet1Amt(BigDecimal ret1Amt) {
		this.ret1Amt = ret1Amt;
	}
	public BigDecimal getRet1PaytAmt() {
		return ret1PaytAmt;
	}
	public void setRet1PaytAmt(BigDecimal ret1PaytAmt) {
		this.ret1PaytAmt = ret1PaytAmt;
	}
	public Integer getRet2Lines() {
		return ret2Lines;
	}
	public void setRet2Lines(Integer ret2Lines) {
		this.ret2Lines = ret2Lines;
	}
	public BigDecimal getRet2Amt() {
		return ret2Amt;
	}
	public void setRet2Amt(BigDecimal ret2Amt) {
		this.ret2Amt = ret2Amt;
	}
	public BigDecimal getRet2PaytAmt() {
		return ret2PaytAmt;
	}
	public void setRet2PaytAmt(BigDecimal ret2PaytAmt) {
		this.ret2PaytAmt = ret2PaytAmt;
	}
	@Override
	public String toString() {
		return "ClaimReserveDistPool [treatyAbbr=" + treatyAbbr + ", cedingAbbr=" + cedingAbbr + ", ret1Lines="
				+ ret1Lines + ", ret1Amt=" + ret1Amt + ", ret1PaytAmt=" + ret1PaytAmt + ", ret2Lines=" + ret2Lines
				+ ", ret2Amt=" + ret2Amt + ", ret2PaytAmt=" + ret2PaytAmt + "]";
	}
	
}
