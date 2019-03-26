package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

import ph.cpi.rest.api.model.quote.Alop;
import ph.cpi.rest.api.model.underwriting.Project;

public class Policy {
	private Integer policyId;
	private String policyNo;
	private String lineCd;
	private String lineCdDesc;
	private Integer polYear;
	private Integer polSeqNo;
	private String cedingId;
	private String cedingName;
	private Integer coSeriesNo;
	private Integer altNo;
	private Integer cessionId;
	private String cessionDesc;
	private String lineClassCd;
	private String lineClassDesc;
	private Integer quoteId;
	private String quotationNo;
	private String holdCoverNo;
	private String status;
	private String statusDesc;
	private String coRefNo;
	private String reinsurerId;
	private String reinsurerName;
	private String riBinderNo;
	private String mbiRefNo;
	private Integer policyIdOc;
	private String openPolicyNo;
	private String refOpenPolNo;
	private Integer intmId;
	private String intmName;
	private Integer principalId;
	private String principalName;
	private Integer contractorId;
	private String contractorName;
	private DateTime inceptDate;
	private DateTime expiryDate;
	private DateTime lapseFrom;
	private DateTime lapseTo;
	private DateTime maintenanceFrom;
	private DateTime maintenanceTo;
	private DateTime issueDate;
	private DateTime effDate;
	private DateTime distDate;
	private DateTime acctDate;
	private String currencyCd;
	private BigDecimal currencyRt;
	private String bookedTag;
	private String govtTag;
	private String openCoverTag;
	private String holdCoverTag;
	private String declarationTag;
	private String minDepTag;
	private String altTag;
	private String specialPolicyTag;
	private String instTag;
	private String extensionTag;
	private String excludeDistTag;
	private String wordings;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	private List<Deductibles> deductibles;
	private Project project;
	private List<Endorsements> endorsements;
	private List<Attachment> attachments;
	private InwPolBalance inwPolBalance;
	private CoInsurance coInsurance;
	private Alop alop;
	
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
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getLineCdDesc() {
		return lineCdDesc;
	}
	public void setLineCdDesc(String lineCdDesc) {
		this.lineCdDesc = lineCdDesc;
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
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
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
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public String getQuotationNo() {
		return quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
	}
	public String getHoldCoverNo() {
		return holdCoverNo;
	}
	public void setHoldCoverNo(String holdCoverNo) {
		this.holdCoverNo = holdCoverNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
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
	public Integer getPolicyIdOc() {
		return policyIdOc;
	}
	public void setPolicyIdOc(Integer policyIdOc) {
		this.policyIdOc = policyIdOc;
	}
	public String getOpenPolicyNo() {
		return openPolicyNo;
	}
	public void setOpenPolicyNo(String openPolicyNo) {
		this.openPolicyNo = openPolicyNo;
	}
	public String getRefOpenPolNo() {
		return refOpenPolNo;
	}
	public void setRefOpenPolNo(String refOpenPolNo) {
		this.refOpenPolNo = refOpenPolNo;
	}
	public Integer getIntmId() {
		return intmId;
	}
	public void setIntmId(Integer intmId) {
		this.intmId = intmId;
	}
	public String getIntmName() {
		return intmName;
	}
	public void setIntmName(String intmName) {
		this.intmName = intmName;
	}
	public Integer getPrincipalId() {
		return principalId;
	}
	public void setPrincipalId(Integer principalId) {
		this.principalId = principalId;
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
	public DateTime getDistDate() {
		return distDate;
	}
	public void setDistDate(DateTime distDate) {
		this.distDate = distDate;
	}
	public DateTime getAcctDate() {
		return acctDate;
	}
	public void setAcctDate(DateTime acctDate) {
		this.acctDate = acctDate;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public BigDecimal getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(BigDecimal currencyRt) {
		this.currencyRt = currencyRt;
	}
	public String getBookedTag() {
		return bookedTag;
	}
	public void setBookedTag(String bookedTag) {
		this.bookedTag = bookedTag;
	}
	public String getGovtTag() {
		return govtTag;
	}
	public void setGovtTag(String govtTag) {
		this.govtTag = govtTag;
	}
	public String getOpenCoverTag() {
		return openCoverTag;
	}
	public void setOpenCoverTag(String openCoverTag) {
		this.openCoverTag = openCoverTag;
	}
	public String getHoldCoverTag() {
		return holdCoverTag;
	}
	public void setHoldCoverTag(String holdCoverTag) {
		this.holdCoverTag = holdCoverTag;
	}
	public String getDeclarationTag() {
		return declarationTag;
	}
	public void setDeclarationTag(String declarationTag) {
		this.declarationTag = declarationTag;
	}
	public String getMinDepTag() {
		return minDepTag;
	}
	public void setMinDepTag(String minDepTag) {
		this.minDepTag = minDepTag;
	}
	public String getAltTag() {
		return altTag;
	}
	public void setAltTag(String altTag) {
		this.altTag = altTag;
	}
	public String getSpecialPolicyTag() {
		return specialPolicyTag;
	}
	public void setSpecialPolicyTag(String specialPolicyTag) {
		this.specialPolicyTag = specialPolicyTag;
	}
	public String getInstTag() {
		return instTag;
	}
	public void setInstTag(String instTag) {
		this.instTag = instTag;
	}
	public String getExtensionTag() {
		return extensionTag;
	}
	public void setExtensionTag(String extensionTag) {
		this.extensionTag = extensionTag;
	}
	public String getExcludeDistTag() {
		return excludeDistTag;
	}
	public void setExcludeDistTag(String excludeDistTag) {
		this.excludeDistTag = excludeDistTag;
	}
	public String getWordings() {
		return wordings;
	}
	public void setWordings(String wordings) {
		this.wordings = wordings;
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
	public List<Deductibles> getDeductibles() {
		return deductibles;
	}
	public void setDeductibles(List<Deductibles> deductibles) {
		this.deductibles = deductibles;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public List<Endorsements> getEndorsements() {
		return endorsements;
	}
	public void setEndorsements(List<Endorsements> endorsements) {
		this.endorsements = endorsements;
	}
	public List<Attachment> getAttachments() {
		return attachments;
	}
	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}
	public InwPolBalance getInwPolBalance() {
		return inwPolBalance;
	}
	public void setInwPolBalance(InwPolBalance inwPolBalance) {
		this.inwPolBalance = inwPolBalance;
	}
	public CoInsurance getCoInsurance() {
		return coInsurance;
	}
	public void setCoInsurance(CoInsurance coInsurance) {
		this.coInsurance = coInsurance;
	}
	public Alop getAlop() {
		return alop;
	}
	public void setAlop(Alop alop) {
		this.alop = alop;
	}
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyNo=" + policyNo + ", lineCd=" + lineCd + ", lineCdDesc="
				+ lineCdDesc + ", polYear=" + polYear + ", polSeqNo=" + polSeqNo + ", cedingId=" + cedingId
				+ ", cedingName=" + cedingName + ", coSeriesNo=" + coSeriesNo + ", altNo=" + altNo + ", cessionId="
				+ cessionId + ", cessionDesc=" + cessionDesc + ", lineClassCd=" + lineClassCd + ", lineClassDesc="
				+ lineClassDesc + ", quoteId=" + quoteId + ", quotationNo=" + quotationNo + ", holdCoverNo="
				+ holdCoverNo + ", status=" + status + ", statusDesc=" + statusDesc + ", coRefNo=" + coRefNo
				+ ", reinsurerId=" + reinsurerId + ", reinsurerName=" + reinsurerName + ", riBinderNo=" + riBinderNo
				+ ", mbiRefNo=" + mbiRefNo + ", policyIdOc=" + policyIdOc + ", openPolicyNo=" + openPolicyNo
				+ ", refOpenPolNo=" + refOpenPolNo + ", intmId=" + intmId + ", intmName=" + intmName + ", principalId="
				+ principalId + ", principalName=" + principalName + ", contractorId=" + contractorId
				+ ", contractorName=" + contractorName + ", inceptDate=" + inceptDate + ", expiryDate=" + expiryDate
				+ ", lapseFrom=" + lapseFrom + ", lapseTo=" + lapseTo + ", maintenanceFrom=" + maintenanceFrom
				+ ", maintenanceTo=" + maintenanceTo + ", issueDate=" + issueDate + ", effDate=" + effDate
				+ ", distDate=" + distDate + ", acctDate=" + acctDate + ", currencyCd=" + currencyCd + ", currencyRt="
				+ currencyRt + ", bookedTag=" + bookedTag + ", govtTag=" + govtTag + ", openCoverTag=" + openCoverTag
				+ ", holdCoverTag=" + holdCoverTag + ", declarationTag=" + declarationTag + ", minDepTag=" + minDepTag
				+ ", altTag=" + altTag + ", specialPolicyTag=" + specialPolicyTag + ", instTag=" + instTag
				+ ", extensionTag=" + extensionTag + ", excludeDistTag=" + excludeDistTag + ", wordings=" + wordings
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", deductibles=" + deductibles + ", project=" + project
				+ ", endorsements=" + endorsements + ", attachments=" + attachments + ", inwPolBalance=" + inwPolBalance
				+ ", coInsurance=" + coInsurance + ", alop=" + alop + "]";
	}
	
}
