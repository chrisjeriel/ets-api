package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AlterationHist {
	private Integer policyId;
	private String policyNo;
	private DateTime effDate;
	private DateTime issueDate;
	private String quotationNo;
	private BigDecimal sumInsured;
	private BigDecimal premAmt;
	private String status;
	private String insured;
	private String withDist;
	private String postedBy;
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
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
	public BigDecimal getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(BigDecimal sumInsured) {
		this.sumInsured = sumInsured;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInsured() {
		return insured;
	}
	public void setInsured(String insured) {
		this.insured = insured;
	}
	public String getWithDist() {
		return withDist;
	}
	public void setWithDist(String withDist) {
		this.withDist = withDist;
	}
	@Override
	public String toString() {
		return "AlterationHist [policyId=" + policyId + ", policyNo=" + policyNo + ", effDate=" + effDate
				+ ", issueDate=" + issueDate + ", quotationNo=" + quotationNo + ", sumInsured=" + sumInsured
				+ ", premAmt=" + premAmt + ", status=" + status + ", insured=" + insured + ", withDist=" + withDist
				+ ", postedBy=" + postedBy + "]";
	}
	
}
