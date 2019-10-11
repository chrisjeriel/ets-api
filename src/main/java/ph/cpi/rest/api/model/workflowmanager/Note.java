package ph.cpi.rest.api.model.workflowmanager;

import java.util.List;

import org.joda.time.DateTime;

public class Note {
	
	private String noteId;
	private String title;
	private String note;
	private String impTag;
	private String urgTag;
	private String module;
	private String referenceId;
	private String details;
	private String assignedTo;
	private String status;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	List<RelatedRecord> relatedRecordList;
	
	public String getNoteId() {
		return noteId;
	}
	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
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
	public List<RelatedRecord> getRelatedRecordList() {
		return relatedRecordList;
	}
	public void setRelatedRecordList(List<RelatedRecord> relatedRecordList) {
		this.relatedRecordList = relatedRecordList;
	}
	public String getImpTag() {
		if (impTag == null) {
			impTag = "N";
		}
		return impTag;
	}
	public void setImpTag(String impTag) {
		this.impTag = impTag;
	}
	public String getUrgTag() {
		if (urgTag == null) {
			urgTag = "N";
		}
		
		return urgTag;
	}
	public void setUrgTag(String urgTag) {
		this.urgTag = urgTag;
	}
	@Override
	public String toString() {
		return "Note [getNoteId()=" + getNoteId() + ", getTitle()=" + getTitle() + ", getNote()=" + getNote()
				+ ", getModule()=" + getModule() + ", getReferenceId()=" + getReferenceId() + ", getDetails()="
				+ getDetails() + ", getAssignedTo()=" + getAssignedTo() + ", getStatus()=" + getStatus()
				+ ", getCreateUser()=" + getCreateUser() + ", getCreateDate()=" + getCreateDate() + ", getUpdateUser()="
				+ getUpdateUser() + ", getUpdateDate()=" + getUpdateDate() + ", getRelatedRecordList()="
				+ getRelatedRecordList() + ", getImpTag()=" + getImpTag() + ", getUrgTag()=" + getUrgTag() + "]";
	}
	
}
