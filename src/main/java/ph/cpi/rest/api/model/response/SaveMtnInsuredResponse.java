package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class SaveMtnInsuredResponse {
	private List<Error> errorList;
	private List<Message> messageList;
	private Integer returnCode;
	private Integer insuredIdOut;
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
	public Integer getInsuredIdOut() {
		return insuredIdOut;
	}
	public void setInsuredIdOut(Integer insuredIdOut) {
		this.insuredIdOut = insuredIdOut;
	}
	@Override
	public String toString() {
		return "SaveMtnInsuredResponse [errorList=" + errorList + ", messageList=" + messageList + ", returnCode="
				+ returnCode + ", insuredIdOut=" + insuredIdOut + "]";
	}
}
