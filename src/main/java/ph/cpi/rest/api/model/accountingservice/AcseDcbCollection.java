package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;

public class AcseDcbCollection {
	private String paytMode;
	private String paytModeDesc;
	private BigDecimal orgAmt;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal localAmt;
	public String getPaytMode() {
		return paytMode;
	}
	public void setPaytMode(String paytMode) {
		this.paytMode = paytMode;
	}
	public String getPaytModeDesc() {
		return paytModeDesc;
	}
	public void setPaytModeDesc(String paytModeDesc) {
		this.paytModeDesc = paytModeDesc;
	}
	public BigDecimal getOrgAmt() {
		return orgAmt;
	}
	public void setOrgAmt(BigDecimal orgAmt) {
		this.orgAmt = orgAmt;
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
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	@Override
	public String toString() {
		return "AcseDcbCollection [paytMode=" + paytMode + ", paytModeDesc=" + paytModeDesc + ", orgAmt=" + orgAmt
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", localAmt=" + localAmt + "]";
	}
	
}
