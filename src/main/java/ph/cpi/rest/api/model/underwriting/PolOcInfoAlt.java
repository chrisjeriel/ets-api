package ph.cpi.rest.api.model.underwriting;

import org.joda.time.DateTime;

public class PolOcInfoAlt {
	private String policyId;
	private String policyNo;
	private DateTime effDate;
	private DateTime issueDate;
	private String quotationNo;
	private String totalSi;
	private String totalPrem;
	private String statusDesc;
	private String insured;
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
	public DateTime getEffDate() {
		return effDate;
	}
	public void setEffDate(DateTime effDate) {
		this.effDate = effDate;
	}
	public DateTime getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(DateTime issueDate) {
		this.issueDate = issueDate;
	}
	public String getQuotationNo() {
		return quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
	}
	public String getTotalSi() {
		return totalSi;
	}
	public void setTotalSi(String totalSi) {
		this.totalSi = totalSi;
	}
	public String getTotalPrem() {
		return totalPrem;
	}
	public void setTotalPrem(String totalPrem) {
		this.totalPrem = totalPrem;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public String getInsured() {
		return insured;
	}
	public void setInsured(String insured) {
		this.insured = insured;
	}
	@Override
	public String toString() {
		return "PolOcInfoAlt [policyId=" + policyId + ", policyNo=" + policyNo + ", effDate=" + effDate + ", issueDate="
				+ issueDate + ", quotationNo=" + quotationNo + ", totalSi=" + totalSi + ", totalPrem=" + totalPrem
				+ ", statusDesc=" + statusDesc + ", insured=" + insured + "]";
	}
	
}
