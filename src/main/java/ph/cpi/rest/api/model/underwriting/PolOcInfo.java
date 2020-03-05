package ph.cpi.rest.api.model.underwriting;

import java.util.List;

import org.joda.time.DateTime;

public class PolOcInfo {
	private String policyId;
	private String policyNo;
	private String lineCd;
	private String lineDesc;
	private String cedingId;
	private String cedingName;
	private String cessionId;
	private String cessionDesc;
	private String lineClassCd;
	private String lineClassDesc;
	private String quoteId;
	private String quotationNo;
	private String status;
	private String statusDesc;
	private String coRefNo;
	private String reinsurerId;
	private String reinsurerName;
	private String riBinderNo;
	private String intmId;
	private String intmName;
	private DateTime inceptDate;
	private DateTime expiryDate;
	private DateTime lapseFrom;
	private DateTime lapseTo;
	private DateTime issueDate;
	private DateTime effDate;
	private DateTime distDate;
	private DateTime acctDate;
	private String riskName;
	
	private List<PolOcInfoAlt> altList;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
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
	public String getLineDesc() {
		return lineDesc;
	}
	public void setLineDesc(String lineDesc) {
		this.lineDesc = lineDesc;
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
	public String getLineClassDesc() {
		return lineClassDesc;
	}
	public void setLineClassDesc(String lineClassDesc) {
		this.lineClassDesc = lineClassDesc;
	}
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getQuotationNo() {
		return quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
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
	public String getIntmId() {
		return intmId;
	}
	public void setIntmId(String intmId) {
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
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public List<PolOcInfoAlt> getAltList() {
		return altList;
	}
	public void setAltList(List<PolOcInfoAlt> altList) {
		this.altList = altList;
	}
	@Override
	public String toString() {
		return "PolOcInfo [policyId=" + policyId + ", policyNo=" + policyNo + ", lineCd=" + lineCd + ", lineDesc="
				+ lineDesc + ", cedingId=" + cedingId + ", cedingName=" + cedingName + ", cessionId=" + cessionId
				+ ", cessionDesc=" + cessionDesc + ", lineClassCd=" + lineClassCd + ", lineClassDesc=" + lineClassDesc
				+ ", quoteId=" + quoteId + ", quotationNo=" + quotationNo + ", status=" + status + ", statusDesc="
				+ statusDesc + ", coRefNo=" + coRefNo + ", reinsurerId=" + reinsurerId + ", reinsurerName="
				+ reinsurerName + ", riBinderNo=" + riBinderNo + ", intmId=" + intmId + ", intmName=" + intmName
				+ ", inceptDate=" + inceptDate + ", expiryDate=" + expiryDate + ", lapseFrom=" + lapseFrom
				+ ", lapseTo=" + lapseTo + ", issueDate=" + issueDate + ", effDate=" + effDate + ", distDate="
				+ distDate + ", acctDate=" + acctDate + ", riskName=" + riskName + ", altList=" + altList + "]";
	}
	
}
