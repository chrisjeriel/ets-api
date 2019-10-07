package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class SaveAcseCvPaytReqListResponse {
	private List<Error> errorList = new ArrayList<>();;
	private List<Message> messageList = new ArrayList<>();
	private Integer returnCode;
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
	@Override
	public String toString() {
		return "SaveAcscCvPaytReqListResponse [errorList=" + errorList + ", messageList=" + messageList
				+ ", returnCode=" + returnCode + "]";
	}
}
