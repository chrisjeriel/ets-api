package ph.cpi.rest.api.model;

import org.joda.time.DateTime;

public class Approval {
	private Integer approvalId;
	private Integer referenceId;
	private String module;
	private String moduleId;
	private String details;
	private DateTime assignedDate;
	private String assignedTo;
	private String assignedBy;
	private String approvalTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getApprovalId() {
		return approvalId;
	}
	public void setApprovalId(Integer approvalId) {
		this.approvalId = approvalId;
	}
	public Integer getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(Integer referenceId) {
		this.referenceId = referenceId;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public DateTime getAssignedDate() {
		return assignedDate;
	}
	public void setAssignedDate(DateTime assignedDate) {
		this.assignedDate = assignedDate;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getAssignedBy() {
		return assignedBy;
	}
	public void setAssignedBy(String assignedBy) {
		this.assignedBy = assignedBy;
	}
	public String getApprovalTag() {
		return approvalTag;
	}
	public void setApprovalTag(String approvalTag) {
		this.approvalTag = approvalTag;
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
	@Override
	public String toString() {
		return "Approval [approvalId=" + approvalId + ", referenceId=" + referenceId + ", module=" + module
				+ ", moduleId=" + moduleId + ", details=" + details + ", assignedDate=" + assignedDate + ", assignedTo="
				+ assignedTo + ", assignedBy=" + assignedBy + ", approvalTag=" + approvalTag + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
	
}
