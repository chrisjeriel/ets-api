package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

public class SaveAcitJVRiskMgtAllocRequest {

	private Integer tranType;
	private Integer allocTranId;
	private Integer paytForQtr;
	private Integer paytForYear;
	private BigDecimal totalAmt;
	private String currCd;
	private BigDecimal currRate;
	private List<SaveRiskMgtAlloc> saveRiskMgtAlloc;
	
	public Integer getTranType() {
		return tranType;
	}
	public void setTranType(Integer tranType) {
		this.tranType = tranType;
	}
	public Integer getAllocTranId() {
		return allocTranId;
	}
	public void setAllocTranId(Integer allocTranId) {
		this.allocTranId = allocTranId;
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
	public List<SaveRiskMgtAlloc> getSaveRiskMgtAlloc() {
		return saveRiskMgtAlloc;
	}
	public void setSaveRiskMgtAlloc(List<SaveRiskMgtAlloc> saveRiskMgtAlloc) {
		this.saveRiskMgtAlloc = saveRiskMgtAlloc;
	}
	@Override
	public String toString() {
		return "SaveAcitJVRiskMgtAllocRequest [tranType=" + tranType + ", allocTranId=" + allocTranId + ", paytForQtr="
				+ paytForQtr + ", paytForYear=" + paytForYear + ", totalAmt=" + totalAmt + ", currCd=" + currCd
				+ ", currRate=" + currRate + ", saveRiskMgtAlloc=" + saveRiskMgtAlloc + "]";
	}
}

class SaveRiskMgtAlloc {
	private String cedingId;
	private String finalFromDate;
	private String finalToDate;
	private BigDecimal finalPremWrtn;
	private BigDecimal finalNetPrem;
	private BigDecimal finalShrPct;
	private BigDecimal finalShrAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getFinalFromDate() {
		return finalFromDate;
	}
	public void setFinalFromDate(String finalFromDate) {
		this.finalFromDate = finalFromDate;
	}
	public String getFinalToDate() {
		return finalToDate;
	}
	public void setFinalToDate(String finalToDate) {
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
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "SaveRiskMgtAlloc [cedingId=" + cedingId + ", finalFromDate=" + finalFromDate + ", finalToDate="
				+ finalToDate + ", finalPremWrtn=" + finalPremWrtn + ", finalNetPrem=" + finalNetPrem + ", finalShrPct="
				+ finalShrPct + ", finalShrAmt=" + finalShrAmt + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
