package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

public class AcitDcbBankDetails {
	private Integer bankCd;
	private String bankName;
	private String acctNo;
	private String paytMode;
	private String paytModeDesc;
	private BigDecimal orgAmt;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal localAmt;
	public Integer getBankCd() {
		return bankCd;
	}
	public void setBankCd(Integer bankCd) {
		this.bankCd = bankCd;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
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
		return "AcitDcbBankDetails [bankCd=" + bankCd + ", bankName=" + bankName + ", acctNo=" + acctNo + ", paytMode="
				+ paytMode + ", paytModeDesc=" + paytModeDesc + ", orgAmt=" + orgAmt + ", currCd=" + currCd
				+ ", currRate=" + currRate + ", localAmt=" + localAmt + "]";
	}
	
	
}
