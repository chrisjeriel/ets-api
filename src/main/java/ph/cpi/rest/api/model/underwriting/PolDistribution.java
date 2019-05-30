package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;

public class PolDistribution {
	private String distNo;
	private String policyNo;
	private String cedingName;
	private String riskDistNo;
	private String status;
	private String insured;
	private BigDecimal sumInsured;
	private BigDecimal premium;
	private String riskName;
	private BigDecimal retLine;
	private String autoCalc;
	
	private BigDecimal ret1SecI;    
	private BigDecimal ret1SecII;   
	private BigDecimal ret1SecIII;  
	private BigDecimal ret1Prem;    
	private BigDecimal ret1CommAmt; 
	
	private BigDecimal ret2SecI;
    private BigDecimal ret2SecII;
    private BigDecimal ret2SecIII;
    private BigDecimal ret2Prem;
    private BigDecimal ret2CommAmt;
    
    private BigDecimal secITotal;
    private BigDecimal secIITotal;
    private BigDecimal secIIITotal;
    private BigDecimal premTotal;
    private BigDecimal commAmtTotal;
    
	public String getDistNo() {
		return distNo;
	}
	public void setDistNo(String distNo) {
		this.distNo = distNo;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getRiskDistNo() {
		return riskDistNo;
	}
	public void setRiskDistNo(String riskDistNo) {
		this.riskDistNo = riskDistNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInsured() {
		return insured;
	}
	public void setInsured(String insured) {
		this.insured = insured;
	}
	public BigDecimal getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(BigDecimal sumInsured) {
		this.sumInsured = sumInsured;
	}
	public BigDecimal getPremium() {
		return premium;
	}
	public void setPremium(BigDecimal premium) {
		this.premium = premium;
	}
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public BigDecimal getRetLine() {
		return retLine;
	}
	public void setRetLine(BigDecimal retLine) {
		this.retLine = retLine;
	}
	public String getAutoCalc() {
		return autoCalc;
	}
	public void setAutoCalc(String autoCalc) {
		this.autoCalc = autoCalc;
	}
	public BigDecimal getRet1SecI() {
		return ret1SecI;
	}
	public void setRet1SecI(BigDecimal ret1SecI) {
		this.ret1SecI = ret1SecI;
	}
	public BigDecimal getRet1SecII() {
		return ret1SecII;
	}
	public void setRet1SecII(BigDecimal ret1SecII) {
		this.ret1SecII = ret1SecII;
	}
	public BigDecimal getRet1SecIII() {
		return ret1SecIII;
	}
	public void setRet1SecIII(BigDecimal ret1SecIII) {
		this.ret1SecIII = ret1SecIII;
	}
	public BigDecimal getRet1Prem() {
		return ret1Prem;
	}
	public void setRet1Prem(BigDecimal ret1Prem) {
		this.ret1Prem = ret1Prem;
	}
	public BigDecimal getRet1CommAmt() {
		return ret1CommAmt;
	}
	public void setRet1CommAmt(BigDecimal ret1CommAmt) {
		this.ret1CommAmt = ret1CommAmt;
	}
	public BigDecimal getRet2SecI() {
		return ret2SecI;
	}
	public void setRet2SecI(BigDecimal ret2SecI) {
		this.ret2SecI = ret2SecI;
	}
	public BigDecimal getRet2SecII() {
		return ret2SecII;
	}
	public void setRet2SecII(BigDecimal ret2SecII) {
		this.ret2SecII = ret2SecII;
	}
	public BigDecimal getRet2SecIII() {
		return ret2SecIII;
	}
	public void setRet2SecIII(BigDecimal ret2SecIII) {
		this.ret2SecIII = ret2SecIII;
	}
	public BigDecimal getRet2Prem() {
		return ret2Prem;
	}
	public void setRet2Prem(BigDecimal ret2Prem) {
		this.ret2Prem = ret2Prem;
	}
	public BigDecimal getRet2CommAmt() {
		return ret2CommAmt;
	}
	public void setRet2CommAmt(BigDecimal ret2CommAmt) {
		this.ret2CommAmt = ret2CommAmt;
	}
	public BigDecimal getSecITotal() {
		return secITotal;
	}
	public void setSecITotal(BigDecimal secITotal) {
		this.secITotal = secITotal;
	}
	public BigDecimal getSecIITotal() {
		return secIITotal;
	}
	public void setSecIITotal(BigDecimal secIITotal) {
		this.secIITotal = secIITotal;
	}
	public BigDecimal getSecIIITotal() {
		return secIIITotal;
	}
	public void setSecIIITotal(BigDecimal secIIITotal) {
		this.secIIITotal = secIIITotal;
	}
	public BigDecimal getPremTotal() {
		return premTotal;
	}
	public void setPremTotal(BigDecimal premTotal) {
		this.premTotal = premTotal;
	}
	public BigDecimal getCommAmtTotal() {
		return commAmtTotal;
	}
	public void setCommAmtTotal(BigDecimal commAmtTotal) {
		this.commAmtTotal = commAmtTotal;
	}
	@Override
	public String toString() {
		return "PolDistribution [distNo=" + distNo + ", policyNo=" + policyNo + ", cedingName=" + cedingName
				+ ", riskDistNo=" + riskDistNo + ", status=" + status + ", insured=" + insured + ", sumInsured="
				+ sumInsured + ", premium=" + premium + ", riskName=" + riskName + ", retLine=" + retLine
				+ ", autoCalc=" + autoCalc + ", ret1SecI=" + ret1SecI + ", ret1SecII=" + ret1SecII + ", ret1SecIII="
				+ ret1SecIII + ", ret1Prem=" + ret1Prem + ", ret1CommAmt=" + ret1CommAmt + ", ret2SecI=" + ret2SecI
				+ ", ret2SecII=" + ret2SecII + ", ret2SecIII=" + ret2SecIII + ", ret2Prem=" + ret2Prem
				+ ", ret2CommAmt=" + ret2CommAmt + ", secITotal=" + secITotal + ", secIITotal=" + secIITotal
				+ ", secIIITotal=" + secIIITotal + ", premTotal=" + premTotal + ", commAmtTotal=" + commAmtTotal + "]";
	}
    
    
}
