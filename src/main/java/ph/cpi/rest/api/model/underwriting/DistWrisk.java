package ph.cpi.rest.api.model.underwriting;

import java.util.List;

import org.joda.time.DateTime;

public class DistWrisk {
	private Integer riskDistId;
	private Integer altNo;
	private Integer coinsGrpId;
	private String status;
	private Double retLineAmt;
	private Double retOneLines;
	private Double retTwoLines;
	private String autoCalc;
	private Double tsiAmt;
	private Double premAmt;
	private Double vatRiRt;
	private DateTime negateDate;
	private String negateUser;
	private String seciiPremTag;
	private Double trtyLimitSec2;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	List<DistRiskWtreaty> distRiskWtreaty;
	
	private Double retOneTsiAmt;
	private Double retOnePremAmt;
	private Double retTwoTsiAmt;
	private Double retTwoPremAmt;
	private Double totalTsiAmt;
	private Double totalPremAmt;
	
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
	public Double getRetLineAmt() {
		return retLineAmt;
	}
	public void setRetLineAmt(Double retLineAmt) {
		this.retLineAmt = retLineAmt;
	}
	public Double getRetOneLines() {
		return retOneLines;
	}
	public void setRetOneLines(Double retOneLines) {
		this.retOneLines = retOneLines;
	}
	public Double getRetTwoLines() {
		return retTwoLines;
	}
	public void setRetTwoLines(Double retTwoLines) {
		this.retTwoLines = retTwoLines;
	}
	public String getAutoCalc() {
		return autoCalc;
	}
	public void setAutoCalc(String autoCalc) {
		this.autoCalc = autoCalc;
	}
	public Double getTsiAmt() {
		return tsiAmt;
	}
	public void setTsiAmt(Double tsiAmt) {
		this.tsiAmt = tsiAmt;
	}
	public Double getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(Double premAmt) {
		this.premAmt = premAmt;
	}
	public Double getVatRiRt() {
		return vatRiRt;
	}
	public void setVatRiRt(Double vatRiRt) {
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
	public List<DistRiskWtreaty> getDistRiskWtreaty() {
		return distRiskWtreaty;
	}
	public void setDistRiskWtreaty(List<DistRiskWtreaty> distRiskWtreaty) {
		this.distRiskWtreaty = distRiskWtreaty;
	}
	public Double getRetOneTsiAmt() {
		return retOneTsiAmt;
	}
	public void setRetOneTsiAmt(Double retOneTsiAmt) {
		this.retOneTsiAmt = retOneTsiAmt;
	}
	public Double getRetOnePremAmt() {
		return retOnePremAmt;
	}
	public void setRetOnePremAmt(Double retOnePremAmt) {
		this.retOnePremAmt = retOnePremAmt;
	}
	public Double getRetTwoTsiAmt() {
		return retTwoTsiAmt;
	}
	public void setRetTwoTsiAmt(Double retTwoTsiAmt) {
		this.retTwoTsiAmt = retTwoTsiAmt;
	}
	public Double getRetTwoPremAmt() {
		return retTwoPremAmt;
	}
	public void setRetTwoPremAmt(Double retTwoPremAmt) {
		this.retTwoPremAmt = retTwoPremAmt;
	}
	public Double getTotalTsiAmt() {
		return totalTsiAmt;
	}
	public void setTotalTsiAmt(Double totalTsiAmt) {
		this.totalTsiAmt = totalTsiAmt;
	}
	public Double getTotalPremAmt() {
		return totalPremAmt;
	}
	public void setTotalPremAmt(Double totalPremAmt) {
		this.totalPremAmt = totalPremAmt;
	}
	public String getSeciiPremTag() {
		return seciiPremTag;
	}
	public void setSeciiPremTag(String seciiPremTag) {
		this.seciiPremTag = seciiPremTag;
	}
	@Override
	public String toString() {
		return "DistWrisk [riskDistId=" + riskDistId + ", altNo=" + altNo + ", coinsGrpId=" + coinsGrpId + ", status="
				+ status + ", retLineAmt=" + retLineAmt + ", retOneLines=" + retOneLines + ", retTwoLines="
				+ retTwoLines + ", autoCalc=" + autoCalc + ", tsiAmt=" + tsiAmt + ", premAmt=" + premAmt + ", vatRiRt="
				+ vatRiRt + ", negateDate=" + negateDate + ", negateUser=" + negateUser + ", seciiPremTag="
				+ seciiPremTag + ", trtyLimitSec2=" + trtyLimitSec2 + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", distRiskWtreaty="
				+ distRiskWtreaty + ", retOneTsiAmt=" + retOneTsiAmt + ", retOnePremAmt=" + retOnePremAmt
				+ ", retTwoTsiAmt=" + retTwoTsiAmt + ", retTwoPremAmt=" + retTwoPremAmt + ", totalTsiAmt=" + totalTsiAmt
				+ ", totalPremAmt=" + totalPremAmt + "]";
	}
}
