package ph.cpi.rest.api.model.quote;

import org.joda.time.LocalDateTime;

public class QuotationGeneralInfo {
	
	private Integer quoteId;
	private String quotationNo;
	private String lineCd;
	private String lineCdDesc;
	private Integer quoteYear;
	private Integer quoteSeqNo;
	private Integer quoteRevNo;
	private Integer cedingId;
	private String cedingName;
	private Integer cessionId;
	private String cessionDesc;
	private String lineClassCd;
	private String lineClassDesc;
	private Integer principalId;
	private String principalName;
	private Integer contractorId;
	private String contractorName;
	private String insuredDesc;
	private Integer policyId;
	private String policyNo;
	private String status;
	private Integer reinsurerId;
	private String reinsurerName;
	private Integer intmId;
	private String intmName;
	private LocalDateTime issueDate;
	private LocalDateTime expiryDate;
	private String reqBy;
	private LocalDateTime reqDate;
	private String reqMode;
	private String mbiRefNo;
	private String currencyCd;
	private Integer currencyRt;
	private String govtTag;
	private String indicativeTag;
	private String openCoverTag;
	private Integer ocQuoted;
	private String openQuotationNo;
	private String declarationTag;
	private String preparedBy;
	private String approvedBy;
	private String printedBy;
	private LocalDateTime printDate;
	private String openingParag;
	private String closingParag;
	private String reasonCd;
	private String reasonDesc;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	
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
	public Integer getQuoteYear() {
		return quoteYear;
	}
	public void setQuoteYear(Integer quoteYear) {
		this.quoteYear = quoteYear;
	}
	public Integer getQuoteSeqNo() {
		return quoteSeqNo;
	}
	public void setQuoteSeqNo(Integer quoteSeqNo) {
		this.quoteSeqNo = quoteSeqNo;
	}
	public Integer getQuoteRevNo() {
		return quoteRevNo;
	}
	public void setQuoteRevNo(Integer quoteRevNo) {
		this.quoteRevNo = quoteRevNo;
	}
	public Integer getCedingId() {
		return cedingId;
	}
	public void setCedingId(Integer cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
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
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
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
	public String getMbiRefNo() {
		return mbiRefNo;
	}
	public void setMbiRefNo(String mbiRefNo) {
		this.mbiRefNo = mbiRefNo;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public Integer getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(Integer currencyRt) {
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
	public String getOpenCoverTag() {
		return openCoverTag;
	}
	public void setOpenCoverTag(String openCoverTag) {
		this.openCoverTag = openCoverTag;
	}
	public Integer getOcQuoted() {
		return ocQuoted;
	}
	public void setOcQuoted(Integer ocQuoted) {
		this.ocQuoted = ocQuoted;
	}
	public String getOpenQuotationNo() {
		return openQuotationNo;
	}
	public void setOpenQuotationNo(String openQuotationNo) {
		this.openQuotationNo = openQuotationNo;
	}
	public String getDeclarationTag() {
		return declarationTag;
	}
	public void setDeclarationTag(String declarationTag) {
		this.declarationTag = declarationTag;
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
	
	@Override
	public String toString() {
		return "QuotationGeneralInfo [quoteId=" + quoteId + ", quotationNo=" + quotationNo + ", lineCd=" + lineCd
				+ ", lineCdDesc=" + lineCdDesc + ", quoteYear=" + quoteYear + ", quoteSeqNo=" + quoteSeqNo
				+ ", quoteRevNo=" + quoteRevNo + ", cedingId=" + cedingId + ", cedingName=" + cedingName
				+ ", cessionId=" + cessionId + ", cessionDesc=" + cessionDesc + ", lineClassCd=" + lineClassCd
				+ ", lineClassDesc=" + lineClassDesc + ", principalId=" + principalId + ", principalName="
				+ principalName + ", contractorId=" + contractorId + ", contractorName=" + contractorName
				+ ", insuredDesc=" + insuredDesc + ", policyId=" + policyId + ", policyNo=" + policyNo + ", status="
				+ status + ", reinsurerId=" + reinsurerId + ", reinsurerName=" + reinsurerName + ", intmId=" + intmId
				+ ", intmName=" + intmName + ", issueDate=" + issueDate + ", expiryDate=" + expiryDate + ", reqBy="
				+ reqBy + ", reqDate=" + reqDate + ", reqMode=" + reqMode + ", mbiRefNo=" + mbiRefNo + ", currencyCd="
				+ currencyCd + ", currencyRt=" + currencyRt + ", govtTag=" + govtTag + ", indicativeTag="
				+ indicativeTag + ", openCoverTag=" + openCoverTag + ", ocQuoted=" + ocQuoted + ", openQuotationNo="
				+ openQuotationNo + ", declarationTag=" + declarationTag + ", preparedBy=" + preparedBy
				+ ", approvedBy=" + approvedBy + ", printedBy=" + printedBy + ", printDate=" + printDate
				+ ", openingParag=" + openingParag + ", closingPrag=" + closingParag + ", reasonCd=" + reasonCd
				+ ", reasonDesc=" + reasonDesc + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
		
	
	
	
	
	

}
