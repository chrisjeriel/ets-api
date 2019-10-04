package ph.cpi.rest.api.model.workflowmanager;

import java.util.List;

import org.joda.time.DateTime;

public class Reminder {
	
	private Integer  reminderId;
	private String   title;
	private String   reminder;
	private DateTime reminderDate;
	private String   alarmTime;
	private String	 module;
	private String	 referenceId;
	private String	 details;
	private String   assignedTo;
	private String   status;
	private String   createUser;
	private DateTime createDate;
	private String   updateUser;
	private DateTime updateDate;
	List<RelatedRecord> relatedRecordList;
	
	public Integer getReminderId() {
		return reminderId;
	}
	public void setReminderId(Integer reminderId) {
		this.reminderId = reminderId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReminder() {
		return reminder;
	}
	public void setReminder(String reminder) {
		this.reminder = reminder;
	}
	public String getReminderDate() {
		return reminderDate.toString();
	}
	public void setReminderDate(DateTime reminderDate) {
		this.reminderDate = reminderDate;
	}
	public String getAlarmTime() {
		return alarmTime;
	}
	public void setAlarmTime(String alarmTime) {
		this.alarmTime = alarmTime;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public List<RelatedRecord> getRelatedRecordList() {
		return relatedRecordList;
	}
	public void setRelatedRecordList(List<RelatedRecord> relatedRecordList) {
		this.relatedRecordList = relatedRecordList;
	}
	@Override
	public String toString() {
		return "Reminder [reminderId=" + reminderId + ", title=" + title + ", reminder=" + reminder + ", reminderDate="
				+ reminderDate + ", alarmTime=" + alarmTime + ", module=" + module + ", referenceId=" + referenceId
				+ ", details=" + details + ", assignedTo=" + assignedTo + ", status=" + status + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", relatedRecordList=" + relatedRecordList + "]";
	}
}
