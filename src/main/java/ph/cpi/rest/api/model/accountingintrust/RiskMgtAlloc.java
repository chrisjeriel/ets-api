package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class RiskMgtAlloc {

	private Integer tranId;
	private Integer allocTranId;
	private Integer riskMm;
	private Integer riskYear;
	private String cedingId;
	private String cedingName;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal totalRiskmgtCharge;
	private DateTime actualFromDate;
	private DateTime actualToDate;
	private BigDecimal actualPremWrtn;
	private BigDecimal actualNetPrem;
	private BigDecimal actualShrPct;
	private BigDecimal actualShrAmt;
	private DateTime servfeeFromDate;
	private DateTime servfeeToDate;
	private BigDecimal servfeePremWrtn;
	private BigDecimal servfeeNetPrem;
	private BigDecimal servfeeShrPct;
	private BigDecimal servfeeShrAmt;
	private DateTime finalFromDate;
	private DateTime finalToDate;
	private BigDecimal finalPremWrtn;
	private BigDecimal finalNetPrem;
	private BigDecimal finalShrPct;
	private BigDecimal finalShrAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private BigDecimal riskMgtQtr1;
	private BigDecimal riskMgtQtr2;
	private BigDecimal riskMgtQtr3;
	private BigDecimal riskMgtQtr4;
	private BigDecimal premWrtnCede;
	private BigDecimal netRate;
	private BigDecimal baseShrPct;
	private BigDecimal baseShrAmt;
	private Integer riskQtr;
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getAllocTranId() {
		return allocTranId;
	}
	public void setAllocTranId(Integer allocTranId) {
		this.allocTranId = allocTranId;
	}
	public Integer getRiskMm() {
		return riskMm;
	}
	public void setRiskMm(Integer riskMm) {
		this.riskMm = riskMm;
	}
	public Integer getRiskYear() {
		return riskYear;
	}
	public void setRiskYear(Integer riskYear) {
		this.riskYear = riskYear;
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
	public BigDecimal getTotalRiskmgtCharge() {
		return totalRiskmgtCharge;
	}
	public void setTotalRiskmgtCharge(BigDecimal totalRiskmgtCharge) {
		this.totalRiskmgtCharge = totalRiskmgtCharge;
	}
	public DateTime getActualFromDate() {
		return actualFromDate;
	}
	public void setActualFromDate(DateTime actualFromDate) {
		this.actualFromDate = actualFromDate;
	}
	public DateTime getActualToDate() {
		return actualToDate;
	}
	public void setActualToDate(DateTime actualToDate) {
		this.actualToDate = actualToDate;
	}
	public BigDecimal getActualPremWrtn() {
		return actualPremWrtn;
	}
	public void setActualPremWrtn(BigDecimal actualPremWrtn) {
		this.actualPremWrtn = actualPremWrtn;
	}
	public BigDecimal getActualNetPrem() {
		return actualNetPrem;
	}
	public void setActualNetPrem(BigDecimal actualNetPrem) {
		this.actualNetPrem = actualNetPrem;
	}
	public BigDecimal getActualShrPct() {
		return actualShrPct;
	}
	public void setActualShrPct(BigDecimal actualShrPct) {
		this.actualShrPct = actualShrPct;
	}
	public BigDecimal getActualShrAmt() {
		return actualShrAmt;
	}
	public void setActualShrAmt(BigDecimal actualShrAmt) {
		this.actualShrAmt = actualShrAmt;
	}
	public DateTime getServfeeFromDate() {
		return servfeeFromDate;
	}
	public void setServfeeFromDate(DateTime servfeeFromDate) {
		this.servfeeFromDate = servfeeFromDate;
	}
	public DateTime getServfeeToDate() {
		return servfeeToDate;
	}
	public void setServfeeToDate(DateTime servfeeToDate) {
		this.servfeeToDate = servfeeToDate;
	}
	public BigDecimal getServfeePremWrtn() {
		return servfeePremWrtn;
	}
	public void setServfeePremWrtn(BigDecimal servfeePremWrtn) {
		this.servfeePremWrtn = servfeePremWrtn;
	}
	public BigDecimal getServfeeNetPrem() {
		return servfeeNetPrem;
	}
	public void setServfeeNetPrem(BigDecimal servfeeNetPrem) {
		this.servfeeNetPrem = servfeeNetPrem;
	}
	public BigDecimal getServfeeShrPct() {
		return servfeeShrPct;
	}
	public void setServfeeShrPct(BigDecimal servfeeShrPct) {
		this.servfeeShrPct = servfeeShrPct;
	}
	public BigDecimal getServfeeShrAmt() {
		return servfeeShrAmt;
	}
	public void setServfeeShrAmt(BigDecimal servfeeShrAmt) {
		this.servfeeShrAmt = servfeeShrAmt;
	}
	public DateTime getFinalFromDate() {
		return finalFromDate;
	}
	public void setFinalFromDate(DateTime finalFromDate) {
		this.finalFromDate = finalFromDate;
	}
	public DateTime getFinalToDate() {
		return finalToDate;
	}
	public void setFinalToDate(DateTime finalToDate) {
		this.finalToDate = finalToDate;
	}
	public BigDecimal getFinalPremWrtn() {
		return finalPremWrtn;
	}
	public void setFinalPremWrtn(BigDecimal finalPremWrtn) {
		this.finalPremWrtn = finalPremWrtn;
	}
	public BigDecimal getFinalNetPrem() {
		return finalNetPrem;
	}
	public void setFinalNetPrem(BigDecimal finalNetPrem) {
		this.finalNetPrem = finalNetPrem;
	}
	public BigDecimal getFinalShrPct() {
		return finalShrPct;
	}
	public void setFinalShrPct(BigDecimal finalShrPct) {
		this.finalShrPct = finalShrPct;
	}
	public BigDecimal getFinalShrAmt() {
		return finalShrAmt;
	}
	public void setFinalShrAmt(BigDecimal finalShrAmt) {
		this.finalShrAmt = finalShrAmt;
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
	public BigDecimal getRiskMgtQtr1() {
		return riskMgtQtr1;
	}
	public void setRiskMgtQtr1(BigDecimal riskMgtQtr1) {
		this.riskMgtQtr1 = riskMgtQtr1;
	}
	public BigDecimal getRiskMgtQtr2() {
		return riskMgtQtr2;
	}
	public void setRiskMgtQtr2(BigDecimal riskMgtQtr2) {
		this.riskMgtQtr2 = riskMgtQtr2;
	}
	public BigDecimal getRiskMgtQtr3() {
		return riskMgtQtr3;
	}
	public void setRiskMgtQtr3(BigDecimal riskMgtQtr3) {
		this.riskMgtQtr3 = riskMgtQtr3;
	}
	public BigDecimal getRiskMgtQtr4() {
		return riskMgtQtr4;
	}
	public void setRiskMgtQtr4(BigDecimal riskMgtQtr4) {
		this.riskMgtQtr4 = riskMgtQtr4;
	}
	public BigDecimal getPremWrtnCede() {
		return premWrtnCede;
	}
	public void setPremWrtnCede(BigDecimal premWrtnCede) {
		this.premWrtnCede = premWrtnCede;
	}
	public BigDecimal getNetRate() {
		return netRate;
	}
	public void setNetRate(BigDecimal netRate) {
		this.netRate = netRate;
	}
	public BigDecimal getBaseShrPct() {
		return baseShrPct;
	}
	public void setBaseShrPct(BigDecimal baseShrPct) {
		this.baseShrPct = baseShrPct;
	}
	public BigDecimal getBaseShrAmt() {
		return baseShrAmt;
	}
	public void setBaseShrAmt(BigDecimal baseShrAmt) {
		this.baseShrAmt = baseShrAmt;
	}
	public Integer getRiskQtr() {
		return riskQtr;
	}
	public void setRiskQtr(Integer riskQtr) {
		this.riskQtr = riskQtr;
	}
	@Override
	public String toString() {
		return "RiskMgtAlloc [tranId=" + tranId + ", allocTranId=" + allocTranId + ", riskMm=" + riskMm + ", riskYear="
				+ riskYear + ", cedingId=" + cedingId + ", cedingName=" + cedingName + ", currCd=" + currCd
				+ ", currRate=" + currRate + ", totalRiskmgtCharge=" + totalRiskmgtCharge + ", actualFromDate="
				+ actualFromDate + ", actualToDate=" + actualToDate + ", actualPremWrtn=" + actualPremWrtn
				+ ", actualNetPrem=" + actualNetPrem + ", actualShrPct=" + actualShrPct + ", actualShrAmt="
				+ actualShrAmt + ", servfeeFromDate=" + servfeeFromDate + ", servfeeToDate=" + servfeeToDate
				+ ", servfeePremWrtn=" + servfeePremWrtn + ", servfeeNetPrem=" + servfeeNetPrem + ", servfeeShrPct="
				+ servfeeShrPct + ", servfeeShrAmt=" + servfeeShrAmt + ", finalFromDate=" + finalFromDate
				+ ", finalToDate=" + finalToDate + ", finalPremWrtn=" + finalPremWrtn + ", finalNetPrem=" + finalNetPrem
				+ ", finalShrPct=" + finalShrPct + ", finalShrAmt=" + finalShrAmt + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", riskMgtQtr1=" + riskMgtQtr1 + ", riskMgtQtr2=" + riskMgtQtr2 + ", riskMgtQtr3=" + riskMgtQtr3
				+ ", riskMgtQtr4=" + riskMgtQtr4 + ", premWrtnCede=" + premWrtnCede + ", netRate=" + netRate
				+ ", baseShrPct=" + baseShrPct + ", baseShrAmt=" + baseShrAmt + ", riskQtr=" + riskQtr + "]";
	}
}
