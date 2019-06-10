package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnClmEventRequest {
	private List<Events> saveEvent;
	private List<Events> deleteEvent;
	public List<Events> getSaveEvent() {
		return saveEvent;
	}
	public void setSaveEvent(List<Events> saveEvent) {
		this.saveEvent = saveEvent;
	}
	public List<Events> getDeleteEvent() {
		return deleteEvent;
	}
	public void setDeleteEvent(List<Events> deleteEvent) {
		this.deleteEvent = deleteEvent;
	}
	@Override
	public String toString() {
		return "SaveMtnClmEventRequest [saveEvent=" + saveEvent + ", deleteEvent=" + deleteEvent + "]";
	}
}

class Events {
	private String eventCd;
	private String eventDesc;
	private String lossDateFrom;
	private String lossDateTo;
	private String lineCd;
	private String eventTypeCd;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getEventCd() {
		return eventCd;
	}
	public void setEventCd(String eventCd) {
		this.eventCd = eventCd;
	}
	public String getEventDesc() {
		return eventDesc;
	}
	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}
	public String getLossDateFrom() {
		return lossDateFrom;
	}
	public void setLossDateFrom(String lossDateFrom) {
		this.lossDateFrom = lossDateFrom;
	}
	public String getLossDateTo() {
		return lossDateTo;
	}
	public void setLossDateTo(String lossDateTo) {
		this.lossDateTo = lossDateTo;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getEventTypeCd() {
		return eventTypeCd;
	}
	public void setEventTypeCd(String eventTypeCd) {
		this.eventTypeCd = eventTypeCd;
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
		return "Events [eventCd=" + eventCd + ", eventDesc=" + eventDesc + ", lossDateFrom=" + lossDateFrom
				+ ", lossDateTo=" + lossDateTo + ", lineCd=" + lineCd + ", eventTypeCd=" + eventTypeCd + ", activeTag="
				+ activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
