package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class SavePolGenInfoOcResponse {
	private List<Error> errorList;
	private List<Message> messageList;
	private Integer returnCode;
	public List<Error> getErrorList() {
		if (errorList == null) {
			errorList = new ArrayList<Error>();
		}
		return errorList;
	}
	public void setErrorList(List<Error> errorList) {
		this.errorList = errorList;
	}
	public List<Message> getMessageList() {
		return messageList;
	}
	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}
	public Integer getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}
	@Override
	public String toString() {
		return "SavePolGenInfoOcResponse [errorList=" + errorList + ", messageList=" + messageList + ", returnCode="
				+ returnCode + "]";
	}
	
}

