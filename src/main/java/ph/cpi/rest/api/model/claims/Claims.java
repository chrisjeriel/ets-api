package ph.cpi.rest.api.model.claims;

import java.util.List;

import org.joda.time.DateTime;

public class Claims {
	private Integer claimId;
	private String claimNo;
	private String cedingId;
	private String cedingName;
	private String clmStatCd;
	private String clmStatus;
	private String policyNo;
	private String insuredDesc;
	private Integer riskId;
	private String riskName;
	private DateTime lossDate;
	private String lossDtl;
	private String currencyCd;
	private String totalLossExpRes;
	private String totalLossExpPd;
	private String processedBy;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	private List<ClaimAdjuster> clmAdjusterList;
	private ClaimProject clmProject;
	private List<ClaimDeductibles> clmDeductibles;

	public Integer getClaimId() {
		return claimId;
	}

	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}

	public String getClaimNo() {
		return claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
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

	public String getClmStatCd() {
		return clmStatCd;
	}

	public void setClmStatCd(String clmStatCd) {
		this.clmStatCd = clmStatCd;
	}

	public String getClmStatus() {
		return clmStatus;
	}

	public void setClmStatus(String clmStatus) {
		this.clmStatus = clmStatus;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getInsuredDesc() {
		return insuredDesc;
	}

	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}

	public Integer getRiskId() {
		return riskId;
	}

	public void setRiskId(Integer riskId) {
		this.riskId = riskId;
	}

	public String getRiskName() {
		return riskName;
	}

	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}

	public DateTime getLossDate() {
		return lossDate;
	}

	public void setLossDate(DateTime lossDate) {
		this.lossDate = lossDate;
	}

	public String getLossDtl() {
		return lossDtl;
	}

	public void setLossDtl(String lossDtl) {
		this.lossDtl = lossDtl;
	}

	public String getCurrencyCd() {
		return currencyCd;
	}

	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}

	public String getTotalLossExpRes() {
		return totalLossExpRes;
	}

	public void setTotalLossExpRes(String totalLossExpRes) {
		this.totalLossExpRes = totalLossExpRes;
	}

	public String getTotalLossExpPd() {
		return totalLossExpPd;
	}

	public void setTotalLossExpPd(String totalLossExpPd) {
		this.totalLossExpPd = totalLossExpPd;
	}

	public String getProcessedBy() {
		return processedBy;
	}

	public void setProcessedBy(String processedBy) {
		this.processedBy = processedBy;
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

	public List<ClaimAdjuster> getClmAdjusterList() {
		return clmAdjusterList;
	}

	public void setClmAdjusterList(List<ClaimAdjuster> clmAdjusterList) {
		this.clmAdjusterList = clmAdjusterList;
	}
	
	public ClaimProject getClmProject() {
		return clmProject;
	}

	public void setClmProject(ClaimProject clmProject) {
		this.clmProject = clmProject;
	}
	

	public List<ClaimDeductibles> getClmDeductibles() {
		return clmDeductibles;
	}

	public void setClmDeductibles(List<ClaimDeductibles> clmDeductibles) {
		this.clmDeductibles = clmDeductibles;
	}

	@Override
	public String toString() {
		return "Claims [claimId=" + claimId + ", claimNo=" + claimNo + ", cedingId=" + cedingId + ", cedingName="
				+ cedingName + ", clmStatCd=" + clmStatCd + ", clmStatus=" + clmStatus + ", policyNo=" + policyNo
				+ ", insuredDesc=" + insuredDesc + ", riskId=" + riskId + ", riskName=" + riskName + ", lossDate="
				+ lossDate + ", lossDtl=" + lossDtl + ", currencyCd=" + currencyCd + ", totalLossExpRes="
				+ totalLossExpRes + ", totalLossExpPd=" + totalLossExpPd + ", processedBy=" + processedBy
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", clmAdjusterList=" + clmAdjusterList + ", clmProject=" + clmProject
				+ ", clmDeductibles=" + clmDeductibles + "]";
	}

	
}
