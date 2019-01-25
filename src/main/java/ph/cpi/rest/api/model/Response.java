package ph.cpi.rest.api.model;

import java.util.ArrayList;
import java.util.List;

public class Response {
	
	private List<Message> messageList;
	private List<Error> errorList;
	
	public List<Message> getMessageList() {
		if (messageList == null) {
			messageList = new ArrayList<Message>();
		}
		
		return messageList;
	}
	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}
	public List<Error> getErrorList() {
		if (errorList == null) {
			errorList = new ArrayList<Error>();
		}
		
		return errorList;
	}
	public void setErrorList(List<Error> errorList) {
		this.errorList = errorList;
	}
	
	@Override
	public String toString() {
		return "Response [messageList=" + getMessageList() + ", errorList=" + getErrorList() + "]";
	}
	
	
	
}
