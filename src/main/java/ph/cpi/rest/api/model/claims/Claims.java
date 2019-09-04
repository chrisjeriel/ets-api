package ph.cpi.rest.api.model.claims;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class Claims {
	
	private Integer claimId;
	private String claimNo;
	private String lineCd;
	private Integer polYear;
	private Integer polSeqNo;
	private String cedingId;
	private Integer coSeriesNo;
	private Integer altNo;
	private Integer policyId;
	private String policyNo;
	private String cedingName;
	private Integer prinId;
	private String principalName;
	private Integer contractorId;
	private String contractorName;
	private Integer clmYear;
	private Integer clmSeqNo;
	private String clmStatCd;
	private String clmStatus;
	private BigDecimal insuredClm;
	private Integer cessionId;
	private String cessionDesc;
	private String lineClassCd;
	private String lineClassDesc;
	private String coRefNo;
	private String reinsurerId;
	private String reinsurerName;
	private String riBinderNo;
	private String mbiRefNo; 
	private DateTime inceptDate;
	private DateTime expiryDate;
	private String coClmNo;
	private DateTime lossDate;
	private String lossCd;
	private String lossAbbr;
	private String lossPeriod;
	private String lossPdAbbr;
	private String lossDtl;
	private String lossStatCd;
	private String eventTypeCd;
	private String eventTypeDesc;
	private String eventCd;
	private String eventDesc;
	private String insuredDesc;
	private DateTime reportDate;
	private String reportedBy;
	private String processedBy;
	private String oldStatCd;
	private String oldClmStatus;
	private DateTime closeDate;
	private String refreshSw;
	private DateTime issueDate;
	private DateTime effDate;
	private DateTime lapseFrom;
	private DateTime lapseTo;
	private DateTime maintenanceFrom;
	private DateTime maintenanceTo;
	private Double pctShare;
	private BigDecimal totalSi;
	private BigDecimal totalValue;
	private Integer riskId;
	private String riskName;
	private String currencyCd;
	private String totalLossExpRes;
	private String totalLossExpPd;
	private String reasonCd;
	private String reasonDesc;
	private String lapsePdTag;
	private String polTermTag;
	private String premTag;
	private String remarks;
	private String approvedBy;
	private DateTime approvedDate;
	private String secISiTag;
	private String secIISiTag;
	private String secIIISiTag;
	private BigDecimal sectionIPrem;
	private BigDecimal sectionIIPrem;
	private BigDecimal sectionIIIPrem;
	private BigDecimal allowMaxSi;
	private Integer adjId;
	private String adjName;
	private String adjFileNo;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private Project project;
	private List<ClaimAdjuster> clmAdjusterList;
	private ClaimProject clmProject;
	private List<ClaimDeductibles> clmDeductibles;
	
//	private List<Attachment> attachments; --Replced with 'clmAttachments' only
	private ClaimReserve clmReserve;
	
	private List<Attachment> clmAttachments;
	private String preventRefresh;
	
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
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public Integer getPolYear() {
		return polYear;
	}
	public void setPolYear(Integer polYear) {
		this.polYear = polYear;
	}
	public Integer getPolSeqNo() {
		return polSeqNo;
	}
	public void setPolSeqNo(Integer polSeqNo) {
		this.polSeqNo = polSeqNo;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public Integer getCoSeriesNo() {
		return coSeriesNo;
	}
	public void setCoSeriesNo(Integer coSeriesNo) {
		this.coSeriesNo = coSeriesNo;
	}
	public Integer getAltNo() {
		return altNo;
	}
	public void setAltNo(Integer altNo) {
		this.altNo = altNo;
	}
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
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
	public Integer getPrinId() {
		return prinId;
	}
	public void setPrinId(Integer prinId) {
		this.prinId = prinId;
	}
	public String getPrincipalName() {
		return principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}
	public Integer getContractorId() {
		return contractorId;
	}
	public void setContractorId(Integer contractorId) {
		this.contractorId = contractorId;
	}
	public String getContractorName() {
		return contractorName;
	}
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	public Integer getClmYear() {
		return clmYear;
	}
	public void setClmYear(Integer clmYear) {
		this.clmYear = clmYear;
	}
	public Integer getClmSeqNo() {
		return clmSeqNo;
	}
	public void setClmSeqNo(Integer clmSeqNo) {
		this.clmSeqNo = clmSeqNo;
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
	public BigDecimal getInsuredClm() {
		return insuredClm;
	}
	public void setInsuredClm(BigDecimal insuredClm) {
		this.insuredClm = insuredClm;
	}
	public Integer getCessionId() {
		return cessionId;
	}
	public void setCessionId(Integer cessionId) {
		this.cessionId = cessionId;
	}
	public String getCessionDesc() {
		return cessionDesc;
	}
	public void setCessionDesc(String cessionDesc) {
		this.cessionDesc = cessionDesc;
	}
	public String getLineClassCd() {
		return lineClassCd;
	}
	public void setLineClassCd(String lineClassCd) {
		this.lineClassCd = lineClassCd;
	}
	public String getLineClassDesc() {
		return lineClassDesc;
	}
	public void setLineClassDesc(String lineClassDesc) {
		this.lineClassDesc = lineClassDesc;
	}
	public String getCoRefNo() {
		return coRefNo;
	}
	public void setCoRefNo(String coRefNo) {
		this.coRefNo = coRefNo;
	}
	public String getReinsurerId() {
		return reinsurerId;
	}
	public void setReinsurerId(String reinsurerId) {
		this.reinsurerId = reinsurerId;
	}
	public String getReinsurerName() {
		return reinsurerName;
	}
	public void setReinsurerName(String reinsurerName) {
		this.reinsurerName = reinsurerName;
	}
	public String getRiBinderNo() {
		return riBinderNo;
	}
	public void setRiBinderNo(String riBinderNo) {
		this.riBinderNo = riBinderNo;
	}
	public String getMbiRefNo() {
		return mbiRefNo;
	}
	public void setMbiRefNo(String mbiRefNo) {
		this.mbiRefNo = mbiRefNo;
	}
	public DateTime getInceptDate() {
		return inceptDate;
	}
	public void setInceptDate(DateTime inceptDate) {
		this.inceptDate = inceptDate;
	}
	public DateTime getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(DateTime expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCoClmNo() {
		return coClmNo;
	}
	public void setCoClmNo(String coClmNo) {
		this.coClmNo = coClmNo;
	}
	public DateTime getLossDate() {
		return lossDate;
	}
	public void setLossDate(DateTime lossDate) {
		this.lossDate = lossDate;
	}
	public String getLossCd() {
		return lossCd;
	}
	public void setLossCd(String lossCd) {
		this.lossCd = lossCd;
	}
	public String getLossAbbr() {
		return lossAbbr;
	}
	public void setLossAbbr(String lossAbbr) {
		this.lossAbbr = lossAbbr;
	}
	public String getLossPeriod() {
		return lossPeriod;
	}
	public void setLossPeriod(String lossPeriod) {
		this.lossPeriod = lossPeriod;
	}
	public String getLossPdAbbr() {
		return lossPdAbbr;
	}
	public void setLossPdAbbr(String lossPdAbbr) {
		this.lossPdAbbr = lossPdAbbr;
	}
	public String getLossDtl() {
		return lossDtl;
	}
	public void setLossDtl(String lossDtl) {
		this.lossDtl = lossDtl;
	}
	public String getLossStatCd() {
		return lossStatCd;
	}
	public void setLossStatCd(String lossStatCd) {
		this.lossStatCd = lossStatCd;
	}
	public String getEventTypeCd() {
		return eventTypeCd;
	}
	public void setEventTypeCd(String eventTypeCd) {
		this.eventTypeCd = eventTypeCd;
	}
	public String getEventTypeDesc() {
		return eventTypeDesc;
	}
	public void setEventTypeDesc(String eventTypeDesc) {
		this.eventTypeDesc = eventTypeDesc;
	}
	public String getEventCd() {
		return eventCd;
	}
	public void setEventCd(String eventCd) {
		this.eventCd = eventCd;
	}
	public String getEventDesc() {
		return eventDesc;
	}
	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public DateTime getReportDate() {
		return reportDate;
	}
	public void setReportDate(DateTime reportDate) {
		this.reportDate = reportDate;
	}
	public String getReportedBy() {
		return reportedBy;
	}
	public void setReportedBy(String reportedBy) {
		this.reportedBy = reportedBy;
	}
	public String getProcessedBy() {
		return processedBy;
	}
	public void setProcessedBy(String processedBy) {
		this.processedBy = processedBy;
	}
	public String getOldStatCd() {
		return oldStatCd;
	}
	public void setOldStatCd(String oldStatCd) {
		this.oldStatCd = oldStatCd;
	}
	public String getOldClmStatus() {
		return oldClmStatus;
	}
	public void setOldClmStatus(String oldClmStatus) {
		this.oldClmStatus = oldClmStatus;
	}
	public DateTime getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(DateTime closeDate) {
		this.closeDate = closeDate;
	}
	public String getRefreshSw() {
		return refreshSw;
	}
	public void setRefreshSw(String refreshSw) {
		this.refreshSw = refreshSw;
	}
	public DateTime getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(DateTime issueDate) {
		this.issueDate = issueDate;
	}
	public DateTime getEffDate() {
		return effDate;
	}
	public void setEffDate(DateTime effDate) {
		this.effDate = effDate;
	}
	public DateTime getLapseFrom() {
		return lapseFrom;
	}
	public void setLapseFrom(DateTime lapseFrom) {
		this.lapseFrom = lapseFrom;
	}
	public DateTime getLapseTo() {
		return lapseTo;
	}
	public void setLapseTo(DateTime lapseTo) {
		this.lapseTo = lapseTo;
	}
	public DateTime getMaintenanceFrom() {
		return maintenanceFrom;
	}
	public void setMaintenanceFrom(DateTime maintenanceFrom) {
		this.maintenanceFrom = maintenanceFrom;
	}
	public DateTime getMaintenanceTo() {
		return maintenanceTo;
	}
	public void setMaintenanceTo(DateTime maintenanceTo) {
		this.maintenanceTo = maintenanceTo;
	}
	public Double getPctShare() {
		return pctShare;
	}
	public void setPctShare(Double pctShare) {
		this.pctShare = pctShare;
	}
	public BigDecimal getTotalSi() {
		return totalSi;
	}
	public void setTotalSi(BigDecimal totalSi) {
		this.totalSi = totalSi;
	}
	public BigDecimal getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
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
	public String getReasonCd() {
		return reasonCd;
	}
	public void setReasonCd(String reasonCd) {
		this.reasonCd = reasonCd;
	}
	public String getReasonDesc() {
		return reasonDesc;
	}
	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}
	public String getLapsePdTag() {
		return lapsePdTag;
	}
	public void setLapsePdTag(String lapsePdTag) {
		this.lapsePdTag = lapsePdTag;
	}
	public String getPolTermTag() {
		return polTermTag;
	}
	public void setPolTermTag(String polTermTag) {
		this.polTermTag = polTermTag;
	}
	public String getPremTag() {
		return premTag;
	}
	public void setPremTag(String premTag) {
		this.premTag = premTag;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	public DateTime getApprovedDate() {
		return approvedDate;
	}
	public void setApprovedDate(DateTime approvedDate) {
		this.approvedDate = approvedDate;
	}
	public String getSecISiTag() {
		return secISiTag;
	}
	public void setSecISiTag(String secISiTag) {
		this.secISiTag = secISiTag;
	}
	public String getSecIISiTag() {
		return secIISiTag;
	}
	public void setSecIISiTag(String secIISiTag) {
		this.secIISiTag = secIISiTag;
	}
	public String getSecIIISiTag() {
		return secIIISiTag;
	}
	public void setSecIIISiTag(String secIIISiTag) {
		this.secIIISiTag = secIIISiTag;
	}
	public BigDecimal getSectionIPrem() {
		return sectionIPrem;
	}
	public void setSectionIPrem(BigDecimal sectionIPrem) {
		this.sectionIPrem = sectionIPrem;
	}
	public BigDecimal getSectionIIPrem() {
		return sectionIIPrem;
	}
	public void setSectionIIPrem(BigDecimal sectionIIPrem) {
		this.sectionIIPrem = sectionIIPrem;
	}
	public BigDecimal getSectionIIIPrem() {
		return sectionIIIPrem;
	}
	public void setSectionIIIPrem(BigDecimal sectionIIIPrem) {
		this.sectionIIIPrem = sectionIIIPrem;
	}
	public BigDecimal getAllowMaxSi() {
		return allowMaxSi;
	}
	public void setAllowMaxSi(BigDecimal allowMaxSi) {
		this.allowMaxSi = allowMaxSi;
	}
	public Integer getAdjId() {
		return adjId;
	}
	public void setAdjId(Integer adjId) {
		this.adjId = adjId;
	}
	public String getAdjName() {
		return adjName;
	}
	public void setAdjName(String adjName) {
		this.adjName = adjName;
	}
	public String getAdjFileNo() {
		return adjFileNo;
	}
	public void setAdjFileNo(String adjFileNo) {
		this.adjFileNo = adjFileNo;
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
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
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
	public ClaimReserve getClmReserve() {
		return clmReserve;
	}
	public void setClmReserve(ClaimReserve clmReserve) {
		this.clmReserve = clmReserve;
	}
	public List<Attachment> getClmAttachments() {
		return clmAttachments;
	}
	public void setClmAttachments(List<Attachment> clmAttachments) {
		this.clmAttachments = clmAttachments;
	}
	public String getPreventRefresh() {
		return preventRefresh;
	}
	public void setPreventRefresh(String preventRefresh) {
		this.preventRefresh = preventRefresh;
	}
	@Override
	public String toString() {
		return "Claims [claimId=" + claimId + ", claimNo=" + claimNo + ", lineCd=" + lineCd + ", polYear=" + polYear
				+ ", polSeqNo=" + polSeqNo + ", cedingId=" + cedingId + ", coSeriesNo=" + coSeriesNo + ", altNo="
				+ altNo + ", policyId=" + policyId + ", policyNo=" + policyNo + ", cedingName=" + cedingName
				+ ", prinId=" + prinId + ", principalName=" + principalName + ", contractorId=" + contractorId
				+ ", contractorName=" + contractorName + ", clmYear=" + clmYear + ", clmSeqNo=" + clmSeqNo
				+ ", clmStatCd=" + clmStatCd + ", clmStatus=" + clmStatus + ", insuredClm=" + insuredClm
				+ ", cessionId=" + cessionId + ", cessionDesc=" + cessionDesc + ", lineClassCd=" + lineClassCd
				+ ", lineClassDesc=" + lineClassDesc + ", coRefNo=" + coRefNo + ", reinsurerId=" + reinsurerId
				+ ", reinsurerName=" + reinsurerName + ", riBinderNo=" + riBinderNo + ", mbiRefNo=" + mbiRefNo
				+ ", inceptDate=" + inceptDate + ", expiryDate=" + expiryDate + ", coClmNo=" + coClmNo + ", lossDate="
				+ lossDate + ", lossCd=" + lossCd + ", lossAbbr=" + lossAbbr + ", lossPeriod=" + lossPeriod
				+ ", lossPdAbbr=" + lossPdAbbr + ", lossDtl=" + lossDtl + ", lossStatCd=" + lossStatCd
				+ ", eventTypeCd=" + eventTypeCd + ", eventTypeDesc=" + eventTypeDesc + ", eventCd=" + eventCd
				+ ", eventDesc=" + eventDesc + ", insuredDesc=" + insuredDesc + ", reportDate=" + reportDate
				+ ", reportedBy=" + reportedBy + ", processedBy=" + processedBy + ", oldStatCd=" + oldStatCd
				+ ", oldClmStatus=" + oldClmStatus + ", closeDate=" + closeDate + ", refreshSw=" + refreshSw
				+ ", issueDate=" + issueDate + ", effDate=" + effDate + ", lapseFrom=" + lapseFrom + ", lapseTo="
				+ lapseTo + ", maintenanceFrom=" + maintenanceFrom + ", maintenanceTo=" + maintenanceTo + ", pctShare="
				+ pctShare + ", totalSi=" + totalSi + ", totalValue=" + totalValue + ", riskId=" + riskId
				+ ", riskName=" + riskName + ", currencyCd=" + currencyCd + ", totalLossExpRes=" + totalLossExpRes
				+ ", totalLossExpPd=" + totalLossExpPd + ", reasonCd=" + reasonCd + ", reasonDesc=" + reasonDesc
				+ ", lapsePdTag=" + lapsePdTag + ", polTermTag=" + polTermTag + ", premTag=" + premTag + ", remarks="
				+ remarks + ", approvedBy=" + approvedBy + ", approvedDate=" + approvedDate + ", secISiTag=" + secISiTag
				+ ", secIISiTag=" + secIISiTag + ", secIIISiTag=" + secIIISiTag + ", sectionIPrem=" + sectionIPrem
				+ ", sectionIIPrem=" + sectionIIPrem + ", sectionIIIPrem=" + sectionIIIPrem + ", allowMaxSi="
				+ allowMaxSi + ", adjId=" + adjId + ", adjName=" + adjName + ", adjFileNo=" + adjFileNo
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", project=" + project + ", clmAdjusterList=" + clmAdjusterList
				+ ", clmProject=" + clmProject + ", clmDeductibles=" + clmDeductibles + ", clmReserve=" + clmReserve
				+ ", clmAttachments=" + clmAttachments + ", preventRefresh=" + preventRefresh + "]";
	}
}