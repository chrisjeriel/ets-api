package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;

public class SaveMtnClmEventTypeRequest {
	private List<EventTypes> saveEventType;
	private List<EventTypes> deleteEventType;
	public List<EventTypes> getSaveEventType() {
		return saveEventType;
	}
	public void setSaveEventType(List<EventTypes> saveEventType) {
		this.saveEventType = saveEventType;
	}
	public List<EventTypes> getDeleteEventType() {
		return deleteEventType;
	}
	public void setDeleteEventType(List<EventTypes> deleteEventType) {
		this.deleteEventType = deleteEventType;
	}
	
}

@Alias("SaveMtnClmEventType")
class EventTypes {
	private String eventTypeCd;
	private	String eventTypeDesc;
	private	String activeTag;
	private	String remarks;
	private	String createUser;
	private	String createDate;
	private	String updateUser;
	private	String updateDate;
	public String getEventTypeCd() {
		return eventTypeCd;
	}
	public void setEventTypeCd(String eventTypeCd) {
		this.eventTypeCd = eventTypeCd;
	}
	public String getEventTypeDesc() {
		return eventTypeDesc;
	}
	public void setEventTypeDesc(String eventTypeDesc) {
		this.eventTypeDesc = eventTypeDesc;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
		return "EventTypes [eventTypeCd=" + eventTypeCd + ", eventTypeDesc=" + eventTypeDesc + ", activeTag="
				+ activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
