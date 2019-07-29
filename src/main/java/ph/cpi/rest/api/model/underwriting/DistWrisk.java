package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class DistWrisk {
	private Integer riskDistId;
	private Integer altNo;
	private Integer coinsGrpId;
	private String status;
	private BigDecimal retLineAmt;
	private Integer retOneLines;
	private Integer retTwoLines;
	private String autoCalc;
	private BigDecimal tsiAmt;
	private BigDecimal premAmt;
	private BigDecimal vatRiRt;
	private DateTime negateDate;
	private String negateUser;
	private String seciiPremTag;
	private Double trtyLimitSec2;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private BigDecimal secIIInputLimit;
	
	List<DistRiskWtreaty> distRiskWtreaty;
	
	private BigDecimal retOneTsiAmt;
	private BigDecimal retOnePremAmt;
	private BigDecimal retTwoTsiAmt;
	private BigDecimal retTwoPremAmt;
	private BigDecimal totalTsiAmt;
	private BigDecimal totalPremAmt;
	public Integer getRiskDistId() {
		return riskDistId;
	}
	public void setRiskDistId(Integer riskDistId) {
		this.riskDistId = riskDistId;
	}
	public Integer getAltNo() {
		return altNo;
	}
	public void setAltNo(Integer altNo) {
		this.altNo = altNo;
	}
	public Integer getCoinsGrpId() {
		return coinsGrpId;
	}
	public void setCoinsGrpId(Integer coinsGrpId) {
		this.coinsGrpId = coinsGrpId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BigDecimal getRetLineAmt() {
		return retLineAmt;
	}
	public void setRetLineAmt(BigDecimal retLineAmt) {
		this.retLineAmt = retLineAmt;
	}
	public Integer getRetOneLines() {
		return retOneLines;
	}
	public void setRetOneLines(Integer retOneLines) {
		this.retOneLines = retOneLines;
	}
	public Integer getRetTwoLines() {
		return retTwoLines;
	}
	public void setRetTwoLines(Integer retTwoLines) {
		this.retTwoLines = retTwoLines;
	}
	public String getAutoCalc() {
		return autoCalc;
	}
	public void setAutoCalc(String autoCalc) {
		this.autoCalc = autoCalc;
	}
	public BigDecimal getTsiAmt() {
		return tsiAmt;
	}
	public void setTsiAmt(BigDecimal tsiAmt) {
		this.tsiAmt = tsiAmt;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}
	public BigDecimal getVatRiRt() {
		return vatRiRt;
	}
	public void setVatRiRt(BigDecimal vatRiRt) {
		this.vatRiRt = vatRiRt;
	}
	public DateTime getNegateDate() {
		return negateDate;
	}
	public void setNegateDate(DateTime negateDate) {
		this.negateDate = negateDate;
	}
	public String getNegateUser() {
		return negateUser;
	}
	public void setNegateUser(String negateUser) {
		this.negateUser = negateUser;
	}
	public String getSeciiPremTag() {
		return seciiPremTag;
	}
	public void setSeciiPremTag(String seciiPremTag) {
		this.seciiPremTag = seciiPremTag;
	}
	public Double getTrtyLimitSec2() {
		return trtyLimitSec2;
	}
	public void setTrtyLimitSec2(Double trtyLimitSec2) {
		this.trtyLimitSec2 = trtyLimitSec2;
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
	public BigDecimal getSecIIInputLimit() {
		return secIIInputLimit;
	}
	public void setSecIIInputLimit(BigDecimal secIIInputLimit) {
		this.secIIInputLimit = secIIInputLimit;
	}
	public List<DistRiskWtreaty> getDistRiskWtreaty() {
		return distRiskWtreaty;
	}
	public void setDistRiskWtreaty(List<DistRiskWtreaty> distRiskWtreaty) {
		this.distRiskWtreaty = distRiskWtreaty;
	}
	public BigDecimal getRetOneTsiAmt() {
		return retOneTsiAmt;
	}
	public void setRetOneTsiAmt(BigDecimal retOneTsiAmt) {
		this.retOneTsiAmt = retOneTsiAmt;
	}
	public BigDecimal getRetOnePremAmt() {
		return retOnePremAmt;
	}
	public void setRetOnePremAmt(BigDecimal retOnePremAmt) {
		this.retOnePremAmt = retOnePremAmt;
	}
	public BigDecimal getRetTwoTsiAmt() {
		return retTwoTsiAmt;
	}
	public void setRetTwoTsiAmt(BigDecimal retTwoTsiAmt) {
		this.retTwoTsiAmt = retTwoTsiAmt;
	}
	public BigDecimal getRetTwoPremAmt() {
		return retTwoPremAmt;
	}
	public void setRetTwoPremAmt(BigDecimal retTwoPremAmt) {
		this.retTwoPremAmt = retTwoPremAmt;
	}
	public BigDecimal getTotalTsiAmt() {
		return totalTsiAmt;
	}
	public void setTotalTsiAmt(BigDecimal totalTsiAmt) {
		this.totalTsiAmt = totalTsiAmt;
	}
	public BigDecimal getTotalPremAmt() {
		return totalPremAmt;
	}
	public void setTotalPremAmt(BigDecimal totalPremAmt) {
		this.totalPremAmt = totalPremAmt;
	}
	@Override
	public String toString() {
		return "DistWrisk [riskDistId=" + riskDistId + ", altNo=" + altNo + ", coinsGrpId=" + coinsGrpId + ", status="
				+ status + ", retLineAmt=" + retLineAmt + ", retOneLines=" + retOneLines + ", retTwoLines="
				+ retTwoLines + ", autoCalc=" + autoCalc + ", tsiAmt=" + tsiAmt + ", premAmt=" + premAmt + ", vatRiRt="
				+ vatRiRt + ", negateDate=" + negateDate + ", negateUser=" + negateUser + ", seciiPremTag="
				+ seciiPremTag + ", trtyLimitSec2=" + trtyLimitSec2 + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", secIIInputLimit="
				+ secIIInputLimit + ", distRiskWtreaty=" + distRiskWtreaty + ", retOneTsiAmt=" + retOneTsiAmt
				+ ", retOnePremAmt=" + retOnePremAmt + ", retTwoTsiAmt=" + retTwoTsiAmt + ", retTwoPremAmt="
				+ retTwoPremAmt + ", totalTsiAmt=" + totalTsiAmt + ", totalPremAmt=" + totalPremAmt + "]";
	}
	
	}
