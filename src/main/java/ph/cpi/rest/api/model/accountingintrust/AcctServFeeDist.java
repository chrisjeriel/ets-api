package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcctServFeeDist {

	private Integer reqId;
	private String sfeeQtr;
	private Integer sfeeYear;
	private Integer groupId;
	private String groupName;
	private Double groupShrPct;
	private String currCd;
	private Double currRt;
	private BigDecimal groupShrAmt;
	private BigDecimal totalDueLocal;
	private BigDecimal totalSfee;
	private BigDecimal totalVat;
	private BigDecimal totalWhtax;
	private BigDecimal totalDue;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private Integer quarter;
	private BigDecimal premWrtnCede;
	private BigDecimal netPremWrtn;
	
	private String cedingId;
	private String cedingName;
	private Double actualShrPct;
	private BigDecimal actualShrAmt;
	private Double baseShrPct;
	private BigDecimal baseShrAmt;
	private BigDecimal netDueLocal;
	private BigDecimal sfeeAmt;
	private BigDecimal vatAmt;
	private BigDecimal whtaxAmt;
	private BigDecimal netDue;
	private Integer invoiceId;
	
	private BigDecimal grossShrAmt1;
	private BigDecimal grossShrAmt2;
	private BigDecimal grossShrAmt3;
	private BigDecimal grossShrAmt4;
	private BigDecimal netSfee;
	
	private AcctServFeeTotals servFeeTotals;
	
	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	public String getSfeeQtr() {
		return sfeeQtr;
	}
	public void setSfeeQtr(String sfeeQtr) {
		this.sfeeQtr = sfeeQtr;
	}
	public Integer getSfeeYear() {
		return sfeeYear;
	}
	public void setSfeeYear(Integer sfeeYear) {
		this.sfeeYear = sfeeYear;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Double getGroupShrPct() {
		return groupShrPct;
	}
	public void setGroupShrPct(Double groupShrPct) {
		this.groupShrPct = groupShrPct;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public Double getCurrRt() {
		return currRt;
	}
	public void setCurrRt(Double currRt) {
		this.currRt = currRt;
	}
	public BigDecimal getGroupShrAmt() {
		return groupShrAmt;
	}
	public void setGroupShrAmt(BigDecimal groupShrAmt) {
		this.groupShrAmt = groupShrAmt;
	}
	public BigDecimal getTotalDueLocal() {
		return totalDueLocal;
	}
	public void setTotalDueLocal(BigDecimal totalDueLocal) {
		this.totalDueLocal = totalDueLocal;
	}
	public BigDecimal getTotalSfee() {
		return totalSfee;
	}
	public void setTotalSfee(BigDecimal totalSfee) {
		this.totalSfee = totalSfee;
	}
	public BigDecimal getTotalVat() {
		return totalVat;
	}
	public void setTotalVat(BigDecimal totalVat) {
		this.totalVat = totalVat;
	}
	public BigDecimal getTotalWhtax() {
		return totalWhtax;
	}
	public void setTotalWhtax(BigDecimal totalWhtax) {
		this.totalWhtax = totalWhtax;
	}
	public BigDecimal getTotalDue() {
		return totalDue;
	}
	public void setTotalDue(BigDecimal totalDue) {
		this.totalDue = totalDue;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	public Integer getQuarter() {
		return quarter;
	}
	public void setQuarter(Integer quarter) {
		this.quarter = quarter;
	}
	public BigDecimal getPremWrtnCede() {
		return premWrtnCede;
	}
	public void setPremWrtnCede(BigDecimal premWrtnCede) {
		this.premWrtnCede = premWrtnCede;
	}
	public BigDecimal getNetPremWrtn() {
		return netPremWrtn;
	}
	public void setNetPremWrtn(BigDecimal netPremWrtn) {
		this.netPremWrtn = netPremWrtn;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public Double getActualShrPct() {
		return actualShrPct;
	}
	public void setActualShrPct(Double actualShrPct) {
		this.actualShrPct = actualShrPct;
	}
	public BigDecimal getActualShrAmt() {
		return actualShrAmt;
	}
	public void setActualShrAmt(BigDecimal actualShrAmt) {
		this.actualShrAmt = actualShrAmt;
	}
	public Double getBaseShrPct() {
		return baseShrPct;
	}
	public void setBaseShrPct(Double baseShrPct) {
		this.baseShrPct = baseShrPct;
	}
	public BigDecimal getBaseShrAmt() {
		return baseShrAmt;
	}
	public void setBaseShrAmt(BigDecimal baseShrAmt) {
		this.baseShrAmt = baseShrAmt;
	}
	public BigDecimal getNetDueLocal() {
		return netDueLocal;
	}
	public void setNetDueLocal(BigDecimal netDueLocal) {
		this.netDueLocal = netDueLocal;
	}
	public BigDecimal getSfeeAmt() {
		return sfeeAmt;
	}
	public void setSfeeAmt(BigDecimal sfeeAmt) {
		this.sfeeAmt = sfeeAmt;
	}
	public BigDecimal getVatAmt() {
		return vatAmt;
	}
	public void setVatAmt(BigDecimal vatAmt) {
		this.vatAmt = vatAmt;
	}
	public BigDecimal getWhtaxAmt() {
		return whtaxAmt;
	}
	public void setWhtaxAmt(BigDecimal whtaxAmt) {
		this.whtaxAmt = whtaxAmt;
	}
	public BigDecimal getNetDue() {
		return netDue;
	}
	public void setNetDue(BigDecimal netDue) {
		this.netDue = netDue;
	}
	public Integer getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}
	public BigDecimal getGrossShrAmt1() {
		return grossShrAmt1;
	}
	public void setGrossShrAmt1(BigDecimal grossShrAmt1) {
		this.grossShrAmt1 = grossShrAmt1;
	}
	public BigDecimal getGrossShrAmt2() {
		return grossShrAmt2;
	}
	public void setGrossShrAmt2(BigDecimal grossShrAmt2) {
		this.grossShrAmt2 = grossShrAmt2;
	}
	public BigDecimal getGrossShrAmt3() {
		return grossShrAmt3;
	}
	public void setGrossShrAmt3(BigDecimal grossShrAmt3) {
		this.grossShrAmt3 = grossShrAmt3;
	}
	public BigDecimal getGrossShrAmt4() {
		return grossShrAmt4;
	}
	public void setGrossShrAmt4(BigDecimal grossShrAmt4) {
		this.grossShrAmt4 = grossShrAmt4;
	}
	public BigDecimal getNetSfee() {
		return netSfee;
	}
	public void setNetSfee(BigDecimal netSfee) {
		this.netSfee = netSfee;
	}
	public AcctServFeeTotals getServFeeTotals() {
		return servFeeTotals;
	}
	public void setServFeeTotals(AcctServFeeTotals servFeeTotals) {
		this.servFeeTotals = servFeeTotals;
	}
	@Override
	public String toString() {
		return "AcctServFeeDist [reqId=" + reqId + ", sfeeQtr=" + sfeeQtr + ", sfeeYear=" + sfeeYear + ", groupId="
				+ groupId + ", groupName=" + groupName + ", groupShrPct=" + groupShrPct + ", currCd=" + currCd
				+ ", currRt=" + currRt + ", groupShrAmt=" + groupShrAmt + ", totalDueLocal=" + totalDueLocal
				+ ", totalSfee=" + totalSfee + ", totalVat=" + totalVat + ", totalWhtax=" + totalWhtax + ", totalDue="
				+ totalDue + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", quarter=" + quarter + ", premWrtnCede=" + premWrtnCede
				+ ", netPremWrtn=" + netPremWrtn + ", cedingId=" + cedingId + ", cedingName=" + cedingName
				+ ", actualShrPct=" + actualShrPct + ", actualShrAmt=" + actualShrAmt + ", baseShrPct=" + baseShrPct
				+ ", baseShrAmt=" + baseShrAmt + ", netDueLocal=" + netDueLocal + ", sfeeAmt=" + sfeeAmt + ", vatAmt="
				+ vatAmt + ", whtaxAmt=" + whtaxAmt + ", netDue=" + netDue + ", invoiceId=" + invoiceId
				+ ", grossShrAmt1=" + grossShrAmt1 + ", grossShrAmt2=" + grossShrAmt2 + ", grossShrAmt3=" + grossShrAmt3
				+ ", grossShrAmt4=" + grossShrAmt4 + ", netSfee=" + netSfee + ", servFeeTotals=" + servFeeTotals + "]";
	}
}
