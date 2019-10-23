package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class PostAcitMonthEndTrialBalResponse {
	
	private Integer returnCode;
	private String eomMessage;
	private List<Error> errorList = new ArrayList<Error>();
	private List<Message> messageList = new ArrayList<Message>();
	
	public Integer getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}
	public String getEomMessage() {
		return eomMessage;
	}
	public void setEomMessage(String eomMessage) {
		this.eomMessage = eomMessage;
	}
	public List<Error> getErrorList() {
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
	@Override
	public String toString() {
		return "PostAcitMonthEndTrialBalResponse [returnCode=" + returnCode + ", eomMessage=" + eomMessage
				+ ", errorList=" + errorList + ", messageList=" + messageList + "]";
	}
}
