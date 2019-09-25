package ph.cpi.rest.api.model.request;

import java.util.List;

import ph.cpi.rest.api.model.workflowmanager.Note;

public class SaveNotesRequest {
	
	List<Note> noteList;
	List<Note> delNoteList;
	
	public List<Note> getNoteList() {
		return noteList;
	}
	public void setNoteList(List<Note> noteList) {
		this.noteList = noteList;
	}
	public List<Note> getDelNoteList() {
		return delNoteList;
	}
	public void setDelNoteList(List<Note> delNoteList) {
		this.delNoteList = delNoteList;
	}
	@Override
	public String toString() {
		return "SaveNotesRequest [noteList=" + noteList + ", delNoteList=" + delNoteList + "]";
	}
	
}
