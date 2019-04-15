package ph.cpi.rest.api.model.underwriting;

import java.util.List;

import org.joda.time.DateTime;

public class PolicyOc {
	private Integer policyIdOc;
	private String openPolicyNo;
	private String cessionDesc;
	private String cedingId;
	private String cedingName;
	private String lineClassDesc;
	private String insuredDesc;
	private String currencyCd;
	private DateTime issueDate;
	private DateTime expiryDate;
	private DateTime inceptDate;
	private DateTime acctDate;
	private String statusDesc;
	private Integer optionId;
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
	public String getCessionDesc() {
		return cessionDesc;
	}
	public void setCessionDesc(String cessionDesc) {
		this.cessionDesc = cessionDesc;
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
	public String getLineClassDesc() {
		return lineClassDesc;
	}
	public void setLineClassDesc(String lineClassDesc) {
		this.lineClassDesc = lineClassDesc;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public DateTime getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(DateTime issueDate) {
		this.issueDate = issueDate;
	}
	public DateTime getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(DateTime expiryDate) {
		this.expiryDate = expiryDate;
	}
	public DateTime getInceptDate() {
		return inceptDate;
	}
	public void setInceptDate(DateTime inceptDate) {
		this.inceptDate = inceptDate;
	}
	public DateTime getAcctDate() {
		return acctDate;
	}
	public void setAcctDate(DateTime acctDate) {
		this.acctDate = acctDate;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
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
		return "PolicyOc [policyIdOc=" + policyIdOc + ", openPolicyNo=" + openPolicyNo + ", cessionDesc=" + cessionDesc
				+ ", cedingId=" + cedingId + ", cedingName=" + cedingName + ", lineClassDesc=" + lineClassDesc
				+ ", insuredDesc=" + insuredDesc + ", currencyCd=" + currencyCd + ", issueDate=" + issueDate
				+ ", expiryDate=" + expiryDate + ", inceptDate=" + inceptDate + ", acctDate=" + acctDate
				+ ", statusDesc=" + statusDesc + ", optionId=" + optionId + ", optionRt=" + optionRt + ", condition="
				+ condition + ", project=" + project + ", attachmentsOc=" + attachmentsOc + ", endorsementsOc="
				+ endorsementsOc + "]";
	}
}
