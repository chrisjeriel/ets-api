package ph.cpi.rest.api.model.underwriting;

import java.util.List;

import org.joda.time.DateTime;

public class PolicyOc {
	private Integer policyIdOc;
	private String openPolicyNo;
	private String lineCd;
	private String lineCdDesc;
	private Integer ocYear;
	private Integer ocSeqNo;
	private String cedingId;
	private String cedingName;
	private Integer coSeriesNo;
	private Integer altNo;
	private String cessionId;
	private String cessionDesc;
	private String lineClassCd;
	private Integer quoteId;
	private String quoteNo;
	private String lineClassDesc;
	private String refOpPolNo;
	private Integer prinId;
	private String prinName;
	private Integer contractorId;
	private String contractorName;
	private String insuredDesc;
	private String status;
	private String statusDesc;
	private String reinsurerId;
	private String reinsurerName;
	private Integer intmId;
	private String intmName;
	private DateTime inceptDate;
	private DateTime expiryDate;
	private DateTime lapseFrom;
	private DateTime lapseTo;
	private DateTime issueDate;
	private DateTime effDate;
	private DateTime distDate;
	private DateTime acctDate;
	private String currencyCd;
	private String currencyRt;
	private String coRefNo;
	private String riBinderNo;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private Integer	optionId;
	private Float optionRt;
	private String condition;
	
	private ProjectOc project;
	private List<AttachmentOc> attachmentsOc;
	private List<EndtOc> endorsementsOc;
	
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
	public Integer getOcYear() {
		return ocYear;
	}
	public void setOcYear(Integer ocYear) {
		this.ocYear = ocYear;
	}
	public Integer getOcSeqNo() {
		return ocSeqNo;
	}
	public void setOcSeqNo(Integer ocSeqNo) {
		this.ocSeqNo = ocSeqNo;
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
	public String getCessionId() {
		return cessionId;
	}
	public void setCessionId(String cessionId) {
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
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public String getQuoteNo() {
		return quoteNo;
	}
	public void setQuoteNo(String quoteNo) {
		this.quoteNo = quoteNo;
	}
	public String getLineClassDesc() {
		return lineClassDesc;
	}
	public void setLineClassDesc(String lineClassDesc) {
		this.lineClassDesc = lineClassDesc;
	}
	public String getRefOpPolNo() {
		return refOpPolNo;
	}
	public void setRefOpPolNo(String refOpPolNo) {
		this.refOpPolNo = refOpPolNo;
	}
	public Integer getPrinId() {
		return prinId;
	}
	public void setPrinId(Integer prinId) {
		this.prinId = prinId;
	}
	public String getPrinName() {
		return prinName;
	}
	public void setPrinName(String prinName) {
		this.prinName = prinName;
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
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
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
	public String getCoRefNo() {
		return coRefNo;
	}
	public void setCoRefNo(String coRefNo) {
		this.coRefNo = coRefNo;
	}
	public String getRiBinderNo() {
		return riBinderNo;
	}
	public void setRiBinderNo(String riBinderNo) {
		this.riBinderNo = riBinderNo;
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
	public Integer getOptionId() {
		return optionId;
	}
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}
	public Float getOptionRt() {
		return optionRt;
	}
	public void setOptionRt(Float optionRt) {
		this.optionRt = optionRt;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public ProjectOc getProject() {
		return project;
	}
	public void setProject(ProjectOc project) {
		this.project = project;
	}
	public List<AttachmentOc> getAttachmentsOc() {
		return attachmentsOc;
	}
	public void setAttachmentsOc(List<AttachmentOc> attachmentsOc) {
		this.attachmentsOc = attachmentsOc;
	}
	public List<EndtOc> getEndorsementsOc() {
		return endorsementsOc;
	}
	public void setEndorsementsOc(List<EndtOc> endorsementsOc) {
		this.endorsementsOc = endorsementsOc;
	}
	@Override
	public String toString() {
		return "PolicyOc [policyIdOc=" + policyIdOc + ", openPolicyNo=" + openPolicyNo + ", lineCd=" + lineCd
				+ ", lineCdDesc=" + lineCdDesc + ", ocYear=" + ocYear + ", ocSeqNo=" + ocSeqNo + ", cedingId="
				+ cedingId + ", cedingName=" + cedingName + ", coSeriesNo=" + coSeriesNo + ", altNo=" + altNo
				+ ", cessionId=" + cessionId + ", cessionDesc=" + cessionDesc + ", lineClassCd=" + lineClassCd
				+ ", quoteId=" + quoteId + ", quoteNo=" + quoteNo + ", lineClassDesc=" + lineClassDesc + ", refOpPolNo="
				+ refOpPolNo + ", prinId=" + prinId + ", prinName=" + prinName + ", contractorId=" + contractorId
				+ ", contractorName=" + contractorName + ", insuredDesc=" + insuredDesc + ", status=" + status
				+ ", statusDesc=" + statusDesc + ", reinsurerId=" + reinsurerId + ", reinsurerName=" + reinsurerName
				+ ", intmId=" + intmId + ", intmName=" + intmName + ", inceptDate=" + inceptDate + ", expiryDate="
				+ expiryDate + ", lapseFrom=" + lapseFrom + ", lapseTo=" + lapseTo + ", issueDate=" + issueDate
				+ ", effDate=" + effDate + ", distDate=" + distDate + ", acctDate=" + acctDate + ", currencyCd="
				+ currencyCd + ", currencyRt=" + currencyRt + ", coRefNo=" + coRefNo + ", riBinderNo=" + riBinderNo
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", optionId=" + optionId + ", optionRt=" + optionRt + ", condition="
				+ condition + ", project=" + project + ", attachmentsOc=" + attachmentsOc + ", endorsementsOc="
				+ endorsementsOc + "]";
	}
}
