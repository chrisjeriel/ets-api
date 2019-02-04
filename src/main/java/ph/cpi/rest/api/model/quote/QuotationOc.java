package ph.cpi.rest.api.model.quote;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.LocalDateTime;

public class QuotationOc {
	private Integer	quoteIdOc;
	private String cessionDesc; //Added
	private String lineClassCdDesc; //Added
	private String	openQuotationNo;
	private String	lineCd;
	private String	lineCdDesc;
	private Integer	year;
	private Integer	seqNo;
	private Integer sevNo; //Added Check spelling
	private Integer	revNo;
	private Integer	cedingId;
	private Integer	cessionId;
	private String	cedingName;
	private String	lineClassCd;
	private String	lineClassDesc;
	private String	refPolNo;
	private Integer	policyIdOc;
	private String	openPolicyNo;
	private Integer	prinId;
	private String	principalName;
	private Integer	contractorId;
	private String	contactorName;
	private String	insuredDesc;
	private String	status;
	private Integer	reinsurerId;
	private String	reinsurerName;
	private Integer	intmId;
	private String	intmName;
	private LocalDateTime	issueDate;
	private LocalDateTime	expiryDate;
	private String	reqBy;
	private LocalDateTime	reqDate;
	private String	reqMode;
	private String	currencyCd;
	private Integer	currencyRtI; //Added check XML for mapping
	private BigDecimal currencyRt;
	private String	govtTag;
	private String	indicativeTag;
	private String	preparedBy;
	private String	approvedBy;
	private String	printedBy;
	private LocalDateTime	printDate;
	private String	openingParag;
	private String	closingParag;
	private String	reasonCd;
	private String reasonDesc;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	private ProjectOc projectOc;
	private List<Attachment> attachment;
	public Integer getQuoteIdOc() {
		return quoteIdOc;
	}
	public void setQuoteIdOc(Integer quoteIdOc) {
		this.quoteIdOc = quoteIdOc;
	}
	public String getCessionDesc() {
		return cessionDesc;
	}
	public void setCessionDesc(String cessionDesc) {
		this.cessionDesc = cessionDesc;
	}
	public String getLineClassCdDesc() {
		return lineClassCdDesc;
	}
	public void setLineClassCdDesc(String lineClassCdDesc) {
		this.lineClassCdDesc = lineClassCdDesc;
	}
	public String getOpenQuotationNo() {
		return openQuotationNo;
	}
	public void setOpenQuotationNo(String openQuotationNo) {
		this.openQuotationNo = openQuotationNo;
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
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}
	public Integer getSevNo() {
		return sevNo;
	}
	public void setSevNo(Integer sevNo) {
		this.sevNo = sevNo;
	}
	public Integer getRevNo() {
		return revNo;
	}
	public void setRevNo(Integer revNo) {
		this.revNo = revNo;
	}
	public Integer getCedingId() {
		return cedingId;
	}
	public void setCedingId(Integer cedingId) {
		this.cedingId = cedingId;
	}
	public Integer getCessionId() {
		return cessionId;
	}
	public void setCessionId(Integer cessionId) {
		this.cessionId = cessionId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
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
	public String getRefPolNo() {
		return refPolNo;
	}
	public void setRefPolNo(String refPolNo) {
		this.refPolNo = refPolNo;
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
	public String getContactorName() {
		return contactorName;
	}
	public void setContactorName(String contactorName) {
		this.contactorName = contactorName;
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
	public Integer getReinsurerId() {
		return reinsurerId;
	}
	public void setReinsurerId(Integer reinsurerId) {
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
	public LocalDateTime getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDateTime issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getReqBy() {
		return reqBy;
	}
	public void setReqBy(String reqBy) {
		this.reqBy = reqBy;
	}
	public LocalDateTime getReqDate() {
		return reqDate;
	}
	public void setReqDate(LocalDateTime reqDate) {
		this.reqDate = reqDate;
	}
	public String getReqMode() {
		return reqMode;
	}
	public void setReqMode(String reqMode) {
		this.reqMode = reqMode;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public Integer getCurrencyRtI() {
		return currencyRtI;
	}
	public void setCurrencyRtI(Integer currencyRtI) {
		this.currencyRtI = currencyRtI;
	}
	public BigDecimal getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(BigDecimal currencyRt) {
		this.currencyRt = currencyRt;
	}
	public String getGovtTag() {
		return govtTag;
	}
	public void setGovtTag(String govtTag) {
		this.govtTag = govtTag;
	}
	public String getIndicativeTag() {
		return indicativeTag;
	}
	public void setIndicativeTag(String indicativeTag) {
		this.indicativeTag = indicativeTag;
	}
	public String getPreparedBy() {
		return preparedBy;
	}
	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	public String getPrintedBy() {
		return printedBy;
	}
	public void setPrintedBy(String printedBy) {
		this.printedBy = printedBy;
	}
	public LocalDateTime getPrintDate() {
		return printDate;
	}
	public void setPrintDate(LocalDateTime printDate) {
		this.printDate = printDate;
	}
	public String getOpeningParag() {
		return openingParag;
	}
	public void setOpeningParag(String openingParag) {
		this.openingParag = openingParag;
	}
	public String getClosingParag() {
		return closingParag;
	}
	public void setClosingParag(String closingParag) {
		this.closingParag = closingParag;
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
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	public ProjectOc getProjectOc() {
		return projectOc;
	}
	public void setProjectOc(ProjectOc projectOc) {
		this.projectOc = projectOc;
	}
	public List<Attachment> getAttachment() {
		return attachment;
	}
	public void setAttachment(List<Attachment> attachment) {
		this.attachment = attachment;
	}
	@Override
	public String toString() {
		return "QuotationOc [quoteIdOc=" + quoteIdOc + ", cessionDesc=" + cessionDesc + ", lineClassCdDesc="
				+ lineClassCdDesc + ", openQuotationNo=" + openQuotationNo + ", lineCd=" + lineCd + ", lineCdDesc="
				+ lineCdDesc + ", year=" + year + ", seqNo=" + seqNo + ", sevNo=" + sevNo + ", revNo=" + revNo
				+ ", cedingId=" + cedingId + ", cessionId=" + cessionId + ", cedingName=" + cedingName
				+ ", lineClassCd=" + lineClassCd + ", lineClassDesc=" + lineClassDesc + ", refPolNo=" + refPolNo
				+ ", policyIdOc=" + policyIdOc + ", openPolicyNo=" + openPolicyNo + ", prinId=" + prinId
				+ ", principalName=" + principalName + ", contractorId=" + contractorId + ", contactorName="
				+ contactorName + ", insuredDesc=" + insuredDesc + ", status=" + status + ", reinsurerId=" + reinsurerId
				+ ", reinsurerName=" + reinsurerName + ", intmId=" + intmId + ", intmName=" + intmName + ", issueDate="
				+ issueDate + ", expiryDate=" + expiryDate + ", reqBy=" + reqBy + ", reqDate=" + reqDate + ", reqMode="
				+ reqMode + ", currencyCd=" + currencyCd + ", currencyRtI=" + currencyRtI + ", currencyRt=" + currencyRt
				+ ", govtTag=" + govtTag + ", indicativeTag=" + indicativeTag + ", preparedBy=" + preparedBy
				+ ", approvedBy=" + approvedBy + ", printedBy=" + printedBy + ", printDate=" + printDate
				+ ", openingParag=" + openingParag + ", closingParag=" + closingParag + ", reasonCd=" + reasonCd
				+ ", reasonDesc=" + reasonDesc + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", projectOc=" + projectOc
				+ ", attachment=" + attachment + "]";
	}
	
	
}
