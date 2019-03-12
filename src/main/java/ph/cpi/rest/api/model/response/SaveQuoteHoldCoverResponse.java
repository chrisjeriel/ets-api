package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class SaveQuoteHoldCoverResponse {
	private List<Error> errorList;
	private List<Message> messageList;
	private Integer returnCode;
	private String holdCoverNo;
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
	public String getHoldCoverNo() {
		return holdCoverNo;
	}
	public void setHoldCoverNo(String holdCoverNo) {
		this.holdCoverNo = holdCoverNo;
	}
	@Override
	public String toString() {
		return "SaveQuoteHoldCoverResponse [errorList=" + errorList + ", messageList=" + messageList + ", returnCode="
				+ returnCode + ", holdCoverNo=" + holdCoverNo + "]";
	}
	
	
	
}
