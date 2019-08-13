package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class SaveAcitArInvPulloutResponse {
	private List<Error> errorList = new ArrayList<Error>();
	private List<Message> messageList = new ArrayList<Message>();
	private Integer returnCode;
	private Integer custReturnCode;
	
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
	public Integer getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}
	public Integer getCustReturnCode() {
		return custReturnCode;
	}
	public void setCustReturnCode(Integer custReturnCode) {
		this.custReturnCode = custReturnCode;
	}
	@Override
	public String toString() {
		return "SaveAcitArInvPulloutResponse [errorList=" + errorList + ", messageList=" + messageList + ", returnCode="
				+ returnCode + ", custReturnCode=" + custReturnCode + "]";
	}
}
