package ph.cpi.rest.api.model.request;

public class SaveRemindersRequest {
	
	private String reminderId;
	private String title;
	private String reminder;
	private String remiderDate;
	private String alarmTime;
	private String assignedTo;
	private String status;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getReminderId() {
		return reminderId;
	}
	public void setReminderId(String reminderId) {
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
	public String getRemiderDate() {
		return remiderDate;
	}
	public void setRemiderDate(String remiderDate) {
		this.remiderDate = remiderDate;
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
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "SaveRemindersRequest [reminderId=" + reminderId + ", title=" + title + ", reminder=" + reminder
				+ ", remiderDate=" + remiderDate + ", alarmTime=" + alarmTime + ", assignedTo=" + assignedTo
				+ ", status=" + status + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
