package ph.cpi.rest.api.model.request;

import java.util.List;

import ph.cpi.rest.api.model.workflowmanager.Reminder;

public class SaveRemindersRequest {
	
	private List<Reminder> reminderList;
	private List<Reminder> delReminderList;
	public List<Reminder> getReminderList() {
		return reminderList;
	}
	public void setReminderList(List<Reminder> reminderList) {
		this.reminderList = reminderList;
	}
	public List<Reminder> getDelReminderList() {
		return delReminderList;
	}
	public void setDelReminderList(List<Reminder> delReminderList) {
		this.delReminderList = delReminderList;
	}
	@Override
	public String toString() {
		return "SaveRemindersRequest [reminderList=" + reminderList + ", delReminderList=" + delReminderList + "]";
	}
	
}
