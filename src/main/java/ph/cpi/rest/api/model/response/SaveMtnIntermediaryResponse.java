package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class SaveMtnIntermediaryResponse {
	private List<Error> errorList;
	private List<Message> messageList;
	private Integer returnCode;
	private Integer intmIdOut;
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
	public Integer getIntmIdOut() {
		return intmIdOut;
	}
	public void setIntmIdOut(Integer intmIdOut) {
		this.intmIdOut = intmIdOut;
	}
	@Override
	public String toString() {
		return "SaveMtnIntermediaryResponse [errorList=" + errorList + ", messageList=" + messageList + ", returnCode="
				+ returnCode + ", intmIdOut=" + intmIdOut + "]";
	}
}
