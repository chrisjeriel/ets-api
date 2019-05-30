package ph.cpi.rest.api.model.underwriting;

import java.util.List;

import org.joda.time.DateTime;

public class ExpPolicy {
	private String policyId;
	private String policyNo;
	private String extractUser; 
	private DateTime extractDate; 
	private String processTag; 
	private String processedBy; 
	private DateTime processedDate; 
	private String renewalFlag; 
	private String summaryTag; 
	private String balanceTag; 
	private String claimTag; 
	private String reminderTag; 
	private String nrReasonCd; 
	private String cessionId;
	private String cessionDesc;
	private String cedingId;
	private String cedingName;
	private String lineClassCd; 
	private String quoteId; 
	private String optionId; 
	private String coRefNo; 
	private String reinsurerId; 
	private String riBinderNo; 
	private String mbiRefNo; 
	private String intmId; 
	private String prinId; 
	private String contractorId; 
	private String insuredDesc; 
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
	private String currencyRt; 
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
	
	private List<ExpProject> projectList;
	private List<ExpItem> itemList;
	private List<ExpDeductibles> deductiblesList;
	private List<ExpSectionCover> sectionCoverList;
	private List<ExpCoverage> coverageList;
	private List<ExpCatPeril> catPerilList;
	private List<ExpEndorsement> endorsementList;
	
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getCessionDesc() {
		return cessionDesc;
	}
	public void setCessionDesc(String cessionDesc) {
		this.cessionDesc = cessionDesc;
	}
	public List<ExpProject> getProjectList() {
		return projectList;
	}
	public void setProjectList(List<ExpProject> projectList) {
		this.projectList = projectList;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public DateTime getExtractDate() {
		return extractDate;
	}
	public void setExtractDate(DateTime extractDate) {
		this.extractDate = extractDate;
	}
	public String getProcessTag() {
		return processTag;
	}
	public void setProcessTag(String processTag) {
		this.processTag = processTag;
	}
	public String getProcessedBy() {
		return processedBy;
	}
	public void setProcessedBy(String processedBy) {
		this.processedBy = processedBy;
	}
	public DateTime getProcessedDate() {
		return processedDate;
	}
	public void setProcessedDate(DateTime processedDate) {
		this.processedDate = processedDate;
	}
	public String getRenewalFlag() {
		return renewalFlag;
	}
	public void setRenewalFlag(String renewalFlag) {
		this.renewalFlag = renewalFlag;
	}
	public String getSummaryTag() {
		return summaryTag;
	}
	public void setSummaryTag(String summaryTag) {
		this.summaryTag = summaryTag;
	}
	public String getBalanceTag() {
		return balanceTag;
	}
	public void setBalanceTag(String balanceTag) {
		this.balanceTag = balanceTag;
	}
	public String getClaimTag() {
		return claimTag;
	}
	public void setClaimTag(String claimTag) {
		this.claimTag = claimTag;
	}
	public String getReminderTag() {
		return reminderTag;
	}
	public void setReminderTag(String reminderTag) {
		this.reminderTag = reminderTag;
	}
	public String getNrReasonCd() {
		return nrReasonCd;
	}
	public void setNrReasonCd(String nrReasonCd) {
		this.nrReasonCd = nrReasonCd;
	}
	public String getCessionId() {
		return cessionId;
	}
	public void setCessionId(String cessionId) {
		this.cessionId = cessionId;
	}
	public String getLineClassCd() {
		return lineClassCd;
	}
	public void setLineClassCd(String lineClassCd) {
		this.lineClassCd = lineClassCd;
	}
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getOptionId() {
		return optionId;
	}
	public void setOptionId(String optionId) {
		this.optionId = optionId;
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
	public String getIntmId() {
		return intmId;
	}
	public void setIntmId(String intmId) {
		this.intmId = intmId;
	}
	public String getPrinId() {
		return prinId;
	}
	public void setPrinId(String prinId) {
		this.prinId = prinId;
	}
	public String getContractorId() {
		return contractorId;
	}
	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
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
	public String getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(String currencyRt) {
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
	public List<ExpItem> getItemList() {
		return itemList;
	}
	public void setItemList(List<ExpItem> itemList) {
		this.itemList = itemList;
	}
	
	public List<ExpDeductibles> getDeductiblesList() {
		return deductiblesList;
	}
	public void setDeductiblesList(List<ExpDeductibles> deductiblesList) {
		this.deductiblesList = deductiblesList;
	}
	public List<ExpSectionCover> getSectionCoverList() {
		return sectionCoverList;
	}
	public void setSectionCoverList(List<ExpSectionCover> sectionCoverList) {
		this.sectionCoverList = sectionCoverList;
	}
	public List<ExpCoverage> getCoverageList() {
		return coverageList;
	}
	public void setCoverageList(List<ExpCoverage> coverageList) {
		this.coverageList = coverageList;
	}
	public List<ExpCatPeril> getCatPerilList() {
		return catPerilList;
	}
	public void setCatPerilList(List<ExpCatPeril> catPerilList) {
		this.catPerilList = catPerilList;
	}
	public List<ExpEndorsement> getEndorsementList() {
		return endorsementList;
	}
	public void setEndorsementList(List<ExpEndorsement> endorsementList) {
		this.endorsementList = endorsementList;
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

}